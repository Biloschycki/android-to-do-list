package biloschycki.com.githb.todoist.`data`

import androidx.room.InvalidationTracker
import androidx.room.RoomOpenDelegate
import androidx.room.migration.AutoMigrationSpec
import androidx.room.migration.Migration
import androidx.room.util.TableInfo
import androidx.room.util.TableInfo.Companion.read
import androidx.room.util.dropFtsSyncTriggers
import androidx.sqlite.SQLiteConnection
import androidx.sqlite.execSQL
import javax.`annotation`.processing.Generated
import kotlin.Lazy
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.MutableList
import kotlin.collections.MutableMap
import kotlin.collections.MutableSet
import kotlin.collections.Set
import kotlin.collections.mutableListOf
import kotlin.collections.mutableMapOf
import kotlin.collections.mutableSetOf
import kotlin.reflect.KClass

@Generated(value = ["androidx.room.RoomProcessor"])
@Suppress(names = ["UNCHECKED_CAST", "DEPRECATION", "REDUNDANT_PROJECTION", "REMOVAL"])
public class TarefaDatabase_Impl : TarefaDatabase() {
  private val _tarefaDao: Lazy<TarefaDao> = lazy {
    TarefaDao_Impl(this)
  }

  protected override fun createOpenDelegate(): RoomOpenDelegate {
    val _openDelegate: RoomOpenDelegate = object : RoomOpenDelegate(1,
        "492a835efc8150e1325a11b43f41a407", "66473219ee7381d9d27ad607c4e3a3ef") {
      public override fun createAllTables(connection: SQLiteConnection) {
        connection.execSQL("CREATE TABLE IF NOT EXISTS `tarefas` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `titulo` TEXT NOT NULL, `descricao` TEXT NOT NULL, `concluida` INTEGER NOT NULL, `dataCriacao` INTEGER NOT NULL)")
        connection.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)")
        connection.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '492a835efc8150e1325a11b43f41a407')")
      }

      public override fun dropAllTables(connection: SQLiteConnection) {
        connection.execSQL("DROP TABLE IF EXISTS `tarefas`")
      }

      public override fun onCreate(connection: SQLiteConnection) {
      }

      public override fun onOpen(connection: SQLiteConnection) {
        internalInitInvalidationTracker(connection)
      }

      public override fun onPreMigrate(connection: SQLiteConnection) {
        dropFtsSyncTriggers(connection)
      }

      public override fun onPostMigrate(connection: SQLiteConnection) {
      }

      public override fun onValidateSchema(connection: SQLiteConnection):
          RoomOpenDelegate.ValidationResult {
        val _columnsTarefas: MutableMap<String, TableInfo.Column> = mutableMapOf()
        _columnsTarefas.put("id", TableInfo.Column("id", "INTEGER", true, 1, null,
            TableInfo.CREATED_FROM_ENTITY))
        _columnsTarefas.put("titulo", TableInfo.Column("titulo", "TEXT", true, 0, null,
            TableInfo.CREATED_FROM_ENTITY))
        _columnsTarefas.put("descricao", TableInfo.Column("descricao", "TEXT", true, 0, null,
            TableInfo.CREATED_FROM_ENTITY))
        _columnsTarefas.put("concluida", TableInfo.Column("concluida", "INTEGER", true, 0, null,
            TableInfo.CREATED_FROM_ENTITY))
        _columnsTarefas.put("dataCriacao", TableInfo.Column("dataCriacao", "INTEGER", true, 0, null,
            TableInfo.CREATED_FROM_ENTITY))
        val _foreignKeysTarefas: MutableSet<TableInfo.ForeignKey> = mutableSetOf()
        val _indicesTarefas: MutableSet<TableInfo.Index> = mutableSetOf()
        val _infoTarefas: TableInfo = TableInfo("tarefas", _columnsTarefas, _foreignKeysTarefas,
            _indicesTarefas)
        val _existingTarefas: TableInfo = read(connection, "tarefas")
        if (!_infoTarefas.equals(_existingTarefas)) {
          return RoomOpenDelegate.ValidationResult(false, """
              |tarefas(biloschycki.com.githb.todoist.data.Tarefa).
              | Expected:
              |""".trimMargin() + _infoTarefas + """
              |
              | Found:
              |""".trimMargin() + _existingTarefas)
        }
        return RoomOpenDelegate.ValidationResult(true, null)
      }
    }
    return _openDelegate
  }

  protected override fun createInvalidationTracker(): InvalidationTracker {
    val _shadowTablesMap: MutableMap<String, String> = mutableMapOf()
    val _viewTables: MutableMap<String, Set<String>> = mutableMapOf()
    return InvalidationTracker(this, _shadowTablesMap, _viewTables, "tarefas")
  }

  public override fun clearAllTables() {
    super.performClear(false, "tarefas")
  }

  protected override fun getRequiredTypeConverterClasses(): Map<KClass<*>, List<KClass<*>>> {
    val _typeConvertersMap: MutableMap<KClass<*>, List<KClass<*>>> = mutableMapOf()
    _typeConvertersMap.put(TarefaDao::class, TarefaDao_Impl.getRequiredConverters())
    return _typeConvertersMap
  }

  public override fun getRequiredAutoMigrationSpecClasses(): Set<KClass<out AutoMigrationSpec>> {
    val _autoMigrationSpecsSet: MutableSet<KClass<out AutoMigrationSpec>> = mutableSetOf()
    return _autoMigrationSpecsSet
  }

  public override
      fun createAutoMigrations(autoMigrationSpecs: Map<KClass<out AutoMigrationSpec>, AutoMigrationSpec>):
      List<Migration> {
    val _autoMigrations: MutableList<Migration> = mutableListOf()
    return _autoMigrations
  }

  public override fun tarefaDao(): TarefaDao = _tarefaDao.value
}

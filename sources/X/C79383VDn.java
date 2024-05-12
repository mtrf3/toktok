package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.VDn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79383VDn extends SQLiteOpenHelper {
    public static final String LJLJI;
    public static final int LJLJJI;
    public static final List<InterfaceC79389VDt> LJLJJL;
    public final int LJLIL;
    public boolean LJLILLLLZI;

    static {
        StringBuilder LIZ = X1D.LIZ();
        LJLJI = C72545SdZ.LIZLLL(LIZ, "INSERT INTO global_log_event_state VALUES (", ")", LIZ);
        LJLJJI = 5;
        LJLJJL = Arrays.asList(new InterfaceC79389VDt() { // from class: X.VDq
            @Override // X.InterfaceC79389VDt
            public final void LIZ(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
                sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
                sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
                sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
                sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
            }
        }, new InterfaceC79389VDt() { // from class: X.VDr
            @Override // X.InterfaceC79389VDt
            public final void LIZ(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
                sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
                sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
            }
        }, new InterfaceC79389VDt() { // from class: X.VDs
            @Override // X.InterfaceC79389VDt
            public final void LIZ(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        }, new InterfaceC79389VDt() { // from class: X.VDp
            @Override // X.InterfaceC79389VDt
            public final void LIZ(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
                sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
            }
        }, new InterfaceC79389VDt() { // from class: X.VDo
            @Override // X.InterfaceC79389VDt
            public final void LIZ(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
                sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
                sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
                sQLiteDatabase.execSQL(C79383VDn.LJLJI);
            }
        });
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.LJLILLLLZI = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i = this.LJLIL;
        if (!this.LJLILLLLZI) {
            onConfigure(sQLiteDatabase);
        }
        LIZ(sQLiteDatabase, 0, i);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.LJLILLLLZI) {
            onConfigure(sQLiteDatabase);
        }
    }

    public C79383VDn(Context context, int i, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.LJLIL = i;
    }

    public static void LIZ(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<InterfaceC79389VDt> list = LJLJJL;
        if (i2 <= list.size()) {
            while (i < i2) {
                ((InterfaceC79389VDt) ListProtector.get(LJLJJL, i)).LIZ(sQLiteDatabase);
                i++;
            }
        } else {
            StringBuilder LIZJ = C06460Ne.LIZJ("Migration from ", i, " to ", i2, " was requested, but cannot be performed. Only ");
            LIZJ.append(list.size());
            LIZJ.append(" migrations are provided");
            throw new IllegalArgumentException(X1D.LIZIZ(LIZJ));
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.LJLILLLLZI) {
            onConfigure(sQLiteDatabase);
        }
        LIZ(sQLiteDatabase, 0, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (!this.LJLILLLLZI) {
            onConfigure(sQLiteDatabase);
        }
        LIZ(sQLiteDatabase, i, i2);
    }
}

package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: X.QqY, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68254QqY extends SQLiteOpenHelper {
    public final /* synthetic */ C68242QqM LJLIL;

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.database.sqlite.SQLiteDatabase getWritableDatabase() {
        /*
            r8 = this;
            X.QqM r0 = r8.LJLIL
            X.Qmv r1 = r0.LJ
            long r4 = r1.LIZ
            r2 = 0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L10
        Lc:
            r0 = 1
        Ld:
            if (r0 == 0) goto L8a
            goto L28
        L10:
            java.lang.Object r0 = r1.LIZIZ
            X.QhR r0 = (X.InterfaceC67689QhR) r0
            r0.getClass()
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r0 = r1.LIZ
            long r6 = r6 - r0
            r4 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 < 0) goto L26
            goto Lc
        L26:
            r0 = 0
            goto Ld
        L28:
            android.database.sqlite.SQLiteDatabase r0 = super.getWritableDatabase()     // Catch: android.database.sqlite.SQLiteException -> L2d
            return r0
        L2d:
            X.QqM r0 = r8.LJLIL
            X.Qmv r4 = r0.LJ
            java.lang.Object r0 = r4.LIZIZ
            X.QhR r0 = (X.InterfaceC67689QhR) r0
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r4.LIZ = r0
            X.QqM r0 = r8.LJLIL
            X.Qmz r0 = r0.LIZ
            X.Qaq r0 = r0.LIZJ()
            X.Qar r1 = r0.LJFF
            java.lang.String r0 = "Opening the database failed, dropping and recreating it"
            r1.LIZ(r0)
            X.QqM r0 = r8.LJLIL
            X.Qmz r0 = r0.LIZ
            android.content.Context r0 = r0.LIZ
            java.lang.String r4 = "google_app_measurement.db"
            java.io.File r0 = r0.getDatabasePath(r4)
            boolean r0 = X.C16880lQ.LLLZZIL(r0)
            if (r0 != 0) goto L6e
            X.QqM r0 = r8.LJLIL
            X.Qmz r0 = r0.LIZ
            X.Qaq r0 = r0.LIZJ()
            X.Qar r1 = r0.LJFF
            java.lang.String r0 = "Failed to delete corrupted db file"
            r1.LIZIZ(r4, r0)
        L6e:
            android.database.sqlite.SQLiteDatabase r1 = super.getWritableDatabase()     // Catch: android.database.sqlite.SQLiteException -> L79
            X.QqM r0 = r8.LJLIL     // Catch: android.database.sqlite.SQLiteException -> L79
            X.Qmv r0 = r0.LJ     // Catch: android.database.sqlite.SQLiteException -> L79
            r0.LIZ = r2     // Catch: android.database.sqlite.SQLiteException -> L79
            return r1
        L79:
            r2 = move-exception
            X.QqM r0 = r8.LJLIL
            X.Qmz r0 = r0.LIZ
            X.Qaq r0 = r0.LIZJ()
            X.Qar r1 = r0.LJFF
            java.lang.String r0 = "Failed to open freshly created database"
            r1.LIZIZ(r2, r0)
            throw r2
        L8a:
            android.database.sqlite.SQLiteException r1 = new android.database.sqlite.SQLiteException
            java.lang.String r0 = "Database open failed"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68254QqY.getWritableDatabase():android.database.sqlite.SQLiteDatabase");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C66850QLm.LIZIZ(this.LJLIL.LIZ.LIZJ(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        C66850QLm.LIZ(this.LJLIL.LIZ.LIZJ(), sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", C68242QqM.LJFF);
        C66850QLm.LIZ(this.LJLIL.LIZ.LIZJ(), sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
        C66850QLm.LIZ(this.LJLIL.LIZ.LIZJ(), sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", C68242QqM.LJI);
        C66850QLm.LIZ(this.LJLIL.LIZ.LIZJ(), sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", C68242QqM.LJII);
        C66850QLm.LIZ(this.LJLIL.LIZ.LIZJ(), sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", C68242QqM.LJIIIZ);
        C66850QLm.LIZ(this.LJLIL.LIZ.LIZJ(), sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
        C66850QLm.LIZ(this.LJLIL.LIZ.LIZJ(), sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", C68242QqM.LJIIIIZZ);
        C66850QLm.LIZ(this.LJLIL.LIZ.LIZJ(), sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", C68242QqM.LJIIJ);
        C66850QLm.LIZ(this.LJLIL.LIZ.LIZJ(), sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", C68242QqM.LJIIJJI);
        C66850QLm.LIZ(this.LJLIL.LIZ.LIZJ(), sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
        C66850QLm.LIZ(this.LJLIL.LIZ.LIZJ(), sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", C68242QqM.LJIIL);
        C66850QLm.LIZ(this.LJLIL.LIZ.LIZJ(), sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
        C66850QLm.LIZ(this.LJLIL.LIZ.LIZJ(), sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
        C66850QLm.LIZ(this.LJLIL.LIZ.LIZJ(), sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68254QqY(C68242QqM c68242QqM, Context context) {
        super(context, "google_app_measurement.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.LJLIL = c68242QqM;
    }
}

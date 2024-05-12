package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzlo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.QqM, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68242QqM extends AbstractC68187QpT {
    public static final String[] LJFF = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] LJI = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] LJII = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;"};
    public static final String[] LJIIIIZZ = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    public static final String[] LJIIIZ = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] LJIIJ = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] LJIIJJI = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] LJIIL = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public final C68254QqY LIZLLL;
    public final C68029Qmv LJ;

    @Override // X.AbstractC68187QpT
    public final void LJIIIIZZ() {
    }

    public final boolean LJIILIIL() {
        return this.LIZ.LIZ.getDatabasePath("google_app_measurement.db").exists();
    }

    public final void LJIIJ() {
        LJI();
        LJJI().setTransactionSuccessful();
    }

    public final SQLiteDatabase LJJI() {
        LJFF();
        try {
            return this.LIZLLL.getWritableDatabase();
        } catch (SQLiteException e) {
            this.LIZ.LIZJ().LJIIIIZZ.LIZIZ(e, "Error opening database");
            throw e;
        }
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0038: MOVE (r4 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:56), block:B:21:0x0038 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJJIJIIJI() {
        /*
            r5 = this;
            android.database.sqlite.SQLiteDatabase r1 = r5.LJJI()
            r4 = 0
            java.lang.String r0 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r3 = r1.rawQuery(r0, r4)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L22
            boolean r0 = r3.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L37
            if (r0 == 0) goto L1a
            r0 = 0
            java.lang.String r0 = r3.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L37
            r3.close()
            return r0
        L1a:
            r3.close()
            return r4
        L1e:
            r2 = move-exception
            goto L24
        L20:
            r0 = move-exception
            goto L39
        L22:
            r2 = move-exception
            r3 = r4
        L24:
            X.Qmz r0 = r5.LIZ     // Catch: java.lang.Throwable -> L37
            X.Qaq r0 = r0.LIZJ()     // Catch: java.lang.Throwable -> L37
            X.Qar r1 = r0.LJFF     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = "Database error getting next bundle app id"
            r1.LIZIZ(r2, r0)     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L36
            r3.close()
        L36:
            return r4
        L37:
            r0 = move-exception
            r4 = r3
        L39:
            if (r4 == 0) goto L3e
            r4.close()
        L3e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68242QqM.LJJIJIIJI():java.lang.String");
    }

    public final void LJJIL() {
        LJI();
        LJJI().beginTransaction();
    }

    public final void LJJIZ() {
        LJI();
        LJJI().endTransaction();
    }

    public final void LJJJI() {
        LJFF();
        LJI();
        if (LJIILIIL()) {
            long LIZ = this.LIZIZ.LJIIIIZZ.LJII.LIZ();
            this.LIZ.LJIILIIL.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - LIZ) > ((Long) C68555QvP.LJJIFFI.LIZ(null)).longValue()) {
                this.LIZIZ.LJIIIIZZ.LJII.LIZIZ(elapsedRealtime);
                LJFF();
                LJI();
                if (!LJIILIIL()) {
                    return;
                }
                SQLiteDatabase LJJI = LJJI();
                this.LIZ.LJIILIIL.getClass();
                int delete = LJJI.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) C68555QvP.LJJIIZ.LIZ(null)).longValue())});
                if (delete <= 0) {
                    return;
                }
                this.LIZ.LIZJ().LJIILIIL.LIZIZ(Integer.valueOf(delete), "Deleted stale rows. rowsDeleted");
            }
        }
    }

    public C68242QqM(C68241QqL c68241QqL) {
        super(c68241QqL);
        this.LJ = new C68029Qmv(this.LIZ.LJIILIIL);
        this.LIZLLL = new C68254QqY(this, this.LIZ.LIZ);
    }

    public final void LJIIJJI(C68252QqW c68252QqW) {
        LJFF();
        LJI();
        String LJIL = c68252QqW.LJIL();
        QH7.LJIIIIZZ(LJIL);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", LJIL);
        contentValues.put("app_instance_id", c68252QqW.LJJ());
        contentValues.put("gmp_app_id", c68252QqW.LJJII());
        c68252QqW.LIZ.LIZIZ().LJFF();
        contentValues.put("resettable_device_id_hash", c68252QqW.LJ);
        c68252QqW.LIZ.LIZIZ().LJFF();
        contentValues.put("last_bundle_index", Long.valueOf(c68252QqW.LJI));
        c68252QqW.LIZ.LIZIZ().LJFF();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c68252QqW.LJII));
        c68252QqW.LIZ.LIZIZ().LJFF();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c68252QqW.LJIIIIZZ));
        contentValues.put("app_version", c68252QqW.LJJI());
        c68252QqW.LIZ.LIZIZ().LJFF();
        contentValues.put("app_store", c68252QqW.LJIIJJI);
        c68252QqW.LIZ.LIZIZ().LJFF();
        contentValues.put("gmp_version", Long.valueOf(c68252QqW.LJIIL));
        c68252QqW.LIZ.LIZIZ().LJFF();
        contentValues.put("dev_cert_hash", Long.valueOf(c68252QqW.LJIILIIL));
        c68252QqW.LIZ.LIZIZ().LJFF();
        contentValues.put("measurement_enabled", Boolean.valueOf(c68252QqW.LJIILJJIL));
        c68252QqW.LIZ.LIZIZ().LJFF();
        contentValues.put("day", Long.valueOf(c68252QqW.LJIL));
        c68252QqW.LIZ.LIZIZ().LJFF();
        contentValues.put("daily_public_events_count", Long.valueOf(c68252QqW.LJJ));
        c68252QqW.LIZ.LIZIZ().LJFF();
        contentValues.put("daily_events_count", Long.valueOf(c68252QqW.LJJI));
        c68252QqW.LIZ.LIZIZ().LJFF();
        contentValues.put("daily_conversions_count", Long.valueOf(c68252QqW.LJJIFFI));
        c68252QqW.LIZ.LIZIZ().LJFF();
        contentValues.put("config_fetched_time", Long.valueOf(c68252QqW.LJJIIZ));
        c68252QqW.LIZ.LIZIZ().LJFF();
        contentValues.put("failed_config_fetch_time", Long.valueOf(c68252QqW.LJJIIZI));
        contentValues.put("app_version_int", Long.valueOf(c68252QqW.LJIJI()));
        contentValues.put("firebase_instance_id", c68252QqW.LJJIFFI());
        c68252QqW.LIZ.LIZIZ().LJFF();
        contentValues.put("daily_error_events_count", Long.valueOf(c68252QqW.LJJII));
        c68252QqW.LIZ.LIZIZ().LJFF();
        contentValues.put("daily_realtime_events_count", Long.valueOf(c68252QqW.LJJIII));
        c68252QqW.LIZ.LIZIZ().LJFF();
        contentValues.put("health_monitor_sample", c68252QqW.LJJIIJ);
        c68252QqW.LIZ.LIZIZ().LJFF();
        contentValues.put("android_id", Long.valueOf(c68252QqW.LJIILL));
        c68252QqW.LIZ.LIZIZ().LJFF();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c68252QqW.LJIILLIIL));
        contentValues.put("admob_app_id", c68252QqW.LJIJJ());
        c68252QqW.LIZ.LIZIZ().LJFF();
        contentValues.put("dynamite_version", Long.valueOf(c68252QqW.LJIJI));
        c68252QqW.LIZ.LIZIZ().LJFF();
        contentValues.put("session_stitching_token", c68252QqW.LJIJJLI);
        c68252QqW.LIZ.LIZIZ().LJFF();
        List list = c68252QqW.LJIJJ;
        if (list != null) {
            if (list.isEmpty()) {
                this.LIZ.LIZJ().LJIIIIZZ.LIZIZ(LJIL, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", list));
            }
        }
        ((InterfaceC68325Qrh) C68328Qrk.LJLILLLLZI.LJLIL.zza()).zza();
        if (this.LIZ.LJI.LJIILJJIL(null, C68555QvP.LJJZ) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase LJJI = LJJI();
            if (LJJI.update("apps", contentValues, "app_id = ?", new String[]{LJIL}) == 0 && LJJI.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                this.LIZ.LIZJ().LJFF.LIZIZ(C67280Qaq.LJIIIZ(LJIL), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e) {
            this.LIZ.LIZJ().LJFF.LIZJ(C67280Qaq.LJIIIZ(LJIL), e, "Error storing app. appId");
        }
    }

    public final void LJIIL(C68277Qqv c68277Qqv) {
        Long l;
        QH7.LJIIIIZZ(c68277Qqv);
        LJFF();
        LJI();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c68277Qqv.LIZ);
        contentValues.put("name", c68277Qqv.LIZIZ);
        contentValues.put("lifetime_count", Long.valueOf(c68277Qqv.LIZJ));
        contentValues.put("current_bundle_count", Long.valueOf(c68277Qqv.LIZLLL));
        contentValues.put("last_fire_timestamp", Long.valueOf(c68277Qqv.LJFF));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c68277Qqv.LJI));
        contentValues.put("last_bundled_day", c68277Qqv.LJII);
        contentValues.put("last_sampled_complex_event_id", c68277Qqv.LJIIIIZZ);
        contentValues.put("last_sampling_rate", c68277Qqv.LJIIIZ);
        contentValues.put("current_session_count", Long.valueOf(c68277Qqv.LJ));
        Boolean bool = c68277Qqv.LJIIJ;
        if (bool != null && bool.booleanValue()) {
            l = 1L;
        } else {
            l = null;
        }
        contentValues.put("last_exempt_from_sampling", l);
        try {
            if (LJJI().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                this.LIZ.LIZJ().LJFF.LIZIZ(C67280Qaq.LJIIIZ(c68277Qqv.LIZ), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e) {
            this.LIZ.LIZJ().LJFF.LIZJ(C67280Qaq.LJIIIZ(c68277Qqv.LIZ), e, "Error storing event aggregates. appId");
        }
    }

    public final boolean LJIILL(zzac zzacVar) {
        LJFF();
        LJI();
        String str = zzacVar.zza;
        QH7.LJIIIIZZ(str);
        if (LJJIIZI(str, zzacVar.zzc.zzb) == null && LJIJI("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzacVar.zzb);
        contentValues.put("name", zzacVar.zzc.zzb);
        Object LJJJJL = zzacVar.zzc.LJJJJL();
        QH7.LJIIIIZZ(LJJJJL);
        LJIJ(contentValues, LJJJJL);
        contentValues.put("active", Boolean.valueOf(zzacVar.zze));
        contentValues.put("trigger_event_name", zzacVar.zzf);
        contentValues.put("trigger_timeout", Long.valueOf(zzacVar.zzh));
        C68083Qnn LJIL = this.LIZ.LJIL();
        zzaw zzawVar = zzacVar.zzg;
        LJIL.getClass();
        contentValues.put("timed_out_event", C68083Qnn.LJJJJL(zzawVar));
        contentValues.put("creation_timestamp", Long.valueOf(zzacVar.zzd));
        C68083Qnn LJIL2 = this.LIZ.LJIL();
        zzaw zzawVar2 = zzacVar.zzi;
        LJIL2.getClass();
        contentValues.put("triggered_event", C68083Qnn.LJJJJL(zzawVar2));
        contentValues.put("triggered_timestamp", Long.valueOf(zzacVar.zzc.zzc));
        contentValues.put("time_to_live", Long.valueOf(zzacVar.zzj));
        C68083Qnn LJIL3 = this.LIZ.LJIL();
        zzaw zzawVar3 = zzacVar.zzk;
        LJIL3.getClass();
        contentValues.put("expired_event", C68083Qnn.LJJJJL(zzawVar3));
        try {
            if (LJJI().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                this.LIZ.LIZJ().LJFF.LIZIZ(C67280Qaq.LJIIIZ(str), "Failed to insert/update conditional user property (got -1)");
            }
        } catch (SQLiteException e) {
            this.LIZ.LIZJ().LJFF.LIZJ(C67280Qaq.LJIIIZ(str), e, "Error storing conditional user property");
        }
        return true;
    }

    public final boolean LJIILLIIL(C68135Qod c68135Qod) {
        LJFF();
        LJI();
        if (LJJIIZI(c68135Qod.LIZ, c68135Qod.LIZJ) == null) {
            if (C68083Qnn.LJJJJI(c68135Qod.LIZJ)) {
                if (LJIJI("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{c68135Qod.LIZ}) >= Math.max(Math.min(this.LIZ.LJI.LJIIIZ(c68135Qod.LIZ, C68555QvP.LJJIJIIJI), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(c68135Qod.LIZJ) && LJIJI("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{c68135Qod.LIZ, c68135Qod.LIZIZ}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c68135Qod.LIZ);
        contentValues.put("origin", c68135Qod.LIZIZ);
        contentValues.put("name", c68135Qod.LIZJ);
        contentValues.put("set_timestamp", Long.valueOf(c68135Qod.LIZLLL));
        LJIJ(contentValues, c68135Qod.LJ);
        try {
            if (LJJI().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                this.LIZ.LIZJ().LJFF.LIZIZ(C67280Qaq.LJIIIZ(c68135Qod.LIZ), "Failed to insert/update user property (got -1). appId");
            }
        } catch (SQLiteException e) {
            this.LIZ.LIZJ().LJFF.LIZJ(C67280Qaq.LJIIIZ(c68135Qod.LIZ), e, "Error storing user property. appId");
        }
        return true;
    }

    public final long LJIL(String str) {
        QH7.LJI(str);
        QH7.LJI("first_open_count");
        LJFF();
        LJI();
        SQLiteDatabase LJJI = LJJI();
        LJJI.beginTransaction();
        long j = 0;
        try {
            try {
                long LJIJJLI = LJIJJLI(-1L, "select first_open_count from app2 where app_id=?", new String[]{str});
                if (LJIJJLI == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (LJJI.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        this.LIZ.LIZJ().LJFF.LIZJ(C67280Qaq.LJIIIZ(str), "first_open_count", "Failed to insert column (got -1). appId");
                        return -1L;
                    }
                    LJIJJLI = 0;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", Long.valueOf(1 + LJIJJLI));
                    if (LJJI.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        this.LIZ.LIZJ().LJFF.LIZJ(C67280Qaq.LJIIIZ(str), "first_open_count", "Failed to update column (got 0). appId");
                        return -1L;
                    }
                    LJJI.setTransactionSuccessful();
                    return LJIJJLI;
                } catch (SQLiteException e) {
                    e = e;
                    j = LJIJJLI;
                    this.LIZ.LIZJ().LJFF.LIZLLL(C67280Qaq.LJIIIZ(str), "first_open_count", e, "Error inserting column. appId");
                    LJJI.endTransaction();
                    return j;
                }
            } catch (SQLiteException e2) {
                e = e2;
            }
        } finally {
            LJJI.endTransaction();
        }
    }

    public final long LJJ(String str) {
        QH7.LJI(str);
        return LJIJJLI(0L, "select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str});
    }

    /* JADX WARN: Not initialized variable reg: 7, insn: 0x02d3: IF  (r7 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:92:? (LINE:16777939), block:B:89:0x02d3 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01f4 A[Catch: SQLiteException -> 0x02b5, all -> 0x02d2, TryCatch #0 {all -> 0x02d2, blocks: (B:5:0x0066, B:10:0x0070, B:12:0x00d1, B:16:0x00db, B:19:0x00f8, B:22:0x0117, B:25:0x0136, B:28:0x0155, B:31:0x017d, B:34:0x0193, B:37:0x01b9, B:40:0x01d8, B:42:0x01f4, B:45:0x0203, B:46:0x01ff, B:47:0x0206, B:49:0x020e, B:53:0x0218, B:56:0x022a, B:58:0x0240, B:60:0x024b, B:61:0x025d, B:63:0x026c, B:64:0x0289, B:66:0x029a, B:70:0x02ac, B:75:0x018e, B:83:0x02bb), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x024b A[Catch: SQLiteException -> 0x02b5, all -> 0x02d2, TryCatch #0 {all -> 0x02d2, blocks: (B:5:0x0066, B:10:0x0070, B:12:0x00d1, B:16:0x00db, B:19:0x00f8, B:22:0x0117, B:25:0x0136, B:28:0x0155, B:31:0x017d, B:34:0x0193, B:37:0x01b9, B:40:0x01d8, B:42:0x01f4, B:45:0x0203, B:46:0x01ff, B:47:0x0206, B:49:0x020e, B:53:0x0218, B:56:0x022a, B:58:0x0240, B:60:0x024b, B:61:0x025d, B:63:0x026c, B:64:0x0289, B:66:0x029a, B:70:0x02ac, B:75:0x018e, B:83:0x02bb), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x026c A[Catch: SQLiteException -> 0x02b5, all -> 0x02d2, TryCatch #0 {all -> 0x02d2, blocks: (B:5:0x0066, B:10:0x0070, B:12:0x00d1, B:16:0x00db, B:19:0x00f8, B:22:0x0117, B:25:0x0136, B:28:0x0155, B:31:0x017d, B:34:0x0193, B:37:0x01b9, B:40:0x01d8, B:42:0x01f4, B:45:0x0203, B:46:0x01ff, B:47:0x0206, B:49:0x020e, B:53:0x0218, B:56:0x022a, B:58:0x0240, B:60:0x024b, B:61:0x025d, B:63:0x026c, B:64:0x0289, B:66:0x029a, B:70:0x02ac, B:75:0x018e, B:83:0x02bb), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x029a A[Catch: SQLiteException -> 0x02b5, all -> 0x02d2, TryCatch #0 {all -> 0x02d2, blocks: (B:5:0x0066, B:10:0x0070, B:12:0x00d1, B:16:0x00db, B:19:0x00f8, B:22:0x0117, B:25:0x0136, B:28:0x0155, B:31:0x017d, B:34:0x0193, B:37:0x01b9, B:40:0x01d8, B:42:0x01f4, B:45:0x0203, B:46:0x01ff, B:47:0x0206, B:49:0x020e, B:53:0x0218, B:56:0x022a, B:58:0x0240, B:60:0x024b, B:61:0x025d, B:63:0x026c, B:64:0x0289, B:66:0x029a, B:70:0x02ac, B:75:0x018e, B:83:0x02bb), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02ac A[Catch: SQLiteException -> 0x02b5, all -> 0x02d2, TRY_LEAVE, TryCatch #0 {all -> 0x02d2, blocks: (B:5:0x0066, B:10:0x0070, B:12:0x00d1, B:16:0x00db, B:19:0x00f8, B:22:0x0117, B:25:0x0136, B:28:0x0155, B:31:0x017d, B:34:0x0193, B:37:0x01b9, B:40:0x01d8, B:42:0x01f4, B:45:0x0203, B:46:0x01ff, B:47:0x0206, B:49:0x020e, B:53:0x0218, B:56:0x022a, B:58:0x0240, B:60:0x024b, B:61:0x025d, B:63:0x026c, B:64:0x0289, B:66:0x029a, B:70:0x02ac, B:75:0x018e, B:83:0x02bb), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018e A[Catch: SQLiteException -> 0x02b5, all -> 0x02d2, TryCatch #0 {all -> 0x02d2, blocks: (B:5:0x0066, B:10:0x0070, B:12:0x00d1, B:16:0x00db, B:19:0x00f8, B:22:0x0117, B:25:0x0136, B:28:0x0155, B:31:0x017d, B:34:0x0193, B:37:0x01b9, B:40:0x01d8, B:42:0x01f4, B:45:0x0203, B:46:0x01ff, B:47:0x0206, B:49:0x020e, B:53:0x0218, B:56:0x022a, B:58:0x0240, B:60:0x024b, B:61:0x025d, B:63:0x026c, B:64:0x0289, B:66:0x029a, B:70:0x02ac, B:75:0x018e, B:83:0x02bb), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C68252QqW LJJIFFI(java.lang.String r49) {
        /*
            Method dump skipped, instructions count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68242QqM.LJJIFFI(java.lang.String):X.QqW");
    }

    public final List LJJIJL(String str) {
        QH7.LJI(str);
        LJFF();
        LJI();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = LJJI().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    long j = cursor.getLong(2);
                    Object LJJIJ = LJJIJ(3, cursor);
                    if (LJJIJ == null) {
                        this.LIZ.LIZJ().LJFF.LIZIZ(C67280Qaq.LJIIIZ(str), "Read invalid user property value, ignoring it. appId");
                    } else {
                        arrayList.add(new C68135Qod(j, LJJIJ, str, string2, string));
                    }
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e) {
                this.LIZ.LIZJ().LJFF.LIZJ(C67280Qaq.LJIIIZ(str), e, "Error querying user properties. appId");
                List emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void LJJJ(List list) {
        LJFF();
        LJI();
        if (list.size() != 0) {
            if (!LJIILIIL()) {
                return;
            }
            String str = "(" + TextUtils.join(",", list) + ")";
            if (LJIJI("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                this.LIZ.LIZJ().LJIIIIZZ.LIZ("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                LJJI().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
                return;
            } catch (SQLiteException e) {
                this.LIZ.LIZJ().LJFF.LIZIZ(e, "Error incrementing retry count. error");
                return;
            }
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    public static final void LJIJ(ContentValues contentValues, Object obj) {
        QH7.LJI("value");
        QH7.LJIIIIZZ(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (obj instanceof Double) {
                contentValues.put("value", (Double) obj);
                return;
            }
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    public final void LJIIIZ(String str, String str2) {
        QH7.LJI(str);
        QH7.LJI(str2);
        LJFF();
        LJI();
        try {
            LJJI().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.LIZ.LIZJ().LJFF.LIZLLL(C67280Qaq.LJIIIZ(str), this.LIZ.LJIIL.LJFF(str2), e, "Error deleting user property. appId");
        }
    }

    public final long LJIJI(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = LJJI().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j = rawQuery.getLong(0);
                    rawQuery.close();
                    return j;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e) {
                this.LIZ.LIZJ().LJFF.LIZJ(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void LJIJJ(String str, String str2) {
        QH7.LJI(str);
        QH7.LJI(str2);
        LJFF();
        LJI();
        try {
            LJJI().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.LIZ.LIZJ().LJFF.LIZLLL(C67280Qaq.LJIIIZ(str), this.LIZ.LJIIL.LJFF(str2), e, "Error deleting conditional property");
        }
    }

    public final zzac LJJII(String str, String str2) {
        Cursor cursor;
        boolean z;
        QH7.LJI(str);
        QH7.LJI(str2);
        LJFF();
        LJI();
        try {
            cursor = LJJI().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursor.moveToFirst()) {
                        cursor.close();
                        return null;
                    }
                    String string = cursor.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    Object LJJIJ = LJJIJ(1, cursor);
                    if (cursor.getInt(2) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String string2 = cursor.getString(3);
                    long j = cursor.getLong(4);
                    C68243QqN c68243QqN = this.LIZIZ.LJI;
                    C68241QqL.LJJIJIIJI(c68243QqN);
                    byte[] blob = cursor.getBlob(5);
                    Parcelable.Creator<zzaw> creator = zzaw.CREATOR;
                    zzaw zzawVar = (zzaw) c68243QqN.LJIJJLI(blob, creator);
                    long j2 = cursor.getLong(6);
                    C68243QqN c68243QqN2 = this.LIZIZ.LJI;
                    C68241QqL.LJJIJIIJI(c68243QqN2);
                    zzaw zzawVar2 = (zzaw) c68243QqN2.LJIJJLI(cursor.getBlob(7), creator);
                    long j3 = cursor.getLong(8);
                    long j4 = cursor.getLong(9);
                    C68243QqN c68243QqN3 = this.LIZIZ.LJI;
                    C68241QqL.LJJIJIIJI(c68243QqN3);
                    zzac zzacVar = new zzac(str, string, new zzlo(j3, LJJIJ, str2, string), j2, z, string2, zzawVar, j, zzawVar2, j4, (zzaw) c68243QqN3.LJIJJLI(cursor.getBlob(10), creator));
                    if (cursor.moveToNext()) {
                        this.LIZ.LIZJ().LJFF.LIZJ(C67280Qaq.LJIIIZ(str), this.LIZ.LJIIL.LJFF(str2), "Got multiple records for conditional property, expected one");
                    }
                    cursor.close();
                    return zzacVar;
                } catch (SQLiteException e) {
                    e = e;
                    this.LIZ.LIZJ().LJFF.LIZLLL(C67280Qaq.LJIIIZ(str), this.LIZ.LJIIL.LJFF(str2), e, "Error querying conditional property");
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                    throw th;
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C68277Qqv LJJIIJZLJL(java.lang.String r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68242QqM.LJJIIJZLJL(java.lang.String, java.lang.String):X.Qqv");
    }

    public final C68135Qod LJJIIZI(String str, String str2) {
        Cursor cursor;
        QH7.LJI(str);
        QH7.LJI(str2);
        LJFF();
        LJI();
        try {
            cursor = LJJI().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursor.moveToFirst()) {
                        cursor.close();
                        return null;
                    }
                    long j = cursor.getLong(0);
                    Object LJJIJ = LJJIJ(1, cursor);
                    if (LJJIJ == null) {
                        cursor.close();
                        return null;
                    }
                    C68135Qod c68135Qod = new C68135Qod(j, LJJIJ, str, cursor.getString(2), str2);
                    if (cursor.moveToNext()) {
                        this.LIZ.LIZJ().LJFF.LIZIZ(C67280Qaq.LJIIIZ(str), "Got multiple records for user property, expected one. appId");
                    }
                    cursor.close();
                    return c68135Qod;
                } catch (SQLiteException e) {
                    e = e;
                    this.LIZ.LIZJ().LJFF.LIZLLL(C67280Qaq.LJIIIZ(str), this.LIZ.LJIIL.LJFF(str2), e, "Error querying user property. appId");
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                    throw th;
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final Object LJJIJ(int i, Cursor cursor) {
        int type = cursor.getType(i);
        if (type != 0) {
            if (type != 1) {
                if (type != 2) {
                    if (type != 3) {
                        if (type != 4) {
                            this.LIZ.LIZJ().LJFF.LIZIZ(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
                            return null;
                        }
                        this.LIZ.LIZJ().LJFF.LIZ("Loaded invalid blob type value, ignoring it");
                        return null;
                    }
                    return cursor.getString(i);
                }
                return Double.valueOf(cursor.getDouble(i));
            }
            return Long.valueOf(cursor.getLong(i));
        }
        this.LIZ.LIZJ().LJFF.LIZ("Loaded invalid null value from database");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        r1.LIZJ().LJFF.LIZIZ(1000, "Read more than the max allowed conditional properties, ignoring extra");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List LJJIJIL(java.lang.String r30, java.lang.String[] r31) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68242QqM.LJJIJIL(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(long r23, long r25, X.C68268Qqm r27) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68242QqM.LJIIZILJ(long, long, X.Qqm):void");
    }

    public final long LJIJJLI(long j, String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                cursor = LJJI().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    long j2 = cursor.getLong(0);
                    cursor.close();
                    return j2;
                }
                cursor.close();
                return j;
            } catch (SQLiteException e) {
                this.LIZ.LIZJ().LJFF.LIZJ(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final List LJJIJIIJIL(String str, String str2, String str3) {
        QH7.LJI(str);
        LJFF();
        LJI();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return LJJIJIL(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0099, code lost:
    
        r7.LIZJ().LJFF.LIZIZ(1000, "Read more than the max allowed user properties, ignoring excess");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List LJJIJLIJ(java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68242QqM.LJJIJLIJ(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final void LJIILJJIL(String str, Long l, long j, C68260Qqe c68260Qqe) {
        LJFF();
        LJI();
        QH7.LJIIIIZZ(c68260Qqe);
        QH7.LJI(str);
        byte[] LJIIIIZZ2 = c68260Qqe.LJIIIIZZ();
        this.LIZ.LIZJ().LJIILIIL.LIZJ(this.LIZ.LJIIL.LIZLLL(str), Integer.valueOf(LJIIIIZZ2.length), "Saving complex main event, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", LJIIIIZZ2);
        try {
            if (LJJI().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                this.LIZ.LIZJ().LJFF.LIZIZ(C67280Qaq.LJIIIZ(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e) {
            this.LIZ.LIZJ().LJFF.LIZJ(C67280Qaq.LJIIIZ(str), e, "Error storing complex main event. appId");
        }
    }

    public final C68314QrW LJJIII(long j, String str, boolean z, boolean z2) {
        return LJJIIJ(j, str, 1L, false, false, z, false, z2);
    }

    public final C68314QrW LJJIIJ(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        QH7.LJI(str);
        LJFF();
        LJI();
        String[] strArr = {str};
        C68314QrW c68314QrW = new C68314QrW();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase LJJI = LJJI();
                Cursor query = LJJI.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    this.LIZ.LIZJ().LJIIIIZZ.LIZIZ(C67280Qaq.LJIIIZ(str), "Not updating daily counts, app is not known. appId");
                    query.close();
                    return c68314QrW;
                }
                if (query.getLong(0) == j) {
                    c68314QrW.LIZIZ = query.getLong(1);
                    c68314QrW.LIZ = query.getLong(2);
                    c68314QrW.LIZJ = query.getLong(3);
                    c68314QrW.LIZLLL = query.getLong(4);
                    c68314QrW.LJ = query.getLong(5);
                }
                if (z) {
                    c68314QrW.LIZIZ += j2;
                }
                if (z2) {
                    c68314QrW.LIZ += j2;
                }
                if (z3) {
                    c68314QrW.LIZJ += j2;
                }
                if (z4) {
                    c68314QrW.LIZLLL += j2;
                }
                if (z5) {
                    c68314QrW.LJ += j2;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j));
                contentValues.put("daily_public_events_count", Long.valueOf(c68314QrW.LIZ));
                contentValues.put("daily_events_count", Long.valueOf(c68314QrW.LIZIZ));
                contentValues.put("daily_conversions_count", Long.valueOf(c68314QrW.LIZJ));
                contentValues.put("daily_error_events_count", Long.valueOf(c68314QrW.LIZLLL));
                contentValues.put("daily_realtime_events_count", Long.valueOf(c68314QrW.LJ));
                LJJI.update("apps", contentValues, "app_id=?", strArr);
                query.close();
                return c68314QrW;
            } catch (SQLiteException e) {
                this.LIZ.LIZJ().LJFF.LIZJ(C67280Qaq.LJIIIZ(str), e, "Error updating daily counts. appId");
                if (0 != 0) {
                    cursor.close();
                }
                return c68314QrW;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }
}

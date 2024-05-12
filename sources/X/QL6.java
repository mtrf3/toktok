package X;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteFullException;
import com.bytedance.common.utility.Logger;
import com.ss.android.common.applog.AppLog;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QL6 {
    public static final String[] LJ = {"event", "page", "session", "misc_log", "succ_rate", "queue"};
    public static final String[] LJFF = {"_id", "name", "duration", "session_id"};
    public static final String[] LJI = {"_id", "value", "is_crash", "timestamp", "retry_count", "retry_time", "log_type"};
    public static final String[] LJII = {"_id", "value", "timestamp", "duration", "non_page", "app_version", "version_code", "pausetime", "launch_sent", "event_index"};
    public static final String[] LJIIIIZZ = {"_id", "category", "tag", "label", "value", "ext_value", "ext_json", "user_id", "timestamp", "session_id", "event_index", "user_type", "user_is_login", "user_is_auth", "uid", "disable_personalization"};
    public static final String[] LJIIIZ = {"_id", "log_type", "value", "session_id"};
    public static final Object LJIIJ = new Object();
    public static QL6 LJIIJJI;
    public final SQLiteDatabase LIZ;
    public final Context LIZIZ;
    public final java.util.Set<Long> LIZJ = new HashSet();
    public final java.util.Set<Long> LIZLLL = new HashSet();

    public QL6(Context context) {
        this.LIZ = new QL5(context).getWritableDatabase();
        this.LIZIZ = context;
    }

    public static QL6 LIZLLL(Context context) {
        synchronized (LJIIJ) {
            if (LJIIJJI == null) {
                LJIIJJI = new QL6(C16880lQ.LLLLL(context));
            }
        }
        return LJIIJJI;
    }

    public static void LJIILJJIL(Cursor cursor) {
        if (cursor != null) {
            try {
                if (!cursor.isClosed()) {
                    cursor.close();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final boolean LIZIZ(long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("delete app_log: ");
        LIZ.append(j);
        QHL.LIZ(X1D.LIZIZ(LIZ));
        boolean z = true;
        String[] strArr = {String.valueOf(j)};
        try {
            if (this.LIZ.delete("queue", "_id = ?", strArr) > 0) {
                return true;
            }
            QIV.LIZ(QIU.pack, QIL.f_db_delete);
            z = false;
            return false;
        } catch (Throwable th) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("delete app_log: ");
            LIZ2.append(j);
            LIZ2.append(" failed");
            QHL.LIZIZ(X1D.LIZIZ(LIZ2), th);
            if (th instanceof SQLiteFullException) {
                try {
                    this.LIZ.execSQL("VACUUM");
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("try delete app_log: ");
                    LIZ3.append(j);
                    LIZ3.append(" again after vacuum");
                    QHL.LIZ(X1D.LIZIZ(LIZ3));
                    if (this.LIZ.delete("queue", "_id = ?", strArr) <= 0) {
                        return false;
                    }
                    return z;
                } catch (Throwable th2) {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("VACUUM failed:");
                    LIZ4.append(th.getMessage());
                    QHL.LIZIZ(X1D.LIZIZ(LIZ4), th2);
                    return false;
                }
            }
            return false;
        }
    }

    public final synchronized boolean LIZJ(long j) {
        SQLiteDatabase sQLiteDatabase = this.LIZ;
        boolean z = false;
        if (sQLiteDatabase == null) {
            return false;
        }
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("queue", new String[]{"_id"}, "_id = ?", new String[]{String.valueOf(j)}, null, null, null, "1");
            if (cursor.getCount() > 0) {
                z = true;
            }
            LJIILJJIL(cursor);
            return z;
        } catch (Throwable unused) {
            LJIILJJIL(cursor);
            return false;
        }
    }

    public final synchronized C66841QLd LJ(long j) {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase = this.LIZ;
        Cursor cursor2 = null;
        C66841QLd c66841QLd = null;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            try {
                cursor = this.LIZ.query("queue", LJI, "_id > ?", new String[]{String.valueOf(j)}, null, null, "_id ASC", "1");
                try {
                    if (cursor.moveToNext()) {
                        C66841QLd c66841QLd2 = new C66841QLd();
                        c66841QLd2.LIZ = cursor.getInt(0);
                        c66841QLd2.LIZIZ = cursor.getString(1);
                        cursor.getLong(3);
                        cursor.getInt(4);
                        cursor.getLong(5);
                        c66841QLd2.LIZJ = cursor.getInt(6);
                        c66841QLd = c66841QLd2;
                    }
                    LJIILJJIL(cursor);
                    return c66841QLd;
                } catch (Exception unused) {
                    LJIILJJIL(cursor);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    cursor2 = cursor;
                    LJIILJJIL(cursor2);
                    throw th;
                }
            } catch (Exception unused2) {
                cursor = null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return null;
    }

    public final synchronized QLP LJFF(long j) {
        String str;
        String[] strArr;
        Cursor cursor;
        boolean z;
        SQLiteDatabase sQLiteDatabase = this.LIZ;
        Cursor cursor2 = null;
        QLP qlp = null;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            boolean z2 = true;
            if (j > 0) {
                try {
                    str = "_id < ?";
                    strArr = new String[]{String.valueOf(j)};
                } catch (Exception unused) {
                    cursor = null;
                    LJIILJJIL(cursor);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    LJIILJJIL(cursor2);
                    throw th;
                }
            } else {
                str = null;
                strArr = null;
            }
            cursor = this.LIZ.query("session", LJII, str, strArr, null, null, "_id DESC", "1");
            try {
                if (cursor.moveToNext()) {
                    QLP qlp2 = new QLP();
                    qlp2.LIZ = cursor.getInt(0);
                    qlp2.LIZIZ = cursor.getString(1);
                    qlp2.LIZJ = cursor.getLong(2);
                    if (cursor.getInt(4) > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    qlp2.LJII = z;
                    qlp2.LJ = cursor.getString(5);
                    qlp2.LJFF = cursor.getInt(6);
                    qlp2.LJI = cursor.getInt(7);
                    if (cursor.getInt(8) <= 0) {
                        z2 = false;
                    }
                    qlp2.LJIIIIZZ = z2;
                    qlp2.LIZLLL = cursor.getLong(9);
                    qlp2.LJIIIZ = false;
                    qlp = qlp2;
                }
                LJIILJJIL(cursor);
                return qlp;
            } catch (Exception unused2) {
                LJIILJJIL(cursor);
                return null;
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                LJIILJJIL(cursor2);
                throw th;
            }
        }
        return null;
    }

    public final synchronized long LJI(QLJ qlj) {
        SQLiteDatabase sQLiteDatabase = this.LIZ;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("category", qlj.LIZ);
            contentValues.put("tag", qlj.LIZIZ);
            if (!C38354F3m.LJ(qlj.LIZJ)) {
                contentValues.put("label", qlj.LIZJ);
            }
            contentValues.put("value", Long.valueOf(qlj.LIZLLL));
            contentValues.put("ext_value", Long.valueOf(qlj.LJ));
            if (!C38354F3m.LJ(qlj.LJIILIIL)) {
                contentValues.put("ext_json", qlj.LJIILIIL);
            }
            contentValues.put("user_id", Long.valueOf(qlj.LJI));
            contentValues.put("timestamp", Long.valueOf(qlj.LJIIJJI));
            contentValues.put("session_id", Long.valueOf(qlj.LJIIL));
            contentValues.put("event_index", Long.valueOf(qlj.LJIILLIIL));
            contentValues.put("user_type", Integer.valueOf(qlj.LJFF));
            contentValues.put("user_is_login", Integer.valueOf(qlj.LJIIIIZZ));
            contentValues.put("user_is_auth", Integer.valueOf(qlj.LJIIIZ));
            contentValues.put("uid", Long.valueOf(qlj.LJII));
            Integer num = qlj.LJIIJ;
            if (num != null) {
                contentValues.put("disable_personalization", String.valueOf(num));
            }
            return this.LIZ.insert("event", null, contentValues);
        }
        return -1L;
    }

    public final long LJII(String str) {
        return LJIIIIZZ(str);
    }

    public final synchronized long LJIIIIZZ(String str) {
        ContentValues contentValues;
        contentValues = new ContentValues();
        contentValues.put("value", str);
        contentValues.put("timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        contentValues.put("retry_time", (Long) 0L);
        contentValues.put("log_type", (Integer) 0);
        return this.LIZ.insert("queue", null, contentValues);
    }

    public final synchronized void LJIILLIIL(long j) {
        SQLiteDatabase sQLiteDatabase = this.LIZ;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            try {
                String[] strArr = {String.valueOf(j)};
                ContentValues contentValues = new ContentValues();
                contentValues.put("launch_sent", (Integer) 1);
                this.LIZ.update("session", contentValues, "_id=?", strArr);
            } catch (Exception unused) {
            }
        }
    }

    public static synchronized void LJIILL(Cursor cursor, SQLiteDatabase sQLiteDatabase) {
        synchronized (QL6.class) {
            LJIILJJIL(cursor);
            if (sQLiteDatabase != null) {
                try {
                    if (sQLiteDatabase.inTransaction()) {
                        sQLiteDatabase.endTransaction();
                    }
                } catch (Throwable th) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("safeCloseCursorAndEndTX failed: ");
                    LIZ.append(th.getMessage());
                    QHL.LIZIZ(X1D.LIZIZ(LIZ), th);
                    if (th instanceof SQLiteFullException) {
                        try {
                            sQLiteDatabase.execSQL("VACUUM");
                        } catch (Throwable th2) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("VACUUM failed:");
                            LIZ2.append(th.getMessage());
                            QHL.LIZIZ(X1D.LIZIZ(LIZ2), th2);
                        }
                    }
                }
            }
        }
    }

    public final synchronized boolean LJIIL(long j, boolean z) {
        SQLiteDatabase sQLiteDatabase = this.LIZ;
        boolean z2 = false;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            if (j <= 0) {
                return false;
            }
            String[] strArr = {String.valueOf(j)};
            if (!z) {
                Cursor cursor = null;
                try {
                    cursor = this.LIZ.query("queue", new String[]{"timestamp", "retry_count", "retry_time"}, "_id = ?", strArr, null, null, null);
                } catch (Exception unused) {
                    LJIILJJIL(cursor);
                } catch (Throwable th) {
                    LJIILJJIL(cursor);
                    throw th;
                }
                if (!cursor.moveToNext()) {
                    LJIILJJIL(cursor);
                    return false;
                }
                long j2 = cursor.getLong(0);
                int i = cursor.getInt(1);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - j2 < AppLog.sLogExpireTime && i < AppLog.sLogRetryMaxCount) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("retry_count", Integer.valueOf(i + 1));
                    contentValues.put("retry_time", Long.valueOf(currentTimeMillis));
                    this.LIZ.update("queue", contentValues, "_id = ?", strArr);
                    LJIILJJIL(cursor);
                    return false;
                }
                LJIILJJIL(cursor);
                Logger.debug();
                if (1 != 0) {
                }
                return z2;
            }
            z2 = LIZIZ(j);
            return z2;
        }
        return false;
    }

    public final synchronized void LJIIZILJ(long j, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", str);
        this.LIZ.update("queue", contentValues, "_id = ?", new String[]{String.valueOf(j)});
    }

    public final synchronized long LJIIIZ(long j, String str, String str2) {
        ContentValues contentValues;
        contentValues = new ContentValues();
        contentValues.put("log_type", str);
        contentValues.put("value", str2);
        contentValues.put("session_id", Long.valueOf(j));
        return this.LIZ.insert("misc_log", null, contentValues);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0131 A[Catch: all -> 0x0193, TryCatch #11 {all -> 0x0193, blocks: (B:3:0x0022, B:6:0x0038, B:42:0x0128, B:44:0x0131, B:71:0x0170, B:79:0x0176, B:82:0x017c), top: B:2:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0187 A[EDGE_INSN: B:61:0x0187->B:62:0x0187 BREAK  A[LOOP:0: B:2:0x0022->B:60:0x018e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017c A[EDGE_INSN: B:81:0x017c->B:82:0x017c BREAK  A[LOOP:0: B:2:0x0022->B:60:0x018e], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONArray LJIILIIL(long r29, org.json.JSONObject r31, org.json.JSONObject r32) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QL6.LJIILIIL(long, org.json.JSONObject, org.json.JSONObject):org.json.JSONArray");
    }

    public static void LJIIJ(long j, String str, List list, JSONObject jSONObject) {
        if (list == null) {
            return;
        }
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    ((QJ5) it.next()).LIZJ(str, j, jSONObject);
                } catch (Exception unused) {
                }
            }
        }
    }

    public static void LJIIJJI(long j, String str, List list, JSONObject jSONObject) {
        if (list == null) {
            return;
        }
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    ((QJ5) it.next()).LIZ(str, j, jSONObject);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:327|(2:329|330)|331|(1:333)|334|(12:(5:347|348|349|350|351)|386|387|(3:398|399|(1:401))|389|(3:391|392|393)|396|397|348|349|350|351)|354|355|(6:357|(1:359)|360|(1:362)|363|(1:365))|366|(5:368|(1:377)|370|(2:372|373)(1:376)|374)|378|(1:380)|381|(1:383)(1:407)) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:9|(2:10|11)|(24:(3:497|498|(34:500|14|15|16|(1:18)(1:494)|19|(1:492)(11:22|23|24|25|27|28|(6:31|32|33|(5:37|38|39|40|41)|42|29)|75|76|77|(12:460|461|(2:481|482)|463|(1:465)|466|(1:468)|472|473|474|475|476)(27:79|80|(2:82|(20:84|88|89|90|91|(51:98|99|100|(2:282|283)(1:102)|103|104|105|(2:275|276)(1:107)|108|109|110|(2:269|270)(1:112)|113|114|(1:116)(1:268)|117|118|(1:120)(1:267)|121|122|(1:124)(1:266)|125|126|(1:128)(1:265)|129|130|131|(2:259|260)(1:133)|134|135|(1:137)(1:258)|138|139|(1:141)|142|(13:251|252|145|146|(3:148|149|(5:153|154|(1:156)|157|(1:195)))|206|207|(2:242|243)|209|(1:211)|212|(1:214)|(1:240))|144|145|146|(0)|206|207|(0)|209|(0)|212|(0)|(1:216)|240|93|94)|(3:292|293|294)|(1:300)|(1:303)|304|305|306|(3:436|437|(3:439|(2:441|442)(1:444)|443))|308|(1:310)|(3:414|415|(10:417|(1:419)|420|(1:422)|423|(1:425)|426|(1:428)|431|(1:435)))|313|(5:318|(1:320)|321|(1:323)|324)|325|(26:327|(2:329|330)|331|(1:333)|334|(5:347|348|349|350|351)|354|355|(6:357|(1:359)|360|(1:362)|363|(1:365))|366|(5:368|(1:377)|370|(2:372|373)(1:376)|374)|378|(1:380)|381|(1:383)(1:407)|386|387|(3:398|399|(1:401))|389|(3:391|392|393)|396|397|348|349|350|351)(26:410|(2:412|330)|331|(0)|334|(10:336|338|340|342|344|347|348|349|350|351)|354|355|(0)|366|(0)|378|(0)|381|(0)(0)|386|387|(0)|389|(0)|396|397|348|349|350|351)))|459|88|89|90|91|(52:96|98|99|100|(0)(0)|103|104|105|(0)(0)|108|109|110|(0)(0)|113|114|(0)(0)|117|118|(0)(0)|121|122|(0)(0)|125|126|(0)(0)|129|130|131|(0)(0)|134|135|(0)(0)|138|139|(0)|142|(0)|144|145|146|(0)|206|207|(0)|209|(0)|212|(0)|(0)|240|93|94)|449|(0)|(2:298|300)|(0)|304|305|306|(0)|308|(0)|(0)|414|415|(0)|313|(7:315|316|318|(0)|321|(0)|324)|325|(0)(0)))|477|80|(0)|459|88|89|90|91|(2:93|94)|449|(0)|(0)|(0)|304|305|306|(0)|308|(0)|(0)|414|415|(0)|313|(0)|325|(0)(0)))|88|89|90|91|(2:93|94)|449|(0)|(0)|(0)|304|305|306|(0)|308|(0)|(0)|414|415|(0)|313|(0)|325|(0)(0))|13|14|15|16|(0)(0)|19|(0)|492|477|80|(0)|459) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:(8:(3:497|498|(34:500|14|15|16|(1:18)(1:494)|19|(1:492)(11:22|23|24|25|27|28|(6:31|32|33|(5:37|38|39|40|41)|42|29)|75|76|77|(12:460|461|(2:481|482)|463|(1:465)|466|(1:468)|472|473|474|475|476)(27:79|80|(2:82|(20:84|88|89|90|91|(51:98|99|100|(2:282|283)(1:102)|103|104|105|(2:275|276)(1:107)|108|109|110|(2:269|270)(1:112)|113|114|(1:116)(1:268)|117|118|(1:120)(1:267)|121|122|(1:124)(1:266)|125|126|(1:128)(1:265)|129|130|131|(2:259|260)(1:133)|134|135|(1:137)(1:258)|138|139|(1:141)|142|(13:251|252|145|146|(3:148|149|(5:153|154|(1:156)|157|(1:195)))|206|207|(2:242|243)|209|(1:211)|212|(1:214)|(1:240))|144|145|146|(0)|206|207|(0)|209|(0)|212|(0)|(1:216)|240|93|94)|(3:292|293|294)|(1:300)|(1:303)|304|305|306|(3:436|437|(3:439|(2:441|442)(1:444)|443))|308|(1:310)|(3:414|415|(10:417|(1:419)|420|(1:422)|423|(1:425)|426|(1:428)|431|(1:435)))|313|(5:318|(1:320)|321|(1:323)|324)|325|(26:327|(2:329|330)|331|(1:333)|334|(5:347|348|349|350|351)|354|355|(6:357|(1:359)|360|(1:362)|363|(1:365))|366|(5:368|(1:377)|370|(2:372|373)(1:376)|374)|378|(1:380)|381|(1:383)(1:407)|386|387|(3:398|399|(1:401))|389|(3:391|392|393)|396|397|348|349|350|351)(26:410|(2:412|330)|331|(0)|334|(10:336|338|340|342|344|347|348|349|350|351)|354|355|(0)|366|(0)|378|(0)|381|(0)(0)|386|387|(0)|389|(0)|396|397|348|349|350|351)))|459|88|89|90|91|(52:96|98|99|100|(0)(0)|103|104|105|(0)(0)|108|109|110|(0)(0)|113|114|(0)(0)|117|118|(0)(0)|121|122|(0)(0)|125|126|(0)(0)|129|130|131|(0)(0)|134|135|(0)(0)|138|139|(0)|142|(0)|144|145|146|(0)|206|207|(0)|209|(0)|212|(0)|(0)|240|93|94)|449|(0)|(2:298|300)|(0)|304|305|306|(0)|308|(0)|(0)|414|415|(0)|313|(7:315|316|318|(0)|321|(0)|324)|325|(0)(0)))|477|80|(0)|459|88|89|90|91|(2:93|94)|449|(0)|(0)|(0)|304|305|306|(0)|308|(0)|(0)|414|415|(0)|313|(0)|325|(0)(0)))|414|415|(0)|313|(0)|325|(0)(0))|88|89|90|91|(2:93|94)|449|(0)|(0)|(0)|304|305|306|(0)|308|(0)|(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(39:99|100|(2:282|283)(1:102)|103|104|105|(2:275|276)(1:107)|108|109|110|(2:269|270)(1:112)|113|114|(1:116)(1:268)|117|118|(1:120)(1:267)|121|122|(1:124)(1:266)|125|126|(1:128)(1:265)|129|130|131|(2:259|260)(1:133)|134|135|(1:137)(1:258)|138|139|(1:141)|142|(10:(13:251|252|145|146|(3:148|149|(5:153|154|(1:156)|157|(1:195)))|206|207|(2:242|243)|209|(1:211)|212|(1:214)|(1:240))|206|207|(0)|209|(0)|212|(0)|(1:216)|240)|144|145|146|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02ff, code lost:
    
        if (r8 > 0) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0301, code lost:
    
        r4.put("user_is_login", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0306, code lost:
    
        if (r41 != false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x030a, code lost:
    
        r4.put("user_type", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x030f, code lost:
    
        if (r41 != false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0311, code lost:
    
        if (r7 <= 0) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x031c, code lost:
    
        if (r28 <= 0) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x031e, code lost:
    
        r4.put("uid", r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0329, code lost:
    
        if (android.text.TextUtils.isEmpty(r22) != false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x032b, code lost:
    
        r4.put("user_unique_id", r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0338, code lost:
    
        if (r2.has("ab_sdk_version") == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x033a, code lost:
    
        r4.put("ab_sdk_version", r2.optString("ab_sdk_version"));
        r2.remove("ab_sdk_version");
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x034a, code lost:
    
        r4.put("event", r38);
        r4.put("params", r2);
        r4.put("event_id", r14);
        r4.put("tea_event_index", r30);
        r4.put("local_time_ms", r18);
        r4.put("session_id", r52.LIZIZ);
        r4.put("datetime", com.ss.android.common.applog.AppLog.formatDate(r18));
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x037d, code lost:
    
        if (android.text.TextUtils.isEmpty(r27) != false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x037f, code lost:
    
        r4.put("disable_personalization", java.lang.Integer.valueOf(r27));
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0388, code lost:
    
        r0 = r4.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x038c, code lost:
    
        if (r0 == null) goto L514;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x038e, code lost:
    
        r1 = r0.length();
        r10 = r10 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0395, code lost:
    
        if (r1 <= r25) goto L514;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0397, code lost:
    
        r25 = r1;
        r46 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x039b, code lost:
    
        r42.put(r4);
        r39 = r39 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0828, code lost:
    
        r2 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0313, code lost:
    
        r4.put("user_is_auth", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0318, code lost:
    
        if (r41 != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0308, code lost:
    
        if (r9 <= 0) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x02fd, code lost:
    
        if (r41 == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x03eb, code lost:
    
        if (r8 > 0) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x03ed, code lost:
    
        r2.put("user_is_login", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x03f2, code lost:
    
        if (r41 != false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x03f6, code lost:
    
        r2.put("user_type", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x03fb, code lost:
    
        if (r41 != false) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x03fd, code lost:
    
        if (r7 <= 0) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0408, code lost:
    
        if (r28 <= 0) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x040a, code lost:
    
        r2.put("uid", r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0415, code lost:
    
        if (android.text.TextUtils.isEmpty(r22) != false) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0417, code lost:
    
        r2.put("user_unique_id", r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x041e, code lost:
    
        r2.put("session_id", r52.LIZIZ);
        r2.put("datetime", com.ss.android.common.applog.AppLog.formatDate(r18));
        r2.put("event_id", r14);
        r0 = r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0437, code lost:
    
        if (r0 == null) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0439, code lost:
    
        r1 = r0.length();
        r10 = r10 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0440, code lost:
    
        if (r1 <= r25) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0442, code lost:
    
        r25 = r1;
        r46 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0446, code lost:
    
        r43.put(r2);
        r40 = r40 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x03ff, code lost:
    
        r2.put("user_is_auth", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0404, code lost:
    
        if (r41 != false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x03f4, code lost:
    
        if (r9 <= 0) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x03e9, code lost:
    
        if (r41 == false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x046e, code lost:
    
        r2 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x083b, code lost:
    
        r2 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0842, code lost:
    
        r4 = 995000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x084a, code lost:
    
        r2 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x084b, code lost:
    
        r4 = 995000;
        r45 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x023a A[Catch: OutOfMemoryError -> 0x0456, all -> 0x0458, TRY_ENTER, TryCatch #23 {OutOfMemoryError -> 0x0456, blocks: (B:270:0x022c, B:116:0x023a, B:120:0x0248, B:124:0x0263, B:128:0x0271), top: B:269:0x022c }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0248 A[Catch: OutOfMemoryError -> 0x0456, all -> 0x0458, TRY_ENTER, TryCatch #23 {OutOfMemoryError -> 0x0456, blocks: (B:270:0x022c, B:116:0x023a, B:120:0x0248, B:124:0x0263, B:128:0x0271), top: B:269:0x022c }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0263 A[Catch: OutOfMemoryError -> 0x0456, all -> 0x0458, TRY_ENTER, TryCatch #23 {OutOfMemoryError -> 0x0456, blocks: (B:270:0x022c, B:116:0x023a, B:120:0x0248, B:124:0x0263, B:128:0x0271), top: B:269:0x022c }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0271 A[Catch: OutOfMemoryError -> 0x0456, all -> 0x0458, TRY_ENTER, TryCatch #23 {OutOfMemoryError -> 0x0456, blocks: (B:270:0x022c, B:116:0x023a, B:120:0x0248, B:124:0x0263, B:128:0x0271), top: B:269:0x022c }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x028d A[Catch: all -> 0x0458, OutOfMemoryError -> 0x0468, TRY_ENTER, TryCatch #14 {OutOfMemoryError -> 0x0468, blocks: (B:260:0x027f, B:137:0x028d), top: B:259:0x027f }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03c9 A[Catch: OutOfMemoryError -> 0x0461, all -> 0x0471, TryCatch #29 {OutOfMemoryError -> 0x0461, blocks: (B:243:0x03bf, B:211:0x03c9, B:214:0x03d5, B:229:0x0417), top: B:242:0x03bf }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03d5 A[Catch: OutOfMemoryError -> 0x0461, all -> 0x0471, TryCatch #29 {OutOfMemoryError -> 0x0461, blocks: (B:243:0x03bf, B:211:0x03c9, B:214:0x03d5, B:229:0x0417), top: B:242:0x03bf }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x02a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x027f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x022c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x021e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0210 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0491 A[Catch: OutOfMemoryError -> 0x04a1, all -> 0x082d, TRY_ENTER, TryCatch #4 {all -> 0x082d, blocks: (B:294:0x0484, B:298:0x0491, B:300:0x0497, B:437:0x04f1, B:439:0x04f7, B:442:0x051e, B:443:0x0522, B:316:0x05df, B:318:0x05e3, B:320:0x0612, B:321:0x061b, B:323:0x0621, B:324:0x0628, B:327:0x063a, B:330:0x0674, B:333:0x0690, B:336:0x06a3, B:338:0x06ad, B:340:0x06b7, B:342:0x06c1, B:344:0x06cb, B:355:0x06de, B:357:0x06ea, B:359:0x06f4, B:360:0x0705, B:362:0x070f, B:363:0x0720, B:365:0x072a, B:366:0x073b, B:368:0x0745, B:370:0x0759, B:373:0x0786, B:374:0x078a, B:377:0x0775, B:380:0x07a1, B:383:0x07cb, B:399:0x07d9, B:401:0x07e9, B:393:0x07fb, B:412:0x0669, B:415:0x054d, B:417:0x0557, B:419:0x0580, B:420:0x0586, B:422:0x0590, B:423:0x0599, B:425:0x059f, B:426:0x05a6, B:428:0x05af, B:431:0x05b6, B:433:0x05c6, B:435:0x05d6), top: B:293:0x0484 }] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0543 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0612 A[Catch: OutOfMemoryError -> 0x0826, all -> 0x082d, TryCatch #4 {all -> 0x082d, blocks: (B:294:0x0484, B:298:0x0491, B:300:0x0497, B:437:0x04f1, B:439:0x04f7, B:442:0x051e, B:443:0x0522, B:316:0x05df, B:318:0x05e3, B:320:0x0612, B:321:0x061b, B:323:0x0621, B:324:0x0628, B:327:0x063a, B:330:0x0674, B:333:0x0690, B:336:0x06a3, B:338:0x06ad, B:340:0x06b7, B:342:0x06c1, B:344:0x06cb, B:355:0x06de, B:357:0x06ea, B:359:0x06f4, B:360:0x0705, B:362:0x070f, B:363:0x0720, B:365:0x072a, B:366:0x073b, B:368:0x0745, B:370:0x0759, B:373:0x0786, B:374:0x078a, B:377:0x0775, B:380:0x07a1, B:383:0x07cb, B:399:0x07d9, B:401:0x07e9, B:393:0x07fb, B:412:0x0669, B:415:0x054d, B:417:0x0557, B:419:0x0580, B:420:0x0586, B:422:0x0590, B:423:0x0599, B:425:0x059f, B:426:0x05a6, B:428:0x05af, B:431:0x05b6, B:433:0x05c6, B:435:0x05d6), top: B:293:0x0484 }] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0621 A[Catch: OutOfMemoryError -> 0x0826, all -> 0x082d, TryCatch #4 {all -> 0x082d, blocks: (B:294:0x0484, B:298:0x0491, B:300:0x0497, B:437:0x04f1, B:439:0x04f7, B:442:0x051e, B:443:0x0522, B:316:0x05df, B:318:0x05e3, B:320:0x0612, B:321:0x061b, B:323:0x0621, B:324:0x0628, B:327:0x063a, B:330:0x0674, B:333:0x0690, B:336:0x06a3, B:338:0x06ad, B:340:0x06b7, B:342:0x06c1, B:344:0x06cb, B:355:0x06de, B:357:0x06ea, B:359:0x06f4, B:360:0x0705, B:362:0x070f, B:363:0x0720, B:365:0x072a, B:366:0x073b, B:368:0x0745, B:370:0x0759, B:373:0x0786, B:374:0x078a, B:377:0x0775, B:380:0x07a1, B:383:0x07cb, B:399:0x07d9, B:401:0x07e9, B:393:0x07fb, B:412:0x0669, B:415:0x054d, B:417:0x0557, B:419:0x0580, B:420:0x0586, B:422:0x0590, B:423:0x0599, B:425:0x059f, B:426:0x05a6, B:428:0x05af, B:431:0x05b6, B:433:0x05c6, B:435:0x05d6), top: B:293:0x0484 }] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x063a A[Catch: OutOfMemoryError -> 0x0826, all -> 0x082d, TryCatch #4 {all -> 0x082d, blocks: (B:294:0x0484, B:298:0x0491, B:300:0x0497, B:437:0x04f1, B:439:0x04f7, B:442:0x051e, B:443:0x0522, B:316:0x05df, B:318:0x05e3, B:320:0x0612, B:321:0x061b, B:323:0x0621, B:324:0x0628, B:327:0x063a, B:330:0x0674, B:333:0x0690, B:336:0x06a3, B:338:0x06ad, B:340:0x06b7, B:342:0x06c1, B:344:0x06cb, B:355:0x06de, B:357:0x06ea, B:359:0x06f4, B:360:0x0705, B:362:0x070f, B:363:0x0720, B:365:0x072a, B:366:0x073b, B:368:0x0745, B:370:0x0759, B:373:0x0786, B:374:0x078a, B:377:0x0775, B:380:0x07a1, B:383:0x07cb, B:399:0x07d9, B:401:0x07e9, B:393:0x07fb, B:412:0x0669, B:415:0x054d, B:417:0x0557, B:419:0x0580, B:420:0x0586, B:422:0x0590, B:423:0x0599, B:425:0x059f, B:426:0x05a6, B:428:0x05af, B:431:0x05b6, B:433:0x05c6, B:435:0x05d6), top: B:293:0x0484 }] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0690 A[Catch: OutOfMemoryError -> 0x0826, all -> 0x082d, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x082d, blocks: (B:294:0x0484, B:298:0x0491, B:300:0x0497, B:437:0x04f1, B:439:0x04f7, B:442:0x051e, B:443:0x0522, B:316:0x05df, B:318:0x05e3, B:320:0x0612, B:321:0x061b, B:323:0x0621, B:324:0x0628, B:327:0x063a, B:330:0x0674, B:333:0x0690, B:336:0x06a3, B:338:0x06ad, B:340:0x06b7, B:342:0x06c1, B:344:0x06cb, B:355:0x06de, B:357:0x06ea, B:359:0x06f4, B:360:0x0705, B:362:0x070f, B:363:0x0720, B:365:0x072a, B:366:0x073b, B:368:0x0745, B:370:0x0759, B:373:0x0786, B:374:0x078a, B:377:0x0775, B:380:0x07a1, B:383:0x07cb, B:399:0x07d9, B:401:0x07e9, B:393:0x07fb, B:412:0x0669, B:415:0x054d, B:417:0x0557, B:419:0x0580, B:420:0x0586, B:422:0x0590, B:423:0x0599, B:425:0x059f, B:426:0x05a6, B:428:0x05af, B:431:0x05b6, B:433:0x05c6, B:435:0x05d6), top: B:293:0x0484 }] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x06ea A[Catch: Exception -> 0x0796, OutOfMemoryError -> 0x0826, all -> 0x082d, TryCatch #4 {all -> 0x082d, blocks: (B:294:0x0484, B:298:0x0491, B:300:0x0497, B:437:0x04f1, B:439:0x04f7, B:442:0x051e, B:443:0x0522, B:316:0x05df, B:318:0x05e3, B:320:0x0612, B:321:0x061b, B:323:0x0621, B:324:0x0628, B:327:0x063a, B:330:0x0674, B:333:0x0690, B:336:0x06a3, B:338:0x06ad, B:340:0x06b7, B:342:0x06c1, B:344:0x06cb, B:355:0x06de, B:357:0x06ea, B:359:0x06f4, B:360:0x0705, B:362:0x070f, B:363:0x0720, B:365:0x072a, B:366:0x073b, B:368:0x0745, B:370:0x0759, B:373:0x0786, B:374:0x078a, B:377:0x0775, B:380:0x07a1, B:383:0x07cb, B:399:0x07d9, B:401:0x07e9, B:393:0x07fb, B:412:0x0669, B:415:0x054d, B:417:0x0557, B:419:0x0580, B:420:0x0586, B:422:0x0590, B:423:0x0599, B:425:0x059f, B:426:0x05a6, B:428:0x05af, B:431:0x05b6, B:433:0x05c6, B:435:0x05d6), top: B:293:0x0484 }] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0745 A[Catch: Exception -> 0x0796, OutOfMemoryError -> 0x0826, all -> 0x082d, TryCatch #4 {all -> 0x082d, blocks: (B:294:0x0484, B:298:0x0491, B:300:0x0497, B:437:0x04f1, B:439:0x04f7, B:442:0x051e, B:443:0x0522, B:316:0x05df, B:318:0x05e3, B:320:0x0612, B:321:0x061b, B:323:0x0621, B:324:0x0628, B:327:0x063a, B:330:0x0674, B:333:0x0690, B:336:0x06a3, B:338:0x06ad, B:340:0x06b7, B:342:0x06c1, B:344:0x06cb, B:355:0x06de, B:357:0x06ea, B:359:0x06f4, B:360:0x0705, B:362:0x070f, B:363:0x0720, B:365:0x072a, B:366:0x073b, B:368:0x0745, B:370:0x0759, B:373:0x0786, B:374:0x078a, B:377:0x0775, B:380:0x07a1, B:383:0x07cb, B:399:0x07d9, B:401:0x07e9, B:393:0x07fb, B:412:0x0669, B:415:0x054d, B:417:0x0557, B:419:0x0580, B:420:0x0586, B:422:0x0590, B:423:0x0599, B:425:0x059f, B:426:0x05a6, B:428:0x05af, B:431:0x05b6, B:433:0x05c6, B:435:0x05d6), top: B:293:0x0484 }] */
    /* JADX WARN: Removed duplicated region for block: B:380:0x07a1 A[Catch: OutOfMemoryError -> 0x0826, all -> 0x082d, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x082d, blocks: (B:294:0x0484, B:298:0x0491, B:300:0x0497, B:437:0x04f1, B:439:0x04f7, B:442:0x051e, B:443:0x0522, B:316:0x05df, B:318:0x05e3, B:320:0x0612, B:321:0x061b, B:323:0x0621, B:324:0x0628, B:327:0x063a, B:330:0x0674, B:333:0x0690, B:336:0x06a3, B:338:0x06ad, B:340:0x06b7, B:342:0x06c1, B:344:0x06cb, B:355:0x06de, B:357:0x06ea, B:359:0x06f4, B:360:0x0705, B:362:0x070f, B:363:0x0720, B:365:0x072a, B:366:0x073b, B:368:0x0745, B:370:0x0759, B:373:0x0786, B:374:0x078a, B:377:0x0775, B:380:0x07a1, B:383:0x07cb, B:399:0x07d9, B:401:0x07e9, B:393:0x07fb, B:412:0x0669, B:415:0x054d, B:417:0x0557, B:419:0x0580, B:420:0x0586, B:422:0x0590, B:423:0x0599, B:425:0x059f, B:426:0x05a6, B:428:0x05af, B:431:0x05b6, B:433:0x05c6, B:435:0x05d6), top: B:293:0x0484 }] */
    /* JADX WARN: Removed duplicated region for block: B:383:0x07cb A[Catch: OutOfMemoryError -> 0x0826, all -> 0x082d, TRY_ENTER, TryCatch #4 {all -> 0x082d, blocks: (B:294:0x0484, B:298:0x0491, B:300:0x0497, B:437:0x04f1, B:439:0x04f7, B:442:0x051e, B:443:0x0522, B:316:0x05df, B:318:0x05e3, B:320:0x0612, B:321:0x061b, B:323:0x0621, B:324:0x0628, B:327:0x063a, B:330:0x0674, B:333:0x0690, B:336:0x06a3, B:338:0x06ad, B:340:0x06b7, B:342:0x06c1, B:344:0x06cb, B:355:0x06de, B:357:0x06ea, B:359:0x06f4, B:360:0x0705, B:362:0x070f, B:363:0x0720, B:365:0x072a, B:366:0x073b, B:368:0x0745, B:370:0x0759, B:373:0x0786, B:374:0x078a, B:377:0x0775, B:380:0x07a1, B:383:0x07cb, B:399:0x07d9, B:401:0x07e9, B:393:0x07fb, B:412:0x0669, B:415:0x054d, B:417:0x0557, B:419:0x0580, B:420:0x0586, B:422:0x0590, B:423:0x0599, B:425:0x059f, B:426:0x05a6, B:428:0x05af, B:431:0x05b6, B:433:0x05c6, B:435:0x05d6), top: B:293:0x0484 }] */
    /* JADX WARN: Removed duplicated region for block: B:391:0x07fa  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x07d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:407:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x065c A[Catch: OutOfMemoryError -> 0x083b, all -> 0x083d, TRY_ENTER, TryCatch #11 {all -> 0x083d, blocks: (B:306:0x04aa, B:308:0x0530, B:331:0x068a, B:334:0x0699, B:348:0x0813, B:378:0x0796, B:381:0x07a8, B:387:0x07d1, B:397:0x0810, B:410:0x065c), top: B:305:0x04aa }] */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0557 A[Catch: OutOfMemoryError -> 0x0826, all -> 0x082d, TryCatch #4 {all -> 0x082d, blocks: (B:294:0x0484, B:298:0x0491, B:300:0x0497, B:437:0x04f1, B:439:0x04f7, B:442:0x051e, B:443:0x0522, B:316:0x05df, B:318:0x05e3, B:320:0x0612, B:321:0x061b, B:323:0x0621, B:324:0x0628, B:327:0x063a, B:330:0x0674, B:333:0x0690, B:336:0x06a3, B:338:0x06ad, B:340:0x06b7, B:342:0x06c1, B:344:0x06cb, B:355:0x06de, B:357:0x06ea, B:359:0x06f4, B:360:0x0705, B:362:0x070f, B:363:0x0720, B:365:0x072a, B:366:0x073b, B:368:0x0745, B:370:0x0759, B:373:0x0786, B:374:0x078a, B:377:0x0775, B:380:0x07a1, B:383:0x07cb, B:399:0x07d9, B:401:0x07e9, B:393:0x07fb, B:412:0x0669, B:415:0x054d, B:417:0x0557, B:419:0x0580, B:420:0x0586, B:422:0x0590, B:423:0x0599, B:425:0x059f, B:426:0x05a6, B:428:0x05af, B:431:0x05b6, B:433:0x05c6, B:435:0x05d6), top: B:293:0x0484 }] */
    /* JADX WARN: Removed duplicated region for block: B:436:0x04f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:494:0x008a A[Catch: all -> 0x008d, TRY_LEAVE, TryCatch #51 {all -> 0x008d, blocks: (B:16:0x0083, B:494:0x008a), top: B:15:0x0083 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x087e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019d A[Catch: all -> 0x01b7, OutOfMemoryError -> 0x01ba, TRY_ENTER, TryCatch #9 {all -> 0x01b7, blocks: (B:476:0x0166, B:82:0x019d, B:84:0x01a3), top: B:475:0x0166 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f6  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized long LIZ(X.QLP r52, X.QLP r53, org.json.JSONObject r54, boolean r55, long[] r56, java.lang.String[] r57, java.util.List<X.QJ5> r58, boolean r59, org.json.JSONObject r60) {
        /*
            Method dump skipped, instructions count: 2217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QL6.LIZ(X.QLP, X.QLP, org.json.JSONObject, boolean, long[], java.lang.String[], java.util.List, boolean, org.json.JSONObject):long");
    }
}

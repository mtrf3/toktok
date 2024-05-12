package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.QHq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66750QHq extends QI2 {
    public static final SimpleDateFormat LLILLL;
    public byte[] LL;
    public int LLD;
    public int LLF;
    public JSONArray LLFF;
    public long LLFFF;
    public JSONArray LLFII;
    public long LLFZ;
    public QIH LLI;
    public JSONArray LLIFFJFJJ;
    public QIM LLII;
    public JSONArray LLIIII;
    public JSONObject LLIIIILZ;
    public JSONArray LLIIIJ;
    public long LLIIIL;
    public JSONArray LLIIIZ;
    public String LLIIJI;
    public String LLIIJLIL;
    public String LLIIL;
    public String LLIILII;
    public int LLIILZL;
    public String LLIIZ;
    public QHC LLIL;
    public int LLILII;
    public String LLILIL;
    public String LLILL;
    public String LLILLIZIL;
    public int LLILLJJLI;

    @Override // X.QI2
    public final String LJIIIZ() {
        return "pack";
    }

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Z"));
        LLILLL = simpleDateFormat;
    }

    @Override // X.QI2
    public final List<String> LJFF() {
        return Arrays.asList("_id", "integer primary key autoincrement", "local_time_ms", "integer", "_data", "blob", "session_id", "varchar", "_fail", "integer", "event_count", "varchar", "key", "varchar", "iv", "varchar", "data_json", "text", "_app_id", "varchar", "encode_type", "integer", "encode_headers", "varchar", "priority", "integer", "forward", "integer", "e_ids", "varchar", "isolate_key", "varchar", "isolate_key_value", "varchar");
    }

    @Override // X.QI2
    public final String LJII() {
        return String.valueOf(this.LJLIL);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0137 A[LOOP:1: B:47:0x012f->B:49:0x0137, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d2  */
    @Override // X.QI2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject LJIILLIIL() {
        /*
            Method dump skipped, instructions count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66750QHq.LJIILLIIL():org.json.JSONObject");
    }

    public final java.util.Set<String> LJIJ() {
        HashSet hashSet = new HashSet();
        if (TextUtils.isEmpty(this.LLILIL)) {
            return hashSet;
        }
        hashSet.addAll(Arrays.asList(this.LLILIL.split(",")));
        return hashSet;
    }

    public final C66750QHq LJIJI() {
        C66750QHq c66750QHq = new C66750QHq();
        c66750QHq.LJIJJLI(this.LJLLJ, this.LLIIIILZ, null, null, null, new JSONArray[]{new JSONArray(), null, null}, new long[]{this.LLFFF, this.LLFZ, this.LLIIIL}, null, this.LLIL, this.LLILLJJLI);
        c66750QHq.LJLJJI = this.LJLJJI;
        c66750QHq.LLILL = this.LLILL;
        c66750QHq.LLILLIZIL = this.LLILLIZIL;
        return c66750QHq;
    }

    public final byte[] LJIL() {
        try {
            String jSONObject = LJIILIIL().toString();
            jSONObject.getClass();
            return LJJ(jSONObject);
        } catch (OutOfMemoryError unused) {
            QI3 LIZ = C66745QHl.LIZ(this.LJLLJ);
            if (LIZ != null) {
                LIZ.LIZLLL.LJ(QIQ.pack, QIK.f_to_bytes);
            }
            LJIJJ(QIQ.f_to_bytes_event);
            return null;
        }
    }

    @Override // X.QI2
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pack:{id=");
        LIZ.append(this.LJLIL);
        LIZ.append(", ts=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", sid:");
        LIZ.append(this.LJLJJI);
        LIZ.append(", isolate:");
        LIZ.append(this.LLILL);
        LIZ.append("->");
        return JBR.LJFF(LIZ, this.LLILLIZIL, "}", LIZ);
    }

    @Override // X.QI2
    public final void LJIIJ(Cursor cursor) {
        this.LJLIL = cursor.getLong(0);
        this.LJLILLLLZI = cursor.getLong(1);
        this.LL = cursor.getBlob(2);
        this.LJLJJI = cursor.getString(3);
        this.LLD = cursor.getInt(4);
        this.LLIIJI = cursor.getString(5);
        this.LLIIJLIL = cursor.getString(6);
        this.LLIIL = cursor.getString(7);
        this.LLIILII = cursor.getString(8);
        this.LJLLJ = cursor.getString(9);
        this.LLIILZL = cursor.getInt(10);
        this.LLIIZ = cursor.getString(11);
        this.LJLLLL = cursor.getInt(12);
        this.LJLLLLLL = cursor.getInt(13);
        this.LLILIL = cursor.getString(14);
        this.LLILL = cursor.getString(15);
        this.LLILLIZIL = cursor.getString(16);
        this.LLIIIILZ = null;
        this.LLI = null;
        this.LLII = null;
        this.LLIFFJFJJ = null;
        this.LLFF = null;
        this.LLFII = null;
        this.LLIIIJ = null;
        this.LLIIIZ = null;
    }

    @Override // X.QI2
    public final QI2 LJIIJJI(JSONObject jSONObject) {
        LJIIIIZZ().LIZLLL(4, this.LJZ, "read ipc not implemented", new Object[0]);
        return null;
    }

    @Override // X.QI2
    public final void LJIILJJIL(ContentValues contentValues) {
        try {
            contentValues.put("local_time_ms", Long.valueOf(this.LJLILLLLZI));
            contentValues.put("_data", LJIL());
            contentValues.put("session_id", this.LJLJJI);
            contentValues.put("event_count", this.LLIIJI);
            contentValues.put("key", this.LLIIJLIL);
            contentValues.put("iv", this.LLIIL);
            contentValues.put("encode_type", Integer.valueOf(this.LLIILZL));
            contentValues.put("encode_headers", this.LLIIZ);
            contentValues.put("data_json", this.LLIILII);
            contentValues.put("_app_id", this.LJLLJ);
            contentValues.put("priority", Integer.valueOf(this.LJLLLL));
            contentValues.put("forward", Integer.valueOf(this.LJLLLLLL));
            contentValues.put("e_ids", this.LLILIL);
            contentValues.put("isolate_key", this.LLILL);
            contentValues.put("isolate_key_value", this.LLILLIZIL);
        } catch (Throwable th) {
            LJIIIIZZ().LIZJ(5, "write pack to db failed", th, new Object[0]);
        }
    }

    @Override // X.QI2
    public final void LJIILL(JSONObject jSONObject) {
        LJIIIIZZ().LIZLLL(4, this.LJZ, "write ipc not implemented", new Object[0]);
    }

    public final void LJIJJ(QIQ qiq) {
        QI3 LIZ = C66745QHl.LIZ(this.LJLLJ);
        if (LIZ == null) {
            return;
        }
        LIZ.LIZLLL.LJIIIIZZ(qiq, QIB.LIZ(this));
        if (this.LLI != null) {
            LIZ.LIZLLL.LJIIIIZZ(qiq, "launch");
        }
        if (this.LLII != null) {
            LIZ.LIZLLL.LJIIIIZZ(qiq, "terminate");
        }
        if (this.LLFF != null) {
            for (int i = 0; i < this.LLFF.length(); i++) {
                JSONObject optJSONObject = this.LLFF.optJSONObject(i);
                if (optJSONObject != null) {
                    LIZ.LIZLLL.LJIIIIZZ(qiq, optJSONObject.optString("tag", ""));
                }
            }
        }
        if (this.LLIIIJ != null) {
            for (int i2 = 0; i2 < this.LLIIIJ.length(); i2++) {
                JSONObject optJSONObject2 = this.LLIIIJ.optJSONObject(i2);
                if (optJSONObject2 != null) {
                    LIZ.LIZLLL.LJIIIIZZ(qiq, optJSONObject2.optString("log_type", ""));
                }
            }
        }
        if (this.LLFII != null) {
            for (int i3 = 0; i3 < this.LLFII.length(); i3++) {
                JSONObject optJSONObject3 = this.LLFII.optJSONObject(i3);
                if (optJSONObject3 != null) {
                    LIZ.LIZLLL.LJIIIIZZ(qiq, optJSONObject3.optString("event", ""));
                }
            }
        }
    }

    public final byte[] LJJ(String str) {
        QI3 LIZ;
        this.LL = null;
        if (!TextUtils.isEmpty(str) && C66745QHl.LIZJ(this.LJLLJ) && (LIZ = C66745QHl.LIZ(this.LJLLJ)) != null) {
            try {
                byte[] bytes = str.getBytes("UTF-8");
                this.LL = bytes;
                if (bytes != null && bytes.length > 0 && LIZ.LJIJI) {
                    if (LIZ.LJJIJIIJIL != null) {
                        try {
                            QHK LIZ2 = LIZ.LJJIJIIJIL.LIZ(this.LL);
                            this.LL = LIZ2.LIZ;
                            this.LLIILZL = LIZ2.LIZIZ;
                            this.LLIIZ = C66735QHb.LJI(LIZ2.LIZJ);
                        } catch (Throwable th) {
                            LIZ.LIZLLL.LJ(QIQ.pack, QIK.f_to_bytes_compress);
                            LJIIIIZZ().LJIIJ(4, this.LJZ, "log compress toBytes failed", th, new Object[0]);
                            this.LL = QDS.LIZLLL(this.LL);
                            this.LLIILZL = 0;
                            this.LLIIZ = C66735QHb.LJI(Collections.singletonMap("log-encode-type", "gzip"));
                        }
                    } else {
                        this.LL = QDS.LIZLLL(this.LL);
                        this.LLIILZL = 0;
                        this.LLIIZ = C66735QHb.LJI(Collections.singletonMap("log-encode-type", "gzip"));
                    }
                    this.LL = LIZ.LJFF.LIZJ.LIZIZ(this.LL);
                }
            } catch (Throwable th2) {
                LIZ.LIZLLL.LJ(QIQ.pack, QIK.f_to_bytes);
                LJIIIIZZ().LJIIJ(4, this.LJZ, "toBytes failed", th2, new Object[0]);
            }
            byte[] bArr = this.LL;
            if (bArr == null || bArr.length == 0) {
                LIZ.LIZLLL.LJ(QIQ.pack, QIK.f_to_bytes);
            }
        }
        return this.LL;
    }

    public final C66750QHq LJIIZILJ(EnumC66752QHs enumC66752QHs, String str) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        C66750QHq c66750QHq = new C66750QHq();
        String str2 = this.LJLLJ;
        JSONObject jSONObject = this.LLIIIILZ;
        JSONArray jSONArray4 = null;
        if (QB0.LIZ(this.LLIFFJFJJ)) {
            jSONArray = null;
        } else {
            jSONArray = new JSONArray();
        }
        JSONArray[] jSONArrayArr = new JSONArray[3];
        if (QB0.LIZ(this.LLFF)) {
            jSONArray2 = null;
        } else {
            jSONArray2 = new JSONArray();
        }
        jSONArrayArr[0] = jSONArray2;
        if (QB0.LIZ(this.LLFII)) {
            jSONArray3 = null;
        } else {
            jSONArray3 = new JSONArray();
        }
        jSONArrayArr[1] = jSONArray3;
        if (!QB0.LIZ(this.LLIIIJ)) {
            jSONArray4 = new JSONArray();
        }
        jSONArrayArr[2] = jSONArray4;
        c66750QHq.LJIJJLI(str2, jSONObject, null, null, jSONArray, jSONArrayArr, new long[]{this.LLFFF, this.LLFZ, this.LLIIIL}, this.LLIIIZ, this.LLIL, this.LLILLJJLI);
        c66750QHq.LJLJJI = this.LJLJJI;
        c66750QHq.LLILL = enumC66752QHs.getKey();
        c66750QHq.LLILLIZIL = str;
        return c66750QHq;
    }

    public final void LJIJJLI(String str, JSONObject jSONObject, QIH qih, QIM qim, JSONArray jSONArray, JSONArray[] jSONArrayArr, long[] jArr, JSONArray jSONArray2, QHC qhc, int i) {
        LJIIL(0L);
        this.LLIIIILZ = jSONObject;
        this.LLI = qih;
        this.LLII = qim;
        this.LLIFFJFJJ = jSONArray;
        this.LLFF = jSONArrayArr[0];
        this.LLFFF = jArr[0];
        this.LLFII = jSONArrayArr[1];
        this.LLFZ = jArr[1];
        this.LLIIIJ = jSONArrayArr[2];
        this.LLIIIL = jArr[2];
        this.LLIIIZ = jSONArray2;
        this.LLIL = qhc;
        if (qhc != null) {
            this.LLILII = qhc.LIZJ;
            this.LJLLLL = qhc.LIZ;
            if (!TextUtils.isEmpty(qhc.LIZ())) {
                this.LJLLLLLL = 1;
            }
        } else {
            this.LLILII = 0;
            this.LJLLLL = -1;
        }
        this.LLILLJJLI = i;
        this.LJLLJ = str;
    }
}

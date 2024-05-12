package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.b1;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public abstract class QI2 implements Cloneable {
    public static final SimpleDateFormat LJZI = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
    public static final QIW LJZL = new QIW();
    public long LJLIL;
    public long LJLILLLLZI;
    public long LJLJI;
    public String LJLJJI;
    public long LJLJJL;
    public long LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public String LJLLJ;
    public String LJLLL;
    public int LJLLLL = -1;
    public int LJLLLLLL;
    public String LJLZ;
    public final List<String> LJZ;

    public static QI2[] LJ() {
        return new QI2[]{new QIA(), new QIC(null, null, null), new QIG(null, "", new JSONObject())};
    }

    public String LJI() {
        return null;
    }

    public abstract String LJIIIZ();

    public abstract JSONObject LJIILLIIL();

    public List<String> LJFF() {
        return Arrays.asList("_id", "integer primary key autoincrement", "local_time_ms", "integer", "tea_event_index", "integer", "nt", "integer", "user_id", "integer", "uid", "integer", "session_id", "varchar", "user_unique_id", "varchar", "ab_sdk_version", "varchar", "user_type", "integer", "user_is_login", "integer", "user_is_auth", "integer", "_app_id", "varchar", "priority", "integer", "forward", "integer", "_local_event_id", "varchar");
    }

    public final InterfaceC66740QHg LJIIIIZZ() {
        InterfaceC66740QHg interfaceC66740QHg = (InterfaceC66740QHg) ((ConcurrentHashMap) AbstractC68877R1l.LIZJ).get(this.LJLLJ);
        if (interfaceC66740QHg != null) {
            return interfaceC66740QHg;
        }
        return QIX.LJIJJ();
    }

    public final JSONObject LJIILIIL() {
        JSONObject jSONObject = new JSONObject();
        try {
            this.LJLLL = LJZI.format(new Date(this.LJLILLLLZI));
            jSONObject = LJIILLIIL();
            return jSONObject;
        } catch (Throwable th) {
            QI3 LIZ = C66745QHl.LIZ(this.LJLLJ);
            if (LIZ != null) {
                LIZ.LIZLLL.LJFF(this, QIK.f_to_pack);
                LIZ.LIZLLL.LJIIIIZZ(QIQ.f_to_pack_event, QIB.LIZ(this));
            }
            LJIIIIZZ().LJIIJ(4, this.LJZ, "toPackJson failed", th, new Object[0]);
            return jSONObject;
        }
    }

    public QI2() {
        LJIIL(0L);
        this.LJZ = Collections.singletonList(LJIIIZ());
        if (!(!QI0.LIZ.booleanValue())) {
            this.LJLZ = C66735QHb.LJFF();
        }
    }

    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final QI2 clone() {
        try {
            QI2 qi2 = (QI2) super.clone();
            qi2.LJLZ = C66735QHb.LJFF();
            return qi2;
        } catch (Throwable th) {
            LJIIIIZZ().LJIIJ(4, this.LJZ, "Clone data failed", th, new Object[0]);
            return null;
        }
    }

    public final String LIZIZ() {
        List<String> LJFF = LJFF();
        if (LJFF != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("create table if not exists ");
            sb.append(LJIIIZ());
            sb.append("(");
            for (int i = 0; i < LJFF.size(); i = C0EH.LIZIZ(sb, (String) ListProtector.get(LJFF, i + 1), ",", i, 2)) {
                sb.append((String) ListProtector.get(LJFF, i));
                sb.append(" ");
            }
            sb.delete(sb.length() - 1, sb.length());
            sb.append(")");
            return sb.toString();
        }
        return null;
    }

    public String LJII() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sid:");
        LIZ.append(this.LJLJJI);
        return X1D.LIZIZ(LIZ);
    }

    public String toString() {
        String LJIIIZ = LJIIIZ();
        if (!C16880lQ.LJLLJ(getClass()).equalsIgnoreCase(LJIIIZ)) {
            StringBuilder LIZJ = b1.LIZJ(LJIIIZ, ", ");
            LIZJ.append(C16880lQ.LJLLJ(getClass()));
            LJIIIZ = X1D.LIZIZ(LIZJ);
        }
        String str = this.LJLJJI;
        String str2 = "-";
        if (str != null) {
            int indexOf = str.indexOf("-");
            if (indexOf >= 0) {
                str = str.substring(0, indexOf);
            }
            str2 = str;
        }
        StringBuilder LIZIZ = C25620zW.LIZIZ("{", LJIIIZ, ", ");
        LIZIZ.append(LJII());
        LIZIZ.append(", ");
        LIZIZ.append(str2);
        LIZIZ.append(", ");
        return C0H1.LIZJ(LIZIZ, this.LJLILLLLZI, "}", LIZIZ);
    }

    public static QI2 LIZLLL(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            QI2 qi2 = LJZL.LIZIZ(new Object[0]).get(jSONObject.optString("k_cls", ""));
            if (qi2 == null) {
                QIX.LJIJJ().LJ("from ipc class not recognized", 4, new Object[0]);
                return null;
            }
            return qi2.clone().LJIIJJI(jSONObject);
        } catch (Throwable th) {
            QIX.LJIJJ().LIZJ(4, "from ipc failed", th, new Object[0]);
            return null;
        }
    }

    public final void LIZJ(JSONObject jSONObject) {
        C66745QHl.LIZ(this.LJLLJ);
        long j = this.LJLJJL;
        if (j > 0) {
            jSONObject.put("user_id", j);
        }
        long j2 = this.LJLJJLL;
        if (j2 > 0) {
            jSONObject.put("uid", j2);
        }
        int i = this.LJLL;
        if (i > 0) {
            jSONObject.put("user_type", i);
        }
        int i2 = this.LJLLI;
        if (i2 > 0) {
            jSONObject.put("user_is_login", i2);
        }
        int i3 = this.LJLLILLLL;
        if (i3 > 0) {
            jSONObject.put("user_is_auth", i3);
        }
    }

    public void LJIIJ(Cursor cursor) {
        this.LJLIL = cursor.getLong(0);
        this.LJLILLLLZI = cursor.getLong(1);
        this.LJLJI = cursor.getLong(2);
        this.LJLJLLL = cursor.getInt(3);
        this.LJLJJL = cursor.getLong(4);
        this.LJLJJLL = cursor.getLong(5);
        this.LJLJJI = cursor.getString(6);
        this.LJLJL = cursor.getString(7);
        this.LJLJLJ = cursor.getString(8);
        this.LJLL = cursor.getInt(9);
        this.LJLLI = cursor.getInt(10);
        this.LJLLILLLL = cursor.getInt(11);
        this.LJLLJ = cursor.getString(12);
        this.LJLLLL = cursor.getInt(13);
        this.LJLLLLLL = cursor.getInt(14);
        this.LJLZ = cursor.getString(15);
    }

    public QI2 LJIIJJI(JSONObject jSONObject) {
        this.LJLILLLLZI = jSONObject.optLong("local_time_ms", 0L);
        this.LJLIL = 0L;
        this.LJLJI = 0L;
        this.LJLJLLL = 0;
        this.LJLJJL = 0L;
        this.LJLJJLL = 0L;
        this.LJLJJI = null;
        this.LJLJL = null;
        this.LJLJLJ = null;
        this.LJLL = 0;
        this.LJLLI = 0;
        this.LJLLILLLL = 0;
        this.LJLLJ = jSONObject.optString("_app_id");
        this.LJLLLL = jSONObject.optInt("priority", -1);
        this.LJLLLLLL = jSONObject.optInt("forward");
        this.LJLZ = jSONObject.optString("_local_event_id", C66735QHb.LJFF());
        return this;
    }

    public final void LJIIL(long j) {
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        this.LJLILLLLZI = j;
    }

    public void LJIILJJIL(ContentValues contentValues) {
        contentValues.put("local_time_ms", Long.valueOf(this.LJLILLLLZI));
        contentValues.put("tea_event_index", Long.valueOf(this.LJLJI));
        contentValues.put("nt", Integer.valueOf(this.LJLJLLL));
        contentValues.put("user_id", Long.valueOf(this.LJLJJL));
        contentValues.put("uid", Long.valueOf(this.LJLJJLL));
        contentValues.put("session_id", this.LJLJJI);
        contentValues.put("user_unique_id", this.LJLJL);
        contentValues.put("ab_sdk_version", this.LJLJLJ);
        contentValues.put("user_type", Integer.valueOf(this.LJLL));
        contentValues.put("user_is_login", Integer.valueOf(this.LJLLI));
        contentValues.put("user_is_auth", Integer.valueOf(this.LJLLILLLL));
        contentValues.put("_app_id", this.LJLLJ);
        contentValues.put("priority", Integer.valueOf(this.LJLLLL));
        contentValues.put("forward", Integer.valueOf(this.LJLLLLLL));
        contentValues.put("_local_event_id", this.LJLZ);
    }

    public void LJIILL(JSONObject jSONObject) {
        jSONObject.put("local_time_ms", this.LJLILLLLZI);
        jSONObject.put("_app_id", this.LJLLJ);
        jSONObject.put("priority", this.LJLLLL);
        jSONObject.put("forward", this.LJLLLLLL);
        jSONObject.put("_local_event_id", this.LJLZ);
    }
}

package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.FtZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40413FtZ {
    public static EOT LJIIJ;
    public final Keva LIZ;
    public final String LIZIZ;
    public long LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public String LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public final String LJIIIZ;

    public final long LIZ() {
        long j = this.LJIIIIZZ;
        if (j != 0) {
            return j;
        }
        Keva keva = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        String LJFF = JBR.LJFF(LIZ, this.LIZIZ, "key_today_play_time", LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LJIIIZ);
        LIZ2.append("__0");
        String string = keva.getString(LJFF, X1D.LIZIZ(LIZ2));
        o.LJIIIIZZ(string, "keva.getString(keyPrefix…_time\", \"${today}__${0}\")");
        List LJLJJL = s.LJLJJL(string, new String[]{"__"}, 0, 6);
        if (!o.LJ(ListProtector.get(LJLJJL, 0), this.LJIIIZ)) {
            Keva keva2 = this.LIZ;
            StringBuilder LIZ3 = X1D.LIZ();
            String LJFF2 = JBR.LJFF(LIZ3, this.LIZIZ, "key_today_play_time", LIZ3);
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(this.LJIIIZ);
            LIZ4.append("__0");
            keva2.storeString(LJFF2, X1D.LIZIZ(LIZ4));
            this.LJIIIIZZ = 0L;
            return 0L;
        }
        long parseLong = CastLongProtector.parseLong((String) ListProtector.get(LJLJJL, 1));
        this.LJIIIIZZ = parseLong;
        return parseLong;
    }

    public C40413FtZ(EnumC40416Ftc dialogType) {
        o.LJIIIZ(dialogType, "dialogType");
        Keva repo = Keva.getRepo("praise_keva");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        this.LIZ = repo;
        String str = dialogType.toString();
        this.LIZIZ = str;
        this.LJFF = "";
        this.LJIIIZ = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
        LIZIZ(repo.getLong("key_app_first_open_time", 0L));
        StringBuilder LIZ = X1D.LIZ();
        long j = repo.getLong(JBR.LJFF(LIZ, str, "key_last_dialog_show_time", LIZ), 0L);
        this.LIZJ = j;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append("key_last_dialog_show_time");
        repo.storeLong(X1D.LIZIZ(LIZ2), j);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(str);
        LIZ3.append("key_is_clicked_feedback");
        boolean z = repo.getBoolean(X1D.LIZIZ(LIZ3), false);
        this.LIZLLL = z;
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(str);
        LIZ4.append("key_is_clicked_feedback");
        repo.storeBoolean(X1D.LIZIZ(LIZ4), z);
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append(str);
        LIZ5.append("key_is_clicked_submit");
        boolean z2 = repo.getBoolean(X1D.LIZIZ(LIZ5), false);
        this.LJ = z2;
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append(str);
        LIZ6.append("key_is_clicked_submit");
        repo.storeBoolean(X1D.LIZIZ(LIZ6), z2);
        StringBuilder LIZ7 = X1D.LIZ();
        LIZ7.append(str);
        LIZ7.append("key_last_show_version");
        String string = repo.getString(X1D.LIZIZ(LIZ7), "");
        o.LJIIIIZZ(string, "keva.getString(keyPrefix…EY_LAST_SHOW_VERSION, \"\")");
        LIZJ(string);
        StringBuilder LIZ8 = X1D.LIZ();
        long j2 = repo.getLong(JBR.LJFF(LIZ8, str, "key_last_try_show_time", LIZ8), 0L);
        this.LJII = j2;
        StringBuilder LIZ9 = X1D.LIZ();
        LIZ9.append(str);
        LIZ9.append("key_last_try_show_time");
        repo.storeLong(X1D.LIZIZ(LIZ9), j2);
        StringBuilder LIZ10 = X1D.LIZ();
        long j3 = repo.getLong(JBR.LJFF(LIZ10, str, "key_last_2_try_show_time", LIZ10), 0L);
        StringBuilder LIZ11 = X1D.LIZ();
        LIZ11.append(str);
        LIZ11.append("key_last_2_try_show_time");
        repo.storeLong(X1D.LIZIZ(LIZ11), j3);
        repo.storeBoolean("key_debug_open", repo.getBoolean("key_debug_open", false));
    }

    public final void LIZIZ(long j) {
        if (this.LJI == 0) {
            this.LJI = j;
            this.LIZ.storeLong("key_app_first_open_time", j);
        }
    }

    public final void LIZJ(String value) {
        o.LJIIIZ(value, "value");
        this.LJFF = value;
        Keva keva = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZIZ);
        LIZ.append("key_last_show_version");
        keva.storeString(X1D.LIZIZ(LIZ), value);
    }
}

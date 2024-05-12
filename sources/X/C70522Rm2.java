package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.services.BaseUserService;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.Rm2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70522Rm2 {
    public static final C70522Rm2 LIZ = new C70522Rm2();
    public static final String LIZIZ;
    public static final String LIZJ;
    public static final String LIZLLL;

    public final synchronized int LIZ() {
        Keva keva;
        String todayString = new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(new Date());
        keva = C66822jm.LIZ;
        String str = LIZJ;
        if (!keva.getString(str, "").equals(todayString)) {
            C79057V0z.LJJJJIZL(0, keva, LIZIZ);
            C79057V0z.LJJJJIZL(0, keva, LIZLLL);
            o.LJIIIIZZ(todayString, "todayString");
            C79057V0z.LJJJJJ(keva, str, todayString);
        }
        return C79057V0z.LJIL(keva, LIZIZ);
    }

    public final synchronized int LIZIZ() {
        Keva keva;
        String todayString = new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(new Date());
        keva = C66822jm.LIZ;
        String str = LIZJ;
        if (!keva.getString(str, "").equals(todayString)) {
            C79057V0z.LJJJJIZL(0, keva, LIZIZ);
            C79057V0z.LJJJJIZL(0, keva, LIZLLL);
            o.LJIIIIZZ(todayString, "todayString");
            C79057V0z.LJJJJJ(keva, str, todayString);
        }
        return C79057V0z.LJIL(keva, LIZLLL);
    }

    static {
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("addon_recom_close_count");
        LIZ2.append(createIUserServicebyMonsterPlugin.getCurrentUserID());
        LIZIZ = X1D.LIZIZ(LIZ2);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("addon_recom_no_click_count");
        LIZ3.append(createIUserServicebyMonsterPlugin.getCurrentUserID());
        LIZLLL = X1D.LIZIZ(LIZ3);
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("addon_recom_count_date");
        LIZ4.append(createIUserServicebyMonsterPlugin.getCurrentUserID());
        LIZJ = X1D.LIZIZ(LIZ4);
    }

    public final synchronized void LIZJ(int i, int i2) {
        String todayString = new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(new Date());
        Keva keva = C66822jm.LIZ;
        String str = LIZJ;
        if (keva.getString(str, "").equals(todayString)) {
            String str2 = LIZIZ;
            C79057V0z.LJJJJIZL(C79057V0z.LJIL(keva, str2) + i, keva, str2);
            String str3 = LIZLLL;
            C79057V0z.LJJJJIZL(C79057V0z.LJIL(keva, str3) + i2, keva, str3);
        } else {
            C79057V0z.LJJJJIZL(i, keva, LIZIZ);
            C79057V0z.LJJJJIZL(i2, keva, LIZLLL);
            o.LJIIIIZZ(todayString, "todayString");
            C79057V0z.LJJJJJ(keva, str, todayString);
        }
    }
}

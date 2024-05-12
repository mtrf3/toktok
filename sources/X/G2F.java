package X;

import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.ss.android.ugc.aweme.AccountService;
import java.util.List;

/* loaded from: classes7.dex */
public final class G2F {
    public static final java.util.Set<String> LIZ = C77275UUl.LJIIIIZZ("US", "IN", "ID", "BR", "NG");
    public static final String LIZIZ = AccountService.LJIJ().LJIILL();
    public static final List<Long> LIZJ = C47261Igj.LJJIJIIJI(2500L, 5000L, 10000L, Long.valueOf(LivePlayEnforceIntervalSetting.DEFAULT));
    public static final java.util.Set<Integer> LIZLLL = C77275UUl.LJIIIIZZ(1, 2);
    public static final int LJ = 2;

    public static void LIZIZ(String str) {
        if (LIZ.contains(LIZIZ)) {
            LIZ(LJ, str);
        }
    }

    public static void LIZ(int i, String str) {
        if (LIZLLL.contains(Integer.valueOf(i))) {
            FMX.LJIIL(str, C78920UyC.LIZJ(i, "exp_group_num").LIZ);
        }
    }
}

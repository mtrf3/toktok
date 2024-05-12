package X;

import android.app.Activity;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.agilelogger.ALog;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7zx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C204257zx {
    public static final int LIZ = C04330Ez.LIZIZ(EF7.LIZIZ(), R.color.c_);

    public static C57208Mcm LIZIZ() {
        C57208Mcm c57208Mcm = new C57208Mcm(0, 0, 0, 44, 10, 15, 0);
        if (C8D3.LIZJ()) {
            c57208Mcm = new C57208Mcm(0, 0, 0, 40, 6, 15, 0);
        }
        if (C202677xP.LIZIZ()) {
            c57208Mcm = new C57208Mcm(8, 14, 9, 40, 0, 4, 0);
            if (C8D3.LIZJ()) {
                c57208Mcm = C57208Mcm.L(c57208Mcm, 8, 8, 0, 60);
            }
        }
        if (C202677xP.LIZIZ()) {
            if (C8D3.LIZJ()) {
                return C57208Mcm.L(c57208Mcm, 0, 0, 8, 55);
            }
            C8D3.LIZJ();
            return C57208Mcm.L(c57208Mcm, 10, 12, 0, 60);
        }
        return c57208Mcm;
    }

    public static int LIZ() {
        if (LJFF()) {
            return 0;
        }
        if (C8D3.LIZJ()) {
            return C7MY.LIZIZ(0);
        }
        if (!C202677xP.LIZIZ()) {
            return 0;
        }
        return C7MY.LIZIZ(4);
    }

    public static int LIZJ() {
        if (LJFF()) {
            return 0;
        }
        if (C8D3.LIZJ()) {
            return C7MY.LIZIZ(6);
        }
        if (!C202677xP.LIZIZ()) {
            return 0;
        }
        return C7MY.LIZIZ(2);
    }

    public static float LIZLLL() {
        if (LJFF()) {
            return 0.0f;
        }
        if (C8D3.LIZJ()) {
            if (C202677xP.LIZIZ()) {
                return 9.0f;
            }
        } else if (C202677xP.LIZIZ()) {
            return 6.0f;
        }
        return 0.0f;
    }

    public static int LJ() {
        if (LJFF()) {
            return 0;
        }
        if (C8D3.LIZJ()) {
            if (C202677xP.LIZIZ()) {
                return 6;
            }
        } else if (C202677xP.LIZIZ()) {
            return 11;
        }
        return 0;
    }

    public static boolean LJFF() {
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null && C79004UzY.LJJIJIIJI(LJIIIIZZ)) {
            return true;
        }
        return false;
    }

    public static void LJI(String str) {
        o.LJIIIZ(str, "str");
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("rightInteractionArea", str);
    }

    public static void LJII(TuxTextView tuxTextView) {
        if (C202677xP.LIZIZ()) {
            tuxTextView.setShadowLayer(2.0f, 0.0f, 2.0f, LIZ);
        }
    }
}

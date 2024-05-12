package X;

import Y.ARunnableS17S0000000_10;
import Y.ARunnableS20S0300000_9;
import Y.ARunnableS45S0100000_9;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.activity.BottomTabAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OL2 {
    public static volatile boolean LIZ;

    public static void LJ() {
        if (!LIZ && (!((Boolean) C52995Kr1.LIZ.getValue()).booleanValue())) {
            try {
                ExecutorC142245i8.LJLILLLLZI.execute(new ARunnableS17S0000000_10(8));
            } catch (Throwable unused) {
            }
        }
    }

    public static OSZ LIZ(Context context, Aweme aweme) {
        if (!LUT.LIZIZ(context)) {
            return new OSZ(Boolean.FALSE, 1);
        }
        if (!OL3.LIZIZ) {
            return new OSZ(Boolean.FALSE, 2);
        }
        if (OL3.LIZLLL) {
            return new OSZ(Boolean.FALSE, 3);
        }
        if (OL1.LIZIZ != null) {
            if (!OL1.LJIIIZ(aweme)) {
                return new OSZ(Boolean.FALSE, 5);
            }
            if (LIZ) {
                return new OSZ(Boolean.FALSE, 6);
            }
            OL5 LIZIZ = OL1.LIZIZ(aweme);
            if (LIZIZ != null) {
                OLK olk = LIZIZ.LJIIIIZZ;
                if (olk != null && olk.LIZIZ()) {
                    return new OSZ(Boolean.FALSE, 7);
                }
                if (LIZIZ.LJIIL) {
                    return new OSZ(Boolean.FALSE, 8);
                }
            }
            return new OSZ(Boolean.TRUE, 0);
        }
        return new OSZ(Boolean.FALSE, 4);
    }

    public static void LIZJ(Context context, Aweme aweme, boolean z) {
        MainActivityScope LJJLIIIJJI;
        BottomTabAbility LJIIIZ;
        LIZIZ(context, aweme, z, false);
        if (!OLF.LIZ) {
            return;
        }
        OLF.LIZ = false;
        if (context == null) {
            return;
        }
        try {
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
            if (LJJIFFI == null || (LJJLIIIJJI = C78866UxK.LJJLIIIJJI(LJJIFFI)) == null || (LJIIIZ = C78897Uxp.LJIIIZ(LJJLIIIJJI)) == null) {
                return;
            }
            ExecutorC142245i8.LJLILLLLZI.execute(new ARunnableS45S0100000_9(LJIIIZ, 161));
        } catch (Throwable unused) {
        }
    }

    public static void LIZIZ(Context context, Aweme aweme, boolean z, boolean z2) {
        MainActivityScope LJJLIIIJJI;
        BottomTabAbility LJIIIZ;
        OL5 LIZIZ = OL1.LIZIZ(aweme);
        if (LIZIZ != null) {
            LIZ = false;
            try {
                OLK olk = LIZIZ.LJIIIIZZ;
                if (olk != null) {
                    olk.LIZ();
                }
            } catch (Throwable unused) {
            }
            if (z) {
                LIZIZ.LJIIL = true;
                if (OLF.LIZ && context != null) {
                    try {
                        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
                        if (LJJIFFI != null && (LJJLIIIJJI = C78866UxK.LJJLIIIJJI(LJJIFFI)) != null && (LJIIIZ = C78897Uxp.LJIIIZ(LJJLIIIJJI)) != null) {
                            ExecutorC142245i8.LJLILLLLZI.execute(new ARunnableS45S0100000_9(LJIIIZ, 160));
                        }
                    } catch (Throwable unused2) {
                    }
                }
                if (z2) {
                    try {
                        DataCenter dataCenter = LIZIZ.LJIIIZ;
                        if (dataCenter != null) {
                            dataCenter.jv0(Boolean.TRUE, "AD_ACTION_MOVE_IN_DESC");
                        }
                    } catch (Throwable unused3) {
                    }
                    LJ();
                }
            }
        }
    }

    public static void LIZLLL(Context context, OL5 cacheData, boolean z, Bitmap bitmap) {
        int LJJIIZ;
        MainActivityScope LJJLIIIJJI;
        BottomTabAbility LJIIIZ;
        o.LJIIIZ(cacheData, "cacheData");
        OLK olk = cacheData.LJIIIIZZ;
        if (olk != null && olk.LIZLLL) {
            LIZ = true;
            if (cacheData.LJIILIIL) {
                cacheData.LJIILIIL = false;
            }
            if (!cacheData.LJIILJJIL) {
                cacheData.LJIILJJIL = true;
            }
            try {
                olk.LIZLLL();
            } catch (Throwable unused) {
                LIZ = false;
            }
            if (LIZ) {
                try {
                    DataCenter dataCenter = cacheData.LJIIIZ;
                    if (dataCenter != null) {
                        dataCenter.jv0(Boolean.TRUE, "AD_ACTION_MOVE_OUT_DESC");
                    }
                } catch (Throwable unused2) {
                }
            } else {
                LJ();
            }
            if (!z || context == null || bitmap == null || OLF.LIZ) {
                return;
            }
            OLF.LIZ = true;
            try {
                C1M5 c1m5 = new C1M5(context.getResources(), bitmap);
                c1m5.LIZJ(C32151Nz.LJIIZILJ(4));
                c1m5.LIZLLL.setAntiAlias(true);
                c1m5.invalidateSelf();
                if (C34051DXz.LIZ() && !DY1.LIZ()) {
                    LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(30));
                } else {
                    LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(36));
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(LJJIIZ, LJJIIZ);
                layoutParams.gravity = 49;
                ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
                if (LJJIFFI == null || (LJJLIIIJJI = C78866UxK.LJJLIIIJJI(LJJIFFI)) == null || (LJIIIZ = C78897Uxp.LJIIIZ(LJJLIIIJJI)) == null) {
                    return;
                }
                ExecutorC142245i8.LJLILLLLZI.execute(new ARunnableS20S0300000_9(LJIIIZ, c1m5, layoutParams, 8));
            } catch (Throwable unused3) {
            }
        }
    }
}

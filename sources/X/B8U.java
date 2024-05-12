package X;

import Y.AObjectS22S0000000_5;
import Y.ARunnableS41S0100000_5;
import Y.AUListenerS0S0200001_5;
import Y.IDAListenerS39S0200000_5;
import Y.IDAListenerS74S0100000_5;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMockCurTime;
import com.bytedance.android.livesdk.widget.LiveSlideUpGuideWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class B8U {
    public static String LIZ = "new_oldversion";
    public static final float LIZIZ = C32151Nz.LJIIZILJ(90);
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static B8Y LJFF;
    public static ValueAnimator LJI;
    public static ValueAnimator LJII;
    public static Float LJIIIIZZ;

    public static void LIZ() {
        ValueAnimator valueAnimator = LJII;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = LJI;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        LJII = null;
        LJI = null;
    }

    public static long LIZLLL() {
        long curTime = LiveMockCurTime.INSTANCE.getCurTime();
        if (curTime <= 0) {
            return System.currentTimeMillis();
        }
        return curTime;
    }

    public static void LJIILIIL() {
        B8Y b8y = LJFF;
        if (b8y != null) {
            b8y.LJLILLLLZI.LIZ();
            C29306Beo.LJJLIIIJJI(b8y.LJLIL, false);
            if (b8y.getParent() instanceof ViewGroup) {
                Object parent = b8y.getParent();
                o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((View) parent).post(new ARunnableS41S0100000_5(b8y, 255));
            }
        }
        LJFF = null;
    }

    public static String LIZIZ() {
        int i = BFS.LIZIZ().LJLLILLLL;
        if (i != 2) {
            if (i != 3 && i != 4) {
                return "medium";
            }
            return "high";
        }
        return "low";
    }

    public static String LIZJ(long j) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(j);
        LIZ2.append("_state");
        return X1D.LIZIZ(LIZ2);
    }

    public static Float LJ(LivePlayFragment livePlayFragment) {
        View view;
        if (livePlayFragment != null && (view = livePlayFragment.getView()) != null) {
            return Float.valueOf(view.getTranslationY());
        }
        return null;
    }

    public static String LJFF(long j) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(j);
        LIZ2.append("_last_show_time");
        return X1D.LIZIZ(LIZ2);
    }

    public static String LJI(long j) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(j);
        LIZ2.append("_last_slide_time");
        return X1D.LIZIZ(LIZ2);
    }

    public static String LJII(long j) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(j);
        LIZ2.append("_state_old");
        return X1D.LIZIZ(LIZ2);
    }

    public static String LJIIIIZZ(long j) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(j);
        LIZ2.append("_type");
        return X1D.LIZIZ(LIZ2);
    }

    public static void LJIIIZ(LivePlayFragment livePlayFragment, LivePlayFragment livePlayFragment2) {
        Float LJ2 = LJ(livePlayFragment);
        if (LJ2 != null || (LJ2 = LJ(livePlayFragment2)) != null) {
            float floatValue = LJ2.floatValue();
            if (floatValue == 0.0f || livePlayFragment == null || livePlayFragment2 == null) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, 0.0f);
            LJII = ofFloat;
            if (ofFloat != null) {
                ofFloat.setDuration(Math.abs(floatValue));
            }
            ValueAnimator valueAnimator = LJII;
            if (valueAnimator != null) {
                valueAnimator.addUpdateListener(new AUListenerS0S0200001_5(floatValue, livePlayFragment, livePlayFragment2, 0));
            }
            ValueAnimator valueAnimator2 = LJII;
            if (valueAnimator2 != null) {
                valueAnimator2.addListener(new IDAListenerS74S0100000_5(livePlayFragment2, 21));
            }
            LIZJ = false;
            ValueAnimator valueAnimator3 = LJII;
            if (valueAnimator3 == null) {
                return;
            }
            valueAnimator3.start();
        }
    }

    public static void LJIIJ(LivePlayFragment livePlayFragment, LivePlayFragment livePlayFragment2, ViewGroup viewGroup, C80797VnN c80797VnN) {
        int i = BFS.LIZIZ().LJLLILLLL;
        if (i != 1 && i != 4) {
            Float LJ2 = LJ(livePlayFragment);
            if (livePlayFragment2 == null || livePlayFragment == null || LJ2 == null) {
                return;
            }
            LIZLLL = false;
            if (livePlayFragment2.LLLL == null) {
                RecyclableWidgetManager cm = livePlayFragment2.cm();
                LiveSlideUpGuideWidget liveSlideUpGuideWidget = (LiveSlideUpGuideWidget) cm.getRecyclableWidgetFromCacheOrNew(LiveSlideUpGuideWidget.class, null, new AObjectS22S0000000_5(10));
                livePlayFragment2.LLLL = liveSlideUpGuideWidget;
                cm.load(R.id.fzh, liveSlideUpGuideWidget);
            }
            LiveSlideUpGuideWidget liveSlideUpGuideWidget2 = livePlayFragment2.LLLL;
            C47121t6 c47121t6 = liveSlideUpGuideWidget2.LJLILLLLZI;
            if (c47121t6 != null) {
                c47121t6.setAlpha(0.0f);
            }
            C47061t0 c47061t0 = liveSlideUpGuideWidget2.LJLIL;
            if (c47061t0 != null) {
                c47061t0.setAlpha(0.0f);
            }
            C15540jG c15540jG = liveSlideUpGuideWidget2.LJLJI;
            if (c15540jG != null) {
                c15540jG.LIZ();
            }
            livePlayFragment2.LLLL.show();
            float f = -LIZIZ;
            float abs = Math.abs(f - LJ2.floatValue());
            ValueAnimator ofFloat = ValueAnimator.ofFloat(LJ2.floatValue(), f);
            LJI = ofFloat;
            if (ofFloat != null) {
                ofFloat.setDuration(500L);
            }
            ValueAnimator valueAnimator = LJI;
            if (valueAnimator != null) {
                valueAnimator.addUpdateListener(new AUListenerS0S0200001_5(abs, livePlayFragment, livePlayFragment2, 1));
            }
            ValueAnimator valueAnimator2 = LJI;
            if (valueAnimator2 != null) {
                valueAnimator2.addListener(new IDAListenerS39S0200000_5(livePlayFragment, livePlayFragment2, 0));
            }
            LIZJ = true;
            ValueAnimator valueAnimator3 = LJI;
            if (valueAnimator3 != null) {
                valueAnimator3.start();
            }
            BZI LIZ2 = C28787BRn.LIZ("draw_guide_show");
            LIZ2.LJIIZILJ();
            LIZ2.LJIJJ(C28594BKc.LIZJ().LIZLLL(), "request_page");
            LIZ2.LJIJJ(LIZIZ(), "strength");
            LIZ2.LJIJJ(LIZ, "type");
            LIZ2.LJJIIJZLJL();
            return;
        }
        LJFF = B8X.LIZ(viewGroup, c80797VnN);
    }

    public static void LJIILJJIL(C29889BoD c29889BoD, long j, long j2, int i) {
        c29889BoD.LJII(Long.valueOf(j2), LJFF(j));
        c29889BoD.LJII(Integer.valueOf(i), LIZJ(j));
        c29889BoD.LIZ();
    }

    public static boolean LJIIJJI(LivePlayFragment livePlayFragment, LivePlayFragment livePlayFragment2, C29889BoD c29889BoD, long j, ViewGroup viewGroup, C80797VnN c80797VnN) {
        if (livePlayFragment.LLLZIL == 0) {
            LIZ = "new";
            long LIZLLL2 = LIZLLL();
            int LJFF2 = c29889BoD.LJFF(LIZJ(j), 0);
            if (LJFF2 != 0) {
                if (LJFF2 != 1) {
                    if (LJFF2 != 2) {
                        if (LJFF2 == 3) {
                            long LJI2 = c29889BoD.LJI(LJI(j), 0L);
                            if (LJI2 > 0 && LIZLLL2 - LJI2 <= 1209600000) {
                                c29889BoD.LJIIIIZZ(4, LIZJ(j));
                                return false;
                            }
                            long LJI3 = c29889BoD.LJI(LJFF(j), 0L);
                            if (LJI3 <= 0 || LIZLLL2 - LJI3 >= 86400000) {
                                LIZ = "new_second";
                                LJIIJ(livePlayFragment, livePlayFragment2, viewGroup, c80797VnN);
                                LJIILJJIL(c29889BoD, j, LIZLLL2, 4);
                                return true;
                            }
                        }
                    } else {
                        long LJI4 = c29889BoD.LJI(LJI(j), 0L);
                        if (LJI4 > 0 && LIZLLL2 - LJI4 <= 1209600000) {
                            return false;
                        }
                        long LJI5 = c29889BoD.LJI(LJFF(j), 0L);
                        if (LJI5 <= 0 || LIZLLL2 - LJI5 >= 1209600000) {
                            LIZ = "new_second";
                            LJIIJ(livePlayFragment, livePlayFragment2, viewGroup, c80797VnN);
                            LJIILJJIL(c29889BoD, j, LIZLLL2, 3);
                            return true;
                        }
                    }
                } else {
                    long LJI6 = c29889BoD.LJI(LJI(j), 0L);
                    if (LJI6 > 0 && LIZLLL2 - LJI6 <= 1209600000) {
                        c29889BoD.LJIIIIZZ(2, LIZJ(j));
                        return false;
                    }
                    long LJI7 = c29889BoD.LJI(LJFF(j), 0L);
                    if (LJI7 <= 0 || LIZLLL2 - LJI7 >= 86400000) {
                        LJIIJ(livePlayFragment, livePlayFragment2, viewGroup, c80797VnN);
                        LJIILJJIL(c29889BoD, j, LIZLLL2, 2);
                        return true;
                    }
                }
            } else {
                long LJI8 = c29889BoD.LJI(LJI(j), 0L);
                if (LJI8 <= 0 || LIZLLL2 - LJI8 > 1209600000) {
                    LJIIJ(livePlayFragment, livePlayFragment2, viewGroup, c80797VnN);
                    LJIILJJIL(c29889BoD, j, LIZLLL2, 1);
                    return true;
                }
            }
            return false;
        }
        BFS.LIZIZ().LJLLL = false;
        return false;
    }

    public static boolean LJIIL(LivePlayFragment livePlayFragment, LivePlayFragment livePlayFragment2, C29889BoD c29889BoD, long j, ViewGroup viewGroup, C80797VnN c80797VnN) {
        if (livePlayFragment != null && livePlayFragment.LLLZIL == 0 && livePlayFragment2 != null) {
            LIZ = "old";
            long LIZLLL2 = LIZLLL();
            int LJFF2 = c29889BoD.LJFF(LJII(j), 0);
            if (LJFF2 != 0) {
                if (LJFF2 == 1) {
                    long LJI2 = c29889BoD.LJI(LJI(j), 0L);
                    if (LJI2 > 0 && LIZLLL2 - LJI2 <= 1209600000) {
                        c29889BoD.LJIIIIZZ(2, LJII(j));
                        return false;
                    }
                    long LJI3 = c29889BoD.LJI(LJFF(j), 0L);
                    if (LJI3 <= 0 || LIZLLL2 - LJI3 > 86400000) {
                        LJIIJ(livePlayFragment, livePlayFragment2, viewGroup, c80797VnN);
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(j);
                        LIZ2.append("_last_show_time_old");
                        c29889BoD.LJII(Long.valueOf(LIZLLL2), X1D.LIZIZ(LIZ2));
                        c29889BoD.LJII(2, LJII(j));
                        c29889BoD.LIZ();
                        return true;
                    }
                }
                return false;
            }
            long LJI4 = c29889BoD.LJI(LJI(j), 0L);
            if (LJI4 > 0 && LIZLLL2 - LJI4 <= 1209600000) {
                return false;
            }
            LJIIJ(livePlayFragment, livePlayFragment2, viewGroup, c80797VnN);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(j);
            LIZ3.append("_last_show_time_old");
            c29889BoD.LJII(Long.valueOf(LIZLLL2), X1D.LIZIZ(LIZ3));
            c29889BoD.LJII(1, LJII(j));
            c29889BoD.LIZ();
            return true;
        }
        BFS.LIZIZ().LJLLL = false;
        return false;
    }
}

package X;

import android.view.View;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L5P extends L4V<AbstractC53477Kyn, C53592L1o> {
    public L69 LIZIZ;
    public final EnumC53663L4h LIZ = EnumC53663L4h.STORY;
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(C53599L1v.LJLIL);
    public AtomicBoolean LIZLLL = new AtomicBoolean(false);

    public final L5Y LJI() {
        L5Y l5y;
        View LJ = L4V.LJ(this, L4T.RING, this.LIZIZ);
        if (!(LJ instanceof L5Y) || (l5y = (L5Y) LJ) == null) {
            return null;
        }
        int parseColor = ColorProtector.parseColor("#E3E3E5");
        l5y.LJLJLJ = true;
        l5y.LJLLLL = parseColor;
        return l5y;
    }

    @Override // X.L21
    public final EnumC53663L4h LIZ() {
        return this.LIZ;
    }

    @Override // X.L21
    public final void LIZLLL(L4O l4o) {
        L5S l5s;
        Float f;
        L5Y LJI;
        if (!(l4o instanceof AbstractC53477Kyn)) {
            return;
        }
        AbstractC53477Kyn abstractC53477Kyn = (AbstractC53477Kyn) l4o;
        Object obj = null;
        if (o.LJ(abstractC53477Kyn.LIZ(), Boolean.TRUE)) {
            if (abstractC53477Kyn instanceof C53476Kym) {
                C53476Kym c53476Kym = (C53476Kym) abstractC53477Kyn;
                L5Q l5q = c53476Kym.LJLJJI;
                if (l5q != null) {
                    l5s = l5q.LIZIZ;
                } else {
                    l5s = null;
                }
                if (l5s == L5S.LOTTIE_ANIMATION) {
                    if (l5q != null) {
                        f = Float.valueOf(l5q.LIZ);
                    } else {
                        f = null;
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("self upload: LOTTIE_ANIMATION progress: ");
                    LIZ.append(f);
                    LIZ.append(", isAnimating = ");
                    L5Y LJI2 = LJI();
                    if (LJI2 != null) {
                        obj = Boolean.valueOf(LJI2.isAnimating());
                    }
                    LIZ.append(obj);
                    LIZ.append(' ');
                    X1D.LIZIZ(LIZ);
                    if (f != null && f.floatValue() > 0.0f && (LJI = LJI()) != null && !LJI.isAnimating()) {
                        LJFF(-1);
                        return;
                    }
                    return;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("self upload: common type, progress: ");
                L5Q l5q2 = c53476Kym.LJLJJI;
                if (l5q2 != null) {
                    obj = Float.valueOf(l5q2.LIZ);
                }
                LIZ2.append(obj);
                LIZ2.append(' ');
                X1D.LIZIZ(LIZ2);
                L5Y LJI3 = LJI();
                if (LJI3 != null) {
                    LJI3.LIZ(L59.START_ANIMATION);
                }
                L5Q l5q3 = c53476Kym.LJLJJI;
                if (l5q3 == null) {
                    return;
                }
                float f2 = l5q3.LIZ;
                L5Y LJI4 = LJI();
                if (LJI4 == null) {
                    return;
                }
                LJI4.setAnimateProgress(f2);
                return;
            }
            L5Y LJI5 = LJI();
            if (LJI5 != null) {
                L5Y LJI6 = LJI();
                if (LJI6 != null) {
                    LJI6.cancelAnimation();
                }
                L5Y LJI7 = LJI();
                if (LJI7 != null) {
                    LJI7.setImageDrawable(null);
                }
                LJI5.LIZ(L59.END_ANIMATION);
            }
            L5Y LJI8 = LJI();
            if (LJI8 == null) {
                return;
            }
            LJI8.setCanDrawRing(true);
            LJI8.invalidate();
            return;
        }
        if (abstractC53477Kyn instanceof C53473Kyj) {
            return;
        }
        L5Y LJI9 = LJI();
        if (LJI9 != null) {
            L5Y LJI10 = LJI();
            if (LJI10 != null) {
                LJI10.cancelAnimation();
            }
            L5Y LJI11 = LJI();
            if (LJI11 != null) {
                LJI11.setImageDrawable(null);
            }
            LJI9.LIZ(L59.END_ANIMATION);
        }
        L5Y LJI12 = LJI();
        if (LJI12 == null) {
            return;
        }
        LJI12.setCanDrawRing(true);
        LJI12.invalidate();
    }

    public final void LJFF(int i) {
        C53478Kyo uiData;
        C26308AUe c26308AUe;
        L5Y LJI = LJI();
        if (LJI == null || (uiData = LJI.getUiData()) == null || (c26308AUe = uiData.LJI) == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(c26308AUe.LIZ);
        LIZ.append(c26308AUe.LIZIZ);
        C0GU<C0GY> c0gu = (C0GU) ((java.util.Map) this.LIZJ.getValue()).get(X1D.LIZIZ(LIZ));
        if (c0gu == null) {
            String channel = c26308AUe.LIZ;
            String fileName = c26308AUe.LIZIZ;
            o.LJIIIZ(channel, "channel");
            o.LJIIIZ(fileName, "fileName");
            String anywhereChannelPath = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getAnywhereChannelPath(channel);
            if (anywhereChannelPath == null) {
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(anywhereChannelPath);
            try {
                c0gu = C04650Gf.LJI(new FileInputStream(new File(JBR.LJFF(LIZ2, File.separator, fileName, LIZ2))), fileName);
                if (c0gu == null) {
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        c0gu.LIZIZ(new L5R(this, i, c26308AUe));
    }

    @Override // X.L21
    public final void LIZJ(AUS aus, L69 l69) {
        this.LIZIZ = l69;
    }

    @Override // X.L21
    public final void LIZIZ(L4O l4o, L69 l69, L59 command) {
        o.LJIIIZ(command, "command");
        if (!(l4o instanceof AbstractC53477Kyn)) {
            return;
        }
        int i = L5B.LIZ[command.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    L5Y LJI = LJI();
                    if (LJI != null) {
                        LJI.cancelAnimation();
                    }
                    L5Y LJI2 = LJI();
                    if (LJI2 == null) {
                        return;
                    }
                    LJI2.setImageDrawable(null);
                    return;
                }
                L5Y LJI3 = LJI();
                if (LJI3 == null) {
                    return;
                }
                LJI3.resumeAnimation();
                return;
            }
            L5Y LJI4 = LJI();
            if (LJI4 == null) {
                return;
            }
            LJI4.pauseAnimation();
            return;
        }
        LJFF(0);
    }
}

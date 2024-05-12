package com.ss.android.ugc.aweme.notification.vm;

import X.C221108m2;
import X.C56702MNe;
import X.C56757MPh;
import X.C62822Ol8;
import X.L0H;
import X.M4Q;
import X.M4U;
import X.MLU;
import X.MLW;
import X.MOE;
import X.MOF;
import X.MOG;
import X.MP2;
import X.MPV;
import X.MPY;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.notification.perf.NoticePerfManager;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NotificationVM extends BaseNotificationVM implements MOG {
    public static final /* synthetic */ int LJLLJ = 0;
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(MOF.LJLIL);
    public final C62822Ol8 LJLLI;
    public MPY LJLLILLLL;

    @Override // X.MOG
    public final NextLiveData<Boolean> ml0() {
        return (NextLiveData) this.LJLL.getValue();
    }

    public NotificationVM() {
        M4U m4u;
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(MOE.LJLIL);
        this.LJLLI = LIZIZ;
        NoticePerfManager noticePerfManager = NoticePerfManager.LIZ;
        NoticePerfManager.LIZIZ = new WeakReference<>(this);
        M4Q LIZIZ2 = noticePerfManager.LIZIZ(false);
        if (LIZIZ2 != null) {
            LIZIZ2.LJ = true;
            m4u = LIZIZ2.LIZLLL;
        } else {
            m4u = null;
        }
        NoticePerfManager.LIZJ = null;
        if (m4u != null) {
            ((Map) LIZIZ.getValue()).put(Integer.valueOf(C56702MNe.LIZ), m4u);
            MPY mpy = this.LJLLILLLL;
            m4u.LJIILIIL = mpy != null ? mpy.LIZIZ() : null;
        }
    }

    public final C56757MPh hv0() {
        return iv0(az());
    }

    public final C56757MPh iv0(int i) {
        C56757MPh c56757MPh;
        C56757MPh c56757MPh2 = (C56757MPh) ((Map) this.LJLLI.getValue()).get(Integer.valueOf(i));
        C56757MPh c56757MPh3 = c56757MPh2;
        if (c56757MPh2 == null) {
            MPV mpv = null;
            if (i == C56702MNe.LIZ && L0H.LIZ()) {
                MLU mlu = new MLU();
                ((Map) this.LJLLI.getValue()).put(Integer.valueOf(C56702MNe.LIZ), mlu);
                MPY mpy = this.LJLLILLLL;
                if (mpy != null) {
                    mpv = mpy.LIZIZ();
                }
                mlu.LJIILIIL = mpv;
                int i2 = this.LJLJJLL;
                c56757MPh = mlu;
                if (i2 != Integer.MIN_VALUE) {
                    mlu.LJIIL.LJIIZILJ = i2;
                    c56757MPh = mlu;
                }
            } else if (i == C56702MNe.LIZ) {
                MP2 mp2 = new MP2();
                int i3 = this.LJLJJLL;
                if (i3 != Integer.MIN_VALUE) {
                    mp2.LJIIL.LJIIZILJ = i3;
                }
                MPY mpy2 = this.LJLLILLLL;
                if (mpy2 != null) {
                    mpv = mpy2.LIZIZ();
                }
                mp2.LJIILIIL = mpv;
                c56757MPh = mp2;
            } else {
                c56757MPh = new C56757MPh(i);
            }
            ((Map) this.LJLLI.getValue()).put(Integer.valueOf(i), c56757MPh);
            c56757MPh3 = c56757MPh;
        }
        return c56757MPh3;
    }

    public final boolean jv0(MLW reason) {
        o.LJIIIZ(reason, "reason");
        cJ().clear();
        ml0().setValue(Boolean.TRUE);
        return hv0().LJIIL(reason);
    }
}

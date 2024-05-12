package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.W9p, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81829W9p implements W4N {
    public final InterfaceC81846WAg LIZ;
    public final ScheduledExecutorService LIZIZ;
    public final ExecutorService LIZJ;
    public final WBE LIZLLL;
    public final AbstractC78853Ux7 LJ;
    public final W6X<W6U, W5A> LJFF;
    public final W4P<Integer> LJI;
    public final W4P<Integer> LJII;

    @Override // X.W4N
    public final boolean LIZJ(W5A w5a) {
        return w5a instanceof C81831W9r;
    }

    public final W6D LIZLLL(C81836W9w c81836W9w) {
        int hashCode;
        int i;
        if (TextUtils.isEmpty(c81836W9w.LJ)) {
            hashCode = c81836W9w.hashCode();
        } else {
            hashCode = c81836W9w.LJ.hashCode();
        }
        W6D w6d = new W6D(new VIE(hashCode), this.LJFF);
        synchronized (c81836W9w) {
            List<C81392Vwy<Bitmap>> list = c81836W9w.LIZLLL;
            if (list != null) {
                i = ((ArrayList) list).size();
            } else {
                i = 0;
            }
        }
        if (i > 0) {
            int i2 = 0;
            do {
                if (c81836W9w.LIZLLL(i2)) {
                    C81392Vwy c81392Vwy = null;
                    try {
                        c81392Vwy = C81392Vwy.LJIIL(new W5C(c81836W9w.LIZIZ(i2), W8A.LIZLLL, 0));
                        w6d.LIZIZ.LJI(new C81723W5n(w6d.LIZ, i2), c81392Vwy, w6d.LIZJ);
                    } finally {
                        C81392Vwy.LJ(c81392Vwy);
                    }
                }
                i2++;
            } while (i2 < i);
        }
        return w6d;
    }

    @Override // X.W4N
    /* renamed from: LJ, reason: merged with bridge method [inline-methods] */
    public final AnimatedDrawable2 LIZIZ(W5A w5a) {
        WAF w6c;
        WA8 wa8;
        WA3 wa3;
        C81831W9r c81831W9r = (C81831W9r) w5a;
        C81836W9w LIZ = c81831W9r.LIZ();
        WA7 wa7 = null;
        if (LIZ.LIZ.getFrameCount() <= 0) {
            return null;
        }
        int intValue = this.LJI.get().intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue != 3) {
                    w6c = new WAU();
                } else {
                    w6c = new C81371Vwd();
                }
            } else {
                w6c = new W6C(LIZLLL(LIZ), false);
            }
        } else {
            w6c = new W6C(LIZLLL(LIZ), true);
        }
        int decodeStatus = LIZ.LIZ.getDecodeStatus();
        C81836W9w LIZ2 = c81831W9r.LIZ();
        WA7 wa72 = LIZ2.LIZ;
        WA1 LIZ3 = this.LIZ.LIZ(LIZ2, new Rect(0, 0, wa72.getWidth(), wa72.getHeight()));
        C81837W9x c81837W9x = new C81837W9x(w6c, LIZ3);
        int i = c81831W9r.LJLILLLLZI.LIZJ;
        if ((i > 0 || (i = this.LJII.get().intValue()) > 0) && !C81796W8i.LIZIZ(c81831W9r.getImageFormat())) {
            wa8 = new WA8(i);
            wa3 = new WA3(this.LJ, c81837W9x, c81831W9r.LJLILLLLZI.LJII, this.LIZJ);
        } else {
            wa8 = null;
            wa3 = null;
        }
        WA0 wa0 = new WA0(this.LJ, w6c, new WAQ(LIZ3), c81837W9x, wa8, wa3);
        wa0.LJIIJ = c81831W9r.LJLILLLLZI.LJII;
        wa0.LJIIJJI = c81831W9r.getImageFormat();
        synchronized (c81831W9r) {
            if (!c81831W9r.isClosed()) {
                wa7 = c81831W9r.LJLIL.LIZ;
            }
        }
        if (wa7 != null) {
            wa7.getImageFormat();
        }
        return new AnimatedDrawable2(new WA5(wa0, wa0, this.LIZLLL, this.LIZIZ, 0), c81831W9r.LJLILLLLZI.LJIIIZ, w6c, decodeStatus, LIZ.LIZ.getImageFormat());
    }

    @Override // X.W4N
    public final Drawable LIZ(W5A w5a, Drawable drawable) {
        C81836W9w LIZIZ;
        WA7 wa7;
        WA8 wa8;
        WA3 wa3;
        C81831W9r c81831W9r = (C81831W9r) w5a;
        C81836W9w LIZ = c81831W9r.LIZ();
        int decodeStatus = LIZ.LIZ.getDecodeStatus();
        if (LIZ.LIZ.getFrameCount() <= 0) {
            return drawable;
        }
        if ((drawable instanceof AnimatedDrawable2) && (decodeStatus == 2 || decodeStatus == 3)) {
            AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) drawable;
            WAF waf = animatedDrawable2.LJLJJL;
            WA7 wa72 = LIZ.LIZ;
            WAA waa = animatedDrawable2.LJLJI;
            if (waa instanceof WA4) {
                T t = ((WA4) waa).LIZ;
                if ((t instanceof WA0) && (LIZIZ = ((WAQ) ((WA0) t).LIZJ).LIZ.LIZIZ()) != null && (wa7 = LIZIZ.LIZ) != null && wa72 != null && wa72 != wa7) {
                    WA7 wa73 = LIZ.LIZ;
                    WA1 LIZ2 = this.LIZ.LIZ(LIZ, new Rect(0, 0, wa73.getWidth(), wa73.getHeight()));
                    C81837W9x c81837W9x = new C81837W9x(waf, LIZ2);
                    int intValue = this.LJII.get().intValue();
                    if (intValue > 0 && !C81796W8i.LIZIZ(w5a.getImageFormat())) {
                        wa8 = new WA8(intValue);
                        wa3 = new WA3(this.LJ, c81837W9x, c81831W9r.LJLILLLLZI.LJII, this.LIZJ);
                    } else {
                        wa8 = null;
                        wa3 = null;
                    }
                    WA0 wa0 = new WA0(this.LJ, waf, new WAQ(LIZ2), c81837W9x, wa8, wa3);
                    wa0.LJIIJ = c81831W9r.LJLILLLLZI.LJII;
                    wa0.LJIIJJI = c81831W9r.getImageFormat();
                    WA5 wa5 = new WA5(wa0, wa0, this.LIZLLL, this.LIZIZ);
                    Object obj = c81831W9r.LJLILLLLZI.LJIIIZ;
                    animatedDrawable2.LJLJI = wa5;
                    if (animatedDrawable2.LJLJJI != null) {
                        WAR LIZIZ2 = AnimatedDrawable2.LIZIZ(decodeStatus, wa5, animatedDrawable2.LJLJJLL, obj);
                        WAR LIZLLL = animatedDrawable2.LJLJJI.LIZLLL(LIZIZ2);
                        if (LIZLLL != null) {
                            LIZIZ2 = LIZLLL;
                        }
                        animatedDrawable2.LJLJJI = LIZIZ2;
                    }
                    return animatedDrawable2;
                }
            }
            return animatedDrawable2;
        }
        return LIZIZ(w5a);
    }

    public C81829W9p(InterfaceC81846WAg interfaceC81846WAg, FT1 ft1, ExecutorServiceC79572VKu executorServiceC79572VKu, RealtimeSinceBootClock realtimeSinceBootClock, AbstractC78853Ux7 abstractC78853Ux7, W6X w6x, WAH wah, WAM wam) {
        this.LIZ = interfaceC81846WAg;
        this.LIZIZ = ft1;
        this.LIZJ = executorServiceC79572VKu;
        this.LIZLLL = realtimeSinceBootClock;
        this.LJ = abstractC78853Ux7;
        this.LJFF = w6x;
        this.LJI = wah;
        this.LJII = wam;
    }
}

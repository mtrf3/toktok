package com.facebook.fresco.animation.drawable;

import X.AJ5;
import X.C78983UzD;
import X.C80629Vkf;
import X.C81796W8i;
import X.C81828W9o;
import X.EYH;
import X.EYI;
import X.EYK;
import X.InterfaceC208628Gs;
import X.InterfaceC81841WAb;
import X.InterfaceC81861WAv;
import X.W58;
import X.WA4;
import X.WA5;
import X.WAA;
import X.WAF;
import X.WAN;
import X.WAO;
import X.WAR;
import Y.ARunnableS50S0100000_14;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.lang.reflect.Field;

/* loaded from: classes15.dex */
public class AnimatedDrawable2 extends Drawable implements Animatable, InterfaceC208628Gs {
    public static final Class<?> LJZL = AnimatedDrawable2.class;
    public static final C78983UzD LL = new C78983UzD();
    public static InterfaceC81861WAv LLD;
    public int LJLIL;
    public boolean LJLILLLLZI;
    public WAA LJLJI;
    public WAR LJLJJI;
    public final WAF LJLJJL;
    public final C81828W9o LJLJJLL;
    public final Object LJLJL;
    public volatile boolean LJLJLJ;
    public long LJLJLLL;
    public long LJLL;
    public long LJLLI;
    public int LJLLILLLL;
    public volatile boolean LJLLJ;
    public final long LJLLL;
    public int LJLLLL;
    public volatile InterfaceC81841WAb LJLLLLLL;
    public volatile AJ5 LJLZ;
    public C80629Vkf LJZ;
    public final ARunnableS50S0100000_14 LJZI;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // X.InterfaceC208628Gs
    public final void LIZ() {
        WAA waa = this.LJLJI;
        if (waa != null) {
            waa.clear();
        }
    }

    public final int LIZJ() {
        WAA waa = this.LJLJI;
        if (waa == null) {
            return 0;
        }
        return waa.getFrameCount();
    }

    public final long LIZLLL() {
        if (this.LJLJI == null) {
            return 0L;
        }
        WAR war = this.LJLJJI;
        if (war != null) {
            return war.LJ();
        }
        int i = 0;
        for (int i2 = 0; i2 < this.LJLJI.getFrameCount(); i2++) {
            i += this.LJLJI.LIZIZ(i2);
        }
        return i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        WAA waa = this.LJLJI;
        if (waa == null) {
            return super.getIntrinsicHeight();
        }
        return waa.LJFF();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        WAA waa = this.LJLJI;
        if (waa == null) {
            return super.getIntrinsicWidth();
        }
        return waa.LIZLLL();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (!this.LJLJLJ) {
            return;
        }
        this.LJLJLJ = false;
        this.LJLJLLL = 0L;
        this.LJLLI = 0L;
        this.LJLL = -1L;
        this.LJLLILLLL = -1;
        this.LJLLJ = false;
        WAR war = this.LJLJJI;
        if (war instanceof WAO) {
            ((WAO) war).LJI = true;
        }
        unscheduleSelf(this.LJZI);
        this.LJLLLLLL.LIZJ(this);
    }

    public AnimatedDrawable2() {
        this.LJLIL = -1000;
        C81828W9o c81828W9o = C81828W9o.LIZIZ;
        this.LJLJJLL = c81828W9o;
        this.LJLLL = 8L;
        this.LJLLLLLL = LL;
        this.LJZI = new ARunnableS50S0100000_14(this, 31);
        this.LJLJI = null;
        this.LJLJJI = LIZIZ(0, null, c81828W9o, null);
        this.LJLJL = null;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        WAA waa;
        EYI.LIZ();
        Field field = EYI.LIZJ;
        if (field != null) {
            try {
                Runnable runnable = (Runnable) field.get(this);
                if (runnable != null && !(runnable instanceof EYH)) {
                    EYI.LIZ();
                    Field field2 = EYI.LIZJ;
                    if (field2 != null) {
                        field2.set(this, new EYH(new EYK(this), runnable));
                    }
                }
            } catch (Exception unused) {
            }
        }
        if ((this.LJLJLJ && !this.LJLLJ) || (waa = this.LJLJI) == null || waa.getFrameCount() <= 1) {
            return;
        }
        this.LJLJLJ = true;
        long uptimeMillis = SystemClock.uptimeMillis();
        this.LJLJLLL = uptimeMillis;
        this.LJLLI = uptimeMillis;
        this.LJLL = -1L;
        this.LJLLILLLL = -1;
        if (this.LJLLJ) {
            long uptimeMillis2 = SystemClock.uptimeMillis();
            long j = uptimeMillis2 - 0;
            this.LJLJLLL = j;
            this.LJLLI = j;
            this.LJLL = uptimeMillis2 - 0;
            this.LJLLILLLL = 0;
            this.LJLLJ = false;
        }
        invalidateSelf();
        this.LJLLLLLL.LIZ(this);
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.LJLJLJ;
    }

    public final void LJ(int i) {
        WAR war;
        if (this.LJLJI == null || (war = this.LJLJJI) == null) {
            return;
        }
        this.LJLL = war.LJFF(i);
        long uptimeMillis = SystemClock.uptimeMillis() - this.LJLL;
        this.LJLJLLL = uptimeMillis;
        this.LJLLI = uptimeMillis;
        invalidateSelf();
    }

    public final void LJFF(WA4 wa4) {
        this.LJLJI = wa4;
        this.LJLJJI = new WAN(wa4, 0);
        wa4.LJI(getBounds());
        C80629Vkf c80629Vkf = this.LJZ;
        if (c80629Vkf != null) {
            c80629Vkf.LIZ(this);
        }
        this.LJLJJI = LIZIZ(0, this.LJLJI, this.LJLJJLL, null);
        stop();
    }

    public final void LJI(InterfaceC81841WAb interfaceC81841WAb) {
        if (interfaceC81841WAb == null) {
            interfaceC81841WAb = LL;
        }
        this.LJLLLLLL = interfaceC81841WAb;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        long max;
        if (this.LJLJI == null || this.LJLJJI == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.LJLJLJ) {
            max = (uptimeMillis - this.LJLJLLL) + 0;
        } else {
            max = Math.max(this.LJLL, 0L);
        }
        int LIZJ = this.LJLJJI.LIZJ(max, this.LJLL);
        if (LIZJ == -1) {
            LIZJ = this.LJLJI.getFrameCount() - 1;
            this.LJLLLLLL.LIZJ(this);
            this.LJLJLJ = false;
        } else if (LIZJ == 0 && this.LJLLILLLL != -1 && uptimeMillis >= this.LJLLI) {
            this.LJLLLLLL.LIZIZ(this);
        }
        boolean LIZ = this.LJLJI.LIZ(LIZJ, canvas, this);
        if (LIZ) {
            this.LJLLLLLL.LIZLLL(this, LIZJ);
            this.LJLLILLLL = LIZJ;
        }
        if (!LIZ) {
            this.LJLLLL++;
            if (W58.LJIIJ(2)) {
                W58.LJIIJJI(LJZL, "Dropped a frame. Count: %s", Integer.valueOf(this.LJLLLL));
            }
        }
        long uptimeMillis2 = SystemClock.uptimeMillis();
        if (this.LJLJLJ) {
            this.LJLJJI.LIZ();
            long LIZIZ = this.LJLJJI.LIZIZ(uptimeMillis2 - this.LJLJLLL);
            if (LIZIZ != -1) {
                long j = this.LJLJLLL + LIZIZ + this.LJLLL;
                this.LJLLI = j;
                scheduleSelf(this.LJZI, j);
            }
        }
        AJ5 aj5 = this.LJLZ;
        if (aj5 != null) {
            if (LIZJ != 0) {
                if (LIZJ != 32) {
                    if (LIZJ == 33) {
                        aj5.LIZ.v3(2);
                    }
                } else {
                    aj5.LIZ.v3(1);
                }
            } else {
                aj5.LIZ.v3(0);
            }
        }
        this.LJLL = max;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        WAA waa = this.LJLJI;
        if (waa != null) {
            waa.LJI(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        if (this.LJLJLJ) {
            return false;
        }
        long j = i;
        if (this.LJLL == j) {
            return false;
        }
        this.LJLL = j;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.LJZ == null) {
            this.LJZ = new C80629Vkf();
        }
        this.LJZ.LIZ = i;
        WAA waa = this.LJLJI;
        if (waa != null) {
            waa.LIZJ(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.LJZ == null) {
            this.LJZ = new C80629Vkf();
        }
        C80629Vkf c80629Vkf = this.LJZ;
        c80629Vkf.LIZJ = colorFilter;
        c80629Vkf.LIZIZ = true;
        WAA waa = this.LJLJI;
        if (waa != null) {
            waa.LJII(colorFilter);
        }
    }

    public void setPrivateFrameScheduler(WAR war) {
        if (!C81796W8i.LIZIZ(this.LJLJJLL) && war != null) {
            this.LJLJJI = war;
        }
    }

    public static WAR LIZIZ(int i, WAA waa, C81828W9o c81828W9o, Object obj) {
        WAR LIZ;
        if (waa == null) {
            return null;
        }
        if (C81796W8i.LIZIZ(c81828W9o)) {
            return new WAO(waa, i);
        }
        InterfaceC81861WAv interfaceC81861WAv = LLD;
        if (interfaceC81861WAv != null && (LIZ = interfaceC81861WAv.LIZ(waa, obj)) != null) {
            return LIZ;
        }
        return new WAN(waa, i);
    }

    public AnimatedDrawable2(WA5 wa5, Object obj, WAF waf, int i, C81828W9o c81828W9o) {
        this.LJLIL = -1000;
        this.LJLJJLL = C81828W9o.LIZIZ;
        this.LJLLL = 8L;
        this.LJLLLLLL = LL;
        this.LJZI = new ARunnableS50S0100000_14(this, 31);
        this.LJLJI = wa5;
        this.LJLJJLL = c81828W9o;
        this.LJLJJI = LIZIZ(i, wa5, c81828W9o, obj);
        this.LJLJJL = waf;
        this.LJLJL = obj;
    }
}

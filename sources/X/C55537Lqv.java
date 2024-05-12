package X;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: X.Lqv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55537Lqv {
    public final WeakReference<Context> LIZ;
    public final String LIZIZ;
    public final Runnable LIZJ;
    public boolean LJ;
    public Runnable LJFF;
    public boolean LJII;
    public final HandlerC55538Lqw LIZLLL = new HandlerC55538Lqw(this);
    public EnumC55539Lqx LJI = EnumC55539Lqx.UN_PRELOAD;

    public final void LIZ() {
        Context context;
        EnumC55539Lqx enumC55539Lqx = this.LJI;
        EnumC55539Lqx enumC55539Lqx2 = EnumC55539Lqx.PRELOADED;
        if (enumC55539Lqx == enumC55539Lqx2 || (context = this.LIZ.get()) == null) {
            return;
        }
        this.LJI = enumC55539Lqx2;
        C16970lZ.LJFF(context, this.LIZIZ);
    }

    public final void LIZIZ() {
        EnumC55539Lqx enumC55539Lqx = this.LJI;
        if (enumC55539Lqx == EnumC55539Lqx.UN_PRELOAD) {
            this.LJI = EnumC55539Lqx.PRELOAD_RIGHT_NOW;
        } else {
            if (enumC55539Lqx != EnumC55539Lqx.WAIT_TO_PRELOAD) {
                return;
            }
            this.LIZLLL.removeMessages(2);
            LIZ();
        }
    }

    public final void LIZJ() {
        this.LIZLLL.removeCallbacksAndMessages(null);
        this.LJFF = null;
        C16970lZ.LJIIIIZZ(this.LIZIZ);
    }

    public final void LIZLLL() {
        C39066FUw LIZ;
        if (this.LJII || this.LIZ.get() == null) {
            return;
        }
        try {
            LIZ = C16960lY.LIZIZ.get(this.LIZIZ);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        if (LIZ == null) {
            this.LJI = EnumC55539Lqx.PRELOADED;
            this.LIZJ.run();
            this.LJ = true;
        } else {
            this.LIZLLL.sendEmptyMessageDelayed(1, 16L);
            this.LJII = true;
        }
    }

    public final void LJ(Runnable runnable) {
        if (this.LIZ.get() == null) {
            return;
        }
        if (this.LJ) {
            runnable.run();
            return;
        }
        EnumC55539Lqx enumC55539Lqx = this.LJI;
        if (enumC55539Lqx == EnumC55539Lqx.UN_PRELOAD) {
            this.LJI = EnumC55539Lqx.WAIT_TO_PRELOAD;
            this.LIZLLL.sendEmptyMessageDelayed(2, 200L);
        } else if (enumC55539Lqx == EnumC55539Lqx.PRELOAD_RIGHT_NOW) {
            LIZ();
        }
        this.LJFF = runnable;
    }

    public C55537Lqv(WeakReference<Context> weakReference, String str, Runnable runnable) {
        this.LIZ = weakReference;
        this.LIZIZ = str;
        this.LIZJ = runnable;
    }
}

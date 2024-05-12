package X;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.29Y, reason: invalid class name */
/* loaded from: classes.dex */
public final class C29Y extends XKW {
    public static final C62822Ol8 LJLLI = C221108m2.LIZIZ(C45311qB.INSTANCE);
    public static final C015004c LJLLILLLL = new ThreadLocal<MBA>() { // from class: X.04c
        @Override // java.lang.ThreadLocal
        public final MBA initialValue() {
            Choreographer LLIIIJ = C16880lQ.LLIIIJ();
            o.LJIIIIZZ(LLIIIJ, "getInstance()");
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                Handler LIZ = C10640bM.LIZ(myLooper);
                o.LJIIIIZZ(LIZ, "createAsync(\n           …d\")\n                    )");
                C29Y c29y = new C29Y(LLIIIJ, LIZ);
                return c29y.plus(c29y.LJLL);
            }
            "no Looper on this thread".toString();
            throw new IllegalStateException("no Looper on this thread");
        }
    };
    public final Choreographer LJLIL;
    public final Handler LJLILLLLZI;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public final C45321qC LJLL;
    public final Object LJLJI = new Object();
    public final ORV<Runnable> LJLJJI = new ORV<>();
    public List<Choreographer.FrameCallback> LJLJJL = new ArrayList();
    public List<Choreographer.FrameCallback> LJLJJLL = new ArrayList();
    public final ChoreographerFrameCallbackC015204e LJLJLLL = new ChoreographerFrameCallbackC015204e(this);

    public final Runnable LJJIZ() {
        Runnable removeFirst;
        Runnable runnable;
        synchronized (this.LJLJI) {
            ORV<Runnable> orv = this.LJLJJI;
            if (orv.isEmpty()) {
                removeFirst = null;
            } else {
                removeFirst = orv.removeFirst();
            }
            runnable = removeFirst;
        }
        return runnable;
    }

    public static final void LJJIJIL(C29Y c29y) {
        boolean z;
        do {
            Runnable LJJIZ = c29y.LJJIZ();
            while (LJJIZ != null) {
                LJJIZ.run();
                LJJIZ = c29y.LJJIZ();
            }
            synchronized (c29y.LJLJI) {
                if (c29y.LJLJJI.isEmpty()) {
                    z = false;
                    c29y.LJLJL = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    public C29Y(Choreographer choreographer, Handler handler) {
        this.LJLIL = choreographer;
        this.LJLILLLLZI = handler;
        this.LJLL = new C45321qC(choreographer);
    }

    @Override // X.XKW
    public final void dispatch(MBA context, Runnable block) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(block, "block");
        synchronized (this.LJLJI) {
            this.LJLJJI.addLast(block);
            if (!this.LJLJL) {
                this.LJLJL = true;
                this.LJLILLLLZI.post(this.LJLJLLL);
                if (!this.LJLJLJ) {
                    this.LJLJLJ = true;
                    this.LJLIL.postFrameCallback(this.LJLJLLL);
                }
            }
        }
    }
}

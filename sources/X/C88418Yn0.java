package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.Yn0, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public class C88418Yn0 extends PthreadThread {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public final ArrayList<Runnable> LJLLLLLL;
    public boolean LJLZ;
    public C88420Yn2 LJZ;
    public final WeakReference<TextureViewSurfaceTextureListenerC88419Yn1> LJZI;

    /* JADX WARN: Removed duplicated region for block: B:148:0x013c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0126 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void guardedRun() {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88418Yn0.guardedRun():void");
    }

    public final boolean readyToDraw() {
        if (!this.LJLJJI && this.LJLJJL && !this.LJLJJLL && this.LJLLI > 0 && this.LJLLILLLL > 0 && (this.LJLLL || this.LJLLJ == 1)) {
            return true;
        }
        return false;
    }

    public final void requestExitAndWait() {
        C88422Yn4 c88422Yn4 = TextureViewSurfaceTextureListenerC88419Yn1.LJLLILLLL;
        synchronized (c88422Yn4) {
            this.LJLIL = true;
            c88422Yn4.notifyAll();
            while (!this.LJLILLLLZI) {
                try {
                    TextureViewSurfaceTextureListenerC88419Yn1.LJLLILLLL.wait();
                } catch (InterruptedException unused) {
                    C16880lQ.LLLLIIIILLL().interrupt();
                }
            }
        }
    }

    public final void stopEglContextLocked() {
        if (this.LJLJLJ) {
            this.LJZ.LIZJ();
            this.LJLJLJ = false;
            C88422Yn4 c88422Yn4 = TextureViewSurfaceTextureListenerC88419Yn1.LJLLILLLL;
            if (c88422Yn4.LJ == this) {
                c88422Yn4.LJ = null;
            }
            c88422Yn4.notifyAll();
        }
    }

    public final void stopEglSurfaceLocked() {
        if (this.LJLJLLL) {
            this.LJLJLLL = false;
            this.LJZ.LIZIZ();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("GLThread ");
            LIZ2.append(getId());
            setName(X1D.LIZIZ(LIZ2));
            try {
                guardedRun();
            } catch (InterruptedException unused) {
            } catch (Throwable th) {
                TextureViewSurfaceTextureListenerC88419Yn1.LJLLILLLL.LIZLLL(this);
                throw th;
            }
            C88422Yn4 c88422Yn4 = TextureViewSurfaceTextureListenerC88419Yn1.LJLLILLLL;
            synchronized (c88422Yn4) {
                this.LJLILLLLZI = true;
                if (c88422Yn4.LJ == this) {
                    c88422Yn4.LJ = null;
                }
                c88422Yn4.notifyAll();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public C88418Yn0(WeakReference<TextureViewSurfaceTextureListenerC88419Yn1> weakReference) {
        super("GLTextureView$GLThread");
        this.LJLLLLLL = new ArrayList<>();
        this.LJLZ = true;
        this.LJLLI = 0;
        this.LJLLILLLL = 0;
        this.LJLLL = true;
        this.LJLLJ = 1;
        this.LJZI = weakReference;
    }

    public final void setRenderMode(int i) {
        if (i >= 0 && i <= 1) {
            C88422Yn4 c88422Yn4 = TextureViewSurfaceTextureListenerC88419Yn1.LJLLILLLL;
            synchronized (c88422Yn4) {
                this.LJLLJ = i;
                c88422Yn4.notifyAll();
            }
            return;
        }
        throw new IllegalArgumentException("renderMode");
    }
}

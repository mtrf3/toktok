package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import android.view.View;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.IMonitor;
import java.lang.ref.WeakReference;

/* renamed from: X.Yn1, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public class TextureViewSurfaceTextureListenerC88419Yn1 extends TextureView implements TextureView.SurfaceTextureListener, View.OnLayoutChangeListener {
    public static final C88422Yn4 LJLLILLLL = new C88422Yn4();
    public IMonitor LJLIL;
    public final WeakReference<TextureViewSurfaceTextureListenerC88419Yn1> LJLILLLLZI;
    public C88418Yn0 LJLJI;
    public InterfaceC81370Vwc LJLJJI;
    public boolean LJLJJL;
    public InterfaceC79900VXk LJLJJLL;
    public InterfaceC88427Yn9 LJLJL;
    public InterfaceC88428YnA LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public boolean LJLLI;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void setGLWrapper(InterfaceC88429YnB interfaceC88429YnB) {
    }

    public final void LIZ() {
        if (this.LJLJI == null) {
        } else {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    public final void finalize() {
        try {
            C88418Yn0 c88418Yn0 = this.LJLJI;
            if (c88418Yn0 != null) {
                c88418Yn0.requestExitAndWait();
            }
        } finally {
            super.finalize();
        }
    }

    public int getRenderMode() {
        int i;
        C88418Yn0 c88418Yn0 = this.LJLJI;
        c88418Yn0.getClass();
        synchronized (LJLLILLLL) {
            i = c88418Yn0.LJLLJ;
        }
        return i;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        C88418Yn0 c88418Yn0 = this.LJLJI;
        if (c88418Yn0 != null) {
            c88418Yn0.requestExitAndWait();
        }
        this.LJLJJL = true;
        super.onDetachedFromWindow();
    }

    public final void onPause() {
        C88418Yn0 c88418Yn0 = this.LJLJI;
        c88418Yn0.getClass();
        C88422Yn4 c88422Yn4 = LJLLILLLL;
        synchronized (c88422Yn4) {
            c88418Yn0.LJLJI = true;
            c88422Yn4.notifyAll();
            while (!c88418Yn0.LJLILLLLZI && !c88418Yn0.LJLJJI) {
                try {
                    LJLLILLLL.wait();
                } catch (InterruptedException unused) {
                    C16880lQ.LLLLIIIILLL().interrupt();
                }
            }
        }
    }

    public final void requestRender() {
        C88418Yn0 c88418Yn0 = this.LJLJI;
        c88418Yn0.getClass();
        C88422Yn4 c88422Yn4 = LJLLILLLL;
        synchronized (c88422Yn4) {
            c88418Yn0.LJLLL = true;
            c88422Yn4.notifyAll();
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        int i;
        super.onAttachedToWindow();
        if (this.LJLJJL && this.LJLJJI != null) {
            C88418Yn0 c88418Yn0 = this.LJLJI;
            if (c88418Yn0 != null) {
                synchronized (LJLLILLLL) {
                    i = c88418Yn0.LJLLJ;
                }
            } else {
                i = 1;
            }
            C88418Yn0 c88418Yn02 = new C88418Yn0(this.LJLILLLLZI);
            this.LJLJI = c88418Yn02;
            if (i != 1) {
                c88418Yn02.setRenderMode(i);
            }
            this.LJLJI.start();
        }
        this.LJLJJL = false;
    }

    public int getDebugFlags() {
        return this.LJLJLLL;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.LJLLI;
    }

    public TextureViewSurfaceTextureListenerC88419Yn1(Context context) {
        super(context, null);
        this.LJLILLLLZI = new WeakReference<>(this);
        setSurfaceTextureListener(this);
    }

    public final void LJI(Runnable runnable) {
        C88418Yn0 c88418Yn0 = this.LJLJI;
        c88418Yn0.getClass();
        C88422Yn4 c88422Yn4 = LJLLILLLL;
        synchronized (c88422Yn4) {
            c88418Yn0.LJLLLLLL.add(runnable);
            c88422Yn4.notifyAll();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C88418Yn0 c88418Yn0 = this.LJLJI;
        c88418Yn0.getClass();
        C88422Yn4 c88422Yn4 = LJLLILLLL;
        synchronized (c88422Yn4) {
            c88418Yn0.LJLJJL = false;
            c88422Yn4.notifyAll();
            while (!c88418Yn0.LJLJL && !c88418Yn0.LJLILLLLZI) {
                try {
                    LJLLILLLL.wait();
                } catch (InterruptedException unused) {
                    C16880lQ.LLLLIIIILLL().interrupt();
                }
            }
        }
        return true;
    }

    public void setDebugFlags(int i) {
        this.LJLJLLL = i;
    }

    public void setEGLConfigChooser(boolean z) {
        setEGLConfigChooser(new C79904VXo(this, z));
    }

    public void setEGLContextClientVersion(int i) {
        LIZ();
        this.LJLL = i;
    }

    public void setEGLContextFactory(InterfaceC88427Yn9 interfaceC88427Yn9) {
        LIZ();
        this.LJLJL = interfaceC88427Yn9;
    }

    public void setEGLWindowSurfaceFactory(InterfaceC88428YnA interfaceC88428YnA) {
        LIZ();
        this.LJLJLJ = interfaceC88428YnA;
    }

    public void setMonitor(IMonitor iMonitor) {
        this.LJLIL = iMonitor;
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.LJLLI = z;
    }

    public void setRenderMode(int i) {
        C88418Yn0 c88418Yn0 = this.LJLJI;
        c88418Yn0.getClass();
        if (i >= 0 && i <= 1) {
            C88422Yn4 c88422Yn4 = LJLLILLLL;
            synchronized (c88422Yn4) {
                c88418Yn0.LJLLJ = i;
                c88422Yn4.notifyAll();
            }
            return;
        }
        throw new IllegalArgumentException("renderMode");
    }

    public void setRenderer(InterfaceC81370Vwc interfaceC81370Vwc) {
        LIZ();
        if (this.LJLJJLL == null) {
            this.LJLJJLL = new C79904VXo(this, true);
        }
        if (this.LJLJL == null) {
            this.LJLJL = new C88425Yn7(this);
        }
        if (this.LJLJLJ == null) {
            this.LJLJLJ = new C88426Yn8();
        }
        this.LJLJJI = interfaceC81370Vwc;
        C88418Yn0 c88418Yn0 = new C88418Yn0(this.LJLILLLLZI);
        this.LJLJI = c88418Yn0;
        c88418Yn0.start();
    }

    public void setEGLConfigChooser(InterfaceC79900VXk interfaceC79900VXk) {
        LIZ();
        this.LJLJJLL = interfaceC79900VXk;
    }

    public final void LJII(int i, int i2) {
        C88418Yn0 c88418Yn0 = this.LJLJI;
        c88418Yn0.getClass();
        C88422Yn4 c88422Yn4 = LJLLILLLL;
        synchronized (c88422Yn4) {
            c88418Yn0.LJLLI = i;
            c88418Yn0.LJLLILLLL = i2;
            c88418Yn0.LJLZ = true;
            c88418Yn0.LJLLL = true;
            c88418Yn0.LJLLLL = false;
            c88422Yn4.notifyAll();
            while (!c88418Yn0.LJLILLLLZI && !c88418Yn0.LJLJJI && !c88418Yn0.LJLLLL && c88418Yn0.LJLJLJ && c88418Yn0.LJLJLLL && c88418Yn0.readyToDraw()) {
                try {
                    LJLLILLLL.wait();
                } catch (InterruptedException unused) {
                    C16880lQ.LLLLIIIILLL().interrupt();
                }
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C88418Yn0 c88418Yn0 = this.LJLJI;
        c88418Yn0.getClass();
        C88422Yn4 c88422Yn4 = LJLLILLLL;
        synchronized (c88422Yn4) {
            c88418Yn0.LJLJJL = true;
            c88422Yn4.notifyAll();
            while (c88418Yn0.LJLJL && !c88418Yn0.LJLILLLLZI) {
                try {
                    LJLLILLLL.wait();
                } catch (InterruptedException unused) {
                    C16880lQ.LLLLIIIILLL().interrupt();
                }
            }
        }
        LJII(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        LJII(i, i2);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        getSurfaceTexture();
        LJII(i3 - i, i4 - i2);
    }
}

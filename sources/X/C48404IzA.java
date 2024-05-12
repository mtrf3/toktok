package X;

import Y.ARunnableS9S1100000_8;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.IzA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48404IzA implements InterfaceC61390O7m, IW4, InterfaceC48024It2 {
    public final C48407IzD LJLIL;
    public InterfaceC48019Isx LJLILLLLZI;
    public boolean LJLJI;
    public long LJLJJI;
    public final ArrayList<Runnable> LJLJJL;
    public final IW3 LJLJJLL = new IW3(this);
    public final InterfaceC48020Isy LJLJL;

    @Override // X.InterfaceC61390O7m
    public final int LIZJ() {
        return -102;
    }

    @Override // X.InterfaceC61390O7m
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC61390O7m
    public final boolean LIZ() {
        if (this.LJLIL.LIZ == 4) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC61390O7m
    public final float LJ() {
        int i;
        this.LJLIL.getClass();
        try {
            Object LLILL = C16880lQ.LLILL(C61359O6h.LJIILL, "audio");
            if (!(LLILL instanceof AudioManager)) {
                LLILL = null;
            }
            AudioManager audioManager = (AudioManager) LLILL;
            int i2 = 0;
            if (audioManager != null) {
                i = C16880lQ.LLLLLLZZ(audioManager, 3);
                if (i < 0) {
                    return i2;
                }
            } else {
                i = 0;
            }
            i2 = i;
            return i2;
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    @Override // X.InterfaceC61390O7m
    public final int getCurrentPosition() {
        return this.LJLIL.LIZIZ.getCurrentPosition();
    }

    @Override // X.InterfaceC61390O7m
    public final int getDuration() {
        return this.LJLIL.LIZIZ.getDuration();
    }

    @Override // X.InterfaceC61390O7m
    public final float getVolume() {
        int i;
        this.LJLIL.getClass();
        try {
            Object LLILL = C16880lQ.LLILL(C61359O6h.LJIILL, "audio");
            if (!(LLILL instanceof AudioManager)) {
                LLILL = null;
            }
            AudioManager audioManager = (AudioManager) LLILL;
            int i2 = 0;
            if (audioManager != null) {
                i = audioManager.getStreamVolume(3);
                if (i < 0) {
                    return i2;
                }
            } else {
                i = 0;
            }
            i2 = i;
            return i2;
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    @Override // X.InterfaceC61390O7m
    public final void pause() {
        C48407IzD c48407IzD = this.LJLIL;
        c48407IzD.LIZIZ.pause();
        c48407IzD.LIZ = 5;
    }

    @Override // X.InterfaceC61390O7m
    public final void release() {
        C48023It1 c48023It1 = ((TextureViewSurfaceTextureListenerC48022It0) this.LJLJL).LJLIL;
        if (c48023It1 != null) {
            c48023It1.LIZ();
        }
        C48407IzD c48407IzD = this.LJLIL;
        c48407IzD.LIZIZ.release();
        c48407IzD.LIZIZ.setOnPreparedListener(null);
        c48407IzD.LIZIZ.setOnBufferingUpdateListener(null);
        c48407IzD.LIZIZ.setOnInfoListener(null);
        c48407IzD.LIZIZ.setOnSeekCompleteListener(null);
        c48407IzD.LIZIZ.setOnCompletionListener(null);
        c48407IzD.LIZIZ.setOnVideoSizeChangedListener(null);
        c48407IzD.LIZIZ.setOnErrorListener(null);
        c48407IzD.LIZ = 8;
        c48407IzD.LIZJ = null;
        this.LJLILLLLZI = null;
    }

    @Override // X.InterfaceC61390O7m
    public final void resume() {
        C48407IzD c48407IzD = this.LJLIL;
        if (c48407IzD.LIZ == 5) {
            c48407IzD.LIZIZ.start();
            c48407IzD.LIZ = 4;
            C48405IzB c48405IzB = c48407IzD.LIZJ;
            if (c48405IzB != null) {
                c48405IzB.LIZ(false);
            }
        }
    }

    @Override // X.InterfaceC61390O7m
    public final void stop() {
        C48407IzD c48407IzD = this.LJLIL;
        if (c48407IzD.LIZ == 4) {
            c48407IzD.LIZIZ.stop();
            c48407IzD.LIZ = 6;
            C48405IzB c48405IzB = c48407IzD.LIZJ;
            if (c48405IzB != null) {
                c48405IzB.LIZIZ(c48407IzD.LIZIZ.getCurrentPosition(), c48407IzD.LIZIZ.getDuration());
            }
        }
    }

    public C48404IzA(TextureViewSurfaceTextureListenerC48022It0 textureViewSurfaceTextureListenerC48022It0) {
        this.LJLJL = textureViewSurfaceTextureListenerC48022It0;
        textureViewSurfaceTextureListenerC48022It0.setVideoViewCallback(this);
        o.LJFF(textureViewSurfaceTextureListenerC48022It0.getViewContext(), "videoView.viewContext");
        C48407IzD c48407IzD = new C48407IzD();
        this.LJLIL = c48407IzD;
        this.LJLJJL = new ArrayList<>();
        c48407IzD.LIZJ = new C48405IzB(this);
    }

    @Override // X.InterfaceC61390O7m
    public final void LJFF(O7H o7h) {
        this.LJLILLLLZI = o7h;
    }

    @Override // X.IW4
    public final void handleMsg(Message msg) {
        InterfaceC48019Isx interfaceC48019Isx;
        o.LJIIJ(msg, "msg");
        if (msg.what != 1000) {
            return;
        }
        if (LIZ()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = this.LJLJJI;
            long j2 = uptimeMillis - j;
            long j3 = 100;
            if (j != 0 && j2 > 100) {
                j3 = 100 - (j2 % 100);
            }
            Message obtainMessage = this.LJLJJLL.obtainMessage(1000);
            o.LJFF(obtainMessage, "weakHandler.obtainMessag…_UPDATE_PLAYING_PROGRESS)");
            this.LJLJJLL.sendMessageDelayed(obtainMessage, j3);
            this.LJLJJI = uptimeMillis;
        } else {
            this.LJLJJI = 0L;
        }
        if (getDuration() <= 0 || (interfaceC48019Isx = this.LJLILLLLZI) == null) {
            return;
        }
        interfaceC48019Isx.LJFF(getCurrentPosition(), getDuration());
    }

    @Override // X.InterfaceC48024It2
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        o.LJIIJ(surface, "surface");
        this.LJLJI = false;
        return false;
    }

    @Override // X.InterfaceC61390O7m
    public final void setMute(boolean z) {
        this.LJLIL.LIZIZ.setVolume(0.0f, 0.0f);
    }

    @Override // X.InterfaceC61390O7m
    public final void setVolume(float f, float f2) {
        this.LJLIL.LIZIZ.setVolume(f, f2);
    }

    @Override // X.InterfaceC61390O7m
    public final boolean LIZIZ(String videoUrl, int i, boolean z) {
        o.LJIIJ(videoUrl, "videoUrl");
        if (ujb.o.LJJJJJL(videoUrl) || (!ujb.o.LJJJJJL(""))) {
            return false;
        }
        ((TextureViewSurfaceTextureListenerC48022It0) this.LJLJL).setSurfaceViewVisibility(0);
        ARunnableS9S1100000_8 aRunnableS9S1100000_8 = new ARunnableS9S1100000_8(this, videoUrl, 16);
        if (this.LJLJI) {
            aRunnableS9S1100000_8.run();
        } else {
            this.LJLJJL.add(aRunnableS9S1100000_8);
        }
        return true;
    }

    @Override // X.InterfaceC48024It2
    public final void onSurfaceTextureAvailable(SurfaceTexture surface, int i, int i2) {
        o.LJIIJ(surface, "surface");
        this.LJLJI = true;
        Surface surface2 = ((TextureViewSurfaceTextureListenerC48022It0) this.LJLJL).getSurface();
        if (surface2 == null) {
            surface2 = new Surface(surface);
        }
        C48407IzD c48407IzD = this.LJLIL;
        c48407IzD.getClass();
        c48407IzD.LIZIZ.setSurface(surface2);
        if (!this.LJLJI || this.LJLJJL.isEmpty()) {
            return;
        }
        Iterator it = new ArrayList(this.LJLJJL).iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (Throwable unused) {
            }
        }
        this.LJLJJL.clear();
    }
}

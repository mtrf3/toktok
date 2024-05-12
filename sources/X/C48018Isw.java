package X;

import Y.ARunnableS14S0110000_8;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import com.ss.texturerender.VideoSurface;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Isw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48018Isw implements InterfaceC61390O7m, IW4, InterfaceC47814Ipe, InterfaceC46854IaA, InterfaceC48024It2 {
    public Context LJLIL;
    public InterfaceC48020Isy LJLILLLLZI;
    public TTVideoEngine LJLJI;
    public InterfaceC48019Isx LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJLJ;
    public long LJLLILLLL;
    public final IW3 LJLJJI = new IW3(this);
    public final ArrayList<Runnable> LJLJL = new ArrayList<>();
    public boolean LJLJLLL = false;
    public boolean LJLL = false;
    public boolean LJLLI = false;

    @Override // X.InterfaceC61390O7m
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC47814Ipe
    public final void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // X.InterfaceC46854IaA
    public final boolean onFetchedVideoInfo(C47164IfA c47164IfA) {
        return false;
    }

    @Override // X.InterfaceC47814Ipe
    public final /* synthetic */ void onFirstAVSyncFrame(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47814Ipe
    public final void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // X.InterfaceC47814Ipe
    public final void onPrepare(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47814Ipe
    public final void onPrepared(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47814Ipe
    public final /* synthetic */ void onRefreshSurface(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47814Ipe
    public final /* synthetic */ int onSetSurface(TTVideoEngine tTVideoEngine, VideoSurface videoSurface, Surface surface) {
        return 0;
    }

    @Override // X.InterfaceC47814Ipe
    public final void onStreamChanged(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // X.InterfaceC48024It2
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // X.InterfaceC47814Ipe
    public final /* synthetic */ void onVideoSecondFrame(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47814Ipe
    public final void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i, int i2) {
    }

    @Override // X.InterfaceC61390O7m
    public final boolean LIZ() {
        TTVideoEngine tTVideoEngine = this.LJLJI;
        if (tTVideoEngine == null || tTVideoEngine.LJJIJIIJIL() != 1) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC61390O7m
    public final int LIZJ() {
        TTVideoEngine tTVideoEngine = this.LJLJI;
        if (tTVideoEngine != null) {
            return tTVideoEngine.LJJII(660);
        }
        return -101;
    }

    @Override // X.InterfaceC61390O7m
    public final float LJ() {
        TTVideoEngine tTVideoEngine = this.LJLJI;
        if (tTVideoEngine == null) {
            return 0.0f;
        }
        return tTVideoEngine.LJJIIZ();
    }

    @Override // X.InterfaceC61390O7m
    public final int getCurrentPosition() {
        TTVideoEngine tTVideoEngine = this.LJLJI;
        if (tTVideoEngine != null) {
            return tTVideoEngine.LJIJ();
        }
        return 0;
    }

    @Override // X.InterfaceC61390O7m
    public final int getDuration() {
        TTVideoEngine tTVideoEngine = this.LJLJI;
        if (tTVideoEngine != null) {
            return tTVideoEngine.LJIL();
        }
        return 0;
    }

    @Override // X.InterfaceC61390O7m
    public final float getVolume() {
        TTVideoEngine tTVideoEngine = this.LJLJI;
        if (tTVideoEngine == null) {
            return 0.0f;
        }
        return tTVideoEngine.LJJJJ();
    }

    @Override // X.InterfaceC61390O7m
    public final void pause() {
        if (this.LJLJI != null && LIZ()) {
            this.LJLJI.LJJL();
        }
    }

    @Override // X.InterfaceC61390O7m
    public final void release() {
        C48023It1 c48023It1;
        InterfaceC48020Isy interfaceC48020Isy = this.LJLILLLLZI;
        if (interfaceC48020Isy != null && (c48023It1 = ((TextureViewSurfaceTextureListenerC48022It0) interfaceC48020Isy).LJLIL) != null) {
            c48023It1.LIZ();
        }
        TTVideoEngine tTVideoEngine = this.LJLJI;
        if (tTVideoEngine != null) {
            tTVideoEngine.LJZI(null);
            this.LJLJI.LLJJIJI(null);
            this.LJLJI.LJJLIIIJJI();
            this.LJLJI = null;
        }
        this.LJLJJL = null;
    }

    @Override // X.InterfaceC61390O7m
    public final void resume() {
        TTVideoEngine tTVideoEngine = this.LJLJI;
        if (tTVideoEngine != null && tTVideoEngine.LJJIJIIJIL() == 2) {
            this.LJLJI.LJJLI();
        }
    }

    @Override // X.InterfaceC61390O7m
    public final void stop() {
        if (this.LJLJI != null && !this.LJLJLLL) {
            this.LJLJJL.LIZIZ(getCurrentPosition(), getDuration());
            this.LJLJI.LLJJJJJIL();
            this.LJLJLLL = true;
        }
    }

    public C48018Isw(TextureViewSurfaceTextureListenerC48022It0 textureViewSurfaceTextureListenerC48022It0) {
        this.LJLILLLLZI = textureViewSurfaceTextureListenerC48022It0;
        textureViewSurfaceTextureListenerC48022It0.setVideoViewCallback(this);
        this.LJLIL = ((TextureViewSurfaceTextureListenerC48022It0) this.LJLILLLLZI).getViewContext();
    }

    @Override // X.InterfaceC61390O7m
    public final void LJFF(O7H o7h) {
        this.LJLJJL = o7h;
    }

    @Override // X.IW4
    public final void handleMsg(Message message) {
        InterfaceC48019Isx interfaceC48019Isx;
        if (message.what != 1000 || this.LJLJI == null) {
            return;
        }
        if (LIZ()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = this.LJLLILLLL;
            long j2 = uptimeMillis - j;
            long j3 = 100;
            if (j != 0 && j2 > 100) {
                j3 = 100 - (j2 % 100);
            }
            this.LJLJJI.sendMessageDelayed(this.LJLJJI.obtainMessage(1000), j3);
            this.LJLLILLLL = uptimeMillis;
        } else {
            this.LJLLILLLL = 0L;
        }
        int LJIL = this.LJLJI.LJIL();
        if (LJIL <= 0 || (interfaceC48019Isx = this.LJLJJL) == null) {
            return;
        }
        interfaceC48019Isx.LJFF(this.LJLJI.LJIJ(), LJIL);
    }

    @Override // X.InterfaceC47814Ipe
    public final void onCompletion(TTVideoEngine tTVideoEngine) {
        InterfaceC48019Isx interfaceC48019Isx = this.LJLJJL;
        if (interfaceC48019Isx != null && !tTVideoEngine.LIZ.LJJJJZ) {
            interfaceC48019Isx.LIZJ(getDuration(), this.LJLLI);
            this.LJLJLLL = true;
        }
    }

    @Override // X.InterfaceC47814Ipe
    public final void onError(C47789IpF c47789IpF) {
        InterfaceC48019Isx interfaceC48019Isx = this.LJLJJL;
        if (interfaceC48019Isx != null) {
            interfaceC48019Isx.LIZLLL(c47789IpF.LIZ, c47789IpF.LIZLLL, this.LJLLI);
        }
    }

    @Override // X.InterfaceC47814Ipe
    public final void onRenderStart(TTVideoEngine tTVideoEngine) {
        InterfaceC48019Isx interfaceC48019Isx = this.LJLJJL;
        if (interfaceC48019Isx != null) {
            interfaceC48019Isx.LJI(tTVideoEngine.LIZ.LJJJLZIJ);
        }
    }

    @Override // X.InterfaceC47814Ipe
    public final void onVideoStatusException(int i) {
        InterfaceC48019Isx interfaceC48019Isx = this.LJLJJL;
        if (interfaceC48019Isx != null) {
            interfaceC48019Isx.LIZLLL(i, "onVideoStatusException", this.LJLLI);
        }
    }

    @Override // X.InterfaceC61390O7m
    public final void setMute(boolean z) {
        TTVideoEngine tTVideoEngine = this.LJLJI;
        if (tTVideoEngine != null) {
            tTVideoEngine.LJLZ(z);
        }
    }

    @Override // X.InterfaceC47814Ipe
    public final void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i) {
        if (i == 1) {
            InterfaceC48019Isx interfaceC48019Isx = this.LJLJJL;
            if (interfaceC48019Isx != null && !this.LJLL) {
                interfaceC48019Isx.LIZ(this.LJLLI);
            }
            this.LJLJJI.removeMessages(1000);
            this.LJLJJI.sendEmptyMessage(1000);
            this.LJLL = true;
        }
    }

    @Override // X.InterfaceC61390O7m
    public final void setVolume(float f, float f2) {
        TTVideoEngine tTVideoEngine = this.LJLJI;
        if (tTVideoEngine != null) {
            tTVideoEngine.LLJJIJIL(f, f2);
        }
    }

    @Override // X.InterfaceC61390O7m
    public final boolean LIZIZ(String str, int i, boolean z) {
        if (TextUtils.isEmpty(str) || this.LJLILLLLZI == null) {
            return false;
        }
        TTVideoEngine tTVideoEngine = this.LJLJI;
        if (tTVideoEngine != null) {
            tTVideoEngine.LJJLIIIJILLIZJL();
        }
        if (i == -1) {
            this.LJLJI = new TTVideoEngine(this.LJLIL, 0);
        } else {
            this.LJLJI = new TTVideoEngine(this.LJLIL, i);
        }
        this.LJLJI.LJLZ(true);
        this.LJLJI.LLJIJIL("splash_ad");
        this.LJLJI.LJZI(this);
        this.LJLJI.LLJJIJI(this);
        this.LJLJI.LJLLLL(4, 2);
        this.LJLJI.LL(str);
        this.LJLJI.LJJLJLI(0, false);
        if (!TextUtils.isEmpty("")) {
            this.LJLJI.LJLJJL("");
            this.LJLLI = true;
        }
        this.LJLJI.LLIIZ(0);
        Surface surface = ((TextureViewSurfaceTextureListenerC48022It0) this.LJLILLLLZI).getSurface();
        if (surface == null || !surface.isValid()) {
            ((TextureViewSurfaceTextureListenerC48022It0) this.LJLILLLLZI).setSurfaceViewVisibility(0);
            ARunnableS14S0110000_8 aRunnableS14S0110000_8 = new ARunnableS14S0110000_8(this, z, 11);
            if (this.LJLJJLL) {
                aRunnableS14S0110000_8.run();
            } else {
                this.LJLJL.add(aRunnableS14S0110000_8);
            }
        } else {
            this.LJLJI.LLILZIL(surface);
            try {
                this.LJLJI.LLFII(z);
                this.LJLJI.LJJLI();
            } catch (Exception unused) {
            }
        }
        this.LJLJLLL = false;
        return true;
    }

    @Override // X.InterfaceC48024It2
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.LJLJJLL = true;
        Surface surface = ((TextureViewSurfaceTextureListenerC48022It0) this.LJLILLLLZI).getSurface();
        if (surface == null) {
            surface = new Surface(surfaceTexture);
        }
        TTVideoEngine tTVideoEngine = this.LJLJI;
        if (tTVideoEngine != null) {
            tTVideoEngine.LLILZIL(surface);
            if (this.LJLJLJ || this.LJLJL.isEmpty()) {
                return;
            }
            this.LJLJLJ = true;
            Iterator it = new ArrayList(this.LJLJL).iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.LJLJL.clear();
            this.LJLJLJ = false;
        }
    }
}

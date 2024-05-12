package X;

import Y.ARunnableS51S0100000_15;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.ss.texturerender.VideoSurface;
import com.ss.ttvideoengine.TTVideoEngine;
import kotlin.jvm.internal.o;

/* renamed from: X.XaO, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85088XaO implements InterfaceC47814Ipe {
    public final C85089XaP LJLIL;
    public final InterfaceC85092XaS LJLILLLLZI;
    public long LJLJI;
    public long LJLJJI;
    public final Handler LJLJJL;
    public final /* synthetic */ C85089XaP LJLJJLL;

    @Override // X.InterfaceC47814Ipe
    public final void onFirstAVSyncFrame(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47814Ipe
    public final void onRefreshSurface(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47814Ipe
    public final /* synthetic */ int onSetSurface(TTVideoEngine tTVideoEngine, VideoSurface videoSurface, Surface surface) {
        return 0;
    }

    @Override // X.InterfaceC47814Ipe
    public final void onStreamChanged(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // X.InterfaceC47814Ipe
    public final void onVideoSecondFrame(TTVideoEngine tTVideoEngine) {
    }

    public final void LIZ() {
        long j;
        C85089XaP c85089XaP = this.LJLIL;
        if (c85089XaP.LIZIZ) {
            j = c85089XaP.LIZIZ().LJIJ();
        } else {
            j = 0;
        }
        boolean z = !this.LJLIL.LJ;
        if (j != this.LJLJI) {
            if (Math.abs(j - this.LJLJJI) >= 500) {
                if (z) {
                    this.LJLILLLLZI.LJFF(this.LJLIL, j);
                }
                this.LJLJJI = j;
            }
            this.LJLJI = j;
        }
        this.LJLJJL.postAtTime(new ARunnableS51S0100000_15(this, 97), this, SystemClock.uptimeMillis() + 50);
    }

    @Override // X.InterfaceC47814Ipe
    public final void onCompletion(TTVideoEngine tTVideoEngine) {
        this.LJLILLLLZI.LIZLLL(this.LJLIL);
    }

    @Override // X.InterfaceC47814Ipe
    public final void onError(C47789IpF c47789IpF) {
        C85079XaF c85079XaF;
        Integer num;
        if (c47789IpF == null) {
            c85079XaF = C85079XaF.LJ;
        } else {
            int i = c47789IpF.LIZ;
            String str = c47789IpF.LIZLLL;
            if (str == null) {
                str = "";
            }
            c85079XaF = new C85079XaF(i, str);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onError() -> ");
        LIZ.append(c85079XaF.LIZ);
        LIZ.append(" -> ");
        if (c47789IpF != null) {
            num = Integer.valueOf(c47789IpF.LIZ);
        } else {
            num = null;
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
        this.LJLILLLLZI.LIZ(c85079XaF);
    }

    @Override // X.InterfaceC47814Ipe
    public final void onPrepare(TTVideoEngine tTVideoEngine) {
        this.LJLILLLLZI.LJIIIIZZ(this.LJLIL);
    }

    @Override // X.InterfaceC47814Ipe
    public final void onPrepared(TTVideoEngine tTVideoEngine) {
        this.LJLILLLLZI.LIZIZ(this.LJLIL);
        this.LJLIL.LIZJ = true;
    }

    @Override // X.InterfaceC47814Ipe
    public final void onRenderStart(TTVideoEngine tTVideoEngine) {
        long j;
        C85089XaP c85089XaP = this.LJLJJLL;
        C32240Cl2 c32240Cl2 = c85089XaP.LJFF;
        if (c85089XaP.LIZIZ) {
            j = c85089XaP.LIZIZ().LJJIIJZLJL(60);
        } else {
            j = 0;
        }
        c32240Cl2.LIZJ = j;
        C85089XaP c85089XaP2 = this.LJLJJLL;
        c85089XaP2.LJFF.LIZIZ = c85089XaP2.LIZ();
        this.LJLILLLLZI.LJI(this.LJLIL);
    }

    @Override // X.InterfaceC47814Ipe
    public final void onVideoStatusException(int i) {
        UC7.LIZLLL("onVideoStatusException() -> ", i);
    }

    @Override // X.InterfaceC47814Ipe
    public final void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i) {
        UC7.LIZLLL("onBufferingUpdate() -> ", i);
        this.LJLILLLLZI.LJII(this.LJLIL, i);
    }

    @Override // X.InterfaceC47814Ipe
    public final void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i) {
        EnumC85066Xa2 enumC85066Xa2;
        if (i != 1) {
            if (i != 2) {
                enumC85066Xa2 = EnumC85066Xa2.LOAD_STATE_ERROR;
            } else {
                enumC85066Xa2 = EnumC85066Xa2.LOAD_STATE_STALLED;
            }
        } else {
            enumC85066Xa2 = EnumC85066Xa2.LOAD_STATE_PLAYABLE;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadStateChanged() -> ");
        LIZ.append(enumC85066Xa2.name());
        X1D.LIZIZ(LIZ);
        this.LJLILLLLZI.LIZJ(this.LJLIL, enumC85066Xa2);
    }

    @Override // X.InterfaceC47814Ipe
    public final void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i) {
        XOX xox;
        if (i != 1) {
            if (i == 2) {
                this.LJLIL.LIZLLL = false;
            }
        } else {
            this.LJLIL.LIZLLL = false;
        }
        UC7.LIZLLL("onPlaybackStateChanged() -> ", i);
        if (i == 1) {
            this.LJLJJL.postAtTime(new ARunnableS51S0100000_15(this, 98), this, SystemClock.uptimeMillis() + 50);
        } else {
            this.LJLJJL.removeCallbacksAndMessages(this);
        }
        InterfaceC85092XaS interfaceC85092XaS = this.LJLILLLLZI;
        C85089XaP c85089XaP = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        xox = XOX.PLAYBACK_STATE_STOPPED;
                    } else {
                        xox = XOX.PLAYBACK_STATE_ERROR;
                    }
                } else {
                    xox = XOX.PLAYBACK_STATE_PAUSED;
                }
            } else {
                xox = XOX.PLAYBACK_STATE_PLAYING;
            }
        } else {
            xox = XOX.PLAYBACK_STATE_STOPPED;
        }
        interfaceC85092XaS.LJ(c85089XaP, xox);
    }

    public C85088XaO(C85089XaP c85089XaP, C85089XaP c85089XaP2, InterfaceC85092XaS wrapperListener) {
        o.LJIIIZ(wrapperListener, "wrapperListener");
        this.LJLJJLL = c85089XaP;
        this.LJLIL = c85089XaP2;
        this.LJLILLLLZI = wrapperListener;
        this.LJLJI = Long.MIN_VALUE;
        this.LJLJJI = Long.MIN_VALUE;
        this.LJLJJL = new Handler(C16880lQ.LLJJJJ());
    }

    @Override // X.InterfaceC47814Ipe
    public final void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onVideoSizeChanged() -> ");
        LIZ.append(i);
        LIZ.append("  -- ");
        LIZ.append(i2);
        X1D.LIZIZ(LIZ);
        this.LJLILLLLZI.LJIIIZ(this.LJLIL, i, i2);
    }
}

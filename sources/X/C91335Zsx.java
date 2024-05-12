package X;

import Y.IDRunnableS88S0100000_29;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.ss.texturerender.VideoSurface;
import com.ss.ttvideoengine.TTVideoEngine;
import kotlin.jvm.internal.o;

/* renamed from: X.Zsx, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91335Zsx implements InterfaceC47814Ipe {
    public final C91061ZoX LJLIL;
    public final InterfaceC91060ZoW LJLILLLLZI;
    public long LJLJI;
    public long LJLJJI;
    public final Handler LJLJJL;
    public final /* synthetic */ C91061ZoX LJLJJLL;

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
        C91061ZoX c91061ZoX = this.LJLIL;
        if (c91061ZoX.LIZIZ) {
            j = c91061ZoX.LIZIZ().LJIJ();
        } else {
            j = 0;
        }
        boolean z = !this.LJLIL.LJ;
        if (j != this.LJLJI) {
            if (Math.abs(j - this.LJLJJI) >= 500) {
                if (z) {
                    this.LJLILLLLZI.LIZLLL(this.LJLIL, j);
                }
                this.LJLJJI = j;
            }
            this.LJLJI = j;
        }
        this.LJLJJL.postAtTime(new IDRunnableS88S0100000_29(this, 1), this, SystemClock.uptimeMillis() + 50);
    }

    @Override // X.InterfaceC47814Ipe
    public final void onCompletion(TTVideoEngine tTVideoEngine) {
        this.LJLILLLLZI.LIZ(this.LJLIL);
    }

    @Override // X.InterfaceC47814Ipe
    public final void onError(C47789IpF c47789IpF) {
        C91304ZsS c91304ZsS;
        Integer num;
        if (c47789IpF == null) {
            c91304ZsS = C91304ZsS.LJ;
        } else {
            int i = c47789IpF.LIZ;
            String str = c47789IpF.LIZLLL;
            if (str == null) {
                str = "";
            }
            c91304ZsS = new C91304ZsS(i, str);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onError() -> ");
        LIZ.append(c91304ZsS.LIZ);
        LIZ.append(" -> ");
        if (c47789IpF != null) {
            num = Integer.valueOf(c47789IpF.LIZ);
        } else {
            num = null;
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
        this.LJLILLLLZI.onError(c91304ZsS);
    }

    @Override // X.InterfaceC47814Ipe
    public final void onPrepare(TTVideoEngine tTVideoEngine) {
        this.LJLILLLLZI.LIZJ(this.LJLIL);
    }

    @Override // X.InterfaceC47814Ipe
    public final void onPrepared(TTVideoEngine tTVideoEngine) {
        this.LJLILLLLZI.LIZIZ(this.LJLIL);
        this.LJLIL.LIZJ = true;
    }

    @Override // X.InterfaceC47814Ipe
    public final void onRenderStart(TTVideoEngine tTVideoEngine) {
        long j;
        C91061ZoX c91061ZoX = this.LJLJJLL;
        C91300ZsO c91300ZsO = c91061ZoX.LJFF;
        if (c91061ZoX.LIZIZ) {
            j = c91061ZoX.LIZIZ().LJJIIJZLJL(60);
        } else {
            j = 0;
        }
        c91300ZsO.LIZJ = j;
        C91061ZoX c91061ZoX2 = this.LJLJJLL;
        c91061ZoX2.LJFF.LIZIZ = c91061ZoX2.LIZ();
        this.LJLILLLLZI.LJIIIIZZ(this.LJLIL);
    }

    @Override // X.InterfaceC47814Ipe
    public final void onVideoStatusException(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onVideoStatusException() -> ");
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC47814Ipe
    public final void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onBufferingUpdate() -> ");
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
        this.LJLILLLLZI.LJII(this.LJLIL, i);
    }

    @Override // X.InterfaceC47814Ipe
    public final void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i) {
        EnumC91305ZsT enumC91305ZsT;
        if (i != 1) {
            if (i != 2) {
                enumC91305ZsT = EnumC91305ZsT.LOAD_STATE_ERROR;
            } else {
                enumC91305ZsT = EnumC91305ZsT.LOAD_STATE_STALLED;
            }
        } else {
            enumC91305ZsT = EnumC91305ZsT.LOAD_STATE_PLAYABLE;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadStateChanged() -> ");
        LIZ.append(enumC91305ZsT.name());
        X1D.LIZIZ(LIZ);
        this.LJLILLLLZI.LJ(this.LJLIL, enumC91305ZsT);
    }

    @Override // X.InterfaceC47814Ipe
    public final void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i) {
        EnumC91310ZsY enumC91310ZsY;
        if (i != 1) {
            if (i == 2) {
                this.LJLIL.LIZLLL = false;
            }
        } else {
            this.LJLIL.LIZLLL = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPlaybackStateChanged() -> ");
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
        if (i == 1) {
            this.LJLJJL.postAtTime(new IDRunnableS88S0100000_29(this, 2), this, SystemClock.uptimeMillis() + 50);
        } else {
            this.LJLJJL.removeCallbacksAndMessages(this);
        }
        InterfaceC91060ZoW interfaceC91060ZoW = this.LJLILLLLZI;
        C91061ZoX c91061ZoX = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        enumC91310ZsY = EnumC91310ZsY.PLAYBACK_STATE_STOPPED;
                    } else {
                        enumC91310ZsY = EnumC91310ZsY.PLAYBACK_STATE_ERROR;
                    }
                } else {
                    enumC91310ZsY = EnumC91310ZsY.PLAYBACK_STATE_PAUSED;
                }
            } else {
                enumC91310ZsY = EnumC91310ZsY.PLAYBACK_STATE_PLAYING;
            }
        } else {
            enumC91310ZsY = EnumC91310ZsY.PLAYBACK_STATE_STOPPED;
        }
        interfaceC91060ZoW.LJI(c91061ZoX, enumC91310ZsY);
    }

    public C91335Zsx(C91061ZoX c91061ZoX, C91061ZoX c91061ZoX2, InterfaceC91060ZoW wrapperListener) {
        o.LJIIIZ(wrapperListener, "wrapperListener");
        this.LJLJJLL = c91061ZoX;
        this.LJLIL = c91061ZoX2;
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
        this.LJLILLLLZI.LJFF(this.LJLIL, i, i2);
    }
}

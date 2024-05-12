package X;

import Y.ARunnableS44S0100000_8;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.ss.texturerender.VideoSurface;
import com.ss.ttvideoengine.TTVideoEngine;
import kotlin.jvm.internal.o;

/* renamed from: X.J7b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48639J7b implements InterfaceC47814Ipe {
    public long LJLIL;
    public long LJLILLLLZI;
    public final Handler LJLJI;
    public final J7W LJLJJI;
    public final InterfaceC48640J7c LJLJJL;

    @Override // X.InterfaceC47814Ipe
    public final /* synthetic */ void onFirstAVSyncFrame(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47814Ipe
    public final /* synthetic */ void onRefreshSurface(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47814Ipe
    public final /* synthetic */ int onSetSurface(TTVideoEngine tTVideoEngine, VideoSurface videoSurface, Surface surface) {
        return 0;
    }

    @Override // X.InterfaceC47814Ipe
    public final /* synthetic */ void onVideoSecondFrame(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47814Ipe
    public final void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i, int i2) {
    }

    @Override // X.InterfaceC47814Ipe
    public final void onVideoStatusException(int i) {
    }

    public final void LIZ() {
        long currentPlaybackTime = this.LJLJJI.getCurrentPlaybackTime();
        if (currentPlaybackTime != this.LJLIL) {
            this.LJLJJL.LJI(this.LJLJJI, currentPlaybackTime);
            if (Math.abs(currentPlaybackTime - this.LJLILLLLZI) >= 500) {
                this.LJLJJL.LIZLLL(this.LJLJJI, currentPlaybackTime);
                this.LJLILLLLZI = currentPlaybackTime;
            }
            this.LJLIL = currentPlaybackTime;
        }
        this.LJLJI.postAtTime(new ARunnableS44S0100000_8(this, 163), this, SystemClock.uptimeMillis() + 50);
    }

    @Override // X.InterfaceC47814Ipe
    public final void onCompletion(TTVideoEngine tTVideoEngine) {
        this.LJLJJL.LJIIIIZZ(this.LJLJJI);
    }

    @Override // X.InterfaceC47814Ipe
    public final void onError(C47789IpF c47789IpF) {
        EnumC48648J7k enumC48648J7k;
        if (c47789IpF == null) {
            enumC48648J7k = EnumC48648J7k.UNKNOWN;
        } else if (c47789IpF.LIZJ() == 1001 || c47789IpF.LIZJ() == 1003 || c47789IpF.LIZJ() == 1000) {
            enumC48648J7k = EnumC48648J7k.NETWORK_ERROR;
        } else {
            enumC48648J7k = EnumC48648J7k.UNKNOWN;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" ---> onError()  internal  --- errorCode is ");
        LIZ.append(enumC48648J7k.name());
        J7Z.LIZ("TTAudioEngineImpl", X1D.LIZIZ(LIZ));
        this.LJLJJL.LIZ(enumC48648J7k);
    }

    @Override // X.InterfaceC47814Ipe
    public final void onPrepare(TTVideoEngine tTVideoEngine) {
        this.LJLJJL.LIZIZ(this.LJLJJI);
    }

    @Override // X.InterfaceC47814Ipe
    public final void onPrepared(TTVideoEngine tTVideoEngine) {
        this.LJLJJL.LJII(this.LJLJJI);
        J7W j7w = this.LJLJJI;
        j7w.LJ = true;
        if (j7w.LJFF) {
            j7w.LIZJ(-1L);
        }
    }

    @Override // X.InterfaceC47814Ipe
    public final void onRenderStart(TTVideoEngine tTVideoEngine) {
        this.LJLJJL.LJIIIZ(this.LJLJJI);
        this.LJLJJL.LJFF(this.LJLJJI, EnumC79954VZm.PLAYBACK_STATE_START);
        J7W j7w = this.LJLJJI;
        long j = j7w.LJI;
        j7w.LJI = 0L;
        if (j > 0) {
            j7w.LJI(j, null);
        }
    }

    public C48639J7b(J7W engine, InterfaceC48640J7c impl) {
        o.LJIIJ(engine, "engine");
        o.LJIIJ(impl, "impl");
        this.LJLJJI = engine;
        this.LJLJJL = impl;
        this.LJLIL = Long.MIN_VALUE;
        this.LJLILLLLZI = Long.MIN_VALUE;
        this.LJLJI = new Handler(C16880lQ.LLJJJJ());
    }

    @Override // X.InterfaceC47814Ipe
    public final void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i) {
        this.LJLJJL.LJIIJ(this.LJLJJI);
    }

    @Override // X.InterfaceC47814Ipe
    public final void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i) {
        EnumC48641J7d enumC48641J7d;
        if (i != 1) {
            if (i != 2) {
                enumC48641J7d = EnumC48641J7d.LOAD_STATE_ERROR;
            } else {
                enumC48641J7d = EnumC48641J7d.LOAD_STATE_STALLED;
            }
        } else {
            enumC48641J7d = EnumC48641J7d.LOAD_STATE_PLAYABLE;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" ---> onLoadStateChanged()  internal --- state is ");
        LIZ.append(enumC48641J7d.name());
        X1D.LIZIZ(LIZ);
        this.LJLJJL.LJ(this.LJLJJI, enumC48641J7d);
    }

    @Override // X.InterfaceC47814Ipe
    public final void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i) {
        if (i != 1) {
            if (i == 2) {
                this.LJLJJI.LJFF = false;
            }
        } else {
            this.LJLJJI.LJFF = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" ---> onPlaybackStateChanged()  internal  ---  current state is ");
        LIZ.append(C48646J7i.LIZ(i).name());
        X1D.LIZIZ(LIZ);
        if (i == 1) {
            this.LJLJI.postAtTime(new ARunnableS44S0100000_8(this, 164), this, SystemClock.uptimeMillis() + 50);
        } else {
            this.LJLJJL.LIZLLL(this.LJLJJI, this.LJLJJI.getCurrentPlaybackTime());
            this.LJLJI.removeCallbacksAndMessages(this);
        }
        this.LJLJJL.LJFF(this.LJLJJI, C48646J7i.LIZ(i));
    }

    @Override // X.InterfaceC47814Ipe
    public final void onStreamChanged(TTVideoEngine tTVideoEngine, int i) {
        this.LJLJJL.LIZJ(this.LJLJJI);
    }
}

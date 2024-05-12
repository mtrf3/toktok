package X;

import Y.ARunnableS46S0100000_10;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.view.Surface;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.ies.xelement.audiott.bean.XAudioSrc;
import com.ss.texturerender.VideoSurface;
import com.ss.ttvideoengine.TTVideoEngine;
import kotlin.jvm.internal.o;

/* renamed from: X.Va3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79971Va3 implements InterfaceC47814Ipe, InterfaceC46853Ia9 {
    public final Handler LJLIL;
    public String LJLILLLLZI;
    public TTVideoEngine LJLJI;
    public InterfaceC79973Va5 LJLJJI;
    public XAudioSrc LJLJJL;
    public XAudioSrc LJLJJLL;
    public C73362Sqk LJLJL;
    public final C62822Ol8 LJLJLJ;
    public InterfaceC79974Va6<XAudioSrc, C73362Sqk> LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public java.util.Map<String, String> LJLLILLLL;
    public volatile int LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public boolean LJLLLLLL;
    public final HandlerThread LJLZ;
    public final Context LJZ;

    public final void LJ() {
        TTVideoEngine tTVideoEngine;
        this.LJLLJ = 1;
        if (this.LJLJL != null && (tTVideoEngine = this.LJLJI) != null) {
            tTVideoEngine.LJJLI();
        }
    }

    @Override // X.InterfaceC47814Ipe
    public final void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // X.InterfaceC47814Ipe
    public final /* synthetic */ void onFirstAVSyncFrame(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47814Ipe
    public final void onPrepare(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47814Ipe
    public final /* synthetic */ void onRefreshSurface(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47814Ipe
    public final void onRenderStart(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47814Ipe
    public final /* synthetic */ int onSetSurface(TTVideoEngine tTVideoEngine, VideoSurface videoSurface, Surface surface) {
        return 0;
    }

    @Override // X.InterfaceC47814Ipe
    public final void onStreamChanged(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // X.InterfaceC46853Ia9
    public final void onVideoEngineInfos(C47620ImW c47620ImW) {
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

    public final String LIZ() {
        String songId;
        XAudioSrc xAudioSrc = this.LJLJJLL;
        if (xAudioSrc != null && (songId = xAudioSrc.getSongId()) != null) {
            return songId;
        }
        return "";
    }

    public final String LIZIZ() {
        String songId;
        XAudioSrc xAudioSrc = this.LJLJJL;
        if (xAudioSrc != null && (songId = xAudioSrc.getSongId()) != null) {
            return songId;
        }
        return "";
    }

    public final void LIZLLL() {
        TTVideoEngine tTVideoEngine = this.LJLJI;
        if (tTVideoEngine == null || this.LJLLL != 1) {
            return;
        }
        long LJIJ = tTVideoEngine.LJIJ();
        InterfaceC79973Va5 interfaceC79973Va5 = this.LJLJJI;
        if (interfaceC79973Va5 != null) {
            interfaceC79973Va5.onPlaybackTimeChanged(LJIJ);
        }
        this.LJLIL.postAtTime(new ARunnableS46S0100000_10(this, 4), this, SystemClock.uptimeMillis() + this.LJLLLL);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79971Va3.LIZJ(java.lang.String):void");
    }

    @Override // X.InterfaceC47814Ipe
    public final void onCompletion(TTVideoEngine tTVideoEngine) {
        InterfaceC79973Va5 interfaceC79973Va5 = this.LJLJJI;
        if (interfaceC79973Va5 != null) {
            interfaceC79973Va5.LIZLLL(this.LJLLI);
        }
    }

    @Override // X.InterfaceC47814Ipe
    public final void onError(C47789IpF c47789IpF) {
        InterfaceC79973Va5 interfaceC79973Va5;
        if (c47789IpF != null && (interfaceC79973Va5 = this.LJLJJI) != null) {
            int i = c47789IpF.LIZ;
            String str = c47789IpF.LIZLLL;
            if (str == null) {
                str = "";
            }
            interfaceC79973Va5.onError("player", i, str);
        }
    }

    @Override // X.InterfaceC47814Ipe
    public final void onPrepared(TTVideoEngine tTVideoEngine) {
        if (this.LJLLL != 1) {
            this.LJLLL = 1;
            LIZLLL();
            InterfaceC79973Va5 interfaceC79973Va5 = this.LJLJJI;
            if (interfaceC79973Va5 != null) {
                interfaceC79973Va5.LJIIZILJ(4);
            }
            InterfaceC79973Va5 interfaceC79973Va52 = this.LJLJJI;
            if (interfaceC79973Va52 != null) {
                interfaceC79973Va52.LJIIZILJ(this.LJLLL);
            }
        }
    }

    public C79971Va3(Context context, boolean z) {
        o.LJIIJ(context, "context");
        this.LJZ = context;
        this.LJLIL = new Handler(C16880lQ.LLJJJJ());
        this.LJLILLLLZI = "default";
        this.LJLJLJ = C221108m2.LIZIZ(C79975Va7.LJLIL);
        this.LJLJLLL = new C73359Sqh(context);
        this.LJLLLL = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
        this.LJLLLLLL = true;
        if (z) {
            HandlerThread handlerThread = new HandlerThread("AudioEnginePlayerThread");
            this.LJLZ = handlerThread;
            handlerThread.start();
        }
    }

    @Override // X.InterfaceC47814Ipe
    public final void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i) {
        InterfaceC79973Va5 interfaceC79973Va5 = this.LJLJJI;
        if (interfaceC79973Va5 != null) {
            interfaceC79973Va5.LJII(i);
        }
    }

    @Override // X.InterfaceC47814Ipe
    public final void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i) {
        if (this.LJLLL != i) {
            this.LJLLL = i;
            LIZLLL();
            InterfaceC79973Va5 interfaceC79973Va5 = this.LJLJJI;
            if (interfaceC79973Va5 != null) {
                interfaceC79973Va5.LJIIZILJ(this.LJLLL);
            }
        }
    }
}

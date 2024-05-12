package com.ss.android.ugc.playerkit.videoview;

import X.C2W7;
import X.C38354F3m;
import X.C46664ITc;
import X.C46734IVu;
import X.C46757IWr;
import X.C47246IgU;
import X.C47689Ind;
import X.C47716Io4;
import X.C47956Irw;
import X.C64734Pas;
import X.EF7;
import X.IFU;
import X.IFV;
import X.IL6;
import X.IL7;
import X.INO;
import X.INP;
import X.INQ;
import X.ITZ;
import X.IUZ;
import X.IVH;
import X.IX0;
import X.IX1;
import X.IX2;
import X.IX4;
import X.IX5;
import X.IXB;
import X.IXN;
import X.InterfaceC222728oe;
import X.InterfaceC46754IWo;
import X.PEH;
import X.V52;
import X.X1D;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.session.Session;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes9.dex */
public class VideoViewComponent implements GenericLifecycleObserver, InterfaceC222728oe, LifecycleObserver {
    public static final IVH LJLLJ = new IVH();
    public final boolean LJLIL;
    public C46757IWr LJLILLLLZI;
    public C47246IgU LJLJI;
    public final Set<OnUIPlayListener> LJLJJI;
    public Video LJLJJL;
    public Session LJLJJLL;
    public volatile boolean LJLJL;
    public boolean LJLJLJ;
    public int LJLJLLL;
    public final InterfaceC46754IWo LJLL;
    public final IFU LJLLI;
    public boolean LJLLILLLL;

    public final void LJI() {
        this.LJLLILLLL = true;
        C46757IWr c46757IWr = this.LJLILLLLZI;
        if (c46757IWr != null) {
            c46757IWr.setVolume(0.0f, 0.0f);
        }
    }

    public final void LJIILIIL() {
        this.LJLLILLLL = false;
        C46757IWr c46757IWr = this.LJLILLLLZI;
        if (c46757IWr != null) {
            c46757IWr.setVolume(1.0f, 1.0f);
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onPageResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPagePause();
        }
    }

    public final long LIZLLL() {
        C46757IWr c46757IWr = this.LJLILLLLZI;
        if (c46757IWr != null) {
            return c46757IWr.getCurrentPosition();
        }
        return 0L;
    }

    public final long LJ() {
        C46757IWr c46757IWr = this.LJLILLLLZI;
        if (c46757IWr != null) {
            return c46757IWr.getDuration();
        }
        return 0L;
    }

    public final boolean LJFF() {
        C46757IWr c46757IWr = this.LJLILLLLZI;
        if (c46757IWr != null) {
            return c46757IWr.isPlaying();
        }
        return false;
    }

    public final void LJIIIZ() {
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("release() called ");
            LIZ.append(this.LJLILLLLZI);
            IXB.LIZIZ("VideoViewComponent", X1D.LIZIZ(LIZ));
        }
        C46757IWr c46757IWr = this.LJLILLLLZI;
        if (c46757IWr != null) {
            c46757IWr.release();
        }
        C47246IgU c47246IgU = this.LJLJI;
        if (c47246IgU != null) {
            c47246IgU.Q7();
        }
    }

    public final void LJIIJJI() {
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("stop() called ");
            LIZ.append(this.LJLILLLLZI);
            IXB.LIZIZ("VideoViewComponent", X1D.LIZIZ(LIZ));
        }
        C46757IWr c46757IWr = this.LJLILLLLZI;
        if (c46757IWr != null) {
            if (IX2.LIZ && C46734IVu.LIZ(c46757IWr.getPlayerType()) && IXN.LIZJ.isEnableBytevc1BlackList()) {
                IX2.LIZ = this.LJLILLLLZI.LJLZ();
            }
            this.LJLILLLLZI.stop();
        }
        C47246IgU c47246IgU = this.LJLJI;
        if (c47246IgU != null) {
            c47246IgU.Q7();
        }
    }

    public final void pause() {
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("pause() called ");
            LIZ.append(this.LJLILLLLZI);
            IXB.LIZIZ("VideoViewComponent", X1D.LIZIZ(LIZ));
        }
        C46757IWr c46757IWr = this.LJLILLLLZI;
        if (c46757IWr != null) {
            c46757IWr.pause();
        }
        C47246IgU c47246IgU = this.LJLJI;
        if (c47246IgU != null) {
            c47246IgU.O7();
            C46757IWr c46757IWr2 = this.LJLILLLLZI;
            if (c46757IWr2 != null && c46757IWr2.getPlayerType() == ITZ.IjkHardware) {
                this.LJLJI.getClass();
            }
        }
    }

    public final void resume() {
        SimVideoUrlModel simVideoUrlModel;
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("resume() called ");
            LIZ.append(this.LJLILLLLZI);
            IXB.LIZIZ("VideoViewComponent", X1D.LIZIZ(LIZ));
        }
        Session session = this.LJLJJLL;
        if (session == null || (simVideoUrlModel = session.urlModel) == null) {
            return;
        }
        this.LJLILLLLZI.LJLILLLLZI(simVideoUrlModel.getSourceId());
    }

    public VideoViewComponent() {
        this.LJLJJI = Collections.newSetFromMap(new WeakHashMap());
        this.LJLJLLL = 0;
        this.LJLL = new V52();
        this.LJLLI = new IFU(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPagePause() {
        pause();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onPageResume() {
        resume();
    }

    public VideoViewComponent(int i) {
        this.LJLJJI = Collections.newSetFromMap(new WeakHashMap());
        this.LJLJLLL = 0;
        this.LJLL = new C47956Irw();
        this.LJLLI = new IFU(this);
        this.LJLIL = true;
    }

    public final void LIZ(OnUIPlayListener onUIPlayListener) {
        this.LJLJJI.add(onUIPlayListener);
        C46757IWr c46757IWr = this.LJLILLLLZI;
        if (c46757IWr != null) {
            c46757IWr.LJJJLL(this.LJLLI);
        }
    }

    public final void LIZIZ(ViewGroup viewGroup) {
        this.LJLJI = C47246IgU.LIZ(viewGroup, false, false, 0, 0);
        viewGroup.getContext();
        this.LJLJI.N7(new IX0(this));
    }

    public final boolean LIZJ(VideoUrlModel videoUrlModel) {
        Session session;
        if (videoUrlModel == null || (session = this.LJLJJLL) == null || session.urlModel == null || !C38354F3m.LIZJ(videoUrlModel.getUri(), this.LJLJJLL.urlModel.getUri()) || !C38354F3m.LIZJ(videoUrlModel.getRatio(), this.LJLJJLL.urlModel.getRatio()) || TextUtils.isEmpty(videoUrlModel.getSourceId()) || !this.LJLILLLLZI.LJLJL(videoUrlModel.getSourceId(), videoUrlModel.getBitRatedRatioUri())) {
            return false;
        }
        return true;
    }

    public final void LJIIJ(float f) {
        C46757IWr c46757IWr = this.LJLILLLLZI;
        if (c46757IWr != null) {
            c46757IWr.LJJIIJ(f);
        }
    }

    public final void LJIIL(Video video) {
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("tryResume() called ");
            LIZ.append(this.LJLILLLLZI);
            IXB.LIZIZ("VideoViewComponent", X1D.LIZIZ(LIZ));
        }
        VideoUrlModel playAddrBytevc1 = video.getPlayAddrBytevc1();
        VideoUrlModel playAddrH264 = video.getPlayAddrH264();
        if (playAddrBytevc1 == null && playAddrH264 == null) {
            return;
        }
        if (LIZJ(playAddrBytevc1) || LIZJ(playAddrH264)) {
            resume();
        } else {
            LJII(video, this.LJLJLLL);
        }
    }

    public final void LJIILJJIL(C47689Ind c47689Ind) {
        this.LJLJI = C47246IgU.LIZJ(c47689Ind);
        c47689Ind.getContext();
        this.LJLJI.N7(new IX0(this));
    }

    @Override // X.InterfaceC222728oe
    public final void LLIIIILZ(OnUIPlayListener onUIPlayListener) {
        C46757IWr c46757IWr;
        this.LJLJJI.remove(onUIPlayListener);
        if (this.LJLJJI.isEmpty() && (c46757IWr = this.LJLILLLLZI) != null) {
            c46757IWr.LJJJLL(null);
        }
    }

    public final void LJII(Video video, int i) {
        if (video != null) {
            this.LJLJJL = video;
            if (!this.LJLJI.d4()) {
                this.LJLJLJ = true;
                return;
            }
            if (this.LJLJL) {
                if (IXB.LIZ) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("render() called ");
                    LIZ.append(this.LJLILLLLZI);
                    IXB.LIZIZ("VideoViewComponent", X1D.LIZIZ(LIZ));
                }
                if (this.LJLILLLLZI != null) {
                    IFV.LIZ.LIZ(this);
                    this.LJLJL = false;
                    this.LJLILLLLZI.LJJLIL();
                    return;
                }
                return;
            }
            ITZ playerType = IXN.LIZJ.getPlayerType();
            if (IX2.LIZ && C46734IVu.LIZIZ(b.LJJIL(video.getPlayAddrBytevc1())) && C46734IVu.LIZ(playerType)) {
                LJIIIIZZ(video.getPlayAddrBytevc1(), false, i, video.isNeedSetCookie());
            } else {
                LJIIIIZZ(video.getPlayAddrH264(), false, i, video.isNeedSetCookie());
            }
        }
    }

    public final void LJIIIIZZ(VideoUrlModel videoUrlModel, boolean z, int i, boolean z2) {
        C46757IWr c46757IWr;
        List<String> urlList;
        if (IXB.LIZ) {
            IXB.LIZIZ("VideoViewComponent", "play() called " + this.LJLILLLLZI);
        }
        if (videoUrlModel == null || !C46734IVu.LIZIZ(b.LJJIL(videoUrlModel))) {
            return;
        }
        String uri = videoUrlModel.getUri();
        if (TextUtils.isEmpty(uri)) {
            PEH.LIZJ(new RuntimeException("VideoUrlModel url_key is null. vid=" + videoUrlModel.getSourceId()));
        }
        C46664ITc c46664ITc = C46664ITc.LJIJ;
        this.LJLJJLL = c46664ITc.LIZ(uri);
        this.LJLJLLL = i;
        if (this.LJLIL) {
            this.LJLILLLLZI = new C46757IWr(new IX5(IXN.LIZJ.getPlayerType()));
        } else {
            INO ino = INO.LIZJ;
            INP inp = ino.LIZIZ;
            ino.LIZ(uri);
            inp.getClass();
            IXN ixn = IXN.LIZJ;
            if (ixn.isMultiPlayer()) {
                c46757IWr = new C46757IWr(new IX5(ixn.getPlayerType()));
            } else {
                IX1 ix1 = IX1.LIZJ;
                ITZ playerType = ixn.getPlayerType();
                synchronized (ix1) {
                    if (ix1.LIZ == null) {
                        ix1.LIZIZ = playerType;
                        ix1.LIZ = new C46757IWr(new IX5(playerType));
                    } else {
                        ITZ itz = ix1.LIZIZ;
                        if (itz != null && !itz.equals(playerType)) {
                            ix1.LIZ.release();
                            ix1.LIZIZ = playerType;
                            ix1.LIZ = new C46757IWr(new IX5(playerType));
                        }
                    }
                    c46757IWr = ix1.LIZ;
                }
            }
            this.LJLILLLLZI = c46757IWr;
        }
        Session session = this.LJLJJLL;
        session.uri = uri;
        session.urlModel = b.LJJIL(videoUrlModel);
        this.LJLJJLL.playerType = this.LJLILLLLZI.getPlayerType();
        this.LJLILLLLZI.LJJJLL(this.LJLLI);
        this.LJLILLLLZI.LJLIIL(LJLLJ);
        this.LJLILLLLZI.LJLJLJ(this.LJLL);
        this.LJLILLLLZI.LJJZZI(IUZ.INSTANCE.playInfoCallback());
        C2W7.LIZIZ.LIZ(this.LJLJJLL.uri);
        C47716Io4.LIZ(uri);
        INQ inq = new INQ(videoUrlModel, this.LJLJJLL, z);
        IL7 il7 = new IL7(videoUrlModel);
        IXN ixn2 = IXN.LIZJ;
        IX4 ix4 = new IX4(inq, il7, ixn2.context(), videoUrlModel.getSourceId(), true, ixn2.prepareConfig(), false, videoUrlModel.isBytevc1() ? 1 : 0, 0, new IL6(videoUrlModel), uri, true, ixn2.isAsyncInit(), this.LJLJLLL);
        ix4.LJJII = ixn2.getPlayerFramesWait();
        String bitRatedRatioUri = videoUrlModel.getBitRatedRatioUri();
        ix4.LJJIIJZLJL = bitRatedRatioUri;
        c46664ITc.LJIIZILJ(bitRatedRatioUri, videoUrlModel.getFileCheckSum());
        ix4.LJJJ = ixn2.isUseVideoTextureRenderer();
        if (z2 && (urlList = videoUrlModel.getUrlList()) != null && urlList.size() > 0) {
            boolean z3 = true;
            for (String str : urlList) {
                Context LIZIZ = EF7.LIZIZ();
                if (!TextUtils.isEmpty(str) && str.startsWith("https://")) {
                    if (C64734Pas.LJIIIZ(LIZIZ).LIZLLL(URI.create(str).getHost()) != null) {
                    }
                }
                z3 = false;
            }
            if (z3) {
                ix4.LJJJI = true;
            }
        }
        this.LJLILLLLZI.setSurface(this.LJLJI.getSurface());
        this.LJLILLLLZI.LJLIIIL(ix4);
        if (this.LJLLILLLL) {
            this.LJLILLLLZI.setVolume(0.0f, 0.0f);
        } else {
            this.LJLILLLLZI.setVolume(1.0f, 1.0f);
        }
        C47246IgU c47246IgU = this.LJLJI;
        if (c47246IgU != null) {
            c47246IgU.Q7();
        }
    }
}

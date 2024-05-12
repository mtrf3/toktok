package X;

import Y.IDHandlerS25S0100000_15;
import Y.IDTListenerS122S0100000_14;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.ss.android.videoshop.context.VideoContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes16.dex */
public final class YS3 extends YS2 implements InterfaceC79993VaP {
    public YS6 LLIIIILZ;
    public RelativeLayout LLIIIJ;
    public RelativeLayout LLIIIL;
    public final C87429YSz LLIIIZ;
    public final C87421YSr LLIIJI;
    public YS4 LLIIJLIL;
    public List<YS2> LLIIL;
    public boolean LLIILII;
    public VideoContext LLIILZL;

    @Override // X.YS2, X.InterfaceC87408YSe
    public final void onPreFullScreen(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, YTJ ytj, boolean z, int i, boolean z2, boolean z3) {
    }

    @Override // X.YS2
    public final void LJIL() {
        C79985VaH c79985VaH = this.LJLJJLL;
        if (c79985VaH == null) {
            return;
        }
        EnumC48219IwB enumC48219IwB = EnumC48219IwB.INS;
        enumC48219IwB.trace(c79985VaH, YSM.LAYER_HOST_PLAY, null, null, getVideoStateInquirer());
        this.LLFF = true;
        if (!this.LLIILZL.isCurrentSource(this.LJLJJLL)) {
            C48672J8i.LIZIZ(this.LLIILZL.getPlayEntity(), "play_next");
            this.LLIILZL.release();
        }
        LJJIFFI();
        enumC48219IwB.trace(this.LJLJJLL, YSM.LAYER_HOST_RELEASE_LAST, null, null, getVideoStateInquirer());
        if (!this.LJLL.isPlayed()) {
            setTextureLayout(this.LJLJL.LJII);
        }
        setRenderMode(this.LJLJL.LJIIIIZZ);
        this.LLIILZL.setLayerHostMediaLayout(this);
        this.LLIILZL.setPlaySettings(this.LJLJJLL.LJIIIIZZ);
        KL2.LJIILLIIL(0, this);
        KL2.LJIILLIIL(0, this.LLIIIJ);
        KL2.LJIILLIIL(0, this.LJLILLLLZI.getVideoContainer());
        LJJ();
        KL2.LJIILLIIL(0, this.LLIIIJ);
        KL2.LJIILLIIL(0, this.LJLILLLLZI.getVideoContainer());
        VideoContext videoContext = this.LLIILZL;
        this.LJLJJLL.getClass();
        videoContext.setPortrait(false);
        VideoContext videoContext2 = this.LLIILZL;
        this.LJLJJLL.getClass();
        videoContext2.setRotateEnabled(false);
        this.LLIILZL.changeOrientationIfNeed();
    }

    @Override // X.YS2
    public final void LJJI() {
        VideoContext videoContext;
        if (!this.LJLLILLLL.LIZJ() && this.LLIILII) {
            KL2.LJIILLIIL(8, this.LLIIIJ);
            KL2.LJIILLIIL(8, this.LJLILLLLZI.getVideoContainer());
            KL2.LJIILLIIL(0, this.LLIIIL);
        }
        if (LJIILLIIL() && (videoContext = this.LLIILZL) != null && !videoContext.isFullScreen()) {
            if (this.LLII == null) {
                this.LLII = new IDHandlerS25S0100000_15(this, C16880lQ.LLJJJJ(), 3);
            }
            this.LLII.sendEmptyMessageDelayed(0, 500L);
            if (LJIILLIIL()) {
                setBackgroundColor(0);
            }
        }
        super.LJJI();
    }

    public final void LJJIIZ() {
        List<YS2> list = this.LLIIL;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((YS2) it.next()).LJJI();
            }
        }
    }

    @Override // X.InterfaceC79993VaP
    public C79985VaH getBindPlayEntity() {
        YS4 ys4 = this.LLIIJLIL;
        if (ys4 != null) {
            return ys4.getPlayEntity();
        }
        return null;
    }

    public boolean getDeactiveLayerWhenRelease() {
        YS6 ys6 = this.LLIIIILZ;
        if (ys6 != null && ys6.LJIIIIZZ) {
            return true;
        }
        return false;
    }

    public YTG getLayerEventListener() {
        YS6 ys6 = this.LLIIIILZ;
        if (ys6 != null) {
            ys6.getClass();
        }
        return null;
    }

    public YS4 getParentView() {
        YS4 ys4 = this.LLIIJLIL;
        if (ys4 != null && ys4 == getParent()) {
            return this.LLIIJLIL;
        }
        if (getParent() instanceof YS4) {
            this.LLIIJLIL = (YS4) getParent();
        }
        return this.LLIIJLIL;
    }

    public YS2 getPlayingVideoPatch() {
        List<YS2> list = this.LLIIL;
        if (list != null) {
            for (YS2 ys2 : list) {
                if (ys2.LJIILJJIL()) {
                    return ys2;
                }
            }
            return null;
        }
        return null;
    }

    public boolean getUseActiveLayers() {
        YS6 ys6 = this.LLIIIILZ;
        if (ys6 != null && ys6.LJII) {
            return true;
        }
        return false;
    }

    public int getVideoHeight() {
        YSF videoView = this.LJLILLLLZI.getVideoView();
        if (videoView != null) {
            return videoView.getHeight();
        }
        return 0;
    }

    public int getVideoWidth() {
        YSF videoView = this.LJLILLLLZI.getVideoView();
        if (videoView != null) {
            return videoView.getWidth();
        }
        return 0;
    }

    private C46886Iag getPlaybackParams() {
        C46886Iag playbackParams;
        InterfaceC48221IwD videoStateInquirer = getVideoStateInquirer();
        if (videoStateInquirer == null || (playbackParams = videoStateInquirer.getPlaybackParams()) == null) {
            return new C46886Iag();
        }
        return playbackParams;
    }

    @Override // X.YS2
    public final void LJIJJLI() {
        super.LJIJJLI();
        this.LLIILZL.setKeepScreenOn(hashCode(), false);
    }

    @Override // X.YS2
    public final void LJJIFFI() {
        super.LJJIFFI();
        YS7 retrievePreparedVideoController = this.LLIILZL.retrievePreparedVideoController(this.LJLJJLL);
        if (retrievePreparedVideoController != null) {
            this.LJLL = retrievePreparedVideoController;
            if (this.LJLJJLL != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("1 retrieve prepared controller vid:");
                LIZ.append(this.LJLJJLL.LIZ);
                LIZ.append(" title:");
                C05L.LJ(this.LJLJJLL, LIZ, null, LIZ);
            }
            if (LJIILLIIL()) {
                LJJIII(this.LJLL.getCurrentVideoInfo());
            } else {
                YD6 retrievePreparedTextureVideoView = this.LLIILZL.retrievePreparedTextureVideoView(this.LJLJJLL);
                YSD ysd = this.LJLILLLLZI;
                if ((ysd instanceof YD7) && retrievePreparedTextureVideoView != null) {
                    YD7 yd7 = (YD7) ysd;
                    yd7.getClass();
                    KL2.LIZIZ(retrievePreparedTextureVideoView);
                    KL2.LIZIZ(yd7.LJLIL);
                    yd7.LJLIL = retrievePreparedTextureVideoView;
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 17;
                    yd7.addView(retrievePreparedTextureVideoView, 0, layoutParams);
                    yd7.LJLIL.setAlpha(YD7.LJI());
                    retrievePreparedTextureVideoView.setSurfaceTextureListener(null);
                    yd7.LJLJJL = 0;
                    yd7.LJLJJI = 0;
                    YD6 textureVideoView = yd7.getTextureVideoView();
                    this.LJLJI = textureVideoView;
                    textureVideoView.setSurfaceCallback(this);
                    LJJIII(this.LJLL.getCurrentVideoInfo());
                }
            }
            EnumC48216Iw8.INS.addTrace(this.LJLJJLL, C48217Iw9.LIZIZ("RetrieveVC", YDG.PLAY, 6));
            this.LJLL.setPlayEntity(this.LJLJJLL);
        }
    }

    public ViewGroup getLayerForePlayContainer() {
        return this.LLIIIL;
    }

    public YS6 getLayerHost() {
        return this.LLIIIILZ;
    }

    @Override // X.InterfaceC79993VaP
    public ViewGroup getLayerMainContainer() {
        return this.LLIIIJ;
    }

    public RelativeLayout getLayerRoot() {
        return this.LLIIIJ;
    }

    @Override // X.InterfaceC79993VaP
    public ViewGroup getLayerRootContainer() {
        return this.LLIIIJ;
    }

    public List<YS2> getVideoPatchLayouts() {
        return this.LLIIL;
    }

    public YS3(Context context) {
        super(context);
        this.LLIIIZ = new C87429YSz();
        this.LLIIJI = new C87421YSr();
        this.LLIILII = true;
    }

    @Override // X.YS2, X.InterfaceC87405YSb
    public final boolean LIZ(C47163If9 c47163If9) {
        return this.LLIIIILZ.LJ(new YT1());
    }

    @Override // X.YS2, X.InterfaceC87405YSb
    public final boolean LIZIZ(EnumC48190Ivi enumC48190Ivi) {
        boolean LIZIZ = super.LIZIZ(enumC48190Ivi);
        if (this.LLIIIILZ.LJ(new C87427YSx()) || LIZIZ) {
            return true;
        }
        return false;
    }

    @Override // X.YS2
    public final YTJ LJIIIIZZ(Context context) {
        return VideoContext.getVideoContext(context);
    }

    @Override // X.YS2
    public final void LJIILIIL(Context context) {
        super.LJIILIIL(context);
        this.LLIILZL = VideoContext.getVideoContext(context);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.LLIIIJ = relativeLayout;
        addView(relativeLayout, new FrameLayout.LayoutParams(-1, -1));
        RelativeLayout relativeLayout2 = new RelativeLayout(context);
        this.LLIIIL = relativeLayout2;
        addView(relativeLayout2, new FrameLayout.LayoutParams(-1, -1));
        YS6 ys6 = new YS6();
        this.LLIIIILZ = ys6;
        ys6.LJFF = this;
        this.LLIIIJ.setOnTouchListener(new IDTListenerS122S0100000_14(this, 7));
        KL2.LJIILLIIL(8, this.LLIIIJ);
        this.LLIIIJ.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC80460Vhw(this));
    }

    public final boolean LJJIIJZLJL(YT8 yt8) {
        if (yt8 != null) {
            return this.LLIIIILZ.LJ(yt8);
        }
        return false;
    }

    public void setCanPlayBackground(boolean z) {
        this.LJLJJL = z;
    }

    public void setDeactiveLayerWhenRelease(boolean z) {
        YS6 ys6 = this.LLIIIILZ;
        if (ys6 != null) {
            ys6.LJIIIIZZ = z;
        }
    }

    public void setHideHostWhenRelease(boolean z) {
        this.LLIILII = z;
    }

    public void setKeepPosition(boolean z) {
        this.LJLJL.LIZJ = z;
    }

    public void setLayerEventListener(YTG ytg) {
        YS6 ys6 = this.LLIIIILZ;
        if (ys6 != null) {
            ys6.getClass();
        }
    }

    public void setLayerRootOnTouchListener(View.OnTouchListener onTouchListener) {
        RelativeLayout relativeLayout = this.LLIIIJ;
        if (relativeLayout != null && onTouchListener != null) {
            relativeLayout.setOnTouchListener(onTouchListener);
        }
    }

    @Override // X.YS2
    public void setMute(boolean z) {
        super.setMute(z);
        if (z) {
            if (this.LLIILZL.isNoAudioFocusWhenMute()) {
                this.LLIILZL.stopVideoAudioFocusController();
            }
        } else {
            if (this.LLIILZL.isAbandonAudioFocusWhenComplete() && this.LLIILZL.isPlayCompleted()) {
                return;
            }
            if (this.LLIILZL.isAbandonAudioFocusWhenPause() && this.LLIILZL.isPaused()) {
                return;
            }
            this.LLIILZL.startVideoAudioFocusController();
        }
    }

    public void setParentView(YS4 ys4) {
        this.LLIIJLIL = ys4;
    }

    public void setUseActiveLayers(boolean z) {
        YS6 ys6 = this.LLIIIILZ;
        if (ys6 != null) {
            ys6.LJII = z;
        }
    }

    public static void LJJIIJ(View view, List list) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() > 0) {
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof YS2) {
                        ArrayList arrayList = (ArrayList) list;
                        if (!arrayList.contains(childAt)) {
                            arrayList.add(childAt);
                        }
                    } else if (childAt instanceof ViewGroup) {
                        LJJIIJ(childAt, list);
                    }
                }
            }
        }
    }

    @Override // X.YS2, X.YS9
    public final void onBufferEnd(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        this.LLIIIILZ.LJ(new C79377VDh(109));
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH)) {
            this.LLIILZL.onBufferEnd(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS2, X.YS9
    public final void onBufferStart(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        this.LLIIIILZ.LJ(new C79377VDh(107));
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH)) {
            this.LLIILZL.onBufferStart(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS2, X.YS9
    public final void onEngineInitPlay(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        super.onEngineInitPlay(interfaceC48221IwD, c79985VaH);
        this.LLIIIILZ.LJ(new C79377VDh(100));
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH)) {
            this.LLIILZL.onEngineInitPlay(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS2, X.YS9
    public final void onFirstPlayStart(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        super.onFirstPlayStart(interfaceC48221IwD, c79985VaH);
        this.LLIIIILZ.LJ(new C79377VDh(122));
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH)) {
            this.LLIILZL.onFirstPlayStart(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS2, X.YS9
    public final void onPreRenderStart(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        super.onPreRenderStart(interfaceC48221IwD, c79985VaH);
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH)) {
            this.LLIILZL.onPreRenderStart(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS2, X.YS9
    public final void onPrepare(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        this.LLIIIILZ.LJ(new C79377VDh(110));
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH)) {
            this.LLIILZL.onPrepare(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS2, X.YS9
    public final void onPrepared(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        this.LLIIIILZ.LJ(new C79377VDh(111));
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH)) {
            this.LLIILZL.onPrepared(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS2, X.YS9
    public final void onRenderStart(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        super.onRenderStart(interfaceC48221IwD, c79985VaH);
        this.LLIIIILZ.LJ(new C79377VDh(112));
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH)) {
            this.LLIILZL.onRenderStart(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS2, X.YS9
    public final void onVideoCompleted(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        super.onVideoCompleted(interfaceC48221IwD, c79985VaH);
        if (interfaceC48221IwD == null || !interfaceC48221IwD.isLoop()) {
            this.LLIILZL.setKeepScreenOn(hashCode(), false);
        }
        this.LLIIIILZ.LJ(new C79377VDh(102));
        if (this.LJLJL.LJFF) {
            this.LLIIIILZ.LJ(new C79377VDh(114));
        }
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH)) {
            this.LLIILZL.onVideoCompleted(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS2, X.YS9
    public final void onVideoPause(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        this.LLIIIILZ.LJ(new C79377VDh(106));
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH)) {
            this.LLIILZL.onVideoPause(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS2, X.YS9
    public final void onVideoPlay(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        this.LLIIIILZ.LJ(new C79377VDh(105));
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH)) {
            this.LLIILZL.onVideoPlay(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS2, X.YS9
    public final void onVideoPreCompleted(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH)) {
            this.LLIILZL.onVideoPreCompleted(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS2, X.YS9
    public final void onVideoPreRelease(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        if (this.LLIILII) {
            KL2.LJIILLIIL(8, this.LLIIIJ);
            KL2.LJIILLIIL(8, this.LJLILLLLZI.getVideoContainer());
            KL2.LJIILLIIL(0, this.LLIIIL);
        }
        super.onVideoPreRelease(interfaceC48221IwD, c79985VaH);
        this.LLIILZL.setKeepScreenOn(hashCode(), false);
        this.LLIIIILZ.LJ(new C87428YSy());
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null) {
            videoContext.onVideoPreRelease(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS2, X.YS9
    public final void onVideoReleased(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        super.onVideoReleased(interfaceC48221IwD, c79985VaH);
        this.LLIIIILZ.LJ(new C79377VDh(101));
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null) {
            videoContext.onVideoReleased(interfaceC48221IwD, c79985VaH);
            this.LLIILZL.removePrepareLayerHostMediaLayout(this);
        }
    }

    @Override // X.YS2, X.YS9
    public final void onVideoReplay(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        super.onVideoReplay(interfaceC48221IwD, c79985VaH);
        this.LLIIIILZ.LJ(new C79377VDh(202));
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH)) {
            this.LLIILZL.onVideoReplay(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS2, X.YS9
    public final void onVideoRetry(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        super.onVideoRetry(interfaceC48221IwD, c79985VaH);
        this.LLIIIILZ.LJ(new C79377VDh(203));
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH)) {
            this.LLIILZL.onVideoRetry(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS2, X.InterfaceC87411YSh
    public final C47160If6 LJFF(InterfaceC48221IwD interfaceC48221IwD, C47164IfA c47164IfA, C79985VaH c79985VaH) {
        C47160If6 LJFF = super.LJFF(interfaceC48221IwD, c47164IfA, c79985VaH);
        this.LLIIIILZ.LJ(new C79377VDh(311, LJFF));
        return LJFF;
    }

    @Override // X.YS2, X.YS9
    public final void onBufferCount(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i) {
        this.LLIIIILZ.LJ(new C79377VDh(121, Integer.valueOf(i)));
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH)) {
            this.LLIILZL.onBufferCount(interfaceC48221IwD, c79985VaH, i);
        }
    }

    @Override // X.YS2, X.YS9
    public final void onBufferingUpdate(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i) {
        this.LLIIJI.getClass();
        this.LLIIIILZ.LJ(this.LLIIJI);
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH)) {
            this.LLIILZL.onBufferingUpdate(interfaceC48221IwD, c79985VaH, i);
        }
    }

    @Override // X.YS2, X.YS9
    public final void onEnginePlayStart(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i) {
        super.onEnginePlayStart(interfaceC48221IwD, c79985VaH, i);
        this.LLIILZL.setKeepScreenOn(hashCode(), true);
        this.LLIIIILZ.LJ(new C79377VDh(104, Integer.valueOf(i)));
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH)) {
            this.LLIILZL.onEnginePlayStart(interfaceC48221IwD, c79985VaH, i);
        }
        if (i == 1 || i == 6 || i == 4 || i == 5) {
            onFirstPlayStart(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS2, X.YS9
    public final void onError(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, C47789IpF c47789IpF) {
        super.onError(interfaceC48221IwD, c79985VaH, c47789IpF);
        this.LLIILZL.setKeepScreenOn(hashCode(), false);
        this.LLIIIILZ.LJ(new C79377VDh(113, c47789IpF));
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH)) {
            this.LLIILZL.onError(interfaceC48221IwD, c79985VaH, c47789IpF);
        }
    }

    @Override // X.YS2, X.YS9
    public final void onFetchVideoModel(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, boolean z) {
        super.onFetchVideoModel(interfaceC48221IwD, c79985VaH, z);
        this.LLIIIILZ.LJ(new C79377VDh(118));
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH)) {
            this.LLIILZL.onFetchVideoModel(interfaceC48221IwD, c79985VaH, z);
        }
    }

    @Override // X.YS2, X.YS9
    public final void onLoadStateChanged(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i) {
        super.onLoadStateChanged(interfaceC48221IwD, c79985VaH, i);
        if (i == 3) {
            this.LLIIIILZ.LJ(new C79377VDh(116));
        }
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH)) {
            this.LLIILZL.onLoadStateChanged(interfaceC48221IwD, c79985VaH, i);
        }
    }

    @Override // X.YS2, X.YS9
    public final void onPlaybackStateChanged(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i) {
        super.onPlaybackStateChanged(interfaceC48221IwD, c79985VaH, i);
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH)) {
            this.LLIILZL.onPlaybackStateChanged(interfaceC48221IwD, c79985VaH, i);
        }
    }

    @Override // X.YS2, X.YS9
    public final void onPreVideoSeek(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, long j) {
        super.onPreVideoSeek(interfaceC48221IwD, c79985VaH, j);
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH)) {
            this.LLIILZL.onPreVideoSeek(interfaceC48221IwD, c79985VaH, j);
        }
    }

    @Override // X.YS2, X.YS9
    public final void onRenderSeekComplete(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, boolean z) {
        super.onRenderSeekComplete(interfaceC48221IwD, c79985VaH, z);
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH)) {
            this.LLIILZL.onRenderSeekComplete(interfaceC48221IwD, c79985VaH, z);
        }
    }

    @Override // X.YS2, X.YS9
    public final void onStreamChanged(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i) {
        this.LLIIIILZ.LJ(new C79377VDh(117, Integer.valueOf(i)));
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH)) {
            this.LLIILZL.onStreamChanged(interfaceC48221IwD, c79985VaH, i);
        }
    }

    @Override // X.YS2, X.YS9
    public final void onVideoEngineInfos(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, C47620ImW c47620ImW) {
        super.onVideoEngineInfos(interfaceC48221IwD, c79985VaH, c47620ImW);
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH)) {
            this.LLIILZL.onVideoEngineInfos(interfaceC48221IwD, c79985VaH, c47620ImW);
        }
    }

    @Override // X.YS2, X.YS9
    public final void onVideoSeekComplete(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, boolean z) {
        YT0 yt0 = new YT0();
        interfaceC48221IwD.getCurrentPosition();
        interfaceC48221IwD.getDuration();
        this.LLIIIILZ.LJ(yt0);
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH)) {
            this.LLIILZL.onVideoSeekComplete(interfaceC48221IwD, c79985VaH, z);
        }
    }

    @Override // X.YS2, X.YS9
    public final void onVideoSeekStart(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, long j) {
        super.onVideoSeekStart(interfaceC48221IwD, c79985VaH, j);
        this.LLIIIILZ.LJ(new C79377VDh(207, Long.valueOf(j)));
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH)) {
            this.LLIILZL.onVideoSeekStart(interfaceC48221IwD, c79985VaH, j);
        }
    }

    @Override // X.YS2, X.YS9
    public final void onVideoStatusException(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i) {
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH)) {
            this.LLIILZL.onVideoStatusException(interfaceC48221IwD, c79985VaH, i);
        }
    }

    @Override // X.YS2, X.InterfaceC87409YSf
    public final void onBarrageMaskCallback(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i, String str) {
        super.onBarrageMaskCallback(interfaceC48221IwD, c79985VaH, i, str);
        this.LLIIIILZ.LJ(new C87420YSq());
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH)) {
            this.LLIILZL.onBarrageMaskCallback(interfaceC48221IwD, c79985VaH, i, str);
        }
    }

    @Override // X.YS2, X.InterfaceC87409YSf
    public final void onExternalSubtitlesCallback(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i, String str) {
        super.onExternalSubtitlesCallback(interfaceC48221IwD, c79985VaH, i, str);
        this.LLIIIILZ.LJ(new C87423YSt());
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH)) {
            this.LLIILZL.onExternalSubtitlesCallback(interfaceC48221IwD, c79985VaH, i, str);
        }
    }

    @Override // X.YS2, X.InterfaceC87409YSf
    public final void onExternalSubtitlesPathInfoCallback(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, String str, C47789IpF c47789IpF) {
        super.onExternalSubtitlesPathInfoCallback(interfaceC48221IwD, c79985VaH, str, c47789IpF);
        this.LLIIIILZ.LJ(new C87424YSu());
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH)) {
            this.LLIILZL.onExternalSubtitlesPathInfoCallback(interfaceC48221IwD, c79985VaH, str, c47789IpF);
        }
    }

    @Override // X.YS2, X.YS9
    public final void onFrameDraw(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i, java.util.Map map) {
        super.onFrameDraw(interfaceC48221IwD, c79985VaH, i, map);
        this.LLIIIILZ.LJ(new C79377VDh(215, Integer.valueOf(i)));
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH)) {
            this.LLIILZL.onFrameDraw(interfaceC48221IwD, c79985VaH, i, map);
        }
    }

    @Override // X.YS2, X.YS9
    public final void onProgressUpdate(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i, int i2) {
        super.onProgressUpdate(interfaceC48221IwD, this.LJLJJLL, i, i2);
        this.LLIIIZ.getClass();
        this.LLIIIZ.getClass();
        this.LLIIIILZ.LJ(this.LLIIIZ);
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH)) {
            this.LLIILZL.onProgressUpdate(interfaceC48221IwD, c79985VaH, i, i2);
        }
    }

    @Override // X.YS2, X.YS9
    public final void onResolutionChanged(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, EnumC47176IfM enumC47176IfM, boolean z) {
        this.LLIIIILZ.LJ(new C87415YSl(enumC47176IfM));
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH)) {
            this.LLIILZL.onResolutionChanged(interfaceC48221IwD, c79985VaH, enumC47176IfM, z);
        }
    }

    @Override // X.YS2, X.InterfaceC87409YSf
    public final void onSubSwitchCompletedCallback(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i, int i2) {
        super.onSubSwitchCompletedCallback(interfaceC48221IwD, c79985VaH, i, i2);
        this.LLIIIILZ.LJ(new C87425YSv());
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH)) {
            this.LLIILZL.onSubSwitchCompletedCallback(interfaceC48221IwD, c79985VaH, i, i2);
        }
    }

    @Override // X.YS2, X.YS9
    public final void onVideoSizeChanged(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i, int i2) {
        super.onVideoSizeChanged(interfaceC48221IwD, this.LJLJJLL, i, i2);
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH)) {
            this.LLIILZL.onVideoSizeChanged(interfaceC48221IwD, c79985VaH, i, i2);
        }
    }

    @Override // X.YS2, X.YS9
    public final void onVideoStreamBitrateChanged(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, EnumC47176IfM enumC47176IfM, int i) {
        super.onVideoStreamBitrateChanged(interfaceC48221IwD, c79985VaH, enumC47176IfM, i);
        this.LLIIIILZ.LJ(new C87419YSp());
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH)) {
            this.LLIILZL.onVideoStreamBitrateChanged(interfaceC48221IwD, c79985VaH, enumC47176IfM, i);
        }
    }

    @Override // X.YS2, X.YS9
    public final void onResolutionChangedByQuality(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, String str, boolean z, boolean z2) {
        this.LLIIIILZ.LJ(new C87422YSs());
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH)) {
            this.LLIILZL.onResolutionChangedByQuality(interfaceC48221IwD, c79985VaH, str, z, z2);
        }
    }

    @Override // X.YS2, X.InterfaceC87408YSe
    public final void onFullScreen(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, boolean z, int i, boolean z2, boolean z3) {
        VideoContext videoContext = this.LLIILZL;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH)) {
            this.LLIILZL.onFullScreen(interfaceC48221IwD, c79985VaH, z, i, z2, z3);
        }
    }
}

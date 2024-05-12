package X;

import Y.ARunnableS51S0100000_15;
import Y.IDHandlerS25S0100000_15;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextUtils;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.videoshop.controller.VideoController;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes16.dex */
public class YS2 extends FrameLayout implements YDA, InterfaceC87404YSa, InterfaceC87411YSh {
    public final C28455BEt LJLIL;
    public YSD LJLILLLLZI;
    public YSF LJLJI;
    public View LJLJJI;
    public boolean LJLJJL;
    public C79985VaH LJLJJLL;
    public C79994VaQ LJLJL;
    public int LJLJLJ;
    public YTJ LJLJLLL;
    public YS7 LJLL;
    public C32810CuE LJLLI;
    public VIA LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public InterfaceC87405YSb LJLLLL;
    public InterfaceC44732Hh2 LJLLLLLL;
    public InterfaceC58392Mvs LJLZ;
    public final List<InterfaceC87404YSa> LJZ;
    public Lifecycle LJZI;
    public AbstractC47819Ipj LJZL;
    public YTA LL;
    public boolean LLD;
    public boolean LLF;
    public boolean LLFF;
    public C46886Iag LLFFF;
    public long LLFII;
    public boolean LLFZ;
    public boolean LLI;
    public boolean LLIFFJFJJ;
    public IDHandlerS25S0100000_15 LLII;
    public final ARunnableS51S0100000_15 LLIIII;

    @Override // X.InterfaceC87405YSb
    public boolean LIZ(C47163If9 c47163If9) {
        return false;
    }

    public YTJ LJIIIIZZ(Context context) {
        return null;
    }

    public void LJIJJLI() {
        this.LLFF = false;
        this.LJLLILLLL.LIZ();
        YS7 ys7 = this.LJLL;
        if (ys7 != null) {
            ys7.pause();
        }
    }

    public void LJJI() {
        this.LLFF = false;
        YS7 ys7 = this.LJLL;
        if (ys7 != null) {
            ys7.release();
        }
        this.LJLLILLLL.LIZ();
    }

    @Override // X.InterfaceC87408YSe
    public final void handleOtherSensorRotateAnyway(boolean z, int i) {
    }

    @Override // X.InterfaceC87404YSa
    public final boolean onExecCommand(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, YTL ytl) {
        return false;
    }

    @Override // X.InterfaceC87408YSe
    public final boolean onInterceptFullScreen(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, boolean z, int i, boolean z2) {
        return false;
    }

    public final void LJII() {
        EnumC48219IwB.INS.trace(this.LJLJJLL, YSM.VIDEO_PATCH_DO_PLAY, null, null, getVideoStateInquirer());
        this.LJLL.play();
        if (!this.LLFF) {
            LJIJJLI();
        }
    }

    public final void LJIIL() {
        YSD yd5;
        YSF ysf = this.LJLJI;
        if (ysf != null) {
            if (this.LJLLLLLL == null) {
                this.LJLLLLLL = new C44729Hgz();
            }
            boolean z = ysf instanceof SurfaceView;
            this.LJLLLLLL.getClass();
            if (!z) {
                return;
            }
            setUseSurfaceView(false);
            return;
        }
        C28455BEt c28455BEt = this.LJLIL;
        c28455BEt.LIZ = this.LJLJLJ;
        Context context = getContext();
        if (c28455BEt.LIZ == 0) {
            yd5 = new YD7(context);
        } else {
            yd5 = new YD5(context);
        }
        this.LJLILLLLZI = yd5;
        setTextureLayout(this.LJLJL.LJII);
        Object obj = this.LJLILLLLZI;
        if (obj instanceof YD7) {
            ((View) obj).setBackgroundColor(this.LJLJL.LJI);
        }
        YSF videoView = this.LJLILLLLZI.getVideoView();
        this.LJLJI = videoView;
        videoView.setSurfaceCallback(this);
        View blackCoverView = this.LJLILLLLZI.getBlackCoverView();
        this.LJLJJI = blackCoverView;
        if (!this.LLD) {
            blackCoverView.setVisibility(8);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.LJLILLLLZI.getVideoContainer(), 0, layoutParams);
        KL2.LJIILLIIL(8, this.LJLILLLLZI.getVideoContainer());
    }

    public final boolean LJIILJJIL() {
        YS7 ys7 = this.LJLL;
        if (ys7 != null && ys7.isPlaying()) {
            return true;
        }
        return false;
    }

    public final boolean LJIILL() {
        YS7 ys7 = this.LJLL;
        if (ys7 == null || ys7.isReleased()) {
            return true;
        }
        return false;
    }

    public final boolean LJIILLIIL() {
        int i = this.LJLJLJ;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    public final void LJIJI() {
        if (this.LJLL != null) {
            if (this.LJLJJLL != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onSurfaceCreated setSurface vid:");
                LIZ.append(this.LJLJJLL.LIZ);
                LIZ.append(" title:");
                this.LJLJJLL.getClass();
                LIZ.append((String) null);
                LIZ.append("hash:");
                LIZ.append(this.LJLL.hashCode());
                LIZ.append(" VideoViewType = ");
                LIZ.append(this.LJLJLJ);
                X1D.LIZIZ(LIZ);
            }
            this.LJLJL.getClass();
            int i = this.LJLJLJ;
            if (i == 0 || i == 2) {
                this.LJLL.setSurface(getSurface());
            }
            if (this.LJLJLJ == 1 && this.LJLL.isPrepared() && !this.LJLL.isRenderStarted()) {
                this.LJLL.setSurfaceHolder(getSurfaceHolder());
            }
            this.LJLLILLLL.LIZIZ();
        }
        EnumC48219IwB enumC48219IwB = EnumC48219IwB.INS;
        C79985VaH c79985VaH = this.LJLJJLL;
        YSM ysm = YSM.SURFACE_AVAILABLE;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("VideoViewType = ");
        LIZ2.append(this.LJLJLJ);
        enumC48219IwB.trace(c79985VaH, ysm, X1D.LIZIZ(LIZ2), null, getVideoStateInquirer());
        if (this.LLIFFJFJJ && LJIILLIIL()) {
            VIF.LIZ().post(new ARunnableS51S0100000_15(this, 100));
            this.LLIFFJFJJ = false;
        }
    }

    public void LJIL() {
        if (this.LJLJJLL == null) {
            return;
        }
        this.LLFF = true;
        LJIIL();
        LJJIFFI();
        LJJ();
    }

    public void LJJIFFI() {
        YSF ysf;
        YS7 ys7 = this.LJLL;
        if (ys7 == null) {
            VideoController LJIIZILJ = LJIIZILJ(this.LJLJLLL);
            this.LJLL = LJIIZILJ;
            LJIIZILJ.setVideoViewType(this.LJLJLJ);
            return;
        }
        C79985VaH playEntity = ys7.getPlayEntity();
        if (playEntity == null || playEntity.equals(this.LJLJJLL)) {
            return;
        }
        C48672J8i.LIZIZ(playEntity, "play_next");
        this.LJLL.release();
        if (!LJIILLIIL() || this.LJLL.isPlayed() || !KL2.LJIILJJIL(this.LJLJI.getView()) || (ysf = this.LJLJI) == null || !KL2.LJIILJJIL(ysf.getView())) {
            return;
        }
        KL2.LJIILLIIL(8, this.LJLJI.getView());
    }

    public int getCurrentPosition() {
        boolean z = this.LJLLJ;
        YS7 ys7 = this.LJLL;
        if (ys7 == null) {
            return 0;
        }
        return ys7.getCurrentPosition(z);
    }

    public int getDuration() {
        YS7 ys7 = this.LJLL;
        if (ys7 == null) {
            return 0;
        }
        return ys7.getDuration();
    }

    public C46886Iag getPlayBackParams() {
        YS7 ys7 = this.LJLL;
        if (ys7 != null) {
            return ys7.getPlaybackParams();
        }
        return this.LLFFF;
    }

    public Surface getSurface() {
        YSF ysf = this.LJLJI;
        if (ysf != null) {
            return ysf.getSurface();
        }
        return null;
    }

    public SurfaceHolder getSurfaceHolder() {
        YSF ysf = this.LJLJI;
        if (ysf != null) {
            return ysf.getSurfaceHolder();
        }
        return null;
    }

    public int getTextureLayout() {
        return this.LJLILLLLZI.getTextureLayout();
    }

    public RectF getTextureRealRectF() {
        if (this.LJLJLJ == 0) {
            if (this.LJLJI == null) {
                return null;
            }
            return new RectF(((YD6) this.LJLJI).getViewRect());
        }
        YSD ysd = this.LJLILLLLZI;
        if (ysd == null) {
            return null;
        }
        return ((YD5) ysd).getViewRect();
    }

    public float getTextureScaleX() {
        if (this.LJLJLJ == 0) {
            YSF ysf = this.LJLJI;
            if (ysf == null) {
                return 0.0f;
            }
            return ysf.getView().getScaleX();
        }
        YSD ysd = this.LJLILLLLZI;
        if (ysd == null) {
            return 0.0f;
        }
        return ysd.getVideoContainer().getScaleX();
    }

    public float getTextureScaleY() {
        if (this.LJLJLJ == 0) {
            YSF ysf = this.LJLJI;
            if (ysf == null) {
                return 0.0f;
            }
            return ysf.getView().getScaleY();
        }
        YSD ysd = this.LJLILLLLZI;
        if (ysd == null) {
            return 0.0f;
        }
        return ysd.getVideoContainer().getScaleY();
    }

    public int getTextureViewHeight() {
        if (this.LJLJLJ == 0) {
            YSF ysf = this.LJLJI;
            if (ysf == null) {
                return 0;
            }
            return ysf.getHeight();
        }
        YSD ysd = this.LJLILLLLZI;
        if (ysd == null) {
            return 0;
        }
        return ysd.getVideoContainer().getHeight();
    }

    public int getTextureViewWidth() {
        if (this.LJLJLJ == 0) {
            YSF ysf = this.LJLJI;
            if (ysf == null) {
                return 0;
            }
            return ysf.getWidth();
        }
        YSD ysd = this.LJLILLLLZI;
        if (ysd == null) {
            return 0;
        }
        return ysd.getVideoContainer().getWidth();
    }

    public TTVideoEngine getVideoEngine() {
        YS7 ys7 = this.LJLL;
        if (ys7 != null) {
            return ys7.getVideoEngine();
        }
        return null;
    }

    public Bitmap getVideoFrame() {
        YSF ysf = this.LJLJI;
        if (ysf != null) {
            return ysf.getBitmap();
        }
        return null;
    }

    public InterfaceC48221IwD getVideoStateInquirer() {
        YS7 ys7 = this.LJLL;
        if (ys7 != null) {
            return ys7.getVideoStateInquirer();
        }
        return null;
    }

    public int getVideoViewMarginTop() {
        YSD ysd = this.LJLILLLLZI;
        if (ysd != null) {
            return ysd.getVideoViewMarginTop();
        }
        return -1;
    }

    public int getWatchedDuration() {
        YS7 ys7 = this.LJLL;
        if (ys7 == null) {
            return 0;
        }
        return ys7.getWatchedDuration();
    }

    public final void LJI() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("dismiss surface capture view mVideoViewContainer = ");
        LIZ.append(this.LJLILLLLZI);
        X1D.LIZIZ(LIZ);
        this.LJLILLLLZI.LJ();
    }

    public final void LJIJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSurfaceChanged setSurface vid:");
        LIZ.append(this.LJLJJLL.LIZ);
        LIZ.append(" title:");
        this.LJLJJLL.getClass();
        LIZ.append((String) null);
        LIZ.append("hash:");
        LIZ.append(this.LJLL.hashCode());
        LIZ.append(" VideoViewType = ");
        LIZ.append(this.LJLJLJ);
        X1D.LIZIZ(LIZ);
        YS7 ys7 = this.LJLL;
        if (ys7 != null && this.LJLJLJ == 2) {
            ys7.setSurface(getSurface());
        }
    }

    public final void LJIJJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSurfaceDestroyed setSurface vid:");
        LIZ.append(this.LJLJJLL.LIZ);
        LIZ.append(" title:");
        this.LJLJJLL.getClass();
        LIZ.append((String) null);
        LIZ.append("hash:");
        LIZ.append(this.LJLL.hashCode());
        LIZ.append(" VideoViewType = ");
        LIZ.append(this.LJLJLJ);
        X1D.LIZIZ(LIZ);
        YS7 ys7 = this.LJLL;
        if (ys7 != null && this.LJLJLJ == 2) {
            ys7.setSurface(null);
        }
    }

    public final void LJJ() {
        Activity LIZ = C48672J8i.LIZ(getContext());
        if (LIZ != null && LIZ.isFinishing() && !this.LJLJJL) {
            return;
        }
        EnumC48219IwB.INS.trace(this.LJLJJLL, YSM.VIDEO_PATCH_PLAY_INTERNAL, null, null, getVideoStateInquirer());
        C79994VaQ c79994VaQ = this.LJLJL;
        if (c79994VaQ != null) {
            if (this.LJLJLJ == 0) {
                ((YD6) this.LJLJI).setReuseSurfaceTexture(c79994VaQ.LIZ);
            }
            setMute(this.LJLJL.LJ);
            this.LLFZ = this.LJLJL.LJIIL;
        }
        InterfaceC58392Mvs interfaceC58392Mvs = this.LJLZ;
        if (interfaceC58392Mvs != null) {
            this.LJLL.setVideoEngineFactory(interfaceC58392Mvs);
        }
        AbstractC47819Ipj abstractC47819Ipj = this.LJZL;
        if (abstractC47819Ipj != null) {
            this.LJLL.setTtvNetClient(abstractC47819Ipj);
        }
        this.LJLL.setTryToInterceptPlay(this.LLF);
        this.LJLL.setLoop(this.LJLJL.LJFF);
        this.LJLL.setVideoPlayListener(this);
        this.LJLL.setRenderMode(this.LJLJL.LJIIIIZZ);
        this.LJLL.setPlayEntity(this.LJLJJLL);
        this.LJLL.setPlaybackParams(this.LLFFF);
        this.LJLL.setVideoPlayConfiger(this);
        this.LJLL.setPlayUrlConstructor(this.LL);
        this.LJLL.setAsyncPosition(this.LJLLJ);
        this.LJLL.setAsyncRelease(this.LJLLL);
        this.LJLL.setVideoMethodOpt(this.LLI);
        this.LJLL.setRememberVideoPosition(this.LJLJL.LIZJ);
        YSF ysf = this.LJLJI;
        if (ysf != null) {
            ysf.setPlayEntity(this.LJLJJLL);
        }
        this.LJLJJLL.getClass();
        if (!TextUtils.isEmpty(null)) {
            KL2.LJIILLIIL(8, this.LJLJI.getView());
            LJII();
            return;
        }
        if (LJIILLIIL()) {
            setBackgroundColor(-16777216);
        }
        KL2.LJIILLIIL(0, this);
        IDHandlerS25S0100000_15 iDHandlerS25S0100000_15 = this.LLII;
        if (iDHandlerS25S0100000_15 != null) {
            iDHandlerS25S0100000_15.removeMessages(0);
        }
        KL2.LJIILLIIL(0, this.LJLJI.getView());
        KL2.LJIILLIIL(0, this.LJLILLLLZI.getVideoContainer());
        LJI();
        this.LJLJL.getClass();
        if (!this.LLFZ) {
            if (LJIILLIIL()) {
                this.LJLL.setSurfaceHolder(getSurfaceHolder());
            } else {
                Surface surface = getSurface();
                if (surface != null && surface.isValid()) {
                    this.LJLL.setSurface(getSurface());
                }
            }
            LJII();
            return;
        }
        ARunnableS51S0100000_15 aRunnableS51S0100000_15 = this.LLIIII;
        if (aRunnableS51S0100000_15 == null) {
            return;
        }
        Surface surface2 = getSurface();
        if (surface2 != null && surface2.isValid()) {
            aRunnableS51S0100000_15.run();
            return;
        }
        VIA via = this.LJLLILLLL;
        if (via.LIZ == null) {
            via.LIZ = new ArrayList();
        }
        ((ArrayList) via.LIZ).add(aRunnableS51S0100000_15);
    }

    public Lifecycle getObservedLifecycle() {
        return this.LJZI;
    }

    public C79985VaH getPlayEntity() {
        return this.LJLJJLL;
    }

    public C79994VaQ getPlaySettings() {
        return this.LJLJL;
    }

    public YSD getTextureContainer() {
        return this.LJLILLLLZI;
    }

    public YTJ getVideoContext() {
        return this.LJLJLLL;
    }

    public InterfaceC87405YSb getVideoPlayConfiger() {
        return this.LJLLLL;
    }

    public long getVideoStopTimeStamp() {
        return this.LLFII;
    }

    public int getVideoViewType() {
        return this.LJLJLJ;
    }

    public YS2(Context context) {
        super(context);
        this.LJLIL = new C28455BEt();
        this.LJLJJL = false;
        this.LJLJL = C79994VaQ.LIZ();
        this.LJLJLJ = 0;
        this.LJZ = new CopyOnWriteArrayList();
        this.LLD = true;
        this.LLFF = true;
        this.LLFZ = true;
        this.LLI = false;
        this.LLIFFJFJJ = false;
        this.LLIIII = new ARunnableS51S0100000_15((YS3) this, 101);
        LJIILIIL(context);
    }

    public static void LJJII(FrameLayout.LayoutParams layoutParams) {
        StringBuilder LIZJ = C06460Ne.LIZJ("updateMarginLayoutParams. left=", 0, ", top=", 0, ", right=");
        C15890jp.LIZIZ(LIZJ, 0, ", bottom=", 0, ", gravity=");
        LIZJ.append(0);
        X1D.LIZIZ(LIZJ);
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.gravity = 0;
    }

    @Override // X.InterfaceC87405YSb
    public boolean LIZIZ(EnumC48190Ivi enumC48190Ivi) {
        InterfaceC87405YSb interfaceC87405YSb = this.LJLLLL;
        if (interfaceC87405YSb != null) {
            return interfaceC87405YSb.LIZIZ(enumC48190Ivi);
        }
        return false;
    }

    @Override // X.InterfaceC87405YSb
    public final C47160If6 LIZJ(C47164IfA c47164IfA) {
        C47163If9 c47163If9;
        C47160If6 c47160If6;
        EnumC48216Iw8.INS.addTrace(this.LJLJJLL, C48217Iw9.LIZIZ("SelectVideoInfoToPlay", YDG.PLAY, 6));
        if (c47164IfA != null) {
            c47163If9 = c47164IfA.LIZJ;
        } else {
            c47163If9 = null;
        }
        InterfaceC87405YSb interfaceC87405YSb = this.LJLLLL;
        if (interfaceC87405YSb != null) {
            c47160If6 = interfaceC87405YSb.LIZJ(c47164IfA);
        } else {
            c47160If6 = (C47160If6) UC0.LJJIIJZLJL(c47163If9).get(EnumC47176IfM.Standard.getIndex());
        }
        LJJIII(c47160If6);
        return c47160If6;
    }

    @Override // X.InterfaceC87405YSb
    public final C47160If6 LJ(C47163If9 c47163If9) {
        C47160If6 c47160If6;
        InterfaceC87405YSb interfaceC87405YSb = this.LJLLLL;
        if (interfaceC87405YSb != null) {
            c47160If6 = interfaceC87405YSb.LJ(c47163If9);
        } else {
            c47160If6 = (C47160If6) UC0.LJJIIJZLJL(c47163If9).get(EnumC47176IfM.Standard.getIndex());
        }
        LJJIII(c47160If6);
        return c47160If6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIJ(YT9 yt9) {
        YSF ysf = this.LJLJI;
        ysf.getClass();
        if (ysf instanceof SurfaceView) {
            if (Build.VERSION.SDK_INT < 24 || ysf.getSurface() == null || !this.LJLJI.getSurface().isValid()) {
                return;
            }
            if (this.LJLJI.getView().getWidth() > 0) {
                if (this.LJLJI.getView().getWidth() > 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(this.LJLJI.getWidth(), this.LJLJI.getWidth(), Bitmap.Config.ARGB_8888);
                    PixelCopy.request(this.LJLJI.getSurface(), createBitmap, new PixelCopyOnPixelCopyFinishedListenerC87413YSj(createBitmap), getHandler());
                    return;
                }
                throw null;
            }
            throw null;
        }
        ((TextureView) ysf).getBitmap();
        throw null;
    }

    public void LJIILIIL(Context context) {
        this.LJLLILLLL = new VIA();
        this.LJLJLLL = LJIIIIZZ(context);
        this.LJLLI = new C32810CuE();
        ComponentCallbacks2 LIZ = C48672J8i.LIZ(context);
        if (LIZ instanceof LifecycleOwner) {
            this.LJZI = ((LifecycleOwner) LIZ).getLifecycle();
        }
    }

    public final VideoController LJIIZILJ(YTJ ytj) {
        this.LJLLI.getClass();
        return new VideoController(ytj);
    }

    public final void LJJIII(C47160If6 c47160If6) {
        if (c47160If6 != null && c47160If6.getResolution() != EnumC47176IfM.Auto) {
            EnumC48216Iw8.INS.addTrace(this.LJLJJLL, C48217Iw9.LIZIZ("UpdateVideoSize", YDG.PLAY, 6));
            int LIZLLL = c47160If6.LIZLLL(1);
            int LIZLLL2 = c47160If6.LIZLLL(2);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("selectVideoInfoToPlay width:");
            LIZ.append(LIZLLL);
            LIZ.append(" height:");
            LIZ.append(LIZLLL2);
            X1D.LIZIZ(LIZ);
            this.LJLILLLLZI.setVideoSize(LIZLLL, LIZLLL2);
        }
    }

    @Override // X.YS9
    public final void onUpdateVideoSize(C47160If6 c47160If6) {
        EnumC48216Iw8.INS.addTrace(this.LJLJJLL, C48217Iw9.LIZIZ("OnUpdateVideoSize", YDG.PLAY, 6));
        int LIZLLL = c47160If6.LIZLLL(1);
        int LIZLLL2 = c47160If6.LIZLLL(2);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUpdateVideoSize width:");
        LIZ.append(LIZLLL);
        LIZ.append(" height:");
        LIZ.append(LIZLLL2);
        X1D.LIZIZ(LIZ);
        this.LJLILLLLZI.setVideoSize(LIZLLL, LIZLLL2);
    }

    public void setAsyncPosition(boolean z) {
        this.LJLLJ = z;
        YS7 ys7 = this.LJLL;
        if (ys7 != null) {
            ys7.setAsyncPosition(z);
        }
    }

    public void setAsyncRelease(boolean z) {
        this.LJLLL = z;
        YS7 ys7 = this.LJLL;
        if (ys7 != null) {
            ys7.setAsyncRelease(z);
        }
    }

    public void setLoop(boolean z) {
        this.LJLJL.LJFF = z;
        YS7 ys7 = this.LJLL;
        if (ys7 != null) {
            ys7.setLoop(z);
        }
    }

    public void setMute(boolean z) {
        this.LJLJL.LJ = z;
        YS7 ys7 = this.LJLL;
        if (ys7 != null) {
            ys7.setMute(z);
        }
    }

    public void setOptimizeBlackSide(boolean z) {
        YSD ysd = this.LJLILLLLZI;
        if (ysd != null) {
            ysd.setOptimizeBlackSide(z);
        }
    }

    public void setOptimizeNormalFillScreen(boolean z) {
        YSD ysd = this.LJLILLLLZI;
        if (ysd != null) {
            ysd.setOptimizeNormalFillScreen(z);
        }
    }

    public void setPlayBackParams(C46886Iag c46886Iag) {
        this.LLFFF = c46886Iag;
        YS7 ys7 = this.LJLL;
        if (ys7 != null) {
            ys7.setPlaybackParams(c46886Iag);
        }
    }

    public void setPlayEntity(C79985VaH c79985VaH) {
        this.LJLJJLL = c79985VaH;
        if (c79985VaH != null) {
            this.LJLJL = c79985VaH.LJIIIIZZ;
        }
        this.LLFF = false;
    }

    public void setPlayNeedSurfaceValid(boolean z) {
        this.LLFZ = z;
    }

    public void setPlayUrlConstructor(YTA yta) {
        this.LL = yta;
        YS7 ys7 = this.LJLL;
        if (ys7 != null) {
            ys7.setPlayUrlConstructor(yta);
        }
    }

    public void setReleaseEngineEnabled(boolean z) {
        if (this.LJLL == null) {
            VideoController LJIIZILJ = LJIIZILJ(this.LJLJLLL);
            this.LJLL = LJIIZILJ;
            LJIIZILJ.setVideoViewType(this.LJLJLJ);
        }
        this.LJLL.setReleaseEngineEnabled(z);
    }

    public void setRenderMode(int i) {
        this.LJLJL.LJIIIIZZ = i;
        YS7 ys7 = this.LJLL;
        if (ys7 != null) {
            ys7.setRenderMode(i);
        }
    }

    public void setStartTime(int i) {
        YS7 ys7 = this.LJLL;
        if (ys7 != null) {
            ys7.setStartTime(i);
        }
    }

    public void setSurfaceViewConfiger(InterfaceC44732Hh2 interfaceC44732Hh2) {
        this.LJLLLLLL = interfaceC44732Hh2;
    }

    public void setTextureCropStrategy(YDD ydd) {
        YSD ysd = this.LJLILLLLZI;
        if (ysd != null) {
            ysd.setCropStrategy(ydd);
        }
    }

    public void setTextureLayout(int i) {
        C79994VaQ c79994VaQ = this.LJLJL;
        if (c79994VaQ != null) {
            c79994VaQ.LJII = i;
        }
        YSD ysd = this.LJLILLLLZI;
        if (ysd != null) {
            ysd.LIZLLL(i);
        }
    }

    public void setTryToInterceptPlay(boolean z) {
        this.LLF = z;
        YS7 ys7 = this.LJLL;
        if (ys7 != null) {
            ys7.setTryToInterceptPlay(z);
        }
    }

    public void setTtvNetClient(AbstractC47819Ipj abstractC47819Ipj) {
        this.LJZL = abstractC47819Ipj;
        YS7 ys7 = this.LJLL;
        if (ys7 != null) {
            ys7.setTtvNetClient(abstractC47819Ipj);
        }
    }

    public void setUseBlackCover(boolean z) {
        this.LLD = z;
        if (!z) {
            KL2.LJIILLIIL(8, this.LJLJJI);
        }
    }

    public void setUseSurfaceView(boolean z) {
        if (z) {
            if (Build.VERSION.SDK_INT < 24) {
                this.LJLJLJ = 2;
            } else {
                this.LJLJLJ = 1;
            }
        } else {
            this.LJLJLJ = 0;
        }
        YS7 ys7 = this.LJLL;
        if (ys7 != null) {
            ys7.setVideoViewType(this.LJLJLJ);
        }
    }

    public void setVideoContext(InterfaceC88472Yns<Context, YTJ> interfaceC88472Yns) {
        if (interfaceC88472Yns != null) {
            this.LJLJLLL = interfaceC88472Yns.invoke(getContext());
        }
    }

    public void setVideoEngine(TTVideoEngine tTVideoEngine) {
        if (this.LJLL == null) {
            VideoController LJIIZILJ = LJIIZILJ(this.LJLJLLL);
            this.LJLL = LJIIZILJ;
            LJIIZILJ.setVideoViewType(this.LJLJLJ);
        }
        this.LJLL.setVideoEngine(tTVideoEngine);
    }

    public void setVideoEngineFactory(InterfaceC58392Mvs interfaceC58392Mvs) {
        this.LJLZ = interfaceC58392Mvs;
    }

    public void setVideoMethodOpt(boolean z) {
        this.LLI = z;
    }

    public void setVideoPlayConfiger(InterfaceC87405YSb interfaceC87405YSb) {
        this.LJLLLL = interfaceC87405YSb;
        YS7 ys7 = this.LJLL;
        if (ys7 != null) {
            ys7.setVideoPlayConfiger(this);
        }
    }

    public void setVideoViewType(int i) {
        this.LJLJLJ = i;
    }

    public void setZoomingEnabled(boolean z) {
        YSD ysd = this.LJLILLLLZI;
        if (ysd != null) {
            ysd.setZoomingEnabled(z);
        }
    }

    public void setVideoContext(YTJ ytj) {
        this.LJLJLLL = ytj;
    }

    public final Bitmap LJIIIZ(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return getVideoFrame();
        }
        YSF ysf = this.LJLJI;
        if (ysf != null) {
            return ysf.getBitmap(i, i2);
        }
        return null;
    }

    @Override // X.YS9
    public void onBufferEnd(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((YS9) it.next()).onBufferEnd(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS9
    public void onBufferStart(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((YS9) it.next()).onBufferStart(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS9
    public void onEngineInitPlay(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        EnumC48216Iw8.INS.addTrace(this.LJLJJLL, C48217Iw9.LIZIZ("OnEngineInitPlay", YDG.PLAY, 6));
        if (this.LLD) {
            KL2.LJIILLIIL(0, this.LJLJJI);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((YS9) it.next()).onEngineInitPlay(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS9
    public void onFirstPlayStart(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((YS9) it.next()).onFirstPlayStart(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS9
    public void onPreRenderStart(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((YS9) it.next()).onPreRenderStart(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS9
    public void onPrepare(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((YS9) it.next()).onPrepare(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS9
    public void onPrepared(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((YS9) it.next()).onPrepared(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS9
    public void onRenderStart(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        KL2.LJIILLIIL(8, this.LJLJJI);
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((YS9) it.next()).onRenderStart(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS9
    public void onVideoCompleted(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((YS9) it.next()).onVideoCompleted(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS9
    public void onVideoPause(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((YS9) it.next()).onVideoPause(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS9
    public void onVideoPlay(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((YS9) it.next()).onVideoPlay(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS9
    public void onVideoPreCompleted(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((YS9) it.next()).onVideoPreCompleted(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS9
    public void onVideoPreRelease(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        this.LLFFF = null;
        YSF ysf = this.LJLJI;
        if (ysf != null) {
            ysf.setPlayEntity(null);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((YS9) it.next()).onVideoPreRelease(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS9
    public void onVideoReleased(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        if (this.LLD) {
            KL2.LJIILLIIL(0, this.LJLJJI);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((YS9) it.next()).onVideoReleased(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS9
    public void onVideoReplay(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        EnumC48216Iw8.INS.addTrace(this.LJLJJLL, C48217Iw9.LIZIZ("OnVideoReplay", YDG.PLAY, 6));
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((YS9) it.next()).onVideoReplay(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.YS9
    public void onVideoRetry(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        EnumC48216Iw8.INS.addTrace(this.LJLJJLL, C48217Iw9.LIZIZ("OnVideoRetry", YDG.PLAY, 6));
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((YS9) it.next()).onVideoRetry(interfaceC48221IwD, c79985VaH);
        }
    }

    @Override // X.InterfaceC87411YSh
    public C47160If6 LJFF(InterfaceC48221IwD interfaceC48221IwD, C47164IfA c47164IfA, C79985VaH c79985VaH) {
        if (this.LJLLLL instanceof InterfaceC87411YSh) {
            EnumC48216Iw8.INS.addTrace(c79985VaH, C48217Iw9.LIZIZ("SelectVideoInfoToPlayV2", YDG.PLAY, 6));
            C47160If6 LJFF = ((InterfaceC87411YSh) this.LJLLLL).LJFF(interfaceC48221IwD, c47164IfA, c79985VaH);
            LJJIII(LJFF);
            return LJFF;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIJJI(YT9 yt9, int i, int i2) {
        YSF ysf = this.LJLJI;
        if (ysf == 0) {
            LJIIJ(null);
            return;
        }
        if (ysf instanceof SurfaceView) {
            if (Build.VERSION.SDK_INT < 24 || ysf.getSurface() == null || !this.LJLJI.getSurface().isValid()) {
                return;
            }
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            PixelCopy.request(this.LJLJI.getSurface(), createBitmap, new PixelCopyOnPixelCopyFinishedListenerC87414YSk(createBitmap), getHandler());
            return;
        }
        ((TextureView) ysf).getBitmap(i, i2);
        throw null;
    }

    @Override // X.YS9
    public void onBufferCount(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i) {
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((YS9) it.next()).onBufferCount(interfaceC48221IwD, c79985VaH, i);
        }
    }

    @Override // X.YS9
    public void onBufferingUpdate(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i) {
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((YS9) it.next()).onBufferingUpdate(interfaceC48221IwD, c79985VaH, i);
        }
    }

    @Override // X.YS9
    public void onEnginePlayStart(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i) {
        EnumC48216Iw8.INS.addTrace(this.LJLJJLL, C48217Iw9.LIZIZ("OnEnginePlayStart", YDG.PLAY, 6));
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((YS9) it.next()).onEnginePlayStart(interfaceC48221IwD, c79985VaH, i);
        }
    }

    @Override // X.YS9
    public void onError(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, C47789IpF c47789IpF) {
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((YS9) it.next()).onError(interfaceC48221IwD, c79985VaH, c47789IpF);
        }
    }

    @Override // X.YS9
    public void onFetchVideoModel(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, boolean z) {
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((YS9) it.next()).onFetchVideoModel(interfaceC48221IwD, c79985VaH, z);
        }
    }

    @Override // X.YS9
    public void onLoadStateChanged(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i) {
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((YS9) it.next()).onLoadStateChanged(interfaceC48221IwD, c79985VaH, i);
        }
    }

    @Override // X.YS9
    public void onPlaybackStateChanged(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i) {
        if (i == 0 || i == 2) {
            this.LLFII = System.currentTimeMillis();
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((YS9) it.next()).onPlaybackStateChanged(interfaceC48221IwD, c79985VaH, i);
        }
    }

    @Override // X.YS9
    public void onPreVideoSeek(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, long j) {
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((YS9) it.next()).onPreVideoSeek(interfaceC48221IwD, c79985VaH, j);
        }
    }

    @Override // X.YS9
    public void onRenderSeekComplete(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, boolean z) {
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((YS9) it.next()).onVideoSeekComplete(interfaceC48221IwD, c79985VaH, z);
        }
    }

    @Override // X.YS9
    public void onStreamChanged(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i) {
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((YS9) it.next()).onStreamChanged(interfaceC48221IwD, c79985VaH, i);
        }
    }

    @Override // X.YS9
    public void onVideoEngineInfos(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, C47620ImW c47620ImW) {
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((YS9) it.next()).onVideoEngineInfos(interfaceC48221IwD, c79985VaH, c47620ImW);
        }
    }

    @Override // X.YS9
    public void onVideoSeekComplete(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, boolean z) {
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((YS9) it.next()).onVideoSeekComplete(interfaceC48221IwD, c79985VaH, z);
        }
    }

    @Override // X.YS9
    public void onVideoSeekStart(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, long j) {
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((YS9) it.next()).onVideoSeekStart(interfaceC48221IwD, c79985VaH, j);
        }
    }

    @Override // X.YS9
    public void onVideoStatusException(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i) {
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((YS9) it.next()).onVideoStatusException(interfaceC48221IwD, c79985VaH, i);
        }
    }

    @Override // X.InterfaceC87411YSh
    public final void LIZLLL(C47160If6 c47160If6, InterfaceC48221IwD interfaceC48221IwD, C47164IfA c47164IfA, C79985VaH c79985VaH) {
        if (this.LJLLLL instanceof InterfaceC87411YSh) {
            EnumC48216Iw8.INS.addTrace(c79985VaH, C48217Iw9.LIZIZ("OnVideoInfoSelected", YDG.PLAY, 3));
            ((InterfaceC87411YSh) this.LJLLLL).LIZLLL(c47160If6, interfaceC48221IwD, c47164IfA, c79985VaH);
        }
    }

    @Override // X.InterfaceC87409YSf
    public void onBarrageMaskCallback(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i, String str) {
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((InterfaceC87409YSf) it.next()).onBarrageMaskCallback(interfaceC48221IwD, c79985VaH, i, str);
        }
    }

    @Override // X.InterfaceC87409YSf
    public void onExternalSubtitlesCallback(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i, String str) {
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((InterfaceC87409YSf) it.next()).onExternalSubtitlesCallback(interfaceC48221IwD, c79985VaH, i, str);
        }
    }

    @Override // X.InterfaceC87409YSf
    public void onExternalSubtitlesPathInfoCallback(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, String str, C47789IpF c47789IpF) {
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((InterfaceC87409YSf) it.next()).onExternalSubtitlesPathInfoCallback(interfaceC48221IwD, c79985VaH, str, c47789IpF);
        }
    }

    @Override // X.YS9
    public void onFrameDraw(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i, java.util.Map map) {
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((YS9) it.next()).onFrameDraw(interfaceC48221IwD, c79985VaH, i, map);
        }
    }

    @Override // X.YS9
    public void onProgressUpdate(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i, int i2) {
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((YS9) it.next()).onProgressUpdate(interfaceC48221IwD, c79985VaH, i, i2);
        }
    }

    @Override // X.YS9
    public void onResolutionChanged(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, EnumC47176IfM enumC47176IfM, boolean z) {
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((YS9) it.next()).onResolutionChanged(interfaceC48221IwD, c79985VaH, enumC47176IfM, z);
        }
    }

    @Override // X.InterfaceC87409YSf
    public void onSubSwitchCompletedCallback(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i, int i2) {
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((InterfaceC87409YSf) it.next()).onSubSwitchCompletedCallback(interfaceC48221IwD, c79985VaH, i, i2);
        }
    }

    @Override // X.YS9
    public void onVideoSizeChanged(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i, int i2) {
        if (this.LJLILLLLZI.getVideoHeight() * this.LJLILLLLZI.getVideoWidth() == 0) {
            this.LJLILLLLZI.setVideoSize(i, i2);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((YS9) it.next()).onVideoSizeChanged(interfaceC48221IwD, c79985VaH, i, i2);
        }
    }

    @Override // X.YS9
    public void onVideoStreamBitrateChanged(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, EnumC47176IfM enumC47176IfM, int i) {
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((YS9) it.next()).onVideoStreamBitrateChanged(interfaceC48221IwD, c79985VaH, enumC47176IfM, i);
        }
    }

    @Override // X.YS9
    public void onResolutionChangedByQuality(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, String str, boolean z, boolean z2) {
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((YS9) it.next()).onResolutionChangedByQuality(interfaceC48221IwD, c79985VaH, str, z, z2);
        }
    }

    @Override // X.InterfaceC87408YSe
    public void onFullScreen(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, boolean z, int i, boolean z2, boolean z3) {
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((InterfaceC87408YSe) it.next()).onFullScreen(interfaceC48221IwD, c79985VaH, z, i, z2, z3);
        }
    }

    @Override // X.InterfaceC87408YSe
    public void onPreFullScreen(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, YTJ ytj, boolean z, int i, boolean z2, boolean z3) {
        Iterator it = ((CopyOnWriteArrayList) this.LJZ).iterator();
        while (it.hasNext()) {
            ((InterfaceC87408YSe) it.next()).onPreFullScreen(interfaceC48221IwD, c79985VaH, ytj, z, i, z2, z3);
        }
    }
}

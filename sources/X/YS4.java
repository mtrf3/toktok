package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.RelativeLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.videoshop.context.VideoContext;
import com.ss.ttvideoengine.TTVideoEngine;

/* loaded from: classes16.dex */
public final class YS4 extends RelativeLayout {
    public C79985VaH LJLIL;
    public C79994VaQ LJLILLLLZI;
    public YS3 LJLJI;
    public boolean LJLJJI;
    public VideoContext LJLJJL;
    public boolean LJLJJLL;
    public InterfaceC80606VkI LJLJL;
    public boolean LJLJLJ;
    public Lifecycle LJLJLLL;
    public InterfaceC87405YSb LJLL;
    public InterfaceC44732Hh2 LJLLI;
    public AbstractC47819Ipj LJLLILLLL;
    public YTA LJLLJ;
    public ViewTreeObserver LJLLL;
    public InterfaceC58392Mvs LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public final Rect LJZL;
    public boolean LL;
    public int LLD;
    public float LLF;
    public int LLFF;
    public int LLFFF;
    public OUU LLFII;
    public C46886Iag LLFZ;
    public boolean LLI;
    public boolean LLIFFJFJJ;
    public boolean LLII;
    public float LLIIII;
    public boolean LLIIIILZ;
    public boolean LLIIIJ;
    public boolean LLIIIL;
    public final ViewTreeObserverOnScrollChangedListenerC80605VkH LLIIIZ;

    public YTG getLayerEventListener() {
        return null;
    }

    public final void LIZIZ() {
        String str;
        VideoContext videoContext;
        if (this.LJLJJI) {
            if (this.LJLJJLL && (videoContext = this.LJLJJL) != null) {
                videoContext.attachMediaView(this);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("attachView simplemediaview hash:");
            LIZ.append(hashCode());
            LIZ.append(" scrollVisible:");
            LIZ.append(this.LJLJLJ);
            X1D.LIZIZ(LIZ);
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(">>>>>>> detachView called hash:");
        LIZ2.append(hashCode());
        LIZ2.append(" vid:");
        C79985VaH c79985VaH = this.LJLIL;
        if (c79985VaH != null) {
            str = c79985VaH.LIZ;
        } else {
            str = "null";
        }
        LIZ2.append(str);
        X1D.LIZIZ(LIZ2);
        VideoContext videoContext2 = this.LJLJJL;
        if (videoContext2 != null && this.LJLJJLL) {
            videoContext2.detachMediaView(this);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("<<<<<<<< detachView end hash:");
        LIZ3.append(hashCode());
        X1D.LIZIZ(LIZ3);
    }

    public final void LIZJ() {
        if (this.LJLJI != null) {
            removeAllViews();
            this.LJLJI.setParentView(null);
            this.LJLJI = null;
        }
    }

    public final boolean LIZLLL() {
        YS3 ys3 = this.LJLJI;
        if (ys3 != null) {
            return ys3.LJIILL();
        }
        VideoContext videoContext = this.LJLJJL;
        if (videoContext != null && videoContext.isCurrentView(this)) {
            return this.LJLJJL.isReleased();
        }
        return true;
    }

    public final void LJ() {
        YS3 ys3 = this.LJLJI;
        if (ys3 != null) {
            ys3.LJIJJLI();
            return;
        }
        VideoContext videoContext = this.LJLJJL;
        if (videoContext == null || !videoContext.isCurrentView(this)) {
            return;
        }
        this.LJLJJL.pause();
    }

    public final void LJFF() {
        if (this.LJLIL == null) {
            return;
        }
        if (this.LJLJI != null) {
            LJI();
            return;
        }
        VideoContext videoContext = this.LJLJJL;
        if (videoContext != null && videoContext.isCurrentView(this)) {
            YS3 layerHostMediaLayout = this.LJLJJL.getLayerHostMediaLayout();
            if (layerHostMediaLayout == null) {
                return;
            }
            layerHostMediaLayout.setPlayEntity(this.LJLIL);
            this.LJLJJL.play();
            return;
        }
        Context context = getContext();
        if (context != null && this.LJLJI == null) {
            if (this.LL) {
                if (Build.VERSION.SDK_INT < 24) {
                    this.LLD = 2;
                } else {
                    this.LLD = 1;
                }
            } else {
                this.LLD = 0;
            }
            YS3 ys3 = new YS3(context);
            this.LJLJI = ys3;
            ys3.setVideoViewType(this.LLD);
            this.LJLJI.LJIIL();
            this.LJLJI.setUseActiveLayers(this.LLIIIILZ);
            this.LJLJI.setDeactiveLayerWhenRelease(this.LLIIIJ);
            addView(this.LJLJI, new ViewGroup.LayoutParams(-1, -1));
            this.LJLJI.setUseActiveLayers(this.LLIIIILZ);
            this.LJLJI.setDeactiveLayerWhenRelease(this.LLIIIJ);
            this.LJLJI.setParentView(this);
            YS3 ys32 = this.LJLJI;
            Lifecycle lifecycle = this.LJLJLLL;
            if (lifecycle != null) {
                ys32.LJZI = lifecycle;
            } else {
                ys32.getClass();
            }
        }
        LJI();
    }

    public final void LJI() {
        VideoContext videoContext = this.LJLJJL;
        if (videoContext != null) {
            videoContext.setSimpleMediaView(this);
        }
        this.LJLJI.setPlayEntity(this.LJLIL);
        YS3 ys3 = this.LJLJI;
        Lifecycle lifecycle = this.LJLJLLL;
        if (lifecycle != null) {
            ys3.LJZI = lifecycle;
        } else {
            ys3.getClass();
        }
        InterfaceC87405YSb interfaceC87405YSb = this.LJLL;
        if (interfaceC87405YSb != null) {
            this.LJLJI.setVideoPlayConfiger(interfaceC87405YSb);
        }
        InterfaceC44732Hh2 interfaceC44732Hh2 = this.LJLLI;
        if (interfaceC44732Hh2 != null) {
            this.LJLJI.setSurfaceViewConfiger(interfaceC44732Hh2);
        }
        this.LJLJI.setUseActiveLayers(this.LLIIIILZ);
        this.LJLJI.setDeactiveLayerWhenRelease(this.LLIIIJ);
        this.LJLJI.setVideoMethodOpt(this.LLIIIL);
        this.LJLJI.setUseBlackCover(this.LJLLLLLL);
        this.LJLJI.setHideHostWhenRelease(this.LJLZ);
        this.LJLJI.setVideoEngineFactory(this.LJLLLL);
        this.LJLJI.setPlayUrlConstructor(this.LJLLJ);
        this.LJLJI.setTtvNetClient(this.LJLLILLLL);
        this.LJLJI.setTryToInterceptPlay(this.LJZ);
        this.LJLJI.setPlayBackParams(this.LLFZ);
        this.LJLJI.setAsyncPosition(this.LLI);
        this.LJLJI.setAsyncRelease(this.LLIFFJFJJ);
        this.LJLJI.setLayerEventListener(null);
        this.LJLJI.setCanPlayBackground(this.LJZI);
        this.LJLJI.LJIL();
    }

    public final void LJII() {
        YS3 ys3 = this.LJLJI;
        if (ys3 != null && ys3.getParent() == this) {
            this.LJLJI.LJJI();
            return;
        }
        VideoContext videoContext = this.LJLJJL;
        if (videoContext == null || !videoContext.isCurrentView(this)) {
            return;
        }
        this.LJLJJL.release();
    }

    public int getCurrentPosition() {
        boolean z = this.LLI;
        YS3 ys3 = this.LJLJI;
        if (ys3 != null) {
            YS7 ys7 = ys3.LJLL;
            if (ys7 == null) {
                return 0;
            }
            return ys7.getCurrentPosition(z);
        }
        VideoContext videoContext = this.LJLJJL;
        if (videoContext == null || !videoContext.isCurrentView(this)) {
            return 0;
        }
        return this.LJLJJL.getCurrentPosition(z);
    }

    public int getDuration() {
        YS3 ys3 = this.LJLJI;
        if (ys3 != null) {
            return ys3.getDuration();
        }
        VideoContext videoContext = this.LJLJJL;
        if (videoContext != null && videoContext.isCurrentView(this)) {
            return this.LJLJJL.getDuration();
        }
        return 0;
    }

    public YS3 getLayerHostMediaLayout() {
        YS3 ys3 = this.LJLJI;
        if (ys3 != null) {
            return ys3;
        }
        VideoContext videoContext = this.LJLJJL;
        if (videoContext != null && videoContext.isCurrentView(this)) {
            return this.LJLJJL.getLayerHostMediaLayout();
        }
        return null;
    }

    public C46886Iag getPlayBackParams() {
        YS3 ys3 = this.LJLJI;
        if (ys3 != null) {
            return ys3.getPlayBackParams();
        }
        VideoContext videoContext = this.LJLJJL;
        if (videoContext != null && videoContext.isCurrentView(this)) {
            return this.LJLJJL.getPlayBackParams();
        }
        return this.LLFZ;
    }

    public TTVideoEngine getVideoEngine() {
        YS3 ys3 = this.LJLJI;
        if (ys3 != null) {
            return ys3.getVideoEngine();
        }
        VideoContext videoContext = this.LJLJJL;
        if (videoContext != null && videoContext.isCurrentView(this)) {
            return this.LJLJJL.getVideoEngine();
        }
        return null;
    }

    public Bitmap getVideoFrame() {
        YS3 ys3 = this.LJLJI;
        if (ys3 != null) {
            return ys3.getVideoFrame();
        }
        VideoContext videoContext = this.LJLJJL;
        if (videoContext != null && videoContext.isCurrentView(this)) {
            return this.LJLJJL.getVideoFrame();
        }
        return null;
    }

    public InterfaceC48221IwD getVideoStateInquirer() {
        YS3 ys3 = this.LJLJI;
        if (ys3 != null) {
            return ys3.getVideoStateInquirer();
        }
        VideoContext videoContext = this.LJLJJL;
        if (videoContext != null && videoContext.isCurrentView(this)) {
            return this.LJLJJL.getVideoStateInquirer();
        }
        return null;
    }

    public int getVideoViewMarginTop() {
        YS3 ys3 = this.LJLJI;
        if (ys3 != null) {
            return ys3.getVideoViewMarginTop();
        }
        return -1;
    }

    public int getWatchedDuration() {
        YS3 ys3 = this.LJLJI;
        if (ys3 != null) {
            return ys3.getWatchedDuration();
        }
        VideoContext videoContext = this.LJLJJL;
        if (videoContext != null && videoContext.isCurrentView(this)) {
            return this.LJLJJL.getWatchedDuration();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        boolean z;
        C79985VaH c79985VaH;
        super.onAttachedToWindow();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAttachedToWindow hash:");
        LIZ.append(hashCode());
        LIZ.append(" class:");
        LIZ.append(C16880lQ.LJLLJ(YS4.class));
        X1D.LIZIZ(LIZ);
        ViewParent parent = getParent();
        while (true) {
            z = false;
            if (parent != null) {
                if (parent instanceof AbsListView) {
                    break;
                } else {
                    parent = parent.getParent();
                }
            } else {
                for (ViewParent parent2 = getParent(); parent2 != null; parent2 = parent2.getParent()) {
                    try {
                        if (!(parent2 instanceof RecyclerView)) {
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        z = true;
        this.LJLJJLL = z;
        this.LJLJJI = true;
        LIZIZ();
        YS3 ys3 = this.LJLJI;
        if (ys3 != null && (c79985VaH = this.LJLIL) != null && c79985VaH.equals(ys3.LJLJJLL) && this.LJLJI.LJLJJLL != this.LJLIL && !LIZLLL()) {
            this.LJLIL = this.LJLJI.LJLJJLL;
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        this.LJLLL = viewTreeObserver;
        viewTreeObserver.addOnScrollChangedListener(this.LLIIIZ);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDetachedFromWindow hash:");
        LIZ.append(hashCode());
        LIZ.append(" class:");
        LIZ.append(C16880lQ.LJLLJ(YS4.class));
        X1D.LIZIZ(LIZ);
        this.LJLJJI = false;
        LIZIZ();
        ViewTreeObserver viewTreeObserver = this.LJLLL;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.LJLLL.removeOnScrollChangedListener(this.LLIIIZ);
            return;
        }
        ViewTreeObserver viewTreeObserver2 = getViewTreeObserver();
        if (viewTreeObserver2 == null) {
            return;
        }
        viewTreeObserver2.removeOnScrollChangedListener(this.LLIIIZ);
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFinishTemporaryDetach hash:");
        LIZ.append(hashCode());
        LIZ.append(" class:");
        LIZ.append(C16880lQ.LJLLJ(YS4.class));
        X1D.LIZIZ(LIZ);
        this.LJLJJI = true;
        LIZIZ();
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onStartTemporaryDetach hash:");
        LIZ.append(hashCode());
        LIZ.append(" class:");
        LIZ.append(C16880lQ.LJLLJ(YS4.class));
        X1D.LIZIZ(LIZ);
        this.LJLJJI = false;
        LIZIZ();
    }

    public InterfaceC80606VkI getAttachListener() {
        return this.LJLJL;
    }

    public Lifecycle getObservedLifecycle() {
        return this.LJLJLLL;
    }

    public C79985VaH getPlayEntity() {
        return this.LJLIL;
    }

    public float getRadius() {
        return this.LLF;
    }

    public InterfaceC87405YSb getVideoPlayConfiger() {
        return this.LJLL;
    }

    public YS4(Context context) {
        super(context, null, 0);
        this.LJLILLLLZI = C79994VaQ.LIZ();
        this.LJLJL = new OUP();
        this.LJLLLLLL = true;
        this.LJLZ = true;
        this.LJZI = false;
        this.LJZL = new Rect();
        this.LL = false;
        this.LLIIII = 0.0f;
        this.LLIIIILZ = false;
        this.LLIIIJ = false;
        this.LLIIIL = false;
        this.LLIIIZ = new ViewTreeObserverOnScrollChangedListenerC80605VkH(this);
        ComponentCallbacks2 LIZ = C48672J8i.LIZ(context);
        long id = C16880lQ.LLJJJJ().getThread().getId();
        long id2 = C16880lQ.LLLLIIIILLL().getId();
        if (LIZ != null && !this.LLII && id == id2) {
            if (LIZ instanceof LifecycleOwner) {
                this.LJLJLLL = ((LifecycleOwner) LIZ).getLifecycle();
            }
            if (this.LJLJJL == null) {
                this.LJLJJL = VideoContext.getVideoContext(getContext());
            }
            this.LLFII = new OUU();
            setRadius(this.LLIIII);
            this.LLII = true;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:2|(5:(10:4|(2:6|7)|11|12|(1:14)|15|16|17|18|19)|16|17|18|19)|10|11|12|(0)|15) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x001e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x001f, code lost:
    
        X.C16880lQ.LLLLIIL(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.YS3 r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L79
            r4.LIZJ()
            android.view.ViewParent r0 = r5.getParent()
            if (r0 != 0) goto Lc
            goto L1a
        Lc:
            android.view.ViewParent r1 = r5.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 != 0) goto L15
            goto L1a
        L15:
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1     // Catch: java.lang.Exception -> L1a
            X.C16880lQ.LJLLL(r5, r1)     // Catch: java.lang.Exception -> L1a
        L1a:
            r5.getParent()     // Catch: java.lang.Exception -> L1e
            goto L22
        L1e:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L22:
            r4.LJLJI = r5
            X.Iag r1 = r5.LLFFF
            X.Iag r0 = r4.LLFZ
            if (r1 == r0) goto L2c
            r4.LLFZ = r1
        L2c:
            boolean r0 = r5.getUseActiveLayers()
            r4.LLIIIILZ = r0
            boolean r0 = r5.getDeactiveLayerWhenRelease()
            r4.LLIIIJ = r0
            r5.getLayerEventListener()
            androidx.lifecycle.Lifecycle r0 = r5.getObservedLifecycle()
            r4.LJLJLLL = r0
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams     // Catch: java.lang.Exception -> L4b
            r0 = -1
            r1.<init>(r0, r0)     // Catch: java.lang.Exception -> L4b
            r4.addView(r5, r1)     // Catch: java.lang.Exception -> L4b
            goto L74
        L4b:
            r3 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "removeAgain:false\n"
            r2.<init>(r0)
            android.view.ViewParent r1 = r5.getParent()
        L57:
            if (r1 == 0) goto L6a
            java.lang.String r0 = r1.toString()
            r2.append(r0)
            java.lang.String r0 = "\n"
            r2.append(r0)
            android.view.ViewParent r1 = r1.getParent()
            goto L57
        L6a:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r3)
            throw r1
        L74:
            X.YS3 r0 = r4.LJLJI
            r0.setParentView(r4)
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.YS4.LIZ(X.YS3):void");
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public void setAsyncPosition(boolean z) {
        this.LLI = z;
        YS3 ys3 = this.LJLJI;
        if (ys3 != null) {
            ys3.setAsyncPosition(z);
            return;
        }
        VideoContext videoContext = this.LJLJJL;
        if (videoContext == null || !videoContext.isCurrentView(this)) {
            return;
        }
        this.LJLJJL.setAsyncPosition(z);
    }

    public void setAsyncRelease(boolean z) {
        this.LLIFFJFJJ = z;
        YS3 ys3 = this.LJLJI;
        if (ys3 != null) {
            ys3.setAsyncRelease(z);
            return;
        }
        VideoContext videoContext = this.LJLJJL;
        if (videoContext == null || !videoContext.isCurrentView(this)) {
            return;
        }
        this.LJLJJL.setAsyncRelease(z);
    }

    public void setAttachListener(InterfaceC80606VkI interfaceC80606VkI) {
        this.LJLJL = interfaceC80606VkI;
    }

    public void setCanPlayBackground(boolean z) {
        this.LJZI = z;
    }

    public void setDeactiveLayerWhenRelease(boolean z) {
        this.LLIIIJ = z;
        YS3 ys3 = this.LJLJI;
        if (ys3 != null) {
            ys3.setDeactiveLayerWhenRelease(z);
        }
    }

    public void setEnablePortraitFullScreen(boolean z) {
        this.LJLJJL.setEnablePortraitFullScreen(z);
    }

    public void setHideHostWhenRelease(boolean z) {
        this.LJLZ = z;
        YS3 ys3 = this.LJLJI;
        if (ys3 != null) {
            ys3.setHideHostWhenRelease(z);
            return;
        }
        VideoContext videoContext = this.LJLJJL;
        if (videoContext == null || !videoContext.isCurrentView(this)) {
            return;
        }
        this.LJLJJL.setHideHostWhenRelease(z);
    }

    public void setLayerEventListener(YTG ytg) {
        YS3 ys3 = this.LJLJI;
        if (ys3 != null) {
            ys3.setLayerEventListener(ytg);
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setLayoutParams:");
        LIZ.append(layoutParams.width);
        LIZ.append("*");
        LIZ.append(layoutParams.height);
        X1D.LIZIZ(LIZ);
        C48217Iw9 LIZIZ = C48217Iw9.LIZIZ("SMVSetLayoutParams", YDG.TEXTURE_SIZE, 3);
        if (LIZIZ != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("width:");
            LIZ2.append(layoutParams.width);
            LIZ2.append("  height:");
            LIZ2.append(layoutParams.height);
            LIZIZ.LIZ("info", X1D.LIZIZ(LIZ2));
            EnumC48216Iw8.INS.addTrace(this.LJLJJL.getPlayEntity(), LIZIZ);
        }
    }

    public void setLoop(boolean z) {
        this.LJLILLLLZI.LJFF = z;
        YS3 ys3 = this.LJLJI;
        if (ys3 != null) {
            ys3.setLoop(z);
            return;
        }
        VideoContext videoContext = this.LJLJJL;
        if (videoContext == null || !videoContext.isCurrentView(this)) {
            return;
        }
        this.LJLJJL.setLoop(z);
    }

    public void setMute(boolean z) {
        this.LJLILLLLZI.LJ = z;
        YS3 ys3 = this.LJLJI;
        if (ys3 != null) {
            ys3.setMute(z);
            return;
        }
        VideoContext videoContext = this.LJLJJL;
        if (videoContext == null || !videoContext.isCurrentView(this)) {
            return;
        }
        this.LJLJJL.setMute(z);
    }

    public void setPlayBackParams(C46886Iag c46886Iag) {
        this.LLFZ = c46886Iag;
        YS3 ys3 = this.LJLJI;
        if (ys3 != null) {
            ys3.setPlayBackParams(c46886Iag);
            return;
        }
        VideoContext videoContext = this.LJLJJL;
        if (videoContext == null || !videoContext.isCurrentView(this)) {
            return;
        }
        this.LJLJJL.setPlayBackParams(c46886Iag);
    }

    public void setPlayEntity(C79985VaH c79985VaH) {
        String str;
        this.LJLIL = c79985VaH;
        if (c79985VaH != null) {
            this.LJLILLLLZI = c79985VaH.LJIIIIZZ;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setPlayEntity this.hash:");
        LIZ.append(hashCode());
        LIZ.append(" vid:");
        if (c79985VaH != null) {
            str = c79985VaH.LIZ;
        } else {
            str = "null";
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
    }

    public void setPlayUrlConstructor(YTA yta) {
        this.LJLLJ = yta;
        YS3 ys3 = this.LJLJI;
        if (ys3 != null) {
            ys3.setPlayUrlConstructor(yta);
        }
    }

    public void setPortrait(boolean z) {
        VideoContext videoContext = this.LJLJJL;
        if (videoContext != null) {
            videoContext.setPortrait(z);
        }
    }

    public void setRadius(float f) {
        if (f > 0.0f && this.LLF != f) {
            this.LLF = f;
            if (!getClipToOutline()) {
                setOutlineProvider(this.LLFII);
                setClipToOutline(true);
            }
            this.LLFII.LIZ = f;
            invalidate();
        }
    }

    public void setReleaseEngineEnabled(boolean z) {
        YS3 ys3 = this.LJLJI;
        if (ys3 != null) {
            ys3.setReleaseEngineEnabled(z);
            return;
        }
        VideoContext videoContext = this.LJLJJL;
        if (videoContext == null || !videoContext.isCurrentView(this)) {
            return;
        }
        this.LJLJJL.setReleaseEngineEnabled(z);
    }

    public void setRenderMode(int i) {
        this.LJLILLLLZI.LJIIIIZZ = i;
        YS3 ys3 = this.LJLJI;
        if (ys3 != null) {
            ys3.setRenderMode(i);
            return;
        }
        VideoContext videoContext = this.LJLJJL;
        if (videoContext == null || !videoContext.isCurrentView(this)) {
            return;
        }
        this.LJLJJL.setRenderMode(i);
    }

    public void setStartTime(int i) {
        YS3 ys3 = this.LJLJI;
        if (ys3 != null) {
            ys3.setStartTime(i);
            return;
        }
        VideoContext videoContext = this.LJLJJL;
        if (videoContext == null || !videoContext.isCurrentView(this)) {
            return;
        }
        this.LJLJJL.setStartTime(i);
    }

    public void setSurfaceViewConfiger(InterfaceC44732Hh2 interfaceC44732Hh2) {
        this.LJLLI = interfaceC44732Hh2;
        YS3 ys3 = this.LJLJI;
        if (ys3 != null) {
            ys3.setVideoPlayConfiger(this.LJLL);
        }
    }

    public void setTextureLayout(int i) {
        this.LJLILLLLZI.LJII = i;
        YS3 ys3 = this.LJLJI;
        if (ys3 != null) {
            C79994VaQ c79994VaQ = ys3.LJLJL;
            if (c79994VaQ != null) {
                c79994VaQ.LJII = i;
            }
            YSD ysd = ys3.LJLILLLLZI;
            if (ysd != null) {
                ysd.LIZLLL(i);
                return;
            }
            return;
        }
        VideoContext videoContext = this.LJLJJL;
        if (videoContext == null || !videoContext.isCurrentView(this)) {
            return;
        }
        this.LJLJJL.setTextureLayout(i, null);
    }

    public void setTryToInterceptPlay(boolean z) {
        this.LJZ = z;
        YS3 ys3 = this.LJLJI;
        if (ys3 != null) {
            ys3.setTryToInterceptPlay(z);
            return;
        }
        VideoContext videoContext = this.LJLJJL;
        if (videoContext == null || !videoContext.isCurrentView(this)) {
            return;
        }
        this.LJLJJL.setTryToInterceptPlay(z);
    }

    public void setTtvNetClient(AbstractC47819Ipj abstractC47819Ipj) {
        this.LJLLILLLL = abstractC47819Ipj;
        YS3 ys3 = this.LJLJI;
        if (ys3 != null) {
            ys3.setTtvNetClient(abstractC47819Ipj);
        }
    }

    public void setUseActiveLayers(boolean z) {
        this.LLIIIILZ = z;
        YS3 ys3 = this.LJLJI;
        if (ys3 != null) {
            ys3.setUseActiveLayers(z);
        }
    }

    public void setUseBlackCover(boolean z) {
        this.LJLLLLLL = z;
        YS3 ys3 = this.LJLJI;
        if (ys3 != null) {
            ys3.setUseBlackCover(z);
            return;
        }
        VideoContext videoContext = this.LJLJJL;
        if (videoContext == null || !videoContext.isCurrentView(this)) {
            return;
        }
        this.LJLJJL.setUseBlackCover(z);
    }

    public void setUseSurfaceView(boolean z) {
        this.LL = z;
    }

    public void setVideoEngineFactory(InterfaceC58392Mvs interfaceC58392Mvs) {
        this.LJLLLL = interfaceC58392Mvs;
        YS3 ys3 = this.LJLJI;
        if (ys3 != null) {
            ys3.setVideoEngineFactory(interfaceC58392Mvs);
            return;
        }
        VideoContext videoContext = this.LJLJJL;
        if (videoContext == null || !videoContext.isCurrentView(this)) {
            return;
        }
        this.LJLJJL.setVideoEngineFactory(interfaceC58392Mvs);
    }

    public void setVideoMethodOpt(boolean z) {
        this.LLIIIL = z;
        YS3 ys3 = this.LJLJI;
        if (ys3 != null) {
            ys3.setVideoMethodOpt(z);
        }
    }

    public void setVideoPlayConfiger(InterfaceC87405YSb interfaceC87405YSb) {
        this.LJLL = interfaceC87405YSb;
        YS3 ys3 = this.LJLJI;
        if (ys3 != null) {
            ys3.setVideoPlayConfiger(interfaceC87405YSb);
        }
    }

    public void setZoomingEnabled(boolean z) {
        YS3 ys3 = this.LJLJI;
        if (ys3 != null) {
            ys3.setZoomingEnabled(z);
            return;
        }
        VideoContext videoContext = this.LJLJJL;
        if (videoContext == null || !videoContext.isCurrentView(this)) {
            return;
        }
        this.LJLJJL.setZoomingEnabled(z);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        boolean globalVisibleRect;
        super.onVisibilityChanged(view, i);
        if (view == this) {
            if (!isShown()) {
                globalVisibleRect = false;
            } else {
                this.LJZL.setEmpty();
                globalVisibleRect = getGlobalVisibleRect(this.LJZL);
            }
            this.LJLJLJ = globalVisibleRect;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onVisibilityChanged:");
            LIZ.append(this.LJLJLJ);
            X1D.LIZIZ(LIZ);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int width = getWidth();
        int height = getHeight();
        if (this.LLFF != width || this.LLFFF != height) {
            this.LLFF = width;
            this.LLFFF = height;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("smv_size_layout:");
            LIZ.append(width);
            LIZ.append("*");
            LIZ.append(height);
            X1D.LIZIZ(LIZ);
        }
    }
}

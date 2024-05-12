package com.ss.android.ugc.aweme.shortvideo.ui;

import X.AbstractActivityC162676Zz;
import X.AbstractC143185je;
import X.AnonymousClass030;
import X.AnonymousClass668;
import X.C10K;
import X.C135315St;
import X.C138845ce;
import X.C145995oB;
import X.C1549666i;
import X.C157226Fa;
import X.C157236Fb;
import X.C161276Up;
import X.C161996Xj;
import X.C162006Xk;
import X.C16360ka;
import X.C16880lQ;
import X.C32151Nz;
import X.C41531GRr;
import X.C42326GjK;
import X.C44172HVg;
import X.C47192Ifc;
import X.C5O6;
import X.C5XI;
import X.C60903NvH;
import X.C65713Pqf;
import X.C65803Ps7;
import X.C67P;
import X.C69M;
import X.C6FB;
import X.C6IA;
import X.C6KA;
import X.C6XQ;
import X.C74275TDb;
import X.C78926UyI;
import X.C81184Vtc;
import X.H7R;
import X.H8G;
import X.InterfaceC133835Nb;
import X.InterfaceC153045zY;
import X.OSZ;
import X.QXX;
import X.X1D;
import Y.ACListenerS32S0101000_15;
import Y.ACallableS43S0201000_2;
import Y.AObjectS132S0100000_2;
import Y.AObjectS42S0101000_5;
import Y.ARunnableS6S0400000_2;
import Y.IDAListenerS71S0100000_2;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.transition.VideoCoverBitmapHolder;
import com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity;
import com.ss.android.ugc.aweme.sticker.data.CaptionStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import dmt.av.video.VEPreviewParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class VEVideoPublishPreviewActivity extends AbstractActivityC162676Zz {
    public static final /* synthetic */ int LLIILZL = 0;
    public ImageView LJLJLLL;
    public VideoPublishEditModel LJLL;
    public C135315St LJLLI;
    public SurfaceView LJLLILLLL;
    public C69M LJLLJ;
    public C41531GRr LJLLL;
    public QXX LJLLLL;
    public QXX LJLLLLLL;
    public ImageView LJLZ;
    public ImageView LJZ;
    public ImageView LJZI;
    public String LJZL;
    public UrlModel LL;
    public int LLD;
    public String LLF;
    public String LLFF;
    public long LLFFF;
    public AbstractC143185je LLFII;
    public FrameLayout LLFZ;
    public View LLI;
    public View LLIFFJFJJ;
    public TextView LLII;
    public CaptionStruct LLIIII;
    public boolean LLIIIILZ;
    public FrameLayout LLIIIJ;
    public InfoStickerModel LLIIIL;
    public final List<TextStickerData> LLIIIZ;
    public final List<C67P> LLIIJI;
    public SafeHandler LLIIJLIL;
    public boolean LLIIL;
    public View LLIILII;

    public final void LLILLJJLI() {
        boolean z;
        String str;
        setResult(-1);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.5f, 0.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.6XK
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SurfaceView surfaceView = VEVideoPublishPreviewActivity.this.LJLLILLLL;
                if (surfaceView != null) {
                    surfaceView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            }
        });
        ofFloat.addListener(new IDAListenerS71S0100000_2(this, 7));
        ofFloat.setDuration(100L);
        ofFloat.start();
        this.LJLJLLL.bringToFront();
        this.LJLJLLL.setAlpha(1.0f);
        int i = 0;
        this.LJLJLLL.setVisibility(0);
        finishAfterTransition();
        this.LLIIIILZ = true;
        VideoPublishEditModel videoPublishEditModel = this.LJLL;
        if (videoPublishEditModel == null) {
            return;
        }
        Iterator<EffectPointModel> it = videoPublishEditModel.getEffectList().iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().getIsNewEngineEffect().booleanValue()) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("shoot_way", this.LJLL.mShootWay);
        c145995oB.LJI("enter_from", this.LJLL.enterFrom);
        c145995oB.LJI("content_type", H7R.LJIIIZ(this.LJLL));
        c145995oB.LJI("content_source", H7R.LJIIIIZZ(this.LJLL));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(System.currentTimeMillis() - this.LLFFF);
        LIZ.append("");
        c145995oB.LJI("duration", X1D.LIZIZ(LIZ));
        c145995oB.LIZ(-1, "fps");
        c145995oB.LIZ(-1, "lag_count");
        c145995oB.LIZ(-1, "lag_total_duration");
        c145995oB.LJI("creation_id", this.LJLL.getCreationId());
        c145995oB.LIZ(this.LJLL.getEffectList().size(), "edit_effect_num");
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c145995oB.LJI("is_use_CC_effect", str);
        c145995oB.LJI("cpu_rate", AVExternalServiceImpl.LIZ().performanceMonitorService().getCpuUsedRate());
        c145995oB.LJI("memory_rate", AVExternalServiceImpl.LIZ().performanceMonitorService().getMemoryUsedRate());
        OSZ LJJIIJ = g0.LJJIIJ(this.LJLL);
        if (((Integer) LJJIIJ.getSecond()).intValue() + ((Integer) LJJIIJ.getFirst()).intValue() > 1) {
            i = 1;
        }
        c145995oB.LIZ(i, "is_multi_content");
        if (this.LJLL.getPreviewInfo() != null) {
            c145995oB.LIZ(this.LJLL.getPreviewInfo().getPreviewVideoLength(), "creation_duration");
        }
        C10K.LIZJ(new ACallableS43S0201000_2(1, this, c145995oB, 2));
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.AbstractActivityC162676Zz, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity", "onResume", true);
        super.onResume();
        this.LJLLI.LIZLLL();
        this.LJZI.setVisibility(4);
        if (this.LJLLLL == C162006Xk.LJLIL) {
            this.LJLLLLLL = C161996Xj.LJLIL;
        } else {
            this.LJLLLL = C161996Xj.LJLIL;
        }
        this.LLIIIILZ = false;
        if (!this.LLIIL) {
            this.LLIIL = true;
            ViewStub viewStub = (ViewStub) findViewById(R.id.kkn);
            VideoPublishEditModel model = this.LJLL;
            FrameLayout.LayoutParams surfaceParams = (FrameLayout.LayoutParams) this.LJLLILLLL.getLayoutParams();
            AObjectS42S0101000_5 aObjectS42S0101000_5 = new AObjectS42S0101000_5(2, this, 10);
            AObjectS132S0100000_2 aObjectS132S0100000_2 = new AObjectS132S0100000_2(this, 3);
            AObjectS132S0100000_2 aObjectS132S0100000_22 = new AObjectS132S0100000_2(this, 4);
            o.LJIIIZ(model, "model");
            o.LJIIIZ(surfaceParams, "surfaceParams");
            C161276Up.LIZIZ(model, this, viewStub, null, surfaceParams, 1.0f, aObjectS42S0101000_5, aObjectS132S0100000_2, aObjectS132S0100000_22, 512);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity", "onResume", false);
    }

    @Override // X.AbstractActivityC162676Zz, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    static {
        C16880lQ.LJLLJ(VEVideoPublishPreviewActivity.class);
    }

    @Override // X.AbstractActivityC162676Zz
    public final void LLIIJI() {
        if (H7R.LJJJJI(this.LJLL)) {
            C6IA.LJI(this, this.LJLLILLLL, true);
        } else {
            if (this.LLFII == null) {
                return;
            }
            LLIIIJ().LJII(this.LLFII.LIZIZ(), this.LLFII.LJ(), this.LJLLILLLL);
        }
    }

    public final void LLILIL() {
        View view = this.LLIILII;
        if (view != null) {
            view.bringToFront();
        }
        C41531GRr c41531GRr = this.LJLLL;
        if (c41531GRr != null) {
            c41531GRr.bringToFront();
        }
        this.LJZ.bringToFront();
        this.LJLZ.bringToFront();
        this.LJZI.bringToFront();
    }

    public VEVideoPublishPreviewActivity() {
        C161996Xj c161996Xj = C161996Xj.LJLIL;
        this.LJLLLL = c161996Xj;
        this.LJLLLLLL = c161996Xj;
        this.LLIIIZ = new ArrayList();
        this.LLIIJI = new ArrayList();
        this.LLIIL = false;
        this.LLIILII = null;
    }

    @Override // X.AbstractActivityC162676Zz
    public final C6FB LLIIIJ() {
        if (AnonymousClass668.LIZ()) {
            return C157226Fa.LIZ;
        }
        return C157236Fb.LIZ;
    }

    public final void LLILLIZIL() {
        View findViewById = findViewById(R.id.i3k);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        View findViewById2 = findViewById(R.id.i37);
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        View findViewById3 = findViewById(R.id.i3d);
        if (findViewById3 != null) {
            findViewById3.setVisibility(8);
        }
        ImageView imageView = this.LJLZ;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        View view = this.LLIILII;
        if (view != null) {
            view.setVisibility(8);
        }
        ImageView imageView2 = this.LJZ;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        ImageView imageView3 = this.LJZI;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
        C41531GRr c41531GRr = this.LJLLL;
        if (c41531GRr != null) {
            c41531GRr.setVisibility(8);
        }
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        boolean z;
        super.onBackPressed();
        VideoPublishEditModel videoPublishEditModel = this.LJLL;
        if (this.LJLLLL != C162006Xk.LJLIL) {
            z = true;
        } else {
            z = false;
        }
        C6XQ.LIZIZ(videoPublishEditModel, this.LLF, this.LLFF, z);
        LLILLIZIL();
        LLILLJJLI();
    }

    @Override // X.AbstractActivityC162676Zz, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        ((LifecycleRegistry) getLifecycle()).setCurrentState(Lifecycle.State.DESTROYED);
        this.LJLLI.LJIIIZ.LLIIIILZ();
        this.LJLLI.LIZIZ();
        C5O6.LJ = 0;
        C5O6.LJFF = 0;
        super.onDestroy();
        C42326GjK.LIZ.getClass();
        C42326GjK.LIZ(this);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        boolean z;
        InterfaceC153045zY interfaceC153045zY;
        C65803Ps7.LJFF(this);
        super.onStop();
        C135315St c135315St = this.LJLLI;
        if (c135315St != null && (interfaceC153045zY = c135315St.LJIIIZ) != null) {
            interfaceC153045zY.LLIIIILZ();
        }
        if (!this.LLIIIILZ) {
            VideoPublishEditModel videoPublishEditModel = this.LJLL;
            if (this.LJLLL.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            H8G.LIZLLL(videoPublishEditModel, z);
        }
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    @Override // X.AbstractActivityC162676Zz
    public final void LLIIIZ(boolean z) {
        int LIZIZ;
        int LIZIZ2 = C1549666i.LIZIZ();
        C41531GRr c41531GRr = this.LJLLL;
        if (c41531GRr != null) {
            if (z) {
                LIZIZ = LIZIZ2;
            } else {
                LIZIZ = (int) C74275TDb.LIZIZ(this, 1.0f);
            }
            c41531GRr.setBottomMargin(LIZIZ);
        }
        View view = this.LLIFFJFJJ;
        if (view != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (!z) {
                LIZIZ2 = (int) C74275TDb.LIZIZ(this, 0.0f);
            }
            layoutParams.bottomMargin = LIZIZ2;
            this.LLIFFJFJJ.setLayoutParams(layoutParams);
        }
    }

    @Override // X.AbstractActivityC162676Zz
    public final void LLIIJLIL(boolean z) {
        int LIZIZ = (int) C74275TDb.LIZIZ(this, 13.0f);
        int LIZIZ2 = (int) C74275TDb.LIZIZ(this, 3.0f);
        ImageView imageView = this.LJZ;
        if (imageView != null) {
            LLILLL(LIZIZ2, imageView, true);
        }
        ImageView imageView2 = this.LJLZ;
        if (imageView2 != null) {
            LLILLL(LIZIZ2, imageView2, true);
        }
        ImageView imageView3 = this.LJZI;
        if (imageView3 != null) {
            LLILLL(LIZIZ2, imageView3, true);
        }
        C41531GRr c41531GRr = this.LJLLL;
        if (c41531GRr != null && c41531GRr.getPreviewTitle() != null) {
            LLILLL(LIZIZ, this.LJLLL, true);
        }
        View view = this.LLI;
        if (view != null) {
            LLILLL(0, view, false);
        }
    }

    public final void LLILZ(View view) {
        if (this.LJLLILLLL == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        int LIZJ = AnonymousClass030.LIZJ(this.LJLLILLLL.getHeight(), this.LJLLI.LJIIIZ.LLILZ().height, 2, ((FrameLayout.LayoutParams) this.LJLLILLLL.getLayoutParams()).topMargin);
        if (LIZJ > 0) {
            layoutParams.height = LIZJ;
            view.setLayoutParams(layoutParams);
            view.setVisibility(0);
            view.bringToFront();
        }
    }

    public final Point LLJILJILJ(PointF pointF) {
        Point point = new Point();
        SurfaceView surfaceView = this.LJLLILLLL;
        Objects.requireNonNull(surfaceView);
        int width = surfaceView.getWidth();
        Objects.requireNonNull(this.LJLLILLLL);
        point.set((int) (width * pointF.x), (int) (r0.getHeight() * pointF.y));
        return point;
    }

    @Override // X.AbstractActivityC162676Zz, X.GBO, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        InfoStickerModel infoStickerModel;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity", "onCreate", true);
        super.onCreate(bundle);
        getWindow().addFlags(128);
        setContentView(R.layout.fi);
        C42326GjK c42326GjK = C42326GjK.LIZ;
        Intent intent = getIntent();
        c42326GjK.getClass();
        C42326GjK.LIZJ(this, intent, bundle);
        C44172HVg.LIZLLL(C32151Nz.LJIILJJIL());
        this.LLFZ = (FrameLayout) findViewById(R.id.fmm);
        this.LLIFFJFJJ = findViewById(R.id.i3p);
        this.LLI = findViewById(R.id.i3q);
        this.LJZI = (ImageView) findViewById(R.id.i3h);
        ImageView imageView = (ImageView) findViewById(R.id.i27);
        this.LJLZ = imageView;
        imageView.setVisibility(0);
        C16880lQ.LJIILLIIL(this.LJLZ, new ACListenerS32S0101000_15(5, this, 3));
        ImageView imageView2 = (ImageView) findViewById(R.id.i1y);
        this.LJZ = imageView2;
        imageView2.setVisibility(0);
        C16880lQ.LJIILLIIL(this.LJZ, new ACListenerS32S0101000_15(5, this, 13));
        C41531GRr c41531GRr = (C41531GRr) findViewById(R.id.i2u);
        this.LJLLL = c41531GRr;
        c41531GRr.setVisibility(0);
        ImageView imageView3 = (ImageView) findViewById(R.id.n7_);
        this.LJLJLLL = imageView3;
        imageView3.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap bitmap = VideoCoverBitmapHolder.LJLIL;
        if (bitmap != null) {
            this.LJLJLLL.setImageBitmap(bitmap);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float LJ = C81184Vtc.LJ(this);
            float f = height;
            float f2 = width;
            float f3 = ((f * 1.0f) / f2) * LJ;
            float LIZLLL = C81184Vtc.LIZLLL(this);
            if (f3 > LIZLLL) {
                LJ = ((f2 * 1.0f) / f) * LIZLLL;
                f3 = LIZLLL;
            }
            ViewGroup.LayoutParams layoutParams = this.LJLJLLL.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = (int) LJ;
                layoutParams.height = (int) f3;
                this.LJLJLLL.setLayoutParams(layoutParams);
            }
        }
        C16360ka.LJIJJLI(this.LJLJLLL, "transition_view_v1");
        C16360ka.LJIJJLI(findViewById(R.id.k8d), "transition_view_v2");
        SurfaceView surfaceView = (SurfaceView) findViewById(R.id.i3r);
        this.LJLLILLLL = surfaceView;
        surfaceView.setVisibility(4);
        C16880lQ.LJIILJJIL(this.LLFZ, new ACListenerS32S0101000_15(5, this, 18));
        this.LLF = C16880lQ.LLJJIJIIJIL(getIntent(), "extra_publish_preview_last_group_id");
        this.LLD = getIntent().getIntExtra("extra_publish_preview_permission", -1);
        VideoPublishEditModel LJIIJ = H7R.LJIIJ(getIntent());
        this.LJLL = LJIIJ;
        AbstractC143185je LIZIZ = C47192Ifc.LIZIZ(LJIIJ);
        this.LLFII = LIZIZ;
        LIZIZ.LIZJ(this.LJLL.getCoverPublishModel().getNeedExpandCompiledSize(), false);
        this.LJZL = C16880lQ.LLJJIJIIJIL(getIntent(), "extra_publish_preview_anchor_text");
        this.LL = (UrlModel) getIntent().getSerializableExtra("extra_publish_preview_anchor_icon_url");
        C135315St c135315St = new C135315St(this.LJLL.getVideoEditorType());
        this.LJLLI = c135315St;
        VideoPublishEditModel videoPublishEditModel = this.LJLL;
        c135315St.LJIJ = videoPublishEditModel.nleData;
        VEPreviewParams LJJJJZ = C78926UyI.LJJJJZ(videoPublishEditModel, 2, 30, 4);
        LJJJJZ.mCanvasWidth = this.LLFII.LIZIZ();
        LJJJJZ.mCanvasHeight = this.LLFII.LJ();
        LJJJJZ.mPageMode = 101;
        MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(LJJJJZ);
        MutableLiveData<InfoStickerModel> mutableLiveData2 = new MutableLiveData<>();
        if (C138845ce.LIZ() && (infoStickerModel = this.LJLL.infoStickerModel) != null && !C32151Nz.LJJIIJZLJL(infoStickerModel.stickers) && H7R.LJJJJZ(this.LJLL)) {
            InfoStickerModel m109clone = this.LJLL.infoStickerModel.m109clone();
            this.LLIIIL = m109clone;
            m109clone.stickers.clear();
            for (StickerItemModel stickerItemModel : this.LJLL.infoStickerModel.stickers) {
                if (stickerItemModel.isTextSticker()) {
                    TextStickerData textStickerData = (TextStickerData) GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), stickerItemModel.extra, TextStickerData.class);
                    textStickerData.setStartTime(stickerItemModel.startTime);
                    textStickerData.setEndTime(stickerItemModel.endTime);
                    if (textStickerData.getCanvasWidth() == 0 || textStickerData.getCanvasHeight() == 0 || textStickerData.getVideoWidth() == 0 || textStickerData.getVideoHeight() == 0) {
                        this.LLIIIL.stickers.add(stickerItemModel);
                    } else {
                        ((ArrayList) this.LLIIIZ).add(textStickerData);
                    }
                } else {
                    this.LLIIIL.stickers.add(stickerItemModel);
                }
            }
            mutableLiveData2.setValue(this.LLIIIL);
        } else {
            mutableLiveData2.setValue(this.LJLL.infoStickerModel);
        }
        C135315St c135315St2 = this.LJLLI;
        c135315St2.LIZLLL = mutableLiveData;
        c135315St2.LJFF = mutableLiveData2;
        ((LifecycleRegistry) getLifecycle()).setCurrentState(Lifecycle.State.STARTED);
        this.LJLLI.LIZ(this, this, this.LJLLILLLL, this.LJLL);
        InterfaceC153045zY interfaceC153045zY = this.LJLLI.LJIIIZ;
        VideoPublishEditModel videoPublishEditModel2 = this.LJLL;
        C5XI.LIZ(interfaceC153045zY, videoPublishEditModel2, C65713Pqf.LIZIZ(videoPublishEditModel2.creativeModel.loudnessBalanceModel.balanceTypes), null);
        this.LJLLL.LIZ(this.LJLL, this.LJZL, this.LL, this.LLD);
        AutoTransition autoTransition = new AutoTransition();
        getWindow().setSharedElementEnterTransition(autoTransition);
        getWindow().setSharedElementExitTransition(autoTransition);
        autoTransition.addListener((Transition.TransitionListener) new C6KA(this));
        getWindow().setReturnTransition(new AutoTransition());
        this.LLFF = String.valueOf(System.currentTimeMillis() / 1000);
        this.LLFFF = System.currentTimeMillis();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity", "onCreate", false);
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C42326GjK c42326GjK = C42326GjK.LIZ;
        getIntent();
        c42326GjK.getClass();
        C42326GjK.LJI(this, bundle);
    }

    public final void LLILLL(int i, View view, boolean z) {
        int LJFF = C81184Vtc.LJFF(this);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (z) {
            i += LJFF;
        }
        layoutParams.topMargin = i;
        view.setLayoutParams(layoutParams);
    }

    public final void LLIZLLLIL(final View view, View view2, final NormalTrackTimeStamp normalTrackTimeStamp) {
        view.post(new ARunnableS6S0400000_2(this, normalTrackTimeStamp, view, view2, 2));
        if (normalTrackTimeStamp.getEndTime() > 0.0f) {
            this.LJLLI.LJIIIZ.LLJLIL(new InterfaceC133835Nb() { // from class: X.6Xd
                @Override // X.InterfaceC133835Nb
                public final void LIZ(int i) {
                    NormalTrackTimeStamp normalTrackTimeStamp2 = NormalTrackTimeStamp.this;
                    View view3 = view;
                    float f = i;
                    if (f >= normalTrackTimeStamp2.getStartTime() && f <= normalTrackTimeStamp2.getEndTime()) {
                        view3.setVisibility(0);
                    } else {
                        view3.setVisibility(4);
                    }
                }
            });
        } else {
            if (view.getVisibility() == 0) {
                return;
            }
            view.setVisibility(0);
        }
    }
}

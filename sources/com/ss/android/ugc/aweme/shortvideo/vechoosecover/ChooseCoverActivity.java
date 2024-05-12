package com.ss.android.ugc.aweme.shortvideo.vechoosecover;

import X.AbstractC143185je;
import X.C00F;
import X.C121744qA;
import X.C121914qR;
import X.C122034qd;
import X.C135285Sq;
import X.C135315St;
import X.C138845ce;
import X.C141525gy;
import X.C145995oB;
import X.C1558469s;
import X.C1558669u;
import X.C156436Bz;
import X.C158326Jg;
import X.C161276Up;
import X.C161946Xe;
import X.C164826dS;
import X.C16880lQ;
import X.C17N;
import X.C1B3;
import X.C1B6;
import X.C32151Nz;
import X.C41877Gc5;
import X.C42326GjK;
import X.C44172HVg;
import X.C44526Hdi;
import X.C47192Ifc;
import X.C5MG;
import X.C5MM;
import X.C5O6;
import X.C5XI;
import X.C60178Nja;
import X.C60903NvH;
import X.C64894PdS;
import X.C65713Pqf;
import X.C65803Ps7;
import X.C67P;
import X.C69B;
import X.C69M;
import X.C6BI;
import X.C6IA;
import X.C6JH;
import X.C6XX;
import X.C6Y2;
import X.C6YM;
import X.C78866UxK;
import X.C78926UyI;
import X.C78983UzD;
import X.C78996UzQ;
import X.C79004UzY;
import X.C81184Vtc;
import X.C84969XWj;
import X.EnumC164816dR;
import X.G8G;
import X.GBO;
import X.GXR;
import X.H7R;
import X.InterfaceC133835Nb;
import X.InterfaceC134025Nu;
import X.InterfaceC145655nd;
import X.InterfaceC153045zY;
import X.InterfaceC42472Glg;
import Y.ACallableS105S0100000_2;
import Y.AObjectS42S0101000_5;
import Y.AObjectS56S0101000_13;
import Y.AObserverS70S0100000_2;
import Y.ARunnableS6S0101000_2;
import Y.IDRunnableS6S0101000;
import android.R;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.services.video.IVideoConfigService;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity;
import com.ss.android.ugc.aweme.sticker.data.CaptionStruct;
import com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NatureClassificationStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NatureClassificationStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.PollStruct;
import com.ss.android.ugc.gamora.editor.sticker.nature.model.NatureSpeciesModel;
import dmt.av.video.StoredLiveData;
import dmt.av.video.VEPreviewParams;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class ChooseCoverActivity extends GBO implements C6Y2, InterfaceC145655nd {
    public static final /* synthetic */ int LLD = 0;
    public VideoPublishEditModel LJLJI;
    public C135315St LJLJJI;
    public VEChooseVideoCoverFragment LJLJJL;
    public SurfaceView LJLJJLL;
    public View LJLJL;
    public ImageView LJLJLJ;
    public FrameLayout LJLJLLL;
    public C6JH LJLL;
    public C158326Jg LJLLI;
    public InfoStickerModel LJLLL;
    public C69M LJZ;
    public SafeHandler LJZI;
    public final MutableLiveData<Bitmap> LJLLILLLL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LJLLJ = new MutableLiveData<>();
    public final List<TextStickerData> LJLLLL = new ArrayList();
    public final List<C67P> LJLLLLLL = new ArrayList();
    public volatile boolean LJLZ = false;
    public boolean LJZL = false;
    public final MutableLiveData<C5MM> LL = new MutableLiveData<>();

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    static {
        C16880lQ.LJLLJ(ChooseCoverActivity.class);
        C6YM.LIZ();
        C69B.LIZ();
        C69B.LIZJ();
    }

    @Override // X.InterfaceC145655nd
    public final void LJLIIIL() {
        runOnUiThread(new IDRunnableS6S0101000(8, this, 0));
    }

    @Override // X.C6Y2
    public final void LJLJLLL() {
        Intent intent = new Intent();
        VideoPublishEditModel model = this.LJLJI;
        o.LJIIIZ(model, "model");
        intent.putExtra("KEY_VIDEO_COVER_CHOOSE_RESULT", (Serializable) model);
        CreativeModel creativeModel = model.creativeModel;
        o.LJIIIIZZ(creativeModel, "model.creativeModel");
        C78996UzQ.LJJIZ(intent, creativeModel);
        C42326GjK.LIZ.getClass();
        C42326GjK.LIZIZ(intent);
        setResult(-1, intent);
        finish();
    }

    public final void LLIL() {
        String videoCoverPath;
        List<String> sourceInfo;
        if (this.LJLJLJ.getVisibility() == 0) {
            return;
        }
        VideoPublishEditModel videoPublishEditModel = this.LJLJI;
        if (H7R.LJJJJL(videoPublishEditModel)) {
            videoCoverPath = videoPublishEditModel.getVideoCoverPath();
        } else {
            CanvasVideoData canvasVideoData = videoPublishEditModel.canvasVideoData;
            if (canvasVideoData != null && C79004UzY.LJJIIZI(canvasVideoData) && (sourceInfo = videoPublishEditModel.canvasVideoData.getSourceInfo()) != null && !sourceInfo.isEmpty()) {
                videoCoverPath = (String) ListProtector.get(sourceInfo, 0);
            } else if (videoPublishEditModel.isMvThemeVideoType()) {
                videoCoverPath = videoPublishEditModel.mvCreateVideoData.videoCoverImgPath;
            } else if (videoPublishEditModel.isMultiVideoEdit()) {
                videoCoverPath = videoPublishEditModel.multiEditVideoRecordData.coverImagePath;
                if (TextUtils.isEmpty(videoCoverPath)) {
                    videoCoverPath = C6BI.LIZJ(videoPublishEditModel.creativeInfo);
                }
            } else {
                videoCoverPath = videoPublishEditModel.getVideoCoverPath();
            }
        }
        if (!TextUtils.isEmpty(videoCoverPath)) {
            if (URLUtil.isValidUrl(videoCoverPath)) {
                this.LJLJLJ.setVisibility(0);
                this.LJLJLJ.setImageURI(UriProtector.parse(videoCoverPath));
                return;
            }
            Bitmap decodeBitmap = BitmapUtils.decodeBitmap(new File(videoCoverPath));
            if (decodeBitmap == null) {
                return;
            }
            this.LJLJLJ.setVisibility(0);
            this.LJLJLJ.setImageBitmap(decodeBitmap);
        }
    }

    @Override // X.C6Y2
    public final InterfaceC153045zY getEditor() {
        C135315St c135315St = this.LJLJJI;
        Objects.requireNonNull(c135315St);
        return c135315St.LJIIIZ;
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        VEChooseVideoCoverFragment vEChooseVideoCoverFragment = this.LJLJJL;
        if (vEChooseVideoCoverFragment != null) {
            vEChooseVideoCoverFragment.Dl(new AObjectS42S0101000_5(4, this, 4));
        }
    }

    public final boolean LLIIJI() {
        VideoPublishEditModel videoPublishEditModel;
        if (C138845ce.LIZ() && (videoPublishEditModel = this.LJLJI) != null && H7R.LJJJJZ(videoPublishEditModel)) {
            if (this.LJLJI.hasTextSticker()) {
                return false;
            }
            InfoStickerModel infoStickerModel = this.LJLJI.infoStickerModel;
            if (infoStickerModel != null && !C32151Nz.LJJIIJZLJL(infoStickerModel.stickers)) {
                Iterator<StickerItemModel> it = this.LJLJI.infoStickerModel.stickers.iterator();
                while (it.hasNext()) {
                    if (it.next().isTextSticker()) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final boolean LLIIJLIL() {
        if (C161946Xe.LIZ() || (C00F.LIZ(31744, 0, "tool_choose_cover_activity_optimization", true) & 1) == 0) {
            return false;
        }
        return LLIIJI();
    }

    public final void LLIILII() {
        Long valueOf = Long.valueOf(System.currentTimeMillis() - this.LJLJI.creativeModel.postPageModel.clickCover);
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZJ(valueOf, "duration");
        c145995oB.LJI("type", "publish_select_cover");
        c145995oB.LJI("content_type", "publish_video_cover");
        c145995oB.LIZ(this.LJLJI.getPreviewInfo().getPreviewVideoLength(), "creation_duration");
        c145995oB.LJI("enter_from", this.LJLJI.creativeModel.postPageModel.coverEnterFrom);
        GXR.LIZ("tool_performance_publish_cover_first_frame", c145995oB.LIZ);
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        View findViewById = getWindow().getDecorView().findViewById(R.id.statusBarBackground);
        if (findViewById != null) {
            findViewById.setVisibility(4);
        }
        super.finish();
        overridePendingTransition(com.zhiliaoapp.musically.R.anim.x, com.zhiliaoapp.musically.R.anim.y);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        ((LifecycleRegistry) getLifecycle()).setCurrentState(Lifecycle.State.DESTROYED);
        getEditor().LLJJJJLIIL();
        this.LJLJJI.LIZIZ();
        C5O6.LJ = 0;
        C5O6.LJFF = 0;
        super.onDestroy();
        C42326GjK.LIZ.getClass();
        C42326GjK.LIZ(this);
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity", "onResume", true);
        super.onResume();
        G8G.LIZ.end("av_video_choose_cover", "onResume end");
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity", "onResume", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (getEditor() != null) {
            getEditor().LLIIIILZ();
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

    @Override // X.C6Y2
    public final VideoPublishEditModel LIZLLL() {
        return this.LJLJI;
    }

    @Override // X.C6Y2
    public final MutableLiveData<C5MM> LJIIIZ() {
        return this.LL;
    }

    @Override // X.GBO, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int videoHeight;
        IVideoConfigService iVideoConfigService;
        IVideoConfigService iVideoConfigService2;
        InfoStickerModel infoStickerModel;
        Window window;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity", "onCreate", true);
        super.onCreate(bundle);
        getWindow().addFlags(128);
        getWindow().setSoftInputMode(34);
        if ((C00F.LIZ(31744, 0, "tool_choose_cover_activity_optimization", true) & 2) != 0) {
            setContentView(com.zhiliaoapp.musically.R.layout.fh);
        } else {
            setContentView(com.zhiliaoapp.musically.R.layout.fg);
        }
        C42326GjK c42326GjK = C42326GjK.LIZ;
        Intent intent = getIntent();
        c42326GjK.getClass();
        C42326GjK.LIZJ(this, intent, bundle);
        if (!C60178Nja.LIZIZ(this) && (window = getWindow()) != null) {
            window.setFlags(1024, 1024);
            window.getDecorView().setSystemUiVisibility(4102);
        }
        C44172HVg.LIZLLL(C32151Nz.LJIILJJIL());
        this.LJLJLJ = (ImageView) findViewById(com.zhiliaoapp.musically.R.id.n7_);
        this.LJLJJLL = (SurfaceView) findViewById(com.zhiliaoapp.musically.R.id.i3r);
        this.LJLJL = findViewById(com.zhiliaoapp.musically.R.id.ifh);
        if (C161946Xe.LIZ()) {
            this.LJLJL.setVisibility(0);
        }
        VideoPublishEditModel LJJIJIL = C78866UxK.LJJIJIL(getIntent());
        this.LJLJI = LJJIJIL;
        C135315St c135315St = new C135315St(LJJIJIL.getVideoEditorType());
        this.LJLJJI = c135315St;
        VideoPublishEditModel videoPublishEditModel = this.LJLJI;
        c135315St.LJIJ = videoPublishEditModel.nleData;
        c135315St.LJIILL = 2;
        C5MG c5mg = c135315St.LJIILJJIL;
        if (c5mg != null) {
            c5mg.LJIIZILJ = 2;
        }
        if (videoPublishEditModel.notUseCanvasSize()) {
            int[] LIZLLL = C44526Hdi.LIZLLL(this.LJLJI);
            i = LIZLLL[0];
            videoHeight = LIZLLL[1];
        } else {
            VideoPublishEditModel videoPublishEditModel2 = this.LJLJI;
            i = videoPublishEditModel2.mVideoCanvasWidth;
            if (i <= 0 || (videoHeight = videoPublishEditModel2.mVideoCanvasHeight) <= 0) {
                i = videoPublishEditModel2.videoWidth();
                videoHeight = this.LJLJI.videoHeight();
                if (videoHeight == 0 || i == 0) {
                    if (this.LJLJI.getOriginal() == 0) {
                        iVideoConfigService = C44172HVg.LJIILIIL;
                    } else {
                        iVideoConfigService = C44172HVg.LJIIL;
                    }
                    i = iVideoConfigService.getVideoWidth();
                    if (this.LJLJI.getOriginal() == 0) {
                        iVideoConfigService2 = C44172HVg.LJIILIIL;
                    } else {
                        iVideoConfigService2 = C44172HVg.LJIIL;
                    }
                    videoHeight = iVideoConfigService2.getVideoHeight();
                }
            }
        }
        VideoPublishEditModel videoPublishEditModel3 = this.LJLJI;
        o.LJIIIZ(videoPublishEditModel3, "<this>");
        VEPreviewParams LJJJJZ = C78926UyI.LJJJJZ(videoPublishEditModel3, 2, 30, 4);
        if (H7R.LJJJJI(this.LJLJI)) {
            AbstractC143185je LIZIZ = C47192Ifc.LIZIZ(this.LJLJI);
            LJJJJZ.mCanvasWidth = LIZIZ.LIZLLL();
            LJJJJZ.mCanvasHeight = LIZIZ.LJI();
        } else if (this.LJLJI.notUseCanvasSize()) {
            int[] LIZLLL2 = C44526Hdi.LIZLLL(this.LJLJI);
            LJJJJZ.mCanvasWidth = LIZLLL2[0];
            LJJJJZ.mCanvasHeight = LIZLLL2[1];
        } else {
            VideoPublishEditModel videoPublishEditModel4 = this.LJLJI;
            LJJJJZ.mCanvasWidth = videoPublishEditModel4.mVideoCanvasWidth;
            LJJJJZ.mCanvasHeight = videoPublishEditModel4.mVideoCanvasHeight;
        }
        LJJJJZ.mPageMode = 102;
        MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(LJJJJZ);
        MutableLiveData<InfoStickerModel> mutableLiveData2 = new MutableLiveData<>();
        if (C138845ce.LIZ() && (infoStickerModel = this.LJLJI.infoStickerModel) != null && !C32151Nz.LJJIIJZLJL(infoStickerModel.stickers) && H7R.LJJJJZ(this.LJLJI)) {
            InfoStickerModel m109clone = this.LJLJI.infoStickerModel.m109clone();
            this.LJLLL = m109clone;
            m109clone.stickers.clear();
            for (StickerItemModel stickerItemModel : this.LJLJI.infoStickerModel.stickers) {
                if (stickerItemModel.isTextSticker()) {
                    TextStickerData textStickerData = (TextStickerData) GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), stickerItemModel.extra, TextStickerData.class);
                    textStickerData.setStartTime(stickerItemModel.startTime);
                    textStickerData.setEndTime(stickerItemModel.endTime);
                    if (textStickerData.getCanvasWidth() == 0 || textStickerData.getCanvasHeight() == 0 || textStickerData.getVideoWidth() == 0 || textStickerData.getVideoHeight() == 0) {
                        this.LJLLL.stickers.add(stickerItemModel);
                    } else {
                        ((ArrayList) this.LJLLLL).add(textStickerData);
                    }
                } else {
                    this.LJLLL.stickers.add(stickerItemModel);
                }
            }
            mutableLiveData2.setValue(this.LJLLL);
        } else {
            mutableLiveData2.setValue(this.LJLJI.infoStickerModel);
        }
        if (LLIIJLIL()) {
            this.LJLJJI.LJIILJJIL.LJIL = new InterfaceC134025Nu() { // from class: X.6Xa
                @Override // X.InterfaceC134025Nu
                public final void LIZ() {
                    ChooseCoverActivity chooseCoverActivity = ChooseCoverActivity.this;
                    chooseCoverActivity.getClass();
                    chooseCoverActivity.runOnUiThread(new ARunnableS6S0101000_2(7, chooseCoverActivity, 0));
                    chooseCoverActivity.LLIILII();
                }
            };
        } else {
            this.LJLJJI.LJIILJJIL.LJIL = new InterfaceC134025Nu() { // from class: X.6Xb
                @Override // X.InterfaceC134025Nu
                public final void LIZ() {
                    ChooseCoverActivity chooseCoverActivity = ChooseCoverActivity.this;
                    chooseCoverActivity.getClass();
                    chooseCoverActivity.runOnUiThread(new ARunnableS6S0101000_2(3, chooseCoverActivity, 1));
                    chooseCoverActivity.LLIILII();
                }
            };
        }
        C135315St c135315St2 = this.LJLJJI;
        c135315St2.LIZLLL = mutableLiveData;
        c135315St2.LJ = this.LL;
        c135315St2.LJFF = mutableLiveData2;
        StoredLiveData storedLiveData = new StoredLiveData();
        MutableLiveData mutableLiveData3 = new MutableLiveData();
        ((LifecycleRegistry) getLifecycle()).setCurrentState(Lifecycle.State.STARTED);
        this.LJLJJI.LIZ(this, this, this.LJLJJLL, this.LJLJI);
        C122034qd LJJI = C17N.LJJI(this.LJLJJI.LJIIIZ);
        C121914qR LJJIII = LJJI.LJFF().LJJIII();
        if (LJJIII != null) {
            LJJIII.LJI = 0.0f;
            LJJI.LJFF().LJJJJJL(LJJIII);
        }
        C121744qA LJJIJ = LJJI.LJFF().LJJIJ();
        if (LJJIJ != null) {
            LJJIJ.LIZIZ = 0.0f;
            LJJI.LJFF().LIZJ(LJJIJ);
        }
        AudioRecorderParam audioRecorderParam = this.LJLJI.veAudioRecorderParam;
        if (audioRecorderParam != null) {
            mutableLiveData3.setValue(audioRecorderParam);
        }
        AudioEffectParam audioEffectParam = this.LJLJI.veAudioEffectParam;
        if (audioEffectParam != null) {
            audioEffectParam.setShowErrorToast(false);
            this.LJLJI.veAudioEffectParam.setPreprocessResult(null);
            storedLiveData.setValue(C135285Sq.LIZ(true, this.LJLJI.veAudioEffectParam));
        }
        InterfaceC153045zY interfaceC153045zY = this.LJLJJI.LJIIIZ;
        VideoPublishEditModel videoPublishEditModel5 = this.LJLJI;
        C5XI.LIZ(interfaceC153045zY, videoPublishEditModel5, C65713Pqf.LIZIZ(videoPublishEditModel5.creativeModel.loudnessBalanceModel.balanceTypes), null);
        if (H7R.LJJJJI(this.LJLJI)) {
            C6IA.LJI(this, this.LJLJJLL, false);
        } else {
            C141525gy.LIZJ(i, videoHeight, this.LJLJJLL);
        }
        final View decorView = getWindow().getDecorView();
        decorView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: X.6XY
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                decorView.getViewTreeObserver().removeOnPreDrawListener(this);
                C61713OJx LIZJ = C61712OJw.LIZJ(ChooseCoverActivity.this);
                LIZJ.LJI(com.zhiliaoapp.musically.R.color.ak);
                LIZJ.LIZIZ.LJIIJ(true);
                LIZJ.LIZJ();
                return true;
            }
        });
        if (bundle == null || (!(getSupportFragmentManager().LJJJIL("cover") instanceof VEChooseVideoCoverFragment))) {
            this.LJLJJL = new VEChooseVideoCoverFragment();
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
            LIZ.LJIIIIZZ(com.zhiliaoapp.musically.R.id.fmm, 1, this.LJLJJL, "cover");
            LIZ.LJI();
        } else {
            this.LJLJJL = (VEChooseVideoCoverFragment) getSupportFragmentManager().LJJJIL("cover");
        }
        if (this.LJLJLJ != null) {
            this.LJLLJ.observe(this, new C84969XWj(1, this));
            this.LJLLILLLL.observe(this, new AObserverS70S0100000_2(this, 8));
            if (LLIIJLIL()) {
                LLIL();
            }
        }
        VEChooseVideoCoverFragment vEChooseVideoCoverFragment = this.LJLJJL;
        if (vEChooseVideoCoverFragment != null) {
            vEChooseVideoCoverFragment.LL = this.LJLLJ;
            vEChooseVideoCoverFragment.LJZL = this.LJLLILLLL;
        }
        getSupportFragmentManager().LJJLIL(new C6XX(this), false);
        final C64894PdS c64894PdS = new C64894PdS(4, this);
        C41877Gc5.LIZ.LIZLLL(new InterfaceC42472Glg() { // from class: X.5Jy
            @Override // X.InterfaceC42472Glg
            public final void LIZ() {
            }

            @Override // X.InterfaceC42472Glg
            public final void onAppBackground() {
                C10K.LIZJ(new ACallableS105S0100000_2(c64894PdS, 3));
            }

            @Override // X.InterfaceC42472Glg
            public final void onAppForeground() {
                C10K.LIZJ(new ACallableS105S0100000_2(c64894PdS, 4));
            }
        });
        G8G.LIZ.step("av_video_choose_cover", "onCreate end");
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity", "onCreate", false);
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C42326GjK c42326GjK = C42326GjK.LIZ;
        getIntent();
        c42326GjK.getClass();
        C42326GjK.LJI(this, bundle);
    }

    public static /* synthetic */ void LLIIIILZ(ChooseCoverActivity chooseCoverActivity, Boolean bool) {
        chooseCoverActivity.getClass();
        if (!bool.booleanValue()) {
            super.onBackPressed();
        }
    }

    public static void LLILIL(Activity activity, VideoPublishEditModel videoPublishEditModel) {
        Intent intent = new Intent(activity, (Class<?>) ChooseCoverActivity.class);
        intent.addFlags(603979776);
        if (videoPublishEditModel == null) {
            C78983UzD.LJIIZILJ(new Throwable("model is null when start choose cover activity"));
            return;
        }
        C78866UxK.LJJLIIIJLLLLLLLZ(intent, videoPublishEditModel);
        C42326GjK.LIZ.getClass();
        C42326GjK.LJFF(activity, 4, intent);
        activity.overridePendingTransition(com.zhiliaoapp.musically.R.anim.x, com.zhiliaoapp.musically.R.anim.y);
    }

    public final void LLILLIZIL(int i, View view) {
        int top;
        view.setBackgroundColor(-1);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        SurfaceView surfaceView = this.LJLJJLL;
        if (surfaceView != null && (top = surfaceView.getTop() + i) > 0) {
            layoutParams.height = top;
            view.setLayoutParams(layoutParams);
            view.setVisibility(0);
        }
    }

    public final void LLIIIZ(int i, int i2, int i3) {
        if (this.LJZL) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(com.zhiliaoapp.musically.R.id.gzc);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i3);
        layoutParams.setMarginStart((C81184Vtc.LJ(this) - i2) / 2);
        layoutParams.topMargin = i;
        VideoPublishEditModel model = this.LJLJI;
        AObjectS56S0101000_13 aObjectS56S0101000_13 = new AObjectS56S0101000_13(5, this, 1);
        AObjectS56S0101000_13 aObjectS56S0101000_132 = new AObjectS56S0101000_13(3, this, 4);
        o.LJIIIZ(model, "model");
        C161276Up.LIZIZ(model, this, null, frameLayout, layoutParams, i2 / C81184Vtc.LJ(this), null, aObjectS56S0101000_13, aObjectS56S0101000_132, 576);
        this.LJZL = true;
    }

    public final void LLIIIJ(final int i, final int i2, final int i3, final int i4) {
        List<InteractStickerStruct> LJI;
        C158326Jg c158326Jg;
        List<InteractStickerStruct> LJI2;
        List<InteractStickerStruct> LJI3;
        C1558469s c1558469s;
        List<InteractStickerStruct> LJI4;
        final TextView textView;
        float LJ;
        final float f;
        float f2;
        int i5;
        VideoPublishEditModel videoPublishEditModel = this.LJLJI;
        if (videoPublishEditModel == null || videoPublishEditModel.getMainBusinessContext() == null) {
            return;
        }
        if (C138845ce.LIZ() && H7R.LJJJJZ(this.LJLJI)) {
            this.LJZI = new SafeHandler(this);
            this.LJLJLLL = (FrameLayout) findViewById(com.zhiliaoapp.musically.R.id.l3p);
            this.LJLJJI.LJIIIZ.LLJLIL(new InterfaceC133835Nb() { // from class: X.6J2
                @Override // X.InterfaceC133835Nb
                public final void LIZ(int i6) {
                    ChooseCoverActivity chooseCoverActivity = ChooseCoverActivity.this;
                    int i7 = i;
                    int i8 = i3;
                    int i9 = i2;
                    int i10 = i4;
                    Iterator it = ((ArrayList) chooseCoverActivity.LJLLLL).iterator();
                    while (it.hasNext()) {
                        TextStickerData textStickerData = (TextStickerData) it.next();
                        if (i6 >= textStickerData.getStartTime() && i6 <= textStickerData.getEndTime() && !textStickerData.getAddToLayoutInPreviewOrCover()) {
                            C67P c67p = new C67P(chooseCoverActivity, chooseCoverActivity.LJZI, textStickerData, false, new C78937UyT(), Boolean.FALSE);
                            int left = (i8 / 2) + chooseCoverActivity.LJLJJLL.getLeft() + i7;
                            int top = (i10 / 2) + chooseCoverActivity.LJLJJLL.getTop() + i9;
                            float max = Math.max(i8 / textStickerData.getLayoutWidth(), i10 / textStickerData.getLayoutHeight());
                            int layoutWidth = (int) (left - (textStickerData.getLayoutWidth() / 2.0f));
                            int layoutHeight = (int) (top - (textStickerData.getLayoutHeight() / 2.0f));
                            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams((int) textStickerData.getLayoutWidth(), (int) textStickerData.getLayoutHeight());
                            marginLayoutParams.setMarginStart(layoutWidth);
                            marginLayoutParams.topMargin = layoutHeight;
                            c67p.setScaleX(max);
                            c67p.setScaleY(max);
                            chooseCoverActivity.LJLJLLL.addView(c67p, marginLayoutParams);
                            ((ArrayList) chooseCoverActivity.LJLLLLLL).add(c67p);
                            textStickerData.setAddToLayoutInPreviewOrCover(true);
                        }
                        Iterator it2 = ((ArrayList) chooseCoverActivity.LJLLLLLL).iterator();
                        while (it2.hasNext()) {
                            C67P c67p2 = (C67P) it2.next();
                            c67p2.setPlayPosition(i6);
                            c67p2.LJIL();
                        }
                    }
                }
            });
        }
        VideoPublishEditModel videoPublishEditModel2 = this.LJLJI;
        if (videoPublishEditModel2 != null && videoPublishEditModel2.creativeModel.inlineCaptionModel == null && videoPublishEditModel2.getMainBusinessContext() != null && (LJI4 = C164826dS.LJI(this.LJLJI.getMainBusinessContext(), 11, EnumC164816dR.TRACK_PAGE_EDIT)) != null && !LJI4.isEmpty() && ((InteractStickerStruct) ListProtector.get(LJI4, 0)).getCaptionStruct() != null && (textView = (TextView) findViewById(com.zhiliaoapp.musically.R.id.m1n)) != null) {
            final CaptionStruct captionStruct = ((InteractStickerStruct) ListProtector.get(LJI4, 0)).getCaptionStruct();
            if (captionStruct.getUtterances() != null) {
                if (captionStruct.getVideoWidth() != null && captionStruct.getVideoWidth().intValue() != 0) {
                    LJ = (i3 * 1.0f) / captionStruct.getVideoWidth().intValue();
                    f = captionStruct.getMarginStart().intValue() * LJ;
                    f2 = captionStruct.getMarginTop().intValue() * LJ;
                    i5 = captionStruct.getMarginBottom().intValue();
                } else {
                    LJ = (i3 * 1.0f) / C81184Vtc.LJ(this);
                    f = C156436Bz.LLILZ * LJ;
                    f2 = C156436Bz.LLILLL * LJ;
                    i5 = C156436Bz.LLILLJJLI;
                }
                final float f3 = i5 * LJ;
                this.LJZ = new C69M(captionStruct.getUtterances());
                final float f4 = LJ;
                final float f5 = f2;
                textView.post(new Runnable() { // from class: X.6J3
                    @Override // java.lang.Runnable
                    public final void run() {
                        final ChooseCoverActivity chooseCoverActivity = ChooseCoverActivity.this;
                        final TextView textView2 = textView;
                        int i6 = i;
                        float f6 = f;
                        CaptionStruct captionStruct2 = captionStruct;
                        int i7 = i2;
                        float f7 = f5;
                        int i8 = i4;
                        float f8 = f3;
                        float f9 = f4;
                        chooseCoverActivity.getClass();
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView2.getLayoutParams();
                        textView2.setPivotX(0.0f);
                        textView2.setMaxWidth(C156436Bz.LLILZLL);
                        if (C90193gN.LIZ()) {
                            layoutParams.rightMargin = (int) (chooseCoverActivity.LJLJJLL.getLeft() + i6 + f6);
                        } else {
                            layoutParams.leftMargin = (int) (chooseCoverActivity.LJLJJLL.getLeft() + i6 + f6);
                        }
                        if (captionStruct2.getLocation() == EnumC1551166x.LEFT_TOP.getValue()) {
                            layoutParams.gravity = 48;
                            layoutParams.topMargin = (int) (i7 + f7);
                            textView2.setPivotY(0.0f);
                        } else {
                            layoutParams.gravity = 80;
                            layoutParams.bottomMargin = (int) (((((View) textView2.getParent()).getHeight() - i7) - i8) + f8);
                            textView2.setPivotY(textView2.getHeight());
                        }
                        textView2.setScaleX(f9);
                        textView2.setScaleY(f9);
                        chooseCoverActivity.LJLJJI.LJIIIZ.LLJLIL(new InterfaceC133835Nb() { // from class: X.6J4
                            @Override // X.InterfaceC133835Nb
                            public final void LIZ(int i9) {
                                ChooseCoverActivity chooseCoverActivity2 = ChooseCoverActivity.this;
                                TextView textView3 = textView2;
                                C69M c69m = chooseCoverActivity2.LJZ;
                                if (c69m == null) {
                                    return;
                                }
                                String LIZ = c69m.LIZ(i9);
                                if (TextUtils.isEmpty(LIZ)) {
                                    textView3.setVisibility(4);
                                } else {
                                    textView3.setVisibility(0);
                                    textView3.setText(LIZ);
                                }
                            }
                        });
                    }
                });
            }
        }
        VideoPublishEditModel videoPublishEditModel3 = this.LJLJI;
        C6JH c6jh = null;
        if (videoPublishEditModel3 != null && (LJI = C164826dS.LJI(videoPublishEditModel3.getMainBusinessContext(), 10, EnumC164816dR.TRACK_PAGE_EDIT)) != null && !LJI.isEmpty() && ((InteractStickerStruct) ListProtector.get(LJI, 0)).getCountDownStickerStruct() != null) {
            if ((C00F.LIZ(31744, 0, "tool_choose_cover_activity_optimization", true) & 2) != 0) {
                c158326Jg = this.LJLLI;
                if (c158326Jg == null) {
                    ViewStub viewStub = (ViewStub) findViewById(com.zhiliaoapp.musically.R.id.kmo);
                    if (viewStub == null) {
                        c158326Jg = null;
                    } else {
                        c158326Jg = (C158326Jg) viewStub.inflate();
                    }
                }
            } else {
                c158326Jg = (C158326Jg) findViewById(com.zhiliaoapp.musically.R.id.i37);
            }
            this.LJLLI = c158326Jg;
            if (c158326Jg != null) {
                LLILLIZIL(i2, findViewById(com.zhiliaoapp.musically.R.id.naa));
                CountDownStickerStruct countDownStickerStruct = ((InteractStickerStruct) ListProtector.get(LJI, 0)).getCountDownStickerStruct();
                C158326Jg c158326Jg2 = this.LJLLI;
                c158326Jg2.LIZ(countDownStickerStruct);
                c158326Jg2.setTouchEnable(true);
                c158326Jg2.setEditEnable(false);
                NormalTrackTimeStamp LIZIZ = C164826dS.LIZIZ((InteractStickerStruct) ListProtector.get(LJI, 0));
                if (LIZIZ != null) {
                    LLILLJJLI(this.LJLLI, i, i2, i3, i4, LIZIZ);
                }
            }
        }
        VideoPublishEditModel videoPublishEditModel4 = this.LJLJI;
        if (videoPublishEditModel4 != null && (LJI2 = C164826dS.LJI(videoPublishEditModel4.getMainBusinessContext(), 1, EnumC164816dR.TRACK_PAGE_EDIT)) != null && !LJI2.isEmpty() && ((InteractStickerStruct) ListProtector.get(LJI2, 0)).getPollStruct() != null) {
            if ((C00F.LIZ(31744, 0, "tool_choose_cover_activity_optimization", true) & 2) != 0) {
                C6JH c6jh2 = this.LJLL;
                if (c6jh2 != null) {
                    c6jh = c6jh2;
                } else {
                    ViewStub viewStub2 = (ViewStub) findViewById(com.zhiliaoapp.musically.R.id.kmp);
                    if (viewStub2 != null) {
                        c6jh = (C6JH) viewStub2.inflate();
                    }
                }
            } else {
                c6jh = (C6JH) findViewById(com.zhiliaoapp.musically.R.id.i3k);
            }
            this.LJLL = c6jh;
            if (c6jh != null) {
                LLILLIZIL(i2, findViewById(com.zhiliaoapp.musically.R.id.naa));
                PollStruct pollStruct = ((InteractStickerStruct) ListProtector.get(LJI2, 0)).getPollStruct();
                C6JH c6jh3 = this.LJLL;
                c6jh3.LIZIZ(pollStruct);
                c6jh3.setTouchEnable(true);
                c6jh3.LJFF();
                c6jh3.setEditEnable(false);
                NormalTrackTimeStamp LIZIZ2 = C164826dS.LIZIZ((InteractStickerStruct) ListProtector.get(LJI2, 0));
                if (LIZIZ2 != null) {
                    LLILLJJLI(this.LJLL, i, i2, i3, i4, LIZIZ2);
                }
            }
        }
        VideoPublishEditModel videoPublishEditModel5 = this.LJLJI;
        if (videoPublishEditModel5 == null || (LJI3 = C164826dS.LJI(videoPublishEditModel5.getMainBusinessContext(), 14, EnumC164816dR.TRACK_PAGE_EDIT)) == null || LJI3.isEmpty() || ((InteractStickerStruct) ListProtector.get(LJI3, 0)).getNatureClassificationStickerStruct() == null || (c1558469s = (C1558469s) findViewById(com.zhiliaoapp.musically.R.id.i3d)) == null) {
            return;
        }
        LLILLIZIL(i2, findViewById(com.zhiliaoapp.musically.R.id.naa));
        NormalTrackTimeStamp LIZIZ3 = C164826dS.LIZIZ((InteractStickerStruct) ListProtector.get(LJI3, 0));
        if (LIZIZ3 == null) {
            return;
        }
        NatureClassificationStickerStruct natureClassificationStickerStruct = ((InteractStickerStruct) ListProtector.get(LJI3, 0)).getNatureClassificationStickerStruct();
        InteractStickerStruct interactStickerStruct = (InteractStickerStruct) ListProtector.get(LJI3, 0);
        if (natureClassificationStickerStruct != null && natureClassificationStickerStruct.getNatureClassificationStruct() != null) {
            NatureClassificationStruct natureClassificationStruct = natureClassificationStickerStruct.getNatureClassificationStruct();
            NatureSpeciesModel natureSpeciesModel = new NatureSpeciesModel(natureClassificationStruct.getSpeciesName(), natureClassificationStruct.getGenusName(), natureClassificationStruct.getSpeciesId(), natureClassificationStruct.getGenusId(), 0.0f, "");
            C1558669u c1558669u = new C1558669u();
            c1558669u.LJLIL = interactStickerStruct;
            c1558669u.LJLILLLLZI = (int) LIZIZ3.getStartTime();
            c1558669u.LJLJI = (int) LIZIZ3.getEndTime();
            c1558469s.LIZIZ(c1558669u, natureSpeciesModel.speciesName);
            c1558469s.setVisibility(4);
        }
        LLILLJJLI(c1558469s, i, i2, i3, i4, LIZIZ3);
    }

    public final void LLILLJJLI(final View view, final int i, final int i2, int i3, final int i4, final NormalTrackTimeStamp normalTrackTimeStamp) {
        C135315St c135315St = this.LJLJJI;
        if (c135315St == null) {
            return;
        }
        final int i5 = c135315St.LJIIIZ.LLILZ().width;
        final int i6 = this.LJLJJI.LJIIIZ.LLILZ().height;
        final float min = Math.min(i3 / i5, i4 / i6);
        view.post(new Runnable() { // from class: X.6J5
            @Override // java.lang.Runnable
            public final void run() {
                ChooseCoverActivity chooseCoverActivity = ChooseCoverActivity.this;
                NormalTrackTimeStamp normalTrackTimeStamp2 = normalTrackTimeStamp;
                int i7 = i5;
                float f = min;
                int i8 = i6;
                View view2 = view;
                int i9 = i;
                int i10 = i2;
                int i11 = i4;
                if (chooseCoverActivity.LJLJJLL == null) {
                    return;
                }
                float f2 = i7;
                Point point = new Point((int) (normalTrackTimeStamp2.getX() * f2 * f), (int) (normalTrackTimeStamp2.getY() * i8 * f));
                view2.setX(((chooseCoverActivity.LJLJJLL.getLeft() + i9) + point.x) - (view2.getMeasuredWidth() / 2.0f));
                if (chooseCoverActivity.LJLJI.notUseCanvasSize()) {
                    VideoPublishEditModel videoPublishEditModel = chooseCoverActivity.LJLJI;
                    float width = ((chooseCoverActivity.LJLJJLL.getWidth() * 1.0f) / videoPublishEditModel.mVideoCanvasWidth) * videoPublishEditModel.mVideoCanvasHeight;
                    view2.setY((((normalTrackTimeStamp2.getY() * width) + ((chooseCoverActivity.LJLJJLL.getHeight() - width) / 2.0f)) - (((chooseCoverActivity.LJLJJLL.getHeight() / 2.0f) - i10) - (i11 / 2.0f))) - (view2.getMeasuredHeight() / 2.0f));
                } else {
                    view2.setY(((chooseCoverActivity.LJLJJLL.getTop() + i10) + point.y) - (view2.getMeasuredHeight() / 2.0f));
                }
                view2.setRotation(normalTrackTimeStamp2.getRotation());
                float width2 = (normalTrackTimeStamp2.getWidth() * f2) / (normalTrackTimeStamp2.getScale().floatValue() * view2.getMeasuredWidth());
                view2.setScaleX(normalTrackTimeStamp2.getScale().floatValue() * f * width2);
                view2.setScaleY(normalTrackTimeStamp2.getScale().floatValue() * f * width2);
            }
        });
        if (normalTrackTimeStamp.getEndTime() > 0.0f) {
            this.LJLJJI.LJIIIZ.LLJLIL(new InterfaceC133835Nb() { // from class: X.6Xc
                @Override // X.InterfaceC133835Nb
                public final void LIZ(int i7) {
                    NormalTrackTimeStamp normalTrackTimeStamp2 = NormalTrackTimeStamp.this;
                    View view2 = view;
                    float f = i7;
                    if (f >= normalTrackTimeStamp2.getStartTime() && f <= normalTrackTimeStamp2.getEndTime()) {
                        view2.setVisibility(0);
                    } else {
                        view2.setVisibility(4);
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

package com.ss.android.ugc.aweme.shortvideo.jsbopenrecord;

import X.C03880Dg;
import X.C10K;
import X.C141525gy;
import X.C145995oB;
import X.C1537361p;
import X.C16880lQ;
import X.C19N;
import X.C29S;
import X.C2R5;
import X.C2U8;
import X.C30597Bzd;
import X.C36804EcS;
import X.C41025G8f;
import X.C41389GMf;
import X.C41658GWo;
import X.C42034Gec;
import X.C42097Gfd;
import X.C42104Gfk;
import X.C42315Gj9;
import X.C42318GjC;
import X.C42326GjK;
import X.C42562Gn8;
import X.C42721Gph;
import X.C43014GuQ;
import X.C43045Guv;
import X.C43150Gwc;
import X.C43662HBq;
import X.C43841HIn;
import X.C43910HLe;
import X.C44024HPo;
import X.C44108HSu;
import X.C44172HVg;
import X.C44216HWy;
import X.C44284HZo;
import X.C44298Ha2;
import X.C44350Has;
import X.C44422Hc2;
import X.C44989HlB;
import X.C45623HvP;
import X.C45848Hz2;
import X.C45857HzB;
import X.C48331Ixz;
import X.C48335Iy3;
import X.C52243Ket;
import X.C52912Kpg;
import X.C53564L0m;
import X.C60903NvH;
import X.C62819Ol5;
import X.C65300Pk0;
import X.C65859Pt1;
import X.C6FB;
import X.C6FZ;
import X.C6IE;
import X.C6IG;
import X.C77413UZt;
import X.C78594Usw;
import X.C78880UxY;
import X.C82622Wbi;
import X.C83576Wr6;
import X.C83651WsJ;
import X.C83728WtY;
import X.C83932Wwq;
import X.EnumC42099Gff;
import X.EnumC42288Gii;
import X.FMX;
import X.G8G;
import X.H78;
import X.H8W;
import X.H96;
import X.HA3;
import X.HA4;
import X.HC7;
import X.HEM;
import X.HF7;
import X.HK7;
import X.HQ5;
import X.HR3;
import X.HRL;
import X.HTP;
import X.HVR;
import X.HXF;
import X.HXH;
import X.HXM;
import X.HXT;
import X.HXX;
import X.HYQ;
import X.HZD;
import X.I0N;
import X.I2K;
import X.I3K;
import X.I3X;
import X.ID0;
import X.InterfaceC45889Hzh;
import X.InterfaceC45979I2t;
import X.InterfaceC45999I3n;
import X.InterfaceC82086WJm;
import X.InterfaceC84498XEg;
import X.OI1;
import X.ProgressDialogC43239Gy3;
import X.QD3;
import X.UFE;
import X.V0Z;
import X.W17;
import X.WLY;
import X.WM7;
import X.WRP;
import X.WRQ;
import X.X1D;
import Y.ACallableS56S0300000_7;
import Y.AObjectS4S0100200_7;
import Y.AObjectS52S0101000_7;
import Y.AObjectS53S0101000_8;
import Y.ARunnableS14S0000000_7;
import Y.IDRunnableS0S0201000;
import Y.IDRunnableS6S0101000;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.creativex.recorder.gesture.DefaultGesturePresenter;
import com.ss.android.ugc.aweme.adaptation.analysis.Analysis;
import com.ss.android.ugc.aweme.common.ShareKitPanel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.jsb.comment.IBinderWrapper;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene;
import com.ss.android.ugc.aweme.shoutouts.ShoutOutsData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.runtime.VEMem;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes8.dex */
public class ExteriorVideoRecordScene extends TikTokCameraBaseGroupScene implements WLY, HA3 {
    public static final /* synthetic */ int LLIZ = 0;
    public C82622Wbi LJLLLLLL;
    public ShortVideoContext LJLZ;
    public C83576Wr6 LJZI;
    public FrameLayout LJZL;
    public FrameLayout LL;
    public View LLD;
    public FrameLayout LLFF;
    public List<String> LLFFF;
    public Effect LLFII;
    public boolean LLFZ;
    public C45848Hz2 LLI;
    public MvChoosePhotoScene LLIFFJFJJ;
    public boolean LLII;
    public boolean LLIIII;
    public FrameLayout LLIIIILZ;
    public volatile boolean LLIIIJ;
    public int LLIIIL;
    public boolean LLIIIZ;
    public boolean LLIIJI;
    public long LLIIJLIL;
    public boolean LLIIL;
    public boolean LLIILII;
    public boolean LLIILZL;
    public final C6FZ LLIIZ;
    public C44216HWy LLIL;
    public boolean LLILII;
    public boolean LLILIL;
    public IBinderWrapper LLILL;
    public RecordPageOptionalConfig LLILLIZIL;
    public WRQ LLILLJJLI;
    public I3X LLILLL;
    public HYQ LLILZ;
    public boolean LLILZIL;
    public I0N LLILZLL;
    public final SafeHandler LJZ = new SafeHandler(this);
    public ProgressDialogC43239Gy3 LLF = null;

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    public final void LLLIZZ() {
        this.LLIIL = true;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    public final void LLLJ() {
        this.LLIFFJFJJ = null;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void LJIJI() {
        if (this.LJLZ != null) {
            C6FB LLLFF = LLLFF();
            View view = this.LLD;
            CameraComponentModel cameraComponentModel = this.LJLZ.cameraComponentModel;
            LLLFF.LJII(cameraComponentModel.mVideoWidth, cameraComponentModel.mVideoHeight, view);
        }
        C45848Hz2 c45848Hz2 = this.LLI;
        if (c45848Hz2 != null && c45848Hz2.LLJJI()) {
            boolean z = this.LLIIL;
        }
    }

    @Override // X.InterfaceC44086HRy
    public final FrameLayout.LayoutParams LJJJJ() {
        View view = this.LLD;
        if (view == null) {
            return null;
        }
        return (FrameLayout.LayoutParams) view.getLayoutParams();
    }

    @Override // X.HA3
    public final boolean LJJL() {
        MvChoosePhotoScene mvChoosePhotoScene = this.LLIFFJFJJ;
        if (mvChoosePhotoScene != null) {
            return mvChoosePhotoScene.LLLLZI;
        }
        return false;
    }

    @Override // X.HA3
    public final void LJZL() {
        MvChoosePhotoScene mvChoosePhotoScene = this.LLIFFJFJJ;
        if (mvChoosePhotoScene != null) {
            mvChoosePhotoScene.LLLLZI = false;
        }
    }

    @Override // X.HA3
    public final HA4 LLILII() {
        MvChoosePhotoScene mvChoosePhotoScene = this.LLIFFJFJJ;
        if (mvChoosePhotoScene != null && mvChoosePhotoScene.mActivity != null) {
            return mvChoosePhotoScene.LLILII();
        }
        return new HA4(null, null);
    }

    @Override // X.AbstractC42651GoZ
    public final int LLJJIJI() {
        int i = this.mArguments.getInt("translation_type", 0);
        if (!Arrays.asList(3, 7, 8, 9, 1, 6).contains(Integer.valueOf(i))) {
            return 1;
        }
        return i;
    }

    @Override // X.AbstractC42651GoZ
    public final void LLJJJ() {
        if (!this.LJLZ.mToLive) {
            LLLLJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    public final void LLLIIII() {
        I3X i3x = this.LLILLL;
        if (i3x != null) {
            i3x.LJJZ(false);
        }
    }

    public final void LLLJIL() {
        C45848Hz2 c45848Hz2;
        C45848Hz2 c45848Hz22;
        Activity activity = this.mActivity;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        G8G.LIZ.step("av_video_record_init", "addFragment");
        H78.LIZ("addFragment PlanC");
        C44216HWy c44216HWy = this.LLIL;
        if (c44216HWy != null && (c45848Hz22 = this.LLI) != null && c44216HWy.isAdded(c45848Hz22)) {
            this.LLIL.remove(this.LLI);
        }
        OptionalComponents optionalComponents = new OptionalComponents(false, false, false);
        RecordPageOptionalConfig recordPageOptionalConfig = this.LLILLIZIL;
        if (recordPageOptionalConfig != null) {
            optionalComponents = recordPageOptionalConfig.optionalComponents;
        }
        C45848Hz2 c45848Hz23 = new C45848Hz2(this.LJLZ, this.mArguments, this.LJLLLLLL, new C65859Pt1(optionalComponents));
        this.LLI = c45848Hz23;
        c45848Hz23.LJLILLLLZI = new HZD(4, this);
        C44216HWy c44216HWy2 = this.LLIL;
        if (c44216HWy2 != null) {
            c44216HWy2.LJLIL = c45848Hz23;
            if (c44216HWy2.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED) && (c45848Hz2 = c44216HWy2.LJLIL) != null) {
                WM7 findSceneByTag = c44216HWy2.findSceneByTag("PlanC");
                if (findSceneByTag != null) {
                    c44216HWy2.remove(findSceneByTag);
                }
                c44216HWy2.add(R.id.irq, c45848Hz2, "PlanC");
                c44216HWy2.LJLILLLLZI = true;
            }
        }
    }

    public final I0N LLLJL() {
        if (this.LLILZLL == null) {
            this.LLILZLL = (I0N) this.LJLLLLLL.LJIIIIZZ(null, I0N.class);
        }
        return this.LLILZLL;
    }

    public final void LLLLIILLL() {
        IVideoRecordPreferences iVideoRecordPreferences = (IVideoRecordPreferences) new C44350Has().LIZ(requireAppCompatActivity(), IVideoRecordPreferences.class);
        if (iVideoRecordPreferences != null && iVideoRecordPreferences.isFirstEnterRecordPage(true)) {
            iVideoRecordPreferences.setFirstEnterRecordPage(false);
        }
    }

    public final void LLLLILI() {
        this.LLILLJJLI.e8().LLLLLJIL(new C83932Wwq(new C43841HIn(this.LJLZ.cameraComponentModel.mWorkspace)), this.LJLZ.cameraComponentModel.mWorkspace.y().getAbsolutePath());
        this.LLILLJJLI.gc0();
    }

    public final void LLLLJ() {
        if (Build.VERSION.SDK_INT >= 28 && getWindow().getDecorView().getRootWindowInsets() == null) {
            return;
        }
        this.LLILLJJLI.e8().getMediaController().M8(OI1.LIZ((ViewGroup.MarginLayoutParams) this.LLD.getLayoutParams(), getWindow(), this.LLIILII));
    }

    public final boolean LLLLJI() {
        boolean z;
        ShortVideoContext shortVideoContext = this.LJLZ;
        if (shortVideoContext.enterMvThemeEffect != null) {
            z = true;
        } else {
            z = false;
        }
        if (!shortVideoContext.mToLive && !shortVideoContext.mToStatus && !z && !HXM.LIZ()) {
            return true;
        }
        return false;
    }

    public final void LLLLL() {
        if (this.LLF == null) {
            this.LLF = C42034Gec.LIZJ(requireAppCompatActivity(), EnumC42288Gii.VISIBLE_AFTER_5S, new HXX());
        }
        this.LLF.setMessage(getString(R.string.r74));
        this.LLF.setCancelable(false);
        this.LLF.setIndeterminate(true);
        ProgressDialogC43239Gy3 progressDialogC43239Gy3 = this.LLF;
        if (new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/view/DoubleBallLoadingDialog", "show", progressDialogC43239Gy3, new Object[0], "void", new C65300Pk0(false, "()V", "-6868038312326587486")).LIZ) {
            return;
        }
        progressDialogC43239Gy3.show();
    }

    @Override // X.InterfaceC42675Gox
    public final void aa() {
        View view = this.LLD;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // X.HA3
    public final HA4 getPreDownloadMusicData() {
        MvChoosePhotoScene mvChoosePhotoScene = this.LLIFFJFJJ;
        if (mvChoosePhotoScene != null && mvChoosePhotoScene.mActivity != null) {
            return mvChoosePhotoScene.getPreDownloadMusicData();
        }
        return new HA4(null, null);
    }

    @Override // X.InterfaceC42675Gox
    public final void j1() {
        View view = this.LLD;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene, com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC42651GoZ, X.WM7
    public final void onResume() {
        int i;
        String str;
        AVChallenge aVChallenge;
        RecordPageOptionalConfig recordPageOptionalConfig;
        this.LJLLLL.LIZIZ("video_record_activity_resume");
        H78.LIZ("JSBVideoRecordScene => onResume start");
        super.onResume();
        if (this.LJLZ.mIsFromDraft) {
            if (C42721Gph.LIZ()) {
                C43045Guv.LIZJ(180L, new ARunnableS14S0000000_7(0));
            } else {
                C2U8.LIZ(new HEM());
            }
        }
        this.LLIIII = true;
        if (this.LLII) {
            HF7 hf7 = C44172HVg.LJJIFFI;
            requireAppCompatActivity();
            C77413UZt.LJJIIJ();
            hf7.getClass();
            this.LLII = false;
        }
        if (C48331Ixz.LJ()) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI(WM7.SCENE_SERVICE, "resume_record");
            c145995oB.LJI("shoot_way", this.LJLZ.shootWay);
            c145995oB.LJI("creation_id", this.LJLZ.LJI());
            c145995oB.LJI("enter_from", this.LJLZ.enterFrom);
            HTP.LJLJL.getClass();
            c145995oB.LIZIZ(0L, "dalvikPss");
            c145995oB.LIZIZ(0L, "nativePss");
            c145995oB.LIZIZ(0L, "otherPss");
            c145995oB.LIZIZ(0L, "totalPss");
            FMX.LJIIL("av_memory_log", c145995oB.LIZ);
        }
        H78.LIZ("JSBVideoRecordScene => onResume end");
        HTP.LJLJL.LIZJ(requireAppCompatActivity(), this.LJZL);
        if (this.LJLZ != null && (recordPageOptionalConfig = this.LLILLIZIL) != null) {
            i = recordPageOptionalConfig.exteriorRecordPageType;
        } else {
            i = -1;
        }
        if (i == HR3.PHOTO_SEARCH.getType() || i == HR3.AIGC.getType()) {
            HVR.LIZ.LJIIJ(requireAppCompatActivity(), new AObjectS53S0101000_8(3, this, 1), new String[]{"android.permission.CAMERA"});
        } else {
            HVR.LIZ.LJIIIZ(requireAppCompatActivity(), new AObjectS52S0101000_7(2, this, 23));
        }
        VEMem.getInstance().uploadVirtualMemSize(0);
        long j = this.mArguments.getLong("extra_start_record_time", 0L);
        C6FZ c6fz = this.LLIIZ;
        long currentTimeMillis = System.currentTimeMillis() - j;
        c6fz.getClass();
        C6FZ.LIZIZ(c6fz, "click_plus", currentTimeMillis, true, 8);
        ShortVideoContext shortVideoContext = this.LJLZ;
        if (shortVideoContext != null) {
            ArrayList arrayList = new ArrayList(ID0.LIZIZ(shortVideoContext.presetEffectId));
            List<String> list = this.LLFFF;
            if (list != null) {
                arrayList.addAll(list);
            }
            if (shortVideoContext.creativeModel.commerceModel.getMission() != null) {
                str = shortVideoContext.creativeModel.commerceModel.getMission().getMissionId();
            } else {
                str = "";
            }
            if (shortVideoContext.creativeModel.commerceModel.getRecordChallenge() != null) {
                aVChallenge = shortVideoContext.creativeModel.commerceModel.getRecordChallenge();
            } else {
                aVChallenge = null;
            }
            C42562Gn8.LIZIZ.LIZIZ(shortVideoContext.LJI(), new C42097Gfd(EnumC42099Gff.ENTER_RECORD, shortVideoContext, Arrays.asList(new C42104Gfk(arrayList, str, aVChallenge))), this.mActivity);
        }
        this.LJLLLL.LIZ("video_record_activity_resume");
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC42651GoZ, X.WM7
    public final void onStart() {
        if (this.LLILL != null) {
            this.mArguments.putParcelable(HRL.LIZ(this.LJLZ), this.LLILL);
            this.LLILL = null;
        }
        this.LJLLLL.LIZIZ("video_record_activity_start");
        super.onStart();
        C45857HzB.LIZ(new C44024HPo());
        this.LJLLLL.LIZ("video_record_activity_start");
    }

    public ExteriorVideoRecordScene() {
        new ArrayList();
        new HXT();
        this.LLII = false;
        this.LLIIII = false;
        this.LLIIIJ = true;
        this.LLIIJI = false;
        this.LLIIJLIL = -1L;
        this.LLIIL = false;
        new ArrayList();
        this.LLIIZ = new C6FZ();
        this.LLIL = null;
        this.LLILII = false;
        this.LLILIL = false;
        this.LLILLIZIL = null;
        this.LLILZIL = false;
        disableSupportRestore();
    }

    @Override // X.InterfaceC44086HRy
    public final ViewGroup LJJLIIIJL() {
        return (ViewGroup) findViewById(R.id.ai5);
    }

    @Override // X.AbstractC42651GoZ
    public final void LLJJJJ() {
        this.LLIIJLIL = System.currentTimeMillis();
        LLLLIL(this.LLILLJJLI.LLL().getValue());
        if (C53564L0m.LIZIZ()) {
            requireActivity().runOnUiThread(new IDRunnableS6S0101000(4, this, 30));
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene, X.G90
    public final Analysis getAnalysis() {
        if (super.getAnalysis() == null) {
            return super.getAnalysis();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("creation_id", this.LJLZ.LJI());
        hashMap.put("is_story_shoot", CardStruct.IStatusCode.DEFAULT);
        Analysis analysis = super.getAnalysis();
        analysis.setExtraMap(hashMap);
        return analysis;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene, com.ss.android.ugc.aweme.shortvideo.ui.RecordSessionScene, com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC42651GoZ, X.AbstractC147255qD, X.WM7
    public final void onDestroyView() {
        RecordPageOptionalConfig recordPageOptionalConfig;
        super.onDestroyView();
        if (!this.LLIIIZ && (recordPageOptionalConfig = this.LLILLIZIL) != null) {
            C44108HSu.LJII(8, recordPageOptionalConfig.previousPage, this.LJLZ.shootWay, true, null, Boolean.TRUE);
        }
        HXH.LIZ.clear();
        HXH.LIZIZ.clear();
        C36804EcS.LIZ.LIZLLL();
        C6IG.LIZ(C6IE.RECORD_PAGE_PANEL);
        LLLLIILLL();
        C44284HZo c44284HZo = C44284HZo.LIZJ;
        c44284HZo.LIZIZ = null;
        InterfaceC84498XEg interfaceC84498XEg = c44284HZo.LIZ;
        if (interfaceC84498XEg != null) {
            interfaceC84498XEg.destroy();
        }
        c44284HZo.LIZ = null;
        C44172HVg.LJI.LJIL();
        C43014GuQ.LJII(false);
        this.LLI = null;
        C1537361p.LIZIZ = new ArrayList();
        V0Z.LIZIZ("editor");
        C43662HBq.LIZ();
        HTP htp = HTP.LJLJL;
        htp.LJLILLLLZI = null;
        htp.LJLIL.sendEmptyMessage(1);
        C30597Bzd.LIZ();
        C43150Gwc.LIZ = false;
        C43150Gwc.LIZIZ = false;
        C43150Gwc.LIZJ = false;
        C60903NvH.LJIIJJI().getPublishService().LJJIJL();
        AVCommerceServiceImpl.LJIIJ().LJ();
        G8G.LIZ.leave(requireAppCompatActivity(), "record");
        C44422Hc2.LIZIZ();
        if (!this.LLILZIL) {
            C41658GWo.LIZLLL().LJ = Boolean.FALSE;
            this.LLILZIL = false;
        }
        C41025G8f.LIZ("normal").LIZJ("at_shoot_page");
        C83728WtY.LIZIZ.LIZ.getClass();
        C83651WsJ.LIZ = null;
    }

    @Override // X.AbstractC42651GoZ, X.WM7
    public final void onPause() {
        super.onPause();
        this.LLIIII = false;
        HTP.LJLJL.LIZ();
        C44298Ha2 c44298Ha2 = G8G.LIZ;
        C29S requireAppCompatActivity = requireAppCompatActivity();
        ShortVideoContext shortVideoContext = this.LJLZ;
        c44298Ha2.pause(requireAppCompatActivity, "record", shortVideoContext.shootWay, shortVideoContext.LJI());
        C42315Gj9.LIZJ("tool_record_enter");
        VEMem.getInstance().uploadVirtualMemSize(1);
    }

    @Override // X.AbstractC42651GoZ, X.WM7
    public final void onStop() {
        super.onStop();
        LLLIIII();
    }

    @Override // X.WLY
    public final C83576Wr6 LJJJJJL() {
        return this.LJZI;
    }

    @Override // X.InterfaceC44086HRy
    public final FrameLayout LLIILZL() {
        return this.LJZL;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    public final InterfaceC82086WJm LLLIIIL() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    public final C45848Hz2 LLLIILIL() {
        return this.LLI;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    public final ShortVideoContext LLLILZ() {
        return this.LJLZ;
    }

    public static void LLLLIIL(ExteriorVideoRecordScene exteriorVideoRecordScene) {
        exteriorVideoRecordScene.getClass();
        new DefaultGesturePresenter(exteriorVideoRecordScene.requireAppCompatActivity(), exteriorVideoRecordScene, null, exteriorVideoRecordScene.LLIIIILZ).LIZLLL(new W17(exteriorVideoRecordScene.LLILLJJLI.e8().getEffectController(), new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) exteriorVideoRecordScene.LLILLJJLI.sm0().getLayoutParams())), 1, 100);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void LIZIZ(boolean z) {
        InterfaceC45999I3n interfaceC45999I3n;
        C45848Hz2 c45848Hz2 = this.LLI;
        if (c45848Hz2 != null && (interfaceC45999I3n = (InterfaceC45999I3n) c45848Hz2.getDiContainer().LJIIIIZZ(null, InterfaceC45999I3n.class)) != null) {
            interfaceC45999I3n.cG(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void LIZJ(boolean z) {
        InterfaceC45999I3n interfaceC45999I3n;
        this.LLIILII = z;
        C45848Hz2 c45848Hz2 = this.LLI;
        if (c45848Hz2 != null && (interfaceC45999I3n = (InterfaceC45999I3n) c45848Hz2.getDiContainer().LJIIIIZZ(null, InterfaceC45999I3n.class)) != null) {
            interfaceC45999I3n.Uw(z);
        }
        LLLLJ();
    }

    @Override // X.AbstractC42651GoZ
    public final void LLJJ(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.LJLZ.actionDownTime = System.currentTimeMillis();
            InterfaceC45889Hzh interfaceC45889Hzh = (InterfaceC45889Hzh) LLLL(InterfaceC45889Hzh.class);
            if (interfaceC45889Hzh != null) {
                interfaceC45889Hzh.dismissSuperEntranceEvent();
            }
            InterfaceC45889Hzh interfaceC45889Hzh2 = (InterfaceC45889Hzh) LLLL(InterfaceC45889Hzh.class);
            if (interfaceC45889Hzh2 != null) {
                interfaceC45889Hzh2.dismissUploadPopEntranceEvent();
            }
            InterfaceC45889Hzh interfaceC45889Hzh3 = (InterfaceC45889Hzh) LLLL(InterfaceC45889Hzh.class);
            if (interfaceC45889Hzh3 != null) {
                interfaceC45889Hzh3.dismissLivePopupEvent();
            }
        }
    }

    @Override // X.AbstractC42651GoZ
    public final void LLJJJIL(Configuration configuration) {
        int i = this.LLIIIL;
        int i2 = configuration.screenWidthDp;
        if (i != i2) {
            this.LLIIIL = i2;
            C6FB LLLFF = LLLFF();
            View view = this.LLD;
            CameraComponentModel cameraComponentModel = this.LJLZ.cameraComponentModel;
            LLLFF.LJII(cameraComponentModel.mVideoWidth, cameraComponentModel.mVideoHeight, view);
        }
    }

    @Override // X.AbstractC42651GoZ
    public final void LLJJLIIIJLLLLLLLZ(Intent intent) {
        if (!C42721Gph.LIZ()) {
            C42326GjK c42326GjK = C42326GjK.LIZ;
            C29S requireAppCompatActivity = requireAppCompatActivity();
            c42326GjK.getClass();
            C42326GjK.LIZJ(requireAppCompatActivity, intent, null);
        }
        LLJLIL(C16880lQ.LLJJIJI(intent));
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01b0  */
    @Override // X.AbstractC42651GoZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LLJLIL(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene.LLJLIL(android.os.Bundle):boolean");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    public final void LLLII(MvChoosePhotoScene mvChoosePhotoScene) {
        this.LLIFFJFJJ = mvChoosePhotoScene;
    }

    public final <T> T LLLL(Class<T> cls) {
        C45848Hz2 c45848Hz2 = this.LLI;
        if (c45848Hz2 == null || c45848Hz2.getDiContainer() == null) {
            return null;
        }
        return (T) this.LLI.getDiContainer().LJIIIIZZ(null, cls);
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0298, code lost:
    
        if (r7.equals("prop_reuse") == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02bc, code lost:
    
        r11 = "prop_reuse";
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02b9, code lost:
    
        if (r7.equals("reuse_giphy_gif") == false) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLIIIILLL(android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene.LLLLIIIILLL(android.os.Bundle):void");
    }

    public final void LLLLIL(HK7 hk7) {
        String str;
        String str2;
        boolean z;
        String str3;
        int i;
        String str4;
        int i2;
        HashMap<String, String> hashMap;
        TTSVoiceModel tTSVoiceModel;
        String str5;
        if (this.LLIIIZ || this.LLIIJLIL < 0 || !this.LLIIJI) {
            return;
        }
        long j = hk7.LJLJI;
        long j2 = hk7.LJLIL;
        long j3 = hk7.LJLILLLLZI;
        this.LLIIIZ = true;
        FilterBean LIZ = ((WRP) this.LJLLLLLL.LJ(WRP.class, null)).getCurSelectedFilter().LIZ();
        Effect effect = this.LJLZ.enterMvThemeEffect;
        if (effect == null) {
            str = "";
            str2 = "";
        } else {
            str2 = effect.getEffectId();
            str = effect.getName();
        }
        long j4 = this.mArguments.getLong("extra_start_record_time", 0L);
        long j5 = j - j4;
        long j6 = j2 - j4;
        int i3 = this.mArguments.getInt("sdk_load_ve_so_status", -1);
        long j7 = this.mArguments.getLong("preload_ve_so_cost_time", -1L);
        int i4 = this.mArguments.getInt("preload_ve_so_task_status", -1);
        long j8 = this.mArguments.getLong("extra_decompress_time", -10086L);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("So decompress: VideoRecordNewActivity, decompress time:");
        LIZ2.append(j8);
        H78.LIZ(X1D.LIZIZ(LIZ2));
        if (HQ5.LIZ) {
            HQ5.LIZ = false;
            z = true;
        } else {
            z = false;
        }
        long j9 = this.mArguments.getLong("effect_download_duration", -1L);
        long j10 = this.mArguments.getLong("music_download_duration", -1L);
        long j11 = this.mArguments.getLong("video_download_duration", -1L);
        long j12 = this.LLIIJLIL - j4;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZ(i3, "sdk_load_ve_so_status");
        c145995oB.LIZ(i4, "preload_ve_so_task_status");
        c145995oB.LIZIZ(j7, "preload_ve_so_cost_time");
        c145995oB.LIZIZ(j8, "extra_decompress_time");
        c145995oB.LIZIZ(j6, "first_frame_duration");
        c145995oB.LIZIZ(Math.max(j6, j12), "first_frame_duration_new");
        c145995oB.LIZIZ(j12, "enter_anim_complete_duration");
        c145995oB.LIZIZ(j5, "first_ui_frame_duration");
        long j13 = j3 - j2;
        c145995oB.LIZIZ(j13, "effect_first_frame_duration");
        c145995oB.LIZIZ(j3 - j4, "total_first_frame_duration");
        c145995oB.LJI("shoot_way", this.LJLZ.shootWay);
        c145995oB.LJI("enter_from", this.LJLZ.enterFrom);
        c145995oB.LJI("creation_id", this.LJLZ.LJI());
        c145995oB.LJ("cold_start", z);
        c145995oB.LIZIZ(j9, "effect_download_duration");
        c145995oB.LIZIZ(j10, "music_download_duration");
        c145995oB.LIZIZ(j11, "video_download_duration");
        c145995oB.LJI("camera_type", C78594Usw.LIZJ(this.LLILLJJLI.e8().getCurrentCameraType()));
        C44989HlB.LIZ(c145995oB);
        if (HC7.LIZ()) {
            C10K.LIZJ(new ACallableS56S0300000_7(new C43910HLe(null, null, this.LJLLLLLL, null, this.LLILLJJLI), c145995oB, new AObjectS4S0100200_7(c145995oB, j3, j2, 0), 16));
        } else {
            C42318GjC.LIZIZ("tool_performance_record_first_frame", c145995oB.LIZ);
            C44298Ha2 c44298Ha2 = G8G.LIZ;
            c44298Ha2.getClass();
            if (C45623HvP.LIZ()) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("tool_performance_record_first_frame", UFE.LIZ(j13, "effect_first_frame_duration").LIZ);
                if (C44298Ha2.LIZ()) {
                    c44298Ha2.LJLJI.post(new IDRunnableS0S0201000(4, c44298Ha2, hashMap2, 5));
                }
            }
        }
        C145995oB c145995oB2 = new C145995oB();
        c145995oB2.LJI("creation_id", this.LJLZ.LJI());
        c145995oB2.LJI("shoot_way", this.LJLZ.shootWay);
        if (LIZ == null) {
            str3 = "";
        } else {
            str3 = LIZ.getEnName();
        }
        c145995oB2.LJI("filter_name", str3);
        if (LIZ != null) {
            i = LIZ.getId();
        } else {
            i = 0;
        }
        c145995oB2.LIZ(i, "filter_id");
        c145995oB2.LJI("mv_id", str2);
        c145995oB2.LJI("mv_name", str);
        c145995oB2.LJ("cold_start", z);
        c145995oB2.LIZJ(C48335Iy3.LIZIZ("av_video_record_init").getFirst(), "app_mem_use");
        c145995oB2.LIZJ(C48335Iy3.LIZIZ("av_video_record_init").getSecond(), "availble_mem");
        c145995oB2.LIZIZ(this.mArguments.getLong("extra_start_record_download_res_time", 0L), "download_res_time");
        StitchParams stitchParams = this.LJLZ.stitchContext.stitchParams;
        String str6 = "1";
        if (stitchParams != null && stitchParams.isThroughStitchChain()) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c145995oB2.LJI("is_through_stitch_button", str4);
        c145995oB2.LJI("camera_type", C78594Usw.LIZJ(this.LLILLJJLI.e8().getCurrentCameraType()));
        c145995oB2.LJFF(new H96().LJFF("action_originated_from"));
        if ("self_shoot".equals(this.LJLZ.shootWay)) {
            c145995oB2.LIZLLL("enter_from", "video_shoot_page");
        } else {
            c145995oB2.LIZLLL("enter_from", this.LJLZ.enterFrom);
        }
        int i5 = this.LJLZ.draftId;
        if (i5 != 0) {
            c145995oB2.LIZ(i5, "draft_id");
        }
        if (!TextUtils.isEmpty(this.LJLZ.clientId)) {
            c145995oB2.LIZLLL("channel", this.LJLZ.clientId);
        }
        if (!TextUtils.isEmpty(this.LJLZ.mShareId)) {
            c145995oB2.LIZLLL("open_platform_share_id", this.LJLZ.mShareId);
        }
        if (this.LJLZ.creativeModel.loadMusicAndEffectModel.loadAfterRecord) {
            c145995oB2.LJI("enter_method", "long_press_music_publish");
            String str7 = this.LJLZ.creativeModel.loadMusicAndEffectModel.musicId;
            if (str7 == null) {
                str7 = "";
            }
            c145995oB2.LJI("music_id", str7);
            c145995oB2.LIZLLL("shoot_entrance", "single_song");
        }
        ShareKitPanel shareKitPanel = this.LJLZ.creativeFlowData.getShareKitPanel();
        if (shareKitPanel != null) {
            c145995oB2.LIZJ(shareKitPanel.getShareMediaType(), "share_media_type");
            c145995oB2.LIZLLL("effect_resource_id", shareKitPanel.getEffectResourceId());
            c145995oB2.LIZLLL("share_panel_option", shareKitPanel.getSharePanelOption());
            c145995oB2.LIZLLL("channel", shareKitPanel.getClientKey());
        }
        if (!TextUtils.isEmpty(this.LJLZ.newDraftId)) {
            c145995oB2.LIZLLL("new_draft_id", this.LJLZ.newDraftId);
            if (this.LJLZ.draftToEditFrom == 0) {
                c145995oB2.LIZLLL("enter_method", "click_back_button");
                str5 = "general_draft_list";
            } else {
                str5 = null;
            }
            c145995oB2.LIZLLL("draft_way", str5);
        }
        c145995oB2.LIZ(C62819Ol5.LJIJ(this.mActivity), "brightness");
        if (j4 > 0 && j6 > 0) {
            c145995oB2.LIZIZ(j6, "duration");
        }
        if (TextUtils.equals(this.LJLZ.enterFrom, "super_entrance")) {
            c145995oB2.LIZ(1, "is_special_icon");
        }
        if (this.LJLZ.LJJIIZ()) {
            c145995oB2.LIZLLL("shoot_entrance", this.LJLZ.shootWay);
            c145995oB2.LIZ(this.LJLZ.mShoutOutsData.getReviewed(), "reviewed");
            if (!TextUtils.isEmpty(this.LJLZ.mShoutOutsData.getOrderId())) {
                c145995oB2.LIZLLL(ShoutOutsData.MOD_ORDER_ID, this.LJLZ.mShoutOutsData.getOrderId());
            }
        }
        if ("story".equals(this.LJLZ.shootWay)) {
            c145995oB2.LJI("shoot_entrance", "story");
            c145995oB2.LIZLLL("enter_method", this.LJLZ.enterMethod);
        }
        if ("anchor_combine_tts".equals(this.LJLZ.shootWay) && (tTSVoiceModel = this.LJLZ.ttsVoiceModel) != null) {
            c145995oB2.LIZLLL("tone_list", tTSVoiceModel.getEffectId());
        }
        c145995oB2.LJI("shoot_page", "video_shoot_page");
        c145995oB2.LIZ(this.LJLZ.mDuetFromDuetButton, "is_from_duet_button");
        c145995oB2.LIZLLL("is_westwindow_exist", this.LJLZ.isWestWindowExistStr);
        if (this.LJLZ.LJJIFFI()) {
            c145995oB2.LIZ(1, "is_restore_crash");
            if (C60903NvH.LJIIJJI().LJIIJ().LJII()) {
                c145995oB2.LIZLLL("enter_method", "click_continue_popup");
            } else {
                c145995oB2.LIZLLL("enter_method", "click_back_button");
            }
        }
        c145995oB2.LIZLLL("camera", C78880UxY.LJJIJIIJI(this.LLILLJJLI.getCameraFacing()));
        c145995oB2.LIZ(C60903NvH.LJIIJJI().getPublishService().LJIIL(), "publish_cnt");
        if (!this.LJLZ.creativeFlowData.isThroughAnchor()) {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        c145995oB2.LIZLLL("is_through_anchor", str6);
        String str8 = this.LJLZ.creativeModel.initialModel.socialParametersModel.isPropPrompt;
        if (str8 != null) {
            c145995oB2.LIZLLL("is_prop_prompt", str8);
        }
        String str9 = this.LJLZ.creativeModel.initialModel.socialParametersModel.fromUserId;
        if (str9 != null) {
            c145995oB2.LIZLLL("from_user_id", str9);
        }
        if (TextUtils.equals(this.LJLZ.shootWay, "duet")) {
            c145995oB2.LIZ(this.LJLZ.duetVideoDuration, "duet_video_duration");
        } else if (TextUtils.equals(this.LJLZ.shootWay, "stitch")) {
            StitchParams stitchParams2 = this.LJLZ.stitchContext.stitchParams;
            if (stitchParams2 != null) {
                i2 = stitchParams2.getStitchVideoDuration();
            } else {
                i2 = 0;
            }
            c145995oB2.LIZ(i2, "stitch_video_duration");
        }
        if (TextUtils.equals(this.LJLZ.shootWay, "friends_effect")) {
            c145995oB2.LIZLLL("enter_method", this.LJLZ.enterMethod);
            HashMap<String, HashMap<String, String>> hashMap3 = this.LJLZ.extraEventParams;
            if (hashMap3 != null && hashMap3.get("friends_effect") != null && (hashMap = hashMap3.get("friends_effect")) != null) {
                c145995oB2.LIZLLL("from_user_id", hashMap.get("from_user_id"));
            }
        }
        if (TextUtils.equals(this.LJLZ.shootWay, "chat_shoot")) {
            c145995oB2.LIZLLL("enter_method", "click");
        }
        RecordPageOptionalConfig recordPageOptionalConfig = this.LLILLIZIL;
        if (recordPageOptionalConfig != null) {
            c145995oB2.LIZLLL("previous_page", recordPageOptionalConfig.previousPage);
        }
        C44989HlB.LIZ(c145995oB2);
        H8W.LIZ("enter_video_shoot_page");
        FMX.LJIIL("enter_video_shoot_page", c145995oB2.LIZ);
        if (!C48331Ixz.LJ() && !C48331Ixz.LIZJ()) {
            return;
        }
        C145995oB c145995oB3 = new C145995oB();
        c145995oB3.LJ("is_4k_enable", C52243Ket.LIZ());
        FMX.LJIIL("tool_performance_4k_video_import", c145995oB3.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0400  */
    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene, com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene, X.AbstractC42651GoZ, X.WM7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 1319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene.onActivityCreated(android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    public void onEvent(C2R5 c2r5) {
        C45848Hz2 c45848Hz2;
        if (C52912Kpg.LIZ() && this.LJLZ.LJIIIIZZ() > 0 && this.LJLZ.LJIIIIZZ() >= this.LJLZ.LJIILIIL() && (c45848Hz2 = this.LLI) != null) {
            c45848Hz2.getDiContainer().LJ(InterfaceC45979I2t.class, null);
            this.LLI.getDiContainer().LJ(I3K.class, null);
            ((InterfaceC45979I2t) this.LLI.getDiContainer().LJ(InterfaceC45979I2t.class, null)).updateBottomTab();
            ((I3K) this.LLI.getDiContainer().LJ(I3K.class, null)).g80();
        }
        String str = c2r5.LJLIL;
        if (str != null) {
            this.LJLZ.extraSession.commerceData = str;
        }
        C41389GMf.LIZ(this.LJLZ.creativeModel);
    }

    @Override // X.WMH, X.WM7
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.remove("android:fragments");
        if (e1.LIZ(31744, "disable_remove_fragment_inrecord_page", true, true)) {
            bundle.remove("android:support:fragments");
        }
        this.LLILZIL = true;
        bundle.putParcelable("save_state_short_video_context", this.LJLZ);
        this.LLILL = (IBinderWrapper) this.mArguments.getParcelable(HRL.LIZ(this.LJLZ));
        this.mArguments.remove(HRL.LIZ(this.LJLZ));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    @QD3(sticky = true)
    public void receiveToast(HXF hxf) {
        if (TextUtils.equals(hxf.LJLIL, "sticker_unlocked")) {
            this.LLII = true;
            if (this.LLIIII && !hxf.LJLJI) {
                HF7 hf7 = C44172HVg.LJJIFFI;
                requireAppCompatActivity();
                C77413UZt.LJJIIJ();
                hf7.getClass();
                this.LLII = false;
            }
            EventBus.LIZJ().LJIILLIIL(hxf);
        }
    }

    @Override // X.HA3
    public final void LJLZ(MusicModel musicModel, String str) {
        MvChoosePhotoScene mvChoosePhotoScene = this.LLIFFJFJJ;
        if (mvChoosePhotoScene != null) {
            mvChoosePhotoScene.LJLZ(musicModel, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    public final void LLLILZLLLI(boolean z, boolean z2) {
        if (z && this.LJLZ != null) {
            if (C19N.LJ("remove_black_line_when_switch_live", false)) {
                View view = this.LLD;
                CameraComponentModel cameraComponentModel = this.LJLZ.cameraComponentModel;
                C141525gy.LIZLLL(cameraComponentModel.mVideoWidth, cameraComponentModel.mVideoHeight, view);
            } else {
                View view2 = this.LLD;
                CameraComponentModel cameraComponentModel2 = this.LJLZ.cameraComponentModel;
                C141525gy.LIZIZ(cameraComponentModel2.mVideoWidth, cameraComponentModel2.mVideoHeight, view2);
            }
        }
        if (z2) {
            if (this.LLD != null && C19N.LJ("remove_black_line_when_switch_live", false)) {
                this.LLD.setScaleX(1.0f);
                this.LLD.setScaleY(1.0f);
            }
            LLLFFI();
        }
    }

    @Override // X.AbstractC147255qD, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        I2K i2k = this.LJLLLL;
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString("enter_from");
        } else {
            str = null;
        }
        i2k.LIZJ = str;
        this.LJLLLL.LIZIZ("video_record_activity_create");
        return (ViewGroup) C16880lQ.LLLLIILL(layoutInflater, R.layout.fo, viewGroup, false);
    }
}

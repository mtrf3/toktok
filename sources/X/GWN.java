package X;

import Y.ARunnableS0S0520000_2;
import Y.ARunnableS26S0200000_7;
import Y.IDCListenerS160S0100000_7;
import Y.IDuS319S0100000_7;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.DMCameraModel;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushConfig;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushFreqControlStrategy;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AqS111S0300000_7;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.AqS14S1400000_7;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS170S0200000_7;
import kotlin.jvm.internal.AqS4S1301000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GWN implements GV9 {
    public GWO LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public WeakReference<Activity> LJFF;
    public ProgressDialogC164766dM LJI;
    public boolean LJII;
    public RecordScene LJIIIIZZ;
    public AwemeDraft LJIIIZ;

    @Override // X.GV9
    public final AwemeDraft LIZ() {
        OSZ<AwemeDraft, VideoPublishEditModel> LJIIZILJ = LJIIZILJ(false);
        if (LJIIZILJ != null) {
            return LJIIZILJ.getFirst();
        }
        return null;
    }

    @Override // X.GV9
    public final void LIZIZ() {
        this.LIZIZ = false;
    }

    @Override // X.GV9
    public final void LJIIJ() {
    }

    @Override // X.GV9
    public final void LJIILIIL() {
        HB4.LJ(3);
    }

    @Override // X.GV9
    public final boolean LJFF() {
        if (!this.LIZIZ || C00F.LIZ(31744, 0, "studio_keep_editing_popup_change_to_push", true) > 0) {
            return false;
        }
        return true;
    }

    @Override // X.GV9
    public final boolean LJII() {
        boolean z = this.LIZLLL;
        this.LIZLLL = false;
        return z;
    }

    @Override // X.GV9
    public final boolean LJIIIIZZ() {
        boolean z = this.LJ;
        this.LJ = false;
        return z;
    }

    @Override // X.GV9
    public final AwemeDraft LJIIIZ() {
        AwemeDraft awemeDraft = this.LJIIIZ;
        if (awemeDraft != null) {
            return awemeDraft;
        }
        AwemeDraft LJ = C1DG.LJFF().LJ(new C41363GLf(new CreativeInfo("CHECK_POINT", 0, null, 6, null), false));
        if (LJ != null) {
            C139895eL.LIZIZ = LJ.LJIIIZ();
            C78841Uwv.LJJIIZ("", new AqS152S0100000_2(LJ, 1051));
            LJ.LIZJ = LJ.LIZ();
            this.LJIIIZ = LJ;
            return LJ;
        }
        return null;
    }

    @Override // X.GV9
    public final boolean LIZLLL() {
        return this.LIZIZ;
    }

    public static RecordConfig LJIILJJIL(Long l) {
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.shootWay("direct_shoot");
        builder.restoreType(2);
        if (l != null) {
            builder.decompressTime(l.longValue());
        }
        return builder.build();
    }

    @Override // X.GV9
    public final void LIZJ(Activity activity) {
        LJIILL(activity, null);
    }

    @Override // X.GV9
    public final boolean LJ(VideoPublishEditModel videoPublishEditModel) {
        int i;
        int i2;
        if (videoPublishEditModel.isDuet() || videoPublishEditModel.isMvThemeVideoType() || videoPublishEditModel.isStitchMode() || videoPublishEditModel.isUploadVideo() || videoPublishEditModel.isCutSameVideoType() || (i = videoPublishEditModel.mShootMode) == 15 || i == 17 || ((videoPublishEditModel.mShootMode == 10 && H7R.LJJJLL(videoPublishEditModel) && !videoPublishEditModel.isUploadVideo()) || H7R.LJJLIIIIJ(videoPublishEditModel))) {
            return true;
        }
        if (C41647GWd.LIZ() && ((i2 = videoPublishEditModel.mShootMode) == 10 || i2 == 11 || i2 == 14 || i2 == 18)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    @Override // X.GV9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIL(android.app.Activity r10) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GWN.LJIIL(android.app.Activity):boolean");
    }

    public final boolean LJIILLIIL(boolean z) {
        AwemeDraft LJIIIZ;
        CreativeModel creativeModel;
        CreativeInitialModel creativeInitialModel;
        DMCameraModel dMCameraModel;
        RecordScene recordScene = this.LJIIIIZZ;
        if (recordScene == null) {
            recordScene = HB4.LIZIZ();
        }
        this.LJIIIIZZ = recordScene;
        InterfaceC171126nc LIZIZ = C5YW.LIZIZ();
        CreativeInfo creativeInfo = recordScene.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "recordScene.creativeInfo");
        File[] listFiles = new File(C164746dK.LJIIIIZZ(LIZIZ, creativeInfo, 2)).listFiles();
        if (listFiles == null || listFiles.length == 0) {
            if (z) {
                HB4.LIZLLL();
            }
            return false;
        }
        C41658GWo LIZLLL = C41658GWo.LIZLLL();
        if (recordScene.isSegmentsNotValid() || ((LJIIIZ = LJIIIZ()) != null && (creativeModel = LJIIIZ.LIZ) != null && (creativeInitialModel = creativeModel.initialModel) != null && (dMCameraModel = creativeInitialModel.dmCameraModel) != null && dMCameraModel.enterFromDM)) {
            return false;
        }
        if (recordScene.isDuetMode() || recordScene.isStitchMode() || recordScene.isShoutout) {
            if (z) {
                C39579Fg7.LJIL(recordScene.duetVideoPath);
                C39579Fg7.LJIL(recordScene.duetAudioPath);
                LIZLLL.getClass();
                C41658GWo.LJI(recordScene);
                HB4.LIZLLL();
            }
        } else {
            if (recordScene.recordMode == 1) {
                if (z) {
                    C39579Fg7.LJIL(recordScene.mp4Path);
                    C39579Fg7.LJIL(recordScene.musicPath);
                    LIZLLL.getClass();
                    C41658GWo.LJI(recordScene);
                    HB4.LIZLLL();
                }
                return false;
            }
            if (TextUtils.isEmpty(recordScene.mp4Path)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final OSZ<AwemeDraft, VideoPublishEditModel> LJIIZILJ(boolean z) {
        if (!LJIILLIIL(z)) {
            return null;
        }
        ShortVideoContext LIZJ = HB3.LIZJ(C16880lQ.LLJJIJI(new HPQ().getRecordBasicIntent(LJIILJJIL(null))), EF7.LIZIZ(), this.LJIIIIZZ);
        C43598H9e c43598H9e = new C43598H9e();
        MultiEditVideoStatusRecordData LJ = C43832HIe.LJ(LIZJ, HMI.LIZ(LIZJ));
        AVMusicWaveBean aVMusicWaveBean = (AVMusicWaveBean) ((AbstractC65743Pr9) AbstractC73672Svk.LJIIJ(new IDuS319S0100000_7(LIZJ, 1)).LIZLLL()).orNull();
        try {
            String str = ((MultiEditVideoSegmentRecordData) ListProtector.get(LJ.curMultiEditVideoRecordData.segmentDataList, 0)).videoPath;
            o.LJIIIIZZ(str, "recordData.curMultiEditV…mentDataList[0].videoPath");
            String str2 = ((MultiEditVideoSegmentRecordData) ListProtector.get(LJ.curMultiEditVideoRecordData.segmentDataList, 0)).audioPath;
            o.LJIIIIZZ(str2, "recordData.curMultiEditV…mentDataList[0].audioPath");
            C42244Gi0 c42244Gi0 = new C42244Gi0(c43598H9e, System.currentTimeMillis(), LIZJ, 0, aVMusicWaveBean, LJ, str, str2);
            new H9R();
            Intent LJIIIIZZ = H9R.LJIIIIZZ(c42244Gi0, c42244Gi0.LIZJ);
            new C43542H7a("CheckPointServiceImpl");
            VideoPublishEditModel LJI = C43542H7a.LJI(C16880lQ.LLJJIJI(LJIIIIZZ));
            return new OSZ<>(C43542H7a.LIZLLL(LJI), LJI);
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
            return null;
        }
    }

    public final void LJIJ(Activity activity) {
        AVExternalServiceImpl.LIZ().abnormalExitLogService().logRestoreDialogClick(true);
        C78934UyQ.LJLIL.getBridgeService().getClass();
        AnchorListManager.LIZJ(null);
        LJIJJLI(activity);
    }

    public final void LJIJJLI(Activity activity) {
        AwemeDraft LJIIIZ;
        o.LJIIIZ(activity, "activity");
        C60903NvH.LJIIJJI().LJJIIJ();
        int LIZ = HB4.LIZ();
        if (LIZ == 4) {
            AwemeDraft LJIIIZ2 = LJIIIZ();
            new C43542H7a("CheckPointServiceImpl");
            if (H7R.LJJIJLIJ(C43542H7a.LIZJ(LJIIIZ2))) {
                LIZ = 2;
            }
        }
        this.LIZIZ = false;
        if (LIZ != 0) {
            if (LIZ != 1 && LIZ != 2) {
                if (LIZ != 3) {
                    if (LIZ != 4 || (LJIIIZ = LJIIIZ()) == null) {
                        return;
                    }
                    I9T.LJFF(LJIIIZ.LIZLLL);
                    this.LJ = true;
                    if (C41649GWf.LIZ()) {
                        C6YM.LIZ();
                        C69B.LIZ();
                        C68M.LJIIJ().LJIJI(activity, Boolean.TRUE);
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    new C43542H7a("AwemeDraftViewHolder");
                    VideoPublishEditModel LIZJ = C43542H7a.LIZJ(LJIIIZ);
                    LIZJ.mDraftToEditFrom = 2;
                    C41663GWt.LJFF(LIZJ);
                    Intent LIZIZ = C41663GWt.LIZIZ(LIZJ, 2, currentTimeMillis, LJIIIZ, false);
                    LIZIZ.putExtra("extra_direct_jump_from_crash", true);
                    C43543H7b.LIZLLL(C45804HyK.LJJIFFI(activity), LIZJ, new C29874Bny(1, activity, LIZIZ));
                    return;
                }
            } else {
                AwemeDraft LJIIIZ3 = LJIIIZ();
                if (LJIIIZ3 == null) {
                    return;
                }
                if (LJIIIZ3.LJJJJI.creationMode == 3 || LJIIIZ3.LIZ.ugcTemplateData.isUgcTemplateFromAnchor || C41647GWd.LIZ()) {
                    C6YM.LIZ();
                    C69B.LIZ();
                    C68M.LJIIJ().LJIJI(activity, Boolean.TRUE);
                }
                I9T.LJFF(LJIIIZ3.LIZLLL);
                this.LJ = true;
                C43543H7b.LJ(LJIIIZ3.LJJJJI.canvasVideoData);
                long currentTimeMillis2 = System.currentTimeMillis();
                new C43542H7a("AwemeDraftViewHolder");
                VideoPublishEditModel LIZJ2 = C43542H7a.LIZJ(LJIIIZ3);
                LIZJ2.mDraftToEditFrom = 2;
                C41663GWt.LJFF(LIZJ2);
                Intent LIZIZ2 = C41663GWt.LIZIZ(LIZJ2, 2, currentTimeMillis2, LJIIIZ3, false);
                LIZIZ2.putExtra("extra_direct_jump_from_crash", true);
                if (H7R.LJJJJI(LIZJ2)) {
                    HZV.LIZ().LJIIIZ(activity, 12352, LIZIZ2);
                    return;
                } else {
                    HZV.LIZ().LJJII(activity, LIZIZ2);
                    return;
                }
            }
        }
        this.LIZLLL = true;
        new HPQ().startRecord(activity, LJIILJJIL(0L));
    }

    @Override // X.GV9
    public final void LJIIJJI(String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        GWO gwo = this.LIZ;
        if (gwo != null) {
            if (!gwo.LIZLLL) {
                gwo.LIZLLL = true;
                InterfaceC112564bM interfaceC112564bM = gwo.LIZJ;
                if (interfaceC112564bM != null) {
                    interfaceC112564bM.LIZIZ(str, false);
                }
                gwo.LIZIZ.invoke(Boolean.valueOf(gwo.LIZ.LJLJLJ), interfaceC65784Pro);
                return;
            }
            InterfaceC112564bM interfaceC112564bM2 = gwo.LIZJ;
            if (interfaceC112564bM2 != null) {
                interfaceC112564bM2.LIZIZ(str, false);
            }
            interfaceC65784Pro.invoke();
            return;
        }
        interfaceC65784Pro.invoke();
    }

    public final void LJIILL(Activity activity, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (this.LJFF == null && activity != null) {
            this.LJFF = new WeakReference<>(activity);
        }
        WeakReference<Activity> weakReference = this.LJFF;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.LIZIZ = false;
        RecordScene recordScene = this.LJIIIIZZ;
        int LIZ = HB4.LIZ();
        if (LIZ != 0) {
            if (LIZ != 1 && LIZ != 2) {
                if (LIZ != 3) {
                    if (LIZ != 4) {
                        return;
                    }
                }
            }
            HB4.LIZLLL();
            if (interfaceC65784Pro == null) {
                return;
            }
            interfaceC65784Pro.invoke();
            return;
        }
        GUL.LIZ.execute(new ARunnableS26S0200000_7(interfaceC65784Pro, recordScene, 31));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GV9
    public final Dialog showRestoreWorkDialog(Activity activity, String enterFrom) {
        boolean z;
        int i;
        int i2;
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        int i3;
        int i4;
        int i5;
        ImageAlbumData imageAlbumData2;
        List<SingleImageData> imageList2;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(enterFrom, "enterFrom");
        int i6 = 1;
        if (C00F.LIZ(31744, 0, "studio_keep_editing_popup_change_to_push", true) > 0) {
            z = true;
        } else {
            z = false;
        }
        int i7 = R.string.dsg;
        InnerPushFreqControlStrategy innerPushFreqControlStrategy = null;
        if (z) {
            this.LJFF = new WeakReference<>(activity);
            C86550Xxy c86550Xxy = C86550Xxy.LIZIZ;
            if (c86550Xxy.LJIIL(1000) == null) {
                C41672GXc c41672GXc = new C41672GXc(activity);
                ViewGroup.LayoutParams layoutParams = c41672GXc.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new ViewGroup.LayoutParams(-1, -2);
                } else {
                    layoutParams.width = -1;
                    layoutParams.height = -2;
                }
                c41672GXc.setLayoutParams(layoutParams);
                c41672GXc.setConfirmAction(new AqS154S0200000_7(this, activity, enterFrom, UserLevelGeckoUpdateSetting.DEFAULT));
                c41672GXc.setCancelAction(new AqS154S0200000_7(this, activity, enterFrom, 141));
                GWZ.LIZIZ(new WeakReference(c41672GXc.getCoverImgView()), 4.0f, this.LJIIIIZZ);
                if (HB4.LIZ() == 4) {
                    i3 = R.string.jl1;
                } else {
                    i3 = R.string.pzv;
                }
                if (GWQ.LIZ()) {
                    i3 = R.string.tdo;
                    i7 = R.string.tdn;
                    i4 = R.string.tdk;
                } else {
                    i4 = R.string.cg_;
                }
                c41672GXc.LIZ(i7, true);
                c41672GXc.LIZ(i4, false);
                AwemeDraft LJIIIZ = LJIIIZ();
                if (HB4.LIZ() == 4 && GWQ.LIZ()) {
                    Resources resources = c41672GXc.getContext().getResources();
                    if (LJIIIZ != null && (imageAlbumData2 = LJIIIZ.LJJJJI.imageAlbumData) != null && (imageList2 = imageAlbumData2.getImageList()) != null) {
                        i5 = imageList2.size();
                    } else {
                        i5 = 1;
                    }
                    String quantityString = resources.getQuantityString(R.plurals.uc, i5);
                    o.LJIIIIZZ(quantityString, "context.resources.getQua…a?.imageList?.size ?: 1))");
                    c41672GXc.setText(quantityString);
                } else {
                    c41672GXc.setText(i3);
                }
                GWO gwo = new GWO(c41672GXc, new AqS170S0200000_7(activity, this, 6));
                this.LIZ = gwo;
                c86550Xxy.LIZ.LJIIJJI(gwo);
                GWO gwo2 = this.LIZ;
                if (gwo2 != null) {
                    c86550Xxy.LJIIIIZZ(gwo2, null);
                } else {
                    o.LJIJI("handler");
                    throw null;
                }
            }
            long j = 0;
            c86550Xxy.LIZJ(new C51764KTg(1000, "click_push_keep_editing_popup", new InnerPushConfig(j, innerPushFreqControlStrategy, 10000, C47261Igj.LJJIJIIJI(1, 2, 3, 4, 5, 6), C00F.LIZ(31744, 5, "studio_show_keep_editing_push_duration", true), 3, null == true ? 1 : 0), new InnerPushUITemplate(0, null, 0, 0, 0, 0, null, null, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, 0, 0, null, null, null, 0, 0, null, null, null, null, 0, null, 0, null, null, 0, 0, 0, 0, null, null, 0.0f, 0, null, null, null, 0, null, null, null, null, null, -1, 1048575, null), null, null, 204));
            return null;
        }
        int LIZ = C00F.LIZ(31744, 0, "creative_restore_work_phase_two", true);
        if (LIZ != 0) {
            if (LIZ != 1) {
                if (LIZ != 2) {
                    return null;
                }
                this.LJFF = new WeakReference<>(activity);
                View LLLZIIL = C16880lQ.LLLZIIL(R.layout.amw, C16880lQ.LLZIL(activity), null);
                LLLZIIL.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                GWZ.LIZIZ(new WeakReference(LLLZIIL.findViewById(R.id.iz8)), 8.0f, this.LJIIIIZZ);
                if (HB4.LIZ() == 4) {
                    i = R.string.jl0;
                } else {
                    i = R.string.pzu;
                }
                C76732zl c76732zl = new C76732zl();
                c76732zl.element = R.string.dsg;
                C76732zl c76732zl2 = new C76732zl();
                c76732zl2.element = R.string.cg_;
                if (HB4.LIZ() == 4) {
                    i2 = R.string.jl1;
                } else {
                    i2 = R.string.pzv;
                }
                if (GWQ.LIZ()) {
                    c76732zl.element = R.string.tdn;
                    c76732zl2.element = R.string.tdk;
                    i2 = R.string.tdo;
                }
                C26227ARb c26227ARb = new C26227ARb(activity);
                C78685UuP.LJIJI(c26227ARb, LLLZIIL, 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
                c26227ARb.LIZ(i);
                UC0.LIZJ(c26227ARb, new AqS14S1400000_7(c76732zl, c76732zl2, this, activity, enterFrom, 1));
                c26227ARb.LIZJ(GWP.LJLIL);
                c26227ARb.LJII = false;
                if (HB4.LIZ() == 4 && GWQ.LIZ()) {
                    Resources resources2 = activity.getResources();
                    AwemeDraft LJIIIZ2 = LJIIIZ();
                    if (LJIIIZ2 != null && (imageAlbumData = LJIIIZ2.LJJJJI.imageAlbumData) != null && (imageList = imageAlbumData.getImageList()) != null) {
                        i6 = imageList.size();
                    }
                    c26227ARb.LJFF(resources2.getQuantityString(R.plurals.uc, i6));
                } else {
                    c26227ARb.LJ(i2);
                }
                return c26227ARb.LJI().LJ();
            }
            return LJIJJ(activity, enterFrom, new AqS138S0200000_7(activity, this, 112));
        }
        return LJIJJ(activity, enterFrom, new AqS138S0200000_7(activity, this, 111));
    }

    public final Dialog LJIJJ(Activity activity, String str, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        int i;
        int i2;
        int i3;
        if (GWQ.LIZ()) {
            i = R.string.tdo;
            i2 = R.string.tdn;
            i3 = R.string.tdk;
        } else {
            i = R.string.tn6;
            i2 = R.string.dsg;
            i3 = R.string.cg_;
        }
        C62905OmT c62905OmT = new C62905OmT(activity);
        c62905OmT.LIZ(i);
        c62905OmT.LJIIJ(i2, new IDCListenerS160S0100000_7(str, interfaceC88472Yns, 15));
        c62905OmT.LJII(i3, new GJW(this, activity, interfaceC88472Yns));
        c62905OmT.LJII = false;
        return new C62906OmU(c62905OmT).LJ();
    }

    @Override // X.GV9
    public final void LJI(VideoPublishEditModel videoPublishEditModel, String str, int i, InterfaceC88472Yns<? super C142535ib, C76800UCe> interfaceC88472Yns) {
        LJIIJJI("save", new AqS4S1301000_2(this, (GWN) videoPublishEditModel, (VideoPublishEditModel) str, (String) i, (int) interfaceC88472Yns, (InterfaceC88472Yns<? super C142535ib, C76800UCe>) 6));
    }

    public static void LJIJI(GWN gwn, Activity activity, AwemeDraft awemeDraft, VideoPublishEditModel videoPublishEditModel, AqS111S0300000_7 aqS111S0300000_7, int i) {
        boolean z;
        VideoPublishEditModel videoPublishEditModel2;
        String str;
        String str2;
        VideoPublishEditModel videoPublishEditModel3 = videoPublishEditModel;
        AqS111S0300000_7 aqS111S0300000_72 = aqS111S0300000_7;
        if ((i & 4) != 0) {
            videoPublishEditModel3 = null;
        }
        if ((i & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 32) != 0) {
            aqS111S0300000_72 = null;
        }
        if (gwn.LJII || awemeDraft == null) {
            return;
        }
        awemeDraft.LJJJJI.publishStage = 0;
        awemeDraft.lastEditTime = System.currentTimeMillis();
        if (awemeDraft.LIZLLL == null) {
            awemeDraft.LJI = null;
        }
        if (videoPublishEditModel3 == null) {
            new C43542H7a("CheckPointServiceImpl");
            videoPublishEditModel2 = C43542H7a.LIZJ(awemeDraft);
        } else {
            videoPublishEditModel2 = videoPublishEditModel3;
        }
        if (videoPublishEditModel2.isMultiVideoEdit() && TextUtils.isEmpty(videoPublishEditModel2.multiEditVideoRecordData.coverImagePath) && (str2 = GWZ.LIZ) != null) {
            videoPublishEditModel2.multiEditVideoRecordData.coverImagePath = str2;
        }
        DraftInfoModel draftInfoModel = videoPublishEditModel2.creativeModel.draftInfoModel;
        StringBuilder sb = new StringBuilder();
        char[] charArray = "AutoSaveFromContinuePopup".toCharArray();
        o.LJIIIIZZ(charArray, "this as java.lang.String).toCharArray()");
        int length = charArray.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            char c = charArray[i2];
            int i4 = i3 + 1;
            if (Character.isUpperCase(c) && i3 != 0) {
                sb.append("_");
                String valueOf = String.valueOf(c);
                o.LJII(valueOf, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = valueOf.toLowerCase(Locale.ROOT);
                o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                sb.append(lowerCase);
            } else {
                String valueOf2 = String.valueOf(c);
                o.LJII(valueOf2, "null cannot be cast to non-null type java.lang.String");
                String lowerCase2 = valueOf2.toLowerCase(Locale.ROOT);
                o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                sb.append(lowerCase2);
            }
            i2++;
            i3 = i4;
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        draftInfoModel.getClass();
        draftInfoModel.saveDraftScene = sb2;
        videoPublishEditModel2.shootEnterMethod = "continue_popup_auto_save";
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[saveDraft]: creation id = ");
        LIZ.append(awemeDraft.LIZ());
        C143195jf.LIZ(X1D.LIZIZ(LIZ));
        gwn.LJII = true;
        if (videoPublishEditModel3 == null || (str = videoPublishEditModel3.enterFrom) == null) {
            str = "";
        }
        H8H.LIZIZ(videoPublishEditModel2, str, false, 60);
        GUL.LIZ.execute(new ARunnableS0S0520000_2(videoPublishEditModel2, videoPublishEditModel3, false, gwn, activity, z, aqS111S0300000_72, 1));
    }
}

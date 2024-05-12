package X;

import Y.AObserverS70S0100000_2;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.draft.model.CutSameEditData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shoutouts.ShoutOutsData;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.6bU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163606bU extends AbstractC29891Fh<C6FS> implements C6FS, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIJI;
    public final C82622Wbi LJLIL;
    public final InterfaceC115514g7 LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public final InterfaceC115514g7 LJLJLLL;
    public final InterfaceC115514g7 LJLL;
    public final InterfaceC115514g7 LJLLI;
    public final InterfaceC115514g7 LJLLILLLL;
    public boolean LJLLJ;
    public final LiveEvent<C76800UCe> LJLLL;
    public final LiveEvent<C85808Xm0> LJLLLL;
    public final C29901Fi<C76800UCe> LJLLLLLL;
    public final LiveEvent<C76800UCe> LJLZ;
    public final C29901Fi<OSZ<Integer, Intent>> LJZ;
    public final LiveEvent<OSZ<Integer, Intent>> LJZI;
    public final C29901Fi<Boolean> LJZL;
    public final LiveEvent<Boolean> LL;
    public final C29901Fi<Intent> LLD;
    public final LiveEvent<Intent> LLF;
    public final C29901Fi<C76800UCe> LLFF;
    public final LiveEvent<C76800UCe> LLFFF;
    public final C29901Fi<OSJ<Integer, Integer, Integer>> LLFII;
    public final LiveEvent<OSJ<Integer, Integer, Integer>> LLFZ;
    public final C29901Fi<C76800UCe> LLI;
    public final LiveEvent<C76800UCe> LLIFFJFJJ;
    public final C29901Fi<C76800UCe> LLII;
    public final LiveEvent<C76800UCe> LLIIII;
    public final C29901Fi<Boolean> LLIIIILZ;
    public final LiveEvent<Boolean> LLIIIJ;
    public final C29901Fi<C76800UCe> LLIIIL;
    public final LiveEvent<C76800UCe> LLIIIZ;

    private final boolean LLF() {
        return LLFFF(true);
    }

    public C6FS LJJLIIIJJI() {
        return this;
    }

    @Override // X.C6FS
    public boolean Ym() {
        return false;
    }

    static {
        TBT tbt = new TBT(C163606bU.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLIIJI = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C163606bU.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0, c65351Pkp), C61845OOz.LIZJ(C163606bU.class, "editPrePublishApi", "getEditPrePublishApi()Lcom/ss/android/ugc/gamora/editor/preload/EditPrePublishApi;", 0, c65351Pkp), C61845OOz.LIZJ(C163606bU.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(C163606bU.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/BaseEditStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C163606bU.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(C163606bU.class, "oldMusicModel", "getOldMusicModel()Lcom/ss/android/ugc/aweme/shortvideo/AVMusic;", 0, c65351Pkp), C61845OOz.LIZJ(C163606bU.class, "oldMusicPath", "getOldMusicPath()Ljava/lang/String;", 0, c65351Pkp), C61845OOz.LIZJ(C163606bU.class, "draftToEditFrom", "getDraftToEditFrom()I", 0, c65351Pkp), C61845OOz.LIZJ(C163606bU.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0, c65351Pkp), C61845OOz.LIZJ(C163606bU.class, "stickerChallengeManager", "getStickerChallengeManager()Lcom/ss/android/ugc/aweme/infoSticker/StickerChallengeManager;", 0, c65351Pkp)};
    }

    private final int LJJLIIIJJIZ() {
        return ((Number) this.LJLL.LIZ(this, LLIIJI[8])).intValue();
    }

    private final InterfaceC142515iZ LJJLIIIJLLLLLLLZ() {
        return (InterfaceC142515iZ) this.LJLJI.LIZ(this, LLIIJI[1]);
    }

    private final InterfaceC145815nt LJJLIIJ() {
        return (InterfaceC145815nt) this.LJLJJI.LIZ(this, LLIIJI[2]);
    }

    private final InterfaceC143655kP LJJLJ() {
        return (InterfaceC143655kP) this.LJLJJL.LIZ(this, LLIIJI[3]);
    }

    private final InterfaceC140385f8 LJJLJLI() {
        return (InterfaceC140385f8) this.LJLJJLL.LIZ(this, LLIIJI[4]);
    }

    private final VideoPublishEditModel LJJZZI() {
        return (VideoPublishEditModel) this.LJLJL.LIZ(this, LLIIJI[5]);
    }

    private final InterfaceC145495nN LJJZZIII() {
        return (InterfaceC145495nN) this.LJLLI.LIZ(this, LLIIJI[9]);
    }

    private final AVMusic LJLIIL() {
        return (AVMusic) this.LJLJLJ.LIZ(this, LLIIJI[6]);
    }

    private final String LJLJJL() {
        return (String) this.LJLJLLL.LIZ(this, LLIIJI[7]);
    }

    private final C137965bE LJLJJLL() {
        return (C137965bE) this.LJLLILLLL.LIZ(this, LLIIJI[10]);
    }

    private final void LJZI() {
        this.LLIIIL.LJII(C76800UCe.LIZ);
    }

    private final ActivityC45651qj getActivity() {
        return (ActivityC45651qj) this.LJLILLLLZI.LIZ(this, LLIIJI[0]);
    }

    @Override // X.C6FS
    public void A50() {
        H8F.LJIJI(LJJZZI(), "cancel");
    }

    @Override // X.C6FS
    public void g40() {
        H8F.LJIJI(LJJZZI(), "back_to_camera");
        if (LJLZ() && LJJZZI().mIsFromDraft) {
            LLIILZL();
            return;
        }
        if (LJJZZI().recordMode == 1) {
            LJLJLJ();
        } else {
            if (C60903NvH.LJIIJJI().LJJIII().shouldDisable10MinDraftRecord(LJJZZI())) {
                C5S1 c5s1 = new C5S1(getActivity());
                c5s1.LIZJ(R.string.b91);
                c5s1.LJ();
                return;
            }
            LJJLIIIJILLIZJL();
        }
    }

    @Override // X.C6FS
    public void gs0() {
        H8F.LJIJI(LJJZZI(), "save");
        DraftInfoModel draftInfoModel = LJJZZI().creativeModel.draftInfoModel;
        draftInfoModel.getClass();
        draftInfoModel.saveDraftScene = "clickSheetFromEdit";
        LJZI();
    }

    private final OSJ<Integer, Integer, Integer> LJJLL() {
        boolean z = LJJZZI().mIsFromDraft;
        Integer valueOf = Integer.valueOf(R.string.grs);
        Integer valueOf2 = Integer.valueOf(R.string.cg_);
        if (z && (LJJZZI().mFromMultiCut || LJJZZI().mFromCut)) {
            return new OSJ<>(Integer.valueOf(R.string.psi), valueOf2, valueOf);
        }
        if (LJJZZI().mFromMultiCut || LJJZZI().mFromCut || LJJZZI().isPhotoMvMode || LJJZZI().canvasVideoData != null) {
            return new OSJ<>(Integer.valueOf(R.string.tod), valueOf2, valueOf);
        }
        return new OSJ<>(Integer.valueOf(R.string.toc), valueOf2, valueOf);
    }

    private final void LJLJLJ() {
        if (!TextUtils.isEmpty(LJJZZI().newDraftId)) {
            H8F.LJIIZILJ(LJJZZI());
        }
        C60903NvH.LJIIJJI().LJIIIZ().LIZ();
        I9T.LJI(LJLIIL(), I9T.LIZJ(LJJZZI().creativeModel.musicBuzModel), LJJZZI().creativeModel.musicBuzModel);
        C41658GWo.LIZLLL().LJI = "";
        this.LLFF.LJII(C76800UCe.LIZ);
        this.LJZ.LJII(null);
    }

    private final void LJLLILLLL() {
        LJJLJ().sU().observe(this, new AObserverS70S0100000_2(this, 92));
    }

    private final boolean LJLLL() {
        if (LJJZZI().isPhotoMvMode && LJJZZI().getOriginal() == 1) {
            return true;
        }
        return false;
    }

    private final boolean LJLZ() {
        if (LJJZZI().mShootMode == 15 || LJJZZI().mShootMode == 2 || LJJZZI().mShootMode == 17) {
            return true;
        }
        VideoPublishEditModel LJJZZI = LJJZZI();
        o.LJIIIZ(LJJZZI, "<this>");
        if (LJJZZI.mShootMode == 10 && H7R.LJJJLL(LJJZZI) && !LJJZZI.isUploadVideo()) {
            return true;
        }
        return false;
    }

    private final void LLIILZL() {
        if (!TextUtils.isEmpty(LJJZZI().newDraftId)) {
            H8F.LJIIZILJ(LJJZZI());
        }
        C60903NvH.LJIIJJI().LJIIIZ().LIZ();
        I9T.LJI(LJLIIL(), I9T.LIZJ(LJJZZI().creativeModel.musicBuzModel), LJJZZI().creativeModel.musicBuzModel);
        C41658GWo.LIZLLL().LJI = "";
        this.LLFF.LJII(C76800UCe.LIZ);
        Intent LJJLIIIIJ = LJJLIIIIJ(LJJZZI());
        if (LJJLIIIIJ == null) {
            return;
        }
        this.LLD.LJII(LJJLIIIIJ);
    }

    public final void LJJLIIIJILLIZJL() {
        String str;
        boolean z;
        int i;
        if (LJJLJLI().LLZZ()) {
            LJJLJLI().X80();
        }
        I9T.LJI(LJLIIL(), I9T.LIZJ(LJJZZI().creativeModel.musicBuzModel), LJJZZI().creativeModel.musicBuzModel);
        if (LJJZZI().mIsFromDraft) {
            LJJZZI().setMMusicPath(LJLJJL());
            if (!C39579Fg7.LIZIZ(LJJZZI().mStickerPath)) {
                LJJZZI().mStickerPath = null;
                LJJZZI().mStickerID = "";
            }
            Intent LJJLI = LJJLI(LJJZZI());
            if (LJJLI == null) {
                return;
            }
            this.LLD.LJII(LJJLI);
            return;
        }
        boolean z2 = false;
        if (LJJZZI().hasRetake()) {
            Intent intent = new Intent();
            C43542H7a.LIZ(intent, LJJZZI());
            I9T.LJI(LJJZZI().getOriginalRecordMusic(), false, LJJZZI().creativeModel.musicBuzModel);
            HZV.LIZ().LJIIIIZZ(getActivity(), intent);
            this.LJZ.LJII(null);
            return;
        }
        if (LJJZZI().isCutSameVideoType()) {
            InterfaceC163636bX LIZIZ = C78934UyQ.LJLIL.LIZIZ();
            CutSameEditData cutSameEditData = LJJZZI().cutSameEditData;
            o.LJIIIIZZ(cutSameEditData, "model.cutSameEditData");
            this.LJZ.LJII(new OSZ<>(-1, LIZIZ.LIZJ(cutSameEditData)));
            return;
        }
        VideoPublishEditModel model = LJJZZI();
        o.LJIIIZ(model, "model");
        C145995oB LJJJLIIL = H8F.LJJJLIIL(model);
        LJJJLIIL.LJI("creation_id", model.getCreationId());
        LJJJLIIL.LJI("shoot_way", model.mShootWay);
        LJJJLIIL.LJI("filter_name", model.mRecordFilterLabels);
        LJJJLIIL.LJI("filter_id", model.mRecordFilterIds);
        LJJJLIIL.LJI("shoot_enter_from", model.creativeModel.commonMobModel.shootEnterFrom);
        LJJJLIIL.LJI("shoot_enter_from", model.creativeModel.commonMobModel.shootEnterMethod);
        LJJJLIIL.LJI("content_type", H7R.LJIIIZ(model));
        LJJJLIIL.LJI("content_source", H7R.LJIIIIZZ(model));
        if (model.isFromCrash()) {
            LJJJLIIL.LIZ(1, "is_restore_crash");
        }
        if (model.creativeFlowData.isThroughAnchor()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LJJJLIIL.LJI("is_through_anchor", str);
        LJJJLIIL.LJI("action_originated_from", model.creativeModel.commerceModel.getMusicContext().getActionOriginatedFrom().toString());
        int i2 = model.draftId;
        if (i2 != 0) {
            LJJJLIIL.LIZ(i2, "draft_id");
        }
        String str2 = model.newDraftId;
        o.LJIIIIZZ(str2, "model.newDraftId");
        if (str2.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        String str3 = "click_back_button";
        if (z) {
            LJJJLIIL.LIZLLL("new_draft_id", model.newDraftId);
            if (model.mDraftToEditFrom == 0) {
                LJJJLIIL.LIZLLL("draft_way", "general_draft_list");
            }
            LJJJLIIL.LIZLLL("enter_method", "click_back_button");
        }
        if (o.LJ(model.mShootWay, "direct_shoot")) {
            LJJJLIIL.LIZLLL("is_story_enhanced_entrance", C79004UzY.LJJJJLL(model.creativeModel.commonMobModel.isStoryEnhancedEntrance));
        }
        if (C60903NvH.LJIIJJI().LJIIJ().LJII()) {
            str3 = "click_continue_popup";
        }
        LJJJLIIL.LIZLLL("enter_method", str3);
        String stickers = model.getStickers();
        if (stickers != null && stickers.length() != 0) {
            LJJJLIIL.LIZLLL("prop_id", model.getStickers());
        }
        if (TextUtils.equals(model.enterFrom, "super_entrance")) {
            LJJJLIIL.LIZ(1, "is_special_icon");
        }
        if (model.isShoutout()) {
            LJJJLIIL.LIZLLL("shoot_entrance", model.mShootWay);
            LJJJLIIL.LIZ(model.mShoutOutsData.getReviewed(), "reviewed");
            if (!TextUtils.isEmpty(model.mShoutOutsData.getOrderId())) {
                LJJJLIIL.LIZLLL(ShoutOutsData.MOD_ORDER_ID, model.mShoutOutsData.getOrderId());
            }
        }
        if (!TextUtils.isEmpty(model.clientId)) {
            LJJJLIIL.LIZLLL("channel", model.clientId);
        }
        LJJJLIIL.LIZLLL("is_westwindow_exist", model.isWestWindowExistStr);
        if (!TextUtils.isEmpty(model.shareId)) {
            LJJJLIIL.LIZLLL("open_platform_share_id", model.shareId);
        }
        if (model.isDuet()) {
            LJJJLIIL.LIZ(model.duetVideoDuration, "duet_video_duration");
        } else if (model.isStitchMode()) {
            StitchParams stitchParams = model.stitchParams;
            if (stitchParams != null) {
                i = stitchParams.getStitchVideoDuration();
            } else {
                i = 0;
            }
            LJJJLIIL.LIZ(i, "stitch_video_duration");
        }
        if (o.LJ("anchor_combine_tts", model.mShootWay) && model.getTtsVoiceModel() != null) {
            LJJJLIIL.LIZLLL("tone_list", model.getTtsVoiceModel().getEffectId());
        }
        String str4 = model.creativeModel.initialModel.socialParametersModel.isPropPrompt;
        if (str4 != null) {
            LJJJLIIL.LIZLLL("is_prop_prompt", str4);
        }
        String str5 = model.creativeModel.initialModel.socialParametersModel.fromUserId;
        if (str5 != null) {
            LJJJLIIL.LIZLLL("from_user_id", str5);
        }
        String entryPoint = model.creativeModel.paidContentModel.getEntryPoint();
        if (entryPoint != null) {
            LJJJLIIL.LIZLLL("entry_point", entryPoint);
        }
        if (C140435fD.LIZ(model)) {
            Iterator it = ((ArrayList) C135145Sc.LIZIZ).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((InterfaceC135135Sb) it.next()).LLI()) {
                    z2 = true;
                    break;
                }
            }
            if (z2) {
                LJJJLIIL.LIZLLL("is_enter_from_edit_page_with_edit", "1");
            } else {
                LJJJLIIL.LIZLLL("is_enter_from_edit_page_with_edit", CardStruct.IStatusCode.DEFAULT);
            }
        }
        C44989HlB.LIZ(LJJJLIIL);
        LJJJLIIL.LJI("internet_status", C79004UzY.LJJJJLL(C163626bW.LIZJ()));
        LJJJLIIL.LIZ(C78841Uwv.LJ(C47636Imm.LIZ()), "earphone_state");
        FMX.LJIIL("enter_video_shoot_page", LJJJLIIL.LIZ);
        ((ArrayList) C41658GWo.LIZLLL().LIZ).clear();
        this.LLFF.LJII(C76800UCe.LIZ);
        Intent intent2 = new Intent();
        intent2.putExtra("edit_to_record_time", System.currentTimeMillis());
        this.LJZ.LJII(new OSZ<>(-1, intent2));
    }

    @Override // X.C6FS
    public void Tq() {
        C147625qo.LIZIZ(LJJZZI(), LJJLJLI().tj0());
        H8F.LJIJI(LJJZZI(), "discard");
        if (LJJZZI().isFromRestoreRecover) {
            LJLJLJ();
        } else {
            this.LLIIIILZ.LJII(Boolean.FALSE);
        }
    }

    @Override // X.C6FS
    public void lc() {
        C147625qo.LIZIZ(LJJZZI(), LJJLJLI().tj0());
        LJJLIIIJILLIZJL();
    }

    @Override // X.C6FS
    public void mG() {
        if (!TextUtils.isEmpty(LJJZZI().newDraftId)) {
            H8F.LJIIZILJ(LJJZZI());
        }
        LJZI();
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        LJJLIIIJLLLLLLLZ().FE(this);
        LJLLILLLL();
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        LJJLIIIJLLLLLLLZ().FE(null);
    }

    @Override // X.C6FS
    public void qB() {
        if (!TextUtils.isEmpty(LJJZZI().newDraftId)) {
            H8F.LJIIZILJ(LJJZZI());
        }
        this.LLFF.LJII(C76800UCe.LIZ);
        this.LJZ.LJII(null);
    }

    @Override // X.C6FS
    public boolean rj0() {
        float f;
        String duetFrom;
        String str;
        int i;
        InterfaceC145815nt LJJLIIJ;
        if (LJJLIIJ() != null && (LJJLIIJ = LJJLIIJ()) != null) {
            LJJLIIJ.ap("quit edit page!");
        }
        if (TextUtils.equals(LJJZZI().enterFrom, "effect_qr_scan")) {
            LiveEvent<C76800UCe> SY = SY();
            o.LJII(SY, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Unit>");
            ((C29901Fi) SY).LJII(C76800UCe.LIZ);
            return true;
        }
        boolean LJIIIIZZ = C1DG.LJIIIIZZ();
        if (w8()) {
            uR(false);
            return false;
        }
        VideoPublishEditModel mModel = LJJZZI();
        o.LJIIIZ(mModel, "mModel");
        if (!C60903NvH.LJIIJJI().getAccountService().isChildrenMode() && C1B8.LIZJ() && (str = mModel.albumPreviewNextMethod) != null && str.length() != 0) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("creation_id", mModel.getCreationId());
            c145995oB.LIZ(mModel.getPreviewInfo().getPreviewVideoLength(), "creation_duration");
            c145995oB.LJI("content_source", "upload");
            c145995oB.LJI("content_type", H7R.LJIIIZ(mModel));
            c145995oB.LJI("shoot_way", mModel.mShootWay);
            if (mModel.getPreviewInfo().getVideoList().size() > 1) {
                i = 1;
            } else {
                i = 0;
            }
            c145995oB.LIZ(i, "is_multi_content");
            String str2 = mModel.albumPreviewNextMethod;
            o.LJIIIIZZ(str2, "mModel.albumPreviewNextMethod");
            c145995oB.LIZ(s.LJJJLZIJ(str2, "preview", false) ? 1 : 0, "is_detail");
            c145995oB.LJI("enter_from", "video_edit_page");
            c145995oB.LJI("enter_method", mModel.albumPreviewNextMethod);
            FMX.LJIIL("re_enter_album", c145995oB.LIZ);
        }
        if (C151965xo.LIZJ(LJJZZI()) && LJJZZI().getOriginal() == 1 && ((LJJZZI().mIsFromDraft || LJJZZI().draftFromShoot) && (C44384HbQ.LJLLILLLL(LJJZZI()) || C44384HbQ.LJZI(LJJZZI())))) {
            if (C153255zt.LIZ() && !LJIIIIZZ) {
                LLIFFJFJJ(LJJZZI().draftFromShoot);
                return true;
            }
            if (LJJZZI().mIsFromDraft) {
                if (e1.LIZ(31744, "studio_remove_start_over_in_story_draft", true, false)) {
                    this.LLIIIILZ.LJII(Boolean.FALSE);
                } else {
                    this.LJLLLLLL.LJII(C76800UCe.LIZ);
                }
                return true;
            }
        }
        if (LJJZZI().isDuet()) {
            if (LJJZZI().mIsFromDraft && !LJJZZI().duetFilesExist()) {
                this.LJZ.LJII(null);
                return true;
            }
            if ((LJJZZI().mIsFromDraft || LJJZZI().draftFromShoot) && C153255zt.LIZ() && !LJIIIIZZ) {
                LLIFFJFJJ(LJJZZI().draftFromShoot);
            } else if (LLF()) {
                LJJLIIIJILLIZJL();
            }
            return false;
        }
        if (LJJZZI().isFromCrash()) {
            if (H7R.LJJLIIIJJIZ(LJJZZI()) || C44384HbQ.LJZI(LJJZZI()) || C79004UzY.LJJIIJ(LJJZZI().canvasVideoData)) {
                LLIFFJFJJ(LJJZZI().draftFromShoot);
                return false;
            }
            if (H7R.LJJIZ(LJJZZI())) {
                LLIFFJFJJ(LJJZZI().draftFromShoot);
                return false;
            }
            if (LLF()) {
                LJJLIIIJILLIZJL();
            }
            return false;
        }
        C149905uU.LIZLLL(LJJZZI());
        VideoPublishEditModel LJJZZI = LJJZZI();
        InterfaceC143655kP LJJLJ = LJJLJ();
        InterfaceC153045zY value = LJJLJ().Kh().getValue();
        if (value != null) {
            f = value.LLJJJ();
        } else {
            f = -1.0f;
        }
        H8F.LJJIJIIJI(LJJZZI, LJJLJ, f, "exit_edit");
        if (LJJZZI().recordMode == 1 || (duetFrom = LJJZZI().getDuetFrom()) == null || duetFrom.length() == 0) {
            if (LJJZZI().recordMode == 1) {
                if (LJJZZI().draftFromShoot || LJJZZI().mIsFromDraft) {
                    if (C153255zt.LIZ() && !LJIIIIZZ) {
                        LLIFFJFJJ(LJJZZI().draftFromShoot);
                    } else {
                        this.LLFII.LJII(new OSJ<>(Integer.valueOf(R.string.psi), Integer.valueOf(R.string.cg_), Integer.valueOf(R.string.grs)));
                    }
                    return false;
                }
                this.LLII.LJII(C76800UCe.LIZ);
                return false;
            }
            if (LJJZZI().isCutSameVideoType()) {
                if (LJJZZI().mIsFromDraft || LJJZZI().draftFromShoot) {
                    if (C153255zt.LIZ() && !LJIIIIZZ) {
                        LLIFFJFJJ(LJJZZI().draftFromShoot);
                    } else {
                        this.LLI.LJII(C76800UCe.LIZ);
                    }
                } else if (LLFFF(false)) {
                    LJJLIIIJILLIZJL();
                }
                return false;
            }
            if (LJJZZI().mOrigin != 1 && (LJJZZI().mIsFromDraft || LJJZZI().draftFromShoot)) {
                if (C153255zt.LIZ() && !LJIIIIZZ) {
                    LLIFFJFJJ(LJJZZI().draftFromShoot);
                } else {
                    this.LLI.LJII(C76800UCe.LIZ);
                }
                return false;
            }
            if (LJJZZI().isMvThemeVideoType() && !LJLLL() && (LJJZZI().mIsFromDraft || LJJZZI().draftFromShoot)) {
                if (C153255zt.LIZ() && !LJIIIIZZ) {
                    LLIFFJFJJ(LJJZZI().draftFromShoot);
                } else {
                    this.LLI.LJII(C76800UCe.LIZ);
                }
                return false;
            }
            if (LJJZZI().mOrigin == 0 && LJJZZI().canvasVideoData != null) {
                if (LLFFF(false)) {
                    LJJLIIIJILLIZJL();
                }
                return false;
            }
            if (LJJZZI().mFromCut || LJJZZI().mOrigin == 0 || LJJZZI().mFromMultiCut) {
                this.LLFII.LJII(LJJLL());
                return false;
            }
            if ((LJJZZI().mIsFromDraft || LJJZZI().draftFromShoot) && C153255zt.LIZ() && !LJIIIIZZ) {
                LLIFFJFJJ(LJJZZI().draftFromShoot);
                return true;
            }
            if (LLF()) {
                LJJLIIIJILLIZJL();
            }
            return false;
        }
        this.LLFF.LJII(C76800UCe.LIZ);
        if (!TextUtils.isEmpty(LJJZZI().newDraftId)) {
            H8F.LJIIZILJ(LJJZZI());
            this.LJZ.LJII(null);
            return true;
        }
        if (LLF()) {
            LJJLIIIJILLIZJL();
        }
        return false;
    }

    @Override // X.C6FS
    public void DF() {
        LLIILZL();
    }

    @Override // X.C6FS
    public LiveEvent<OSJ<Integer, Integer, Integer>> Fx() {
        return this.LLFZ;
    }

    @Override // X.C6FS
    public LiveEvent<OSZ<Integer, Intent>> HZ() {
        return this.LJZI;
    }

    @Override // X.C6FS
    public LiveEvent<Boolean> Hl0() {
        return this.LL;
    }

    @Override // X.C6FS
    public LiveEvent<C76800UCe> NR() {
        return this.LJLZ;
    }

    @Override // X.C6FS
    public LiveEvent<C76800UCe> Pl() {
        return this.LLIFFJFJJ;
    }

    @Override // X.C6FS
    public LiveEvent<C85808Xm0> QI() {
        return this.LJLLLL;
    }

    @Override // X.C6FS
    public LiveEvent<C76800UCe> SY() {
        return this.LJLLL;
    }

    @Override // X.C6FS
    public LiveEvent<Boolean> Tg() {
        return this.LLIIIJ;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ C6FS getApiComponent() {
        LJJLIIIJJI();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.C6FS
    public LiveEvent<Intent> hy() {
        return this.LLF;
    }

    @Override // X.C6FS
    public LiveEvent<C76800UCe> iF() {
        return this.LLIIII;
    }

    @Override // X.C6FS
    public LiveEvent<C76800UCe> kl0() {
        return this.LLIIIZ;
    }

    @Override // X.C6FS
    public boolean w8() {
        return this.LJLLJ;
    }

    @Override // X.C6FS
    public LiveEvent<C76800UCe> zo() {
        return this.LLFFF;
    }

    public C163606bU(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = UCI.LJI(getDiContainer(), ActivityC45651qj.class, null);
        this.LJLJI = UCI.LJI(getDiContainer(), InterfaceC142515iZ.class, null);
        this.LJLJJI = UCI.LJII(getDiContainer(), InterfaceC145815nt.class, null);
        this.LJLJJL = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLJJLL = UCI.LJI(getDiContainer(), InterfaceC140385f8.class, null);
        this.LJLJL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJLJ = UCI.LJII(getDiContainer(), AVMusic.class, null);
        this.LJLJLLL = UCI.LJII(getDiContainer(), String.class, "old_music_path");
        this.LJLL = UCI.LJI(getDiContainer(), Integer.class, "draft_to_Edit_from");
        this.LJLLI = UCI.LJI(getDiContainer(), InterfaceC145495nN.class, null);
        this.LJLLILLLL = UCI.LJI(getDiContainer(), C137965bE.class, null);
        this.LJLLL = new C29901Fi();
        this.LJLLLL = new C29901Fi();
        C29901Fi<C76800UCe> c29901Fi = new C29901Fi<>();
        this.LJLLLLLL = c29901Fi;
        this.LJLZ = c29901Fi;
        C29901Fi<OSZ<Integer, Intent>> c29901Fi2 = new C29901Fi<>();
        this.LJZ = c29901Fi2;
        this.LJZI = c29901Fi2;
        C29901Fi<Boolean> c29901Fi3 = new C29901Fi<>();
        this.LJZL = c29901Fi3;
        this.LL = c29901Fi3;
        C29901Fi<Intent> c29901Fi4 = new C29901Fi<>();
        this.LLD = c29901Fi4;
        this.LLF = c29901Fi4;
        C29901Fi<C76800UCe> c29901Fi5 = new C29901Fi<>();
        this.LLFF = c29901Fi5;
        this.LLFFF = c29901Fi5;
        C29901Fi<OSJ<Integer, Integer, Integer>> c29901Fi6 = new C29901Fi<>();
        this.LLFII = c29901Fi6;
        this.LLFZ = c29901Fi6;
        C29901Fi<C76800UCe> c29901Fi7 = new C29901Fi<>();
        this.LLI = c29901Fi7;
        this.LLIFFJFJJ = c29901Fi7;
        C29901Fi<C76800UCe> c29901Fi8 = new C29901Fi<>();
        this.LLII = c29901Fi8;
        this.LLIIII = c29901Fi8;
        C29901Fi<Boolean> c29901Fi9 = new C29901Fi<>();
        this.LLIIIILZ = c29901Fi9;
        this.LLIIIJ = c29901Fi9;
        C29901Fi<C76800UCe> c29901Fi10 = new C29901Fi<>();
        this.LLIIIL = c29901Fi10;
        this.LLIIIZ = c29901Fi10;
    }

    private final Intent LJJLI(VideoPublishEditModel videoPublishEditModel) {
        RecordScene LLIIIL = LLIIIL(videoPublishEditModel);
        if (C44384HbQ.LJZI(videoPublishEditModel)) {
            return C43542H7a.LIZIZ(videoPublishEditModel, LJJLIIIJJIZ(), LJLJJLL());
        }
        if (LLIIIL.isSegmentsNotValid() && !LJLLL()) {
            if (videoPublishEditModel.isPhotoMvMode) {
                this.LLFII.LJII(new OSJ<>(Integer.valueOf(R.string.tod), Integer.valueOf(R.string.cg_), Integer.valueOf(R.string.dsg)));
                return null;
            }
            this.LLFII.LJII(new OSJ<>(Integer.valueOf(R.string.toc), Integer.valueOf(R.string.cg_), Integer.valueOf(R.string.grs)));
            return null;
        }
        return C43542H7a.LIZIZ(videoPublishEditModel, LJJLIIIJJIZ(), LJLJJLL());
    }

    private final Intent LJJLIIIIJ(VideoPublishEditModel videoPublishEditModel) {
        return C43542H7a.LIZIZ(videoPublishEditModel, LJJLIIIJJIZ(), LJLJJLL());
    }

    private final boolean LLFFF(boolean z) {
        boolean z2;
        if (LJJZZI().isEnterFromDM()) {
            return true;
        }
        if (LJJLJLI().LLZZ() || LJJZZI().hasInfoStickers()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!C32151Nz.LJJIIZI(LJJZZI().getEffectList()) && LJJZZI().getTimeEffect() == null && !C44384HbQ.LJLILLLLZI(LJJZZI()) && !LJJZZI().isChangeMultiEditData() && !z2) {
            return true;
        }
        this.LJZL.LJII(Boolean.valueOf(z));
        return false;
    }

    private final void LLIFFJFJJ(boolean z) {
        boolean z2;
        boolean z3;
        int i;
        int i2;
        OSZ osz;
        boolean z4 = false;
        if (LJJZZI().recordMode != 1 && LJJZZI().mOrigin == 1 && !LJJZZI().mFromCut && !LJJZZI().mFromMultiCut) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean LJLZ = LJLZ();
        if (LJJLJLI().LLZZ() || LJJZZI().hasInfoStickers()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!C32151Nz.LJJIIZI(LJJZZI().getEffectList()) && LJJZZI().getTimeEffect() == null && !C44384HbQ.LJLILLLLZI(LJJZZI()) && !LJJZZI().isChangeMultiEditData() && ((LJJZZI().getFilterName() == null || o.LJ(LJJZZI().getFilterName(), "normal")) && !z3 && (LJJZZI().getMMusicPath() == null || o.LJ(LJJZZI().getMMusicPath(), "")))) {
            if (!z2) {
                this.LLIIIILZ.LJII(Boolean.TRUE);
                return;
            } else if (LJJZZI().draftFromShoot) {
                LJJLIIIJILLIZJL();
                return;
            }
        }
        if (!LJLZ || !e1.LIZ(31744, "studio_remove_start_over_in_story_draft", true, false)) {
            z4 = z2;
        }
        if (C44384HbQ.LJZI(LJJZZI())) {
            osz = new OSZ(Integer.valueOf(R.string.jlb), -1);
        } else {
            if (LJLZ) {
                i = R.string.ezp;
            } else {
                i = R.string.ezm;
            }
            Integer valueOf = Integer.valueOf(i);
            if (LJLZ) {
                i2 = R.string.ezo;
            } else {
                i2 = R.string.ezl;
            }
            osz = new OSZ(valueOf, Integer.valueOf(i2));
        }
        int intValue = ((Number) osz.getFirst()).intValue();
        int intValue2 = ((Number) osz.getSecond()).intValue();
        LiveEvent<C85808Xm0> QI = QI();
        o.LJII(QI, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<com.ss.android.ugc.gamora.editor.nav.TuxDialogParams>");
        ((C29901Fi) QI).LJII(new C85808Xm0(intValue, intValue2, z, z4));
    }

    private final RecordScene LLIIIL(VideoPublishEditModel videoPublishEditModel) {
        RecordScene scene = new RecordScene();
        scene.musicPath(videoPublishEditModel.getMMusicPath());
        scene.musicStart(videoPublishEditModel.getMMusicStart());
        scene.musicEnd(videoPublishEditModel.getMMusicEnd());
        scene.faceBeauty(videoPublishEditModel.mFaceBeauty);
        scene.videoSegment(videoPublishEditModel.mVideoSegmentsDesc);
        scene.hardEncode(videoPublishEditModel.mHardEncode);
        scene.mp4Path(videoPublishEditModel.videoPath());
        scene.maxDuration(videoPublishEditModel.maxDuration);
        scene.audioTrack(videoPublishEditModel.audioTrack);
        C41658GWo.LIZLLL().LJII = scene;
        o.LJIIIIZZ(scene, "scene");
        return scene;
    }

    @Override // X.C6FS
    public void XN(RetakeVideoContext retakeVideoContext) {
        Intent LJJLI = LJJLI(LJJZZI());
        if (LJJLI == null) {
            return;
        }
        LJJLI.putExtra("retake_video", retakeVideoContext);
        LJJLI.putExtra("retake_shoot_mode", 1);
        this.LLD.LJII(LJJLI);
    }

    @Override // X.C6FS
    public void uR(boolean z) {
        this.LJLLJ = z;
    }
}

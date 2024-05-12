package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5zu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C153265zu implements InterfaceC150695vl, InterfaceC65784Pro<C82622Wbi> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLJ;
    public final InterfaceC65784Pro<C82622Wbi> LJLIL;
    public final C153285zw LJLILLLLZI;
    public final C153295zx LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;

    static {
        TBT tbt = new TBT(C153265zu.class, "toolbarApi", "getToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJLJ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C153265zu.class, "titlebarApi", "getTitlebarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/TitlebarApi;", 0, c65351Pkp)};
    }

    public final InterfaceC147865rC LIZ() {
        C82622Wbi invoke = this.LJLIL.invoke();
        if (invoke == null) {
            return null;
        }
        return (InterfaceC147865rC) invoke.LJ(InterfaceC147865rC.class, null);
    }

    public final InterfaceC153185zm LIZIZ() {
        return (InterfaceC153185zm) this.LJLJI.LIZ(this, LJLJLJ[1]);
    }

    public final InterfaceC153275zv LIZJ() {
        return (InterfaceC153275zv) this.LJLILLLLZI.LIZ(this, LJLJLJ[0]);
    }

    @Override // X.InterfaceC65784Pro
    public final C82622Wbi invoke() {
        return this.LJLIL.invoke();
    }

    @Override // X.InterfaceC150695vl
    public final void refresh() {
        LIZJ().refresh();
    }

    public C153265zu(AbstractC42651GoZ rootScene, InterfaceC65784Pro<C82622Wbi> interfaceC65784Pro) {
        o.LJIIIZ(rootScene, "rootScene");
        this.LJLIL = interfaceC65784Pro;
        this.LJLILLLLZI = new C153285zw(this);
        this.LJLJI = new C153295zx(this);
        this.LJLJJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 651));
        this.LJLJJL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 650));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 652));
        this.LJLJL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 649));
    }

    @Override // X.InterfaceC150695vl
    public final void U2(boolean z, boolean z2, boolean z3) {
        AnonymousClass601 anonymousClass601;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        AudioRecorderParam audioRecorderParam;
        AnonymousClass601 anonymousClass6012;
        boolean z8;
        boolean z9;
        InterfaceC139655dx interfaceC139655dx;
        MutableLiveData<Boolean> A10;
        MutableLiveData<Boolean> hP;
        Boolean value;
        MutableLiveData<Boolean> yf0;
        MutableLiveData<Boolean> N4;
        Boolean value2;
        MutableLiveData<Boolean> sH;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.LJLJJLL.getValue();
        if (!z2) {
            InterfaceC147865rC LIZ = LIZ();
            if (LIZ == null || (N4 = LIZ.N4()) == null || (value2 = N4.getValue()) == null || !value2.booleanValue()) {
                InterfaceC147865rC LIZ2 = LIZ();
                if (LIZ2 == null || (hP = LIZ2.hP()) == null || (value = hP.getValue()) == null || !value.booleanValue()) {
                    InterfaceC147865rC LIZ3 = LIZ();
                    if (LIZ3 != null && (A10 = LIZ3.A10()) != null) {
                        A10.setValue(Boolean.valueOf(z3));
                    }
                } else {
                    InterfaceC147865rC LIZ4 = LIZ();
                    if (LIZ4 != null && (yf0 = LIZ4.yf0()) != null) {
                        yf0.setValue(Boolean.valueOf(z3));
                    }
                }
            } else {
                InterfaceC147865rC LIZ5 = LIZ();
                if (LIZ5 != null && (sH = LIZ5.sH()) != null) {
                    sH.setValue(Boolean.valueOf(z3));
                }
            }
        } else {
            C82622Wbi invoke = this.LJLIL.invoke();
            if (invoke != null && (anonymousClass601 = (AnonymousClass601) ((C1EP) invoke.LJ(C1EP.class, null)).sO(AnonymousClass601.class)) != null) {
                anonymousClass601.show(false);
            }
        }
        if (!z && (interfaceC139655dx = (InterfaceC139655dx) this.LJLJJL.getValue()) != null) {
            interfaceC139655dx.LIZLLL();
        }
        boolean isDuet = videoPublishEditModel.isDuet();
        boolean LJZL = C44384HbQ.LJZL(videoPublishEditModel);
        LIZJ().Qk0(true);
        LIZJ().ot(z);
        LIZIZ().xD(z);
        LIZJ().r3();
        LIZIZ().yd(z);
        if ((videoPublishEditModel.isMvThemeVideoType() && (!((VideoPublishEditModel) this.LJLJJLL.getValue()).isPhotoMvMode || ((VideoPublishEditModel) this.LJLJJLL.getValue()).getOriginal() != 1)) || videoPublishEditModel.isStickPointMode || videoPublishEditModel.isCutSameVideoType() || ((videoPublishEditModel.isDuet() && !videoPublishEditModel.duetFilesExist()) || videoPublishEditModel.isCutSameVideoType())) {
            z4 = true;
        } else {
            z4 = false;
        }
        InterfaceC147495qb storyService = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService();
        if (z4) {
            LIZIZ().V10(false);
        } else if (videoPublishEditModel.mIsFromDraft && !C153255zt.LIZ()) {
            InterfaceC153185zm LIZIZ = LIZIZ();
            if (z && !LJZL && !videoPublishEditModel.isUploadVideo()) {
                z5 = true;
            } else {
                z5 = false;
            }
            LIZIZ.V10(z5);
        } else if (videoPublishEditModel.draftFromShoot) {
            storyService.getClass();
            C53578L1a.LIZ.getClass();
            if (!C53578L1a.LIZ()) {
                LIZIZ().V10(z);
            }
        }
        if (C44384HbQ.LJJIFFI()) {
            InterfaceC145325n6 interfaceC145325n6 = (InterfaceC145325n6) this.LJLJL.getValue();
            if (interfaceC145325n6 != null) {
                interfaceC145325n6.B8(C44384HbQ.LJIIL(videoPublishEditModel.getCurMusicServerLength(), videoPublishEditModel, videoPublishEditModel.getMMusicPath()));
            }
        } else {
            if (!C78866UxK.LJJJZ(videoPublishEditModel)) {
                LIZJ().Jf(8, C44384HbQ.LJIIL(videoPublishEditModel.getCurMusicServerLength(), videoPublishEditModel, videoPublishEditModel.getMMusicPath()));
                if (((BaseShortVideoContext) this.LJLJJLL.getValue()).getVideoLength() > videoPublishEditModel.getMCurMusicLength()) {
                    LIZJ().fg0(8, false);
                }
            }
            if (!C48841JEv.LJIIZILJ((InterfaceC136115Vv) this.LJLJJI.getValue())) {
                InterfaceC153275zv LIZJ = LIZJ();
                if (z && !isDuet && !LJZL) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                LIZJ.b2(8, z6);
            }
        }
        if (!C48841JEv.LJIIZILJ((InterfaceC136115Vv) this.LJLJJI.getValue())) {
            if (C44384HbQ.LJJII(videoPublishEditModel)) {
                InterfaceC153275zv LIZJ2 = LIZJ();
                if (z && !LJZL) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                LIZJ2.b2(6, z9);
            } else {
                LIZJ().b2(6, false);
            }
        }
        if (C44384HbQ.LJIILIIL(videoPublishEditModel)) {
            AudioRecorderParam audioRecorderParam2 = videoPublishEditModel.veAudioRecorderParam;
            if (audioRecorderParam2 != null && audioRecorderParam2.hasRecord()) {
                LIZJ().fg0(6, true);
            } else {
                LIZJ().fg0(6, false);
            }
        }
        if (C44384HbQ.LJJII(videoPublishEditModel) && videoPublishEditModel.mOrigin == 2) {
            LIZJ().fg0(6, true);
        }
        CanvasVideoData canvasVideoData = videoPublishEditModel.canvasVideoData;
        if (canvasVideoData != null && C79004UzY.LJJIII(canvasVideoData)) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            LIZJ().fg0(11, false);
            LIZJ().b2(11, false);
        } else if ((C44384HbQ.LJLJJL(videoPublishEditModel) && videoPublishEditModel.voiceVolume > 0.0f && !C44384HbQ.LJLL(videoPublishEditModel)) || ((videoPublishEditModel.hasRecord() && ((audioRecorderParam = videoPublishEditModel.veAudioRecorderParam) == null || audioRecorderParam.getRecordVolume() > 0.0f)) || C138615cH.LIZ(null, videoPublishEditModel))) {
            LIZJ().fg0(11, true);
            LIZJ().b2(11, true);
        } else if ((C00F.LIZ(31744, 0, "studio_new_asr_captions_and_editor_pro_config", true) == 2 || C00F.LIZ(31744, 0, "studio_new_asr_captions_and_editor_pro_config", true) == 3) && videoPublishEditModel.creativeModel.inlineCaptionModel != null) {
            LIZJ().fg0(11, true);
            LIZJ().b2(11, true);
        } else {
            LIZJ().fg0(11, false);
            if (H7R.LJJLIIIIJ(videoPublishEditModel)) {
                LIZJ().b2(11, false);
            }
        }
        if (videoPublishEditModel.isStickPointMode) {
            LIZJ().fg0(1, false);
        } else {
            LIZJ().fg0(1, true);
        }
        LIZJ().Jf(7, !videoPublishEditModel.isStickPointMode);
        if (!C48841JEv.LJIIZILJ((InterfaceC136115Vv) this.LJLJJI.getValue())) {
            LIZJ().b2(7, z);
            LIZJ().b2(5, z);
            if (videoPublishEditModel.creativeModel.changeAvatarModel.isFromChangeAvatar) {
                if (AnonymousClass600.LIZ()) {
                    CreativeModel creativeModel = videoPublishEditModel.creativeModel;
                    o.LJIIIIZZ(creativeModel, "model.creativeModel");
                    if (!creativeModel.changeAvatarModel.isFromAiVatar) {
                        LIZIZ().du(z);
                    }
                }
                LIZIZ().du(false);
            } else {
                LIZIZ().du(z);
            }
            InterfaceC153275zv LIZJ3 = LIZJ();
            if (z && !isDuet && !LJZL) {
                z8 = true;
            } else {
                z8 = false;
            }
            LIZJ3.b2(1, z8);
            LIZJ().b2(2, z);
            LIZJ().b2(4, z);
            LIZJ().b2(3, z);
        }
        if (!z) {
            LIZJ().rO(2, false);
        }
        LIZJ().q0();
        C82622Wbi invoke2 = this.LJLIL.invoke();
        if (invoke2 != null && (anonymousClass6012 = (AnonymousClass601) ((C1EP) invoke2.LJ(C1EP.class, null)).sO(AnonymousClass601.class)) != null) {
            anonymousClass6012.ht(z);
        }
    }
}

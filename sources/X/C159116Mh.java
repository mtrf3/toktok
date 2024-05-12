package X;

import Y.AObjectS84S0100000_2;
import Y.AObserverS70S0100000_2;
import Y.ARunnableS38S0100000_2;
import android.os.Parcelable;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.model.ForwardEditPublishData;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.story.forward.QuickForwardPublishLock;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS59S0110000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Mh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159116Mh extends AbstractC29891Fh<InterfaceC149245tQ> implements InterfaceC149245tQ, InterfaceC135635Tz {
    public static final C159236Mt LLIIIZ;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIJI;
    public final C82622Wbi LJLIL;
    public final WMH LJLILLLLZI;
    public final int LJLJI;
    public final InterfaceC149245tQ LJLJJI;
    public final SafeHandler LJLJJL;
    public final C5H3 LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public final InterfaceC115514g7 LJLJLLL;
    public final InterfaceC115514g7 LJLL;
    public final InterfaceC115514g7 LJLLI;
    public final InterfaceC115514g7 LJLLILLLL;
    public final InterfaceC115514g7 LJLLJ;
    public final InterfaceC115514g7 LJLLL;
    public final InterfaceC115514g7 LJLLLL;
    public final InterfaceC115514g7 LJLLLLLL;
    public final InterfaceC115514g7 LJLZ;
    public final InterfaceC115514g7 LJZ;
    public final InterfaceC115514g7 LJZI;
    public final InterfaceC115514g7 LJZL;
    public final InterfaceC115514g7 LL;
    public final C40871j1<Boolean> LLD;
    public final C40871j1<Boolean> LLF;
    public final C40871j1<Boolean> LLFF;
    public final C40871j1<Boolean> LLFFF;
    public final C40871j1<OSZ<Boolean, InterfaceC65784Pro<C76800UCe>>> LLFII;
    public final C40871j1<C60M> LLFZ;
    public final InterfaceC115514g7 LLI;
    public boolean LLIFFJFJJ;
    public final InterfaceC115514g7 LLII;
    public final InterfaceC115514g7 LLIIII;
    public final C159126Mi LLIIIILZ;
    public final C159286My LLIIIJ;
    public boolean LLIIIL;

    public final int[] LJJLIIIJILLIZJL() {
        int[] iArr = new int[2];
        View view = this.LLIIIJ.mView;
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [X.6Mt] */
    static {
        TBT tbt = new TBT(C159116Mh.class, "titlebarApi", "getTitlebarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/TitlebarApi;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIJI = new InterfaceC74236TBo[]{tbt, new TBT(C159116Mh.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0), new TBT(C159116Mh.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0), new TBT(C159116Mh.class, "compileStickers", "getCompileStickers()Lcom/ss/android/ugc/gamora/editor/ICompileStickers;", 0), new TBT(C159116Mh.class, "editCoverGenerator", "getEditCoverGenerator()Lcom/ss/android/ugc/gamora/editor/IEditCoverGneratator;", 0), new TBT(C159116Mh.class, "editRootScene", "getEditRootScene()Lcom/ss/android/ugc/gamora/editor/rootscene/IEditRootScene;", 0), new TBT(C159116Mh.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new TBT(C159116Mh.class, "lighteningPublishApiComponent", "getLighteningPublishApiComponent()Lcom/ss/android/ugc/gamora/editor/lightening/publish/LighteningPublishApiComponent;", 0), new TBT(C159116Mh.class, "lighteningQuickPublishApiComponent", "getLighteningQuickPublishApiComponent()Lcom/ss/android/ugc/gamora/editor/lightening/publish/LighteningQuickPublishApiComponent;", 0), new TBT(C159116Mh.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0), new TBT(C159116Mh.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new TBT(C159116Mh.class, "publishButtonVisibility", "getPublishButtonVisibility()Lcom/ss/android/ugc/gamora/editor/LighteningBottomPublishButtonVisibility;", 0), new TBT(C159116Mh.class, "changeAvatarApiComponent", "getChangeAvatarApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/changeavatar/ChangeAvatarApiComponent;", 0), new TBT(C159116Mh.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0), new TBT(C159116Mh.class, "editAudioCopyrightDetectApi", "getEditAudioCopyrightDetectApi()Lcom/ss/android/ugc/gamora/editor/audio/copyrightdetect/EditAudioCopyrightDetectApi;", 0), new TBT(C159116Mh.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0), new TBT(C159116Mh.class, "editExitApiComponent", "getEditExitApiComponent()Lcom/ss/android/ugc/gamora/editor/exit/EditExitApiComponent;", 0), new TBT(C159116Mh.class, "switchModeApi", "getSwitchModeApi()Lcom/ss/android/ugc/aweme/image/switchmode/ImageModeSwitchApi;", 0)};
        LLIIIZ = new Object() { // from class: X.6Mt
        };
    }

    private final InterfaceC153215zp LJJLIIIJJI() {
        return (InterfaceC153215zp) this.LJZI.LIZ(this, LLIIJI[12]);
    }

    private final InterfaceC143385jy LJJLIIIJLLLLLLLZ() {
        return (InterfaceC143385jy) this.LL.LIZ(this, LLIIJI[14]);
    }

    private final InterfaceC148865so LJJLJ() {
        return (InterfaceC148865so) this.LLII.LIZ(this, LLIIJI[16]);
    }

    private final InterfaceC145325n6 LJJLL() {
        return (InterfaceC145325n6) this.LJLJLJ.LIZ(this, LLIIJI[1]);
    }

    private final C6F2 LJJZZIII() {
        return (C6F2) this.LJLLILLLL.LIZ(this, LLIIJI[5]);
    }

    private final InterfaceC147865rC LJLIIL() {
        return (InterfaceC147865rC) this.LLI.LIZ(this, LLIIJI[15]);
    }

    private final C143115jX LJZI() {
        return (C143115jX) this.LJZ.LIZ(this, LLIIJI[11]);
    }

    private final InterfaceC150355vD LLF() {
        return (InterfaceC150355vD) this.LLIIII.LIZ(this, LLIIJI[17]);
    }

    private final InterfaceC153185zm LLFFF() {
        return (InterfaceC153185zm) this.LJLJL.LIZ(this, LLIIJI[0]);
    }

    private final ActivityC45651qj getActivity() {
        return (ActivityC45651qj) this.LJLJLLL.LIZ(this, LLIIJI[2]);
    }

    public final void LJJLIIIIJ() {
        this.LJLJJL.post(new ARunnableS38S0100000_2(this, 93));
    }

    public final InterfaceC159246Mu LJJLIIIJJIZ() {
        return (InterfaceC159246Mu) this.LJLL.LIZ(this, LLIIJI[3]);
    }

    public final InterfaceC159256Mv LJJLIIJ() {
        return (InterfaceC159256Mv) this.LJLLI.LIZ(this, LLIIJI[4]);
    }

    public final VideoPublishEditModel LJJLJLI() {
        return (VideoPublishEditModel) this.LJLZ.LIZ(this, LLIIJI[10]);
    }

    public final InterfaceC143655kP LJJZZI() {
        return (InterfaceC143655kP) this.LJLLLLLL.LIZ(this, LLIIJI[9]);
    }

    public final InterfaceC153275zv LJLJJL() {
        return (InterfaceC153275zv) this.LJLJJLL.getValue();
    }

    public final InterfaceC136115Vv LJLJLJ() {
        return (InterfaceC136115Vv) this.LJZL.LIZ(this, LLIIJI[13]);
    }

    public final InterfaceC159266Mw LJLLILLLL() {
        return (InterfaceC159266Mw) this.LJLLL.LIZ(this, LLIIJI[7]);
    }

    public final InterfaceC159276Mx LJLLL() {
        return (InterfaceC159276Mx) this.LJLLLL.LIZ(this, LLIIJI[8]);
    }

    public final VideoPublishEditModel LJLZ() {
        return (VideoPublishEditModel) this.LJLLJ.LIZ(this, LLIIJI[6]);
    }

    public final void LLIIIL() {
        AnonymousClass601 anonymousClass601 = (AnonymousClass601) findReadyComponent(this, AnonymousClass601.class);
        if (anonymousClass601 != null) {
            anonymousClass601.rw(C6MB.CLICK_NEXT.getValue());
        }
        LJJZZI().Ru();
    }

    public final void LLIIZ() {
        C42562Gn8.LIZIZ.LIZ(LJLZ().getCreationId());
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LighteningBottomComponent:publishVideo,isPublishing:");
        LIZ.append(this.LLIIIL);
        LIZ.append(",isMvThemeVideoType:");
        LIZ.append(LJLZ().isMvThemeVideoType());
        LIZ.append(",isMultiVideoEdit:");
        LIZ.append(LJLZ().isMultiVideoEdit());
        LIZ.append(",isMixedFastImport:");
        LIZ.append(H7R.LJJJJLI(LJLZ()));
        H78.LIZ(X1D.LIZIZ(LIZ));
        if (LJJLJLI().creativeModel.changeAvatarModel.isFromChangeAvatar && !LJJLJLI().creativeModel.draftInfoModel.isDraft) {
            H78.LIZJ("change_avatar_mode: start upload avatar info");
            InterfaceC153215zp LJJLIIIJJI = LJJLIIIJJI();
            if (LJJLIIIJJI != null) {
                LJJLIIIJJI.tc(new AqS152S0100000_2(this, 406), C159136Mj.INSTANCE);
                return;
            }
            return;
        }
        LJJLIIIIJ();
    }

    public final void LLILL() {
        this.LJLJJL.post(new ARunnableS38S0100000_2(this, 102));
    }

    public final void LLILZIL() {
        boolean z;
        this.LLD.LJI(Boolean.valueOf(C151965xo.LIZLLL(LJLZ())));
        if (!H7R.LJJLIIIJJIZ(LJLZ())) {
            C40871j1<Boolean> c40871j1 = this.LLF;
            if (((!H7R.LJJJJL(LJLZ()) || C63081OpJ.LJJI(LJLZ())) && !H7R.LJJIJIL(LJLZ())) || C44384HbQ.LJJIJIL(LJJLJLI())) {
                z = true;
            } else {
                z = false;
            }
            c40871j1.LJI(Boolean.valueOf(z));
        }
    }

    public final void LLJI() {
        boolean z;
        C40871j1<Boolean> c40871j1 = this.LLD;
        if (!C151965xo.LJFF(LJLZ()) && !LJLZ().hasQaSticker.booleanValue() && !C151965xo.LJ(LJLZ())) {
            z = true;
        } else {
            z = false;
        }
        c40871j1.LJI(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC149245tQ
    public void LLJZ() {
        InterfaceC150615vd interfaceC150615vd;
        if (this.LLIIIL) {
            return;
        }
        if (LLJ()) {
            InterfaceC148865so LJJLJ = LJJLJ();
            if (LJJLJ != null) {
                LJJLJ.Vd0();
            }
            if (!AVExternalServiceImpl.LIZ().publishService().isParallelPublishContinue()) {
                C60903NvH.LJIIJJI().getPublishService().LJJIJL();
                return;
            }
            return;
        }
        this.LLIIIL = true;
        if (H7R.LJJJJL(LJJLJLI()) && !H7R.LJJJJZI(LJJLJLI())) {
            InterfaceC143655kP LJJZZI = LJJZZI();
            if ((LJJZZI instanceof InterfaceC150615vd) && (interfaceC150615vd = (InterfaceC150615vd) LJJZZI) != null) {
                InterfaceC150355vD LLF = LLF();
                if (LLF != null) {
                    LLF.hide();
                }
                interfaceC150615vd.L80().setValue(new ARunnableS38S0100000_2(this, 98));
                return;
            }
            return;
        }
        AnonymousClass601 anonymousClass601 = (AnonymousClass601) findReadyComponent(this, AnonymousClass601.class);
        if (anonymousClass601 != null) {
            anonymousClass601.rw(C6MB.STORY_POST.getValue());
        }
        C44384HbQ.LLJ(LJLZ());
        InterfaceC153045zY value = LJJZZI().Kh().getValue();
        if (value != null) {
            LJLZ().getPreviewInfo().setPreviewVideoLength(value.getDuration());
            LJLZ().nleData = value.LLJJL();
        }
        if (LJLZ().mIsFromDraft && LJLZ().isDraftMusicIllegal() && MusicBeanUtilKt.extractAVMusic(LJLZ().creativeModel.musicBuzModel) != null) {
            LJLZ().setDraftMusicIllegal(false);
        }
        if (H7R.LJJLIIIJLJLI(LJLZ())) {
            boolean LJJLIIIJLLLLLLLZ = H7R.LJJLIIIJLLLLLLLZ(LJLZ());
            Object value2 = C165326eG.LIZ.getValue();
            o.LJIIIIZZ(value2, "<get-keva>(...)");
            ((Keva) value2).storeBoolean("switch", LJJLIIIJLLLLLLLZ);
        }
        if (H7R.LJJJLL(LJLZ()) && LJLZ().getCamera() == 1) {
            boolean z = LJLZ().creativeModel.mirrorMode.lastSegIsUseMirror;
            Object value3 = C165326eG.LIZ.getValue();
            o.LJIIIIZZ(value3, "<get-keva>(...)");
            ((Keva) value3).storeBoolean("switch", z);
        }
        if (LLIFFJFJJ()) {
            return;
        }
        InterfaceC148295rt interfaceC148295rt = (InterfaceC148295rt) getDiContainer().LJIIIIZZ(null, InterfaceC148295rt.class);
        if (H7R.LJJJJL(LJLZ()) && interfaceC148295rt != null) {
            interfaceC148295rt.LIZ(new AqS152S0100000_2(this, 405));
            return;
        }
        OSZ LJJJJZI = C44384HbQ.LJJJJZI(LJLZ(), true);
        if (LJJJJZI != null) {
            new C6YX(LJLJJLL(), (String) LJJJJZI.getFirst(), ((Number) LJJJJZI.getSecond()).intValue(), new InterfaceC162186Yc() { // from class: X.6Mp
                @Override // X.InterfaceC162186Yc
                public final void onError(String str) {
                    C0JU.LIZLLL(str);
                    C159116Mh.this.LLIIIL = false;
                }
            }, new InterfaceC171226nm() { // from class: X.6Mq
                @Override // X.InterfaceC171226nm
                public final void LIZ() {
                    C159116Mh.this.LLIIZ();
                }
            }, true);
        } else {
            LLIIZ();
        }
    }

    @Override // X.InterfaceC149245tQ
    public void eu0() {
        this.LLIIIJ.LLJILJIL();
    }

    private final InterfaceC153045zY LJLJJLL() {
        return LJJZZI().Kh().getValue();
    }

    private final boolean LLIFFJFJJ() {
        if (!H7R.LJJLIIIJJIZ(LJLZ())) {
            return false;
        }
        this.LJLJJL.post(new ARunnableS38S0100000_2(this, 96));
        return true;
    }

    private final boolean LLJ() {
        Parcelable parcelable;
        InterfaceC148865so LJJLJ;
        MutableLiveData<Boolean> releaseLockEvent;
        ForwardEditPublishData forwardEditPublishData = LJJLJLI().creativeModel.forwardEditPublishData;
        if (forwardEditPublishData != null && forwardEditPublishData.publishId.length() > 0) {
            VideoPublishEditModel videoPublishEditModel = null;
            if (1 != 0) {
                IAVPublishService publishService = AVExternalServiceImpl.LIZ().publishService();
                String creationId = LJJLJLI().getCreationId();
                o.LJIIIIZZ(creationId, "editModel.creationId");
                QuickForwardPublishLock quickForwardPublishLock = (QuickForwardPublishLock) ((LinkedHashMap) C169656lF.LIZJ).get(creationId);
                if (quickForwardPublishLock != null && (releaseLockEvent = quickForwardPublishLock.getReleaseLockEvent()) != null) {
                    releaseLockEvent.postValue(Boolean.TRUE);
                }
                PublishModel publishModel = publishService.getPublishModel(forwardEditPublishData.publishId);
                if (publishModel != null) {
                    parcelable = publishModel.editModel;
                } else {
                    parcelable = null;
                }
                if (parcelable instanceof VideoPublishEditModel) {
                    videoPublishEditModel = (VideoPublishEditModel) parcelable;
                }
                if (LJJLJ() == null || ((LJJLJ = LJJLJ()) != null && LJJLJ.D1())) {
                    C169656lF.LIZIZ(forwardEditPublishData, LJJLJLI(), false);
                } else {
                    if (videoPublishEditModel != null) {
                        if (videoPublishEditModel.isPrivate() != LJJLJLI().isPrivate()) {
                            videoPublishEditModel.isPrivate = LJJLJLI().isPrivate();
                        }
                        videoPublishEditModel.enterFrom = "video_edit_page";
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC149245tQ
    public void Hg() {
        C152165y8.LJII(LJLZ(), new AqS152S0100000_2(this, 404));
    }

    public final void LJJLI() {
        LJLJJL().A7(15);
    }

    public final void LLIILZL() {
        C44384HbQ.LLJ(LJLZ());
        InterfaceC153045zY value = LJJZZI().Kh().getValue();
        if (value != null) {
            LJLZ().getPreviewInfo().setPreviewVideoLength(value.getDuration());
            LJLZ().nleData = value.LLJJL();
        }
        this.LJLJJL.post(new ARunnableS38S0100000_2(this, 100));
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        C29901Fi c29901Fi;
        LiveData<Boolean> I6;
        LiveEvent<AVMusic> Am;
        InterfaceC147865rC LJLIIL;
        InterfaceC139535dl fB;
        LiveEvent<Boolean> Ej;
        LiveEvent<C76800UCe> Ix;
        super.onCreate();
        this.LJLILLLLZI.add(this.LJLJI, this.LLIIIJ, "StoryEditBottomBarScene");
        LJLJJL().n2().observe(this, new AObserverS70S0100000_2(this, 83));
        LJLJJL().Kb().observe(this, new AObserverS70S0100000_2(this, 84));
        InterfaceC136115Vv LJLJLJ = LJLJLJ();
        if (LJLJLJ != null && (Ix = LJLJLJ.Ix()) != null) {
            Ix.LIZLLL(this, new AObjectS84S0100000_2(this, 107));
        }
        LJLJJL().Tl().observe(this, new AObserverS70S0100000_2(this, 85));
        if (C44384HbQ.LJJJLZIJ(LJLZ()) && (LJLIIL = LJLIIL()) != null && (fB = LJLIIL.fB()) != null && (Ej = fB.Ej()) != null) {
            Ej.LIZLLL(this, new AObjectS84S0100000_2(this, 108));
        }
        InterfaceC145325n6 LJJLL = LJJLL();
        if (LJJLL != null && (Am = LJJLL.Am()) != null) {
            Am.LIZLLL(this, new AObjectS84S0100000_2(this, 109));
        }
        LLILZIL();
        InterfaceC153185zm LLFFF = LLFFF();
        if (LLFFF != null && (I6 = LLFFF.I6()) != null) {
            I6.observe(this, new AObjectS84S0100000_2(this, 110));
        }
        if (getDiContainer().LIZIZ(C63K.class)) {
            whenReadyOrThrowInternal(getDiContainer(), C63K.class, new AqS168S0100000_2(this, 242));
        }
        C143115jX LJZI = LJZI();
        if (LJZI != null && (c29901Fi = LJZI.LIZ) != null) {
            c29901Fi.LIZLLL(this, new AObjectS84S0100000_2(this, 105));
        }
        LiveData<C60M> mF = LJLJJL().mF(15);
        if (mF != null) {
            mF.observe(this, new AObjectS84S0100000_2(this, 106));
        }
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        C145885o0.LIZ.getClass();
        C145885o0.LIZIZ = null;
        C145885o0.LIZJ = null;
    }

    @Override // X.AbstractC29891Fh
    public void onResume() {
        super.onResume();
        if (MusicBeanUtilKt.extractAVMusic(LJLZ().creativeModel.musicBuzModel) != null) {
            LLILZIL();
        }
        View view = this.LLIIIJ.mView;
        if (view != null) {
            view.postDelayed(new ARunnableS38S0100000_2(this, 97), 16L);
        }
    }

    @Override // X.InterfaceC149245tQ
    public WM7 Cn() {
        return this.LLIIIJ;
    }

    @Override // X.InterfaceC149245tQ
    public WMH YQ() {
        return this.LJLILLLLZI;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC149245tQ getApiComponent() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public final void LLILZLL(VideoPublishEditModel videoPublishEditModel) {
        videoPublishEditModel.isPhotoMvMode = false;
        videoPublishEditModel.isPhotoMvMode1080p = false;
        videoPublishEditModel.isPhotoMvMusic = false;
        videoPublishEditModel.mvCreateVideoData = null;
        videoPublishEditModel.setVideoEditorType(12);
        AVUploadMiscInfoStruct aVUploadMiscInfoStruct = videoPublishEditModel.uploadMiscInfoStruct;
        if (aVUploadMiscInfoStruct == null) {
            return;
        }
        aVUploadMiscInfoStruct.mvInfo = null;
        aVUploadMiscInfoStruct.mvThemeId = null;
    }

    public final void LLIZ(boolean z) {
        if (z) {
            this.LJLILLLLZI.show(this.LLIIIJ);
        }
        this.LLFII.LJI(new OSZ<>(Boolean.valueOf(z), new AqS59S0110000_2(z, this, 4)));
    }

    public C159116Mh(C82622Wbi diContainer, WMH parentScene, int i) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = parentScene;
        this.LJLJI = i;
        this.LJLJJI = this;
        this.LJLJJL = new SafeHandler(this);
        this.LJLJJLL = C221108m2.LIZ(EnumC221088m0.NONE, new AqS152S0100000_2((InterfaceC135635Tz) this, 403));
        this.LJLJL = UCI.LJII(getDiContainer(), InterfaceC153185zm.class, null);
        this.LJLJLJ = UCI.LJII(getDiContainer(), InterfaceC145325n6.class, null);
        this.LJLJLLL = UCI.LJI(getDiContainer(), ActivityC45651qj.class, null);
        this.LJLL = UCI.LJI(getDiContainer(), InterfaceC159246Mu.class, null);
        this.LJLLI = UCI.LJII(getDiContainer(), InterfaceC159256Mv.class, null);
        this.LJLLILLLL = UCI.LJII(getDiContainer(), C6F2.class, null);
        this.LJLLJ = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLLL = UCI.LJI(getDiContainer(), InterfaceC159266Mw.class, null);
        this.LJLLLL = UCI.LJII(getDiContainer(), InterfaceC159276Mx.class, null);
        this.LJLLLLLL = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLZ = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJZ = UCI.LJII(getDiContainer(), C143115jX.class, null);
        this.LJZI = UCI.LJII(getDiContainer(), InterfaceC153215zp.class, null);
        this.LJZL = UCI.LJII(getDiContainer(), InterfaceC136115Vv.class, null);
        this.LL = UCI.LJII(getDiContainer(), InterfaceC143385jy.class, null);
        Boolean bool = Boolean.TRUE;
        C40871j1<Boolean> c40871j1 = new C40871j1<>(bool);
        this.LLD = c40871j1;
        C40871j1<Boolean> c40871j12 = new C40871j1<>(bool);
        this.LLF = c40871j12;
        C40871j1<Boolean> c40871j13 = new C40871j1<>(bool);
        this.LLFF = c40871j13;
        C40871j1<Boolean> c40871j14 = new C40871j1<>(bool);
        this.LLFFF = c40871j14;
        C40871j1<OSZ<Boolean, InterfaceC65784Pro<C76800UCe>>> c40871j15 = new C40871j1<>(null);
        this.LLFII = c40871j15;
        C40871j1<C60M> c40871j16 = new C40871j1<>(null);
        this.LLFZ = c40871j16;
        this.LLI = UCI.LJII(getDiContainer(), InterfaceC147865rC.class, null);
        this.LLII = UCI.LJII(getDiContainer(), InterfaceC148865so.class, null);
        this.LLIIII = UCI.LJII(getDiContainer(), InterfaceC150355vD.class, null);
        C159126Mi c159126Mi = new C159126Mi();
        c159126Mi.LIZ = c40871j1;
        c159126Mi.LIZIZ = c40871j12;
        c159126Mi.LIZJ = c40871j13;
        c159126Mi.LIZLLL = c40871j16;
        c159126Mi.LJFF = new C159176Mn(this);
        c159126Mi.LJI = new C159186Mo(this);
        c159126Mi.LJII = new C159146Mk(this);
        c159126Mi.LJIIIIZZ = c40871j14;
        c159126Mi.LJIIIZ = new C159156Ml(this);
        c159126Mi.LJIIJ = new C159166Mm(this);
        c159126Mi.LJ = c40871j15;
        this.LLIIIILZ = c159126Mi;
        this.LLIIIJ = new C159286My(c159126Mi, getDiContainer());
    }
}

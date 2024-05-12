package X;

import Y.AUListenerS91S0100000_2;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.nows.ui.NowsEditRootScene;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.model.EditorProCancelData;
import com.ss.android.ugc.gamora.editorpro.model.EditorProResultData;
import com.ss.android.ugc.gamora.editorpro.model.EditorProSaveData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5VA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5VA extends AbstractC29891Fh<C5LG> implements C5LG, InterfaceC135635Tz {
    public static final C5VD LJLLLL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLLLLL;
    public final C82622Wbi LJLIL;
    public final InterfaceC65784Pro<C63C> LJLILLLLZI;
    public final C5VA LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public final InterfaceC115514g7 LJLJLLL;
    public final InterfaceC115514g7 LJLL;
    public final InterfaceC115514g7 LJLLI;
    public final InterfaceC115514g7 LJLLILLLL;
    public final InterfaceC115514g7 LJLLJ;
    public final InterfaceC115514g7 LJLLL;

    /* JADX WARN: Type inference failed for: r0v23, types: [X.5VD] */
    static {
        TBT tbt = new TBT(C5VA.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        C65352Pkq.LIZ.getClass();
        LJLLLLLL = new InterfaceC74236TBo[]{tbt, new TBT(C5VA.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new TBT(C5VA.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0), new TBT(C5VA.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0), new TBT(C5VA.class, "editEffectApi", "getEditEffectApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/effect/EditEffectApi;", 0), new TBT(C5VA.class, "audioEditApi", "getAudioEditApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/common/AudioEditApi;", 0), new TBT(C5VA.class, "editSubtitleApi", "getEditSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0), new TBT(C5VA.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0), new TBT(C5VA.class, "editAudioCopyrightDetectApi", "getEditAudioCopyrightDetectApi()Lcom/ss/android/ugc/gamora/editor/audio/copyrightdetect/EditAudioCopyrightDetectApi;", 0), new TBT(C5VA.class, "lighteningMusicApi", "getLighteningMusicApi()Lcom/ss/android/ugc/gamora/editor/lightening/music/LighteningMusicApi;", 0), new TBT(C5VA.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0)};
        LJLLLL = new Object() { // from class: X.5VD
        };
    }

    private final InterfaceC145605nY LJJLI() {
        return (InterfaceC145605nY) this.LJLJLLL.LIZ(this, LJLLLLLL[5]);
    }

    private final InterfaceC142515iZ LJJLIIIIJ() {
        return (InterfaceC142515iZ) this.LJLLL.LIZ(this, LJLLLLLL[10]);
    }

    private final InterfaceC143385jy LJJLIIIJILLIZJL() {
        return (InterfaceC143385jy) this.LJLLILLLL.LIZ(this, LJLLLLLL[8]);
    }

    private final InterfaceC145485nM LJJLIIIJJI() {
        return (InterfaceC145485nM) this.LJLJLJ.LIZ(this, LJLLLLLL[4]);
    }

    private final InterfaceC143855kj LJJLIIJ() {
        return (InterfaceC143855kj) this.LJLL.LIZ(this, LJLLLLLL[6]);
    }

    private final C5XM LJJLJ() {
        return (C5XM) this.LJLLI.LIZ(this, LJLLLLLL[7]);
    }

    private final InterfaceC145405nE LJJZZIII() {
        return (InterfaceC145405nE) this.LJLLJ.LIZ(this, LJLLLLLL[9]);
    }

    private final VideoPublishEditModel LJLIIL() {
        return (VideoPublishEditModel) this.LJLJJL.LIZ(this, LJLLLLLL[1]);
    }

    private final InterfaceC145495nN LJLJJL() {
        return (InterfaceC145495nN) this.LJLJL.LIZ(this, LJLLLLLL[3]);
    }

    private final InterfaceC142545ic Ll0() {
        return (InterfaceC142545ic) this.LJLJJI.LIZ(this, LJLLLLLL[0]);
    }

    private final ActivityC45651qj getActivity() {
        return (ActivityC45651qj) this.LJLJJLL.LIZ(this, LJLLLLLL[2]);
    }

    private final InterfaceC140305f0 LJJLIIIJJIZ() {
        return LJJLIIIIJ().oU().LIZ();
    }

    private final InterfaceC147865rC LJJLIIIJLLLLLLLZ() {
        return LJJLIIIIJ().JB().LIZ();
    }

    private final InterfaceC153045zY LJJLJLI() {
        return Ll0().Kh().getValue();
    }

    private final C122034qd LJJLL() {
        InterfaceC153045zY LJJLJLI = LJJLJLI();
        if (LJJLJLI instanceof C133765Mu) {
            return ((C133765Mu) LJJLJLI).LJI();
        }
        return null;
    }

    private final InterfaceC136115Vv LJJZZI() {
        return LJJLIIIIJ().zi().LIZ();
    }

    private final InterfaceC139655dx LJLJJLL() {
        return LJJLIIIIJ().mu().LIZ();
    }

    private final C63D LJLJLJ() {
        return LJJLIIIIJ().PI().LIZ();
    }

    private final InterfaceC139045cy LJLLILLLL() {
        return LJJLIIIIJ().vF().LIZ();
    }

    @Override // X.C5LG
    public Bundle IV() {
        VideoEditContainerScene videoEditContainerScene = (VideoEditContainerScene) getDiContainer().LJIIIIZZ(null, VideoEditContainerScene.class);
        if (videoEditContainerScene == null) {
            return null;
        }
        return videoEditContainerScene.LLILZIL;
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        LJJLIIIIJ().BX(this);
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        LJJLIIIIJ().BX(null);
    }

    @Override // X.C5LG
    public Bundle t10() {
        WM7 wm7 = (WM7) getDiContainer().LJIIIIZZ(null, VideoEditContainerScene.class);
        if (wm7 == null) {
            return null;
        }
        return wm7.mArguments;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ C5LG getApiComponent() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    private final void LJZI(EnumC42099Gff enumC42099Gff) {
        C42562Gn8.LIZIZ.LIZIZ(LJLIIL().getCreationId(), new C42097Gfd(enumC42099Gff, LJLIIL(), null), getActivity());
    }

    @Override // X.C5LG
    public void Uo(int i) {
        NowsEditRootScene nowsEditRootScene = (NowsEditRootScene) getDiContainer().LJIIIIZZ(null, NowsEditRootScene.class);
        if (nowsEditRootScene == null) {
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i, C6IB.LIZLLL(getActivity()));
        ofInt.setInterpolator(new SJI());
        ofInt.setDuration(250L);
        ofInt.addUpdateListener(new AUListenerS91S0100000_2(nowsEditRootScene, 21));
        ofInt.start();
    }

    @Override // X.C5LG
    public void pj(int i) {
        NowsEditRootScene nowsEditRootScene = (NowsEditRootScene) getDiContainer().LJIIIIZZ(null, NowsEditRootScene.class);
        if (nowsEditRootScene == null) {
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(C6IB.LIZLLL(getActivity()), i);
        ofInt.setInterpolator(new SJI());
        ofInt.setDuration(250L);
        ofInt.addUpdateListener(new AUListenerS91S0100000_2(nowsEditRootScene, 20));
        ofInt.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5VA(C82622Wbi diContainer, InterfaceC65784Pro<? extends C63C> stickerSceneGetter) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(stickerSceneGetter, "stickerSceneGetter");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = stickerSceneGetter;
        this.LJLJI = this;
        this.LJLJJI = UCI.LJI(getDiContainer(), InterfaceC142545ic.class, null);
        this.LJLJJL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJJLL = UCI.LJI(getDiContainer(), ActivityC45651qj.class, null);
        this.LJLJL = UCI.LJI(getDiContainer(), InterfaceC145495nN.class, null);
        this.LJLJLJ = UCI.LJII(getDiContainer(), InterfaceC145485nM.class, null);
        this.LJLJLLL = UCI.LJII(getDiContainer(), InterfaceC145605nY.class, null);
        this.LJLL = UCI.LJII(getDiContainer(), InterfaceC143855kj.class, null);
        this.LJLLI = UCI.LJII(getDiContainer(), C5XM.class, null);
        this.LJLLILLLL = UCI.LJII(getDiContainer(), InterfaceC143385jy.class, null);
        this.LJLLJ = UCI.LJII(getDiContainer(), InterfaceC145405nE.class, null);
        this.LJLLL = UCI.LJI(getDiContainer(), InterfaceC142515iZ.class, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c3, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void LJLLL(com.ss.android.ugc.gamora.editorpro.model.EditorProCancelData r12, X.InterfaceC153045zY r13) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5VA.LJLLL(com.ss.android.ugc.gamora.editorpro.model.EditorProCancelData, X.5zY):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x018f, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L87;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04d8 A[LOOP:10: B:249:0x04d2->B:251:0x04d8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x093a  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0951 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0707 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:462:0x047a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:465:0x03b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:467:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void LJLZ(com.ss.android.ugc.gamora.editorpro.model.EditorProSaveData r47, X.InterfaceC153045zY r48) {
        /*
            Method dump skipped, instructions count: 2441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5VA.LJLZ(com.ss.android.ugc.gamora.editorpro.model.EditorProSaveData, X.5zY):void");
    }

    private final void LLF(int i, boolean z) {
        InterfaceC147865rC LJJLIIIJLLLLLLLZ;
        InterfaceC145485nM LJJLIIIJJI = LJJLIIIJJI();
        if (LJJLIIIJJI != null) {
            LJJLIIIJJI.l0(i);
            LJJLIIIJJI.Q9();
            LJJLIIIJJI.LLIL();
            LJJLIIIJJI.LJJLIIIJ(i);
        }
        InterfaceC153045zY LJJLJLI = LJJLJLI();
        if (LJJLJLI != null) {
            InterfaceC147865rC LJJLIIIJLLLLLLLZ2 = LJJLIIIJLLLLLLLZ();
            if (LJJLIIIJLLLLLLLZ2 != null) {
                LJJLIIIJLLLLLLLZ2.LLLLIIIILLL(new OSZ<>(Integer.valueOf(LJJLJLI.LLIZLLLIL()), Integer.valueOf(i)));
            }
            if (z && (LJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ()) != null) {
                LJJLIIIJLLLLLLLZ.LLZILL(i, true);
            }
            InterfaceC147865rC LJJLIIIJLLLLLLLZ3 = LJJLIIIJLLLLLLLZ();
            if (LJJLIIIJLLLLLLLZ3 != null) {
                LJJLIIIJLLLLLLLZ3.LLZIL();
            }
        }
        InterfaceC145605nY LJJLI = LJJLI();
        if (LJJLI != null) {
            LJJLI.UJ();
        }
    }

    @Override // X.C5LG
    public void kj0(EditorProResultData resultData, boolean z) {
        char c;
        char c2;
        o.LJIIIZ(resultData, "resultData");
        VideoEditContainerScene videoEditContainerScene = (VideoEditContainerScene) getDiContainer().LJIIIIZZ(null, VideoEditContainerScene.class);
        if (videoEditContainerScene != null) {
            if (resultData instanceof EditorProSaveData) {
                c2 = 65535;
            } else {
                c2 = 0;
            }
            videoEditContainerScene.LLILZ = false;
            if (videoEditContainerScene.LLLILZ() != null) {
                videoEditContainerScene.LLLILZLLLI();
                if (c2 == 65535) {
                    if (videoEditContainerScene.LLIIIILZ == null) {
                        videoEditContainerScene.LLIIIILZ = ((InterfaceC142515iZ) videoEditContainerScene.LLD.LJ(InterfaceC142515iZ.class, null)).JB().LIZ();
                    }
                    if (videoEditContainerScene.LLIIJI == null) {
                        videoEditContainerScene.LLIIJI = ((InterfaceC142515iZ) videoEditContainerScene.LLD.LJ(InterfaceC142515iZ.class, null)).zi().LIZ();
                    }
                }
            }
        }
        boolean z2 = resultData instanceof EditorProSaveData;
        if (z2) {
            c = 65535;
        } else {
            c = 0;
        }
        InterfaceC153045zY LJJLJLI = LJJLJLI();
        if (LJJLJLI == null) {
            return;
        }
        LJJLJLI.LLJILJIL(true);
        if (z2) {
            LJLZ((EditorProSaveData) resultData, LJJLJLI);
        } else if (resultData instanceof EditorProCancelData) {
            LJLLL((EditorProCancelData) resultData, LJJLJLI);
        }
        if (c == 65535 && z) {
            return;
        }
        Ll0().U2(true, false, true);
        LJJLJLI.prepare();
        LJJLJLI.play();
    }

    @Override // X.C5LG
    public void yb(boolean z, ArrayList<OSZ<String, String>> arrayList, boolean z2) {
        boolean z3;
        C147295qH c147295qH;
        NLEEditor nLEEditor;
        NLEModel LJ;
        NLETrack mainTrack;
        NLETrackSlot nLETrackSlot;
        NLESegmentVideo LJJ;
        NLEResourceAV LJ2;
        String LIZJ;
        CanvasVideoData canvasVideoData;
        List<String> sourceInfo;
        Object LJLLLLLL2;
        CanvasVideoData LJJJIL;
        NLEModel nLEModel;
        C147295qH c147295qH2;
        Integer num = null;
        if (z2) {
            if (arrayList != null && (c147295qH2 = (C147295qH) getDiContainer().LJIIIIZZ(null, C147295qH.class)) != null) {
                C5K1 c5k1 = new C5K1(arrayList);
                c147295qH2.LLJJJJ = c5k1;
                InterfaceC143855kj interfaceC143855kj = c147295qH2.LLFFF;
                if (interfaceC143855kj != null) {
                    interfaceC143855kj.bi(c5k1);
                    return;
                }
                return;
            }
            return;
        }
        LJLIIL().mSubtitleMusicChangeChecker.setHasAudioChangeInEditorPro(z);
        if (C5TH.LIZ(LJLIIL()) && z) {
            H78.LIZ("EditRootScene -> change audio track in editor pro and extract audio");
            InterfaceC143855kj LJJLIIJ = LJJLIIJ();
            if (LJJLIIJ != null) {
                LJJLIIJ.LE();
            }
            InterfaceC143855kj LJJLIIJ2 = LJJLIIJ();
            if (LJJLIIJ2 != null) {
                InterfaceC153045zY LJJLJLI = LJJLJLI();
                if (LJJLJLI != null) {
                    nLEModel = C17N.LJJ(LJJLJLI);
                } else {
                    nLEModel = null;
                }
                LJJLIIJ2.Jp(nLEModel);
            }
        }
        if (C5TH.LIZ(LJLIIL()) && !z) {
            LJLIIL().mSubtitleMusicChangeChecker.getData(LJLIIL());
        }
        C5XM LJJLJ = LJJLJ();
        if (LJJLJ != null) {
            LJJLJ.I90();
        }
        if (z) {
            InterfaceC143385jy LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
            if (LJJLIIIJILLIZJL != null) {
                LJJLIIIJILLIZJL.No0();
            }
            InterfaceC145405nE LJJZZIII = LJJZZIII();
            if (LJJZZIII != null) {
                LJJZZIII.I30(null);
            }
        }
        if (C5VB.LIZ && C5VC.LIZ()) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean LJIIIIZZ = C132385Hm.LJIIIIZZ(LJLIIL());
        if (z3) {
            VideoPublishEditModel editModel = LJLIIL();
            o.LJIIIZ(editModel, "editModel");
            C5VB.LIZ(editModel, true);
            C5VB.LIZ = false;
            editModel.setVideoEditorType(10);
            AVUploadMiscInfoStruct aVUploadMiscInfoStruct = editModel.uploadMiscInfoStruct;
            if (aVUploadMiscInfoStruct != null) {
                aVUploadMiscInfoStruct.mvInfo = null;
                aVUploadMiscInfoStruct.mvThemeId = null;
            }
            C78541Us5.LIZLLL(LJLIIL());
            Ll0().w00();
            InterfaceC140305f0 LJJLIIIJJIZ = LJJLIIIJJIZ();
            if (LJJLIIIJJIZ != null) {
                LJJLIIIJJIZ.f90();
            }
            InterfaceC145485nM LJJLIIIJJI = LJJLIIIJJI();
            if (LJJLIIIJJI != null) {
                LJJLIIIJJI.bg0();
            }
            getDiContainer().LJII(AnonymousClass601.class);
            getDiContainer().LJII(C6E4.class);
        }
        if (LJIIIIZZ) {
            C122034qd LJJLL = LJJLL();
            VideoPublishEditModel editModel2 = LJLIIL();
            o.LJIIIZ(editModel2, "editModel");
            if (editModel2.photoCount != 1 || editModel2.videoCount != 0 || editModel2.getEditorProModel().isPipUsed()) {
                editModel2.canvasVideoData = null;
                editModel2.getAvetParameter().setContentType("video");
            } else if (LJJLL != null && (nLEEditor = LJJLL.LJIIJ) != null && (LJ = nLEEditor.LJ()) != null && (mainTrack = LJ.getMainTrack()) != null && (nLETrackSlot = (NLETrackSlot) ORZ.LJLLLLLL(0, mainTrack.LJIILL())) != null && (LJJ = NLESegmentVideo.LJJ(nLETrackSlot.LJI())) != null && (LJ2 = LJJ.LJ()) != null && (LIZJ = LJ2.LIZJ()) != null && (canvasVideoData = editModel2.canvasVideoData) != null && (sourceInfo = canvasVideoData.getSourceInfo()) != null && (LJLLLLLL2 = ORZ.LJLLLLLL(0, sourceInfo)) != null) {
                if (!o.LJ(LIZJ, LJLLLLLL2)) {
                    C5VH c5vh = new C5VH();
                    c5vh.LIZ = LIZJ;
                    LJJJIL = C79234V7u.LJJJIL(c5vh, C47261Igj.LJJIJ(LIZJ), C1535060s.LIZ());
                    editModel2.canvasVideoData = LJJJIL;
                }
                CanvasVideoData canvasVideoData2 = editModel2.canvasVideoData;
                if (canvasVideoData2 != null) {
                    CanvasFilterParam canvasFilterParam = new CanvasFilterParam();
                    canvasFilterParam.setScaleFactor(nLETrackSlot.getScale());
                    float f = 360;
                    canvasFilterParam.setDegree(f - (nLETrackSlot.getRotation() % f));
                    canvasFilterParam.setTransX(nLETrackSlot.getTransformX());
                    canvasFilterParam.setTransY(nLETrackSlot.getTransformY());
                    canvasFilterParam.setClipIndex(0);
                    canvasVideoData2.updateTransform(0, canvasFilterParam);
                }
            }
            C127694zl.LIZ = false;
            Ll0().qs0();
        }
        if ((z3 || LJIIIIZZ) && (c147295qH = (C147295qH) getDiContainer().LJIIIIZZ(null, C147295qH.class)) != null && c147295qH.LLI == null) {
            C82622Wbi c82622Wbi = C44384HbQ.LJJJI(c147295qH).LJLLL;
            if (c82622Wbi != null) {
                c147295qH.LLI = (InterfaceC146755pP) c82622Wbi.LJIIIIZZ(null, InterfaceC146755pP.class);
                InterfaceC143845ki interfaceC143845ki = c147295qH.LLFZ;
                if (interfaceC143845ki != null) {
                    interfaceC143845ki.P6();
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditRootScene -> handleEditorProSave -> captionList.size = ");
        if (arrayList != null) {
            num = Integer.valueOf(arrayList.size());
        }
        LIZ.append(num);
        H78.LIZ(X1D.LIZIZ(LIZ));
    }

    @Override // X.C5LG
    public void ej0(WM7 scene, C5K1 c5k1, boolean z, boolean z2) {
        ArrayList<OSZ<String, String>> arrayList;
        String str;
        List<TextStickerData> RW;
        OSZ<Float, Float> LLLFF;
        C63D c63d;
        o.LJIIIZ(scene, "scene");
        C5QW.LIZ = System.currentTimeMillis();
        C5QW.LJJJIL();
        C63C invoke = this.LJLILLLLZI.invoke();
        C122034qd LJJLL = LJJLL();
        if (LJJLL != null) {
            if (invoke != null && (c63d = invoke.LLJI) != null) {
                c63d.uO();
            }
            SurfaceView value = Ll0().D50().getValue();
            o.LJII(value, "null cannot be cast to non-null type android.view.SurfaceView");
            ViewGroup.LayoutParams layoutParams = value.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            InterfaceC147865rC LJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ();
            if (LJJLIIIJLLLLLLLZ != null) {
                LJJLIIIJLLLLLLLZ.LJLL();
            }
            if (invoke != null && (LLLFF = invoke.LLLFF()) != null) {
                LJLIIL().textLayoutWidth = LLLFF.getFirst().floatValue();
                LJLIIL().textLayoutHeight = LLLFF.getSecond().floatValue();
            }
            C132045Ge c132045Ge = new C132045Ge();
            if (c5k1 != null) {
                arrayList = c5k1.LIZ();
            } else {
                arrayList = null;
            }
            c132045Ge.setInlineCaptionCaches(arrayList);
            if (H7R.LJJJJI(LJLIIL())) {
                str = "enter_from_now_edit";
            } else {
                str = "enter_from_edit_root_adjust_clips";
            }
            c132045Ge.setEnterFrom(str);
            if (invoke == null || (RW = invoke.LLL().RW()) == null) {
                return;
            }
            C132385Hm.LJIIJJI(scene, LJJLL, LJLIIL(), layoutParams2, RW, c132045Ge, LJJZZI());
            if (z2) {
                return;
            }
            C5QW.LJJIIJ(LJLIIL(), z, false, false, false, false, 60);
        }
    }
}

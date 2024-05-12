package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C124574uj;
import X.C126114xD;
import X.C126124xE;
import X.C1291655c;
import X.C1291755d;
import X.C133235Kt;
import X.C150585va;
import X.C150655vh;
import X.C158706Ks;
import X.C159116Mh;
import X.C24540xm;
import X.C41028G8i;
import X.C42278GiY;
import X.C42279GiZ;
import X.C43542H7a;
import X.C44384HbQ;
import X.C48841JEv;
import X.C55Y;
import X.C5WQ;
import X.C5WV;
import X.C71897SJp;
import X.C76800UCe;
import X.C78688UuS;
import X.C79057V0z;
import X.EXV;
import X.H7R;
import X.InterfaceC126134xF;
import X.InterfaceC127784zu;
import X.InterfaceC65784Pro;
import X.OSZ;
import X.ProgressDialogC164766dM;
import X.X1D;
import X.XKX;
import android.app.Activity;
import android.widget.CheckBox;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class AqS59S0110000_2 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS59S0110000_2 aqS59S0110000_2) {
        ImageEditRootScene imageEditRootScene = (ImageEditRootScene) aqS59S0110000_2.l0;
        VideoPublishEditModel videoPublishEditModel = imageEditRootScene.LJLLJ;
        if (videoPublishEditModel != null) {
            ImageAlbumData imageAlbumData = imageEditRootScene.LJLLI;
            if (imageAlbumData != null) {
                videoPublishEditModel.setImageAlbumData(imageAlbumData);
                if (aqS59S0110000_2.z1) {
                    VideoPublishEditModel videoPublishEditModel2 = ((ImageEditRootScene) aqS59S0110000_2.l0).LJLLJ;
                    if (videoPublishEditModel2 != null) {
                        videoPublishEditModel2.isPhotoMvMode = false;
                        videoPublishEditModel2.isPhotoMvMode1080p = false;
                        videoPublishEditModel2.isPhotoMvMusic = false;
                        videoPublishEditModel2.mvCreateVideoData = null;
                        videoPublishEditModel2.setVideoEditorType(12);
                        AVUploadMiscInfoStruct aVUploadMiscInfoStruct = videoPublishEditModel2.uploadMiscInfoStruct;
                        if (aVUploadMiscInfoStruct != null) {
                            aVUploadMiscInfoStruct.mvInfo = null;
                            aVUploadMiscInfoStruct.mvThemeId = null;
                        }
                    } else {
                        o.LJIJI("mModel");
                        throw null;
                    }
                }
                if (C150655vh.LIZ()) {
                    VideoPublishEditModel videoPublishEditModel3 = ((ImageEditRootScene) aqS59S0110000_2.l0).LJLLJ;
                    if (videoPublishEditModel3 != null) {
                        H7R.LIZIZ(videoPublishEditModel3.creativeModel.draftInfoModel);
                    } else {
                        o.LJIJI("mModel");
                        throw null;
                    }
                }
                new C43542H7a("");
                VideoPublishEditModel videoPublishEditModel4 = ((ImageEditRootScene) aqS59S0110000_2.l0).LJLLJ;
                if (videoPublishEditModel4 != null) {
                    C43542H7a.LJ(videoPublishEditModel4, "save_draft").lastEditTime = System.currentTimeMillis();
                    ImageEditRootScene imageEditRootScene2 = (ImageEditRootScene) aqS59S0110000_2.l0;
                    imageEditRootScene2.getClass();
                    if (C41028G8i.LIZ()) {
                        C42279GiZ c42279GiZ = C42279GiZ.LIZ;
                        Activity requireActivity = imageEditRootScene2.requireActivity();
                        o.LJIIIIZZ(requireActivity, "requireActivity()");
                        CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
                        creativeLoadingDialogBuilder.backCanCancel(false);
                        creativeLoadingDialogBuilder.showProgress(false);
                        String string = imageEditRootScene2.getString(R.string.pc7);
                        o.LJIIIIZZ(string, "getString(R.string.processing)");
                        creativeLoadingDialogBuilder.loadingMessage(string);
                        C42278GiY c42278GiY = (C42278GiY) c42279GiZ.createLoadingDialog(requireActivity, 1105, creativeLoadingDialogBuilder);
                        imageEditRootScene2.LLJILJIL = c42278GiY;
                        c42278GiY.delayShow(C42279GiZ.LIZ());
                    } else {
                        imageEditRootScene2.LLJIJIL = ProgressDialogC164766dM.LIZLLL(imageEditRootScene2.requireActivity(), imageEditRootScene2.getString(R.string.pc7));
                        ImageEditRootScene.LLLL(1105, true);
                    }
                    VideoPublishEditModel videoPublishEditModel5 = ((ImageEditRootScene) aqS59S0110000_2.l0).LJLLJ;
                    if (videoPublishEditModel5 != null) {
                        C44384HbQ.LLJ(videoPublishEditModel5);
                        XKX.LIZLLL(C48841JEv.LIZ(EXV.LIZ), null, null, new C150585va((ImageEditRootScene) aqS59S0110000_2.l0, aqS59S0110000_2.z1, null), 3);
                        return C76800UCe.LIZ;
                    }
                    o.LJIJI("mModel");
                    throw null;
                }
                o.LJIJI("mModel");
                throw null;
            }
            o.LJIJI("albumData");
            throw null;
        }
        o.LJIJI("mModel");
        throw null;
    }

    public static final Object invoke$1(AqS59S0110000_2 aqS59S0110000_2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" VONonTabSceneStates::needOriginalSoundState ");
        LIZ.append(aqS59S0110000_2.z1);
        LIZ.append(" and uiChecked = ");
        LIZ.append(!aqS59S0110000_2.z1);
        X1D.LIZIZ(LIZ);
        CheckBox checkBox = ((C158706Ks) aqS59S0110000_2.l0).LLF;
        if (checkBox != null) {
            checkBox.setChecked(!aqS59S0110000_2.z1);
            return C76800UCe.LIZ;
        }
        o.LJIJI("checkBox");
        throw null;
    }

    public static final Object invoke$2(AqS59S0110000_2 aqS59S0110000_2) {
        ((C71897SJp) aqS59S0110000_2.l0).setChecked(aqS59S0110000_2.z1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS59S0110000_2 aqS59S0110000_2) {
        ((C5WQ) aqS59S0110000_2.l0).LJJLIIIJILLIZJL().qb(true);
        if (aqS59S0110000_2.z1) {
            C24540xm.LIZ(R.string.itc, C78688UuS.LJIJJ((C5WQ) aqS59S0110000_2.l0), 3043);
        }
        if (((C5WQ) aqS59S0110000_2.l0).LJJLIIIJJI().mOrigin != 1) {
            C5WV.LIZ.storeBoolean("audio_music_sound", true);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS59S0110000_2 aqS59S0110000_2) {
        if (!aqS59S0110000_2.z1) {
            C159116Mh c159116Mh = (C159116Mh) aqS59S0110000_2.l0;
            c159116Mh.LJLILLLLZI.hide(c159116Mh.LLIIIJ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS59S0110000_2 aqS59S0110000_2) {
        if (aqS59S0110000_2.z1) {
            AqS168S0100000_2 aqS168S0100000_2 = ((C55Y) aqS59S0110000_2.l0).LJ;
            if (aqS168S0100000_2 != null) {
                aqS168S0100000_2.invoke(C1291755d.LIZ);
            }
        } else {
            AqS168S0100000_2 aqS168S0100000_22 = ((C55Y) aqS59S0110000_2.l0).LJ;
            if (aqS168S0100000_22 != null) {
                aqS168S0100000_22.invoke(C1291655c.LIZ);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS59S0110000_2 aqS59S0110000_2) {
        Long LIZ;
        long j;
        Object obj;
        if (aqS59S0110000_2.z1) {
            EditorProContext editorContext = ((C133235Kt) aqS59S0110000_2.l0).LJ();
            OSZ<Integer, Integer> osz = ((C133235Kt) aqS59S0110000_2.l0).LJIILL;
            o.LJIIIZ(editorContext, "editorContext");
            if (osz != null) {
                Iterator it = ((ArrayList) C124574uj.LJII(C79057V0z.LJJI(editorContext))).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        NLETrack nLETrack = (NLETrack) obj;
                        if (C124574uj.LJJIL(nLETrack) || C124574uj.LJJJ(nLETrack)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                NLETrack nLETrack2 = (NLETrack) obj;
                if (nLETrack2 != null && nLETrack2.LJIILLIIL().size() != 0) {
                    NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(nLETrack2.LJIILLIIL().get(0).LJI());
                    LIZLLL.LJIJJLI(osz.getFirst().intValue());
                    LIZLLL.LJIJJ(osz.getSecond().intValue());
                    C79057V0z.LJIIL(editorContext);
                }
            }
        }
        InterfaceC127784zu player = ((C133235Kt) aqS59S0110000_2.l0).LJ().getPlayer();
        if (aqS59S0110000_2.z1) {
            LIZ = ((C133235Kt) aqS59S0110000_2.l0).LJIIIZ;
            if (LIZ == null) {
                j = 0;
                player.M9(j * 1000);
                ((C133235Kt) aqS59S0110000_2.l0).LJ().getPlayer().play();
                return C76800UCe.LIZ;
            }
        } else {
            LIZ = ((C133235Kt) aqS59S0110000_2.l0).LIZ();
        }
        j = LIZ.longValue();
        player.M9(j * 1000);
        ((C133235Kt) aqS59S0110000_2.l0).LJ().getPlayer().play();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS59S0110000_2 aqS59S0110000_2) {
        if (aqS59S0110000_2.z1) {
            InterfaceC126134xF interfaceC126134xF = ((C126114xD) aqS59S0110000_2.l0).LIZJ;
            if (interfaceC126134xF != null) {
                interfaceC126134xF.onProgress(100);
            }
            InterfaceC126134xF interfaceC126134xF2 = ((C126114xD) aqS59S0110000_2.l0).LIZJ;
            if (interfaceC126134xF2 != null) {
                interfaceC126134xF2.onSuccess();
            }
            ((C126114xD) aqS59S0110000_2.l0).LIZJ = null;
        } else {
            InterfaceC126134xF interfaceC126134xF3 = ((C126114xD) aqS59S0110000_2.l0).LIZJ;
            if (interfaceC126134xF3 != null) {
                interfaceC126134xF3.LIZ(new C126124xE(-1, "magic_handler_error"));
            }
            ((C126114xD) aqS59S0110000_2.l0).LIZJ = null;
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS59S0110000_2(C5WQ c5wq, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c5wq;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS59S0110000_2(C71897SJp c71897SJp, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c71897SJp;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS59S0110000_2(ImageEditRootScene imageEditRootScene, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = imageEditRootScene;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS59S0110000_2(boolean z, C126114xD c126114xD, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = c126114xD;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS59S0110000_2(boolean z, C55Y c55y, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = c55y;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS59S0110000_2(boolean z, C133235Kt c133235Kt, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = c133235Kt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS59S0110000_2(boolean z, C158706Ks c158706Ks, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = c158706Ks;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS59S0110000_2(boolean z, C159116Mh c159116Mh, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = c159116Mh;
    }
}

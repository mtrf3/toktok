package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.637, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass637 implements C5ZY {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJII;
    public final C82622Wbi LIZ;
    public final C82631Wbr LIZIZ;
    public final C82631Wbr LIZJ;
    public final C82632Wbs LIZLLL;
    public final C82632Wbs LJ;
    public final C82632Wbs LJFF;
    public final C62822Ol8 LJI;

    static {
        TBT tbt = new TBT(AnonymousClass637.class, "editCutToolbarApi", "getEditCutToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJII = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(AnonymousClass637.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0, c65351Pkp), C61845OOz.LIZJ(AnonymousClass637.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(AnonymousClass637.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0, c65351Pkp), C61845OOz.LIZJ(AnonymousClass637.class, "editAutoCutApi", "getEditAutoCutApi()Lcom/ss/android/ugc/aweme/shortvideo/autocut/EditAutoCutApi;", 0, c65351Pkp)};
    }

    @Override // X.C5ZY
    public final void LIZ() {
    }

    public AnonymousClass637(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LIZ = diContainer;
        this.LIZIZ = UCI.LJII(diContainer, InterfaceC153275zv.class, null);
        this.LIZJ = UCI.LJII(diContainer, C5XM.class, null);
        this.LIZLLL = UCI.LJI(diContainer, InterfaceC143655kP.class, null);
        this.LJ = UCI.LJI(diContainer, InterfaceC153275zv.class, null);
        this.LJFF = UCI.LJI(diContainer, InterfaceC44717Hgn.class, null);
        this.LJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 39));
    }

    public final void LIZJ(VideoPublishEditModel aimModel) {
        float f;
        boolean z;
        AudioRecorderParam audioRecorderParam;
        o.LJIIIZ(aimModel, "aimModel");
        int i = aimModel.creativeModel.autoCutModel.curTemplateType;
        boolean LJLL = C44384HbQ.LJLL(aimModel);
        AudioRecorderParam audioRecorderParam2 = aimModel.veAudioRecorderParam;
        if (audioRecorderParam2 != null) {
            audioRecorderParam2.setNeedOriginalSound(LJLL);
        }
        if (LJLL) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        aimModel.voiceVolume = f;
        if (HRX.LIZLLL() && (audioRecorderParam = aimModel.veAudioRecorderParam) != null) {
            audioRecorderParam.setHasOriginalSound(true);
        }
        if (i == -1) {
            C82632Wbs c82632Wbs = this.LJ;
            InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LJII;
            ((InterfaceC153275zv) c82632Wbs.LIZ(this, interfaceC74236TBoArr[3])).refresh();
            ((InterfaceC44717Hgn) this.LJFF.LIZ(this, interfaceC74236TBoArr[4])).rp();
            InterfaceC153275zv interfaceC153275zv = (InterfaceC153275zv) this.LIZIZ.LIZ(this, interfaceC74236TBoArr[0]);
            if (interfaceC153275zv != null) {
                interfaceC153275zv.b2(15, true);
            }
            C5XM c5xm = (C5XM) this.LIZJ.LIZ(this, interfaceC74236TBoArr[1]);
            if (c5xm != null) {
                c5xm.RU(true);
                return;
            }
            return;
        }
        C82632Wbs c82632Wbs2 = this.LJFF;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr2 = LJII;
        ((InterfaceC44717Hgn) c82632Wbs2.LIZ(this, interfaceC74236TBoArr2[4])).Do();
        InterfaceC153275zv interfaceC153275zv2 = (InterfaceC153275zv) this.LIZIZ.LIZ(this, interfaceC74236TBoArr2[0]);
        if (interfaceC153275zv2 != null) {
            interfaceC153275zv2.b2(15, false);
            interfaceC153275zv2.b2(19, false);
            EnumC43998HOo enumC43998HOo = EnumC43998HOo.CUT_SAME;
            if (i != enumC43998HOo.getValue()) {
                z = true;
            } else {
                z = false;
            }
            interfaceC153275zv2.Jf(20, z);
            if (!HRX.LIZLLL() || i == enumC43998HOo.getValue()) {
                interfaceC153275zv2.fg0(11, false);
                if (H7R.LJJLIIIIJ(aimModel)) {
                    interfaceC153275zv2.b2(11, false);
                }
            }
        }
        InterfaceC145405nE interfaceC145405nE = (InterfaceC145405nE) this.LIZ.LJIIIIZZ(null, InterfaceC145405nE.class);
        if (interfaceC145405nE != null) {
            interfaceC145405nE.Hn0();
        }
        InterfaceC145455nJ interfaceC145455nJ = (InterfaceC145455nJ) this.LIZ.LJIIIIZZ(null, InterfaceC145455nJ.class);
        if (interfaceC145455nJ != null) {
            interfaceC145455nJ.zd();
        }
        C5XM c5xm2 = (C5XM) this.LIZJ.LIZ(this, interfaceC74236TBoArr2[1]);
        if (c5xm2 != null) {
            c5xm2.I90();
        }
        InterfaceC145485nM interfaceC145485nM = (InterfaceC145485nM) this.LJI.getValue();
        if (interfaceC145485nM != null) {
            interfaceC145485nM.LJJLIIIJ((int) C45087Hml.LJIIJJI((InterfaceC143655kP) this.LIZLLL.LIZ(this, interfaceC74236TBoArr2[2])));
        }
        InterfaceC145485nM interfaceC145485nM2 = (InterfaceC145485nM) this.LJI.getValue();
        if (interfaceC145485nM2 != null) {
            interfaceC145485nM2.bg0();
        }
    }

    @Override // X.C5ZY
    public final void LIZIZ(NLEModel nLEModel, VideoPublishEditModel aimModel, VideoPublishEditModel videoPublishEditModel) {
        String str;
        AutoCutThemeData autoCutThemeData;
        AutoCutThemeData autoCutThemeData2;
        String str2;
        String str3;
        String str4;
        o.LJIIIZ(aimModel, "aimModel");
        Iterator<AutoCutThemeData> it = videoPublishEditModel.creativeModel.autoCutModel.templateList.iterator();
        while (true) {
            str = null;
            if (it.hasNext()) {
                autoCutThemeData = it.next();
                if (autoCutThemeData.LIZ() == C63A.ACTION_AI) {
                    break;
                }
            } else {
                autoCutThemeData = null;
                break;
            }
        }
        AutoCutThemeData autoCutThemeData3 = autoCutThemeData;
        Iterator<AutoCutThemeData> it2 = aimModel.creativeModel.autoCutModel.templateList.iterator();
        while (true) {
            if (it2.hasNext()) {
                autoCutThemeData2 = it2.next();
                if (autoCutThemeData2.LIZ() == C63A.ACTION_AI) {
                    break;
                }
            } else {
                autoCutThemeData2 = null;
                break;
            }
        }
        AutoCutThemeData autoCutThemeData4 = autoCutThemeData2;
        if (autoCutThemeData3 != null) {
            str2 = autoCutThemeData3.templateId;
        } else {
            str2 = null;
        }
        if (autoCutThemeData4 != null) {
            str3 = autoCutThemeData4.templateId;
        } else {
            str3 = null;
        }
        if (o.LJ(str2, str3)) {
            if (autoCutThemeData3 != null) {
                str4 = autoCutThemeData3.musicId;
            } else {
                str4 = null;
            }
            if (autoCutThemeData4 != null) {
                str = autoCutThemeData4.musicId;
            }
            if (o.LJ(str4, str)) {
                return;
            }
        }
        AutoCutModel autoCutModel = videoPublishEditModel.creativeModel.autoCutModel;
        AutoCutModel autoCutModel2 = aimModel.creativeModel.autoCutModel;
        List<AutoCutThemeData> LLJILJILJ = ORZ.LLJILJILJ(autoCutModel.templateList);
        autoCutModel2.getClass();
        autoCutModel2.templateList = LLJILJILJ;
        autoCutModel2.curIndexFromSource = autoCutModel.curIndexFromSource;
        autoCutModel2.curSource = autoCutModel.curSource;
        autoCutModel2.clickFrom = autoCutModel.clickFrom;
        autoCutModel2.curTemplateType = autoCutModel.curTemplateType;
        autoCutModel2.curTemplateId = autoCutModel.curTemplateId;
        autoCutModel2.curTemplateGroupId = autoCutModel.curTemplateGroupId;
        LIZJ(aimModel);
    }
}

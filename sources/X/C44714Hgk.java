package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;

/* renamed from: X.Hgk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44714Hgk extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ InterfaceC44718Hgo LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;
    public final /* synthetic */ VideoPublishEditModel LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ C44716Hgm LJLJJL;
    public final /* synthetic */ AVMusic LJLJJLL;
    public final /* synthetic */ InterfaceC145495nN LJLJL;
    public final /* synthetic */ InterfaceC44717Hgn LJLJLJ;
    public final /* synthetic */ AutoCutModel LJLJLLL;
    public final /* synthetic */ C5XM LJLL;
    public final /* synthetic */ InterfaceC153275zv LJLLI;
    public final /* synthetic */ C82622Wbi LJLLILLLL;
    public final /* synthetic */ InterfaceC143655kP LJLLJ;
    public final /* synthetic */ C44704Hga LJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44714Hgk(InterfaceC44718Hgo interfaceC44718Hgo, Context context, VideoPublishEditModel videoPublishEditModel, boolean z, C44716Hgm c44716Hgm, AVMusic aVMusic, InterfaceC145495nN interfaceC145495nN, InterfaceC44717Hgn interfaceC44717Hgn, AutoCutModel autoCutModel, C5XM c5xm, InterfaceC153275zv interfaceC153275zv, C82622Wbi c82622Wbi, InterfaceC143655kP interfaceC143655kP, C44704Hga c44704Hga) {
        super(0);
        this.LJLIL = interfaceC44718Hgo;
        this.LJLILLLLZI = context;
        this.LJLJI = videoPublishEditModel;
        this.LJLJJI = z;
        this.LJLJJL = c44716Hgm;
        this.LJLJJLL = aVMusic;
        this.LJLJL = interfaceC145495nN;
        this.LJLJLJ = interfaceC44717Hgn;
        this.LJLJLLL = autoCutModel;
        this.LJLL = c5xm;
        this.LJLLI = interfaceC153275zv;
        this.LJLLILLLL = c82622Wbi;
        this.LJLLJ = interfaceC143655kP;
        this.LJLLL = c44704Hga;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        float f;
        C156906Du c156906Du;
        boolean z;
        C5XM c5xm;
        List<TextStickerData> LIZJ;
        InterfaceC44718Hgo interfaceC44718Hgo = this.LJLIL;
        if (interfaceC44718Hgo != null) {
            interfaceC44718Hgo.LJJJLL();
        }
        if (!C44701HgX.LIZ(this.LJLILLLLZI)) {
            C44716Hgm c44716Hgm = null;
            if (C44701HgX.LJIIJJI(this.LJLJI.creativeModel)) {
                if (this.LJLJJI) {
                    C44716Hgm c44716Hgm2 = this.LJLJJL;
                    c44716Hgm2.LJ = this.LJLJJLL;
                    c44716Hgm2.LJFF = this.LJLJI.getMMusicPath();
                }
                VideoPublishEditModel videoPublishEditModel = this.LJLJI;
                InterfaceC145495nN interfaceC145495nN = this.LJLJL;
                I9T.LJI(null, false, videoPublishEditModel.creativeModel.musicBuzModel);
                if (interfaceC145495nN != null) {
                    interfaceC145495nN.clearMusic();
                }
                InterfaceC44717Hgn interfaceC44717Hgn = this.LJLJLJ;
                if (interfaceC44717Hgn != null) {
                    C44716Hgm c44716Hgm3 = this.LJLJJL;
                    NLEModel nLEModel = c44716Hgm3.LJII;
                    if (nLEModel != null && (LIZJ = C5V8.LIZJ(nLEModel)) != null) {
                        c44716Hgm3.LJIIJ = LIZJ;
                    }
                    interfaceC44717Hgn.oN(c44716Hgm3);
                    interfaceC44717Hgn.Ed0(c44716Hgm3);
                    interfaceC44717Hgn.Do();
                }
                if (!HRX.LIZLLL() && this.LJLJLLL.curTemplateType != EnumC43998HOo.CUT_SAME.getValue() && (c5xm = this.LJLL) != null) {
                    c5xm.RU(false);
                }
                VideoPublishEditModel videoPublishEditModel2 = this.LJLJI;
                int i = this.LJLJLLL.curTemplateType;
                EnumC43998HOo enumC43998HOo = EnumC43998HOo.CUT_SAME;
                if (i == enumC43998HOo.getValue()) {
                    f = WUK.LJIIZILJ;
                } else {
                    f = 0.0f;
                }
                videoPublishEditModel2.voiceVolume = f;
                C5XM c5xm2 = this.LJLL;
                if (c5xm2 != null) {
                    c5xm2.vt0(this.LJLJI.voiceVolume);
                }
                C5XM c5xm3 = this.LJLL;
                boolean z2 = true;
                if (c5xm3 != null) {
                    if (this.LJLJLLL.curTemplateType == enumC43998HOo.getValue()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c5xm3.RU(z);
                }
                InterfaceC153275zv interfaceC153275zv = this.LJLLI;
                if (interfaceC153275zv != null) {
                    if (this.LJLJLLL.curTemplateType == enumC43998HOo.getValue()) {
                        z2 = false;
                    }
                    interfaceC153275zv.Jf(20, z2);
                    interfaceC153275zv.b2(15, false);
                    interfaceC153275zv.refresh();
                }
                this.LJLJI.creativeModel.autoCutAnchorModel.nleData = C45087Hml.LJJIL(this.LJLJJL.LJII);
                this.LJLJLLL.backwardAutoCutProcess = false;
                if (C44720Hgq.LIZ() && !this.LJLJI.getEditorProModel().getFromEditorProAnchor() && !this.LJLJI.getEditorProModel().getFromEditorProEntranceInAlbum() && (c156906Du = (C156906Du) this.LJLLILLLL.LJIIIIZZ(null, C156906Du.class)) != null) {
                    c156906Du.LJFF(this.LJLJI);
                }
            } else {
                InterfaceC143655kP interfaceC143655kP = this.LJLLJ;
                if (interfaceC143655kP != null) {
                    interfaceC143655kP.U2(false, false, false);
                }
                C63A LJJ = AnonymousClass636.LJJ(this.LJLJLLL.curSource);
                if (LJJ != null) {
                    AutoCutModel autoCutModel = this.LJLJLLL;
                    c44716Hgm = new C44716Hgm(LJJ, autoCutModel.curIndexFromSource, autoCutModel.curTemplateType, null, null, null, 0L, null, autoCutModel.curTemplateId, null, autoCutModel.curTemplateGroupId, 5624);
                }
                InterfaceC44717Hgn interfaceC44717Hgn2 = this.LJLJLJ;
                if (interfaceC44717Hgn2 != null) {
                    interfaceC44717Hgn2.Q10(this.LJLJJL, c44716Hgm, MusicBeanUtilKt.extractAVMusic(this.LJLJI.creativeModel.musicBuzModel), this.LJLJI.getMMusicPath(), this.LJLLL);
                }
            }
        }
        return C76800UCe.LIZ;
    }
}

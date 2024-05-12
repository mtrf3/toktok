package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* renamed from: X.Hgl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44715Hgl extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ InterfaceC44718Hgo LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;
    public final /* synthetic */ InterfaceC143655kP LJLJI;
    public final /* synthetic */ C44716Hgm LJLJJI;
    public final /* synthetic */ C44722Hgs LJLJJL;
    public final /* synthetic */ AutoCutModel LJLJJLL;
    public final /* synthetic */ C44716Hgm LJLJL;
    public final /* synthetic */ InterfaceC44717Hgn LJLJLJ;
    public final /* synthetic */ VideoPublishEditModel LJLJLLL;
    public final /* synthetic */ C44704Hga LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44715Hgl(InterfaceC44718Hgo interfaceC44718Hgo, Context context, InterfaceC143655kP interfaceC143655kP, C44716Hgm c44716Hgm, C44722Hgs c44722Hgs, AutoCutModel autoCutModel, C44716Hgm c44716Hgm2, InterfaceC44717Hgn interfaceC44717Hgn, VideoPublishEditModel videoPublishEditModel, C44704Hga c44704Hga) {
        super(0);
        this.LJLIL = interfaceC44718Hgo;
        this.LJLILLLLZI = context;
        this.LJLJI = interfaceC143655kP;
        this.LJLJJI = c44716Hgm;
        this.LJLJJL = c44722Hgs;
        this.LJLJJLL = autoCutModel;
        this.LJLJL = c44716Hgm2;
        this.LJLJLJ = interfaceC44717Hgn;
        this.LJLJLLL = videoPublishEditModel;
        this.LJLL = c44704Hga;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        String str;
        InterfaceC44718Hgo interfaceC44718Hgo = this.LJLIL;
        if (interfaceC44718Hgo != null) {
            interfaceC44718Hgo.LJJJLL();
        }
        if (!C44701HgX.LIZ(this.LJLILLLLZI)) {
            InterfaceC143655kP interfaceC143655kP = this.LJLJI;
            if (interfaceC143655kP != null) {
                interfaceC143655kP.U2(false, false, false);
            }
            C44716Hgm c44716Hgm = this.LJLJJI;
            C44716Hgm c44716Hgm2 = null;
            if (c44716Hgm == null || c44716Hgm.LJ == null || (str = c44716Hgm.LJFF) == null || str.length() == 0) {
                C44716Hgm c44716Hgm3 = this.LJLJJI;
                if (c44716Hgm3 != null) {
                    C44716Hgm c44716Hgm4 = this.LJLJL;
                    c44716Hgm = new C44716Hgm(C63A.SOUND_SYNC, 0, EnumC43998HOo.SOUND_SYNC_TEMPLATE.getValue(), null, c44716Hgm4.LJ, c44716Hgm4.LJFF, c44716Hgm3.LJI, c44716Hgm3.LJII, null, null, null, 7944);
                } else {
                    c44716Hgm = null;
                }
                C44722Hgs c44722Hgs = this.LJLJJL;
                if (c44722Hgs != null) {
                    c44722Hgs.uQ(c44716Hgm);
                }
            }
            C63A LJJ = AnonymousClass636.LJJ(this.LJLJJLL.curSource);
            if (LJJ != null) {
                AutoCutModel autoCutModel = this.LJLJJLL;
                c44716Hgm2 = new C44716Hgm(LJJ, autoCutModel.curIndexFromSource, autoCutModel.curTemplateType, null, null, null, 0L, null, autoCutModel.curTemplateId, null, autoCutModel.curTemplateGroupId, 5624);
            }
            if (c44716Hgm != null) {
                InterfaceC44717Hgn interfaceC44717Hgn = this.LJLJLJ;
                VideoPublishEditModel videoPublishEditModel = this.LJLJLLL;
                C44704Hga c44704Hga = this.LJLL;
                if (interfaceC44717Hgn != null) {
                    interfaceC44717Hgn.Q10(c44716Hgm, c44716Hgm2, MusicBeanUtilKt.extractAVMusic(videoPublishEditModel.creativeModel.musicBuzModel), videoPublishEditModel.getMMusicPath(), c44704Hga);
                }
            }
        }
        return C76800UCe.LIZ;
    }
}

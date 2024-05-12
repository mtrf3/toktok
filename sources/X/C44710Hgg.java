package X;

import Y.ACallableS110S0100000_7;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Hgg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44710Hgg extends AbstractC45048Hm8 {
    public final /* synthetic */ AutoCutModel LJJI;
    public final /* synthetic */ boolean LJJIFFI;
    public final /* synthetic */ AVMusic LJJII;
    public final /* synthetic */ VideoPublishEditModel LJJIII;
    public final /* synthetic */ InterfaceC44718Hgo LJJIIJ;
    public final /* synthetic */ C82622Wbi LJJIIJZLJL;

    @Override // X.AbstractC45048Hm8, X.InterfaceC45222How
    public final void onCancel() {
        super.onCancel();
        if (C44706Hgc.LIZ()) {
            CreativeModel creativeModel = this.LJJIII.creativeModel;
            AutoCutModel autoCutModel = new AutoCutModel(null, null, null, 0, 0, null, null, 0, false, null, null, null, null, null, null, null, null, 131071, null);
            creativeModel.getClass();
            creativeModel.autoCutModel = autoCutModel;
            return;
        }
        C10K.LIZJ(new ACallableS110S0100000_7(this.LJJI, 8));
        CreativeModel creativeModel2 = this.LJJIII.creativeModel;
        AutoCutModel autoCutModel2 = new AutoCutModel(null, null, null, 0, 0, null, null, 0, false, null, null, null, null, null, null, null, null, 131071, null);
        creativeModel2.getClass();
        creativeModel2.autoCutModel = autoCutModel2;
    }

    @Override // X.InterfaceC45222How
    public final void onExit() {
        C6QQ.LIZ(new AqS154S0200000_7(this.LJJIIJ, this.LJJIIJZLJL, 26));
    }

    @Override // X.AbstractC45048Hm8, X.InterfaceC45209Hoj
    public final void LIZ(NLEModel nLEModel) {
        super.LIZ(nLEModel);
        LJIJJLI("AutoCutImageEditHelper", this.LJJI);
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJIIJJI(List<AutoCutMediaModel> list) {
        List<AutoCutMediaModel> list2 = this.LJJI.mediaList;
        list2.clear();
        list2.addAll(list);
    }

    @Override // X.AbstractC45048Hm8, X.InterfaceC45209Hoj
    public final void LJIIZILJ(C44716Hgm c44716Hgm) {
        OSZ osz;
        AVMusic aVMusic;
        AutoCutThemeData LJII;
        String str;
        super.LJIIZILJ(c44716Hgm);
        this.LJJI.optimizeLargeNLEId = C36942Eeg.LIZIZ(c44716Hgm.LJII);
        AutoCutModel autoCutModel = this.LJJI;
        C63A c63a = C63A.AUTO_CUT;
        AnonymousClass636.LJIJJLI(autoCutModel, 0, c63a, c44716Hgm.LIZJ, c44716Hgm.LJIIIZ, c44716Hgm.LJIIJJI);
        LJIJJ("AutoCutImageEditHelper", this.LJJI);
        if (this.LJJIFFI) {
            AVMusic aVMusic2 = this.LJJII;
            if (aVMusic2 != null) {
                AutoCutModel autoCutModel2 = this.LJJI;
                if (aVMusic2.isPgc()) {
                    str = "pgc";
                } else {
                    str = "ugc";
                }
                autoCutModel2.getClass();
                autoCutModel2.reuseMusicType = str;
            }
            if (c44716Hgm.LIZIZ == 0 && c44716Hgm.LIZ == c63a && (LJII = AnonymousClass636.LJII(this.LJJI)) != null) {
                LJII.templateType = c44716Hgm.LIZJ;
            }
        }
        if (!this.LJJIFFI || (aVMusic = this.LJJII) == null) {
            osz = new OSZ(c44716Hgm.LJ, c44716Hgm.LJFF);
        } else {
            aVMusic.setMusicStartFromCut(0);
            osz = new OSZ(this.LJJII, this.LJJIII.getMMusicPath());
        }
        AVMusic aVMusic3 = (AVMusic) osz.getFirst();
        String str2 = (String) osz.getSecond();
        I9T.LJI(aVMusic3, false, this.LJJIII.creativeModel.musicBuzModel);
        C6QQ.LIZ(new C43614H9u(this.LJJIIJ, c44716Hgm, this.LJJIIJZLJL, this.LJJIII, str2));
    }

    @Override // X.AbstractC45048Hm8, X.InterfaceC45209Hoj
    public final void LJIJ(int i) {
        super.LJIJ(i);
        this.LJJI.asyncRenderModel.asyncRenderNecessaryDownloadCount = i;
    }

    @Override // X.AbstractC45048Hm8, X.InterfaceC45209Hoj
    public final void LJIILJJIL(String taskId, List templateList) {
        o.LJIIIZ(templateList, "templateList");
        o.LJIIIZ(taskId, "taskId");
        super.LJIILJJIL(taskId, templateList);
        AutoCutModel autoCutModel = this.LJJI;
        List<AutoCutThemeData> LLJILJILJ = ORZ.LLJILJILJ(templateList);
        autoCutModel.getClass();
        autoCutModel.templateList = LLJILJILJ;
        this.LJJI.taskId = taskId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44710Hgg(List<AutoCutMediaModel> list, AutoCutModel autoCutModel, boolean z, AVMusic aVMusic, VideoPublishEditModel videoPublishEditModel, InterfaceC44718Hgo interfaceC44718Hgo, C82622Wbi c82622Wbi, String str, String str2, String str3) {
        super("video_edit_page", str, str2, list, str3, autoCutModel);
        this.LJJI = autoCutModel;
        this.LJJIFFI = z;
        this.LJJII = aVMusic;
        this.LJJIII = videoPublishEditModel;
        this.LJJIIJ = interfaceC44718Hgo;
        this.LJJIIJZLJL = c82622Wbi;
    }
}

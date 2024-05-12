package X;

import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutSoundSyncModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.EditorProModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.CreativeFlowData;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.operate.DraftRestoreOpt$restore$1", f = "DraftRestoreOp.kt", l = {52}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GXB extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC41657GWn LJLILLLLZI;
    public final /* synthetic */ GXC LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GXB(InterfaceC41657GWn interfaceC41657GWn, GXC gxc, InterfaceC67352kd<? super GXB> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC41657GWn;
        this.LJLJI = gxc;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new GXB(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        EditorProModel editorProModel;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        boolean z = false;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            if (C41652GWi.LIZ()) {
                this.LJLILLLLZI.LIZIZ(new C41656GWm(C77412UZs.LJIILLIIL((AwemeDraft) this.LJLJI.LJLJI, null, 3), null));
                return C76800UCe.LIZ;
            }
            AwemeDraft awemeDraft = (AwemeDraft) this.LJLJI.LJLJI;
            List<AutoCutThemeData> list = awemeDraft.LIZ.autoCutModel.templateList;
            ArrayList arrayList = new ArrayList();
            for (AutoCutThemeData autoCutThemeData : list) {
                if (autoCutThemeData.LIZ() == C63A.AUTO_CUT) {
                    arrayList.add(autoCutThemeData);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((AutoCutThemeData) it.next()).indexFromSource != -1) {
                        break;
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (AutoCutThemeData autoCutThemeData2 : list) {
                if (autoCutThemeData2.LIZ() == C63A.AUTO_CUT) {
                    arrayList2.add(autoCutThemeData2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    ((AutoCutThemeData) next).indexFromSource = i2;
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(awemeDraft.LIZ.autoCutAnchorModel.music);
            String str2 = awemeDraft.LIZ.autoCutAnchorModel.templateGroupId;
            if (list.isEmpty() && extractAVMusic != null) {
                C44727Hgx c44727Hgx = AutoCutThemeData.Companion;
                MusicModel LJJIJIL = C78915Uy7.LJJIJIL(extractAVMusic);
                C63A c63a = C63A.AUTO_CUT;
                if (str2 == null) {
                    str2 = "";
                }
                C42646GoU c42646GoU = C42646GoU.LJLIL;
                c44727Hgx.getClass();
                list.add(C44727Hgx.LIZ(LJJIJIL, c63a, 5, str2, c42646GoU, true));
            }
            GXC gxc = this.LJLJI;
            this.LJLIL = 1;
            obj = XKX.LJI(EXT.LIZ, new GXF(gxc, null), this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C41656GWm c41656GWm = (C41656GWm) obj;
        VideoPublishEditModel videoPublishEditModel = c41656GWm.LIZIZ;
        if (videoPublishEditModel != null) {
            AutoCutModel autoCutModel = videoPublishEditModel.creativeModel.autoCutModel;
            if (!C78685UuP.LJJJZ(autoCutModel.soundSyncModel.soundSyncNleData) && (str = autoCutModel.soundSyncModel.soundSyncNleDataPath) != null && str.length() != 0 && C39579Fg7.LIZIZ(str)) {
                AutoCutSoundSyncModel autoCutSoundSyncModel = autoCutModel.soundSyncModel;
                int i4 = autoCutSoundSyncModel.soundSyncNleDataVersion;
                CreativeFlowData creativeFlowData = videoPublishEditModel.creativeFlowData;
                if (creativeFlowData != null && (editorProModel = creativeFlowData.getEditorProModel()) != null) {
                    z = editorProModel.isAdvancedEditDraft();
                }
                autoCutSoundSyncModel.soundSyncNleDataVersion = C122954s7.LIZ(i4, str, z).getSecond().intValue();
                autoCutModel.soundSyncModel.soundSyncNleData = C39579Fg7.LJIJI(str);
            }
        }
        if (c41656GWm.LIZ.isSuc()) {
            this.LJLILLLLZI.LIZ(c41656GWm);
        } else {
            this.LJLILLLLZI.LIZIZ(c41656GWm);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

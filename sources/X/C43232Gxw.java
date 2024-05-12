package X;

import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.LighteningExtraInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.IDqS181S0200000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.Gxw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43232Gxw implements InterfaceC168776jp {
    @Override // X.InterfaceC168776jp
    public final void LIZ(VideoPublishEditModel editModel) {
        o.LJIIIZ(editModel, "editModel");
        HHD.LJIIIZ(editModel);
    }

    @Override // X.InterfaceC168776jp
    public final boolean LJFF(VideoPublishEditModel editModel) {
        o.LJIIIZ(editModel, "editModel");
        if (C60903NvH.LJIIJJI().getAccountService().isChildrenMode()) {
            return false;
        }
        if (!C145805ns.LIZ() && !C132385Hm.LJII(editModel)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC168776jp
    public final VideoPublishEditModel LIZIZ(AwemeDraft awemeDraft, GLI extraInfo) {
        o.LJIIIZ(extraInfo, "extraInfo");
        new C43542H7a(extraInfo.LIZ);
        return C43542H7a.LIZJ(awemeDraft);
    }

    @Override // X.InterfaceC168776jp
    public final void LIZJ(VideoPublishEditModel editModel, String str) {
        o.LJIIIZ(editModel, "editModel");
        HHD.LJIIIIZZ(editModel, str);
    }

    @Override // X.InterfaceC168776jp
    public final AwemeDraft LJ(VideoPublishEditModel editModel, GLI extraInfo) {
        int LJI;
        o.LJIIIZ(editModel, "editModel");
        o.LJIIIZ(extraInfo, "extraInfo");
        new C43542H7a(extraInfo.LIZ);
        AwemeDraft LJ = C43542H7a.LJ(editModel, String.valueOf(extraInfo.LIZIZ));
        LJ.lastEditTime = System.currentTimeMillis();
        int i = extraInfo.LIZIZ;
        LJ.LIZIZ = i;
        if (i == 16) {
            LJ.LJJJJI.lighteningExtraInfo = new LighteningExtraInfo(null, 1, null);
        }
        LJ.LJJJJI.saveDraftAppVersion = C60903NvH.LJIIJJI().getVersionCode();
        DraftInfoModel draftInfoModel = LJ.LIZ.draftInfoModel;
        if (!draftInfoModel.isDraft) {
            draftInfoModel.isRecordFullScreen = C143225ji.LIZ();
        }
        DraftInfoModel draftInfoModel2 = LJ.LIZ.draftInfoModel;
        if (H7R.LJI(editModel) < 0) {
            LJI = 0;
        } else {
            LJI = H7R.LJI(editModel);
        }
        draftInfoModel2.draftAwemeType = LJI;
        return LJ;
    }

    @Override // X.InterfaceC168776jp
    public final void LIZLLL(CanvasVideoData canvasVideoData, String str, IDqS181S0200000_2 iDqS181S0200000_2) {
        C169656lF.LIZJ(canvasVideoData, str, iDqS181S0200000_2);
    }
}

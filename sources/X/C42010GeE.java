package X;

import com.ss.android.ugc.aweme.creative.model.publish.EditDescMobModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.image.ExpandedTitleModule;
import kotlin.jvm.internal.AqS27S0001000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.GeE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42010GeE implements InterfaceC83564Wqu {
    public final /* synthetic */ ExpandedTitleModule LJLIL;

    public C42010GeE(ExpandedTitleModule expandedTitleModule) {
        this.LJLIL = expandedTitleModule;
    }

    @Override // X.InterfaceC83564Wqu
    public final void keyBoardHide(int i) {
        ExpandedTitleModule expandedTitleModule = this.LJLIL;
        expandedTitleModule.LLILLIZIL = false;
        if (GSI.LIZ()) {
            expandedTitleModule.LLIIJLIL.setVisibility(8);
            expandedTitleModule.LLIILII.setVisibility(0);
        }
        if (expandedTitleModule.LJ() && !expandedTitleModule.LLIFFJFJJ) {
            expandedTitleModule.LIZ(1);
            expandedTitleModule.LJLJJLL.clearFocus();
            expandedTitleModule.LJLJJLL.setScrollY(0);
        }
        if (!expandedTitleModule.LLIFFJFJJ) {
            VideoPublishEditModel mModel = expandedTitleModule.LJLIL;
            int i2 = expandedTitleModule.LLIZ;
            o.LJIIIZ(mModel, "mModel");
            C164236cV.LIZIZ(mModel, "post_description_writing_done", true, new AqS27S0001000_2(i2, 0));
        }
        if (C42016GeK.LIZ()) {
            expandedTitleModule.LLILLL.LJLJJI.setValue(Boolean.FALSE);
        }
        if (C42018GeM.LIZ()) {
            expandedTitleModule.LLILLL.LJLJI.setValue(Boolean.FALSE);
        }
    }

    @Override // X.InterfaceC83564Wqu
    public final void keyBoardModify(int i) {
        ExpandedTitleModule expandedTitleModule = this.LJLIL;
        expandedTitleModule.LLIIIILZ += i;
        if (expandedTitleModule.LJ()) {
            expandedTitleModule.LLIIII = expandedTitleModule.LLII - expandedTitleModule.LLIIIILZ;
            int LIZJ = expandedTitleModule.LIZJ(expandedTitleModule.LLJ);
            int LIZIZ = expandedTitleModule.LIZIZ(LIZJ);
            expandedTitleModule.LJIIJJI(LIZJ);
            expandedTitleModule.LJLLI.setMinHeight(LIZIZ);
            expandedTitleModule.LJIIJ(expandedTitleModule.LLJ);
        }
    }

    @Override // X.InterfaceC83564Wqu
    public final void keyBoardShow(int i) {
        ExpandedTitleModule expandedTitleModule = this.LJLIL;
        expandedTitleModule.LLILLIZIL = true;
        expandedTitleModule.LLIIIILZ = i;
        int i2 = 3;
        expandedTitleModule.LLIZ = 3;
        if (expandedTitleModule.LLI || GSI.LIZ()) {
            if (expandedTitleModule.LLIIJLIL.getVisibility() != 0) {
                i2 = 2;
            }
            expandedTitleModule.LIZ(i2);
        }
        expandedTitleModule.LLI = false;
        expandedTitleModule.LLIIIL = false;
        if (C42016GeK.LIZ()) {
            expandedTitleModule.LLILLL.LJLJJI.setValue(Boolean.TRUE);
        } else if (C42018GeM.LIZ() && expandedTitleModule.LJLJJLL.hasWindowFocus()) {
            expandedTitleModule.LLILLL.LJLJI.setValue(Boolean.TRUE);
        }
        if (expandedTitleModule.LLILZIL > expandedTitleModule.LLILZLL) {
            VideoPublishEditModel videoPublishEditModel = expandedTitleModule.LJLIL;
            EditDescMobModel editDescMobModel = videoPublishEditModel.creativeModel.commonMobModel.editDescMobModel;
            if (!editDescMobModel.isMobTypeMoreThanLimitTriggered) {
                editDescMobModel.isMobTypeMoreThanLimitTriggered = true;
                GXR.LIZ("type_more_than_limit_triggered", C164236cV.LIZ(videoPublishEditModel).LIZ);
                String LIZ = C41050G9e.LIZ(expandedTitleModule.LLILZLL);
                C5S1 c5s1 = new C5S1(C60903NvH.LJ);
                c5s1.LIZLLL(LIZ);
                c5s1.LJ();
                C164236cV.LIZJ(expandedTitleModule.LJLIL);
            }
        }
    }
}

package X;

import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.model.MAFIMUser;

/* renamed from: X.MfH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57363MfH implements InterfaceC51702KQw {
    public final /* synthetic */ C57367MfL LJLIL;

    @Override // X.InterfaceC51702KQw
    public final void onStartFollowOperation() {
    }

    public C57363MfH(C57367MfL c57367MfL) {
        this.LJLIL = c57367MfL;
    }

    @Override // X.InterfaceC51702KQw
    public final void onFollowFail(Exception exc) {
        this.LJLIL.M().setFollowStatus(0);
    }

    @Override // X.InterfaceC51702KQw
    public final void onFollowSuccess(FollowStatus followStatus) {
        C57367MfL c57367MfL;
        MAFIMUser mAFIMUser;
        if (followStatus != null && followStatus.isFollowSucess && this.LJLIL.M().getStatus() == 4 && (mAFIMUser = (c57367MfL = this.LJLIL).LJLILLLLZI) != null) {
            SharePanelViewModel sharePanelViewModel = c57367MfL.LJLIL;
            sharePanelViewModel.getClass();
            InterfaceC80643Em interfaceC80643Em = sharePanelViewModel.LJLJL;
            if (interfaceC80643Em != null) {
                interfaceC80643Em.LLJILLL(C47261Igj.LJJIJ(C78983UzD.LJJLIIIJILLIZJL(mAFIMUser)));
            }
            User LJJLIIIJILLIZJL = C78983UzD.LJJLIIIJILLIZJL(mAFIMUser);
            C57362MfG c57362MfG = new C57362MfG();
            c57362MfG.LJJIIZI(sharePanelViewModel.LJFF());
            c57362MfG.LJJLI = EnumC57366MfK.CARD;
            c57362MfG.LJJJJI();
            c57362MfG.LJJJJIZL(LJJLIIIJILLIZJL);
            c57362MfG.LJJLIIIIJ = EnumC57365MfJ.FOLLOW;
            c57362MfG.LJJIJ("long_press");
            c57362MfG.LJIILIIL();
            C188577af c188577af = new C188577af();
            c188577af.LIZLLL = sharePanelViewModel.LJFF();
            c188577af.LJJLIIIJL = "long_press";
            c188577af.LJJLJ = C200017t7.LIZ(LJJLIIIJILLIZJL).getType();
            c188577af.LJJLIIIJ = LJJLIIIJILLIZJL.getUid();
            C78866UxK.LJIIZILJ(c188577af, LJJLIIIJILLIZJL);
            c188577af.LJJLIIIJJIZ = LJJLIIIJILLIZJL.getRequestId();
            c188577af.LJ("relation_type", LJJLIIIJILLIZJL.getFriendTypeStr(), InterfaceC1798974f.LIZ);
            c188577af.LJ("author_id", LJJLIIIJILLIZJL.getUid(), InterfaceC1798974f.LIZIZ);
            c188577af.LJIILIIL();
        }
    }
}

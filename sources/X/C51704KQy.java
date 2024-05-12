package X;

import com.ss.android.ugc.aweme.notice.api.bean.GuideOutPushParam;
import com.ss.android.ugc.aweme.notification.service.NoticeServiceImpl;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;

/* renamed from: X.KQy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51704KQy implements InterfaceC57288Me4 {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ C51698KQs LJLILLLLZI;

    @Override // X.InterfaceC57288Me4
    public final void onFollowFail(Exception exc) {
        C51698KQs c51698KQs = this.LJLILLLLZI;
        c51698KQs.LJLL = false;
        C57293Me9.LIZ(C27740Aue.LIZ(c51698KQs.LJLILLLLZI), C1A7.LJIIJ(exc));
        InterfaceC51702KQw interfaceC51702KQw = this.LJLILLLLZI.LJLJJLL;
        if (interfaceC51702KQw != null) {
            interfaceC51702KQw.onFollowFail(exc);
        }
    }

    @Override // X.InterfaceC57288Me4
    public final void onFollowSuccess(FollowStatus followStatus) {
        C51698KQs c51698KQs = this.LJLILLLLZI;
        c51698KQs.LJLL = false;
        int i = followStatus.followStatus;
        InterfaceC51701KQv interfaceC51701KQv = c51698KQs.LJLJI;
        if (interfaceC51701KQv != null && interfaceC51701KQv.getEnterFrom().equals("follow_request_page")) {
            if (i == 1 || i == 2 || i == 4) {
                NoticeServiceImpl.LJJJJJ().LJJJJI(this.LJLILLLLZI.LJLILLLLZI, new GuideOutPushParam("interaction", "notification_page", "", "follow", this.LJLIL));
            }
        }
    }

    @Override // X.InterfaceC57288Me4
    public final void onResponseSuccess(FollowStatus followStatus) {
        this.LJLILLLLZI.getClass();
    }

    public C51704KQy(C51698KQs c51698KQs, String str) {
        this.LJLILLLLZI = c51698KQs;
        this.LJLIL = str;
    }
}

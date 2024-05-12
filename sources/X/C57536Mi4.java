package X;

import com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.friends.model.SuperAccountList;
import com.ss.android.ugc.aweme.friends.model.UserWithAweme;
import java.util.ArrayList;

/* renamed from: X.Mi4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57536Mi4 extends I4X implements C8BT {
    public boolean LJLJJI;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C8BT
    public final void onSuccess() {
        String imprId;
        this.LJLJJI = false;
        EmptyGuideV2 emptyGuideV2 = (EmptyGuideV2) ((I4Y) this.LJLJI);
        SuperAccountList superAccountList = (SuperAccountList) ((AbstractC57537Mi5) ((InterfaceC62173Oaf) this.LJLILLLLZI)).mData;
        C73305Spp c73305Spp = emptyGuideV2.LJLJJI;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(8);
        }
        if (superAccountList == null || superAccountList.getUserList() == null || superAccountList.getUserList().size() < 1) {
            emptyGuideV2.LIZIZ();
            return;
        }
        LogPbBean logPbBean = superAccountList.logPb;
        if (logPbBean == null) {
            imprId = "";
        } else {
            imprId = logPbBean.getImprId();
        }
        emptyGuideV2.LJLL = imprId;
        ArrayList arrayList = new ArrayList();
        for (UserWithAweme userWithAweme : superAccountList.getUserList()) {
            if (userWithAweme != null && userWithAweme.getUser() != null && userWithAweme.getAweme() != null) {
                arrayList.add(userWithAweme);
            }
        }
        emptyGuideV2.LJIIIZ().setData(arrayList);
        emptyGuideV2.LJIIIZ().LJLJJI.LJZL = 0;
        emptyGuideV2.LJIIIZ().setOnItemOperationListener(new C57540Mi8(emptyGuideV2));
        emptyGuideV2.LJIJ();
        emptyGuideV2.LJIIIIZZ();
    }

    @Override // X.C8BT
    public final void onFailed(Exception exc) {
        this.LJLJJI = false;
        ((EmptyGuideV2) ((I4Y) this.LJLJI)).LJII(exc);
    }

    public C57536Mi4(C57538Mi6 c57538Mi6, EmptyGuideV2 emptyGuideV2) {
        super(c57538Mi6, emptyGuideV2);
        ((AbstractC57537Mi5) ((InterfaceC62173Oaf) this.LJLILLLLZI)).addNotifyListener(this);
    }
}

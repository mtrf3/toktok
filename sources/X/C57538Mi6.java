package X;

import com.ss.android.ugc.aweme.friends.model.SuperAccountList;
import com.ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.ss.android.ugc.aweme.social.api.RecommendUserApiService;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Mi6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57538Mi6 extends AbstractC57537Mi5<SuperAccountList> {
    public List<String> LJLIL;
    public final RecommendUserApiService LJLILLLLZI = RecommendUserApiService.LIZIZ;

    public final void LIZ() {
        this.LJLILLLLZI.recommendSuperAccount().LIZLLL(new C182587Eo(this.mHandler));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.ss.android.ugc.aweme.friends.model.SuperAccountList, T, java.lang.Object] */
    @Override // X.AbstractC57537Mi5
    public final void handleData(SuperAccountList superAccountList) {
        SuperAccountList superAccountList2 = superAccountList;
        int i = this.mQueryType;
        if (i == 1) {
            super.handleData(superAccountList2);
        } else if (i == 4) {
            T t = this.mData;
            if (t != 0) {
                List<UserWithAweme> userList = ((SuperAccountList) t).getUserList();
                userList.addAll(superAccountList2.getUserList());
                this.mData = superAccountList2;
                superAccountList2.userList = userList;
            } else {
                this.mData = superAccountList2;
            }
        }
        List<String> list = this.LJLIL;
        if (list == null) {
            this.LJLIL = new ArrayList();
        } else {
            ((ArrayList) list).clear();
        }
        if (superAccountList2 != 0 && superAccountList2.getUserList() != null) {
            for (UserWithAweme userWithAweme : superAccountList2.getUserList()) {
                ((ArrayList) this.LJLIL).add(userWithAweme.getUid());
            }
        }
    }
}

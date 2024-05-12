package X;

import com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2;
import com.ss.android.ugc.aweme.friends.model.SuperAccountList;
import com.ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: X.Mi8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57540Mi8 implements InterfaceC57527Mhv {
    public final /* synthetic */ EmptyGuideV2 LIZ;

    @Override // X.InterfaceC57527Mhv
    public final void LIZIZ() {
    }

    public C57540Mi8(EmptyGuideV2 emptyGuideV2) {
        this.LIZ = emptyGuideV2;
    }

    @Override // X.InterfaceC57527Mhv
    public final void LIZ(User user) {
        C78841Uwv.LJJIJIL(user, this.LIZ.LJLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC57527Mhv
    public final void LIZJ(User user) {
        InterfaceC62173Oaf interfaceC62173Oaf;
        AbstractC57537Mi5 abstractC57537Mi5;
        T t;
        I4X i4x = this.LIZ.LJLLI;
        if (i4x != null && (interfaceC62173Oaf = (InterfaceC62173Oaf) i4x.LJLILLLLZI) != null && (t = (abstractC57537Mi5 = (AbstractC57537Mi5) interfaceC62173Oaf).mData) != 0 && !((SuperAccountList) t).getUserList().isEmpty()) {
            List<UserWithAweme> userList = ((SuperAccountList) abstractC57537Mi5.mData).getUserList();
            userList.remove(user);
            ((SuperAccountList) abstractC57537Mi5.mData).userList = userList;
        }
    }

    @Override // X.InterfaceC57527Mhv
    public final void LIZLLL(User user) {
        if (user.getFollowStatus() == 0) {
            C78841Uwv.LJJIJLIJ(user);
        } else {
            C78841Uwv.LJJIJL(user);
        }
    }
}

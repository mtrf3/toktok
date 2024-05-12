package X;

import Y.ARunnableS11S0101000_7;
import com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2;
import com.ss.android.ugc.aweme.profile.model.RecommendCommonUserModel;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.Mi3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57535Mi3 implements InterfaceC57527Mhv {
    public final /* synthetic */ EmptyGuideV2 LIZ;

    @Override // X.InterfaceC57527Mhv
    public final void LIZIZ() {
        if (((RBX) HG3.LJIILL()).isLogin()) {
            I4X i4x = this.LIZ.LJLLI;
            ((RecommendCommonUserModel) ((InterfaceC62173Oaf) i4x.LJLILLLLZI)).loadMore(30, ((RBX) HG3.LJIILL()).getCurUserId(), 2, 0, C57460Mgq.LIZ(), 2, null, null);
            return;
        }
        this.LIZ.LJLJJL.post(new ARunnableS11S0101000_7(5, this, 11));
    }

    public C57535Mi3(EmptyGuideV2 emptyGuideV2) {
        this.LIZ = emptyGuideV2;
    }

    @Override // X.InterfaceC57527Mhv
    public final void LIZ(User user) {
        C78841Uwv.LJJIJIL(user, this.LIZ.LJLL);
    }

    @Override // X.InterfaceC57527Mhv
    public final void LIZJ(User user) {
        InterfaceC62173Oaf interfaceC62173Oaf;
        I4X i4x = this.LIZ.LJLLI;
        if (i4x != null && (interfaceC62173Oaf = (InterfaceC62173Oaf) i4x.LJLILLLLZI) != null) {
            ((RecommendCommonUserModel) interfaceC62173Oaf).removeData(user);
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

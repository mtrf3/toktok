package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.relation.feed.TTRecUserBigCardViewModel;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel;
import fjb.a;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS175S0100000_9;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.feed.FriendsTabRecUserBigCardController$fetchRecUserData$1", f = "FriendsTabRecUserBigCardController.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.MjR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57621MjR extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C57619MjP LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57621MjR(C57619MjP c57619MjP, InterfaceC67352kd<? super C57621MjR> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c57619MjP;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C57621MjR(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C141335gf.LIZJ(obj);
        C57619MjP c57619MjP = this.LJLIL;
        c57619MjP.LIZJ = false;
        if (!C57619MjP.LIZJ() || (!C53576L0y.LIZJ() ? c57619MjP.LIZ.gv0() : c57619MjP.LIZIZ.mv0("homepage_friends"))) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            C221018lt.LJFF("TTRecUserFriendsTabController", "[fetchRecUserData] is not match fetch condition");
            return C76800UCe.LIZ;
        }
        C221018lt.LJFF("TTRecUserFriendsTabController", "[fetchRecUserData start");
        if (C53576L0y.LIZJ()) {
            RecSwipeViewModel recSwipeViewModel = this.LJLIL.LIZIZ;
            recSwipeViewModel.getClass();
            recSwipeViewModel.withState(new AqS175S0100000_9(recSwipeViewModel, 603));
        } else {
            TTRecUserBigCardViewModel tTRecUserBigCardViewModel = this.LJLIL.LIZ;
            tTRecUserBigCardViewModel.hv0().reset();
            ((ArrayList) tTRecUserBigCardViewModel.LJLIL).clear();
            tTRecUserBigCardViewModel.LJLJI = null;
            tTRecUserBigCardViewModel.LJLJJI = 0;
            tTRecUserBigCardViewModel.LJLJJL = 0;
            XKX.LIZLLL(ViewModelKt.getViewModelScope(tTRecUserBigCardViewModel), C36636EZk.LIZ, null, new C57631Mjb(tTRecUserBigCardViewModel, null), 2);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

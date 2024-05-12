package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageMainSectionVM;
import com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageRootVM;
import java.util.List;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.Mbw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57156Mbw implements InterfaceC57910Mo6 {
    public final /* synthetic */ C57763Mlj LJLIL;

    @Override // X.InterfaceC57910Mo6
    public final void kR(AbstractC57828Mmm<?> abstractC57828Mmm) {
    }

    public C57156Mbw(C57763Mlj c57763Mlj) {
        this.LJLIL = c57763Mlj;
    }

    @Override // X.InterfaceC57910Mo6
    public final void ww(C57778Mly state) {
        o.LJIIIZ(state, "state");
        FriendsEmptyPageRootVM friendsEmptyPageRootVM = this.LJLIL.LJLJJL;
        if (friendsEmptyPageRootVM != null) {
            EnumC58046MqI enumC58046MqI = friendsEmptyPageRootVM.LJLJLLL;
            if (enumC58046MqI != null) {
                AbstractC72932td<C223208pQ> abstractC72932td = state.LIZ;
                AbstractC72932td<List<InterfaceC57784Mm4>> abstractC72932td2 = state.LIZJ;
                if ((abstractC72932td instanceof C72912tb) && (abstractC72932td2 instanceof C72912tb)) {
                    friendsEmptyPageRootVM.LJLJLLL = null;
                    if (state.LIZJ()) {
                        friendsEmptyPageRootVM.iv0(new AqS175S0100000_9(enumC58046MqI, 423));
                    }
                }
            }
            friendsEmptyPageRootVM.LJLJL = state;
            FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM = friendsEmptyPageRootVM.LJLILLLLZI;
            if (friendsEmptyPageMainSectionVM != null) {
                XKX.LIZLLL(friendsEmptyPageMainSectionVM.LJLIL, null, null, new LSS(state, friendsEmptyPageMainSectionVM, null), 3);
            }
            friendsEmptyPageRootVM.iv0(new AqS175S0100000_9(state, 424));
            return;
        }
        o.LJIJI("emptyPageRootVM");
        throw null;
    }

    @Override // X.InterfaceC57910Mo6
    public final void LJLZ(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
    }
}

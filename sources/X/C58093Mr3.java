package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Mr3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58093Mr3 implements InterfaceC57910Mo6 {
    public static final /* synthetic */ int LJLJLJ = 0;
    public final boolean LJLIL;
    public final InterfaceC57760Mlg LJLILLLLZI;
    public final int LJLJI;
    public final N2Y LJLJJI;
    public boolean LJLJJL;
    public InterfaceC88472Yns<? super Integer, C76800UCe> LJLJJLL;
    public AbstractC57781Mm1 LJLJL;

    public final AbstractC57781Mm1 LIZ() {
        AbstractC57781Mm1 abstractC57781Mm1 = this.LJLJL;
        if (abstractC57781Mm1 != null) {
            return abstractC57781Mm1;
        }
        o.LJIJI("sectionAdapter");
        throw null;
    }

    public final void LIZIZ(InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        C57778Mly currentState = ((C57780Mm0) LIZ()).getCurrentState();
        AbstractC72932td<C223208pQ> abstractC72932td = currentState.LIZ;
        AbstractC72932td<List<InterfaceC57784Mm4>> abstractC72932td2 = currentState.LIZJ;
        if ((abstractC72932td instanceof C72912tb) && (abstractC72932td2 instanceof C72912tb)) {
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(Integer.valueOf(((List) ((C72912tb) abstractC72932td2).LIZ).size()));
            }
        } else {
            if (interfaceC88472Yns != null) {
                this.LJLJJLL = interfaceC88472Yns;
            }
            if (abstractC72932td instanceof C72922tc) {
                return;
            }
            ((C57780Mm0) LIZ()).LJLJLJ(false);
        }
    }

    @Override // X.InterfaceC57910Mo6
    public final void kR(AbstractC57828Mmm<?> abstractC57828Mmm) {
        if ((abstractC57828Mmm instanceof C57825Mmj) && (abstractC57828Mmm.LIZ instanceof RecUser)) {
            this.LJLJJI.getClass();
            N2Y.LIZ().storeInt("following_exp_ff_c", 0);
            N2Y.LIZ().storeLong("following_h_ff_t", -1L);
        }
    }

    @Override // X.InterfaceC57910Mo6
    public final void ww(C57778Mly state) {
        InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns;
        o.LJIIIZ(state, "state");
        if ((state.LIZ instanceof C72912tb) && (state.LIZJ instanceof C72912tb) && (interfaceC88472Yns = this.LJLJJLL) != null) {
            interfaceC88472Yns.invoke(Integer.valueOf(state.LIZLLL));
        }
    }

    public C58093Mr3(boolean z, InterfaceC57760Mlg interfaceC57760Mlg) {
        int i;
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        if (curUser != null) {
            i = curUser.getFollowingCount();
        } else {
            i = 0;
        }
        N2Y n2y = N2Y.LIZ;
        this.LJLIL = z;
        this.LJLILLLLZI = interfaceC57760Mlg;
        this.LJLJI = i;
        this.LJLJJI = n2y;
        this.LJLJJL = i < 20;
    }

    @Override // X.InterfaceC57910Mo6
    public final void LJLZ(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
    }
}

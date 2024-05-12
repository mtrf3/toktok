package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.relation.usercard.ability.AuthCardListScopeAbility;
import java.util.List;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MpV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57997MpV implements InterfaceC57910Mo6 {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ AuthCardListScopeAbility LJLILLLLZI;
    public final /* synthetic */ EnumC58046MqI LJLJI;

    @Override // X.InterfaceC57910Mo6
    public final void kR(AbstractC57828Mmm<?> abstractC57828Mmm) {
    }

    @Override // X.InterfaceC57910Mo6
    public final void ww(C57778Mly state) {
        o.LJIIIZ(state, "state");
        AbstractC72932td<C223208pQ> abstractC72932td = state.LIZ;
        AbstractC72932td<List<InterfaceC57784Mm4>> abstractC72932td2 = state.LIZJ;
        if ((abstractC72932td instanceof C72912tb) && (abstractC72932td2 instanceof C72912tb)) {
            if (state.LIZJ() && this.LJLIL) {
                AuthCardListScopeAbility authCardListScopeAbility = this.LJLILLLLZI;
                EnumC58046MqI enumC58046MqI = this.LJLJI;
                authCardListScopeAbility.getClass();
                C27484AqW.LJ(new AqS156S0200000_9(authCardListScopeAbility, enumC58046MqI, 74));
            }
            this.LJLILLLLZI.LJLJJI.K8(this);
        }
    }

    @Override // X.InterfaceC57910Mo6
    public final void LJLZ(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
    }

    public C57997MpV(boolean z, AuthCardListScopeAbility authCardListScopeAbility, EnumC58046MqI enumC58046MqI) {
        this.LJLIL = z;
        this.LJLILLLLZI = authCardListScopeAbility;
        this.LJLJI = enumC58046MqI;
    }
}

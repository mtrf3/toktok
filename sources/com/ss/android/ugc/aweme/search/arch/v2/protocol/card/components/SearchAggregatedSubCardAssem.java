package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components;

import X.C2L4;
import X.C3C8;
import X.C48905JHh;
import X.C49187JSd;
import X.C49587Jd9;
import X.C50322Jp0;
import X.C55096Ljo;
import X.C76965UIn;
import X.InterfaceC46334IGk;
import X.InterfaceC49137JQf;
import X.InterfaceC49148JQq;
import X.InterfaceC55235Lm3;
import X.InterfaceC57784Mm4;
import X.JMS;
import X.JN8;
import X.JNY;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.bytedance.provider.vm.ScopeViewModel;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.scope.SearchPlayerScope;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public abstract class SearchAggregatedSubCardAssem<ASSEM extends ReusedUISlotAssem<? extends C3C8>, T extends InterfaceC57784Mm4> extends AssemPowerCell<ASSEM, T> implements InterfaceC49148JQq, C2L4 {
    public final /* synthetic */ JNY LJLJL = new JNY(null);

    @Override // X.InterfaceC49148JQq
    public final Boolean LLFFF() {
        this.LJLJL.getClass();
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final boolean LLIIII() {
        return this.LJLJL.LLIIII();
    }

    @Override // X.InterfaceC49148JQq
    public final void LLLLLIL() {
        this.LJLJL.LLLLLIL();
    }

    public abstract ASSEM P();

    @Override // X.InterfaceC49148JQq
    public final View getDetectView() {
        return this.LJLJL.getDetectView();
    }

    @Override // X.InterfaceC49148JQq
    public final InterfaceC46334IGk getPreload() {
        this.LJLJL.getClass();
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final boolean isPlaying() {
        return this.LJLJL.isPlaying();
    }

    @Override // X.InterfaceC49148JQq
    public final void x4(C49187JSd listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJL.x4(listener);
    }

    @Override // X.InterfaceC49148JQq
    public final void y(long j) {
        this.LJLJL.y(j);
    }

    @Override // X.InterfaceC49148JQq
    public final void z8(C49187JSd listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJL.z8(listener);
    }

    @Override // X.InterfaceC49148JQq
    public final View LLLLZLLIL() {
        JNY jny = this.LJLJL;
        jny.getClass();
        return C48905JHh.LIZ(jny);
    }

    @Override // X.InterfaceC49148JQq
    public final InterfaceC49137JQf getPriority() {
        return this.LJLJL.LJLJI;
    }

    @Override // X.C2L4
    public List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(SearchPlayerScope.class);
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ASSEM L() {
        return P();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        ISearchContextAbility iSearchContextAbility;
        JMS jms;
        super.onViewAttachedToWindow();
        InterfaceC55235Lm3 gv0 = ((ScopeViewModel) new ViewModelProvider(getViewModelStoreOwner()).get(ScopeViewModel.class)).gv0("assem_logic_scope");
        if (gv0 == null || (iSearchContextAbility = (ISearchContextAbility) C55096Ljo.LIZ(gv0, ISearchContextAbility.class, null)) == null) {
            return;
        }
        JN8 jn8 = new JN8(null);
        C50322Jp0 LIZJ = iSearchContextAbility.If().LIZJ();
        jn8.LJJIFFI(LIZJ.LJLJI);
        jn8.LJIIZILJ("search_keyword", LIZJ.LJLJJI);
        C49587Jd9 LIZJ2 = iSearchContextAbility.ut0().LIZJ();
        jn8.LJIJI(LIZJ2.LJLJI);
        jn8.LJJI(Integer.valueOf(LIZJ2.LJLJJI));
        T item = getItem();
        if ((item instanceof JMS) && (jms = (JMS) item) != null) {
            jn8.LJIILLIIL(jms.LLLF().LIZJ());
        }
        jn8.LJIILIIL();
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final void N(int i, T t) {
        super.N(i, t);
        InterfaceC55235Lm3 LJIJ = C55096Ljo.LJIJ(this);
        JNY jny = this.LJLJL;
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = null;
        if (LJIJ != null) {
            jny.getClass();
            searchServiceCenter$AutoPlayAbility = (SearchServiceCenter$AutoPlayAbility) C55096Ljo.LIZ(LJIJ, SearchServiceCenter$AutoPlayAbility.class, null);
        }
        jny.LJLILLLLZI = searchServiceCenter$AutoPlayAbility;
    }
}

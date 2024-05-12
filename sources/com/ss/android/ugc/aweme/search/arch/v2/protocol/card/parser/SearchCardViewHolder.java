package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser;

import X.AbstractC50059Jkl;
import X.ActivityC45651qj;
import X.C212988Xm;
import X.C221108m2;
import X.C3C8;
import X.C48905JHh;
import X.C49187JSd;
import X.C49587Jd9;
import X.C49589JdB;
import X.C49623Jdj;
import X.C49651JeB;
import X.C49653JeD;
import X.C49657JeH;
import X.C50322Jp0;
import X.C50427Jqh;
import X.C50428Jqi;
import X.C50429Jqj;
import X.C50449Jr3;
import X.C50468JrM;
import X.C50485Jrd;
import X.C50949Jz7;
import X.C55096Ljo;
import X.C55230Lly;
import X.C62822Ol8;
import X.C79234V7u;
import X.C8XZ;
import X.C8YF;
import X.InterfaceC212978Xl;
import X.InterfaceC214448bI;
import X.InterfaceC46334IGk;
import X.InterfaceC49025JLx;
import X.InterfaceC49057JNd;
import X.InterfaceC49137JQf;
import X.InterfaceC49148JQq;
import X.InterfaceC49871Jhj;
import X.InterfaceC55235Lm3;
import X.JNY;
import X.JZ4;
import X.KK7;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ext_power_list.AssemReusedDispatcher;
import com.bytedance.ext_power_list.AssemReusedVHContainer;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.autoplay.SearchCardAutoplayableViewHolder;
import com.ss.android.ugc.aweme.search.arch.v2.services.signal.impl.SearchContextAbilityImpl;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.search.source.neo.model.CreationSearchSignalState;
import com.ss.android.ugc.aweme.search.source.neo.model.SearchBehaviorSignalState;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS155S0200000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchCardViewHolder extends SearchCardAutoplayableViewHolder implements InterfaceC49148JQq, ISearchContextAbility, C8XZ<SearchCardViewHolder, InterfaceC49025JLx> {
    public static final /* synthetic */ int LJLJJLL = 0;
    public final ISearchCardProtocol<InterfaceC49871Jhj> LJLIL;
    public final /* synthetic */ JNY LJLILLLLZI;
    public final /* synthetic */ SearchContextAbilityImpl LJLJI;
    public final /* synthetic */ AssemReusedVHContainer<SearchCardViewHolder, InterfaceC49025JLx> LJLJJI;
    public final C62822Ol8 LJLJJL;

    public SearchCardViewHolder() {
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final AbstractC50059Jkl<C50429Jqj> Bw() {
        return this.LJLJI.Bw();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final AbstractC50059Jkl<JZ4> CB() {
        return this.LJLJI.CB();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final AbstractC50059Jkl<C49657JeH> Gb() {
        return this.LJLJI.Gb();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final AbstractC50059Jkl<C49589JdB> IO() {
        return this.LJLJI.IO();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final AbstractC50059Jkl<C50322Jp0> If() {
        return this.LJLJI.If();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final AbstractC50059Jkl<C49651JeB> Im0() {
        return this.LJLJI.Im0();
    }

    @Override // X.InterfaceC49148JQq
    public final Boolean LLFFF() {
        this.LJLILLLLZI.getClass();
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final boolean LLIIII() {
        return this.LJLILLLLZI.LLIIII();
    }

    @Override // X.InterfaceC49148JQq
    public final void LLLLLIL() {
        this.LJLILLLLZI.LLLLLIL();
    }

    @Override // X.C8XZ
    public final AssemReusedDispatcher<SearchCardViewHolder, InterfaceC49025JLx> LP() {
        return this.LJLJJI.LP();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final AbstractC50059Jkl<C50428Jqi> Te() {
        return this.LJLJI.Te();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final AbstractC50059Jkl<C49589JdB> Yh() {
        return this.LJLJI.Yh();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final AbstractC50059Jkl<C49623Jdj> cS() {
        return this.LJLJI.cS();
    }

    @Override // X.C8VZ
    public final InterfaceC214448bI cq0() {
        return this.LJLJJI.cq0();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final AbstractC50059Jkl<C50427Jqh> cs() {
        return this.LJLJI.cs();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final AbstractC50059Jkl<CreationSearchSignalState> fE() {
        return this.LJLJI.fE();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final AbstractC50059Jkl<C50449Jr3> gL() {
        return this.LJLJI.gL();
    }

    @Override // X.InterfaceC212998Xn
    public final InterfaceC212978Xl<SearchCardViewHolder, InterfaceC49025JLx> getChild() {
        return this.LJLJJI.getChild();
    }

    @Override // X.InterfaceC49148JQq
    public final View getDetectView() {
        return this.LJLILLLLZI.getDetectView();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LJLJJI.getLifecycle();
    }

    @Override // X.InterfaceC49148JQq
    public final InterfaceC46334IGk getPreload() {
        this.LJLILLLLZI.getClass();
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.autoplay.SearchCardAutoplayableViewHolder, X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        ArrayList arrayList = new ArrayList(super.getScopeDefine());
        arrayList.add(SearchCardScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC55100Ljs
    public final ViewModelStoreOwner getViewModelStoreOwner() {
        return this.LJLJJI.getViewModelStoreOwner();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final AbstractC50059Jkl<C50485Jrd> iL() {
        return this.LJLJI.iL();
    }

    @Override // X.InterfaceC49148JQq
    public final boolean isPlaying() {
        return this.LJLILLLLZI.isPlaying();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final void j4(KK7 kk7) {
        this.LJLJI.j4(kk7);
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final AbstractC50059Jkl<SearchBehaviorSignalState> kO() {
        return this.LJLJI.kO();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final AbstractC50059Jkl<C49653JeD> le0() {
        return this.LJLJI.le0();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner p0, Lifecycle.Event p1) {
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        this.LJLJJI.onStateChanged(p0, p1);
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final AbstractC50059Jkl<C50468JrM> pE() {
        return this.LJLJI.pE();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final AbstractC50059Jkl<C49587Jd9> ut0() {
        return this.LJLJI.ut0();
    }

    @Override // X.InterfaceC49148JQq
    public final void x4(C49187JSd listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLILLLLZI.x4(listener);
    }

    @Override // X.InterfaceC49148JQq
    public final void y(long j) {
        this.LJLILLLLZI.y(j);
    }

    @Override // X.InterfaceC49148JQq
    public final void z8(C49187JSd listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLILLLLZI.z8(listener);
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility
    public final AbstractC50059Jkl<C50949Jz7> zp0() {
        return this.LJLJI.zp0();
    }

    @Override // X.C8VZ
    public final LifecycleOwner GW() {
        return this.LJLJJI.LJLLLLLL;
    }

    public final void LJJJJIZL() {
        this.LJLJJI.LJLIIIL();
    }

    @Override // X.InterfaceC49148JQq
    public final View LLLLZLLIL() {
        JNY jny = this.LJLILLLLZI;
        jny.getClass();
        return C48905JHh.LIZ(jny);
    }

    @Override // X.C8XZ
    public final ViewModelStore Yb() {
        return this.LJLJJI.LJLL;
    }

    @Override // X.C8XZ
    public final ReusedUIAssem<?> Yz() {
        return this.LJLJJI.LJLJLLL;
    }

    @Override // X.C8VZ
    public final ActivityC45651qj getActivity() {
        return this.LJLJJI.LJLLL;
    }

    @Override // X.C8VZ
    public final View getContainerView() {
        return this.LJLJJI.LJLLJ;
    }

    @Override // X.InterfaceC55100Ljs
    public final InterfaceC55235Lm3 getParentScope() {
        Fragment LJIIIZ = C79234V7u.LJIIIZ(this.itemView);
        if (LJIIIZ == null) {
            return null;
        }
        return C55230Lly.LIZJ(LJIIIZ, null);
    }

    @Override // X.InterfaceC49148JQq
    public final InterfaceC49137JQf getPriority() {
        return this.LJLILLLLZI.LJLJI;
    }

    @Override // X.InterfaceC212998Xn
    public final C212988Xm<SearchCardViewHolder, InterfaceC49025JLx> getProxy() {
        return this.LJLJJI.LJLJL;
    }

    @Override // X.InterfaceC212998Xn
    public final void setProxy(C212988Xm<SearchCardViewHolder, InterfaceC49025JLx> c212988Xm) {
        this.LJLJJI.LJLJL = c212988Xm;
    }

    public final void L(int i, InterfaceC49871Jhj interfaceC49871Jhj) {
        InterfaceC55235Lm3 LJIJ = C55096Ljo.LJIJ(this);
        InterfaceC49025JLx LLLLLLJ = this.LJLIL.LLLLLLJ(interfaceC49871Jhj);
        ((InterfaceC49057JNd) this.LJLJJL.getValue()).LIZ(LJIJ, interfaceC49871Jhj, LLLLLLJ);
        this.LJLJJI.LJJZ(i, LLLLLLJ);
        JNY jny = this.LJLILLLLZI;
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = null;
        if (LJIJ != null) {
            jny.getClass();
            searchServiceCenter$AutoPlayAbility = (SearchServiceCenter$AutoPlayAbility) C55096Ljo.LIZ(LJIJ, SearchServiceCenter$AutoPlayAbility.class, null);
        }
        jny.LJLILLLLZI = searchServiceCenter$AutoPlayAbility;
    }

    public SearchCardViewHolder(View view, LifecycleOwner lifecycleOwner, C8YF c8yf, ISearchCardProtocol iSearchCardProtocol) {
        super(view);
        this.LJLIL = iSearchCardProtocol;
        this.LJLILLLLZI = new JNY(view);
        this.LJLJI = new SearchContextAbilityImpl(1, view, lifecycleOwner, null);
        AssemReusedVHContainer<SearchCardViewHolder, InterfaceC49025JLx> assemReusedVHContainer = new AssemReusedVHContainer<>(lifecycleOwner, c8yf, view);
        this.LJLJJI = assemReusedVHContainer;
        this.LJLJJL = C221108m2.LIZIZ(new AqS155S0200000_8(this, view, 4));
        ReusedUIAssem<? extends C3C8> assem = iSearchCardProtocol.k3();
        View findViewById = view.findViewById(R.id.jej);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.search_card_root)");
        o.LJIIIZ(assem, "assem");
        assemReusedVHContainer.LJJLL(assem, findViewById, this);
    }
}

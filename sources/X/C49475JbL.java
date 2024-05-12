package X;

import X.C16330kX;
import X.C49187JSd;
import X.C49288JWa;
import X.C49475JbL;
import X.C55096Ljo;
import X.C76800UCe;
import X.InterfaceC49479JbP;
import X.InterfaceC49482JbS;
import X.InterfaceC55100Ljs;
import X.InterfaceC55235Lm3;
import X.InterfaceC65784Pro;
import X.ViewOnLayoutChangeListenerC49474JbK;
import Y.IDCListenerS245S0100000_8;
import Y.IDrS47S0100000_8;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.scope.SearchPlayerScope;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.o;

/* renamed from: X.JbL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49475JbL {
    public static final /* synthetic */ int LJI = 0;
    public final RecyclerView LIZ;
    public final View LIZIZ;
    public final InterfaceC49479JbP LIZJ;
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C49481JbR.LJLIL);
    public SearchServiceCenter$AutoPlayAbility LJ;
    public boolean LJFF;

    public final HashMap<InterfaceC49482JbS, SearchServiceCenter$AutoPlayAbility> LIZ() {
        return (HashMap) this.LIZLLL.getValue();
    }

    public final void LIZIZ(SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility) {
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility2;
        if (!this.LJFF) {
            this.LJ = searchServiceCenter$AutoPlayAbility;
            return;
        }
        if (!o.LJ(this.LJ, searchServiceCenter$AutoPlayAbility) && (searchServiceCenter$AutoPlayAbility2 = this.LJ) != null) {
            searchServiceCenter$AutoPlayAbility2.Wc();
        }
        if (!searchServiceCenter$AutoPlayAbility.isPlaying()) {
            searchServiceCenter$AutoPlayAbility.kV();
        }
        this.LJ = searchServiceCenter$AutoPlayAbility;
    }

    public C49475JbL(ReusedUIAssem reusedUIAssem, SYL syl, View view, InterfaceC49479JbP interfaceC49479JbP) {
        this.LIZ = syl;
        this.LIZIZ = view;
        this.LIZJ = interfaceC49479JbP;
        C55096Ljo.LJIILIIL(reusedUIAssem, SearchPlayerScope.class, new SearchServiceCenter$AutoPlayAbility() { // from class: com.ss.android.ugc.aweme.search.arch.v2.protocol.card.utils.SearchNestedAutoplayCardHelper$1
            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final View m8() {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void x4(C49187JSd listener) {
                o.LJIIIZ(listener, "listener");
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void z8(C49187JSd listener) {
                o.LJIIIZ(listener, "listener");
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final boolean LLIIII() {
                if (C49475JbL.this.LIZ().isEmpty()) {
                    return true;
                }
                Collection<SearchServiceCenter$AutoPlayAbility> values = C49475JbL.this.LIZ().values();
                o.LJIIIIZZ(values, "attachedChildAbilityMap.values");
                if (!values.isEmpty()) {
                    Iterator<SearchServiceCenter$AutoPlayAbility> it = values.iterator();
                    while (it.hasNext()) {
                        if (it.next().LLIIII()) {
                            return true;
                        }
                    }
                }
                return false;
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void Wc() {
                C49475JbL c49475JbL = C49475JbL.this;
                c49475JbL.LJFF = false;
                SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = c49475JbL.LJ;
                if (searchServiceCenter$AutoPlayAbility != null) {
                    searchServiceCenter$AutoPlayAbility.Wc();
                }
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final View getDetectView() {
                return C49475JbL.this.LIZIZ;
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final boolean isPlaying() {
                SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = C49475JbL.this.LJ;
                if (searchServiceCenter$AutoPlayAbility != null) {
                    return searchServiceCenter$AutoPlayAbility.isPlaying();
                }
                return false;
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void kV() {
                SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility;
                C49475JbL c49475JbL = C49475JbL.this;
                c49475JbL.LJFF = true;
                SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility2 = c49475JbL.LJ;
                if (searchServiceCenter$AutoPlayAbility2 == null) {
                    InterfaceC49479JbP interfaceC49479JbP2 = c49475JbL.LIZJ;
                    RecyclerView recyclerView = c49475JbL.LIZ;
                    Set<InterfaceC49482JbS> keySet = c49475JbL.LIZ().keySet();
                    o.LJIIIIZZ(keySet, "attachedChildAbilityMap.keys");
                    InterfaceC49482JbS LIZIZ = interfaceC49479JbP2.LIZIZ(recyclerView, 0, keySet);
                    if (LIZIZ != null && (searchServiceCenter$AutoPlayAbility = C49475JbL.this.LIZ().get(LIZIZ)) != null) {
                        C49475JbL.this.LIZIZ(searchServiceCenter$AutoPlayAbility);
                        return;
                    }
                    return;
                }
                searchServiceCenter$AutoPlayAbility2.kV();
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void i40(int i) {
                Set<InterfaceC49482JbS> keySet = C49475JbL.this.LIZ().keySet();
                o.LJIIIIZZ(keySet, "attachedChildAbilityMap.keys");
                for (InterfaceC49482JbS interfaceC49482JbS : keySet) {
                    if (interfaceC49482JbS.getPosition() == i) {
                        if (interfaceC49482JbS != null) {
                            C49475JbL c49475JbL = C49475JbL.this;
                            SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = c49475JbL.LIZ().get(interfaceC49482JbS);
                            if (searchServiceCenter$AutoPlayAbility != null) {
                                c49475JbL.LIZIZ(searchServiceCenter$AutoPlayAbility);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void tO(C49288JWa childTask, InterfaceC65784Pro<C76800UCe> locateFinishCallback) {
                InterfaceC55100Ljs interfaceC55100Ljs;
                InterfaceC55235Lm3 LJIJ;
                o.LJIIIZ(childTask, "childTask");
                o.LJIIIZ(locateFinishCallback, "locateFinishCallback");
                C49475JbL.this.LIZ.LJLI(childTask.LIZ);
                C49475JbL c49475JbL = C49475JbL.this;
                RecyclerView recyclerView = c49475JbL.LIZ;
                if (C16330kX.LIZJ(recyclerView) && !recyclerView.isLayoutRequested()) {
                    Object LJJIZ = c49475JbL.LIZ.LJJIZ(childTask.LIZ);
                    SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = null;
                    if (LJJIZ != null && (LJJIZ instanceof InterfaceC55100Ljs) && (interfaceC55100Ljs = (InterfaceC55100Ljs) LJJIZ) != null && (LJIJ = C55096Ljo.LJIJ(interfaceC55100Ljs)) != null) {
                        searchServiceCenter$AutoPlayAbility = (SearchServiceCenter$AutoPlayAbility) C55096Ljo.LIZ(LJIJ, SearchServiceCenter$AutoPlayAbility.class, null);
                    }
                    c49475JbL.LJ = searchServiceCenter$AutoPlayAbility;
                    if (searchServiceCenter$AutoPlayAbility == null) {
                        return;
                    }
                    C49288JWa c49288JWa = childTask.LIZIZ;
                    if (c49288JWa != null) {
                        searchServiceCenter$AutoPlayAbility.tO(c49288JWa, locateFinishCallback);
                        return;
                    } else {
                        locateFinishCallback.invoke();
                        return;
                    }
                }
                recyclerView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC49474JbK(c49475JbL, childTask, locateFinishCallback));
            }
        }, SearchServiceCenter$AutoPlayAbility.class);
        syl.LJIIIZ(new C49476JbM(this));
        syl.LJIIJJI(new IDrS47S0100000_8(this, 16));
        syl.addOnAttachStateChangeListener(new IDCListenerS245S0100000_8(this, 23));
    }
}

package X;

import Y.AObserverS80S0100000_12;
import Y.AfS64S0100000_12;
import Y.IDrS50S0100000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.IDqS436S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class TL5<DATA> implements InterfaceC74488TLg<DATA> {
    public final TL7 LIZ;
    public View LIZIZ;
    public RecyclerView LIZJ;
    public TLG<TEN> LIZLLL;
    public AbstractC45801HyH<C157166Eu> LJ;
    public TL8 LJFF;
    public java.util.Map<DATA, ? extends OSZ<? extends TEA, Integer>> LJI;
    public final C73893SzJ LJII;
    public final C73893SzJ LJIIIIZZ;
    public final C73893SzJ LJIIIZ;
    public final C73893SzJ LJIIJ;
    public final C73893SzJ LJIIJJI;
    public final C73893SzJ LJIIL;
    public final C73893SzJ LJIILIIL;
    public final C73893SzJ LJIILJJIL;
    public final C73893SzJ LJIILL;
    public final C73893SzJ LJIILLIIL;
    public int LJIIZILJ;
    public String LJIJ;
    public boolean LJIJI;
    public final C73318Sq2 LJIJJ;
    public final IDqS436S0100000_12 LJIJJLI;
    public final C5H3 LJIL;
    public boolean LJJ;
    public AqS162S0100000_12 LJJI;
    public final Context LJJIFFI;
    public final LifecycleOwner LJJII;
    public final TL9<DATA> LJJIII;
    public final TLD<DATA> LJJIIJ;
    public final ViewGroup LJJIIJZLJL;
    public final int LJJIIZ;
    public final boolean LJJIIZI;
    public final boolean LJJIJ;
    public final boolean LJJIJIIJI;
    public final boolean LJJIJIIJIL;

    public abstract void LJII(RecyclerView.ViewHolder viewHolder, int i, DATA data, TEA tea, Integer num);

    public abstract RecyclerView.ViewHolder LJIIIZ(ViewGroup viewGroup, InterfaceC88473Ynt interfaceC88473Ynt);

    public AbstractC030309z LJJIII() {
        return null;
    }

    @Override // X.InterfaceC74488TLg
    public final View LJFF() {
        View view = this.LIZIZ;
        if (view != null) {
            return view;
        }
        o.LJIJI("contentView");
        throw null;
    }

    public final RecyclerView LJIIL() {
        RecyclerView recyclerView = this.LIZJ;
        if (recyclerView != null) {
            return recyclerView;
        }
        o.LJIJI("recyclerView");
        throw null;
    }

    public void LJIILL() {
        View LJJIFFI = LJJIFFI(this.LJJIIJZLJL);
        this.LIZIZ = LJJIFFI;
        if (LJJIFFI != null) {
            RecyclerView LJJIIJZLJL = LJJIIJZLJL(LJJIFFI);
            InterfaceC88472Yns<? super RecyclerView, C76800UCe> interfaceC88472Yns = this.LIZ.LIZJ;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(LJJIIJZLJL);
            }
            this.LIZJ = LJJIIJZLJL;
            View view = this.LIZIZ;
            if (view != null) {
                TEW LJJIIJ = LJJIIJ(view);
                InterfaceC88471Ynr<? super TLG<TEN>, ? super InterfaceC65784Pro<C76800UCe>, C76800UCe> interfaceC88471Ynr = this.LIZ.LIZIZ;
                if (interfaceC88471Ynr != null) {
                    interfaceC88471Ynr.invoke(LJJIIJ, new AqS162S0100000_12(this, 981));
                }
                this.LIZLLL = LJJIIJ;
                this.LJ = LJJII();
                RecyclerView recyclerView = this.LIZJ;
                if (recyclerView != null) {
                    recyclerView.setAdapter(LJJI());
                    AbstractC030309z LJJIII = LJJIII();
                    if (LJJIII != null) {
                        RecyclerView recyclerView2 = this.LIZJ;
                        if (recyclerView2 != null) {
                            recyclerView2.LJII(LJJIII, -1);
                            return;
                        } else {
                            o.LJIJI("recyclerView");
                            throw null;
                        }
                    }
                    return;
                }
                o.LJIJI("recyclerView");
                throw null;
            }
            o.LJIJI("contentView");
            throw null;
        }
        o.LJIJI("contentView");
        throw null;
    }

    public final C73426Srm LJIIZILJ() {
        return new C73426Srm(this.LJIILJJIL.LJ(500L, TimeUnit.MILLISECONDS).LJJIFFI(C1A7.LJLJI));
    }

    public final C73426Srm LJIJI() {
        C73893SzJ c73893SzJ = this.LJIIJJI;
        return IA2.LIZ(c73893SzJ, c73893SzJ);
    }

    public final C73426Srm LJIJJ() {
        C73893SzJ c73893SzJ = this.LJIIIZ;
        return IA2.LIZ(c73893SzJ, c73893SzJ);
    }

    public final C73426Srm LJIJJLI() {
        C73893SzJ c73893SzJ = this.LJIIIIZZ;
        return IA2.LIZ(c73893SzJ, c73893SzJ);
    }

    public final void LJIL() {
        TL9<DATA> tl9 = this.LJJIII;
        if (tl9 != null) {
            tl9.u10();
        }
        this.LJIILL.onNext(Long.valueOf(System.currentTimeMillis()));
    }

    public final void LJJ() {
        if (this.LJJIJIIJI) {
            RecyclerView recyclerView = this.LIZJ;
            if (recyclerView != null) {
                C0A2 layoutManager = recyclerView.getLayoutManager();
                if (!(layoutManager instanceof LinearLayoutManager)) {
                    layoutManager = null;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                if (linearLayoutManager != null) {
                    ArrayList arrayList = new ArrayList();
                    int LJIILLIIL = LJIILLIIL(linearLayoutManager.LLILL());
                    int LJIILLIIL2 = LJIILLIIL(linearLayoutManager.LLILLJJLI());
                    if (LJIILLIIL < LJIILLIIL2 && LJIILLIIL <= LJIILLIIL2) {
                        int i = LJIILLIIL;
                        while (true) {
                            AbstractC45801HyH<C157166Eu> abstractC45801HyH = this.LJ;
                            if (abstractC45801HyH != null) {
                                C157166Eu c157166Eu = (C157166Eu) ORZ.LJLLLLLL(i, abstractC45801HyH.getData());
                                if (c157166Eu != null) {
                                    arrayList.add(c157166Eu.LJLIL);
                                }
                                if (i == LJIILLIIL2) {
                                    break;
                                } else {
                                    i++;
                                }
                            } else {
                                o.LJIJI("dataAdapter");
                                throw null;
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        this.LJIILIIL.onNext(new OSZ(arrayList, Integer.valueOf(LJIILLIIL)));
                        return;
                    }
                    return;
                }
                return;
            }
            o.LJIJI("recyclerView");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC029409q<RecyclerView.ViewHolder> LJJI() {
        AbstractC45801HyH<C157166Eu> abstractC45801HyH;
        if (this.LJJIJ) {
            AbstractC45801HyH<C157166Eu> abstractC45801HyH2 = this.LJ;
            if (abstractC45801HyH2 != null) {
                TL8 tl8 = new TL8(this, abstractC45801HyH2);
                this.LJFF = tl8;
                abstractC45801HyH = tl8;
            } else {
                o.LJIJI("dataAdapter");
                throw null;
            }
        } else {
            AbstractC45801HyH<C157166Eu> abstractC45801HyH3 = this.LJ;
            abstractC45801HyH = abstractC45801HyH3;
            if (abstractC45801HyH3 == null) {
                o.LJIJI("dataAdapter");
                throw null;
            }
        }
        return abstractC45801HyH;
    }

    public AbstractC45801HyH<C157166Eu> LJJII() {
        return new C45802HyI(this);
    }

    @Override // X.InterfaceC74488TLg
    public void destroy() {
        TL9<DATA> tl9 = this.LJJIII;
        if (tl9 != null) {
            tl9.e7().removeObservers(LJIIJ());
            tl9.getPageState().removeObservers(LJIIJ());
            tl9.getLoadMoreState().removeObservers(LJIIJ());
        }
        TLD<DATA> tld = this.LJJIIJ;
        if (tld != null) {
            tld.AF().removeObservers(LJIIJ());
            tld.FB().removeObservers(LJIIJ());
            tld.KD().removeObservers(LJIIJ());
        }
        ((TK6) this.LJIL.getValue()).LIZJ();
        if (!this.LJIJJ.LJLILLLLZI) {
            this.LJIJJ.dispose();
        }
    }

    @Override // X.InterfaceC74488TLg
    public final void loadData() {
        TL9<DATA> tl9 = this.LJJIII;
        if (tl9 != null) {
            tl9.F9();
        }
        this.LJIILL.onNext(Long.valueOf(System.currentTimeMillis()));
    }

    public final void LJIILIIL() {
        LJIILL();
        if (this.LJJ || !this.LJJIJIIJIL) {
            LJIILJJIL(LJIIJ());
        }
    }

    public LifecycleOwner LJIIJ() {
        return this.LJJII;
    }

    public int LJIIJJI() {
        return this.LJJIIZ;
    }

    public RecyclerView.ViewHolder LJIIIIZZ(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        AqS178S0100000_12 aqS178S0100000_12 = new AqS178S0100000_12((TL5) this, 309);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(TEN.LOADING, C72084SQu.LJLIL);
        linkedHashMap.put(TEN.EMPTY, new AqS168S0100000_2((InterfaceC88472Yns) null, 431));
        linkedHashMap.put(TEN.ERROR, new AqS168S0100000_2(aqS178S0100000_12, 432));
        TEW tew = new TEW(context, linkedHashMap, TEN.NONE);
        tew.setLayoutParams(new RecyclerView.LayoutParams(-1, context.getResources().getDimensionPixelSize(R.dimen.a8t)));
        return new C74474TKs(tew);
    }

    public void LJIILJJIL(LifecycleOwner lifecycleOwner) {
        MutableLiveData KD;
        MutableLiveData FB;
        MutableLiveData AF;
        TL9<DATA> tl9;
        LiveData<TEN> loadMoreState;
        LiveData<TEN> pageState;
        LiveData<List<DATA>> e7;
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        TL9<DATA> tl92 = this.LJJIII;
        if (tl92 != null && (e7 = tl92.e7()) != null) {
            e7.observe(lifecycleOwner, new TL4(this));
        }
        TL9<DATA> tl93 = this.LJJIII;
        if (tl93 != null && (pageState = tl93.getPageState()) != null) {
            C74453TJx.LIZ(pageState, C780334l.LJLIL, TLB.LJLIL, TLC.LJLIL).observe(lifecycleOwner, new AObserverS80S0100000_12(this, 41));
        }
        if (this.LJJIJ && (tl9 = this.LJJIII) != null && (loadMoreState = tl9.getLoadMoreState()) != null) {
            loadMoreState.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 42));
        }
        TLD<DATA> tld = this.LJJIIJ;
        if (tld != null && (AF = tld.AF()) != null) {
            AF.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 43));
        }
        TLD<DATA> tld2 = this.LJJIIJ;
        if (tld2 != null && (FB = tld2.FB()) != null) {
            FB.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 44));
        }
        TLD<DATA> tld3 = this.LJJIIJ;
        if (tld3 != null && (KD = tld3.KD()) != null) {
            KD.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 45));
        }
        TL8 tl8 = this.LJFF;
        if (tl8 != null) {
            tl8.LJLJJL = new TL6(this);
        }
        RecyclerView recyclerView = this.LIZJ;
        if (recyclerView != null) {
            recyclerView.LJIIJJI(new IDrS50S0100000_12(this, 12));
            RecyclerView recyclerView2 = this.LIZJ;
            if (recyclerView2 != null) {
                recyclerView2.LJIIIZ(new TL3(this));
                return;
            } else {
                o.LJIJI("recyclerView");
                throw null;
            }
        }
        o.LJIJI("recyclerView");
        throw null;
    }

    public int LJIILLIIL(int i) {
        AbstractC45801HyH<C157166Eu> abstractC45801HyH = this.LJ;
        if (abstractC45801HyH != null) {
            if (i < abstractC45801HyH.getItemCount()) {
                return i;
            }
            AbstractC45801HyH<C157166Eu> abstractC45801HyH2 = this.LJ;
            if (abstractC45801HyH2 != null) {
                if (abstractC45801HyH2.getItemCount() == 0) {
                    return 0;
                }
                if (this.LJ != null) {
                    return r0.getItemCount() - 1;
                }
                o.LJIJI("dataAdapter");
                throw null;
            }
            o.LJIJI("dataAdapter");
            throw null;
        }
        o.LJIJI("dataAdapter");
        throw null;
    }

    public final void LJIJ(C73426Srm c73426Srm) {
        if (C74216TAu.LIZIZ.LIZIZ()) {
            this.LJIJJ.LIZ(c73426Srm.LJJJLIIL(new AfS64S0100000_12(this, 61), EAP.LJLIL));
        }
    }

    public View LJJIFFI(ViewGroup viewGroup) {
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJJIFFI), R.layout.crj, viewGroup, this.LJJIIZI);
        o.LJIIIIZZ(LLLLIILL, "LayoutInflater.from(cont…      root, attachToRoot)");
        return LLLLIILL;
    }

    public TEW LJJIIJ(View content) {
        o.LJIIIZ(content, "content");
        java.util.Map LJJL = C113554cx.LJJL(new OSZ(TEN.LOADING, C72086SQw.LJLIL), new OSZ(TEN.EMPTY, C42451GlL.LJLIL), new OSZ(TEN.ERROR, new AqS178S0100000_12((TL5) this, 312)));
        Context context = content.getContext();
        o.LJIIIIZZ(context, "content.context");
        TEW tew = new TEW(context, LJJL, TEN.NONE);
        tew.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        View view = this.LIZIZ;
        if (view != null) {
            ((ViewGroup) view).addView(tew);
            return tew;
        }
        o.LJIJI("contentView");
        throw null;
    }

    public RecyclerView LJJIIJZLJL(View content) {
        o.LJIIIZ(content, "content");
        RecyclerView recyclerView = (RecyclerView) content.findViewById(R.id.kie);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(LJIIJJI(), 1, false);
        recyclerView.setItemViewCacheSize(LJIIJJI());
        recyclerView.setLayoutManager(gridLayoutManager);
        return recyclerView;
    }

    public void LJJIIZ(TEN pageState) {
        o.LJIIIZ(pageState, "pageState");
        TLG<TEN> tlg = this.LIZLLL;
        if (tlg != null) {
            tlg.setState(pageState);
            C74216TAu c74216TAu = C74216TAu.LIZIZ;
            if (c74216TAu.LIZIZ()) {
                if (pageState == TEN.ERROR) {
                    ((TK6) this.LJIL.getValue()).LIZ();
                } else {
                    ((TK6) this.LJIL.getValue()).LIZJ();
                }
                if (pageState == TEN.NONE && !c74216TAu.LJIIIZ()) {
                    if (this.LJIJI) {
                        C78596Usy.LJJJLIIL(this.LJJIFFI, true);
                    } else {
                        this.LJJI = new AqS162S0100000_12(this, 982);
                    }
                }
            }
            if (pageState == TEN.EMPTY || pageState == TEN.ERROR) {
                WPY.LIZIZ(false, "sticker", this.LJIJ, 8);
                return;
            } else {
                if (pageState != TEN.NONE) {
                    return;
                }
                WPY.LIZIZ(true, "prop_category", this.LJIJ, 8);
                return;
            }
        }
        o.LJIJI("pageStateView");
        throw null;
    }

    public void LJI(RecyclerView.ViewHolder holder, TEN loadMoreState) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(loadMoreState, "loadMoreState");
        View view = holder.itemView;
        if (!(view instanceof TEW)) {
            view = null;
        }
        TEW tew = (TEW) view;
        if (tew != null) {
            tew.setState(loadMoreState);
        }
    }

    public TL5(Context context, LifecycleOwner lifecycle, TL9<DATA> tl9, TLD<DATA> tld, ViewGroup viewGroup, int i, boolean z, boolean z2, boolean z3, boolean z4, InterfaceC88472Yns<? super TL7, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(lifecycle, "lifecycle");
        this.LJJIFFI = context;
        this.LJJII = lifecycle;
        this.LJJIII = tl9;
        this.LJJIIJ = tld;
        this.LJJIIJZLJL = viewGroup;
        this.LJJIIZ = i;
        this.LJJIIZI = z;
        this.LJJIJ = z2;
        this.LJJIJIIJI = z3;
        this.LJJIJIIJIL = z4;
        TL7 tl7 = new TL7(null);
        this.LIZ = tl7;
        this.LJI = C113554cx.LJJJLIIL();
        C73893SzJ c73893SzJ = new C73893SzJ();
        this.LJII = c73893SzJ;
        this.LJIIIIZZ = new C73893SzJ();
        this.LJIIIZ = new C73893SzJ();
        this.LJIIJ = new C73893SzJ();
        this.LJIIJJI = new C73893SzJ();
        this.LJIIL = new C73893SzJ();
        this.LJIILIIL = new C73893SzJ();
        this.LJIILJJIL = new C73893SzJ();
        this.LJIILL = new C73893SzJ();
        this.LJIILLIIL = new C73893SzJ();
        this.LJIIZILJ = -1;
        this.LJIJ = "";
        this.LJIJJ = new C73318Sq2();
        this.LJIJJLI = new IDqS436S0100000_12(this, 19);
        this.LJIL = C221108m2.LIZ(EnumC221088m0.NONE, new AqS162S0100000_12(this, 980));
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(tl7);
        }
        c73893SzJ.LJJLIIIJILLIZJL(800L, TimeUnit.MILLISECONDS).LJJJJZI(new AfS64S0100000_12(this, 60));
    }

    public /* synthetic */ TL5(Context context, LifecycleOwner lifecycleOwner, TL9 tl9, TLD tld, ViewGroup viewGroup, int i, boolean z, boolean z2, boolean z3, InterfaceC88472Yns interfaceC88472Yns, int i2) {
        this(context, lifecycleOwner, tl9, tld, viewGroup, i, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? true : z2, (i2 & 256) != 0 ? false : z3, false, (InterfaceC88472Yns<? super TL7, C76800UCe>) ((i2 & 1024) != 0 ? null : interfaceC88472Yns));
    }
}

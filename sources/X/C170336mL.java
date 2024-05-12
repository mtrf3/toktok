package X;

import Y.AObserverS70S0100000_2;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6mL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C170336mL extends AbstractC170376mP {
    public final WM7 LJLJL;
    public final ViewGroup LJLJLJ;
    public final C164926dc LJLJLLL;
    public final InterfaceC165006dk LJLL;
    public final RecyclerView.RecycledViewPool LJLLI;
    public RecyclerView LJLLILLLL;
    public C170416mT LJLLJ;
    public final C62822Ol8 LJLLL;
    public boolean LJLLLL;
    public String LJLLLLLL;

    @Override // X.AbstractC170376mP
    public final boolean LJII() {
        return true;
    }

    @Override // X.AbstractC170376mP
    public final void LJFF() {
        List<EffectModel> data;
        C170416mT c170416mT = this.LJLLJ;
        if (c170416mT != null && (data = c170416mT.getData()) != null && (!data.isEmpty())) {
            return;
        }
        ArrayList<EffectModel> LJ = C5SC.LJ();
        List<EffectModel> list = LJ;
        if (!this.LJLJLLL.LJIIJ) {
            list = LJ.subList(1, LJ.size());
        }
        o.LJIIIIZZ(list, "if (config.showNoneTimeE…bList(1, timeModels.size)");
        C170416mT c170416mT2 = this.LJLLJ;
        if (c170416mT2 != null) {
            c170416mT2.setData(list);
            RecyclerView recyclerView = this.LJLLILLLL;
            if (recyclerView != null) {
                recyclerView.setAdapter(LIZJ());
                return;
            } else {
                o.LJIJI("recyclerView");
                throw null;
            }
        }
        o.LJIJI("adapter");
        throw null;
    }

    @Override // X.AbstractC170376mP
    public final View LJI() {
        int i;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLJLJ.getContext()), R.layout.ark, this.LJLJLJ, false);
        o.LJIIIIZZ(LLLLIILL, "from(container.context)\n…e_item, container, false)");
        this.LJLJI = LLLLIILL;
        View findViewById = LJ().findViewById(R.id.isv);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.recyerview)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.LJLLILLLL = recyclerView;
        recyclerView.setItemAnimator(null);
        this.LJLJL.requireActivity();
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(this.LJLJLLL.LJIILL, 1, false);
        RecyclerView recyclerView2 = this.LJLLILLLL;
        if (recyclerView2 != null) {
            recyclerView2.setItemViewCacheSize(this.LJLJLLL.LJIILL);
            wrapGridLayoutManager.LLFZ = true;
            RecyclerView.RecycledViewPool recycledViewPool = this.LJLLI;
            if (recycledViewPool != null) {
                RecyclerView recyclerView3 = this.LJLLILLLL;
                if (recyclerView3 != null) {
                    recyclerView3.setRecycledViewPool(recycledViewPool);
                } else {
                    o.LJIJI("recyclerView");
                    throw null;
                }
            }
            RecyclerView recyclerView4 = this.LJLLILLLL;
            if (recyclerView4 != null) {
                recyclerView4.setLayoutManager(wrapGridLayoutManager);
                int LJ = C143205jg.LJ();
                C164926dc c164926dc = this.LJLJLLL;
                int i2 = (LJ - ((c164926dc.LJJIFFI + c164926dc.LJJI) * c164926dc.LJIILL)) / 2;
                RecyclerView recyclerView5 = this.LJLLILLLL;
                if (recyclerView5 != null) {
                    C26338AVi.LJIIIZ(recyclerView5, Integer.valueOf(i2), 0, Integer.valueOf(i2 - this.LJLJLLL.LJJI), 0, 16);
                    C170416mT c170416mT = new C170416mT(this.LJLL, this.LJLJLLL);
                    this.LJLLJ = c170416mT;
                    c170416mT.LJLJI = new InterfaceC170526me() { // from class: X.6mQ
                        @Override // X.InterfaceC170526me
                        public final int LIZ(int i3) {
                            return i3 - C170336mL.this.LIZJ().LJLZ();
                        }

                        @Override // X.InterfaceC170526me
                        public final boolean LIZIZ(int i3, int i4, boolean z) {
                            C170336mL c170336mL;
                            InterfaceC165006dk interfaceC165006dk;
                            if (!z || (interfaceC165006dk = (c170336mL = C170336mL.this).LJLL) == null) {
                                return false;
                            }
                            C170416mT c170416mT2 = c170336mL.LJLLJ;
                            if (c170416mT2 != null) {
                                return interfaceC165006dk.LJIILJJIL(i3, c170416mT2, i4);
                            }
                            o.LJIJI("adapter");
                            throw null;
                        }
                    };
                    this.LJLJJL = new C170366mO(this, c170416mT);
                    LIZJ().LJZL(this.LJLJLLL.LJIIIIZZ);
                    if (this.LJLJJLL) {
                        LJFF();
                    }
                    LJIIIZ().ov0().observe(this.LJLJL, new AObserverS70S0100000_2(this, 286));
                    MutableLiveData<C170326mK> ov0 = LJIIIZ().ov0();
                    InterfaceC153045zY value = LJIIIZ().hv0().LIZIZ().getValue();
                    if (value != null) {
                        i = value.LLIZLLLIL();
                    } else {
                        i = 0;
                    }
                    ov0.setValue(new C170326mK(i, 0));
                    LJIIIZ().hv0().LJFF().observe(this.LJLJL, new AObserverS70S0100000_2(this, 287));
                    LJIIIZ().hv0().LJIIIZ().observe(this.LJLJL, new AObserverS70S0100000_2(this, 288));
                    View LJ2 = LJ();
                    this.LJLJLJ.addView(LJ2);
                    return LJ2;
                }
                o.LJIJI("recyclerView");
                throw null;
            }
            o.LJIJI("recyclerView");
            throw null;
        }
        o.LJIJI("recyclerView");
        throw null;
    }

    public final EditEffectVideoModel LJIIIZ() {
        return (EditEffectVideoModel) this.LJLLL.getValue();
    }

    @Override // X.AbstractC170376mP
    public final C164926dc LIZIZ() {
        return this.LJLJLLL;
    }

    @Override // X.AbstractC170376mP
    public final String LIZLLL() {
        return this.LJLLLLLL;
    }

    public final void LJIIJ(String str) {
        int i;
        if (str != null) {
            int i2 = 2;
            switch (str.hashCode()) {
                case C61447O9r.LJIIJ:
                    if (str.equals("1")) {
                        C170416mT c170416mT = this.LJLLJ;
                        if (c170416mT != null) {
                            c170416mT.LJLJJI = c170416mT.LJLILLLLZI.LJIIJ ? 1 : 0;
                            c170416mT.notifyDataSetChanged();
                            return;
                        } else {
                            o.LJIJI("adapter");
                            throw null;
                        }
                    }
                    break;
                case 50:
                    if (str.equals("2")) {
                        C170416mT c170416mT2 = this.LJLLJ;
                        if (c170416mT2 != null) {
                            if (!c170416mT2.LJLILLLLZI.LJIIJ) {
                                i2 = 1;
                            }
                            c170416mT2.LJLJJI = i2;
                            c170416mT2.notifyDataSetChanged();
                            return;
                        }
                        o.LJIJI("adapter");
                        throw null;
                    }
                    break;
                case 51:
                    if (str.equals("3")) {
                        C170416mT c170416mT3 = this.LJLLJ;
                        if (c170416mT3 != null) {
                            if (c170416mT3.LJLILLLLZI.LJIIJ) {
                                i2 = 3;
                            }
                            c170416mT3.LJLJJI = i2;
                            c170416mT3.notifyDataSetChanged();
                            return;
                        }
                        o.LJIJI("adapter");
                        throw null;
                    }
                    break;
            }
        }
        C170416mT c170416mT4 = this.LJLLJ;
        if (c170416mT4 != null) {
            if (c170416mT4.LJLILLLLZI.LJIIJ) {
                i = 0;
            } else {
                i = -1;
            }
            c170416mT4.LJLJJI = i;
            c170416mT4.notifyDataSetChanged();
            return;
        }
        o.LJIJI("adapter");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C170336mL(WM7 scene, ViewGroup container, String categoryKey, C164926dc config, InterfaceC165006dk interfaceC165006dk, RecyclerView.RecycledViewPool recycledViewPool) {
        super(scene, categoryKey, config);
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(container, "container");
        o.LJIIIZ(categoryKey, "categoryKey");
        o.LJIIIZ(config, "config");
        this.LJLJL = scene;
        this.LJLJLJ = container;
        this.LJLJLLL = config;
        this.LJLL = interfaceC165006dk;
        this.LJLLI = recycledViewPool;
        this.LJLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 893));
        this.LJLLLL = true;
        String string = scene.getString(R.string.fso);
        o.LJIIIIZZ(string, "scene.getString(R.string.effect_time_click)");
        this.LJLLLLLL = string;
    }
}

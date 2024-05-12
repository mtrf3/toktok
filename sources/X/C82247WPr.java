package X;

import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.view.internal.main.FilterListViewSelectionViewModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS161S0200000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WPr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82247WPr implements WPL {
    public ViewGroup LIZ;
    public C82242WPm LIZIZ;
    public WQ8 LIZJ;
    public WQ5 LIZLLL;
    public WQA LJ;
    public TPQ LJFF;
    public InterfaceC74483TLb LJI;
    public WQ9 LJII;
    public FilterBean LJIIIIZZ;
    public int LJIIIZ;
    public boolean LJIIJ;
    public final C73893SzJ LJIIJJI = new C73893SzJ();
    public final C73893SzJ LJIIL = new C73893SzJ();
    public final C73893SzJ LJIILIIL = new C73893SzJ();
    public final C73893SzJ LJIILJJIL = new C73893SzJ();
    public final C82249WPt LJIILL;
    public boolean LJIILLIIL;
    public final C5H3 LJIIZILJ;
    public AqS161S0200000_14 LJIJ;
    public final FilterListViewSelectionViewModel LJIJI;
    public final C5H3 LJIJJ;
    public final ViewGroup LJIJJLI;
    public final LifecycleOwner LJIL;
    public final InterfaceC65784Pro<InterfaceC82236WPg> LJJ;
    public final InterfaceC65784Pro<InterfaceC142225i6> LJJI;

    @Override // X.WPL
    public final void LJ() {
        LJIILIIL(true);
    }

    @Override // X.WPL
    public final AbstractC73672Svk<EnumC74492TLk> LIZ() {
        InterfaceC74483TLb interfaceC74483TLb = this.LJI;
        if (interfaceC74483TLb != null) {
            return interfaceC74483TLb.LIZ();
        }
        o.LJIJI("transitionView");
        throw null;
    }

    @Override // X.WPL
    public final C73426Srm LJI() {
        C73893SzJ c73893SzJ = this.LJIILIIL;
        return IA2.LIZ(c73893SzJ, c73893SzJ);
    }

    @Override // X.WPL
    public final void hide() {
        if (this.LJIILL.LJ) {
            InterfaceC74483TLb interfaceC74483TLb = this.LJI;
            if (interfaceC74483TLb != null) {
                interfaceC74483TLb.hide();
            } else {
                o.LJIJI("transitionView");
                throw null;
            }
        } else {
            InterfaceC74483TLb interfaceC74483TLb2 = this.LJI;
            if (interfaceC74483TLb2 != null) {
                interfaceC74483TLb2.LIZJ();
            } else {
                o.LJIJI("transitionView");
                throw null;
            }
        }
        if (C74216TAu.LIZIZ.LIZIZ()) {
            this.LJIJ = null;
            ((TK6) this.LJIJJ.getValue()).LIZJ();
            ((TK6) this.LJIIZILJ.getValue()).LIZJ();
        }
    }

    @Override // X.WPL
    public final void show() {
        if (this.LJIILL.LJ) {
            InterfaceC74483TLb interfaceC74483TLb = this.LJI;
            if (interfaceC74483TLb != null) {
                interfaceC74483TLb.show();
            } else {
                o.LJIJI("transitionView");
                throw null;
            }
        } else {
            InterfaceC74483TLb interfaceC74483TLb2 = this.LJI;
            if (interfaceC74483TLb2 != null) {
                interfaceC74483TLb2.LIZIZ();
            } else {
                o.LJIJI("transitionView");
                throw null;
            }
        }
        if (C74216TAu.LIZIZ.LIZIZ() && this.LJIILLIIL) {
            ((TK6) this.LJIIZILJ.getValue()).LIZIZ();
        }
    }

    @Override // X.WPL
    public final void LIZJ(FilterBean filterBean) {
        C82242WPm c82242WPm = this.LIZIZ;
        if (c82242WPm != null) {
            c82242WPm.LIZJ(filterBean);
        } else {
            o.LJIJI("tabListView");
            throw null;
        }
    }

    @Override // X.WPM
    public final void LJIIIZ(java.util.Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> filterList) {
        Map.Entry entry;
        List list;
        InterfaceC82230WPa interfaceC82230WPa;
        o.LJIIIZ(filterList, "filterList");
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder sb = new StringBuilder("viki filter, FilterView.setCategoryFilterList -> ret -> filterTable=");
        java.util.Set<EffectCategoryResponse> keySet = filterList.keySet();
        ArrayList arrayList = new ArrayList(C32I.LJJL(keySet, 10));
        Iterator<EffectCategoryResponse> it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getName());
        }
        sb.append(arrayList);
        sb.append(", filter.size=");
        Iterator<? extends List<? extends FilterBean>> it2 = filterList.values().iterator();
        int i = 0;
        int i2 = 0;
        while (it2.hasNext()) {
            i2 += it2.next().size();
        }
        sb.append(i2);
        LIZLLL.d(sb.toString());
        Iterator<? extends List<? extends FilterBean>> it3 = filterList.values().iterator();
        int i3 = 0;
        while (it3.hasNext()) {
            i3 += it3.next().size();
        }
        boolean z = true;
        if (i3 == 0 && (interfaceC82230WPa = WPZ.LIZ) != null) {
            interfaceC82230WPa.LIZLLL("filter", true);
        }
        C74216TAu c74216TAu = C74216TAu.LIZIZ;
        if (c74216TAu.LIZIZ()) {
            if (filterList.size() > 1) {
                z = false;
            }
            this.LJIILLIIL = z;
            if (z) {
                ((TK6) this.LJIIZILJ.getValue()).LIZ();
            }
        }
        if (c74216TAu.LJFF() && (entry = (Map.Entry) ORZ.LJLLL(filterList.entrySet())) != null && (list = (List) entry.getValue()) != null) {
            for (Object obj : list) {
                int i4 = i + 1;
                if (i >= 0) {
                    FilterBean filterBean = (FilterBean) obj;
                    if (i < 5) {
                        this.LJJ.invoke().LJIJJ(filterBean);
                    }
                    i = i4;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        C82242WPm c82242WPm = this.LIZIZ;
        if (c82242WPm != null) {
            c82242WPm.LJIIIZ(filterList);
        } else {
            o.LJIJI("tabListView");
            throw null;
        }
    }

    public final void LJIILIIL(boolean z) {
        if (!this.LJIILL.LIZIZ || this.LJIIJ == z) {
            return;
        }
        this.LJIIJ = z;
        WQ5 wq5 = this.LIZLLL;
        if (wq5 != null) {
            wq5.LIZ(z);
            if (this.LJIIJ) {
                LIZJ(null);
                if (!this.LJIILL.LJIIIIZZ) {
                    C82242WPm c82242WPm = this.LIZIZ;
                    if (c82242WPm != null) {
                        c82242WPm.LJIILLIIL(null, false);
                    } else {
                        o.LJIJI("tabListView");
                        throw null;
                    }
                }
            }
            C82242WPm c82242WPm2 = this.LIZIZ;
            if (c82242WPm2 != null) {
                boolean z2 = this.LJIIJ;
                c82242WPm2.LIZJ = !z2;
                this.LJIILJJIL.onNext(Boolean.valueOf(z2));
                return;
            }
            o.LJIJI("tabListView");
            throw null;
        }
        o.LJIJI("cleanView");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C82247WPr(android.view.ViewGroup r24, X.WM7 r25, X.InterfaceC65784Pro r26, X.InterfaceC65784Pro r27, X.InterfaceC82245WPp r28, X.InterfaceC88472Yns r29) {
        /*
            Method dump skipped, instructions count: 893
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82247WPr.<init>(android.view.ViewGroup, X.WM7, X.Pro, X.Pro, X.WPp, X.Yns):void");
    }
}

package X;

import Y.ACallableS40S0400000_8;
import Y.AObserverS76S0100000_8;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarAbility;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public abstract class KAV implements InterfaceC51346KDe {
    public final InterfaceC51292KBc LIZ;
    public final InterfaceC65784Pro<ISearchBarAbility> LIZIZ;
    public final InterfaceC65784Pro<IPageSearchSubPageAbility> LIZJ;
    public final InterfaceC65784Pro<IPageSearchSubPageAbility> LIZLLL;
    public final InterfaceC65784Pro<IPageSearchSubPageAbility> LJ;
    public final List<KAU> LJFF;
    public final C62822Ol8 LJI;
    public final C62822Ol8 LJII;
    public final C62822Ol8 LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;
    public IPageSearchSubPageAbility LJIIJ;
    public IPageSearchSubPageAbility LJIIJJI;
    public final List<KCT> LJIIL;
    public boolean LJIILIIL;
    public final java.util.Map<KAU, InterfaceC88471Ynr<SearchResultParam, View, C76800UCe>> LJIILJJIL;
    public final java.util.Map<KAU, InterfaceC65784Pro<Boolean>> LJIILL;
    public final java.util.Map<KAU, InterfaceC88471Ynr<String, Boolean, C76800UCe>> LJIILLIIL;
    public final AqS174S0100000_8 LJIIZILJ;
    public final java.util.Map<KAU, InterfaceC88472Yns<SearchResultParam, C76800UCe>> LJIJ;

    public final ISearchBarAbility LIZIZ() {
        return (ISearchBarAbility) this.LJI.getValue();
    }

    public final IPageSearchSubPageAbility LIZJ() {
        return (IPageSearchSubPageAbility) this.LJIIIIZZ.getValue();
    }

    public final boolean LIZLLL() {
        int i = this.LIZ.p().LJLILLLLZI;
        if (i == 3) {
            return false;
        }
        if (!this.LJIILIIL && i != 2) {
            if (i == 1) {
                return false;
            }
            if (i == 0) {
                return this.LIZ.LLIIIZ();
            }
        }
        return true;
    }

    public java.util.Map<KAU, InterfaceC88471Ynr<String, Boolean, C76800UCe>> LIZ() {
        return this.LJIILLIIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v32, types: [T, java.lang.String] */
    @Override // X.InterfaceC51346KDe
    public void LJJIL(SearchResultParam searchResultParam) {
        KAU kau;
        KAU Jc0;
        InterfaceC88472Yns interfaceC88472Yns;
        int i;
        boolean z;
        o.LJIIIZ(searchResultParam, "searchResultParam");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("operatorSearch callback stateType = ");
        IPageSearchSubPageAbility iPageSearchSubPageAbility = this.LJIIJJI;
        if (iPageSearchSubPageAbility != null) {
            kau = iPageSearchSubPageAbility.Jc0();
        } else {
            kau = null;
        }
        LIZ.append(kau);
        X1D.LIZIZ(LIZ);
        K9C LLLILZLLLI = this.LIZ.LLLILZLLLI();
        if (LLLILZLLLI != null) {
            Integer num = LLLILZLLLI.LJLIL;
            ECSearchEntranceData eCSearchEntranceData = LLLILZLLLI.LJLILLLLZI;
            C68322mC c68322mC = new C68322mC();
            c68322mC.element = searchResultParam.getKeyword();
            if (!TextUtils.isEmpty(searchResultParam.getRealSearchWord())) {
                c68322mC.element = searchResultParam.getRealSearchWord();
            }
            String str = (String) c68322mC.element;
            if (!TextUtils.isEmpty(str)) {
                if (str != null) {
                    int length = str.length() - 1;
                    int i2 = 0;
                    boolean z2 = false;
                    while (i2 <= length) {
                        if (!z2) {
                            i = i2;
                        } else {
                            i = length;
                        }
                        if (o.LJIIJJI(str.charAt(i), 32) <= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z2) {
                            if (!z) {
                                z2 = true;
                            } else {
                                i2++;
                            }
                        } else if (!z) {
                            break;
                        } else {
                            length--;
                        }
                    }
                    if (!TextUtils.isEmpty(str.subSequence(i2, length + 1).toString())) {
                        C10K.LIZIZ(new ACallableS40S0400000_8(searchResultParam, c68322mC, num, eCSearchEntranceData, 1), C10K.LJI, null);
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
        }
        IPageSearchSubPageAbility iPageSearchSubPageAbility2 = this.LJIIJJI;
        if (iPageSearchSubPageAbility2 != null && (Jc0 = iPageSearchSubPageAbility2.Jc0()) != null && (interfaceC88472Yns = (InterfaceC88472Yns) ((LinkedHashMap) this.LJIJ).get(Jc0)) != null) {
            interfaceC88472Yns.invoke(searchResultParam);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        this.LJIIZILJ.invoke(searchResultParam);
    }

    public final void LJFF(IPageSearchSubPageAbility newPage, EnumC51268KAe actionType) {
        KAU kau;
        KAU kau2;
        o.LJIIIZ(newPage, "newPage");
        o.LJIIIZ(actionType, "actionType");
        IPageSearchSubPageAbility iPageSearchSubPageAbility = this.LJIIJJI;
        if (iPageSearchSubPageAbility != null) {
            kau = iPageSearchSubPageAbility.Jc0();
        } else {
            kau = null;
        }
        if (kau == newPage.Jc0()) {
            return;
        }
        IPageSearchSubPageAbility iPageSearchSubPageAbility2 = this.LJIIJJI;
        this.LJIIJ = iPageSearchSubPageAbility2;
        this.LJIIJJI = newPage;
        if (iPageSearchSubPageAbility2 != null) {
            iPageSearchSubPageAbility2.hide();
        }
        newPage.Ff(actionType);
        if (newPage.Jc0() == KAU.SUGGEST) {
            this.LJIILIIL = true;
        }
        Iterator it = ((ArrayList) this.LJIIL).iterator();
        while (it.hasNext()) {
            KCT kct = (KCT) it.next();
            IPageSearchSubPageAbility iPageSearchSubPageAbility3 = this.LJIIJ;
            if (iPageSearchSubPageAbility3 != null) {
                kau2 = iPageSearchSubPageAbility3.Jc0();
            } else {
                kau2 = null;
            }
            kct.I1(kau2, newPage.Jc0());
        }
    }

    public final void LJ(KAU initState, SearchResultParam searchResultParam, View view) {
        o.LJIIIZ(initState, "initState");
        o.LJIIIZ(view, "view");
        InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) ((LinkedHashMap) this.LJIILJJIL).get(initState);
        if (interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke(searchResultParam, view);
        }
    }

    public KAV(KA8 ka8, AqS158S0100000_8 aqS158S0100000_8, AqS158S0100000_8 aqS158S0100000_82, AqS158S0100000_8 aqS158S0100000_83, AqS158S0100000_8 aqS158S0100000_84, List handleStates) {
        Object value;
        o.LJIIIZ(handleStates, "handleStates");
        this.LIZ = ka8;
        this.LIZIZ = aqS158S0100000_8;
        this.LIZJ = aqS158S0100000_82;
        this.LIZLLL = aqS158S0100000_83;
        this.LJ = aqS158S0100000_84;
        this.LJFF = handleStates;
        this.LJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 632));
        this.LJII = C221108m2.LIZIZ(new AqS158S0100000_8(this, 633));
        this.LJIIIIZZ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 634));
        this.LJIIIZ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 631));
        this.LJIIL = new ArrayList();
        Iterator it = handleStates.iterator();
        while (it.hasNext()) {
            int i = KAX.LIZ[((KAU) it.next()).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        value = this.LJIIIZ.getValue();
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    value = LIZJ();
                }
            } else {
                value = this.LJII.getValue();
            }
            ((ArrayList) this.LJIIL).add(value);
        }
        LIZIZ().tP().observe(this.LIZ.getLifecycleOwner(), new AObserverS76S0100000_8(this, 121));
        ((ArrayList) this.LJIIL).add(LIZIZ());
        ((ArrayList) this.LJIIL).add(this.LIZ);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        KAU kau = KAU.SUG;
        linkedHashMap.put(kau, new AqS190S0100000_8(this, 68));
        KAU kau2 = KAU.SUGGEST;
        linkedHashMap.put(kau2, new AqS190S0100000_8(this, 69));
        KAU kau3 = KAU.RESULT;
        linkedHashMap.put(kau3, new AqS190S0100000_8(this, 70));
        this.LJIILJJIL = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(kau, new AqS158S0100000_8(this, 629));
        linkedHashMap2.put(kau2, C34349Ddx.LJLIL);
        linkedHashMap2.put(kau3, new AqS158S0100000_8(this, 630));
        this.LJIILL = linkedHashMap2;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(kau, new AqS190S0100000_8(this, 71));
        linkedHashMap3.put(kau2, new AqS190S0100000_8(this, 72));
        linkedHashMap3.put(kau3, new AqS190S0100000_8(this, 73));
        this.LJIILLIIL = linkedHashMap3;
        this.LJIIZILJ = new AqS174S0100000_8(this, 234);
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (KAU kau4 : this.LJFF) {
            if (kau4 != KAU.RESULT) {
                linkedHashMap4.put(kau4, this.LJIIZILJ);
            } else {
                linkedHashMap4.put(kau4, new AqS174S0100000_8(this, 235));
            }
        }
        this.LJIJ = linkedHashMap4;
    }
}

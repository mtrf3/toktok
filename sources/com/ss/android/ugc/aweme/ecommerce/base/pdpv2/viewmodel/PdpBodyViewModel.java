package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel;

import X.AbstractC27664AtQ;
import X.C141335gf;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C221108m2;
import X.C26059AKp;
import X.C27679Atf;
import X.C27723AuN;
import X.C32I;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C56412MCa;
import X.C62822Ol8;
import X.C70300RiS;
import X.C76800UCe;
import X.C8YZ;
import X.EnumC27721AuL;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC60061Nhh;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.ORZ;
import X.OSK;
import X.OSL;
import X.OSM;
import X.TBW;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CommonData;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.ProductInfoBrickVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.SkuBrickVO;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import defpackage.PasskeyFrequencySettingsModel;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS9S0010000_4;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class PdpBodyViewModel extends AssemViewModel<C27723AuN> implements KPL, InterfaceC60061Nhh {
    public int LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(C27679Atf.LJLIL);
    public C70300RiS LJLJJL;

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C27723AuN defaultState() {
        return new C27723AuN(0);
    }

    public final C70300RiS gv0() {
        C70300RiS c70300RiS = this.LJLJJL;
        if (c70300RiS != null) {
            return c70300RiS;
        }
        o.LJIJI("pdpPageData");
        throw null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C26059AKp.LIZ().LIZIZ("pdp_save_product", this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C26059AKp.LIZ().LIZJ("pdp_save_product", this);
    }

    public final void iv0(boolean z) {
        AbstractC27664AtQ<?, ?> abstractC27664AtQ;
        ProductInfoBrickVO productInfoBrickVO = null;
        try {
            Iterator<AbstractC27664AtQ<?, ?>> it = getState().LJLIL.iterator();
            while (true) {
                if (it.hasNext()) {
                    abstractC27664AtQ = it.next();
                    if (abstractC27664AtQ instanceof ProductInfoBrickVO) {
                        break;
                    }
                } else {
                    abstractC27664AtQ = null;
                    break;
                }
            }
            productInfoBrickVO = (ProductInfoBrickVO) abstractC27664AtQ;
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        hv0(productInfoBrickVO, new AqS9S0010000_4(z, 9));
    }

    public final void jv0(SkuPanelState skuPanelState) {
        SkuPanelState skuPanelState2;
        AbstractC27664AtQ<?, ?> abstractC27664AtQ;
        Integer productQuantity;
        String[] checkedSkuIds;
        getVmDispatcher().getState();
        C70300RiS gv0 = gv0();
        SkuBrickVO skuBrickVO = null;
        if (skuPanelState != null) {
            skuPanelState2 = skuPanelState.m108clone();
        } else {
            skuPanelState2 = null;
        }
        gv0.LJLLL = skuPanelState2;
        SkuPanelState skuPanelState3 = gv0().LJLLL;
        int i = 0;
        if (skuPanelState3 != null && (checkedSkuIds = skuPanelState3.getCheckedSkuIds()) != null) {
            for (String str : checkedSkuIds) {
                this.LJLIL = str.hashCode() + this.LJLIL;
            }
        }
        int i2 = this.LJLIL;
        if (skuPanelState != null && (productQuantity = skuPanelState.getProductQuantity()) != null) {
            i = productQuantity.intValue();
        }
        this.LJLIL = i2 + i;
        try {
            Iterator<AbstractC27664AtQ<?, ?>> it = getState().LJLIL.iterator();
            while (true) {
                if (it.hasNext()) {
                    abstractC27664AtQ = it.next();
                    if (abstractC27664AtQ instanceof SkuBrickVO) {
                        break;
                    }
                } else {
                    abstractC27664AtQ = null;
                    break;
                }
            }
            skuBrickVO = (SkuBrickVO) abstractC27664AtQ;
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        hv0(skuBrickVO, new AqS170S0100000_4(this, 321));
    }

    public final <T, A extends AbstractC27664AtQ<T, ?>> void hv0(A a, InterfaceC88472Yns<? super T, ? extends T> interfaceC88472Yns) {
        T t;
        if (a == null) {
            return;
        }
        PasskeyFrequencySettingsModel passkeyFrequencySettingsModel = (Object) a.LIZ();
        if (passkeyFrequencySettingsModel != null) {
            t = interfaceC88472Yns.invoke(passkeyFrequencySettingsModel);
        } else {
            t = null;
        }
        List<AbstractC27664AtQ<?, ?>> list = getState().LJLIL;
        String str = a.identifier;
        boolean z = a.isReportShow;
        Constructor<?> constructor = a.getClass().getConstructor(BrickInfo.class, CommonData.class);
        constructor.setAccessible(true);
        Object newInstance = constructor.newInstance(a.LJ(), a.LJIIIIZZ());
        AbstractC27664AtQ abstractC27664AtQ = (AbstractC27664AtQ) newInstance;
        abstractC27664AtQ.identifier = str;
        abstractC27664AtQ.isReportShow = z;
        if (t != null) {
            abstractC27664AtQ.bizData = t;
        }
        o.LJIIIIZZ(newInstance, "constructor.newInstance(…a\n            }\n        }");
        AbstractC27664AtQ abstractC27664AtQ2 = (AbstractC27664AtQ) newInstance;
        o.LJIIIZ(list, "<this>");
        Integer valueOf = Integer.valueOf(abstractC27664AtQ2.LJI());
        String str2 = abstractC27664AtQ2.identifier;
        int value = EnumC27721AuL.BLANK.getValue();
        if (valueOf == null || valueOf.intValue() != value) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<AbstractC27664AtQ<?, ?>> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(it.next().LJI()));
            }
            if (ORZ.LJLJJI(valueOf, arrayList)) {
                ArrayList arrayList2 = new ArrayList();
                for (AbstractC27664AtQ<?, ?> abstractC27664AtQ3 : list) {
                    if (!o.LJ(abstractC27664AtQ3.identifier, str2)) {
                        arrayList2.add(abstractC27664AtQ3);
                    } else {
                        arrayList2.add(abstractC27664AtQ2);
                    }
                }
                list = arrayList2;
            }
        }
        setState(new AqS170S0100000_4(list, (List<? extends Object>) 320));
    }

    @Override // X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        String str2;
        Integer num;
        boolean z;
        o.LJIIIZ(eventName, "eventName");
        try {
            if (o.LJ(eventName, "pdp_save_product")) {
                JSONObject jSONObject = new JSONObject(str);
                Object obj = jSONObject.get("pid");
                Boolean bool = null;
                if (obj instanceof String) {
                    str2 = (String) obj;
                } else {
                    str2 = null;
                }
                if (!o.LJ(str2, gv0().LIZIZ())) {
                    return;
                }
                Object obj2 = jSONObject.get("saved");
                if (obj2 instanceof Integer) {
                    num = (Integer) obj2;
                } else {
                    num = null;
                }
                boolean z2 = false;
                if (num == null || num.intValue() != 1) {
                    z = false;
                } else {
                    z = true;
                }
                Object obj3 = jSONObject.get("saved");
                if (obj3 instanceof Boolean) {
                    bool = (Boolean) obj3;
                }
                boolean LJ = o.LJ(bool, Boolean.TRUE);
                if (z || LJ) {
                    z2 = true;
                }
                iv0(z2);
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}

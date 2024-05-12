package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder;

import X.C117114ih;
import X.C118234kV;
import X.C16880lQ;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C26338AVi;
import X.C28121B1x;
import X.C28123B1z;
import X.C33Q;
import X.C3C8;
import X.C45804HyK;
import X.C47261Igj;
import X.C56412MCa;
import X.C61878OQg;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71682SBi;
import X.C71700SCa;
import X.C71723SCx;
import X.C76800UCe;
import X.C78685UuP;
import X.C79045V0n;
import X.C79081V1x;
import X.C8YZ;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.EnumC72807Shn;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC27239AmZ;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.InterfaceC93923mO;
import X.KPL;
import X.OSK;
import X.OSL;
import X.OSM;
import X.OUP;
import X.SCV;
import X.SCW;
import X.SCX;
import X.SCY;
import X.SCZ;
import X.T5T;
import X.TBW;
import X.W5F;
import X.W5U;
import X.YE1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS116S0300000_12;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS16S0500000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS57S0400000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class CCDCCardNumberElementViewHolder extends PowerCell<C71682SBi> implements KPL, InterfaceC27239AmZ {
    public final C214298b3 LJLIL;
    public Boolean LJLILLLLZI;
    public int LJLJI;

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

    public CCDCCardNumberElementViewHolder() {
        C214298b3 c214298b3;
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(CCDCAddCardViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 304);
        SCY scy = SCY.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, SCW.INSTANCE, new AqS162S0100000_12((InterfaceC93923mO) this, 305), new AqS162S0100000_12((InterfaceC93923mO) this, 306), C71700SCa.INSTANCE, scy, new AqS162S0100000_12((InterfaceC93923mO) this, 307), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, SCX.INSTANCE, new AqS162S0100000_12((InterfaceC93923mO) this, 308), new AqS162S0100000_12((InterfaceC93923mO) this, 299), SCZ.INSTANCE, scy, new AqS162S0100000_12((InterfaceC93923mO) this, 300), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, SCV.INSTANCE, new AqS162S0100000_12((InterfaceC93923mO) this, 301), new AqS162S0100000_12((InterfaceC93923mO) this, 302), new AqS162S0100000_12((InterfaceC93923mO) this, 303), scy, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
    }

    @Override // X.InterfaceC27239AmZ
    public final T5T getFocusView() {
        T5T t5t = (T5T) this.itemView.findViewById(R.id.eof);
        o.LJIIIIZZ(t5t, "itemView.inputWithIndicatorEditText");
        return t5t;
    }

    public final CCDCAddCardViewModel getViewModel() {
        return (CCDCAddCardViewModel) this.LJLIL.getValue();
    }

    @Override // X.InterfaceC27239AmZ
    public final boolean needFocus() {
        String str;
        C28123B1z c28123B1z;
        C71682SBi item = getItem();
        if (item != null && (c28123B1z = item.LJLILLLLZI) != null) {
            str = c28123B1z.LIZJ;
        } else {
            str = null;
        }
        if (C78685UuP.LJJJZ(str) || String.valueOf(getFocusView().getText()).length() == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C71682SBi c71682SBi) {
        ?? r3;
        int i;
        List<PaymentMethod> list;
        C71682SBi t = c71682SBi;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        itemView.setTag(R.id.bn_, new C117114ih(C79081V1x.LJII(25), 0, 0, 0, false, 0, true, 254));
        this.itemView.setPadding(C45804HyK.LJJI(16), this.itemView.getPaddingTop(), C45804HyK.LJJI(16), this.itemView.getPaddingBottom());
        View view = this.itemView;
        o.LJII(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.view.CCDCCardNumberElement");
        C71723SCx c71723SCx = (C71723SCx) view;
        ElementDTO elementDTO = t.LJLILLLLZI.LIZ;
        PaymentMethod paymentMethod = t.LJLIL;
        c71723SCx.setFocusChange(new AqS116S0300000_12(this, c71723SCx, elementDTO, 38));
        c71723SCx.setOnPaymentMethodIdentify(new AqS178S0100000_12(this, 600));
        c71723SCx.setOnValueChange(new AqS57S0400000_12(this, paymentMethod, elementDTO, c71723SCx, 13));
        c71723SCx.setOnVerify(new AqS16S0500000_12(elementDTO, paymentMethod, c71723SCx, this, t, 6));
        c71723SCx.setOnErrorClear(new AqS162S0100000_12(t, 1164));
        c71723SCx.setRequestOcr(new AqS162S0100000_12(this, 1165));
        c71723SCx.setOnDelete(new AqS162S0100000_12(elementDTO, 1166));
        c71723SCx.setOnDeleteIconVisibleChange(new AqS143S0200000_12(this, elementDTO, 133));
        CCDCAddCardViewModel viewModel = getViewModel();
        String str = elementDTO.id;
        if (str == null) {
            str = "";
        }
        c71723SCx.LIZ(elementDTO, paymentMethod, viewModel.jv0(str), t.LJLILLLLZI.LIZJ);
        C28121B1x.LIZ.getClass();
        if (!C28121B1x.LIZ()) {
            PaymentMethod paymentMethod2 = c71723SCx.getPaymentMethod();
            if (paymentMethod2 != null && (list = paymentMethod2.subPaymentMethods) != null) {
                r3 = new ArrayList();
                Iterator<PaymentMethod> it = list.iterator();
                while (it.hasNext()) {
                    String str2 = it.next().iconUrl;
                    if (str2 != null) {
                        r3.add(str2);
                    }
                }
            } else {
                r3 = C61878OQg.INSTANCE;
            }
            if (!r3.isEmpty()) {
                C45804HyK.LJJLL(c71723SCx.LIZIZ(R.id.g0m));
                ((ViewGroup) c71723SCx.LIZIZ(R.id.g0m)).removeAllViews();
                int size = r3.size();
                List list2 = r3;
                if (size > 7) {
                    list2 = r3.subList(0, 7);
                }
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ViewGroup viewGroup = (ViewGroup) c71723SCx.LIZIZ(R.id.g0m);
                    View smartImageView = new SmartImageView(c71723SCx.getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(c71723SCx.LJZI, c71723SCx.LJZL);
                    layoutParams.weight = 1.0f;
                    smartImageView.setLayoutParams(layoutParams);
                    smartImageView.setBackgroundResource(R.drawable.abg);
                    viewGroup.addView(smartImageView);
                }
                C118234kV it2 = C47261Igj.LJJ(list2).iterator();
                while (it2.LJLJI) {
                    int nextInt = it2.nextInt();
                    View childAt = ((ViewGroup) c71723SCx.LIZIZ(R.id.g0m)).getChildAt(nextInt);
                    if (childAt != null && (childAt instanceof SmartImageView)) {
                        if (nextInt != C47261Igj.LJJI(list2)) {
                            i = c71723SCx.LJZ;
                        } else {
                            i = 0;
                        }
                        C26338AVi.LJI(childAt, null, null, Integer.valueOf(i), null, false, 27);
                        Object obj = ListProtector.get(list2, nextInt);
                        if (((String) obj).length() <= 0) {
                            obj = null;
                        }
                        String str3 = (String) obj;
                        if (str3 == null) {
                            str3 = " ";
                        }
                        W5F LJIIIIZZ = W5U.LJIIIIZZ(str3);
                        SmartImageView smartImageView2 = (SmartImageView) childAt;
                        Context context = smartImageView2.getContext();
                        o.LJIIIIZZ(context, "context");
                        LJIIIIZZ.LJIILIIL = C79045V0n.LJIIIIZZ(R.attr.cv, context);
                        LJIIIIZZ.LJIJJ = EnumC72807Shn.FIT_XY;
                        LJIIIIZZ.LJJIIJZLJL = (ImageView) childAt;
                        C16880lQ.LLJJJ(LJIIIIZZ);
                        smartImageView2.setCircleOptions(c71723SCx.LL);
                    }
                }
            } else {
                View llCardIconContainer = c71723SCx.LIZIZ(R.id.g0m);
                o.LJIIIIZZ(llCardIconContainer, "llCardIconContainer");
                OUP.LJIJJLI(llCardIconContainer);
            }
        }
        ((TextView) c71723SCx.LIZIZ(R.id.eof)).setImeOptions(t.LJLJJI);
        ((TextView) c71723SCx.LIZIZ(R.id.eof)).setSingleLine();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        return new C71723SCx(context);
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

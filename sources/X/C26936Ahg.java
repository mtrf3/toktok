package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryWrapperFragment;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic.LogisticSelectFragment;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS47S0110000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.Ahg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26936Ahg extends AbstractC26906AhC implements InterfaceC151715xP {
    public boolean LJLJI;
    public final long LJLJJI;

    @Override // X.InterfaceC73141SnB
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC73149SnJ
    public final AML getReceiver() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // X.AbstractC26906AhC
    public final void LIZLLL() {
        C73157SnR.LJIIJJI(this.LJLILLLLZI, new AqS170S0100000_4(this, 1434));
    }

    public final String LJIIIIZZ() {
        DeliveryPanelStarter.EnterParamForProductDetailPage enterParamForProductDetailPage;
        String str;
        HashMap<String, Object> LJII;
        Parcelable parcelable = this.LJLILLLLZI.LJLJJLL;
        if (!(parcelable instanceof DeliveryPanelStarter.EnterParamForProductDetailPage) || (enterParamForProductDetailPage = (DeliveryPanelStarter.EnterParamForProductDetailPage) parcelable) == null || (str = enterParamForProductDetailPage.trackParams) == null || (LJII = C27739Aud.LJII(str)) == null) {
            return null;
        }
        LJII.put("previous_page", "logistics");
        return C27739Aud.LJI(LJII);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        Lifecycle lifecycle = this.LJLIL.getLifecycle();
        o.LJIIIIZZ(lifecycle, "fragment.lifecycle");
        return lifecycle;
    }

    @Override // X.AbstractC26906AhC
    public final void LJI() {
        C73157SnR.LJIIJJI(this.LJLILLLLZI, new AqS47S0110000_4(this, ActivityStack.isAppBackGround(), 22));
    }

    @Override // X.AbstractC26906AhC
    public final void LIZ(Bundle bundle) {
        HashMap<String, Object> LJII;
        FragmentManager childFragmentManager = this.LJLIL.getChildFragmentManager();
        C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
        LogisticSelectFragment logisticSelectFragment = new LogisticSelectFragment();
        Bundle bundle2 = new Bundle();
        C79234V7u.LJJIJIIJI(bundle2, this.LJLIL, null);
        logisticSelectFragment.setArguments(bundle2);
        LIZ.LJIIIIZZ(R.id.c6q, 1, logisticSelectFragment, null);
        LIZ.LJI();
        if (C26744Aea.LIZ().enableSearchAddress == null) {
            Parcelable parcelable = this.LJLILLLLZI.LJLJJLL;
            if (parcelable instanceof DeliveryPanelStarter.EnterParamForProductDetailPage) {
                o.LJII(parcelable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter.EnterParamForProductDetailPage");
                String str = ((DeliveryPanelStarter.EnterParamForProductDetailPage) parcelable).trackParams;
                if (str != null && (LJII = C27739Aud.LJII(str)) != null && o.LJ(LJII.get("no_ship_to_addr"), Boolean.TRUE)) {
                    this.LJLILLLLZI.Kv0(EnumC26931Ahb.PUSH_AREA_PAGE);
                }
            }
        }
        C73156SnQ.LJIIIIZZ(this, this.LJLILLLLZI, new TBT() { // from class: X.Ahm
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((DeliveryPanelState) obj).getApply());
            }
        }, new AqS186S0100000_4(this, 324));
        C73156SnQ.LJIIIIZZ(this, this.LJLILLLLZI, new TBT() { // from class: X.Ahd
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((DeliveryPanelState) obj).getChangePage();
            }
        }, new C26941Ahl(this));
        C73156SnQ.LJIIIIZZ(this, this.LJLILLLLZI, new TBT() { // from class: X.AhV
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((DeliveryPanelState) obj).getStatus());
            }
        }, new AqS186S0100000_4(this, 325));
    }

    @Override // X.AbstractC26906AhC
    public final void LIZIZ(DialogInterface dialogInterface) {
        C70414RkI LIZ;
        if ((this.LJLILLLLZI.LJLJJLL instanceof DeliveryPanelStarter.EnterParamForProductDetailPage) && (LIZ = C27350AoM.LIZ(this.LJLIL.getContext())) != null) {
            C70414RkI.LJJIJ(LIZ, "glide_close", null, null, 6);
        }
    }

    @Override // X.AbstractC26906AhC
    public final void LJFF(Dialog dialog) {
        o.LJIIIZ(dialog, "dialog");
        dialog.setOnKeyListener(new DialogInterfaceOnKeyListenerC26938Ahi(this));
    }

    public final DeliveryPanelStarter.PackedDeliverySelectResult LJIIIZ(DeliveryPanelState deliveryPanelState) {
        Address address;
        String str;
        boolean z;
        Address address2;
        DeliveryPanelStarter.PackedDeliverySelectResult Nv0 = this.LJLILLLLZI.Nv0(deliveryPanelState);
        if (Nv0 != null) {
            return Nv0;
        }
        if (deliveryPanelState.getApply()) {
            Parcelable parcelable = this.LJLILLLLZI.LJLJJLL;
            String str2 = null;
            if (parcelable instanceof DeliveryPanelStarter.EnterParamForProductDetailPage) {
                ReachableAddress LIZ = deliveryPanelState.getSelectedShipToInfo().LIZ();
                if (LIZ != null && (address2 = LIZ.address) != null) {
                    str = address2.id;
                } else {
                    str = null;
                }
                DeliveryPanelStarter.EnterParamForProductDetailPage enterParamForProductDetailPage = (DeliveryPanelStarter.EnterParamForProductDetailPage) parcelable;
                if (!o.LJ(str, enterParamForProductDetailPage.selectedBuyerAddressId) || !o.LJ(deliveryPanelState.getSelectedShipToInfo().LIZIZ(), enterParamForProductDetailPage.selectedArea)) {
                    z = true;
                } else {
                    z = false;
                }
                C70414RkI LIZ2 = C27350AoM.LIZ(this.LJLIL.getContext());
                if (LIZ2 != null) {
                    C70414RkI.LJJIJ(LIZ2, "continue", Boolean.valueOf(z), null, 4);
                }
            }
            LogisticDTO selectedLogistic = deliveryPanelState.getSelectedLogistic();
            ReachableAddress LIZ3 = deliveryPanelState.getSelectedShipToInfo().LIZ();
            if (LIZ3 != null && (address = LIZ3.address) != null) {
                str2 = address.id;
            }
            return new DeliveryPanelStarter.PackedDeliverySelectResult(selectedLogistic, str2, deliveryPanelState.getSelectedShipToInfo().LIZIZ(), deliveryPanelState.getShippingToAddressInfo(), deliveryPanelState.getLogistics(), deliveryPanelState.getPdpLogisticModule());
        }
        return new DeliveryPanelStarter.PackedDeliverySelectResult(null, null, null, null, null, null, 63, null);
    }

    @Override // X.AbstractC26906AhC
    public final void onCreate(Bundle bundle) {
        DeliveryPanelStarter.EnterParam enterParam;
        DeliveryPanelViewModel deliveryPanelViewModel = this.LJLILLLLZI;
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 1230);
        deliveryPanelViewModel.getClass();
        deliveryPanelViewModel.LJLJL = aqS154S0100000_4;
        Bundle arguments = this.LJLIL.getArguments();
        if (arguments != null && (enterParam = (DeliveryPanelStarter.EnterParam) arguments.getParcelable("enter_param")) != null) {
            List<LogisticDTO> list = enterParam.logisticList;
            if (list == null) {
                DeliveryPanelViewModel deliveryPanelViewModel2 = this.LJLILLLLZI;
                deliveryPanelViewModel2.LJLL = enterParam.bizType;
                deliveryPanelViewModel2.LJLJJLL = new DeliveryPanelStarter.EnterParamForProductDetailPage(enterParam.selectedDeliveryTypeId, enterParam.selectedBuyerAddressId, enterParam.selectedArea, enterParam.productId, enterParam.skuId, enterParam.quantity, enterParam.trackParams, enterParam.priceVal, enterParam.currency);
            } else {
                this.LJLILLLLZI.LJLJJLL = new DeliveryPanelStarter.EnterParamForOrderSubmitPage(list, enterParam.selectedDeliveryTypeId, enterParam.trackParams, enterParam.panelTitle);
            }
            HashMap<String, Object> LJII = C27739Aud.LJII(enterParam.trackParams);
            LinkedHashMap<String, Object> linkedHashMap = C26937Ahh.LIZ;
            linkedHashMap.clear();
            C26937Ahh.LIZIZ = null;
            C26937Ahh.LIZJ = null;
            System.currentTimeMillis();
            if (LJII != null) {
                linkedHashMap.putAll(LJII);
            }
            linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
            linkedHashMap.put("page_name", "logistics");
            linkedHashMap.put("is_fullscreen", 0);
            linkedHashMap.remove("shipping_price");
            linkedHashMap.remove("shipping_currency");
            linkedHashMap.remove("free_shipping_condition");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26936Ahg(DeliveryWrapperFragment fragment, DeliveryPanelViewModel viewModel) {
        super(fragment, viewModel);
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(viewModel, "viewModel");
        this.LJLJJI = SystemClock.elapsedRealtime();
    }

    public final void LJII(Fragment fragment, boolean z) {
        FragmentManager childFragmentManager = this.LJLIL.getChildFragmentManager();
        C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
        if (!z) {
            LIZ.LJIIJJI(R.anim.b5, R.anim.b6, R.anim.b5, R.anim.b6);
        }
        LIZ.LJIIIIZZ(R.id.c6q, 1, fragment, null);
        LIZ.LJ(null);
        LIZ.LJI();
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    @Override // X.AbstractC26906AhC
    public final View LIZJ(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        return C16880lQ.LLLLIILL(inflater, R.layout.ym, viewGroup, false);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LJI(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LIZIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73157SnR.LIZJ(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73157SnR.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73157SnR.LIZLLL(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73157SnR.LJ(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}

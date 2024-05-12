package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shipping;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C2068389v;
import X.C234529Ii;
import X.C235119Kp;
import X.C29S;
import X.C32151Nz;
import X.C3C5;
import X.C70858RrS;
import X.C70921RsT;
import X.C70922RsU;
import X.C76800UCe;
import X.C78915Uy7;
import X.C78946Uyc;
import X.C90903hW;
import X.InterfaceC219588ja;
import X.O6R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS29S0100100_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class DeliveryBySellerInfoFragment extends ECBaseFragment implements InterfaceC219588ja {
    public static final /* synthetic */ int LJLJJL = 0;
    public long LJLIL;
    public ShippingDialogDto LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public String LJLILLLLZI = "return";

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC37828Esy
    public final String getPageName() {
        return "ship_from_seller";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii c234529Ii = new C234529Ii();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_x_mark_fill_small;
        c2068389v.LJ = Integer.valueOf(R.attr.go);
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
        c234529Ii.LIZ(c2068389v);
        c234529Ii.LIZIZ(new AqS154S0100000_4(this, 233));
        c235119Kp.LIZIZ(c234529Ii);
        return c235119Kp;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.LJLIL = SystemClock.elapsedRealtime();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        String str;
        if (ActivityStack.isAppBackGround()) {
            str = "close";
        } else {
            str = "return";
        }
        this.LJLILLLLZI = str;
        if (this.LJLIL != 0) {
            C78946Uyc.LJJII(this, new C70921RsT(), new AqS29S0100100_4(SystemClock.elapsedRealtime() - this.LJLIL, this, 2));
            this.LJLIL = 0L;
        }
        super.onStop();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC71003Rtn, X.InterfaceC70849RrJ
    public final void fillNodeParams(C70858RrS params) {
        o.LJIIIZ(params, "params");
        C78915Uy7.LJJIL(params, new AqS170S0100000_4(this, 301));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ShippingDialogDto shippingDialogDto;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            shippingDialogDto = (ShippingDialogDto) arguments.getParcelable("key_shipping_dialog");
        } else {
            shippingDialogDto = null;
        }
        this.LJLJI = shippingDialogDto;
        if (shippingDialogDto != null) {
            ((TextView) view.findViewById(R.id.m8f)).setText(shippingDialogDto.headerText);
            ((TextView) view.findViewById(R.id.m0x)).setText(shippingDialogDto.bodyText);
            ((TextView) view.findViewById(R.id.ate)).setText(shippingDialogDto.buttonText);
            View findViewById = view.findViewById(R.id.ate);
            o.LJIIIIZZ(findViewById, "view.bt_button_text");
            C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 44, 42), findViewById);
            C78946Uyc.LJJIIJ(view, new C70922RsU(), null);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.yc, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}

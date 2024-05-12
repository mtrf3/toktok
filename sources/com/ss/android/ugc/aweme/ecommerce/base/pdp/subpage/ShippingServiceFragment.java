package com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C26709Ae1;
import X.C29S;
import X.C3C5;
import X.C47261Igj;
import X.C70921RsT;
import X.C70922RsU;
import X.C76800UCe;
import X.C78946Uyc;
import X.C7MY;
import X.C84654XKg;
import X.C90903hW;
import X.C9KF;
import X.InterfaceC219588ja;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingServicePopup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingServiceTag;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS58S1100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ShippingServiceFragment extends ECBaseFragment implements InterfaceC219588ja {
    public static C84654XKg LJLJJI;
    public ShippingServicePopup LJLIL;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public String LJLILLLLZI = "";

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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
        return "shipping_rights";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        String str;
        Bundle arguments = getArguments();
        ShippingServicePopup shippingServicePopup = null;
        if (arguments != null) {
            shippingServicePopup = (ShippingServicePopup) arguments.getParcelable("key_content_popup");
        }
        if (!(shippingServicePopup instanceof ShippingServicePopup) || shippingServicePopup == null || (str = shippingServicePopup.header) == null) {
            str = "Shipping Service";
        }
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        c9kf.LIZJ = str;
        c235119Kp.LIZJ = c9kf;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS154S0100000_4(this, 238));
        c235119Kp.LIZIZ(LIZJ);
        c235119Kp.LIZLLL = true;
        return c235119Kp;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C84654XKg c84654XKg = LJLJJI;
        if (c84654XKg != null) {
            C76800UCe c76800UCe = C76800UCe.LIZ;
            C3C5.m7constructorimpl(c76800UCe);
            c84654XKg.resumeWith(c76800UCe);
        }
        LJLJJI = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        String str;
        super.onStop();
        if (ActivityStack.isAppBackGround()) {
            str = "close";
        } else {
            str = "return";
        }
        C78946Uyc.LJJII(this, new C70921RsT(), new AqS58S1100000_4(str, this, 14));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ShippingServicePopup shippingServicePopup;
        String str;
        List<ShippingServiceTag> list;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            shippingServicePopup = (ShippingServicePopup) arguments.getParcelable("key_content_popup");
        } else {
            shippingServicePopup = null;
        }
        this.LJLIL = shippingServicePopup;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str = arguments2.getString("shipping_rights_content");
        } else {
            str = null;
        }
        this.LJLILLLLZI = str;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = C7MY.LIZIZ(16);
        layoutParams.topMargin = C7MY.LIZIZ(12);
        ShippingServicePopup shippingServicePopup2 = this.LJLIL;
        if (shippingServicePopup2 != null && (list = shippingServicePopup2.shippingServiceTags) != null) {
            int i = 0;
            for (ShippingServiceTag shippingServiceTag : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    ShippingServiceTag shippingServiceTag2 = shippingServiceTag;
                    Context context = view.getContext();
                    o.LJIIIIZZ(context, "view.context");
                    C26709Ae1 c26709Ae1 = new C26709Ae1(context);
                    c26709Ae1.setIcon(shippingServiceTag2.icon);
                    c26709Ae1.setServiceContents(shippingServiceTag2.contents);
                    c26709Ae1.setServiceName(shippingServiceTag2.name);
                    ((ViewGroup) _$_findCachedViewById(R.id.jx9)).addView(c26709Ae1, layoutParams);
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        C78946Uyc.LJJII(this, new C70922RsU(), new AqS170S0100000_4(this, 303));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.a49, viewGroup, false);
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

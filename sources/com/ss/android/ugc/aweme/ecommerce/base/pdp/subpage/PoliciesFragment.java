package com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage;

import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C27162AlK;
import X.C27350AoM;
import X.C27531ArH;
import X.C29S;
import X.C32151Nz;
import X.C3C5;
import X.C70414RkI;
import X.C76542zS;
import X.C76800UCe;
import X.C7MY;
import X.C84654XKg;
import X.C90903hW;
import X.C9KF;
import X.InterfaceC219588ja;
import X.O6R;
import X.OUP;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PrivacyPolicy;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopPolicy;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.core.view.PdpPoliciesItemView;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.Au2S10S0300000_4;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS47S1200000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PoliciesFragment extends ECBaseFragment implements InterfaceC219588ja {
    public static C84654XKg LJLILLLLZI;
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
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
        return "retailer_policies";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        String string = getString(R.string.f3m);
        o.LJIIIIZZ(string, "getString(R.string.ec_pdp_service)");
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS154S0100000_4(this, 236));
        c235119Kp.LIZIZ(LIZJ);
        return c235119Kp;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C84654XKg c84654XKg = LJLILLLLZI;
        if (c84654XKg != null) {
            C76800UCe c76800UCe = C76800UCe.LIZ;
            C3C5.m7constructorimpl(c76800UCe);
            c84654XKg.resumeWith(c76800UCe);
        }
        LJLILLLLZI = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        String str;
        super.onStop();
        C70414RkI LIZ = C27350AoM.LIZ(mo49getActivity());
        if (LIZ != null) {
            long stayDuration = getStayDuration();
            if (ActivityStack.isAppBackGround()) {
                str = "close";
            } else {
                str = "return";
            }
            LIZ.LJJJJLI("retailer_policies", stayDuration, str, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Parcelable[] parcelableArr;
        ShopPolicy[] shopPolicyArr;
        List<PrivacyPolicy> list;
        Image image;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            parcelableArr = arguments.getParcelableArray("data");
        } else {
            parcelableArr = null;
        }
        if (parcelableArr instanceof ShopPolicy[]) {
            shopPolicyArr = (ShopPolicy[]) parcelableArr;
        } else {
            shopPolicyArr = null;
        }
        if (shopPolicyArr != null) {
            ArrayList arrayList = new ArrayList(shopPolicyArr.length);
            for (ShopPolicy shopPolicy : shopPolicyArr) {
                Context context = view.getContext();
                o.LJIIIIZZ(context, "view.context");
                PdpPoliciesItemView pdpPoliciesItemView = new PdpPoliciesItemView(context, null, 0, null, 14, null);
                int i = C27162AlK.LJIIIIZZ;
                pdpPoliciesItemView.setTitle(shopPolicy.name);
                pdpPoliciesItemView.setDesc(shopPolicy.description);
                Context context2 = view.getContext();
                o.LJIIIIZZ(context2, "view.context");
                boolean LJIILJJIL = AnonymousClass636.LJIILJJIL(context2);
                Icon icon = shopPolicy.icon;
                if (LJIILJJIL) {
                    if (icon != null) {
                        image = icon.iconDark;
                    }
                    image = null;
                } else {
                    if (icon != null) {
                        image = icon.icon;
                    }
                    image = null;
                }
                pdpPoliciesItemView.setIcon(image);
                pdpPoliciesItemView.setPadding(i, i, i, i);
                arrayList.add(pdpPoliciesItemView);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ViewGroup) _$_findCachedViewById(R.id.jci)).addView((View) it.next());
            }
            ShopPolicy shopPolicy2 = shopPolicyArr[0];
            if (shopPolicy2 != null && (list = shopPolicy2.privacyPolicy) != null) {
                Context context3 = view.getContext();
                o.LJIIIIZZ(context3, "view.context");
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C7MY.LIZIZ(1));
                layoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                layoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                layoutParams.topMargin = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
                View view2 = new View(context3);
                view2.setLayoutParams(layoutParams);
                view2.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.dz, context3));
                ((ViewGroup) _$_findCachedViewById(R.id.jci)).addView(view2);
                for (PrivacyPolicy privacyPolicy : list) {
                    Context context4 = view.getContext();
                    o.LJIIIIZZ(context4, "view.context");
                    TuxTextView tuxTextView = new TuxTextView(context4, null, 6, 0);
                    tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gv, context4));
                    tuxTextView.setTuxFont(82);
                    tuxTextView.setGravity(8388611);
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams2.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                    layoutParams2.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                    layoutParams2.topMargin = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
                    layoutParams2.bottomMargin = C7MY.LIZIZ(30);
                    OUP.LJJJJI(O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)), tuxTextView);
                    tuxTextView.setLayoutParams(layoutParams2);
                    tuxTextView.setText(privacyPolicy.buttonText);
                    C16880lQ.LJIIJ(new Au2S10S0300000_4(this, privacyPolicy, context4, 22), tuxTextView);
                    ((ViewGroup) _$_findCachedViewById(R.id.jci)).addView(tuxTextView);
                    String str = privacyPolicy.nameEn;
                    if (str == null) {
                        str = "terms_of_use_and_sale";
                    }
                    C70414RkI LIZ = C27350AoM.LIZ(getContext());
                    if (LIZ != null) {
                        C76542zS.LIZJ("tiktokec_button_show", new AqS47S1200000_4(LIZ, this, str, 41));
                    }
                }
            }
        }
        C70414RkI LIZ2 = C27350AoM.LIZ(getContext());
        if (LIZ2 != null) {
            LIZ2.LJJJJL(null, "retailer_policies");
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        o.LJIIIZ(inflater, "inflater");
        Context context = getContext();
        C29S c29s = null;
        if (context != null) {
            view = C27531ArH.LIZ(R.layout.a28, context, viewGroup, false);
        } else {
            view = null;
        }
        if (!(view instanceof View)) {
            view = null;
        }
        if (view != null) {
            try {
                ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view, this);
                C10A.LIZIZ(view, this);
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
        return view;
    }
}

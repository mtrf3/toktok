package com.ss.android.ugc.aweme.commercialize.ecommerce.pdp.ui;

import X.ActivityC45651qj;
import X.C109464Ri;
import X.C10A;
import X.C117144ik;
import X.C141335gf;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C61079Ny7;
import X.C61081Ny9;
import X.C62822Ol8;
import X.C76800UCe;
import X.C81244Vua;
import X.C90903hW;
import X.DialogC61080Ny8;
import X.DialogInterfaceOnKeyListenerC61086NyE;
import X.DialogInterfaceOnShowListenerC61083NyB;
import X.InterfaceC65784Pro;
import X.NGQ;
import Y.ACListenerS30S0100000_10;
import Y.IDObjectS331S0100000_10;
import Y.IDTListenerS119S0100000_10;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.commercialize.ecommerce.pdp.log.PdpLogHelper;
import com.ss.android.ugc.aweme.commercialize.ecommerce.pdp.model.ShopifyPdpAdInfo;
import com.ss.android.ugc.aweme.spark.AdSparkContext;
import com.ss.android.ugc.aweme.spark.AdSparkUtils;
import com.ss.android.ugc.aweme.spark.IAdSparkUtils;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class PdpBulletBottomSheetFragment extends Hilt_PdpBulletBottomSheetFragment {
    public static final /* synthetic */ int LLD = 0;
    public PdpLogHelper LJLJJI;
    public final C62822Ol8 LJLJL;
    public InterfaceC65784Pro<C76800UCe> LJLJLJ;
    public InterfaceC65784Pro<C76800UCe> LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public SparkFragment LJLLJ;
    public long LJLLL;
    public View LJLLLL;
    public float LJLLLLLL;
    public BottomSheetBehavior<View> LJLZ;
    public int LJZ;
    public Integer LJZI;
    public boolean LJZL;
    public final Map<Integer, View> LL = new LinkedHashMap();
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 73));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 71));

    public PdpBulletBottomSheetFragment() {
        C221108m2.LIZIZ(new AqS160S0100000_10(this, 70));
        this.LJLJL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 72));
        this.LJLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 69));
        this.LJLLI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 74));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 68));
        this.LJZ = 4;
    }

    public final ViewGroup wl() {
        return (ViewGroup) this.LJLL.getValue();
    }

    public final PdpLogHelper xl() {
        PdpLogHelper pdpLogHelper = this.LJLJJI;
        if (pdpLogHelper != null) {
            return pdpLogHelper;
        }
        o.LJIJI("pdpLogHelper");
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LL).clear();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View view = (View) this.LJLLI.getValue();
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this, 19), view);
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(new DialogInterfaceOnShowListenerC61083NyB(this));
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setOnKeyListener(DialogInterfaceOnKeyListenerC61086NyE.LJLIL);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getLifecycle().addObserver(xl());
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        return new DialogC61080Ny8(mo49getActivity(), new C61081Ny9(this));
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        super.onDismiss(dialog);
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJLLL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public final View vl(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        Iterator it = new IDObjectS331S0100000_10(viewGroup, 0).iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (view instanceof ScrollView) {
                view.setOnTouchListener(new IDTListenerS119S0100000_10(this, 1));
                return view;
            }
            if (view instanceof ViewGroup) {
                return vl((ViewGroup) view);
            }
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SparkFragment sparkFragment;
        Bundle bundle2;
        SparkContext sparkContext;
        IAdSparkUtils LJFF;
        AdSparkContext LIZ;
        String logExtra;
        Long creativeId;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        IAdSparkUtils LJFF2 = AdSparkUtils.LJFF();
        boolean z = false;
        if (LJFF2 == null || (sparkFragment = LJFF2.LIZJ(false)) == null) {
            sparkFragment = new SparkFragment();
        }
        this.LJLLJ = sparkFragment;
        String str = (String) this.LJLJL.getValue();
        if (str == null) {
            str = "about:blank";
        }
        ShopifyPdpAdInfo shopifyPdpAdInfo = (ShopifyPdpAdInfo) this.LJLJJL.getValue();
        if (shopifyPdpAdInfo != null && shopifyPdpAdInfo.isAd()) {
            z = true;
        }
        if (z) {
            str = UriProtector.parse(str).buildUpon().appendQueryParameter("is_ad", "1").build().toString();
            o.LJIIIIZZ(str, "parse(schema).buildUpon(…, \"1\").build().toString()");
            bundle2 = new Bundle();
            ShopifyPdpAdInfo shopifyPdpAdInfo2 = (ShopifyPdpAdInfo) this.LJLJJL.getValue();
            if (shopifyPdpAdInfo2 != null && (creativeId = shopifyPdpAdInfo2.getCreativeId()) != null) {
                bundle2.putLong("ad_id", creativeId.longValue());
            }
            ShopifyPdpAdInfo shopifyPdpAdInfo3 = (ShopifyPdpAdInfo) this.LJLJJL.getValue();
            if (shopifyPdpAdInfo3 != null && (logExtra = shopifyPdpAdInfo3.getLogExtra()) != null) {
                bundle2.putString("bundle_download_app_log_extra", logExtra);
            }
        } else {
            bundle2 = null;
        }
        C61079Ny7 c61079Ny7 = new C61079Ny7(this);
        C81244Vua c81244Vua = this.LJLIL;
        if (c81244Vua != null && (LJFF = AdSparkUtils.LJFF()) != null && (LIZ = NGQ.LIZ(LJFF, c81244Vua, str, bundle2, false, 24)) != null) {
            LIZ.LJJIL(c61079Ny7);
            sparkContext = LIZ;
        } else {
            sparkContext = new SparkContext();
        }
        SparkFragment sparkFragment2 = this.LJLLJ;
        if (sparkFragment2 != null) {
            Bundle bundle3 = new Bundle();
            C109464Ri.LIZ.getClass();
            C117144ik.LIZIZ.getClass();
            C117144ik.LIZIZ(sparkContext);
            bundle3.putString("SparkContextContainerId", sparkContext.containerId);
            sparkFragment2.setArguments(bundle3);
            SparkFragment sparkFragment3 = this.LJLLJ;
            if (sparkFragment3 != null) {
                Bundle arguments = sparkFragment3.getArguments();
                if (arguments != null) {
                    arguments.putAll(bundle2);
                }
                FragmentManager childFragmentManager = getChildFragmentManager();
                C1B3 LIZ2 = C1B6.LIZ(childFragmentManager, childFragmentManager);
                SparkFragment sparkFragment4 = this.LJLLJ;
                if (sparkFragment4 != null) {
                    LIZ2.LJIIJ(sparkFragment4, null, R.id.b0v);
                    LIZ2.LJI();
                    return;
                } else {
                    o.LJIJI("sparkContainerFragment");
                    throw null;
                }
            }
            o.LJIJI("sparkContainerFragment");
            throw null;
        }
        o.LJIJI("sparkContainerFragment");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.aw6, viewGroup, false);
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

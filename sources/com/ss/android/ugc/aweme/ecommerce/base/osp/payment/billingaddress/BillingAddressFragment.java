package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress;

import X.ActivityC45651qj;
import X.AnonymousClass028;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C214298b3;
import X.C214528bQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C26826Afu;
import X.C27493Aqf;
import X.C27497Aqj;
import X.C27503Aqp;
import X.C27986Ayc;
import X.C29S;
import X.C3C5;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76542zS;
import X.C76800UCe;
import X.C78926UyI;
import X.C8VV;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.C9KF;
import X.EnumC27826Aw2;
import X.InterfaceC27499Aql;
import X.ORZ;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dialogfragmentcontainer.OSPHalfDialogContainerFragment;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class BillingAddressFragment extends Fragment implements InterfaceC27499Aql {
    public BillingFragmentEnterParams LJLIL;
    public final C214298b3 LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

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

    @Override // X.InterfaceC27499Aql
    public final boolean enableDragClose() {
        return false;
    }

    public BillingAddressFragment() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(BillingAddressViewModel.class);
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(LIZ, 206);
        C27497Aqj c27497Aqj = C27497Aqj.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(aqS154S0100000_4, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c27497Aqj, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS154S0100000_4, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c27497Aqj, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLILLLLZI = c214298b3;
    }

    public final void vl() {
        BillingFragmentEnterParams billingFragmentEnterParams = this.LJLIL;
        if (billingFragmentEnterParams != null && billingFragmentEnterParams.getDismissParent()) {
            EventCenter.LJ().LIZ("EC_CLOSE_PREVIOUS_PAGE", "{}");
        }
        OSPHalfDialogContainerFragment LJIJ = g0.LJIJ(this);
        if (LJIJ != null) {
            LJIJ.dismissAllowingStateLoss();
            return;
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null) {
            return;
        }
        mo49getActivity.onBackPressed();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String LLD;
        super.onDestroyView();
        long LIZ = C27493Aqf.LIZ("stay_duration");
        BillingAddressViewModel billingAddressViewModel = (BillingAddressViewModel) this.LJLILLLLZI.getValue();
        if (billingAddressViewModel.qv0()) {
            LLD = null;
        } else {
            LLD = ORZ.LLD(billingAddressViewModel.LJLJL, ",", null, null, null, 62);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap<String, Object> linkedHashMap2 = C27493Aqf.LIZ;
        linkedHashMap.putAll(linkedHashMap2);
        linkedHashMap.put("stay_time", String.valueOf(LIZ));
        if (LLD != null) {
            linkedHashMap.put("page_info", LLD);
        }
        C76542zS.LIZ("tiktokec_stay_page", linkedHashMap);
        linkedHashMap2.clear();
        ((LinkedHashMap) C27493Aqf.LIZIZ).clear();
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        HashMap<String, Object> hashMap;
        String str;
        String str2;
        Object obj;
        Class cls;
        String string;
        Address shippingAddress;
        Region region;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        BillingFragmentEnterParams billingFragmentEnterParams = this.LJLIL;
        EnumC27826Aw2 enumC27826Aw2 = null;
        if (billingFragmentEnterParams != null) {
            hashMap = billingFragmentEnterParams.getTrackParams();
        } else {
            hashMap = null;
        }
        BillingFragmentEnterParams billingFragmentEnterParams2 = this.LJLIL;
        if (billingFragmentEnterParams2 != null && (shippingAddress = billingFragmentEnterParams2.getShippingAddress()) != null && (region = shippingAddress.region) != null) {
            str = region.geoNameId;
        } else {
            str = null;
        }
        String LIZ = C26826Afu.LIZ(str);
        if (LIZ != null) {
            str2 = AnonymousClass028.LIZJ("getDefault()", LIZ, "this as java.lang.String).toLowerCase(locale)");
        } else {
            str2 = null;
        }
        if (hashMap == null || (obj = hashMap.remove("page_info")) == null) {
            obj = "edit";
        }
        LinkedHashMap<String, Object> linkedHashMap = C27493Aqf.LIZ;
        if (hashMap != null) {
            linkedHashMap.putAll(hashMap);
        }
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "billing_address");
        linkedHashMap.put("fill_type", obj);
        if (str2 != null) {
            linkedHashMap.put("location", str2);
        }
        ((BillingAddressViewModel) this.LJLILLLLZI.getValue()).LJLILLLLZI = this.LJLIL;
        if (C27503Aqp.LIZ().baInteractive) {
            cls = BillingAddressAssemV2.class;
        } else {
            cls = BillingAddressAssem.class;
        }
        C8VV.LIZ(this, false, new AqS134S0200000_3(this, C65352Pkq.LIZ(cls), 196));
        C235119Kp c235119Kp = new C235119Kp();
        c235119Kp.LIZLLL = true;
        C234529Ii c234529Ii = new C234529Ii();
        c234529Ii.LIZLLL = true;
        c234529Ii.LIZIZ(new AqS154S0100000_4(this, 1042));
        BillingFragmentEnterParams billingFragmentEnterParams3 = this.LJLIL;
        if (billingFragmentEnterParams3 != null) {
            enumC27826Aw2 = billingFragmentEnterParams3.getOpenFrom();
        }
        if (enumC27826Aw2 == EnumC27826Aw2.ADD_NEW_CARD) {
            c234529Ii.LIZJ();
            c234529Ii.LIZJ = R.raw.icon_chevron_left_offset_ltr;
            c235119Kp.LIZLLL(c234529Ii);
            string = getString(R.string.f7p);
        } else {
            if (!C27503Aqp.LIZ().baFullPage) {
                c234529Ii.LIZJ();
                c234529Ii.LIZJ = R.raw.icon_x_mark_small;
                c235119Kp.LIZIZ(c234529Ii);
            } else {
                c234529Ii.LIZJ();
                c234529Ii.LIZJ = R.raw.icon_arrow_left_ltr;
                c235119Kp.LIZLLL(c234529Ii);
            }
            string = getString(R.string.f7l);
        }
        o.LJIIIIZZ(string, "if (enterParams?.openFro…it_address)\n            }");
        C9KF c9kf = new C9KF();
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        ((C252709vu) _$_findCachedViewById(R.id.gwf)).setNavActions(c235119Kp);
        View btConfirm = _$_findCachedViewById(R.id.at_);
        o.LJIIIIZZ(btConfirm, "btConfirm");
        C16880lQ.LJIIJ(new C27986Ayc(this), btConfirm);
        ((RecyclerView) _$_findCachedViewById(R.id.hqp)).setNestedScrollingEnabled(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.a0v, viewGroup, false);
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

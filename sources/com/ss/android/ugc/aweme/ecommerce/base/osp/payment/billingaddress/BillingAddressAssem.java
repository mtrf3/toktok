package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress;

import X.AnonymousClass791;
import X.B1Z;
import X.B2I;
import X.C117104ig;
import X.C214298b3;
import X.C27493Aqf;
import X.C27501Aqn;
import X.C28118B1u;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76542zS;
import X.C78926UyI;
import X.C87593cB;
import X.C8YN;
import X.C9BE;
import X.EnumC27826Aw2;
import X.InterfaceC60061Nhh;
import X.ORZ;
import X.SAN;
import X.SBF;
import X.SBI;
import X.SYL;
import X.TBT;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.viewholder.BANormalElementVH;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.viewholder.DisableElementViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.viewholder.RegionInputElementViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.viewholder.SameShippingAddressElementViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Tab;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.zhiliaoapp.musically.R;
import defpackage.Vision;
import defpackage.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class BillingAddressAssem extends UIContentAssem implements InterfaceC60061Nhh {
    public final C214298b3 LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    public BillingAddressAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(BillingAddressViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS162S0100000_12(LIZ, 232), SBF.INSTANCE, null);
    }

    public final BillingAddressViewModel v3() {
        return (BillingAddressViewModel) this.LJLIL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        EventCenter.LJ().LIZIZ("ec_district_panel_changed_v2", this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        BillingFragmentEnterParams billingFragmentEnterParams;
        Address shippingAddress;
        o.LJIIIZ(view, "view");
        v3().mv0();
        boolean z = v3().LJLJJL;
        LinkedHashMap<String, Object> linkedHashMap = C27493Aqf.LIZ;
        linkedHashMap.put("is_with_delivery_info", Integer.valueOf(z ? 1 : 0));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.putAll(linkedHashMap);
        C76542zS.LIZ("tiktokec_enter_page", linkedHashMap2);
        C27493Aqf.LJ("stay_duration");
        C27493Aqf.LIZJ("confirm");
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) this.LJLILLLLZI;
        View view2 = (View) linkedHashMap3.get(Integer.valueOf(R.id.hqp));
        EnumC27826Aw2 enumC27826Aw2 = null;
        if (view2 == null) {
            View containerView = getContainerView();
            if (containerView != null && (view2 = containerView.findViewById(R.id.hqp)) != null) {
                linkedHashMap3.put(Integer.valueOf(R.id.hqp), view2);
            } else {
                view2 = null;
            }
        }
        SYL syl = (SYL) view2;
        syl.getContext();
        syl.setLayoutManager(new LinearLayoutManager());
        syl.LJII(new C117104ig(-1), -1);
        syl.setLifecycleOwner(this);
        boolean z2 = true;
        syl.LLLF.LJZL(SameShippingAddressElementViewHolder.class, BANormalElementVH.class, RegionInputElementViewHolder.class, DisableElementViewHolder.class);
        BillingAddressViewModel v3 = v3();
        BillingAddressViewModel v32 = v3();
        v32.getClass();
        ArrayList arrayList = new ArrayList();
        PaymentMethod jv0 = v32.jv0();
        if (jv0 != null) {
            List<ElementDTO> LIZJ = jv0.LIZJ();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((ArrayList) LIZJ).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                SAN san = SAN.LIZ;
                String str = ((ElementDTO) next).id;
                san.getClass();
                if (SAN.LJFF(str)) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ElementDTO elementDTO = (ElementDTO) it2.next();
                B1Z.LJIIIIZZ.getClass();
                B2I LIZJ2 = C28118B1u.LIZJ(elementDTO, jv0);
                if (LIZJ2 != null) {
                    arrayList3.add(LIZJ2);
                }
            }
            arrayList.addAll(ORZ.LLJILJILJ(v32.gv0(arrayList3)));
        }
        f0.LIZ.getClass();
        Integer num = f0.LIZIZ()._hasSASAButton;
        if ((num != null || (num = Vision.LIZ()._hasSASAButton) != null) && num.intValue() == 1 && (billingFragmentEnterParams = v3().LJLILLLLZI) != null && (shippingAddress = billingFragmentEnterParams.getShippingAddress()) != null) {
            BillingFragmentEnterParams billingFragmentEnterParams2 = v3().LJLILLLLZI;
            if (billingFragmentEnterParams2 != null) {
                enumC27826Aw2 = billingFragmentEnterParams2.getOpenFrom();
            }
            if (enumC27826Aw2 == EnumC27826Aw2.OSP) {
                z2 = false;
            }
            ListProtector.add(arrayList, 0, new SBI(shippingAddress, z2));
        }
        v3.getClass();
        v3.setState(new AqS178S0100000_12(arrayList, (List<Tab>) 379));
        C8YN.LJII(this, v3(), new TBT() { // from class: X.SBJ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SBE) obj).LJLJJL;
            }
        }, null, C87593cB.LJLIL, 6);
        C8YN.LJII(this, v3(), new TBT() { // from class: X.SBL
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SBE) obj).LJLJJLL;
            }
        }, null, AnonymousClass791.LJLIL, 6);
        C8YN.LJII(this, v3(), new TBT() { // from class: X.SBN
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SBE) obj).LJLJI;
            }
        }, null, C27501Aqn.LJLIL, 6);
        EventCenter.LJ().LIZJ("ec_district_panel_changed_v2", this);
    }

    @Override // X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        o.LJIIIZ(eventName, "eventName");
        v3().nv0(eventName, str);
    }
}

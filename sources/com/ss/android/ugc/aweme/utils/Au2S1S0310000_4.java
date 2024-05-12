package com.ss.android.ugc.aweme.utils;

import X.C26227ARb;
import X.C26634Aco;
import X.C26637Acr;
import X.C27724AuO;
import X.C3AW;
import X.C70376Rjg;
import X.C70891Rrz;
import X.C70919RsR;
import X.C78946Uyc;
import X.C78948Uye;
import X.InterfaceC27046AjS;
import X.OUR;
import X.TAT;
import X.UC0;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.global.address.list.module.addressitem.GlobalAddressItemViewHolder;
import com.ss.android.ugc.aweme.ecommerce.global.osp.module.discount.GlobalDiscountVH;
import com.ss.android.ugc.aweme.ecommerce.ttf.osp.module.discount.TtfDiscountVH;
import com.ss.android.ugc.aweme.ecommerce.us.logistic.module.logisticselectaddress.USLogisticSelectAddressItemVH;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS19S0310000_4;
import kotlin.jvm.internal.AqS28S0210000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class Au2S1S0310000_4 extends TAT {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // X.TAT
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            case 2:
                LIZ$2(this, view);
                return;
            case 3:
                LIZ$3(this, view);
                return;
            case 4:
                LIZ$4(this, view);
                return;
            case 5:
                LIZ$5(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    public static final void LIZ$0(Au2S1S0310000_4 au2S1S0310000_4, View view) {
        if (view != null) {
            View view2 = ((GlobalAddressItemViewHolder) au2S1S0310000_4.l0).itemView;
            C78946Uyc.LJJIIJ(view2, OUR.LIZLLL(view2, "itemView"), new AqS19S0310000_4((Address) au2S1S0310000_4.l1, (C26634Aco) au2S1S0310000_4.l2, (GlobalAddressItemViewHolder) au2S1S0310000_4.l0, au2S1S0310000_4.z3, 1));
            View itemView = ((GlobalAddressItemViewHolder) au2S1S0310000_4.l0).itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C78946Uyc.LJJIIJ(itemView, new C70891Rrz(), C26637Acr.LJLIL);
            Context context = view.getContext();
            o.LJIIIIZZ(context, "it.context");
            C26227ARb LIZ = C3AW.LIZ(context);
            LIZ.LIZ(R.string.f69);
            UC0.LIZJ(LIZ, new AqS135S0200000_4((GlobalAddressItemViewHolder) au2S1S0310000_4.l0, (Address) au2S1S0310000_4.l1, 171));
            LIZ.LJII = true;
            LIZ.LJI().LIZLLL();
        }
    }

    public static final void LIZ$1(Au2S1S0310000_4 au2S1S0310000_4, View view) {
        if (view != null) {
            View view2 = ((GlobalAddressItemViewHolder) au2S1S0310000_4.l0).itemView;
            C78946Uyc.LJJIIJ(view2, OUR.LIZLLL(view2, "itemView"), new AqS19S0310000_4((Address) au2S1S0310000_4.l1, (C26634Aco) au2S1S0310000_4.l2, (GlobalAddressItemViewHolder) au2S1S0310000_4.l0, au2S1S0310000_4.z3, 2));
            AddressListViewModel L = ((GlobalAddressItemViewHolder) au2S1S0310000_4.l0).L();
            Context context = view.getContext();
            o.LJIIIIZZ(context, "it.context");
            L.Kv0(context, C78948Uye.LJIILIIL(view), (Address) au2S1S0310000_4.l1);
        }
    }

    public static final void LIZ$2(Au2S1S0310000_4 au2S1S0310000_4, View view) {
        if (view != null) {
            View view2 = ((GlobalAddressItemViewHolder) au2S1S0310000_4.l0).itemView;
            C78946Uyc.LJJIIJ(view2, OUR.LIZLLL(view2, "itemView"), new AqS19S0310000_4((Address) au2S1S0310000_4.l1, (C26634Aco) au2S1S0310000_4.l2, (GlobalAddressItemViewHolder) au2S1S0310000_4.l0, au2S1S0310000_4.z3, 3));
            ((GlobalAddressItemViewHolder) au2S1S0310000_4.l0).L().Sv0((Address) au2S1S0310000_4.l1);
        }
    }

    public static final void LIZ$3(Au2S1S0310000_4 au2S1S0310000_4, View view) {
        Object obj;
        String str;
        if (view != null) {
            ((GlobalDiscountVH) au2S1S0310000_4.l0).L().LLILZIL = ((C27724AuO) au2S1S0310000_4.l1).LIZIZ;
            C70376Rjg c70376Rjg = InterfaceC27046AjS.LIZ;
            Context context = ((View) au2S1S0310000_4.l2).getContext();
            String str2 = ((C27724AuO) au2S1S0310000_4.l1).LIZLLL;
            if (str2 == null) {
                str2 = "";
            }
            HashMap<String, Object> hashMap = ((GlobalDiscountVH) au2S1S0310000_4.l0).L().LLIL;
            if (hashMap != null) {
                obj = hashMap.get("entrance_info");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            HashMap<String, Object> hashMap2 = ((GlobalDiscountVH) au2S1S0310000_4.l0).L().LLIL;
            String str3 = ((C27724AuO) au2S1S0310000_4.l1).LIZIZ;
            o.LJIIIIZZ(context, "context");
            C70376Rjg.LIZLLL(c70376Rjg, context, str2, str3, 3, str, hashMap2);
            C78946Uyc.LJJIIJ((View) au2S1S0310000_4.l2, new C70919RsR(), new AqS28S0210000_4((C27724AuO) au2S1S0310000_4.l1, (GlobalDiscountVH) au2S1S0310000_4.l0, au2S1S0310000_4.z3, 8));
        }
    }

    public static final void LIZ$4(Au2S1S0310000_4 au2S1S0310000_4, View view) {
        Object obj;
        String str;
        if (view != null) {
            ((TtfDiscountVH) au2S1S0310000_4.l0).L().LLILZIL = ((C27724AuO) au2S1S0310000_4.l1).LIZIZ;
            C70376Rjg c70376Rjg = InterfaceC27046AjS.LIZ;
            Context context = ((View) au2S1S0310000_4.l2).getContext();
            String str2 = ((C27724AuO) au2S1S0310000_4.l1).LIZLLL;
            if (str2 == null) {
                str2 = "";
            }
            HashMap<String, Object> hashMap = ((TtfDiscountVH) au2S1S0310000_4.l0).L().LLIL;
            if (hashMap != null) {
                obj = hashMap.get("entrance_info");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            HashMap<String, Object> hashMap2 = ((TtfDiscountVH) au2S1S0310000_4.l0).L().LLIL;
            String str3 = ((C27724AuO) au2S1S0310000_4.l1).LIZIZ;
            o.LJIIIIZZ(context, "context");
            C70376Rjg.LIZLLL(c70376Rjg, context, str2, str3, 1, str, hashMap2);
            C78946Uyc.LJJIIJ((View) au2S1S0310000_4.l2, new C70919RsR(), new AqS28S0210000_4((C27724AuO) au2S1S0310000_4.l1, (TtfDiscountVH) au2S1S0310000_4.l0, au2S1S0310000_4.z3, 12));
        }
    }

    public static final void LIZ$5(Au2S1S0310000_4 au2S1S0310000_4, View view) {
        if (view != null) {
            View view2 = ((USLogisticSelectAddressItemVH) au2S1S0310000_4.l0).itemView;
            C78946Uyc.LJJIIJ(view2, OUR.LIZLLL(view2, "itemView"), new AqS19S0310000_4((Address) au2S1S0310000_4.l2, (ReachableAddress) au2S1S0310000_4.l1, (USLogisticSelectAddressItemVH) au2S1S0310000_4.l0, au2S1S0310000_4.z3, 6));
            if (au2S1S0310000_4.z3) {
                ((AddressSelectViewModel) ((USLogisticSelectAddressItemVH) au2S1S0310000_4.l0).LJLIL.getValue()).Mv0((ReachableAddress) au2S1S0310000_4.l1);
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public Au2S1S0310000_4(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r4, X.C26634Aco r5, com.ss.android.ugc.aweme.ecommerce.global.address.list.module.addressitem.GlobalAddressItemViewHolder r6, boolean r7, int r8) {
        /*
            r3 = this;
            r3.$t = r8
            switch(r8) {
                case 0: goto L14;
                default: goto L5;
            }
        L5:
            r2 = r3
            r2.l0 = r6
            r2.l1 = r4
            r2.z3 = r7
            r2.l2 = r5
            r0 = 700(0x2bc, double:3.46E-321)
        L10:
            r2.<init>(r0)
            return
        L14:
            r2 = r3
            r2.l0 = r6
            r2.z3 = r7
            r2.l1 = r4
            r2.l2 = r5
            r0 = 700(0x2bc, double:3.46E-321)
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.Au2S1S0310000_4.<init>(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address, X.Aco, com.ss.android.ugc.aweme.ecommerce.global.address.list.module.addressitem.GlobalAddressItemViewHolder, boolean, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S1S0310000_4(Object obj, Object obj2, Object obj3, boolean z, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.z3 = z;
    }
}

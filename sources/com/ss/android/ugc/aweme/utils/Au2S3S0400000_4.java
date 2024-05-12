package com.ss.android.ugc.aweme.utils;

import X.AbstractC73230Soc;
import X.C26045AKb;
import X.C26635Acp;
import X.C26790AfK;
import X.C26792AfM;
import X.C26804AfY;
import X.C26965Ai9;
import X.C26968AiC;
import X.C27067Ajn;
import X.C27068Ajo;
import X.C27069Ajp;
import X.C27729AuT;
import X.C27730AuU;
import X.C27945Axx;
import X.C27947Axz;
import X.C27949Ay1;
import X.C27959AyB;
import X.C28145B2v;
import X.C34K;
import X.C5H3;
import X.C70917RsP;
import X.C70919RsR;
import X.C70922RsU;
import X.C73227SoZ;
import X.C78565UsT;
import X.C78946Uyc;
import X.C78948Uye;
import X.OUR;
import X.TAT;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.discount.PlatformDiscountsVH;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.shop.MainOrderInfoVH;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BonusInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.policy.PdpPolicyHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail;
import com.ss.android.ugc.aweme.ecommerce.global.osp.module.shop.GlobalMainOrderInfoVH;
import com.ss.android.ugc.aweme.ecommerce.ttf.osp.module.shop.TtfShopInfoVH;
import com.ss.android.ugc.aweme.ecommerce.tts.addresslist.us.addressitem.UsAddressItemVH;
import com.ss.android.ugc.aweme.ecommerce.us.osp.module.shop.USMainOrderInfoVH;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS50S0400000_4;
import kotlin.jvm.internal.IDqS183S0200000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class Au2S3S0400000_4 extends TAT {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
            case 6:
                LIZ$6(this, view);
                return;
            case 7:
                LIZ$7(this, view);
                return;
            case 8:
                LIZ$8(this, view);
                return;
            case 9:
                LIZ$9(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    public static final void LIZ$0(Au2S3S0400000_4 au2S3S0400000_4, View view) {
        if (view != null) {
            View view2 = ((UsAddressItemVH) au2S3S0400000_4.l0).itemView;
            C78946Uyc.LJJIIJ(view2, OUR.LIZLLL(view2, "itemView"), new AqS50S0400000_4((Address) au2S3S0400000_4.l1, (UsAddressItemVH) au2S3S0400000_4.l0, (C26635Acp) au2S3S0400000_4.l3, (C34K) au2S3S0400000_4.l2, 0));
            AddressListViewModel L = ((UsAddressItemVH) au2S3S0400000_4.l0).L();
            Context context = view.getContext();
            o.LJIIIIZZ(context, "it.context");
            L.Kv0(context, C78948Uye.LJIILIIL(view), (Address) au2S3S0400000_4.l1);
        }
    }

    public static final void LIZ$1(Au2S3S0400000_4 au2S3S0400000_4, View view) {
        String str;
        if (view != null) {
            View view2 = ((UsAddressItemVH) au2S3S0400000_4.l0).itemView;
            C78946Uyc.LJJIIJ(view2, OUR.LIZLLL(view2, "itemView"), new AqS50S0400000_4((Address) au2S3S0400000_4.l2, (UsAddressItemVH) au2S3S0400000_4.l0, (C26635Acp) au2S3S0400000_4.l3, (C34K) au2S3S0400000_4.l1, 1));
            if (((C34K) au2S3S0400000_4.l1).element) {
                if (((UsAddressItemVH) au2S3S0400000_4.l0).L().Nv0() || ((UsAddressItemVH) au2S3S0400000_4.l0).L().Ov0()) {
                    ((UsAddressItemVH) au2S3S0400000_4.l0).L().Rv0((Address) au2S3S0400000_4.l2);
                    return;
                }
                AddressListViewModel L = ((UsAddressItemVH) au2S3S0400000_4.l0).L();
                Context context = view.getContext();
                o.LJIIIIZZ(context, "view.context");
                L.Kv0(context, C78948Uye.LJIILIIL(view), (Address) au2S3S0400000_4.l2);
                return;
            }
            Integer num = ((UsAddressItemVH) au2S3S0400000_4.l0).L().LJZ;
            if (num == null || num.intValue() != 4 || !o.LJ(((C26635Acp) au2S3S0400000_4.l3).LJFF, Boolean.FALSE) || (str = ((C26635Acp) au2S3S0400000_4.l3).LJI) == null) {
                return;
            }
            View itemView = ((UsAddressItemVH) au2S3S0400000_4.l0).itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C26045AKb c26045AKb = new C26045AKb(itemView);
            c26045AKb.LJIIIZ(str);
            c26045AKb.LJIIJ();
        }
    }

    public static final void LIZ$2(Au2S3S0400000_4 au2S3S0400000_4, View view) {
        if (view != null) {
            PdpPolicyHolder pdpPolicyHolder = (PdpPolicyHolder) au2S3S0400000_4.l0;
            C78565UsT.LJJIJIIJIL(pdpPolicyHolder.LJLIL, new C26790AfK((Map) au2S3S0400000_4.l1, (C5H3) au2S3S0400000_4.l2, pdpPolicyHolder, (C26792AfM) au2S3S0400000_4.l3, null));
        }
    }

    public static final void LIZ$3(Au2S3S0400000_4 au2S3S0400000_4, View view) {
        if (view != null) {
            View view2 = ((USMainOrderInfoVH) au2S3S0400000_4.l0).itemView;
            C78946Uyc.LJJIIJ(view2, OUR.LIZLLL(view2, "itemView"), new AqS170S0100000_4((HashMap) au2S3S0400000_4.l1, (HashMap<String, Object>) 362));
            FragmentManager fragmentManager = ((USMainOrderInfoVH) au2S3S0400000_4.l0).LJLILLLLZI.getFragmentManager();
            if (fragmentManager != null) {
                C27947Axz c27947Axz = (C27947Axz) au2S3S0400000_4.l2;
                UserRightDetail userRightDetail = (UserRightDetail) au2S3S0400000_4.l3;
                HashMap hashMap = (HashMap) au2S3S0400000_4.l1;
                Context context = c27947Axz.LJLILLLLZI.itemView.getContext();
                o.LJIIIIZZ(context, "itemView.context");
                TuxTextView LIZJ = C26968AiC.LIZJ(context, R.attr.go, userRightDetail.description);
                String str = userRightDetail.name;
                if (str == null) {
                    str = "";
                }
                C26968AiC.LJFF(C26968AiC.LIZ(LIZJ, str, new IDqS183S0200000_4(c27947Axz.LJLILLLLZI, (USMainOrderInfoVH) hashMap, (HashMap<String, Object>) 4)), fragmentManager, "tag_free_return", null, 8);
                View itemView = ((USMainOrderInfoVH) au2S3S0400000_4.l0).itemView;
                o.LJIIIIZZ(itemView, "itemView");
                C78946Uyc.LJJIIJ(itemView, new C70922RsU(), new AqS170S0100000_4((HashMap) au2S3S0400000_4.l1, (HashMap<String, Object>) 363));
            }
        }
    }

    public static final void LIZ$4(Au2S3S0400000_4 au2S3S0400000_4, View view) {
        if (view != null) {
            View view2 = ((USMainOrderInfoVH) au2S3S0400000_4.l0).itemView;
            C78946Uyc.LJJIIJ(view2, OUR.LIZLLL(view2, "itemView"), new AqS170S0100000_4((HashMap) au2S3S0400000_4.l1, (HashMap<String, Object>) 364));
            USMainOrderInfoVH uSMainOrderInfoVH = (USMainOrderInfoVH) au2S3S0400000_4.l0;
            C78565UsT.LJJIJIIJIL(uSMainOrderInfoVH.LJLILLLLZI, new C27067Ajn((C27959AyB) au2S3S0400000_4.l2, uSMainOrderInfoVH, (UserRightDetail) au2S3S0400000_4.l3, (HashMap) au2S3S0400000_4.l1, null));
        }
    }

    public static final void LIZ$5(Au2S3S0400000_4 au2S3S0400000_4, View view) {
        if (view != null) {
            View view2 = ((GlobalMainOrderInfoVH) au2S3S0400000_4.l0).itemView;
            C78946Uyc.LJJIIJ(view2, OUR.LIZLLL(view2, "itemView"), new AqS170S0100000_4((HashMap) au2S3S0400000_4.l1, (HashMap<String, Object>) 341));
            FragmentManager fragmentManager = ((GlobalMainOrderInfoVH) au2S3S0400000_4.l0).LJLILLLLZI.getFragmentManager();
            if (fragmentManager != null) {
                C27945Axx c27945Axx = (C27945Axx) au2S3S0400000_4.l2;
                UserRightDetail userRightDetail = (UserRightDetail) au2S3S0400000_4.l3;
                HashMap hashMap = (HashMap) au2S3S0400000_4.l1;
                Context context = c27945Axx.LJLJJI.itemView.getContext();
                o.LJIIIIZZ(context, "itemView.context");
                TuxTextView LIZJ = C26968AiC.LIZJ(context, R.attr.gx, userRightDetail.description);
                String str = userRightDetail.name;
                if (str == null) {
                    str = "";
                }
                C26968AiC.LJFF(C26968AiC.LIZ(LIZJ, str, new IDqS183S0200000_4(c27945Axx.LJLJJI, (GlobalMainOrderInfoVH) hashMap, (HashMap<String, Object>) 3)), fragmentManager, "tag_free_return", null, 8);
                View itemView = ((GlobalMainOrderInfoVH) au2S3S0400000_4.l0).itemView;
                o.LJIIIIZZ(itemView, "itemView");
                C78946Uyc.LJJIIJ(itemView, new C70922RsU(), new AqS170S0100000_4((HashMap) au2S3S0400000_4.l1, (HashMap<String, Object>) 342));
            }
        }
    }

    public static final void LIZ$6(Au2S3S0400000_4 au2S3S0400000_4, View view) {
        if (view != null) {
            View view2 = ((GlobalMainOrderInfoVH) au2S3S0400000_4.l0).itemView;
            C78946Uyc.LJJIIJ(view2, OUR.LIZLLL(view2, "itemView"), new AqS170S0100000_4((HashMap) au2S3S0400000_4.l1, (HashMap<String, Object>) 343));
            GlobalMainOrderInfoVH globalMainOrderInfoVH = (GlobalMainOrderInfoVH) au2S3S0400000_4.l0;
            C78565UsT.LJJIJIIJIL(globalMainOrderInfoVH.LJLILLLLZI, new C27068Ajo((C27959AyB) au2S3S0400000_4.l2, globalMainOrderInfoVH, (UserRightDetail) au2S3S0400000_4.l3, (HashMap) au2S3S0400000_4.l1, null));
        }
    }

    public static final void LIZ$7(Au2S3S0400000_4 au2S3S0400000_4, View view) {
        if (view != null) {
            C28145B2v.LIZ((View) au2S3S0400000_4.l0, ((BonusInfo) au2S3S0400000_4.l1).redeemInfo, C27729AuT.LJLIL, C27730AuU.LJLIL, null);
            C78946Uyc.LJJIIJ((View) au2S3S0400000_4.l0, new C70919RsR(), new AqS135S0200000_4((PlatformDiscountsVH) au2S3S0400000_4.l2, (PlatformDiscountsVH) au2S3S0400000_4.l3, (HashMap<String, Object>) 262));
            C78946Uyc.LJJIIJ((View) au2S3S0400000_4.l0, new C70917RsP(), new AqS170S0100000_4((PlatformDiscountsVH) au2S3S0400000_4.l2, 1349));
        }
    }

    public static final void LIZ$8(Au2S3S0400000_4 au2S3S0400000_4, View view) {
        if (view != null) {
            ((View) au2S3S0400000_4.l0).findViewById(R.id.d1d).setVisibility(8);
            AbstractC73230Soc abstractC73230Soc = (AbstractC73230Soc) ((TtfShopInfoVH) au2S3S0400000_4.l1).LJLJJI.getValue();
            List<C26965Ai9> list = ((C26804AfY) au2S3S0400000_4.l2).LIZLLL;
            abstractC73230Soc.getClass();
            C73227SoZ.LIZ(abstractC73230Soc, list);
            HashMap<String, Object> fw0 = ((TtfShopInfoVH) au2S3S0400000_4.l1).L().fw0(false);
            fw0.put("tag_text", ((OrderSubmitState) au2S3S0400000_4.l3).getTotalDesc());
            C27949Ay1.LJJI("show_all_items", fw0, null, null, null, null, null, null, null, 1020);
        }
    }

    public static final void LIZ$9(Au2S3S0400000_4 au2S3S0400000_4, View view) {
        if (view != null) {
            View view2 = ((MainOrderInfoVH) au2S3S0400000_4.l0).itemView;
            C78946Uyc.LJJIIJ(view2, OUR.LIZLLL(view2, "itemView"), new AqS170S0100000_4((HashMap) au2S3S0400000_4.l1, (HashMap<String, Object>) 248));
            MainOrderInfoVH mainOrderInfoVH = (MainOrderInfoVH) au2S3S0400000_4.l0;
            C78565UsT.LJJIJIIJIL(mainOrderInfoVH.LJLILLLLZI, new C27069Ajp((C27959AyB) au2S3S0400000_4.l2, mainOrderInfoVH, (UserRightDetail) au2S3S0400000_4.l3, (HashMap) au2S3S0400000_4.l1, null));
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public Au2S3S0400000_4(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r4, com.ss.android.ugc.aweme.ecommerce.tts.addresslist.us.addressitem.UsAddressItemVH r5, X.C26635Acp r6, X.C34K r7, int r8) {
        /*
            r3 = this;
            r3.$t = r8
            switch(r8) {
                case 0: goto L14;
                default: goto L5;
            }
        L5:
            r2 = r3
            r2.l0 = r5
            r2.l1 = r7
            r2.l2 = r4
            r2.l3 = r6
            r0 = 700(0x2bc, double:3.46E-321)
        L10:
            r2.<init>(r0)
            return
        L14:
            r2 = r3
            r2.l0 = r5
            r2.l1 = r4
            r2.l2 = r7
            r2.l3 = r6
            r0 = 700(0x2bc, double:3.46E-321)
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.Au2S3S0400000_4.<init>(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address, com.ss.android.ugc.aweme.ecommerce.tts.addresslist.us.addressitem.UsAddressItemVH, X.Acp, X.34K, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S3S0400000_4(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}

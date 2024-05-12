package com.ss.android.ugc.aweme.ecommerce.fashionmall.ui;

import X.C113554cx;
import X.C16880lQ;
import X.C214298b3;
import X.C36746EbW;
import X.C55819LvT;
import X.C55820LvU;
import X.C55823LvX;
import X.C56045Lz7;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76542zS;
import X.C78565UsT;
import X.C78926UyI;
import X.C9BE;
import X.E2C;
import X.InterfaceC60061Nhh;
import X.InterfaceC88472Yns;
import X.MBB;
import X.OSZ;
import X.TBT;
import X.X1D;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.FashionMallFragment;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.utils.Au2S0S1300000_9;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes10.dex */
public final class MallShopCartAssem extends UIContentAssem implements InterfaceC60061Nhh {
    public final C214298b3 LJLIL;
    public boolean LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public MallShopCartAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ShopMainViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS159S0100000_9(LIZ, 108), C55820LvU.INSTANCE, null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        EventCenter.LJ().LIZIZ("ec_cart_refresh", this);
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C36746EbW.LIZ(3, "onViewCreated");
        ((TuxAlertBadgeLayout) _$_findCachedViewById(R.id.jyt)).LIZIZ();
        C56045Lz7 c56045Lz7 = C56045Lz7.LIZ;
        OSZ[] oszArr = new OSZ[2];
        oszArr[0] = new OSZ("notice_number", CardStruct.IStatusCode.DEFAULT);
        FashionMallFragment.LJZ.getClass();
        String str = FashionMallFragment.LJZI;
        if (str == null) {
            str = "";
        }
        oszArr[1] = new OSZ("previous_page", str);
        Map LJJL = C113554cx.LJJL(oszArr);
        c56045Lz7.getClass();
        ConcurrentHashMap<String, Integer> concurrentHashMap = C56045Lz7.LIZIZ;
        Integer num = concurrentHashMap.get("tiktokec_cart_entrance_show_test");
        if (num == null) {
            num = Integer.MAX_VALUE;
        }
        int intValue = num.intValue();
        if (intValue > 0) {
            if (intValue != Integer.MAX_VALUE) {
                concurrentHashMap.put("tiktokec_cart_entrance_show_test", Integer.valueOf(intValue - 1));
            }
            C76542zS.LIZJ("tiktokec_cart_entrance_show_test", new AqS174S0100000_8(LJJL, (Map<String, String>) 200));
        }
        v3("sslocal://webcast_lynxview?hide_nav_bar=1&use_new_container=1&trans_status_bar=1&hide_status_bar=0&trackParams=%7B%22previous_page%22%3A%22mall%22%2C%22enter_from%22%3A%22mall%22%7D&url=https%3A%2F%2Flf19-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ffe_tiktok_ecommerce_shop_cart%2Fall%2Fpages%2Fmain%2Ftemplate.js", E2C.LIZJ("notice_number", CardStruct.IStatusCode.DEFAULT), new C55819LvT(c56045Lz7));
        if (!this.LJLILLLLZI) {
            this.LJLILLLLZI = true;
            EventCenter.LJ().LIZJ("ec_cart_refresh", this);
        }
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.LvV
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C55978Ly2) obj).LJLJJL;
            }
        }, null, null, null, new AqS175S0100000_9(this, 517), 14, null);
    }

    @Override // X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        o.LJIIIZ(eventName, "eventName");
        if (o.LJ(eventName, "ec_cart_refresh")) {
            C78565UsT.LJJIIZI(this, MBB.INSTANCE, new C55823LvX(str, this, null));
        }
    }

    public final void v3(String str, Map map, InterfaceC88472Yns interfaceC88472Yns) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("shop cart schema ");
        LIZ.append(str);
        C36746EbW.LIZ(3, X1D.LIZIZ(LIZ));
        View shopping_cart = _$_findCachedViewById(R.id.jys);
        o.LJIIIIZZ(shopping_cart, "shopping_cart");
        C16880lQ.LJIIJ(new Au2S0S1300000_9(str, interfaceC88472Yns, map, this, 0), shopping_cart);
    }
}

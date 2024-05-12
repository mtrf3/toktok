package com.ss.android.ugc.aweme.utils;

import X.C27740Aue;
import X.C40925G4j;
import X.C78450Uqc;
import X.InterfaceC65895Ptb;
import X.InterfaceC82683Wch;
import X.InterfaceC88472Yns;
import X.TAT;
import Y.IDeS355S0100000_9;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.ui.MallShopCartAssem;
import java.util.Map;
import kotlin.jvm.internal.AqS64S1200000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class Au2S0S1300000_9 extends TAT {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // X.TAT
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    public static final void LIZ$0(Au2S0S1300000_9 au2S0S1300000_9, View view) {
        if (view != null) {
            Uri.Builder buildUpon = UriProtector.parse(au2S0S1300000_9.s0).buildUpon();
            buildUpon.appendQueryParameter("target_handler", "ecom,webcast");
            buildUpon.appendQueryParameter("business_from", "ecom");
            buildUpon.appendQueryParameter("previous_page", "mall");
            buildUpon.appendQueryParameter("init_time", String.valueOf(System.currentTimeMillis()));
            String builder = buildUpon.toString();
            o.LJIIIIZZ(builder, "builder.toString()");
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) au2S0S1300000_9.l1;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke((Map) au2S0S1300000_9.l2);
            }
            Context context = ((MallShopCartAssem) au2S0S1300000_9.l3).getContext();
            if (context != null) {
                MallShopCartAssem mallShopCartAssem = (MallShopCartAssem) au2S0S1300000_9.l3;
                AqS64S1200000_9 aqS64S1200000_9 = new AqS64S1200000_9(context, mallShopCartAssem, builder, 3);
                mallShopCartAssem.getClass();
                IAccountService LJIJ = AccountService.LJIJ();
                if (!LJIJ.LJFF().isLogin()) {
                    InterfaceC65895Ptb LJI = LJIJ.LJI();
                    C78450Uqc c78450Uqc = new C78450Uqc();
                    c78450Uqc.LIZ = C27740Aue.LIZ(context);
                    c78450Uqc.LJ = new IDeS355S0100000_9(aqS64S1200000_9, 3);
                    C40925G4j.LIZ(c78450Uqc, LJI);
                    return;
                }
                aqS64S1200000_9.invoke();
            }
        }
    }

    public static final void LIZ$1(Au2S0S1300000_9 au2S0S1300000_9, View view) {
        String str;
        if (view != null) {
            Map map = (Map) au2S0S1300000_9.l1;
            InterfaceC82683Wch interfaceC82683Wch = ((com.ss.android.ugc.aweme.ecommerce.mall.ui.MallShopCartAssem) au2S0S1300000_9.l2).LJLILLLLZI;
            if (interfaceC82683Wch != null && interfaceC82683Wch.isShowing()) {
                str = "bubble";
            } else {
                str = "";
            }
            map.put("notice_type", str);
            ((com.ss.android.ugc.aweme.ecommerce.mall.ui.MallShopCartAssem) au2S0S1300000_9.l2).v3((Map) au2S0S1300000_9.l1, (InterfaceC88472Yns) au2S0S1300000_9.l3, au2S0S1300000_9.s0, "button");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S0S1300000_9(String str, Object obj, Object obj2, Object obj3, int i) {
        super(700L);
        this.$t = i;
        this.s0 = str;
        this.l1 = obj;
        this.l2 = obj2;
        this.l3 = obj3;
    }
}

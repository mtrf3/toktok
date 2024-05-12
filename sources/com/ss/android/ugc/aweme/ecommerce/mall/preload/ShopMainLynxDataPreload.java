package com.ss.android.ugc.aweme.ecommerce.mall.preload;

import X.AbstractC73672Svk;
import X.C113554cx;
import X.C16880lQ;
import X.C36669EaH;
import X.C36746EbW;
import X.C38827FLr;
import X.C51741KSj;
import X.C51749KSr;
import X.C56092Lzs;
import X.C56662Kg;
import X.C64797Pbt;
import X.EnumC51775KTr;
import X.InterfaceC88472Yns;
import X.K1H;
import X.OSZ;
import X.X8M;
import android.os.Bundle;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.repository.LynxMallApiWithPreload;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes9.dex */
public final class ShopMainLynxDataPreload implements X8M<LynxMallApiWithPreload, AbstractC73672Svk<C64797Pbt<Response<Map<String, ? extends Object>>>>> {
    public static final K1H Companion = new K1H();
    public static boolean isPrefetch;

    @Override // X.X8D
    public boolean enable(Bundle bundle) {
        return true;
    }

    @Override // X.X8M
    public C38827FLr getPreloadStrategy(Bundle bundle) {
        return new C38827FLr(30000, "https://oec-api.tiktokv.com/", true);
    }

    @Override // X.X8M
    public boolean handleException(Exception exception) {
        o.LJIIIZ(exception, "exception");
        C16880lQ.LLLLIIL(exception);
        return true;
    }

    @Override // X.X8M
    public AbstractC73672Svk<C64797Pbt<Response<Map<String, ? extends Object>>>> preload(Bundle bundle, InterfaceC88472Yns<? super Class<LynxMallApiWithPreload>, ? extends LynxMallApiWithPreload> create) {
        String str;
        boolean z;
        EnumC51775KTr enumC51775KTr;
        o.LJIIIZ(create, "create");
        C36746EbW.LIZ(3, "ShopTabV3 Prefetch Preload RealStartPreload");
        long currentTimeMillis = System.currentTimeMillis() - C56662Kg.LIZ().LJIIJ;
        C56092Lzs.LIZ.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(currentTimeMillis));
        hashMap.put("enter_from", C56092Lzs.LIZLLL());
        C56092Lzs.LJIILJJIL("rd_tiktokec_mall_preload_time", hashMap);
        LynxMallApiWithPreload invoke = create.invoke(LynxMallApiWithPreload.class);
        String str2 = "";
        if (bundle == null || (str = bundle.getString("diversion_params", "")) == null) {
            str = "";
        }
        int LJ = C51741KSj.LJ();
        String LIZJ = a.LJIIZILJ().LIZJ();
        if (LIZJ != null) {
            str2 = LIZJ;
        }
        if (C51749KSr.LIZ() != 0) {
            z = true;
        } else {
            z = false;
        }
        AbstractC73672Svk<C64797Pbt<Response<Map<String, Object>>>> shopMainDataPreload = invoke.getShopMainDataPreload("https://oec-api.tiktokv.com/api/v1/mall/homepage/lynx/get", "ttmall_homepage", 0, LJ, str2, z, str);
        OSZ[] oszArr = new OSZ[2];
        if (isPrefetch) {
            enumC51775KTr = EnumC51775KTr.PREFETCH;
        } else {
            enumC51775KTr = EnumC51775KTr.PRELOAD;
        }
        oszArr[0] = new OSZ("mall_request_type", Integer.valueOf(enumC51775KTr.getType()));
        oszArr[1] = new OSZ("mall_request_scene", "ttmall_homepage");
        return C36669EaH.LIZJ(shopMainDataPreload, C113554cx.LJJL(oszArr));
    }
}

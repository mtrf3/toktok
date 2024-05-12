package com.ss.android.ugc.aweme.ecommerce.fashionmall.preload;

import X.AbstractC73672Svk;
import X.C113554cx;
import X.C16880lQ;
import X.C36669EaH;
import X.C36746EbW;
import X.C38827FLr;
import X.C52997Kr3;
import X.C55909Lwv;
import X.C55911Lwx;
import X.C56045Lz7;
import X.C56662Kg;
import X.C64797Pbt;
import X.C76542zS;
import X.EnumC56006LyU;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.X8M;
import android.os.Bundle;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.api.MallApiWithPreload;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.ShopMainResponse;
import kotlin.jvm.internal.AqS18S0000100_8;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ShopMainDataPreload implements X8M<MallApiWithPreload, AbstractC73672Svk<C64797Pbt<Response<ShopMainResponse>>>> {
    public static final C55911Lwx Companion = new C55911Lwx();
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

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.X8M
    public AbstractC73672Svk<C64797Pbt<Response<ShopMainResponse>>> preload(Bundle bundle, InterfaceC88472Yns<? super Class<MallApiWithPreload>, ? extends MallApiWithPreload> create) {
        boolean z;
        EnumC56006LyU enumC56006LyU;
        o.LJIIIZ(create, "create");
        C36746EbW.LIZ(3, "ec_prefetch ECColdStartFetchTask preload()");
        long currentTimeMillis = System.currentTimeMillis() - C56662Kg.LIZ().LJIIJ;
        C56045Lz7.LIZ.getClass();
        C76542zS.LIZJ("rd_tiktokec_mall_preload_time", new AqS18S0000100_8(currentTimeMillis, 0));
        MallApiWithPreload invoke = create.invoke(MallApiWithPreload.class);
        int LIZLLL = C55909Lwv.LIZLLL();
        if (((Number) C52997Kr3.LIZ.getValue()).intValue() != 0) {
            z = true;
        } else {
            z = false;
        }
        AbstractC73672Svk<C64797Pbt<Response<ShopMainResponse>>> shopMainDataPreload = invoke.getShopMainDataPreload("https://oec-api.tiktokv.com/api/v1/ttf_mall/homepage/get", "ttmall_homepage", 0, LIZLLL, "", z);
        OSZ[] oszArr = new OSZ[2];
        if (isPrefetch) {
            enumC56006LyU = EnumC56006LyU.PREFETCH;
        } else {
            enumC56006LyU = EnumC56006LyU.PRELOAD;
        }
        oszArr[0] = new OSZ("mall_request_type", Integer.valueOf(enumC56006LyU.getType()));
        oszArr[1] = new OSZ("mall_request_scene", "ttmall_homepage");
        return C36669EaH.LIZJ(shopMainDataPreload, C113554cx.LJJL(oszArr));
    }
}

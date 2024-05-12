package com.ss.android.ugc.aweme.ecommercelive.framework.serviceimpl;

import X.C00F;
import X.C221108m2;
import X.C40197Fq5;
import X.C58096Mr6;
import X.C62822Ol8;
import X.C66832jn;
import X.C70573Rmr;
import X.C71154RwE;
import X.C71156RwG;
import X.C71158RwI;
import X.C71160RwK;
import X.C71183Rwh;
import X.C71471S3f;
import X.C71873SIr;
import X.C75182xG;
import X.C75192xH;
import X.C76800UCe;
import X.C780334l;
import X.C78613UtF;
import X.EnumC58928NAu;
import X.InterfaceC70422pa;
import X.XKX;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.gson.m;
import com.ss.android.ugc.aweme.ecommerce.ECommerceHybridServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECommerceService;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.AudienceApi;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.config.EcWidgetLoadPriorityConfig;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.config.PrefetchPinConfig;
import com.ss.android.ugc.aweme.ecommercelive.business.cache.LiveExposedProductsCache;
import com.ss.android.ugc.aweme.ecommercelive.service.IEcommerceLiveService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ECommerceLiveServiceImpl implements IEcommerceLiveService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C71160RwK.LJLIL);

    public static IEcommerceLiveService LJFF() {
        Object LIZ = C58096Mr6.LIZ(IEcommerceLiveService.class, false);
        if (LIZ != null) {
            return (IEcommerceLiveService) LIZ;
        }
        if (C58096Mr6.l0 == null) {
            synchronized (IEcommerceLiveService.class) {
                if (C58096Mr6.l0 == null) {
                    C58096Mr6.l0 = new ECommerceLiveServiceImpl();
                }
            }
        }
        return C58096Mr6.l0;
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.service.IEcommerceLiveService
    public final boolean C9() {
        C71156RwG.LIZ.getClass();
        return ((EcWidgetLoadPriorityConfig) C71156RwG.LIZJ.getValue()).loadPinCardAsP0;
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.service.IEcommerceLiveService
    public final C71873SIr LIZ() {
        return (C71873SIr) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.service.IEcommerceLiveService
    public final C71471S3f LIZJ() {
        return new C71471S3f();
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.service.IEcommerceLiveService
    public final boolean V9() {
        C71158RwI.LIZ.getClass();
        return ((PrefetchPinConfig) C71158RwI.LIZJ.getValue()).isEnabled;
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.service.IEcommerceLiveService
    public final boolean c4() {
        C71156RwG.LIZ.getClass();
        return ((EcWidgetLoadPriorityConfig) C71156RwG.LIZJ.getValue()).loadShopCartIconAsP0;
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.service.IEcommerceLiveService
    public final boolean q4() {
        if (C00F.LIZ(31744, 0, "ec_preload_opt_accurate_v3", true) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.service.IEcommerceLiveService
    public final List<C40197Fq5> LIZIZ() {
        return ECommerceHybridServiceImpl.LJIIIIZZ().LJFF();
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.service.IEcommerceLiveService
    public final Map<String, String> getRoomInfo() {
        return C71183Rwh.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.service.IEcommerceLiveService
    public final void setCurrentRoomId(Long l) {
        ECommerceService.createIECommerceServicebyMonsterPlugin(false).setCurrentRoomId(l);
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.service.IEcommerceLiveService
    public final m LJ(String roomId, String str) {
        o.LJIIIZ(roomId, "roomId");
        LiveExposedProductsCache.LIZ.getClass();
        return LiveExposedProductsCache.LIZIZ(roomId, str);
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.service.IEcommerceLiveService
    public final void ca(Integer num, String str, Map map) {
        C66832jn.LIZLLL(num, "rd_ec_live_enter_room_error_report", str, map);
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.service.IEcommerceLiveService
    public final void p8(long j, HashMap<String, String> hashMap, LifecycleOwner lifecycleOwner) {
        InterfaceC70422pa interfaceC70422pa;
        if (lifecycleOwner == null || (interfaceC70422pa = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
            interfaceC70422pa = C780334l.LJLIL;
        }
        C71158RwI.LIZ.getClass();
        if (((PrefetchPinConfig) C71158RwI.LIZJ.getValue()).isSync) {
            C71154RwE.LIZIZ.put(Long.valueOf(j), XKX.LIZIZ(interfaceC70422pa, C78613UtF.LIZJ, null, new C75192xH(hashMap, j, null), 2));
        } else {
            C71154RwE.LIZIZ.put(Long.valueOf(j), XKX.LIZIZ(interfaceC70422pa, null, null, new C75182xG(hashMap, j, null), 3));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.service.IEcommerceLiveService
    public final Object LIZLLL(String str, String str2, String str3, int i, C70573Rmr c70573Rmr) {
        Object LIZ = AudienceApi.LIZ.LIZ(str, str2, str3, i, c70573Rmr);
        if (LIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZ;
        }
        return C76800UCe.LIZ;
    }
}

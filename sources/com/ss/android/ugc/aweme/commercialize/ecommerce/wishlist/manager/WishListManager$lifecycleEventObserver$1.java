package com.ss.android.ugc.aweme.commercialize.ecommerce.wishlist.manager;

import X.C41190GEo;
import X.C60373Nmj;
import X.EnumC60171NjT;
import X.O1P;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class WishListManager$lifecycleEventObserver$1 implements LifecycleEventObserver {
    static {
        new WishListManager$lifecycleEventObserver$1();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        IResourceLoaderService iResourceLoaderService;
        o.LJIIIZ(lifecycleOwner, "<anonymous parameter 0>");
        o.LJIIIZ(event, "event");
        int i = C41190GEo.LIZ[event.ordinal()];
        if (i != 1) {
            if (i != 2 || (iResourceLoaderService = (IResourceLoaderService) C60373Nmj.LIZIZ().LIZ(IResourceLoaderService.class)) == null) {
                return;
            }
            iResourceLoaderService.unregisterCustomLoader(O1P.class, EnumC60171NjT.HIGH);
            return;
        }
        IResourceLoaderService iResourceLoaderService2 = (IResourceLoaderService) C60373Nmj.LIZIZ().LIZ(IResourceLoaderService.class);
        if (iResourceLoaderService2 == null) {
            return;
        }
        iResourceLoaderService2.registerCustomLoader(O1P.class, EnumC60171NjT.HIGH);
    }
}

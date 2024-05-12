package com.ss.android.ugc.aweme.live.livehostimpl;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.host.IHostCommerce;
import com.ss.android.ugc.aweme.ecommercelive.framework.serviceimpl.ECommerceLiveServiceImpl;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class LiveHostCommerce implements IHostCommerce {
    public static final LiveHostCommerce LJLIL = new LiveHostCommerce();

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final boolean C9() {
        return ECommerceLiveServiceImpl.LJFF().C9();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final boolean V9() {
        return ECommerceLiveServiceImpl.LJFF().V9();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final boolean c4() {
        return ECommerceLiveServiceImpl.LJFF().c4();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final boolean q4() {
        return ECommerceLiveServiceImpl.LJFF().q4();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final void setCurrentRoomId(Long l) {
        ECommerceLiveServiceImpl.LJFF().setCurrentRoomId(l);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final void ca(Integer num, String str, Map map) {
        ECommerceLiveServiceImpl.LJFF().ca(num, str, map);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final void p8(long j, HashMap<String, String> hashMap, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        ECommerceLiveServiceImpl.LJFF().p8(j, hashMap, lifecycleOwner);
    }
}

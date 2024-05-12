package X;

import com.ss.android.ugc.aweme.commerce.sdk.service.CommerceService;
import com.ss.android.ugc.aweme.commerce.service.EmptyCommerceService;
import com.ss.android.ugc.aweme.commerce.service.ICommerceService;

/* renamed from: X.S0i, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71396S0i {
    public static final ICommerceService LIZ() {
        ICommerceService createICommerceServicebyMonsterPlugin = CommerceService.createICommerceServicebyMonsterPlugin(false);
        if (createICommerceServicebyMonsterPlugin == null) {
            return new EmptyCommerceService();
        }
        return createICommerceServicebyMonsterPlugin;
    }
}

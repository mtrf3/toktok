package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.OrderCenterEntry;

/* renamed from: X.RyQ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71290RyQ implements Keva.OnChangeListener {
    public final /* synthetic */ OrderCenterEntry LIZ;

    public C71290RyQ(OrderCenterEntry orderCenterEntry) {
        this.LIZ = orderCenterEntry;
    }

    @Override // com.bytedance.keva.Keva.OnChangeListener
    public final void onChanged(Keva keva, String str) {
        this.LIZ.LJ();
    }
}

package X;

import android.graphics.Bitmap;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.vspotlight.SubscriptionSpotlightFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes14.dex */
public final class UFP extends C73974T1m {
    public final /* synthetic */ SubscriptionSpotlightFragment LJLILLLLZI;

    public UFP(SubscriptionSpotlightFragment subscriptionSpotlightFragment) {
        this.LJLILLLLZI = subscriptionSpotlightFragment;
    }

    @Override // X.C73974T1m
    public final void LIZJ(List<Bitmap> list) {
        SubscriptionSpotlightFragment subscriptionSpotlightFragment = this.LJLILLLLZI;
        subscriptionSpotlightFragment.getClass();
        UFQ xl = subscriptionSpotlightFragment.xl();
        List<C76876UFc> list2 = xl.LJLILLLLZI;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = ((ArrayList) list).iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new C76876UFc(null, (Bitmap) next, 0, false, null, null, null, 249));
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        list2.addAll(ORZ.LLJILJILJ(arrayList));
        subscriptionSpotlightFragment.Hl(true);
        xl.LJLZ();
        this.LJLILLLLZI.Il();
    }
}

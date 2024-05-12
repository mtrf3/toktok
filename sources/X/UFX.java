package X;

import android.graphics.Bitmap;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.vspotlight.SubscriptionSpotlightFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UFX extends AbstractC38911fr {
    public final /* synthetic */ List<C76876UFc> LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ SubscriptionSpotlightFragment LJLJJI;

    @Override // X.AbstractC38911fr
    public final void LJJIII() {
    }

    @Override // X.AbstractC38911fr
    public final void LJJIIZ(C76881UFh params) {
        o.LJIIIZ(params, "params");
        Bitmap bitmap = params.LIZIZ;
        if (bitmap == null) {
            return;
        }
        ((C76876UFc) ListProtector.get(this.LJLILLLLZI, this.LJLJI)).LIZIZ(bitmap);
        ((C76876UFc) ListProtector.get(this.LJLILLLLZI, this.LJLJI)).LIZ = null;
        ((C76876UFc) ListProtector.get(this.LJLILLLLZI, this.LJLJI)).LIZIZ = 0;
        ((C76876UFc) ListProtector.get(this.LJLILLLLZI, this.LJLJI)).LIZJ = false;
        this.LJLJJI.xl().LJLZ();
        this.LJLJJI.Hl(true);
    }

    public UFX(List<C76876UFc> list, int i, SubscriptionSpotlightFragment subscriptionSpotlightFragment) {
        this.LJLILLLLZI = list;
        this.LJLJI = i;
        this.LJLJJI = subscriptionSpotlightFragment;
    }
}

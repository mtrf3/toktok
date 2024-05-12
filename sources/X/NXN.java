package X;

import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.commercialize.feed.assem.FeedCommerceAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NXN extends AbstractC65781Prl implements InterfaceC88471Ynr<FeedCommerceAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final NXN LJLIL = new NXN();

    public NXN() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FeedCommerceAssem feedCommerceAssem, C43I<? extends Boolean> c43i) {
        FeedCommerceAssem selectSubscribe = feedCommerceAssem;
        C43I<? extends Boolean> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null) {
            if (((Boolean) c43i2.LIZ).booleanValue()) {
                DataCenter dataCenter = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).dataCenter;
                if (dataCenter != null) {
                    dataCenter.jv0(null, "on_ad_light_web_page_show");
                }
            } else {
                DataCenter dataCenter2 = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).dataCenter;
                if (dataCenter2 != null) {
                    dataCenter2.jv0(null, "on_ad_light_web_page_hide");
                }
            }
        }
        return C76800UCe.LIZ;
    }
}

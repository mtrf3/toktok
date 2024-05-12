package Y;

import X.AbstractC51036K1g;
import X.AbstractC54421LXl;
import X.C54883LgN;
import X.C60903NvH;
import X.EF7;
import X.FMX;
import X.M5G;
import X.MIV;
import android.os.Message;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import com.ss.android.ugc.aweme.prop.api.StickerPropApi;
import com.ss.android.ugc.aweme.services.NetworkStateServiceImpl;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public class ACallableS45S0201000_9 implements Callable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS45S0201000_9 aCallableS45S0201000_9) {
        switch (aCallableS45S0201000_9.i2) {
            case 0:
                C54883LgN c54883LgN = (C54883LgN) aCallableS45S0201000_9.l0;
                Message message = (Message) aCallableS45S0201000_9.l1;
                c54883LgN.getClass();
                c54883LgN.handleData((FollowFeedList) message.obj);
                return null;
            default:
                MIV miv = (MIV) aCallableS45S0201000_9.l0;
                String str = (String) aCallableS45S0201000_9.l1;
                StickerPropApi stickerPropApi = miv.LJLJLLL;
                C60903NvH.LJIIJJI().getApplicationService().getClass();
                return stickerPropApi.getStickerDetail(str, EF7.LIZLLL()).get();
        }
    }

    public static final Object call$1(ACallableS45S0201000_9 aCallableS45S0201000_9) {
        T t;
        T t2;
        switch (aCallableS45S0201000_9.i2) {
            case 0:
                ((M5G) aCallableS45S0201000_9.l0).onFailed((Exception) ((Serializable) aCallableS45S0201000_9.l1));
                return null;
            default:
                FeedFollowFragment feedFollowFragment = (FeedFollowFragment) aCallableS45S0201000_9.l0;
                final String str = (String) ((Serializable) aCallableS45S0201000_9.l1);
                feedFollowFragment.getClass();
                final int effectiveConnectionType = NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false).getEffectiveConnectionType();
                FMX.LJIIL("refresh_homepage_follow", new HashMap<String, String>(effectiveConnectionType, str) { // from class: X.8sL
                    {
                        String str2;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(effectiveConnectionType);
                        LIZ.append("");
                        put("network_status", X1D.LIZIZ(LIZ));
                        put("enter_method", str);
                        put("enter_from", "homepage_follow");
                        if (C53295Kvr.LIZ()) {
                            if (C53295Kvr.LIZJ()) {
                                str2 = "1";
                            } else {
                                str2 = CardStruct.IStatusCode.DEFAULT;
                            }
                            put("is_top_tab", str2);
                        }
                    }
                });
                AbstractC54421LXl abstractC54421LXl = feedFollowFragment.LLIFFJFJJ;
                if (abstractC54421LXl != null && (t = abstractC54421LXl.LIZ) != 0 && (t2 = t.LJLIL) != 0 && (t2 instanceof C54883LgN) && ((AbstractC51036K1g) t2).isDataEmpty()) {
                    FMX.LJIIL("no_data_refresh_page", new HashMap<String, String>(effectiveConnectionType) { // from class: X.2Mu
                        {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append(effectiveConnectionType);
                            LIZ.append("");
                            put("network_status", X1D.LIZIZ(LIZ));
                            put("enter_from", "homepage_hot");
                        }
                    });
                }
                return null;
        }
    }

    public ACallableS45S0201000_9(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}

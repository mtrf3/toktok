package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.RouteIntent;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Fp5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40135Fp5 extends AbstractC62652d3 {
    public final MutableLiveData<Boolean> LJLIL = new MutableLiveData<>(Boolean.FALSE);
    public boolean LJLILLLLZI;
    public long LJLJI;

    @Override // X.AbstractC62652d3, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String url;
        if (!this.LJLILLLLZI || routeIntent == null || (url = routeIntent.getUrl()) == null) {
            return false;
        }
        String str = "fe_tiktok_ecommerce_live_room_shop_bag%2Fpages%2Fproduct-list";
        try {
            SettingsManager.LIZLLL().getClass();
            String LJI = SettingsManager.LJI("ec_live_shopping_bag_match_pattern_url", "fe_tiktok_ecommerce_live_room_shop_bag%2Fpages%2Fproduct-list");
            o.LJIIIIZZ(LJI, "{\n        SettingsManage…etting::class.java)\n    }");
            str = LJI;
        } catch (Exception unused) {
        }
        if (!s.LJJJLZIJ(url, str, false)) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC62652d3, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final boolean matchInterceptRules(String str) {
        if (!this.LJLILLLLZI || str == null) {
            return false;
        }
        String str2 = "fe_tiktok_ecommerce_live_room_shop_bag%2Fpages%2Fproduct-list";
        try {
            SettingsManager.LIZLLL().getClass();
            String LJI = SettingsManager.LJI("ec_live_shopping_bag_match_pattern_url", "fe_tiktok_ecommerce_live_room_shop_bag%2Fpages%2Fproduct-list");
            o.LJIIIIZZ(LJI, "{\n        SettingsManage…etting::class.java)\n    }");
            str2 = LJI;
        } catch (Exception unused) {
        }
        if (!s.LJJJLZIJ(str, str2, false)) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC62652d3, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final void handleSparkContext(SparkContext sparkContext, String url) {
        o.LJIIIZ(sparkContext, "sparkContext");
        o.LJIIIZ(url, "url");
        sparkContext.LJJIJIIJIL(new CN6(this));
        sparkContext.LJJI(new C71169RwT(this));
    }
}

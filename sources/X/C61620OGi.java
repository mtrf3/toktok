package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.discover.adapter.DiscoverBannerViewHolder;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.utils.ImpressionSDKSetting;
import java.util.List;

/* renamed from: X.OGi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61620OGi implements InterfaceC59990NgY {
    public final /* synthetic */ DiscoverBannerViewHolder LIZ;

    public C61620OGi(DiscoverBannerViewHolder discoverBannerViewHolder) {
        this.LIZ = discoverBannerViewHolder;
    }

    @Override // X.InterfaceC59990NgY
    public final void LIZ(C60002Ngk c60002Ngk) {
        DiscoverBannerViewHolder discoverBannerViewHolder = this.LIZ;
        int currentItem = discoverBannerViewHolder.LJLILLLLZI.getCurrentItem();
        boolean z = ImpressionSDKSetting.LIZ().bannerShowImpression.useOnePixel;
        List<? extends Banner> list = discoverBannerViewHolder.LJLJL;
        if (list == null || list.isEmpty()) {
            return;
        }
        List<? extends Banner> list2 = discoverBannerViewHolder.LJLJL;
        Banner banner = (Banner) ListProtector.get(list2, currentItem % list2.size());
        int size = (currentItem % discoverBannerViewHolder.LJLJL.size()) + 1;
        List<? extends Banner> list3 = discoverBannerViewHolder.LJLJL;
        String LJJJJLI = C78866UxK.LJJJJLI(((Banner) ListProtector.get(list3, currentItem % list3.size())).getSchema());
        C188727au c188727au = new C188727au();
        c188727au.LJI("banner_id", banner.getBid());
        c188727au.LJI("tag_id", LJJJJLI);
        c188727au.LIZLLL(size, "client_order");
        c188727au.LIZLLL(!z ? 1 : 0, "type");
        c188727au.LJFF(Boolean.valueOf(c60002Ngk.LIZ), "effective_impression");
        c188727au.LJ(c60002Ngk.LIZIZ, "cost_time");
        c188727au.LJ(c60002Ngk.LIZJ, "view_traversal_time");
        c188727au.LJ(c60002Ngk.LIZLLL, "calculation_time");
        c188727au.LJI("impression_rect", c60002Ngk.LJ);
        c188727au.LIZIZ(c60002Ngk.LJFF, "impression_area");
        c188727au.LIZIZ(c60002Ngk.LJI, "covered_area");
        c188727au.LJFF(c60002Ngk.LJIIIZ, "obstruction_views");
        FMX.LJIIL("banner_show_impression", c188727au.LIZ);
    }
}

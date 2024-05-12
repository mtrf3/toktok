package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelLoadingOptimizationSetting;
import com.bytedance.android.livesdk.livesetting.gift.LivePrefetchGiftImageSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class CGY {
    public static final void LIZ() {
        List list;
        if (LiveGiftPanelLoadingOptimizationSetting.INSTANCE.getValue().cacheHitOptimization) {
            return;
        }
        HashMap hashMap = new HashMap();
        List<GiftPage> giftPageList = GiftManager.inst().getGiftPageList();
        float f = 0.0f;
        if (giftPageList != null && giftPageList.size() > 0) {
            Iterator<GiftPage> it = giftPageList.iterator();
            float f2 = 0.0f;
            float f3 = 0.0f;
            while (it.hasNext()) {
                List<Gift> list2 = it.next().gifts;
                if (list2 != null && list2.size() > 0) {
                    Iterator<Gift> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        f2 += 1.0f;
                        ImageModel imageModel = it2.next().image;
                        if (imageModel == null || (list = imageModel.mUrls) == null) {
                            list = C61878OQg.INSTANCE;
                        }
                        if ((!list.isEmpty()) && C15620jO.LJ(UriProtector.parse((String) ORZ.LJLLLLLL(0, list)))) {
                            f3 += 1.0f;
                        }
                    }
                }
            }
            if (f2 != 0.0f) {
                f = f3 / f2;
            }
        }
        hashMap.put("cache", String.valueOf(f));
        hashMap.put("tag", "ttlive_sdk");
        hashMap.put("gift_icon_prefetch", String.valueOf(LivePrefetchGiftImageSetting.INSTANCE.getValue()));
        BZI LIZ = C28787BRn.LIZ("ttlive_gift_icon_cache_hit");
        LIZ.LJJIFFI(hashMap);
        LIZ.LJJIIJZLJL();
        C0K2.LJII(0, "ttlive_gift_icon_cache_hit", hashMap);
    }

    public static final void LIZIZ(long j, long j2, String str) {
        HashMap hashMap = new HashMap();
        C43881HKb.LIZJ(j, hashMap, "time", "tag", "ttlive_sdk");
        C43881HKb.LIZJ(j2, hashMap, "gift_id", "gift_icon_url", str);
        if (LiveMonitorSampleSetting.INSTANCE.isReportSlardar("ttlive_gift_icon_download_time")) {
            C0K2.LJIIL(j, 0, "ttlive_gift_icon_download_time", hashMap);
        }
        C29822Bn8.LIZIZ("ttlive_gift_icon_download_time", hashMap);
    }
}

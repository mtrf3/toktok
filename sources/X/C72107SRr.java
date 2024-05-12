package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.model.ItemTab;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.tiktok.ConvertHelper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.SRr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class C72107SRr implements InterfaceC48038ItG {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        boolean z;
        switch (this.LJLIL) {
            case 0:
                BOX box = (BOX) this.LJLILLLLZI;
                List list = (List) obj;
                synchronized (box) {
                    BOX.LJIIJ("ttlive_tabs_cache_fyp", list);
                    if (list == null || list.isEmpty() || !BOX.LJI(list)) {
                        box.LIZLLL = null;
                    } else {
                        C79081V1x c79081V1x = box.LIZIZ;
                        List<ItemTab> list2 = box.LIZLLL;
                        c79081V1x.getClass();
                        if (!C79081V1x.LJJ(list, list2)) {
                            box.LIZLLL = new ArrayList(list);
                            z = true;
                        }
                    }
                    z = false;
                }
                if (z) {
                    return list;
                }
                return new ArrayList();
            default:
                C55671Lt5 c55671Lt5 = (C55671Lt5) this.LJLILLLLZI;
                RPI rpi = (RPI) obj;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    RKZ rkz = new RKZ(rpi.status_code, null, null, rpi.has_more, rpi.awemes, null, null, null, null, null, null, null, new ArrayList(), rpi.status_msg, null, new ArrayList(), null, null, null, null, null, null, null, new ArrayList(), null, null, null);
                    FeedItemList com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList = ConvertHelper.com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList(rkz, null);
                    Integer num = c55671Lt5.LJI;
                    if (num != null && num.intValue() == 8 && com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList != null) {
                        com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList.pbData = rkz;
                    }
                    C65314PkE.LJLIL = SystemClock.elapsedRealtime() - elapsedRealtime;
                    return com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList;
                } catch (Throwable th) {
                    C198517qh c198517qh = new C198517qh();
                    c198517qh.LIZ.put("errMsg", android.util.Log.getStackTraceString(th));
                    C8HX.LIZIZ("service_monitor", "log_bean_copy_convert_error", c198517qh.LJ());
                    C55668Lt2 c55668Lt2 = new C55668Lt2(th);
                    C36922EeM.LJFF(c55668Lt2);
                    PEH.LIZJ(c55668Lt2);
                    C39623Fgp.LIZ(c55668Lt2);
                    F9J.LIZIZ(C1791471i.LIZ, 0, "pb_convert_flag").edit().clear().putBoolean(C55670Lt4.LIZ, true).commit();
                    return new FeedItemList();
                }
        }
    }

    public /* synthetic */ C72107SRr(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}

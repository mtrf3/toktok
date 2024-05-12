package X;

import Y.AfS4S0100100_5;
import Y.AfS57S0100000_5;
import Y.IDhS3S1000000_5;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.feed.api.FeedApi;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.livesdk.live.model.LiveFeedDraw;
import com.bytedance.android.livesdk.livesetting.feed.LiveSquareRefreshParamsSetting;
import com.bytedance.android.livesdkapi.session.Event;
import defpackage.a1;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BLS implements InterfaceC28681BNl {
    @Override // X.InterfaceC28681BNl
    public final boolean LIZ(java.util.Map<String, String> map) {
        int i;
        Integer num;
        String str = map.get("live.intent.extra.FROM_NEW_STYLE_SOURCE");
        String str2 = null;
        if (TextUtils.equals(str, "homepage_hot")) {
            if (!BLM.LIZ) {
                BLM.LIZ = true;
                long currentTimeMillis = System.currentTimeMillis();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (CN1.LIZ(ILiveFeedApiService.class) != null) {
                    java.util.Map<String, Object> Ta = ((ILiveFeedApiService) CN1.LIZ(ILiveFeedApiService.class)).Ta(-1L);
                    if (Ta == null) {
                        BLM.LIZ = false;
                        Event event = new Event("webcast_tab_api_fail", 36864, EnumC28203B5b.ServerApiCall);
                        event.LIZIZ("tab response is null.");
                        B57.LIZ.LIZ().LIZIZ(event);
                    } else if (Ta.get("feed_url") instanceof String) {
                        str2 = (String) Ta.get("feed_url");
                    }
                }
                if (C38354F3m.LJ(str2)) {
                    BLM.LIZ = false;
                    Event event2 = new Event("webcast_tab_api_fail", 36867, EnumC28203B5b.ServerApiCall);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("url: ");
                    LIZ.append(C38354F3m.LJ(str2));
                    LIZ.append(" or style: ");
                    LIZ.append(true);
                    event2.LIZIZ(X1D.LIZIZ(LIZ));
                    B57.LIZ.LIZ().LIZIZ(event2);
                } else {
                    String LIZ2 = BLM.LIZ(str2);
                    BLM.LJFF(-3L);
                    HashMap hashMap = new HashMap();
                    if (BOT.LIZJ()) {
                        hashMap.put("is_non_personalized", "1");
                    }
                    BLO blo = new BLO(LIZ2, elapsedRealtime, map, currentTimeMillis);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    C65814PsI.LIZ().getClass();
                    BLM.LIZIZ = (C73411SrX) ((FeedApi) C65814PsI.LIZIZ(FeedApi.class)).feed(LIZ2, 0L, "enter_auto_foru_feed_draw_refresh", 0L, -1L, -1L, hashMap).LJJIJL(new IDhS3S1000000_5(3)).LJIJJLI(BLZ.LJLIL).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS4S0100100_5(currentTimeMillis2, blo, 18), new AfS57S0100000_5(blo, 336));
                }
            }
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (BLM.LIZ) {
            return true;
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        long currentTimeMillis3 = System.currentTimeMillis();
        if (CN1.LIZ(ILiveFeedApiService.class) != null) {
            java.util.Map<String, Object> G1 = ((ILiveFeedApiService) CN1.LIZ(ILiveFeedApiService.class)).G1(-1L);
            if (G1 == null) {
                BLM.LIZ = false;
                return false;
            }
            if (G1.get("feed_url") instanceof String) {
                str2 = (String) G1.get("feed_url");
            }
            if ((G1.get("feed_style") instanceof Integer) && (num = (Integer) G1.get("feed_style")) != null) {
                i = num.intValue();
                if (!C38354F3m.LJ(str2) || i != 3) {
                    BLM.LIZ = false;
                    return false;
                }
                String channelId = LiveFeedDraw.getChannelId(map.get("enter_from_merge"), map.get("enter_method"));
                if (!C38354F3m.LJ(str2) && !C38354F3m.LJ(channelId)) {
                    String LJ = a1.LJ("(", "channel_id", "=[^&]*)");
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("channel_id");
                    LIZ3.append("=");
                    LIZ3.append(channelId);
                    str2 = str2.replaceAll(LJ, X1D.LIZIZ(LIZ3));
                }
                String LIZ4 = BLM.LIZ(str2);
                HashMap hashMap2 = new HashMap();
                if (BOT.LIZJ()) {
                    hashMap2.put("is_non_personalized", "1");
                }
                LiveSquareRefreshParamsSetting liveSquareRefreshParamsSetting = LiveSquareRefreshParamsSetting.INSTANCE;
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append(map.get("enter_from_merge"));
                LIZ5.append("_");
                LIZ5.append(map.get("enter_method"));
                String reqFrom = liveSquareRefreshParamsSetting.getValue(X1D.LIZIZ(LIZ5));
                BLM.LIZ = true;
                BLN bln = new BLN(LIZ4, elapsedRealtime2, map, currentTimeMillis3);
                o.LJIIIZ(reqFrom, "reqFrom");
                o.LJIIIZ(channelId, "channelId");
                ((FeedApi) Q7L.LIZIZ(FeedApi.class)).feed(LIZ4, 0L, reqFrom, channelId, 0L, -1L, -1L, hashMap2).LJJIJL(new IDhS3S1000000_5(reqFrom, 4)).LJIJJLI(C28624BLg.LJLIL).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS4S0100100_5(System.currentTimeMillis(), bln, 19), new AfS57S0100000_5(bln, 337));
                return true;
            }
        }
        i = 0;
        if (!C38354F3m.LJ(str2)) {
        }
        BLM.LIZ = false;
        return false;
    }
}

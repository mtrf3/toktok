package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.NearbyInfo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.7eG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190807eG {
    public static final /* synthetic */ int LIZ = 0;

    public static java.util.Map LIZ(Aweme aweme, String str) {
        String eventTrack;
        if (!o.LJ(str, "homepage_nearby")) {
            return C113554cx.LJJJLIIL();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (aweme != null) {
            linkedHashMap.put("publish_consume_interval", String.valueOf(System.currentTimeMillis() - aweme.getCreateTime()));
            NearbyInfo nearbyInfo = aweme.nearbyInfo;
            if (nearbyInfo != null && (eventTrack = nearbyInfo.getEventTrack()) != null) {
                try {
                    JSONObject jSONObject = new JSONObject(eventTrack);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String key = keys.next();
                        Object opt = jSONObject.opt(key);
                        if (!TextUtils.isEmpty(key) && opt != null) {
                            o.LJIIIIZZ(key, "key");
                            linkedHashMap.put(key, opt.toString());
                        }
                    }
                } catch (Exception e) {
                    e.toString();
                }
            }
        }
        return linkedHashMap;
    }
}

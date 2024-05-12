package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R5L {
    public static C73517StF LIZIZ(boolean z, R5M source) {
        String str;
        o.LJIIIZ(source, "source");
        HashMap hashMap = new HashMap();
        hashMap.put("aid", String.valueOf(1233));
        hashMap.put("source", String.valueOf(source.getServerCode()));
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_refresh", str);
        return AbstractC73635Sv9.LJ(new R7D("/passport/cloud_token/enable/", hashMap));
    }

    public static C73517StF LIZ(String userID, String token, int i, R5K source) {
        o.LJIIIZ(userID, "userID");
        o.LJIIIZ(token, "token");
        o.LJIIIZ(source, "source");
        HashMap hashMap = new HashMap();
        hashMap.put("user_id", userID);
        hashMap.put("aid", String.valueOf(1233));
        hashMap.put("cloud_token", token);
        hashMap.put("disable_all", String.valueOf(i));
        hashMap.put("source", String.valueOf(source.getServerCode()));
        return AbstractC73635Sv9.LJ(new R7D("/passport/cloud_token/disable/", hashMap));
    }

    public static C73517StF LIZJ(String userID, String token, R5J scene, int i) {
        String client_rec;
        if ((i & 8) != 0) {
            scene = R5J.SMART_LOCK;
        }
        if ((i & 16) != 0) {
            client_rec = "";
        } else {
            client_rec = null;
        }
        o.LJIIIZ(userID, "userID");
        o.LJIIIZ(token, "token");
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(client_rec, "client_rec");
        HashMap hashMap = new HashMap();
        hashMap.put("user_id", userID);
        hashMap.put("aid", String.valueOf(1233));
        hashMap.put("cloud_token", token);
        hashMap.put(WM7.SCENE_SERVICE, String.valueOf(scene.getServerCode()));
        hashMap.put("client_rec", client_rec);
        return AbstractC73635Sv9.LJ(new R7D("/passport/cloud_token/login/", hashMap));
    }
}

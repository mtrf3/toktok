package X;

import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.RootData;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S5G {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(RootData rootData, String pageName, String resourceId, String scene, String str) {
        o.LJIIIZ(rootData, "rootData");
        o.LJIIIZ(pageName, "pageName");
        o.LJIIIZ(resourceId, "resourceId");
        o.LJIIIZ(scene, "scene");
        S5A.LJ(rootData.roomId, rootData.authorId, rootData.isNewUser, rootData.L(), pageName, resourceId, scene, str, null, null);
    }

    public static void LIZ(RootData rootData, String pageName, String resourceId, String scene, String str, String str2, boolean z, Long l, Integer num, String str3) {
        String str4;
        java.util.Map LIZ2;
        o.LJIIIZ(rootData, "rootData");
        o.LJIIIZ(pageName, "pageName");
        o.LJIIIZ(resourceId, "resourceId");
        o.LJIIIZ(scene, "scene");
        S5A.LJ(rootData.roomId, rootData.authorId, rootData.isNewUser, rootData.L(), pageName, resourceId, scene, str, num, str3);
        String roomId = rootData.roomId;
        String authorId = rootData.authorId;
        boolean z2 = rootData.isNewUser;
        String L = rootData.L();
        if (z) {
            str4 = "success";
        } else {
            str4 = "fail";
        }
        o.LJIIIZ(roomId, "roomId");
        o.LJIIIZ(authorId, "authorId");
        LIZ2 = S5F.LIZ(roomId, authorId, null, L, pageName, z2);
        LIZ2.put("resource_id", resourceId);
        LIZ2.put(WM7.SCENE_SERVICE, scene);
        if (l != null) {
            l.longValue();
            LIZ2.put("duration", l);
        }
        LIZ2.put("duration_type", str2);
        LIZ2.put("status", str4);
        b.LJJIJIIJI("rd_ttec_billboard_effect_duration_event", LIZ2);
    }

    public static /* synthetic */ void LIZIZ(RootData rootData, String str, String str2, String str3, String str4, String str5, boolean z, Long l, String str6, int i) {
        String str7 = str6;
        Long l2 = l;
        if ((i & 128) != 0) {
            l2 = null;
        }
        if ((i & 512) != 0) {
            str7 = null;
        }
        LIZ(rootData, str, str2, str3, str4, str5, z, l2, null, str7);
    }
}

package X;

import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import java.util.HashMap;

/* renamed from: X.AOl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26159AOl {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ() {
        String accessKey = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getAccessKey();
        C61520OCm LIZ2 = O3E.LIZ(accessKey);
        HashMap hashMap = new HashMap();
        hashMap.put(accessKey, C47261Igj.LJJIJ(new CheckRequestBodyModel.TargetChannel("tiktok_tool_aigc_avatar")));
        if (LIZ2 != null) {
            LIZ2.LIZIZ("normal", null, hashMap, null);
        }
    }
}

package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.4hO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C116304hO {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String scene, JSONObject jSONObject) {
        o.LJIIIZ(scene, "scene");
        if (o.LJ(scene, "inbox_page")) {
            IMService.createIIMServicebyMonsterPlugin(false).getInboxDmService().onReceiveInboxPerfMetric(jSONObject);
        }
    }
}

package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessageParam;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessageUser;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TRZ {
    public static String LIZ(String str, String str2, boolean z) {
        LinkLayerRTCMessage linkLayerRTCMessage = new LinkLayerRTCMessage(null, null, null, null, 0L, null, null, 127, null);
        linkLayerRTCMessage.generateId();
        linkLayerRTCMessage.setMethod(str2);
        LinkLayerRTCMessageParam linkLayerRTCMessageParam = new LinkLayerRTCMessageParam(null, 0, 0, null, null, true, 31, null);
        ArrayList<LinkLayerRTCMessageUser> users = linkLayerRTCMessageParam.getUsers();
        if (users != null) {
            users.add(new LinkLayerRTCMessageUser(str, 0, z ? 1 : 0, z ? 1 : 0, 2, null));
        }
        linkLayerRTCMessage.setParam(linkLayerRTCMessageParam);
        String json = GsonProtectorUtils.toJson(C09650Zl.LIZIZ, linkLayerRTCMessage);
        o.LJIIIIZZ(json, "get().toJson(cmd)");
        return json;
    }
}

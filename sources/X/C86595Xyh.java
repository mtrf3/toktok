package X;

import Y.ARunnableS18S0400000_15;
import com.bytedance.ies.xbridge.media.utils.AvatarUri;
import com.bytedance.ies.xbridge.media.utils.UploadImageResponse;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Xyh, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86595Xyh implements InterfaceC53758L7y {
    public final /* synthetic */ ARunnableS18S0400000_15 LIZ;

    @Override // X.InterfaceC53758L7y
    public final C76800UCe LIZJ(JSONObject jSONObject, LinkedHashMap<String, String> responseHeader, String str, Throwable th, Integer num, Integer num2) {
        o.LJIIJ(responseHeader, "responseHeader");
        return null;
    }

    public C86595Xyh(ARunnableS18S0400000_15 aRunnableS18S0400000_15) {
        this.LIZ = aRunnableS18S0400000_15;
    }

    @Override // X.InterfaceC53758L7y
    public final void LIZ(Integer num, Integer num2, Throwable th) {
        InterfaceC45882Hza interfaceC45882Hza = (InterfaceC45882Hza) this.LIZ.l2;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        C86593Xyf c86593Xyf = new C86593Xyf();
        c86593Xyf.LIZ = c86593Xyf.LIZ;
        c86593Xyf.LIZLLL = num2;
        interfaceC45882Hza.LIZ(0, message, c86593Xyf);
    }

    @Override // X.InterfaceC53758L7y
    public final void LIZIZ(JSONObject body, LinkedHashMap<String, String> responseHeader, Integer num, Integer num2) {
        String str;
        List<String> list;
        o.LJIIJ(body, "body");
        o.LJIIJ(responseHeader, "responseHeader");
        try {
            String jSONObject = body.toString();
            o.LJFF(jSONObject, "body.toString()");
            AvatarUri avatarUri = ((UploadImageResponse) C78518Uri.LIZ(jSONObject, UploadImageResponse.class)).data;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> keys = body.keys();
            o.LJFF(keys, "body.keys()");
            while (keys.hasNext()) {
                String key = keys.next();
                o.LJFF(key, "key");
                Object obj = body.get(key);
                o.LJFF(obj, "body.get(key)");
                linkedHashMap.put(key, obj);
            }
            String str2 = null;
            if (avatarUri == null || (list = avatarUri.urlList) == null || !(!list.isEmpty())) {
                str = null;
            } else {
                str = (String) ORZ.LJLLLL(list);
            }
            InterfaceC45882Hza interfaceC45882Hza = (InterfaceC45882Hza) this.LIZ.l2;
            C86593Xyf c86593Xyf = new C86593Xyf();
            c86593Xyf.LIZ = str;
            if (avatarUri != null) {
                str2 = avatarUri.uri;
            }
            c86593Xyf.LIZIZ = str2;
            c86593Xyf.LIZJ = linkedHashMap;
            c86593Xyf.LIZLLL = num2;
            interfaceC45882Hza.LIZIZ(c86593Xyf, "");
        } catch (Throwable unused) {
        }
    }
}

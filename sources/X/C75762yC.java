package X;

import com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessageContent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.2yC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75762yC {
    public static final C75762yC LIZ = new C75762yC();

    public static java.util.Map LIZ(C75762yC c75762yC, String convId) {
        String str;
        Object LIZ2;
        int i;
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C4WC c4wc = C4WC.LIZIZ;
        c75762yC.getClass();
        o.LJIIIZ(convId, "convId");
        C63120Opw LIZ3 = c4wc.LIZ(convId);
        if (LIZ3 == null) {
            return null;
        }
        java.util.Map<String, String> localExt = LIZ3.getLocalExt();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (localExt == null || (str = localExt.get("s:conversation_card_data")) == null) {
            return null;
        }
        try {
            LIZ2 = new JSONObject(str);
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (C3C5.m12isFailureimpl(LIZ2)) {
            LIZ2 = null;
        }
        JSONObject jSONObject = (JSONObject) LIZ2;
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        o.LJIIIIZZ(keys, "dataObj.keys()");
        while (keys.hasNext()) {
            String key = keys.next();
            String dataStr = jSONObject.optString(key);
            o.LJIIIIZZ(key, "key");
            Integer LJJIL = C38350F3i.LJJIL(key);
            if (LJJIL != null) {
                i = LJJIL.intValue();
            } else {
                i = 0;
            }
            FakeMessageContent.Companion companion = FakeMessageContent.Companion;
            o.LJIIIIZZ(dataStr, "dataStr");
            FakeMessageContent from$im_base_release = companion.from$im_base_release(i, dataStr);
            if (from$im_base_release != null) {
                linkedHashMap.put(Integer.valueOf(i), from$im_base_release);
            }
        }
        return linkedHashMap;
    }
}

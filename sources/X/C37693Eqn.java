package X;

import java.util.LinkedHashMap;

/* renamed from: X.Eqn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37693Eqn {
    public static final java.util.Map<String, String> LIZ;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("com.bytedance.ies.bullet.kit.rn.IRnKitApi", "com.bytedance.ies.bullet.kit.rn.RnKitApi");
        linkedHashMap.put("com.bytedance.ies.bullet.kit.lynx.ILynxKitApi", "com.bytedance.ies.bullet.kit.lynx.LynxKitApi");
        linkedHashMap.put("com.bytedance.ies.bullet.kit.web.IWebKitApi", "com.bytedance.ies.bullet.kit.web.WebKitApi");
        LIZ = linkedHashMap;
    }

    public static InterfaceC60250Nkk LIZ(String str) {
        try {
            String str2 = (String) ((LinkedHashMap) LIZ).get(str);
            if (str2 == null) {
                str2 = "";
            }
            Object newInstance = Class.forName(str2).newInstance();
            if (newInstance != null) {
                return (InterfaceC60250Nkk) newInstance;
            }
            throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.ies.bullet.core.kit.IKitApiDefault /* = com.bytedance.ies.bullet.core.kit.IKitApi<com.bytedance.ies.bullet.core.kit.IKitSettingsProvider, com.bytedance.ies.bullet.core.kit.IKitDelegatesProvider, com.bytedance.ies.bullet.core.kit.IKitInstanceApi, com.bytedance.ies.bullet.core.kit.IKitGlobalSettingsProvider> */");
        } catch (Throwable unused) {
            return null;
        }
    }
}

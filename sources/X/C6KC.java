package X;

import android.content.Context;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.6KC, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6KC {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str, InterfaceC88472Yns interfaceC88472Yns) {
        String str2;
        if (ORZ.LJLJJI(str, C6KD.LIZIZ)) {
            return ((Boolean) interfaceC88472Yns.invoke(Boolean.TRUE)).booleanValue();
        }
        HashMap<String, String> metaData = TEVideoUtils.getMetaData(str);
        try {
            String str3 = metaData.get("com.android.information");
            if (str3 == null || str3.length() == 0) {
                str2 = metaData.get("com.apple.quicktime.information");
            } else {
                str2 = metaData.get("com.android.information");
            }
            if (str2 == null || str2.length() == 0) {
                return ((Boolean) interfaceC88472Yns.invoke(Boolean.FALSE)).booleanValue();
            }
            JSONObject jSONObject = new JSONObject(str2);
            if (jSONObject.has("com.bytedance.info") && new JSONObject(jSONObject.get("com.bytedance.info").toString()).has("is_km_video")) {
                return ((Boolean) interfaceC88472Yns.invoke(Boolean.TRUE)).booleanValue();
            }
            return ((Boolean) interfaceC88472Yns.invoke(Boolean.FALSE)).booleanValue();
        } catch (Exception unused) {
            return ((Boolean) interfaceC88472Yns.invoke(Boolean.FALSE)).booleanValue();
        }
    }

    public static boolean LIZIZ(Context context, String str, String str2, boolean z, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(context, "context");
        if (C60903NvH.LJIIJJI().getAccountService().isChildrenMode()) {
            return false;
        }
        return LIZ(str, new C84953Vb(z, str2, context, interfaceC65784Pro));
    }

    public static /* synthetic */ boolean LIZJ(Context context, String str, String str2, boolean z, int i) {
        if ((i & 8) != 0) {
            z = true;
        }
        return LIZIZ(context, str, str2, z, null);
    }
}

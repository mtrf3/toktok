package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.OSz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61949OSz {
    public static final /* synthetic */ int LIZ = 0;

    public static OTD LIZ(Bundle bundle) {
        String value;
        String str;
        String str2;
        String LIZ2 = OT0.LIZ(bundle);
        if (bundle == null || (value = bundle.getString("_bytedance_params_response_type")) == null) {
            value = EnumC35520Dwq.CODE.getValue();
        }
        o.LJIIIIZZ(value, "arguments?.getString(Bas…thResponseType.CODE.value");
        if (bundle == null || (str = bundle.getString("_bytedance_params_source")) == null) {
            str = "native_v2";
        }
        String str3 = null;
        if (bundle != null) {
            str3 = bundle.getString("_bytedance_params_code_challenge");
            str2 = bundle.getString("_bytedance_params_redirect_uri");
        } else {
            str2 = null;
        }
        return new OTD(LIZ2, value, str, str3, str2);
    }
}

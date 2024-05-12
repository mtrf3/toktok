package X;

import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.BJv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28587BJv implements InterfaceC28588BJw {
    @Override // X.InterfaceC28588BJw
    public final HashMap<String, String> LIZ() {
        HashMap<String, String> hashMap = new HashMap<>();
        Object mv0 = DataChannelGlobal.LJLJJI.mv0(C29049Baf.class);
        if (mv0 != null && ((ILoggerService) CN1.LIZ(ILoggerService.class)).Dg("", true) != null) {
            new BJK().LIZ(mv0, hashMap);
        }
        BM1.LIZ(null, hashMap);
        hashMap.put("_param_live_platform", "live");
        String LIZ = C30443Bx9.LIZ();
        o.LJIIIIZZ(LIZ, "getSdkVersion()");
        hashMap.put("sdk_version", LIZ);
        BM1.LIZIZ(hashMap);
        return hashMap;
    }

    @Override // X.InterfaceC28588BJw
    public final void onEvent(String str, java.util.Map<String, String> map) {
        if (str != null) {
            BZI LIZIZ = C28787BRn.LIZIZ(str);
            LIZIZ.LJJIFFI(map);
            LIZIZ.LJJIIJZLJL();
        }
    }
}

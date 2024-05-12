package X;

import com.google.gson.m;
import com.ss.android.ugc.aweme.settingsrequest.ConfigCenterCenterBridgeImpl;
import com.ss.android.ugc.aweme.settingsrequest.api.IConfigCenterBridgeApi;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Efv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37019Efv implements IConfigCenterBridgeApi {
    public static final C37019Efv LIZIZ = new C37019Efv();
    public final /* synthetic */ IConfigCenterBridgeApi LIZ;

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.IConfigCenterBridgeApi
    public final void LIZ(JSONObject jSONObject, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Exception, C76800UCe> interfaceC88472Yns2) {
        this.LIZ.LIZ(jSONObject, interfaceC88472Yns, interfaceC88472Yns2);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.IConfigCenterBridgeApi
    public final void LIZIZ(m mVar, String key) {
        o.LJIIIZ(key, "key");
        this.LIZ.LIZIZ(mVar, key);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.IConfigCenterBridgeApi
    public final boolean LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.IConfigCenterBridgeApi
    public final java.util.Map<String, Object> getSettings(List<String> keys) {
        o.LJIIIZ(keys, "keys");
        return this.LIZ.getSettings(keys);
    }

    public C37019Efv() {
        IConfigCenterBridgeApi iConfigCenterBridgeApi;
        Object LIZ = C58096Mr6.LIZ(IConfigCenterBridgeApi.class, false);
        if (LIZ != null) {
            iConfigCenterBridgeApi = (IConfigCenterBridgeApi) LIZ;
        } else {
            if (C58096Mr6.E6 == null) {
                synchronized (IConfigCenterBridgeApi.class) {
                    if (C58096Mr6.E6 == null) {
                        C58096Mr6.E6 = new ConfigCenterCenterBridgeImpl();
                    }
                }
            }
            iConfigCenterBridgeApi = C58096Mr6.E6;
        }
        this.LIZ = iConfigCenterBridgeApi;
    }
}

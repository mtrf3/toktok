package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Frn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40303Frn implements GBL {
    public final /* synthetic */ InterfaceC36488ETs LJLIL;

    @Override // X.GBL
    public void onExit() {
    }

    public C40303Frn(InterfaceC36488ETs interfaceC36488ETs) {
        this.LJLIL = interfaceC36488ETs;
    }

    @Override // X.GBL
    public void onChanged(String phoneCode, String shortCountryName) {
        o.LJIIIZ(phoneCode, "phoneCode");
        o.LJIIIZ(shortCountryName, "shortCountryName");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("phoneCode", phoneCode);
        jSONObject.put("shortCountryName", shortCountryName);
        jSONObject.put("code", 1);
        InterfaceC36488ETs interfaceC36488ETs = this.LJLIL;
        if (interfaceC36488ETs != null) {
            interfaceC36488ETs.LIZIZ(jSONObject);
        }
    }
}

package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Frm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40302Frm implements GBL {
    public final /* synthetic */ InterfaceC37146Ehy LJLIL;

    @Override // X.GBL
    public void onExit() {
    }

    public C40302Frm(InterfaceC37146Ehy interfaceC37146Ehy) {
        this.LJLIL = interfaceC37146Ehy;
    }

    @Override // X.GBL
    public void onChanged(String phoneCode, String shortCountryName) {
        o.LJIIIZ(phoneCode, "phoneCode");
        o.LJIIIZ(shortCountryName, "shortCountryName");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("phoneCode", phoneCode);
        jSONObject.put("shortCountryName", shortCountryName);
        jSONObject.put("code", 1);
        InterfaceC37146Ehy interfaceC37146Ehy = this.LJLIL;
        if (interfaceC37146Ehy != null) {
            interfaceC37146Ehy.LIZIZ(jSONObject);
        }
    }
}

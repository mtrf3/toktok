package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Nhf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60059Nhf implements InterfaceC72822Si2 {
    public final /* synthetic */ C60060Nhg<InterfaceC60061Nhh> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        JSONObject jSONObject;
        InterfaceC60061Nhh interfaceC60061Nhh = this.LJLIL.get();
        if (interfaceC60061Nhh != null) {
            InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns != null) {
                jSONObject = C78501UrR.LIZIZ(interfaceC78280Uns);
            } else {
                jSONObject = new JSONObject();
            }
            String str = c199097rd.LJLIL;
            String jSONObject2 = jSONObject.toString();
            o.LJIIIIZZ(jSONObject2, "jsonObject.toString()");
            interfaceC60061Nhh.onEvent(str, jSONObject2);
            return;
        }
        C72818Shy.LJII(this.LJLILLLLZI, this);
    }

    public C60059Nhf(C60060Nhg<InterfaceC60061Nhh> c60060Nhg, String str) {
        this.LJLIL = c60060Nhg;
        this.LJLILLLLZI = str;
    }
}

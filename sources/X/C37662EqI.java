package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.EqI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37662EqI extends AbstractC37663EqJ<JSONObject> {
    public InterfaceC38263Ezz LIZJ;
    public final C36558EWk LIZLLL;

    @Override // X.AbstractC37663EqJ
    public final EnumC37844EtE LIZ() {
        return EnumC37844EtE.WEB;
    }

    @Override // X.AbstractC37663EqJ
    public final /* bridge */ /* synthetic */ InterfaceC37669EqP<JSONObject> LIZIZ() {
        return this.LIZLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37662EqI(InterfaceC37666EqM bridge, JSONObject data) {
        super(bridge, data);
        o.LJIIJ(bridge, "bridge");
        o.LJIIJ(data, "data");
        C36558EWk c36558EWk = new C36558EWk();
        c36558EWk.LIZ = this.LIZJ;
        this.LIZLLL = c36558EWk;
    }

    @Override // X.AbstractC37663EqJ
    public final JSONObject LIZLLL(int i, String message) {
        o.LJIIJ(message, "message");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", i);
        jSONObject.put("msg", message);
        return jSONObject;
    }
}

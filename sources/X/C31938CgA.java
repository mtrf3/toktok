package X;

import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.CgA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31938CgA extends AbstractC38123Exj<JSONObject, JSONObject> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ Map.Entry<String, InterfaceC31940CgC> LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    @Override // X.AbstractC38123Exj
    public final void onTerminate() {
        this.LJLILLLLZI.getValue().LIZ().release();
    }

    @Override // X.AbstractC38123Exj
    public final void invoke(JSONObject jSONObject, C38131Exr context) {
        EnumC37847EtH enumC37847EtH;
        JSONObject params = jSONObject;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(context, "context");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("xbridge start,fun name:");
        C31811Ce7.LJ(LIZ, this.LJLIL, LIZ, "XbridgeManager");
        params.put("func", this.LJLIL);
        InterfaceC37774Es6 LIZ2 = this.LJLILLLLZI.getValue().LIZ();
        C78528Urs c78528Urs = new C78528Urs(params);
        String str = this.LJLIL;
        int i = this.LJLJI;
        C31939CgB c31939CgB = new C31939CgB(str, i, this);
        if (i == 1) {
            enumC37847EtH = EnumC37847EtH.LYNX;
        } else {
            enumC37847EtH = EnumC37847EtH.WEB;
        }
        LIZ2.LIZJ(c78528Urs, c31939CgB, enumC37847EtH);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C31938CgA(String str, Map.Entry<String, ? extends InterfaceC31940CgC> entry, int i) {
        this.LJLIL = str;
        this.LJLILLLLZI = entry;
        this.LJLJI = i;
    }
}

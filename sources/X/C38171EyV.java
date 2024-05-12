package X;

import org.json.JSONObject;
import ujb.o;

/* renamed from: X.EyV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38171EyV implements InterfaceC38051EwZ {
    public final /* synthetic */ C38170EyU LIZ;
    public final /* synthetic */ InterfaceC38177Eyb LIZIZ;

    public C38171EyV(C38170EyU c38170EyU, C37863EtX c37863EtX) {
        this.LIZ = c38170EyU;
        this.LIZIZ = c37863EtX;
    }

    @Override // X.InterfaceC38051EwZ
    public final C77357UXp LIZ(int i, String id, JSONObject result) {
        if (i == 1) {
            if (id != null) {
                this.LIZ.getClass();
                if (o.LJJJLIIL(id, "bridgesdk", false)) {
                    InterfaceC38177Eyb interfaceC38177Eyb = this.LIZIZ;
                    kotlin.jvm.internal.o.LJFF(result, "result");
                    interfaceC38177Eyb.LIZ(result);
                    this.LIZ.getClass();
                    kotlin.jvm.internal.o.LJFF(id.substring(9), "(this as java.lang.String).substring(startIndex)");
                    return new C77357UXp();
                }
            }
        } else if (i == 2) {
            InterfaceC38177Eyb interfaceC38177Eyb2 = this.LIZIZ;
            kotlin.jvm.internal.o.LJFF(id, "id");
            interfaceC38177Eyb2.LIZJ(result, id);
        }
        return null;
    }
}

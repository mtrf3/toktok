package X;

import org.json.JSONObject;
import ujb.o;

/* renamed from: X.EyW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38172EyW implements InterfaceC38051EwZ {
    public final /* synthetic */ C38169EyT LIZ;
    public final /* synthetic */ InterfaceC38177Eyb LIZIZ;

    public C38172EyW(C38169EyT c38169EyT, C37863EtX c37863EtX) {
        this.LIZ = c38169EyT;
        this.LIZIZ = c37863EtX;
    }

    @Override // X.InterfaceC38051EwZ
    public final C77357UXp LIZ(int i, String id, JSONObject result) {
        if (i == 1) {
            if (id != null) {
                this.LIZ.getClass();
                if (o.LJJJLIIL(id, "bridgesdk", false)) {
                    InterfaceC38177Eyb interfaceC38177Eyb = this.LIZIZ;
                    kotlin.jvm.internal.o.LJIIIIZZ(result, "result");
                    interfaceC38177Eyb.LIZ(result);
                    this.LIZ.getClass();
                    kotlin.jvm.internal.o.LJIIIIZZ(id.substring(9), "this as java.lang.String).substring(startIndex)");
                    return new C77357UXp();
                }
            }
        } else if (i == 2) {
            InterfaceC38177Eyb interfaceC38177Eyb2 = this.LIZIZ;
            kotlin.jvm.internal.o.LJIIIIZZ(id, "id");
            interfaceC38177Eyb2.LIZJ(result, id);
        }
        return null;
    }
}

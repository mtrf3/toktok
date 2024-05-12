package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Eur, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37945Eur extends C37948Euu {
    public final /* synthetic */ InterfaceC38177Eyb LIZ;

    public C37945Eur(C37863EtX c37863EtX) {
        this.LIZ = c37863EtX;
    }

    @Override // X.C37948Euu
    public final void LIZ(int i, String data, JSONObject jSONObject) {
        o.LJIIJ(data, "data");
        if (jSONObject == null) {
            this.LIZ.LIZ(C37910EuI.LIZ(i, data, null).LIZ());
        } else {
            this.LIZ.LIZ(jSONObject);
        }
    }
}

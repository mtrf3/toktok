package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* renamed from: X.QIj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66769QIj implements QJA {
    public final CopyOnWriteArraySet<QJA> LIZ = new CopyOnWriteArraySet<>();

    @Override // X.QJA
    public final void LIZJ(JSONObject jSONObject, boolean z) {
        Iterator<QJA> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZJ(jSONObject, z);
        }
    }

    @Override // X.QJA
    public final void LIZIZ(String str, String str2, String str3) {
        Iterator<QJA> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(str, str2, str3);
        }
    }

    @Override // X.QJA
    public final void LIZ(String str, String str2, String str3, String str4, boolean z, String str5, String str6) {
        Iterator<QJA> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZ(str, str2, str3, str4, z, str5, str6);
        }
    }
}

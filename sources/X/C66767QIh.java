package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* renamed from: X.QIh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66767QIh implements QJC {
    public final CopyOnWriteArraySet<QJC> LIZ = new CopyOnWriteArraySet<>();

    @Override // X.QJC
    public final void LIZ(long j, String str) {
        Iterator<QJC> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZ(j, str);
        }
    }

    @Override // X.QJC
    public final void LIZIZ(String str, long j, JSONObject jSONObject) {
        Iterator<QJC> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(str, j, jSONObject);
        }
    }

    @Override // X.QJC
    public final void LIZJ(String str, long j, JSONObject jSONObject) {
        Iterator<QJC> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZJ(str, j, jSONObject);
        }
    }
}

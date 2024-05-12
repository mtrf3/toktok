package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.F3q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38358F3q extends AbstractC38228EzQ {
    public final String LJLILLLLZI;
    public final JSONObject LJLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38358F3q)) {
            return false;
        }
        C38358F3q c38358F3q = (C38358F3q) obj;
        return o.LJ(this.LJLILLLLZI, c38358F3q.LJLILLLLZI) && o.LJ(this.LJLJI, c38358F3q.LJLJI);
    }

    public final int hashCode() {
        String str = this.LJLILLLLZI;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        JSONObject jSONObject = this.LJLJI;
        return hashCode + (jSONObject != null ? jSONObject.hashCode() : 0);
    }

    @Override // X.AbstractC38228EzQ
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EventNativeInfo(eventType=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", data=");
        LIZ.append(this.LJLJI);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.QXX
    public final void LLFFF(JSONObject jSONObject) {
        C77123UOp.LJIJJLI(jSONObject, this.LJLJI);
    }

    public C38358F3q(String str, JSONObject jSONObject) {
        super(str);
        this.LJLILLLLZI = str;
        this.LJLJI = jSONObject;
    }
}

package X;

import defpackage.q;
import org.json.JSONObject;

/* renamed from: X.EyO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38164EyO extends AbstractC38228EzQ {
    public int LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;

    public C38164EyO() {
        super("jsbError");
    }

    @Override // X.AbstractC38228EzQ
    public final String toString() {
        StringBuilder LJ = C7MY.LJ("JsbErrorData(isSync=", 0, ", errorCode=");
        LJ.append(this.LJLILLLLZI);
        LJ.append(", errorMessage=");
        LJ.append(this.LJLJI);
        LJ.append(", bridgeName=");
        YE1.LIZLLL(LJ, this.LJLJJI, ", errorActivity=", null, ", protocol=");
        return q.LIZIZ(LJ, null, ')', LJ);
    }

    @Override // X.QXX
    public final void LLFFF(JSONObject jSONObject) {
        C77123UOp.LJJJJLL(0, "is_sync", jSONObject);
        C77123UOp.LJJJJLL(this.LJLILLLLZI, "error_code", jSONObject);
        C77123UOp.LJJJJZI("error_message", this.LJLJI, jSONObject);
        C77123UOp.LJJJJZI("bridge_name", this.LJLJJI, jSONObject);
        C77123UOp.LJJJJZI("error_activity", null, jSONObject);
        C77123UOp.LJJJJZI("protocol_version", null, jSONObject);
    }
}

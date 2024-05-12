package X;

import org.json.JSONObject;

/* renamed from: X.EyM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38162EyM extends AbstractC38228EzQ {
    public String LJLILLLLZI;
    public int LJLJI;
    public String LJLJJI;
    public long LJLJJL;
    public long LJLJJLL;
    public long LJLJL;

    public C38162EyM() {
        super("jsbPerf");
    }

    @Override // X.AbstractC38228EzQ
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("JsbInfoData(bridgeName=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", statusCode=");
        LIZ.append(this.LJLJI);
        LIZ.append(", statusDescription=");
        YE1.LIZLLL(LIZ, this.LJLJJI, ", protocolVersion=", null, ", costTime=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", invokeTime=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", callbackTime=");
        LIZ.append(this.LJLJL);
        LIZ.append(", fireEventTime=");
        LIZ.append(0L);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.QXX
    public final void LLFFF(JSONObject jSONObject) {
        C77123UOp.LJJJJZI("bridge_name", this.LJLILLLLZI, jSONObject);
        C77123UOp.LJJJJLL(this.LJLJI, "status_code", jSONObject);
        C77123UOp.LJJJJZI("status_description", this.LJLJJI, jSONObject);
        C77123UOp.LJJJJZI("protocol_version", null, jSONObject);
        C77123UOp.LJJJJZ("cost_time", this.LJLJJL, jSONObject);
        C77123UOp.LJJJJZ("invoke_ts", this.LJLJJLL, jSONObject);
        C77123UOp.LJJJJZ("callback_ts", this.LJLJL, jSONObject);
        C77123UOp.LJJJJZ("fireEvent_ts", 0L, jSONObject);
    }
}

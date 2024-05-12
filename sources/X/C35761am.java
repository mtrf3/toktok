package X;

import org.json.JSONObject;

/* renamed from: X.1am, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35761am extends AbstractC24300xO {
    public int LJ;
    public long LJFF;
    public String LJI;

    public final JSONObject LIZIZ() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("start_time", this.LIZ);
            jSONObject.put("end_time", this.LIZIZ);
            jSONObject.put("thread_name", this.LIZJ);
            jSONObject.put("thread_stack", LIZ());
            jSONObject.put("interval", this.LJFF);
            jSONObject.put("type", this.LJ);
            jSONObject.put("intent_info", this.LJI);
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AlarmInfo{type=");
        LIZ.append(this.LJ);
        LIZ.append(", interval=");
        LIZ.append(this.LJFF);
        LIZ.append(", intentInfo=");
        LIZ.append(this.LJI);
        LIZ.append(", startTime=");
        LIZ.append(this.LIZ);
        LIZ.append(", endTime=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", threadName=");
        LIZ.append(this.LIZJ);
        LIZ.append(", threadStack=");
        LIZ.append(LIZ());
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }
}

package X;

import org.json.JSONObject;

/* renamed from: X.1an, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35771an extends AbstractC24300xO {
    public int LJ;
    public String LJFF;

    public final JSONObject LIZIZ() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("flags", this.LJ);
            jSONObject.put("tag", this.LJFF);
            jSONObject.put("start_time", this.LIZ);
            jSONObject.put("end_time", this.LIZIZ);
            jSONObject.put("thread_name", this.LIZJ);
            jSONObject.put("thread_stack", LIZ());
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("WakeLockInfo{flags=");
        LIZ.append(this.LJ);
        LIZ.append(", tag=");
        LIZ.append(this.LJFF);
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

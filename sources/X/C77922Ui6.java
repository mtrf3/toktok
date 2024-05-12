package X;

import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ui6, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77922Ui6 {
    public static JSONObject LIZ(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            String pid = C77123UOp.LJJJJLI("pid", jSONObject);
            o.LJFF(pid, "pid");
            if (pid.length() > 0) {
                C77123UOp.LJJJJZI("pid", pid, jSONObject2);
            }
            String bid = C77123UOp.LJJJJLI("bid", jSONObject);
            o.LJFF(bid, "bid");
            if (bid.length() > 0) {
                C77123UOp.LJJJJZI("bid", bid, jSONObject2);
            }
            JSONObject LJJJJJ = C77123UOp.LJJJJJ("context", jSONObject);
            if (LJJJJJ != null) {
                Iterator<String> keys = LJJJJJ.keys();
                o.LJFF(keys, "context.keys()");
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = LJJJJJ.get(next);
                    if (obj != null && !(obj instanceof String)) {
                        C77123UOp.LJJJJZI(next, obj.toString(), LJJJJJ);
                    }
                }
                C77123UOp.LJJJLIIL(jSONObject2, "context", LJJJJJ);
            }
            String env = C77123UOp.LJJJJLI("env", jSONObject);
            o.LJFF(env, "env");
            if (env.length() > 0) {
                C77123UOp.LJJJJZI("env", env, jSONObject2);
            }
            String release = C77123UOp.LJJJJLI("release", jSONObject);
            o.LJFF(release, "release");
            if (release.length() > 0) {
                C77123UOp.LJJJJZI("release", release, jSONObject2);
            }
        }
        return jSONObject2;
    }
}

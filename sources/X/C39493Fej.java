package X;

import Y.ARunnableS5S1200000_6;
import com.bytedance.pumbaa.common.interfaces.IEventMonitor;
import com.bytedance.pumbaa.common.interfaces.ILogger;
import com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService;
import java.util.Iterator;
import java.util.Stack;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Fej, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39493Fej implements InterfaceC39517Ff7 {
    public C39491Feh LIZ;
    public final ILogger LIZIZ;
    public final IEventMonitor LIZJ;
    public final java.util.Map<String, InterfaceC65784Pro<Boolean>> LIZLLL;
    public final IRuleEngineService LJ;
    public final ExecutorService LJFF;

    @Override // X.InterfaceC39517Ff7
    public final boolean LIZJ(C39489Fef c39489Fef) {
        return false;
    }

    public static JSONObject LJFF(JSONObject jSONObject) {
        try {
            Stack stack = new Stack();
            stack.push(jSONObject);
            while (!stack.isEmpty()) {
                Object pop = stack.pop();
                if (pop instanceof JSONObject) {
                    Iterator<String> keys = ((JSONObject) pop).keys();
                    o.LJIIIIZZ(keys, "cur.keys()");
                    while (keys.hasNext()) {
                        String next = keys.next();
                        Object opt = ((JSONObject) pop).opt(next);
                        if (opt == null) {
                            ((JSONObject) pop).put(next, "empty");
                        } else if (opt instanceof JSONObject) {
                            stack.push(opt);
                        } else if (opt instanceof JSONArray) {
                            stack.push(opt);
                        } else {
                            ((JSONObject) pop).put(next, C16880lQ.LJLLJ(opt.getClass()));
                        }
                    }
                } else if (pop instanceof JSONArray) {
                    int length = ((JSONArray) pop).length();
                    for (int i = 0; i < length; i++) {
                        Object opt2 = ((JSONArray) pop).opt(i);
                        if (opt2 instanceof JSONObject) {
                            stack.push(opt2);
                        } else if (opt2 instanceof JSONArray) {
                            stack.push(opt2);
                        } else {
                            ((JSONArray) pop).put(i, C16880lQ.LJLLJ(opt2.getClass()));
                        }
                    }
                }
            }
            return jSONObject;
        } catch (Throwable th) {
            C3C4 LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            C3C5.m10exceptionOrNullimpl(LIZ);
            return jSONObject;
        }
    }

    @Override // X.InterfaceC39517Ff7
    public final void LIZ(C39489Fef c39489Fef) {
        ExecutorService executorService = this.LJFF;
        if (executorService != null) {
            executorService.execute(new ARunnableS5S1200000_6(c39489Fef, "RETURN", this, 10));
        }
    }

    @Override // X.InterfaceC39517Ff7
    public final void LIZIZ(C39489Fef c39489Fef) {
        ExecutorService executorService = this.LJFF;
        if (executorService != null) {
            executorService.execute(new ARunnableS5S1200000_6(c39489Fef, "CALLBACK", this, 10));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a2, code lost:
    
        r1 = r0.LIZLLL(r2, X.C113554cx.LJJJLIIL());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.Fei] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7, types: [X.UCe] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.C39489Fef r12, org.json.JSONObject r13) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39493Fej.LIZLLL(X.Fef, org.json.JSONObject):void");
    }

    public static void LJ(String str, String str2, JSONObject jSONObject) {
        if (str != null) {
            Object opt = jSONObject.opt("dataflowIdParams");
            if (!(opt instanceof JSONObject)) {
                opt = null;
            }
            JSONObject jSONObject2 = (JSONObject) opt;
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            jSONObject2.put(str, str2);
            jSONObject.put("dataflowIdParams", jSONObject2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C39493Fej(C39491Feh c39491Feh, ILogger iLogger, IEventMonitor iEventMonitor, java.util.Map<String, ? extends InterfaceC65784Pro<Boolean>> map, IRuleEngineService iRuleEngineService, ExecutorService executorService) {
        this.LIZ = c39491Feh;
        this.LIZIZ = iLogger;
        this.LIZJ = iEventMonitor;
        this.LIZLLL = map;
        this.LJ = iRuleEngineService;
        this.LJFF = executorService;
    }
}

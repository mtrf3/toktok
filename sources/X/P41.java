package X;

import android.os.Handler;
import java.lang.ref.WeakReference;
import jp3.c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class P41 implements Handler.Callback {
    public final WeakReference<P43> LJLIL;

    public P41(P43 p43) {
        this.LJLIL = new WeakReference<>(p43);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x020e, code lost:
    
        if (r6.LJIIIZ == 0) goto L71;
     */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r15) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P41.handleMessage(android.os.Message):boolean");
    }

    public static void LIZ(Integer num, long j, String str) {
        JSONObject jSONObject = new JSONObject();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            jSONObject.put("time", j);
            jSONObject.put("state", num);
            jSONObject.put("duration", currentTimeMillis - j);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        c.LIZ(str, "behavior", jSONObject);
    }
}

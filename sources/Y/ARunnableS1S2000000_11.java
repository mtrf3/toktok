package Y;

import X.C15280iq;
import X.InterfaceC66023Pvf;
import com.bytedance.android.alog.Alog;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.ss.android.agilelogger.ALog;
import kotlin.jvm.internal.AqS34S1000000_11;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class ARunnableS1S2000000_11 implements Runnable {
    public final int $t;
    public String s0;
    public String s1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        try {
            if (this.s0 != null && this.s1 != null) {
                JSONArray jSONArray = new JSONArray(this.s1);
                AqS34S1000000_11 aqS34S1000000_11 = new AqS34S1000000_11(this.s0, 8);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                    o.LJFF(jSONObject, "this.getJSONObject(i)");
                    aqS34S1000000_11.invoke(jSONObject);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static final void run$0(ARunnableS1S2000000_11 aRunnableS1S2000000_11) {
        boolean LIZ;
        long j;
        try {
            for (InterfaceC66023Pvf interfaceC66023Pvf : ALog.getNativeFuncAddrCallbackList()) {
                if (interfaceC66023Pvf != null) {
                    Alog alog = C15280iq.LIZ;
                    if (alog != null) {
                        j = alog.LJ();
                    } else {
                        j = 0;
                    }
                    interfaceC66023Pvf.LIZ(j);
                }
            }
            try {
                Thread.sleep(LivePlayEnforceIntervalSetting.DEFAULT);
            } catch (Exception unused) {
            }
            ALog.removeLegacyFiles(aRunnableS1S2000000_11.s0, aRunnableS1S2000000_11.s1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS1S2000000_11 aRunnableS1S2000000_11) {
        boolean LIZ;
        try {
            ALog.removeLegacyFiles(aRunnableS1S2000000_11.s0, aRunnableS1S2000000_11.s1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS1S2000000_11 aRunnableS1S2000000_11) {
        boolean LIZ;
        try {
            aRunnableS1S2000000_11.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS1S2000000_11(String str, String str2, int i) {
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}

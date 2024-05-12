package X;

import com.ss.android.ttve.monitor.IMonitor;
import com.ss.android.vesdk.runtime.VERuntime;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: X.P7x, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C63949P7x implements IMonitor {
    public final /* synthetic */ VERuntime LIZ;

    public C63949P7x(VERuntime vERuntime) {
        this.LIZ = vERuntime;
    }

    @Override // com.ss.android.ttve.monitor.IMonitor
    public final void monitorLog(String str, JSONObject jSONObject) {
        WeakReference<P84> weakReference = this.LIZ.mVEMonitorListener;
        if (weakReference != null && weakReference.get() != null) {
            this.LIZ.mVEMonitorListener.get().monitorLog(str, jSONObject);
        }
    }
}

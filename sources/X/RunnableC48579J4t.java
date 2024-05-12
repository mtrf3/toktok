package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.ml.feature.SmartDataTrackerServiceImpl;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: X.J4t, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC48579J4t implements Runnable {
    public final /* synthetic */ C48578J4s LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ Object LJLJJI;

    public RunnableC48579J4t(C48578J4s c48578J4s, String str, String str2, Object obj) {
        this.LJLIL = c48578J4s;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        JSONObject jSONObject;
        try {
            Iterator<SmartDataTrackerServiceImpl.TrackerMonitorData> it = this.LJLIL.LIZLLL.iterator();
            while (it.hasNext()) {
                SmartDataTrackerServiceImpl.TrackerMonitorData next = it.next();
                String str = this.LJLILLLLZI;
                if (str != null && TextUtils.equals(next.key, str) && (jSONObject = next.jsonData) != null) {
                    jSONObject.put(this.LJLJI, this.LJLJJI);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}

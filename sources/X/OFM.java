package X;

import android.view.View;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public interface OFM {
    void customReport(View view, C79604VMa c79604VMa);

    String getMonitorBid(View view);

    void handleCollectEvent(View view, String str, Object obj);

    void handleContainerError(View view, String str, C35894E6w c35894E6w, C61659OHv c61659OHv);

    void handleNativeInfo(View view, String str, JSONObject jSONObject);
}

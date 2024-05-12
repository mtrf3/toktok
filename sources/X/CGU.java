package X;

import com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class CGU implements CHV {
    @Override // X.CHV
    public final JSONObject LIZ() {
        JSONObject LIZIZ;
        BTA bta = (BTA) DataChannelGlobal.LJLJJI.mv0(C29051Bah.class);
        if (bta != null && (LIZIZ = bta.LIZIZ()) != null) {
            return LIZIZ;
        }
        return new JSONObject();
    }

    @Override // X.CHV
    public final CHQ LIZIZ() {
        PMC IW = ((IHostPerformanceMonitor) CN1.LIZ(IHostPerformanceMonitor.class)).IW("gift_render");
        if (IW == null) {
            return null;
        }
        return new CHQ(IW);
    }
}

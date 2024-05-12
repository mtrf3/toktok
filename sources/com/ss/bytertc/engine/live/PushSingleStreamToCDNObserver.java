package com.ss.bytertc.engine.live;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes33.dex */
public class PushSingleStreamToCDNObserver {
    public Map<String, IPushSingleStreamToCDNObserver> mPushSingleStreamToCDNObserver = new HashMap();

    public void setUserObserver(String str, IPushSingleStreamToCDNObserver iPushSingleStreamToCDNObserver) {
        if (this.mPushSingleStreamToCDNObserver == null) {
            this.mPushSingleStreamToCDNObserver = new HashMap();
        }
        if (iPushSingleStreamToCDNObserver != null && str != null) {
            this.mPushSingleStreamToCDNObserver.put(str, iPushSingleStreamToCDNObserver);
        }
    }

    public void onStreamPushEvent(ByteRTCStreamSinglePushEvent byteRTCStreamSinglePushEvent, String str, int i) {
        IPushSingleStreamToCDNObserver iPushSingleStreamToCDNObserver;
        Map<String, IPushSingleStreamToCDNObserver> map = this.mPushSingleStreamToCDNObserver;
        if (map != null && map.containsKey(str) && (iPushSingleStreamToCDNObserver = this.mPushSingleStreamToCDNObserver.get(str)) != null) {
            iPushSingleStreamToCDNObserver.onStreamPushEvent(byteRTCStreamSinglePushEvent, str, i);
        }
    }
}

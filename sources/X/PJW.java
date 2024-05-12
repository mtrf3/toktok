package X;

import com.bytedance.crash.ICommonParams;
import com.bytedance.crash.MonitorCrash;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PJW implements ICommonParams {
    public final /* synthetic */ PJU LJLIL;
    public final /* synthetic */ MonitorCrash LJLILLLLZI;

    @Override // com.bytedance.crash.ICommonParams
    public final List<String> getPatchInfo() {
        return null;
    }

    @Override // com.bytedance.crash.ICommonParams
    public final java.util.Map<String, Integer> getPluginInfo() {
        return null;
    }

    @Override // com.bytedance.crash.ICommonParams
    public final String getSessionId() {
        return null;
    }

    @Override // com.bytedance.crash.ICommonParams
    public final java.util.Map<String, Object> getCommonParams() {
        JSONObject LIZLLL = this.LJLIL.LIZLLL();
        HashMap hashMap = new HashMap();
        Iterator<String> keys = LIZLLL.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, LIZLLL.opt(next));
        }
        return hashMap;
    }

    @Override // com.bytedance.crash.ICommonParams
    public final String getDeviceId() {
        return this.LJLILLLLZI.mConfig.mDeviceId;
    }

    @Override // com.bytedance.crash.ICommonParams
    public final long getUserId() {
        return this.LJLILLLLZI.mConfig.mUID;
    }

    public PJW(PJU pju, MonitorCrash monitorCrash) {
        this.LJLIL = pju;
        this.LJLILLLLZI = monitorCrash;
    }
}

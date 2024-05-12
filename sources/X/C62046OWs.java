package X;

import com.bytedance.android.livesdk.livesetting.gecko.TTLiveGeckoSplitSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.google.gson.m;
import com.ss.android.ugc.aweme.live.Live;
import com.ss.android.ugc.aweme.live.settings.LiveSDKSettingResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OWs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62046OWs implements InterfaceC62047OWt {
    @Override // X.InterfaceC62047OWt
    public final boolean LIZ() {
        return TTLiveGeckoSplitSetting.INSTANCE.isSplit();
    }

    public static final boolean LIZIZ(String str) {
        return UnusedLogOfflineSetting.INSTANCE.isEnable(str);
    }

    public static final java.util.Map<String, Object> LIZLLL(List<String> list) {
        HashMap hashMap = new HashMap();
        if (C31205CMn.LIZ() == null) {
            return hashMap;
        }
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object LIZIZ = C30922CBq.LIZIZ(str);
            if (LIZIZ != null) {
                hashMap.put(str, LIZIZ);
            }
        }
        return hashMap;
    }

    public static final void LJI(LiveSDKSettingResponse liveSDKSettingResponse) {
        m mVar;
        if (liveSDKSettingResponse == null || liveSDKSettingResponse.status_code != 0 || (mVar = liveSDKSettingResponse.data) == null) {
            return;
        }
        C31205CMn.LJFF(EF7.LIZIZ(), mVar);
    }

    public static final boolean LJ(String str, double d) {
        return LiveMonitorSampleSetting.INSTANCE.isReportDolphin(str, d);
    }

    public static final boolean LJFF(String str, double d) {
        return LiveLogMonitorSampleSetting.INSTANCE.isReport(str, d);
    }

    public final Object LIZJ(Object obj, String str) {
        return Live.getLiteService().LJIIIZ(obj, str);
    }
}

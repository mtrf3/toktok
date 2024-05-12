package com.ss.android.ugc.aweme.video.simcommon;

import X.FMX;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IEvent;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class SimMobEvent implements IEvent {
    @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IEvent
    public void onEvent(String str, JSONObject jSONObject) {
        FMX.LJIILJJIL(str, jSONObject);
    }

    public void onEvent(String str, String str2, long j) {
        MobClick obtain = MobClick.obtain();
        obtain.setEventName(str);
        obtain.setLabelName(str2);
        obtain.setExtValueLong(j);
        FMX.onEvent(obtain);
    }

    public void onEvent(String str, String str2, String str3) {
        MobClick obtain = MobClick.obtain();
        obtain.setEventName(str);
        obtain.setLabelName(str2);
        obtain.setExtValueString(str3);
        FMX.onEvent(obtain);
    }
}

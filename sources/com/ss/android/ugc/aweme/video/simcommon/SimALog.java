package com.ss.android.ugc.aweme.video.simcommon;

import X.C36922EeM;
import X.C47150Iew;
import X.IWS;
import android.text.TextUtils;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IALog;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class SimALog implements IALog {
    @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IALog
    public boolean isEnabled() {
        return IWS.LIZ;
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IALog
    public void d(String msg) {
        o.LJIIIZ(msg, "msg");
        if (!IWS.LIZ) {
            return;
        }
        C36922EeM.LIZLLL(3, "VideoPlayer_Log", msg);
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IALog
    public void d(String str, JSONObject jSONObject) {
        C47150Iew.LIZIZ(str, jSONObject);
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IALog
    public void e(String eventName, JSONObject msg) {
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(msg, "msg");
        if (!IWS.LIZ) {
            return;
        }
        String LIZ = C47150Iew.LIZ(eventName, msg);
        if (TextUtils.isEmpty(LIZ)) {
            return;
        }
        C36922EeM.LIZLLL(6, "VideoPlayer_Log", LIZ);
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IALog
    public void i(String eventName, JSONObject msg) {
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(msg, "msg");
        if (!IWS.LIZ) {
            return;
        }
        String LIZ = C47150Iew.LIZ(eventName, msg);
        if (TextUtils.isEmpty(LIZ)) {
            return;
        }
        C36922EeM.LIZLLL(4, "VideoPlayer_Log", LIZ);
    }

    public void v(String eventName, JSONObject msg) {
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(msg, "msg");
        if (!IWS.LIZ) {
            return;
        }
        String LIZ = C47150Iew.LIZ(eventName, msg);
        if (TextUtils.isEmpty(LIZ)) {
            return;
        }
        C36922EeM.LIZLLL(2, "VideoPlayer_Log", LIZ);
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IALog
    public void w(String eventName, JSONObject msg) {
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(msg, "msg");
        if (!IWS.LIZ) {
            return;
        }
        String LIZ = C47150Iew.LIZ(eventName, msg);
        if (TextUtils.isEmpty(LIZ)) {
            return;
        }
        C36922EeM.LIZLLL(5, "VideoPlayer_Log", LIZ);
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IALog
    public void e(String str, String str2) {
        C47150Iew.LIZJ(str, str2);
    }
}

package com.heytap.mcssdk.d;

import X.C16880lQ;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.heytap.msp.push.mode.BaseMode;
import com.heytap.msp.push.mode.DataMessage;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes28.dex */
public class b extends c {
    @Override // com.heytap.mcssdk.d.d
    public BaseMode a(Context context, int i, Intent intent) {
        if (4103 != i && 4098 != i && 4108 != i) {
            return null;
        }
        BaseMode a = a(intent, i);
        com.heytap.mcssdk.f.a.a(context, "push_transmit", (DataMessage) a);
        return a;
    }

    @Override // com.heytap.mcssdk.d.c
    public BaseMode a(Intent intent, int i) {
        try {
            DataMessage dataMessage = new DataMessage();
            dataMessage.setMessageID(com.heytap.mcssdk.utils.b.d(C16880lQ.LLJJIJIIJIL(intent, "messageID")));
            dataMessage.setTaskID(com.heytap.mcssdk.utils.b.d(C16880lQ.LLJJIJIIJIL(intent, "taskID")));
            dataMessage.setGlobalId(com.heytap.mcssdk.utils.b.d(C16880lQ.LLJJIJIIJIL(intent, "globalID")));
            dataMessage.setAppPackage(com.heytap.mcssdk.utils.b.d(C16880lQ.LLJJIJIIJIL(intent, "appPackage")));
            dataMessage.setTitle(com.heytap.mcssdk.utils.b.d(C16880lQ.LLJJIJIIJIL(intent, "title")));
            dataMessage.setContent(com.heytap.mcssdk.utils.b.d(C16880lQ.LLJJIJIIJIL(intent, "content")));
            dataMessage.setDescription(com.heytap.mcssdk.utils.b.d(C16880lQ.LLJJIJIIJIL(intent, "description")));
            String d = com.heytap.mcssdk.utils.b.d(C16880lQ.LLJJIJIIJIL(intent, "notifyID"));
            dataMessage.setNotifyID(TextUtils.isEmpty(d) ? 0 : CastIntegerProtector.parseInt(d));
            dataMessage.setMiniProgramPkg(com.heytap.mcssdk.utils.b.d(C16880lQ.LLJJIJIIJIL(intent, "miniProgramPkg")));
            dataMessage.setMessageType(i);
            dataMessage.setEventId(com.heytap.mcssdk.utils.b.d(C16880lQ.LLJJIJIIJIL(intent, "eventId")));
            dataMessage.setStatisticsExtra(com.heytap.mcssdk.utils.b.d(C16880lQ.LLJJIJIIJIL(intent, "statistics_extra")));
            String d2 = com.heytap.mcssdk.utils.b.d(C16880lQ.LLJJIJIIJIL(intent, "data_extra"));
            dataMessage.setDataExtra(d2);
            String a = a(d2);
            dataMessage.setMsgCommand(TextUtils.isEmpty(a) ? 0 : CastIntegerProtector.parseInt(a));
            dataMessage.setBalanceTime(com.heytap.mcssdk.utils.b.d(C16880lQ.LLJJIJIIJIL(intent, "balanceTime")));
            dataMessage.setStartDate(com.heytap.mcssdk.utils.b.d(C16880lQ.LLJJIJIIJIL(intent, "startDate")));
            dataMessage.setEndDate(com.heytap.mcssdk.utils.b.d(C16880lQ.LLJJIJIIJIL(intent, "endDate")));
            dataMessage.setTimeRanges(com.heytap.mcssdk.utils.b.d(C16880lQ.LLJJIJIIJIL(intent, "timeRanges")));
            dataMessage.setRule(com.heytap.mcssdk.utils.b.d(C16880lQ.LLJJIJIIJIL(intent, "rule")));
            dataMessage.setForcedDelivery(com.heytap.mcssdk.utils.b.d(C16880lQ.LLJJIJIIJIL(intent, "forcedDelivery")));
            dataMessage.setDistinctContent(com.heytap.mcssdk.utils.b.d(C16880lQ.LLJJIJIIJIL(intent, "distinctBycontent")));
            dataMessage.setAppId(com.heytap.mcssdk.utils.b.d(C16880lQ.LLJJIJIIJIL(intent, "appID")));
            return dataMessage;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("OnHandleIntent--");
            LIZ.append(e.getMessage());
            com.heytap.mcssdk.utils.d.b(X1D.LIZIZ(LIZ));
            return null;
        }
    }

    public String a(String str) {
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            str2 = new JSONObject(str).optString("msg_command");
            return str2;
        } catch (JSONException e) {
            com.heytap.mcssdk.utils.d.b(e.getMessage());
            return str2;
        }
    }
}

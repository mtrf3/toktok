package com.heytap.mcssdk.e;

import X.C16880lQ;
import X.X1D;
import android.app.NotificationManager;
import android.content.Context;
import com.heytap.mcssdk.utils.d;
import com.heytap.mcssdk.utils.f;
import com.heytap.msp.push.callback.IDataMessageCallBackService;
import com.heytap.msp.push.mode.BaseMode;
import com.heytap.msp.push.mode.DataMessage;
import com.heytap.msp.push.statis.StatisticUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes28.dex */
public class b implements c {
    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, DataMessage dataMessage) {
        if (context == null) {
            d.b("context is null");
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Receive revokeMessage  extra : ");
        LIZ.append(dataMessage.getStatisticsExtra());
        LIZ.append("notifyId :");
        LIZ.append(dataMessage.getNotifyID());
        LIZ.append("messageId : ");
        LIZ.append(dataMessage.getTaskID());
        d.b(X1D.LIZIZ(LIZ));
        ((NotificationManager) C16880lQ.LLILL(context, "notification")).cancel(dataMessage.getNotifyID());
        b(context, dataMessage);
    }

    private void b(Context context, DataMessage dataMessage) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(dataMessage);
        hashMap.put(dataMessage.getEventId(), arrayList);
        StatisticUtils.statisticEvent(context, hashMap);
    }

    @Override // com.heytap.mcssdk.e.c
    public void a(final Context context, BaseMode baseMode, final IDataMessageCallBackService iDataMessageCallBackService) {
        if (baseMode != null && baseMode.getType() == 4103) {
            final DataMessage dataMessage = (DataMessage) baseMode;
            if (iDataMessageCallBackService != null) {
                f.b(new Runnable() { // from class: com.heytap.mcssdk.e.b.1
                    public void com_heytap_mcssdk_e_b$1__run$___twin___() {
                        if (dataMessage.getMsgCommand() == 1) {
                            b.this.a(context, dataMessage);
                        } else {
                            iDataMessageCallBackService.processMessage(context, dataMessage);
                        }
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        com_heytap_mcssdk_e_b$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public static void com_heytap_mcssdk_e_b$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                        boolean LIZ;
                        try {
                            anonymousClass1.com_heytap_mcssdk_e_b$1__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
            }
        }
    }
}

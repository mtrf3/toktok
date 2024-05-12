package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import X.AbstractC67354Qc2;
import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C67350Qby;
import X.C67352Qc0;
import X.C67356Qc4;
import X.C67380QcS;
import X.C84763XOl;
import Y.ARunnableS11S0301000_11;
import Y.ARunnableS5S0001000_10;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, Intent intent) {
        String queryParameter = UriProtector.getQueryParameter(intent.getData(), "backendName");
        String queryParameter2 = UriProtector.getQueryParameter(intent.getData(), "extras");
        int intValue = CastIntegerProtector.valueOf(UriProtector.getQueryParameter(intent.getData(), "priority")).intValue();
        int i = C16880lQ.LLJJIJI(intent).getInt("attemptNumber");
        C67350Qby.LIZIZ(context);
        C67352Qc0 LIZ2 = AbstractC67354Qc2.LIZ();
        LIZ2.LIZIZ(queryParameter);
        LIZ2.LIZJ(C67356Qc4.LIZIZ(intValue));
        if (queryParameter2 != null) {
            LIZ2.LIZIZ = Base64.decode(queryParameter2, 0);
        }
        C67380QcS c67380QcS = C67350Qby.LIZ().LIZLLL;
        c67380QcS.LJ.execute(new ARunnableS11S0301000_11(i, c67380QcS, LIZ2.LIZ(), new ARunnableS5S0001000_10(0, 1), 4));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ(context, intent);
        } else {
            C38523F9z.LIZ();
            LIZ(context, intent);
        }
    }
}

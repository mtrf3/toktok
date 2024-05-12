package X;

import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.compliance.business.agecontrol.PNSAgeControlService;

/* loaded from: classes10.dex */
public class MAZ extends AppWidgetProvider {
    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            try {
                PNSAgeControlService.LIZIZ().LIZ(C16880lQ.LJLLJ(getClass()));
            } catch (Exception unused) {
            }
            super.onReceive(context, intent);
        } else {
            C38523F9z.LIZ();
            try {
                PNSAgeControlService.LIZIZ().LIZ(C16880lQ.LJLLJ(getClass()));
            } catch (Exception unused2) {
            }
            super.onReceive(context, intent);
        }
    }
}

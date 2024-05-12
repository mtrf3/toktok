package com.google.android.play.core.appupdate;

import X.AbstractC40557Fvt;
import X.C13T;
import X.C16880lQ;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.install.InstallState;

/* loaded from: classes7.dex */
public final class e extends AbstractC40557Fvt<InstallState> {
    public e(Context context) {
        super(new C13T("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    @Override // X.AbstractC40557Fvt
    public final void LIZ(Context context, Intent intent) {
        if (!context.getPackageName().equals(C16880lQ.LLJJIJIIJIL(intent, "package.name"))) {
            this.LIZ.LIZJ("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", 3, new Object[]{C16880lQ.LLJJIJIIJIL(intent, "package.name")});
            return;
        }
        this.LIZ.LIZJ("List of extras in received intent:", 3, new Object[0]);
        for (String str : C16880lQ.LLJJIJI(intent).keySet()) {
            this.LIZ.LIZJ("Key: %s; value: %s", 3, new Object[]{str, C16880lQ.LLJJIII(C16880lQ.LLJJIJI(intent), str)});
        }
        C13T c13t = this.LIZ;
        c13t.LIZJ("List of extras in received intent needed by fromUpdateIntent:", 3, new Object[0]);
        c13t.LIZJ("Key: %s; value: %s", 3, new Object[]{"install.status", Integer.valueOf(intent.getIntExtra("install.status", 0))});
        c13t.LIZJ("Key: %s; value: %s", 3, new Object[]{"error.code", Integer.valueOf(intent.getIntExtra("error.code", 0))});
        com.google.android.play.core.install.b bVar = new com.google.android.play.core.install.b(intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra("install.status", 0), intent.getIntExtra("error.code", 0), C16880lQ.LLJJIJIIJIL(intent, "package.name"));
        this.LIZ.LIZJ("ListenerRegistryBroadcastReceiver.onReceive: %s", 3, new Object[]{bVar});
        LJFF(bVar);
    }
}

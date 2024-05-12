package com.ss.android.ugc.aweme.push.downgrade;

import X.C0RN;
import X.C16880lQ;
import X.C36839Ed1;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.X1D;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.List;

/* loaded from: classes7.dex */
public class NotifyPushStatusTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "NotifyPushStatusTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 34;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        String LIZ = C36839Ed1.LIZ(context);
        if (!TextUtils.isEmpty(LIZ)) {
            if (LIZ.endsWith(":push") || LIZ.endsWith(":pushservice")) {
                try {
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) C16880lQ.LLILL(context, "activity")).getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                            if (runningAppProcessInfo != null && !TextUtils.isEmpty(runningAppProcessInfo.processName) && TextUtils.equals(runningAppProcessInfo.processName, context.getPackageName())) {
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("content://");
                                LIZ2.append(context.getPackageName());
                                LIZ2.append(".push.status");
                                context.getContentResolver().call(UriProtector.parse(X1D.LIZIZ(LIZ2)), "", LIZ, new Bundle());
                                return;
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }
}

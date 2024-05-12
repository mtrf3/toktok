package X;

import android.app.ActivityManager;

/* loaded from: classes12.dex */
public final class PLB {
    public static String LIZ(ActivityManager.ProcessErrorStateInfo processErrorStateInfo) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("|------------- processErrorStateInfo--------------|\ncondition: ");
        LIZ.append(processErrorStateInfo.condition);
        LIZ.append("\nprocessName: ");
        LIZ.append(processErrorStateInfo.processName);
        LIZ.append("\npid: ");
        LIZ.append(processErrorStateInfo.pid);
        LIZ.append("\nuid: ");
        LIZ.append(processErrorStateInfo.uid);
        LIZ.append("\ntag: ");
        LIZ.append(processErrorStateInfo.tag);
        LIZ.append("\nshortMsg : ");
        LIZ.append(processErrorStateInfo.shortMsg);
        LIZ.append("\nlongMsg : ");
        return JBR.LJFF(LIZ, processErrorStateInfo.longMsg, "\n-----------------------end----------------------------", LIZ);
    }

    public static boolean LIZIZ(ActivityManager.ProcessErrorStateInfo processErrorStateInfo, ActivityManager.ProcessErrorStateInfo processErrorStateInfo2) {
        if (String.valueOf(processErrorStateInfo.condition).equals(String.valueOf(processErrorStateInfo2.condition)) && String.valueOf(processErrorStateInfo.processName).equals(String.valueOf(processErrorStateInfo2.processName)) && String.valueOf(processErrorStateInfo.pid).equals(String.valueOf(processErrorStateInfo2.pid)) && String.valueOf(processErrorStateInfo.uid).equals(String.valueOf(processErrorStateInfo2.uid)) && String.valueOf(processErrorStateInfo.tag).equals(String.valueOf(processErrorStateInfo2.tag)) && String.valueOf(processErrorStateInfo.shortMsg).equals(String.valueOf(processErrorStateInfo2.shortMsg)) && String.valueOf(processErrorStateInfo.longMsg).equals(String.valueOf(processErrorStateInfo2.longMsg))) {
            return true;
        }
        return false;
    }
}

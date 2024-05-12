package X;

import android.app.Activity;
import android.content.Intent;

/* renamed from: X.EiI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37166EiI {
    public static void LIZ() {
        Activity LIZIZ = FKM.LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.sendBroadcast(new Intent("COM.PNS.LEAVE_THIRD_CONTAINER"));
        }
    }

    public static void LIZIZ() {
        Activity LIZIZ = FKM.LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.sendBroadcast(new Intent("COM.PNS.ENTER_THIRD_CONTAINER"));
        }
    }
}

package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.VIw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79522VIw {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, String containerID, String str, C82996Whk c82996Whk) {
        String str2;
        o.LJIIJ(containerID, "containerID");
        C79453VGf.LIZIZ.getValue().getClass();
        List LIZ2 = C79453VGf.LIZ(containerID, str);
        if (LIZ2 != null) {
            Iterator it = ((ArrayList) LIZ2).iterator();
            while (it.hasNext()) {
                ((InterfaceC79523VIx) it.next()).LIZIZ();
            }
            if (c82996Whk != null) {
                c82996Whk.LIZ();
                return;
            }
            return;
        }
        if (str != null) {
            str2 = "The socketTaskID doesn't exist";
        } else {
            str2 = "The containerID doesn't exist";
        }
        if (c82996Whk != null) {
            c82996Whk.LIZIZ.LJIILL(str2);
        }
    }
}

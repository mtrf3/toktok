package X;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VCN {
    public static final List<VCO> LIZ;

    static {
        ArrayList arrayList = new ArrayList();
        LIZ = arrayList;
        arrayList.add(VCG.LIZ);
        arrayList.add(VCM.LIZ);
    }

    public static void LIZ(Activity act, VCK type) {
        o.LJIIIZ(act, "act");
        o.LJIIIZ(type, "type");
        try {
            WeakReference<Activity> weakReference = new WeakReference<>(act);
            Iterator it = ((ArrayList) LIZ).iterator();
            while (it.hasNext()) {
                ((VCO) it.next()).LIZ(weakReference, type);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LIZIZ(Activity act, VCK type) {
        o.LJIIIZ(act, "act");
        o.LJIIIZ(type, "type");
        try {
            WeakReference<Activity> weakReference = new WeakReference<>(act);
            Iterator it = ((ArrayList) LIZ).iterator();
            while (it.hasNext()) {
                ((VCO) it.next()).LIZIZ(weakReference, type);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}

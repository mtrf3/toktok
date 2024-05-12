package X;

import android.app.Activity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ps7, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65803Ps7 {
    public static final List<InterfaceC65804Ps8> LIZ;

    static {
        ArrayList arrayList = new ArrayList();
        LIZ = arrayList;
        arrayList.add(new C64408PPo());
    }

    public static void LIZIZ(Activity activity) {
        Iterator it = ((ArrayList) LIZ).iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC65804Ps8) it.next()).LIZJ(activity);
            } catch (Exception unused) {
            }
        }
    }

    public static void LIZJ(Activity activity) {
        Iterator it = ((ArrayList) LIZ).iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC65804Ps8) it.next()).LIZIZ(activity);
            } catch (Exception unused) {
            }
        }
    }

    public static void LIZLLL(Activity activity) {
        Iterator it = ((ArrayList) LIZ).iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC65804Ps8) it.next()).LIZLLL(activity);
            } catch (Exception unused) {
            }
        }
    }

    public static void LJ(Activity activity) {
        Iterator it = ((ArrayList) LIZ).iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC65804Ps8) it.next()).LJII(activity);
            } catch (Exception unused) {
            }
        }
    }

    public static void LJFF(Activity activity) {
        Iterator it = ((ArrayList) LIZ).iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC65804Ps8) it.next()).LJ(activity);
            } catch (Exception unused) {
            }
        }
    }

    public static void LIZ(Activity activity, Bundle bundle) {
        Iterator it = ((ArrayList) LIZ).iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC65804Ps8) it.next()).LJFF(activity, bundle);
            } catch (Exception unused) {
            }
        }
    }
}

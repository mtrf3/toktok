package X;

import android.app.Activity;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: X.GkF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42383GkF {
    public final java.util.Set<Activity> LIZ = Collections.newSetFromMap(new WeakHashMap());
    public final List<InterfaceC42386GkI> LIZIZ = new ArrayList();
    public final List<InterfaceC42382GkE> LIZJ = new ArrayList();
    public int LIZLLL = 0;
    public boolean LJ = false;

    public final void LIZ() {
        if (this.LJ) {
        } else {
            throw new IllegalStateException("call this method after CreativeActivityMonitor is inited!");
        }
    }

    public static boolean LIZIZ(Activity activity) {
        if (TextUtils.equals(C16880lQ.LJLLJ(activity.getClass()), "LiveBgBroadcastActivity") || TextUtils.equals(C16880lQ.LJLLJ(activity.getClass()), "LiveBroadcastActivity")) {
            return true;
        }
        return false;
    }

    public final void LIZJ(C42381GkD c42381GkD) {
        List<InterfaceC42382GkE> list;
        if (C42385GkH.LIZ()) {
            list = new ArrayList(this.LIZJ);
        } else {
            list = this.LIZJ;
        }
        for (InterfaceC42382GkE interfaceC42382GkE : list) {
            if (C42385GkH.LIZ()) {
                if (interfaceC42382GkE != null) {
                    interfaceC42382GkE.LIZ(c42381GkD);
                }
            } else {
                interfaceC42382GkE.LIZ(c42381GkD);
            }
        }
    }

    public final void LIZLLL(int i) {
        List<InterfaceC42386GkI> list;
        if (C42385GkH.LIZ()) {
            list = new ArrayList(this.LIZIZ);
        } else {
            list = this.LIZIZ;
        }
        for (InterfaceC42386GkI interfaceC42386GkI : list) {
            if (C42385GkH.LIZ()) {
                if (interfaceC42386GkI != null) {
                    interfaceC42386GkI.onAppStateChanged(i);
                }
            } else {
                interfaceC42386GkI.onAppStateChanged(i);
            }
        }
    }
}

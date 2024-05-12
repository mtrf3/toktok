package X;

import android.app.Activity;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Gle, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42470Gle {
    public static final LinkedList<Activity> LJFF = new LinkedList<>();
    public boolean LIZIZ;
    public boolean LJ;
    public final List<InterfaceC42472Glg> LIZ = new CopyOnWriteArrayList();
    public int LIZJ = 0;
    public int LIZLLL = 0;

    public static Activity LIZ() {
        LinkedList<Activity> linkedList = LJFF;
        if (linkedList.isEmpty()) {
            return null;
        }
        return linkedList.getLast();
    }

    public final boolean LIZIZ() {
        if (this.LIZJ <= 0) {
            return true;
        }
        return false;
    }

    public final void LIZJ() {
        if (this.LIZJ > 0) {
            if (!this.LJ) {
                Iterator it = ((CopyOnWriteArrayList) this.LIZ).iterator();
                while (it.hasNext()) {
                    ((InterfaceC42472Glg) it.next()).onAppForeground();
                }
                this.LJ = true;
                return;
            }
            return;
        }
        if (this.LJ) {
            C60903NvH.LJIIJJI().getPublishService().LJJ().LJ("AppMonitor", "app enter background");
            Iterator it2 = ((CopyOnWriteArrayList) this.LIZ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC42472Glg) it2.next()).onAppBackground();
            }
            this.LJ = false;
        }
    }

    public final void LIZLLL(InterfaceC42472Glg interfaceC42472Glg) {
        if (((CopyOnWriteArrayList) this.LIZ).contains(interfaceC42472Glg)) {
            return;
        }
        ((CopyOnWriteArrayList) this.LIZ).add(interfaceC42472Glg);
    }

    public final void LJ(InterfaceC42472Glg interfaceC42472Glg) {
        if (!((CopyOnWriteArrayList) this.LIZ).contains(interfaceC42472Glg)) {
            return;
        }
        ((CopyOnWriteArrayList) this.LIZ).remove(interfaceC42472Glg);
    }
}

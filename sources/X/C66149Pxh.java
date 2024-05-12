package X;

import com.bytedance.helios.apimonitor.CustomAnchorMonitorImpl;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Pxh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66149Pxh implements InterfaceC66171Py3 {
    @Override // X.InterfaceC66171Py3
    public final void LIZIZ() {
        CustomAnchorMonitorImpl customAnchorMonitorImpl = CustomAnchorMonitorImpl.INSTANCE;
        synchronized (customAnchorMonitorImpl.getResourceList()) {
            List<C66120PxE> list = customAnchorMonitorImpl.getResourceList().get(2);
            if (list != null) {
                list.clear();
            }
        }
    }

    @Override // X.InterfaceC66171Py3
    public final void LIZ(C66120PxE c66120PxE) {
        CustomAnchorMonitorImpl customAnchorMonitorImpl = CustomAnchorMonitorImpl.INSTANCE;
        synchronized (customAnchorMonitorImpl.getResourceList()) {
            List<C66120PxE> list = customAnchorMonitorImpl.getResourceList().get(2);
            if (list != null) {
                list.add(c66120PxE);
            }
        }
    }

    @Override // X.InterfaceC66171Py3
    public final void LIZJ(long j, C66120PxE event) {
        o.LJIIIZ(event, "event");
        CustomAnchorMonitorImpl customAnchorMonitorImpl = CustomAnchorMonitorImpl.INSTANCE;
        synchronized (customAnchorMonitorImpl.getResourceList()) {
            List<C66120PxE> list = customAnchorMonitorImpl.getResourceList().get(2);
            if (list != null) {
                Iterator<C66120PxE> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().LJZ == j) {
                        it.remove();
                    }
                }
            }
        }
    }
}

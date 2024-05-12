package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.4fO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C115064fO {
    public String LIZ;
    public String LIZIZ;
    public final HashMap<String, Object> LIZJ = new HashMap<>();
    public final HashMap<String, Object> LIZLLL = new HashMap<>();

    public final void LIZ() {
        String service = this.LIZ;
        String name = this.LIZIZ;
        HashMap<String, Object> map = this.LIZJ;
        HashMap<String, Object> originData = this.LIZLLL;
        o.LJIIIZ(service, "service");
        o.LJIIIZ(name, "name");
        o.LJIIIZ(map, "map");
        o.LJIIIZ(originData, "originData");
        InterfaceC63336OtQ interfaceC63336OtQ = C63337OtR.LIZ;
        if (interfaceC63336OtQ != null) {
            interfaceC63336OtQ.LJII(service, name, map);
        }
        StringBuilder LIZLLL = C06540Nm.LIZLLL("IMMonitor monitorImEvent() called with: service = [", service, "], name = [", name, "], map = [");
        LIZLLL.append(map);
        LIZLLL.append("], originData = [");
        LIZLLL.append(originData);
        LIZLLL.append(']');
        C63322OtC.LJFF(X1D.LIZIZ(LIZLLL));
    }
}

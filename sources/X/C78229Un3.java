package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Un3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78229Un3 implements InterfaceC78235Un9 {
    public final List<InterfaceC78233Un7> LIZ;
    public final C32449CoP LIZIZ;

    @Override // X.InterfaceC78235Un9
    public final InterfaceC78234Un8 LIZIZ() {
        return null;
    }

    @Override // X.InterfaceC78235Un9
    public final InterfaceC78233Un7 LIZ() {
        InterfaceC78233Un7 interfaceC78233Un7 = null;
        if (this.LIZIZ.LJ == null) {
            return null;
        }
        Iterator<InterfaceC78233Un7> it = this.LIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InterfaceC78233Un7 next = it.next();
            if (next.getType() == EnumC78220Umu.COMBINATION) {
                interfaceC78233Un7 = next;
                break;
            }
        }
        return interfaceC78233Un7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C78229Un3(List<? extends InterfaceC78233Un7> list, C32449CoP request) {
        o.LJIIIZ(request, "request");
        this.LIZ = list;
        this.LIZIZ = request;
    }
}

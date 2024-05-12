package X;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.Eqb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37681Eqb implements InterfaceC40311Frv {
    public final /* synthetic */ WeakReference<InterfaceC37460En2> LIZ;

    public C37681Eqb(WeakReference<InterfaceC37460En2> weakReference) {
        this.LIZ = weakReference;
    }

    @Override // X.InterfaceC40311Frv
    public final void LIZ(InterfaceC78280Uns interfaceC78280Uns, String eventName) {
        java.util.Map<String, Object> map;
        o.LJIIIZ(eventName, "eventName");
        InterfaceC37460En2 interfaceC37460En2 = this.LIZ.get();
        if (interfaceC37460En2 != null) {
            if (interfaceC78280Uns != null) {
                map = interfaceC78280Uns.LIZIZ();
            } else {
                map = null;
            }
            interfaceC37460En2.LIZ(map, eventName);
        }
    }
}

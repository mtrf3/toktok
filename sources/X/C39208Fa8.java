package X;

import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.Fa8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39208Fa8 implements InterfaceC39209Fa9 {
    public static final C39208Fa8 LIZIZ = new C39208Fa8();
    public static final java.util.Set<InterfaceC39209Fa9> LIZ = new LinkedHashSet();

    @Override // X.InterfaceC39209Fa9
    public final void LIZ(OHW certContext, C66300Q0i c66300Q0i) {
        o.LJIIJ(certContext, "certContext");
        Iterator<InterfaceC39209Fa9> it = LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZ(certContext, c66300Q0i);
        }
    }

    @Override // X.InterfaceC39209Fa9
    public final void LIZIZ(OHW certContext, C66300Q0i c66300Q0i) {
        o.LJIIJ(certContext, "certContext");
        Iterator<InterfaceC39209Fa9> it = LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(certContext, c66300Q0i);
        }
    }
}

package X;

import java.util.LinkedHashSet;

/* renamed from: X.Nqv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60633Nqv extends AbstractC60346NmI {
    @Override // X.AbstractC60346NmI
    public final void LIZ(C60628Nqq c60628Nqq) {
        LinkedHashSet<Class<? extends AbstractC60629Nqr>> linkedHashSet;
        if (InterfaceC60708Ns8.class.isAssignableFrom(C60647Nr9.class)) {
            linkedHashSet = c60628Nqq.LIZ;
        } else if (InterfaceC60707Ns7.class.isAssignableFrom(C60647Nr9.class)) {
            linkedHashSet = c60628Nqq.LIZIZ;
        } else {
            throw new Error();
        }
        linkedHashSet.add(C60647Nr9.class);
    }
}

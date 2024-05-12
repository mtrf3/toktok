package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Spy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73314Spy implements InterfaceC73317Sq1 {
    public final C73315Spz<InterfaceC73317Sq1> LJLIL = new C73315Spz<>(32);

    @Override // X.InterfaceC73317Sq1
    public final void release() {
        InterfaceC73317Sq1[] interfaceC73317Sq1Arr = this.LJLIL.LIZLLL;
        o.LJFF(interfaceC73317Sq1Arr, "hashSet.keys()");
        for (InterfaceC73317Sq1 interfaceC73317Sq1 : interfaceC73317Sq1Arr) {
            if (interfaceC73317Sq1 instanceof InterfaceC73317Sq1) {
                interfaceC73317Sq1.release();
                this.LJLIL.LIZIZ(interfaceC73317Sq1);
            }
        }
    }
}

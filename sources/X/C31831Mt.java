package X;

import kotlin.jvm.internal.IDqS416S0100000;

/* renamed from: X.1Mt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31831Mt implements C0UO {
    public final InterfaceC88472Yns<Float, C76800UCe> LIZ;
    public final C31851Mv LIZIZ = new C0UZ() { // from class: X.1Mv
        @Override // X.C0UZ
        public final void LIZIZ(float f) {
            C31831Mt.this.LIZ.invoke(Float.valueOf(f));
        }
    };
    public final C0SJ LIZJ = new C0SJ();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1Mv] */
    public C31831Mt(IDqS416S0100000 iDqS416S0100000) {
        this.LIZ = iDqS416S0100000;
    }

    @Override // X.C0UO
    public final Object LIZ(C0SF c0sf, InterfaceC88471Ynr<? super C0UZ, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88471Ynr, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object LJI = C48841JEv.LJI(new C54662Co(this, c0sf, interfaceC88471Ynr, null), interfaceC67352kd);
        if (LJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJI;
        }
        return C76800UCe.LIZ;
    }
}

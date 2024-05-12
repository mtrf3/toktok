package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* renamed from: X.1My, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31881My implements C0UK {
    public final InterfaceC88472Yns<Float, Float> LIZ;
    public final C31871Mx LIZIZ = new C0UY() { // from class: X.1Mx
        @Override // X.C0UY
        public final float LIZ(float f) {
            return C31881My.this.LIZ.invoke(Float.valueOf(f)).floatValue();
        }
    };
    public final C0SJ LIZJ = new C0SJ();
    public final ParcelableSnapshotMutableState LIZLLL = C78966Uyw.LJJJIL(Boolean.FALSE);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0UK
    public final boolean LIZ() {
        return ((Boolean) this.LIZLLL.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.1Mx] */
    public C31881My(InterfaceC88472Yns<? super Float, Float> interfaceC88472Yns) {
        this.LIZ = interfaceC88472Yns;
    }

    @Override // X.C0UK
    public final float LIZJ(float f) {
        return this.LIZ.invoke(Float.valueOf(f)).floatValue();
    }

    @Override // X.C0UK
    public final Object LIZIZ(C0SF c0sf, InterfaceC88471Ynr<? super C0UY, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88471Ynr, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object LJI = C48841JEv.LJI(new C54762Cy(this, c0sf, interfaceC88471Ynr, null), interfaceC67352kd);
        if (LJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJI;
        }
        return C76800UCe.LIZ;
    }
}

package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.IDqS416S0100000;

/* renamed from: X.1Lf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31431Lf implements C0UK {
    public static final C1HY LJFF = C0MJ.LIZ(C49011w9.LJLIL, C49001w8.LJLIL);
    public final ParcelableSnapshotMutableState LIZ;
    public final C42191l9 LIZIZ;
    public final ParcelableSnapshotMutableState LIZJ;
    public float LIZLLL;
    public final C31881My LJ;

    @Override // X.C0UK
    public final boolean LIZ() {
        return this.LJ.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int LJ() {
        return ((Number) this.LIZ.getValue()).intValue();
    }

    public C31431Lf(int i) {
        Integer valueOf = Integer.valueOf(i);
        C36041bE c36041bE = C36041bE.LIZ;
        this.LIZ = C78966Uyw.LJJJI(valueOf, c36041bE);
        this.LIZIZ = new C42191l9();
        this.LIZJ = C78966Uyw.LJJJI(Integer.MAX_VALUE, c36041bE);
        this.LJ = new C31881My(new IDqS416S0100000(this, 160));
    }

    @Override // X.C0UK
    public final float LIZJ(float f) {
        return this.LJ.LIZJ(f);
    }

    public static Object LIZLLL(C31431Lf c31431Lf, int i, InterfaceC67352kd interfaceC67352kd) {
        Object LIZ = C0UW.LIZ(c31431Lf, i - c31431Lf.LJ(), new C41391jr(null, 7), interfaceC67352kd);
        if (LIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZ;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.C0UK
    public final Object LIZIZ(C0SF c0sf, InterfaceC88471Ynr<? super C0UY, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88471Ynr, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object LIZIZ = this.LJ.LIZIZ(c0sf, interfaceC88471Ynr, interfaceC67352kd);
        if (LIZIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZIZ;
        }
        return C76800UCe.LIZ;
    }
}

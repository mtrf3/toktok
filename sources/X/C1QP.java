package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.List;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1QP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1QP implements C0UK {
    public static final C1HY LJIJJ = C79043V0l.LJIIZILJ(C20T.LJLIL, C20S.LJLIL);
    public final C11390cZ LIZ;
    public final ParcelableSnapshotMutableState LIZIZ;
    public final C42191l9 LIZJ;
    public float LIZLLL;
    public final ParcelableSnapshotMutableState LJ;
    public final ParcelableSnapshotMutableState LJFF;
    public final ParcelableSnapshotMutableState LJI;
    public final C31881My LJII;
    public final boolean LJIIIIZZ;
    public int LJIIIZ;
    public final C25710zf<InterfaceC13120fM> LJIIJ;
    public boolean LJIIJJI;
    public final ParcelableSnapshotMutableState LJIIL;
    public final C20V LJIILIIL;
    public final C51361zw LJIILJJIL;
    public final ParcelableSnapshotMutableState LJIILL;
    public final ParcelableSnapshotMutableState LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public final C13140fO LJIJI;

    public C1QP() {
        this(0, 0);
    }

    @Override // X.C0UK
    public final boolean LIZ() {
        return this.LJII.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int LIZLLL() {
        return ((C11310cR) this.LIZ.LIZ.getValue()).LIZ;
    }

    public final InterfaceC11290cP LJ() {
        return (InterfaceC11290cP) this.LIZIZ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJFF() {
        return ((Boolean) this.LJI.getValue()).booleanValue();
    }

    @Override // X.C0UK
    public final float LIZJ(float f) {
        return this.LJII.LIZJ(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJI(C1QN itemProvider) {
        o.LJIIIZ(itemProvider, "itemProvider");
        C11390cZ c11390cZ = this.LIZ;
        c11390cZ.getClass();
        C0OA LIZ = C0O8.LIZ();
        try {
            C0OA LJIIIIZZ = LIZ.LJIIIIZZ();
            try {
                c11390cZ.LIZ(C78977Uz7.LJJIJLIJ(itemProvider, c11390cZ.LIZLLL, ((C11310cR) c11390cZ.LIZ.getValue()).LIZ), ((Number) c11390cZ.LIZIZ.getValue()).intValue());
            } finally {
                C0OA.LJIILJJIL(LJIIIIZZ);
            }
        } finally {
            LIZ.LIZJ();
        }
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.20V] */
    public C1QP(int i, int i2) {
        this.LIZ = new C11390cZ(i, i2);
        this.LIZIZ = C78966Uyw.LJJJIL(new InterfaceC11290cP() { // from class: X.1QG
            public static final C61878OQg LIZIZ = C61878OQg.INSTANCE;

            @Override // X.InterfaceC11290cP
            public final int LIZ() {
                return 0;
            }

            @Override // X.InterfaceC11290cP
            public final int LIZLLL() {
                return 0;
            }

            @Override // X.InterfaceC11290cP
            public final List<InterfaceC11350cV> LIZIZ() {
                return LIZIZ;
            }
        });
        this.LIZJ = new C42191l9();
        this.LJ = C78966Uyw.LJJJIL(0);
        this.LJFF = C78966Uyw.LJJJIL(new C35431aF(1.0f, 1.0f));
        this.LJI = C78966Uyw.LJJJIL(Boolean.TRUE);
        this.LJII = new C31881My(new IDqS416S0100000(this, 202));
        this.LJIIIIZZ = true;
        this.LJIIIZ = -1;
        this.LJIIJ = new C25710zf<>(new InterfaceC13120fM[16]);
        this.LJIIL = C78966Uyw.LJJJIL(null);
        this.LJIILIIL = new InterfaceC44941pa() { // from class: X.20V
            @Override // X.InterfaceC07790Sh
            public final /* synthetic */ boolean I(InterfaceC88472Yns interfaceC88472Yns) {
                return C48263Iwt.LIZ(this, interfaceC88472Yns);
            }

            @Override // X.InterfaceC07790Sh
            public final /* synthetic */ InterfaceC07790Sh LLLIIIL(InterfaceC07790Sh interfaceC07790Sh) {
                return C07780Sg.LIZ(this, interfaceC07790Sh);
            }

            @Override // X.InterfaceC44941pa
            public final void LLJILJILJ(AnonymousClass160 remeasurement) {
                o.LJIIIZ(remeasurement, "remeasurement");
                C1QP.this.LJIIL.setValue(remeasurement);
            }

            @Override // X.InterfaceC07790Sh
            public final Object LLLZLZ(Object obj, InterfaceC88471Ynr operation) {
                o.LJIIIZ(operation, "operation");
                return operation.invoke(obj, this);
            }
        };
        this.LJIILJJIL = new C51361zw();
        this.LJIILL = C78966Uyw.LJJJIL(C20U.LJLIL);
        this.LJIILLIIL = C78966Uyw.LJJJIL(null);
        new C48292IxM(this);
        this.LJIJI = new C13140fO();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // X.C0UK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C0SF r7, X.InterfaceC88471Ynr<? super X.C0UY, ? super X.InterfaceC67352kd<? super X.C76800UCe>, ? extends java.lang.Object> r8, X.InterfaceC67352kd<? super X.C76800UCe> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C20W
            if (r0 == 0) goto L57
            r5 = r9
            X.20W r5 = (X.C20W) r5
            int r2 = r5.LJLJJLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L57
            int r2 = r2 - r1
            r5.LJLJJLL = r2
        L12:
            java.lang.Object r4 = r5.LJLJJI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJLL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 == r1) goto L26
            if (r0 != r2) goto L5d
            X.C141335gf.LIZJ(r4)
        L23:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L26:
            X.Ynr r8 = r5.LJLJI
            X.0SF r7 = r5.LJLILLLLZI
            X.1QP r0 = r5.LJLIL
            X.C141335gf.LIZJ(r4)
            goto L45
        L30:
            X.C141335gf.LIZJ(r4)
            X.1zw r0 = r6.LJIILJJIL
            r5.LJLIL = r6
            r5.LJLILLLLZI = r7
            r5.LJLJI = r8
            r5.LJLJJLL = r1
            java.lang.Object r0 = r0.LIZ(r5)
            if (r0 != r3) goto L44
            return r3
        L44:
            r0 = r6
        L45:
            X.1My r1 = r0.LJII
            r0 = 0
            r5.LJLIL = r0
            r5.LJLILLLLZI = r0
            r5.LJLJI = r0
            r5.LJLJJLL = r2
            java.lang.Object r0 = r1.LIZIZ(r7, r8, r5)
            if (r0 != r3) goto L23
            return r3
        L57:
            X.20W r5 = new X.20W
            r5.<init>(r6, r9)
            goto L12
        L5d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1QP.LIZIZ(X.0SF, X.Ynr, X.2kd):java.lang.Object");
    }
}

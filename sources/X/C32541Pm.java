package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.gson.internal.c;
import java.util.List;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1Pm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32541Pm implements C0UK {
    public static final C1HY LJIJ = C79043V0l.LJIIZILJ(AnonymousClass204.LJLIL, AnonymousClass203.LJLIL);
    public final C10250aj LIZ;
    public final ParcelableSnapshotMutableState LIZIZ;
    public final C42191l9 LIZJ;
    public float LIZLLL;
    public final ParcelableSnapshotMutableState LJ;
    public final C31881My LJFF;
    public final boolean LJI;
    public int LJII;
    public InterfaceC13120fM LJIIIIZZ;
    public boolean LJIIIZ;
    public final ParcelableSnapshotMutableState LJIIJ;
    public final AnonymousClass205 LJIIJJI;
    public final C51361zw LJIIL;
    public final ParcelableSnapshotMutableState LJIILIIL;
    public final ParcelableSnapshotMutableState LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public final C13140fO LJIIZILJ;

    public C32541Pm() {
        this(0, 0);
    }

    @Override // X.C0UK
    public final boolean LIZ() {
        return this.LJFF.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int LIZLLL() {
        return ((C10130aX) this.LIZ.LIZ.getValue()).LIZ;
    }

    public final InterfaceC10110aV LJ() {
        return (InterfaceC10110aV) this.LIZIZ.getValue();
    }

    @Override // X.C0UK
    public final float LIZJ(float f) {
        return this.LJFF.LIZJ(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJI(InterfaceC32551Pn itemProvider) {
        o.LJIIIZ(itemProvider, "itemProvider");
        C10250aj c10250aj = this.LIZ;
        c10250aj.getClass();
        C0OA LIZ = C0O8.LIZ();
        try {
            C0OA LJIIIIZZ = LIZ.LJIIIIZZ();
            try {
                c10250aj.LIZ(C78977Uz7.LJJIJLIJ(itemProvider, c10250aj.LIZLLL, ((C10130aX) c10250aj.LIZ.getValue()).LIZ), ((Number) c10250aj.LIZIZ.getValue()).intValue());
            } finally {
                C0OA.LJIILJJIL(LJIIIIZZ);
            }
        } finally {
            LIZ.LIZJ();
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.205] */
    public C32541Pm(int i, int i2) {
        this.LIZ = new C10250aj(i, i2);
        new c(this);
        this.LIZIZ = C78966Uyw.LJJJIL(new InterfaceC10110aV() { // from class: X.1Pd
            public static final C61878OQg LIZIZ = C61878OQg.INSTANCE;

            @Override // X.InterfaceC10110aV
            public final int LIZ() {
                return 0;
            }

            @Override // X.InterfaceC10110aV
            public final List<InterfaceC10230ah> LIZIZ() {
                return LIZIZ;
            }
        });
        this.LIZJ = new C42191l9();
        this.LJ = C78966Uyw.LJJJIL(new C35431aF(1.0f, 1.0f));
        this.LJFF = new C31881My(new IDqS416S0100000(this, 195));
        this.LJI = true;
        this.LJII = -1;
        this.LJIIJ = C78966Uyw.LJJJIL(null);
        this.LJIIJJI = new InterfaceC44941pa() { // from class: X.205
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
                C32541Pm.this.LJIIJ.setValue(remeasurement);
            }

            @Override // X.InterfaceC07790Sh
            public final Object LLLZLZ(Object obj, InterfaceC88471Ynr operation) {
                o.LJIIIZ(operation, "operation");
                return operation.invoke(obj, this);
            }
        };
        this.LJIIL = new C51361zw();
        this.LJIILIIL = C78966Uyw.LJJJIL(null);
        this.LJIILJJIL = C78966Uyw.LJJJIL(new C23360vs(C78555UsJ.LJ(0, 0, 15)));
        this.LJIIZILJ = new C13140fO();
    }

    public static Object LJFF(C32541Pm c32541Pm, int i, InterfaceC67352kd interfaceC67352kd) {
        Object LIZIZ;
        c32541Pm.getClass();
        LIZIZ = c32541Pm.LIZIZ(C0SF.Default, new C54882Dk(c32541Pm, i, 0, null), interfaceC67352kd);
        if (LIZIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZIZ;
        }
        return C76800UCe.LIZ;
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
            boolean r0 = r9 instanceof X.AnonymousClass206
            if (r0 == 0) goto L57
            r5 = r9
            X.206 r5 = (X.AnonymousClass206) r5
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
            X.1Pm r0 = r5.LJLIL
            X.C141335gf.LIZJ(r4)
            goto L45
        L30:
            X.C141335gf.LIZJ(r4)
            X.1zw r0 = r6.LJIIL
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
            X.1My r1 = r0.LJFF
            r0 = 0
            r5.LJLIL = r0
            r5.LJLILLLLZI = r0
            r5.LJLJI = r0
            r5.LJLJJLL = r2
            java.lang.Object r0 = r1.LIZIZ(r7, r8, r5)
            if (r0 != r3) goto L23
            return r3
        L57:
            X.206 r5 = new X.206
            r5.<init>(r6, r9)
            goto L12
        L5d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32541Pm.LIZIZ(X.0SF, X.Ynr, X.2kd):java.lang.Object");
    }
}

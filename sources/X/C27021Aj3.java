package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO;
import kotlin.jvm.internal.o;

/* renamed from: X.Aj3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27021Aj3 {
    public InputItemDTO LIZ;
    public Object LIZIZ;
    public C253009wO LIZJ;
    public final boolean LIZLLL;
    public final EnumC26514Aas LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final Integer LJII;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C27021Aj3(com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO r10, java.lang.Object r11, boolean r12, X.EnumC26514Aas r13, boolean r14, java.lang.Integer r15, int r16) {
        /*
            r9 = this;
            r4 = r12
            r2 = r11
            r5 = r13
            r7 = r14
            r8 = r15
            r1 = r16
            r0 = r1 & 2
            r3 = 0
            if (r0 == 0) goto Ld
            r2 = r3
        Ld:
            r0 = r1 & 8
            if (r0 == 0) goto L12
            r4 = 1
        L12:
            r0 = r1 & 16
            if (r0 == 0) goto L17
            r5 = r3
        L17:
            r0 = r1 & 32
            if (r0 == 0) goto L2c
            r6 = 1
        L1c:
            r0 = r1 & 64
            if (r0 == 0) goto L21
            r7 = 0
        L21:
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L26
            r8 = r3
        L26:
            r0 = r9
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L2c:
            r6 = 0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27021Aj3.<init>(com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO, java.lang.Object, boolean, X.Aas, boolean, java.lang.Integer, int):void");
    }

    public static C27021Aj3 LIZ(C27021Aj3 c27021Aj3, Object obj, C253009wO c253009wO, boolean z, boolean z2, Integer num, int i) {
        InputItemDTO inputItemDTO;
        boolean z3;
        Integer num2 = num;
        boolean z4 = z2;
        boolean z5 = z;
        Object obj2 = obj;
        C253009wO c253009wO2 = c253009wO;
        if ((i & 1) != 0) {
            inputItemDTO = c27021Aj3.LIZ;
        } else {
            inputItemDTO = null;
        }
        if ((i & 2) != 0) {
            obj2 = c27021Aj3.LIZIZ;
        }
        if ((i & 4) != 0) {
            c253009wO2 = c27021Aj3.LIZJ;
        }
        if ((i & 8) != 0) {
            z3 = c27021Aj3.LIZLLL;
        } else {
            z3 = false;
        }
        if ((i & 16) != 0) {
            z5 = c27021Aj3.LJFF;
        }
        if ((i & 32) != 0) {
            z4 = c27021Aj3.LJI;
        }
        if ((i & 64) != 0) {
            num2 = c27021Aj3.LJII;
        }
        c27021Aj3.getClass();
        o.LJIIIZ(inputItemDTO, "inputItemDTO");
        return new C27021Aj3(inputItemDTO, obj2, c253009wO2, z3, c27021Aj3.LJ, z5, z4, num2);
    }

    public C27021Aj3(InputItemDTO inputItemDTO, Object obj, C253009wO c253009wO, boolean z, EnumC26514Aas enumC26514Aas, boolean z2, boolean z3, Integer num) {
        this.LIZ = inputItemDTO;
        this.LIZIZ = obj;
        this.LIZJ = c253009wO;
        this.LIZLLL = z;
        this.LJ = enumC26514Aas;
        this.LJFF = z2;
        this.LJI = z3;
        this.LJII = num;
    }
}

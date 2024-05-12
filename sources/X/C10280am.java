package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.0am, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10280am {
    public final int LIZ;
    public final List<AbstractC39201gK> LIZIZ;
    public final boolean LIZJ;
    public final InterfaceC07740Sc LIZLLL;
    public final InterfaceC07750Sd LJ;
    public final EnumC23500w6 LJFF;
    public final boolean LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final C10240ai LJIIIZ;
    public final int LJIIJ;
    public final long LJIIJJI;
    public final Object LJIIL;
    public final int LJIILIIL;
    public final int LJIILJJIL;
    public final int LJIILL;

    public C10280am() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a9, code lost:
    
        r13 = r24.LIZ;
        r14 = r24.LJIIL;
        r15 = r24.LJIILIIL;
        r5 = r24.LJIILJJIL;
        r1 = r24.LJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b5, code lost:
    
        if (r1 != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b7, code lost:
    
        r0 = r24.LJII;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b9, code lost:
    
        r4 = -r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ba, code lost:
    
        if (r1 != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bc, code lost:
    
        r0 = r24.LJIIIIZZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d5, code lost:
    
        return new X.C32491Ph(r25, r13, r14, r15, r5, r4, r18 + r0, r24.LIZJ, r6, r24.LJIIIZ, r24.LJIIJJI);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d6, code lost:
    
        r0 = r24.LJII;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d9, code lost:
    
        r0 = r24.LJIIIIZZ;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C32491Ph LIZ(int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10280am.LIZ(int, int, int):X.1Ph");
    }

    public C10280am(int i, List list, boolean z, InterfaceC07740Sc interfaceC07740Sc, InterfaceC07750Sd interfaceC07750Sd, EnumC23500w6 enumC23500w6, boolean z2, int i2, int i3, C10240ai c10240ai, int i4, long j, Object obj) {
        int i5;
        int i6;
        this.LIZ = i;
        this.LIZIZ = list;
        this.LIZJ = z;
        this.LIZLLL = interfaceC07740Sc;
        this.LJ = interfaceC07750Sd;
        this.LJFF = enumC23500w6;
        this.LJI = z2;
        this.LJII = i2;
        this.LJIIIIZZ = i3;
        this.LJIIIZ = c10240ai;
        this.LJIIJ = i4;
        this.LJIIJJI = j;
        this.LJIIL = obj;
        int size = list.size();
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            AbstractC39201gK abstractC39201gK = (AbstractC39201gK) ListProtector.get(list, i9);
            boolean z3 = this.LIZJ;
            if (z3) {
                i5 = abstractC39201gK.LJLILLLLZI;
            } else {
                i5 = abstractC39201gK.LJLIL;
            }
            i7 += i5;
            if (!z3) {
                i6 = abstractC39201gK.LJLILLLLZI;
            } else {
                i6 = abstractC39201gK.LJLIL;
            }
            i8 = Math.max(i8, i6);
        }
        this.LJIILIIL = i7;
        int i10 = i7 + this.LJIIJ;
        this.LJIILJJIL = i10 >= 0 ? i10 : 0;
        this.LJIILL = i8;
    }
}

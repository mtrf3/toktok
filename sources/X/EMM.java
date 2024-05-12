package X;

import java.util.List;
import kotlin.jvm.internal.AqS153S0200000_6;
import kotlin.jvm.internal.AqS156S0100000_6;

/* loaded from: classes7.dex */
public final class EMM extends EMJ {
    public static C9U5 LJI;
    public final boolean LIZJ;
    public final C37065Egf LIZLLL;
    public final C37327Ekt LJ;
    public final EMO LJFF;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EMM(X.EnumC58085Mqv r6) {
        /*
            r5 = this;
            X.XIA r4 = X.C78613UtF.LIZJ
            X.Egf r3 = new X.Egf
            X.EMQ r0 = X.EMQ.THIRD_PART_NAME
            r3.<init>(r6, r0)
            X.Ekt r2 = new X.Ekt
            X.Ekv r0 = new X.Ekv
            r0.<init>(r6)
            r2.<init>(r3, r0)
            X.EMO r1 = new X.EMO
            r1.<init>(r3)
            java.lang.String r0 = "authApiScene"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.lang.String r0 = "ioDispatcher"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            r5.<init>(r3, r4)
            r0 = 1
            r5.LIZJ = r0
            r5.LIZLLL = r3
            r5.LJ = r2
            r5.LJFF = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EMM.<init>(X.Mqv):void");
    }

    @Override // X.EMJ
    public final Object LIZJ(InterfaceC67352kd<? super C9U5> interfaceC67352kd) {
        C9U5 c9u5 = LJI;
        if (this.LIZJ && c9u5 != null) {
            return c9u5;
        }
        List LJIIJJI = this.LIZLLL.LJIIJJI(new AqS156S0100000_6(this, 109));
        return this.LIZLLL.LJI(new AqS153S0200000_6(LJIIJJI, (List<C35497DwT>) this.LIZLLL.LJII(new AqS153S0200000_6(this, (EMM) LJIIJJI, (List<C35497DwT>) 20)), (java.util.Map<String, EMX>) 19));
    }
}

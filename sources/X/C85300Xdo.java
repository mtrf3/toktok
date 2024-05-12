package X;

/* renamed from: X.Xdo, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85300Xdo extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C85258Xd8 LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ ActivityC45651qj LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85300Xdo(C85258Xd8 c85258Xd8, boolean z, long j, ActivityC45651qj activityC45651qj) {
        super(0);
        this.LJLIL = c85258Xd8;
        this.LJLILLLLZI = z;
        this.LJLJI = j;
        this.LJLJJI = activityC45651qj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r6 == null) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C76800UCe invoke() {
        /*
            r11 = this;
            X.Xd8 r0 = r11.LJLIL
            r9 = 0
            if (r0 == 0) goto L72
            java.lang.String r10 = r0.LIZJ
            java.lang.String r9 = r0.LIZ
            java.lang.String r6 = r0.LIZIZ
            if (r6 != 0) goto Lf
        Ld:
            java.lang.String r6 = ""
        Lf:
            boolean r5 = r11.LJLILLLLZI
            long r7 = java.lang.System.currentTimeMillis()
            long r0 = r11.LJLJI
            long r7 = r7 - r0
            X.Xd8 r0 = r11.LJLIL
            if (r0 == 0) goto L70
            boolean r4 = r0.LJ
        L1e:
            kotlin.jvm.internal.AqS176S0100000_10 r3 = new kotlin.jvm.internal.AqS176S0100000_10
            X.1qj r1 = r11.LJLJJI
            r0 = 123(0x7b, float:1.72E-43)
            r3.<init>(r1, r0)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            if (r10 == 0) goto L33
            java.lang.String r0 = "previous_page"
            r2.put(r0, r10)
        L33:
            if (r9 == 0) goto L3a
            java.lang.String r0 = "enter_from"
            r2.put(r0, r9)
        L3a:
            java.lang.String r1 = "enter_method"
            java.lang.String r0 = "is_allow"
            X.C132805Jc.LJFF(r2, r1, r6, r5, r0)
            java.lang.String r1 = "show_duration"
            java.lang.String r0 = java.lang.String.valueOf(r7)
            r2.put(r1, r0)
            int r0 = X.C35908E7k.LIZJ()
            int r0 = r0 + (-1)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "show_index"
            r2.put(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "is_black_layer"
            r2.put(r0, r1)
            r3.invoke(r2)
            java.lang.String r0 = "system_location_permission_result"
            X.FMX.LJIIL(r0, r2)
            X.C85299Xdn.LIZIZ()
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L70:
            r4 = 0
            goto L1e
        L72:
            r10 = r9
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85300Xdo.invoke():java.lang.Object");
    }
}

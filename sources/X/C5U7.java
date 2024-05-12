package X;

import android.content.Context;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.ies.cutsame.source.helper.ResizeMediaHelper$startResize$1", f = "ResizeMediaHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5U7, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5U7 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C5U6 LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns<Float, C76800UCe> LJLJJL;
    public final /* synthetic */ InterfaceC88471Ynr<Boolean, String, C76800UCe> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5U7(C5U6 c5u6, Context context, String str, String str2, InterfaceC88472Yns<? super Float, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super Boolean, ? super String, C76800UCe> interfaceC88471Ynr, InterfaceC67352kd<? super C5U7> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c5u6;
        this.LJLILLLLZI = context;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = interfaceC88472Yns;
        this.LJLJJLL = interfaceC88471Ynr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C5U7(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b6, code lost:
    
        r14.LJLJJLL.invoke(java.lang.Boolean.TRUE, r14.LJLJI);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009f, code lost:
    
        if (r3 >= 8847360) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b2, code lost:
    
        if (r1 > 40) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (X.C79043V0l.LJIIL(r2, r6) > 3686400) goto L6;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            X.C141335gf.LIZJ(r15)
            X.5U6 r0 = r14.LJLIL
            android.content.Context r2 = r14.LJLILLLLZI
            java.lang.String r6 = r14.LJLJI
            r0.getClass()
            com.bytedance.ies.cutsame.util.MediaUtil r1 = com.bytedance.ies.cutsame.util.MediaUtil.LIZ
            r1.getClass()
            boolean r0 = com.bytedance.ies.cutsame.util.MediaUtil.LIZIZ(r2, r6)
            r5 = 1
            r4 = 3686400(0x384000, float:5.165747E-39)
            if (r0 == 0) goto L84
            int r0 = X.C79043V0l.LJIIL(r2, r6)
            if (r0 <= r4) goto Lb6
        L21:
            X.5U6 r4 = r14.LJLIL
            android.content.Context r7 = r14.LJLILLLLZI
            java.lang.String r9 = r14.LJLJI
            java.lang.String r1 = r14.LJLJJI
            X.Yns<java.lang.Float, X.UCe> r3 = r14.LJLJJL
            X.Ynr<java.lang.Boolean, java.lang.String, X.UCe> r2 = r14.LJLJJLL
            r4.getClass()
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L3e
            X.C1I0.LIZJ(r1)
        L3e:
            java.io.File r6 = new java.io.File
            r6.<init>(r9)
            java.lang.String r0 = "origin_"
            java.lang.StringBuilder r5 = defpackage.b1.LIZJ(r1, r0)
            long r0 = java.lang.System.currentTimeMillis()
            r5.append(r0)
            r0 = 95
            r5.append(r0)
            java.lang.String r0 = r6.getName()
            r5.append(r0)
            java.lang.String r10 = X.X1D.LIZIZ(r5)
            boolean r0 = r4.LIZ
            if (r0 == 0) goto L67
        L64:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L67:
            boolean r0 = X.C1B6.LIZIZ(r10)
            if (r0 == 0) goto L73
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.invoke(r0, r10)
            goto L64
        L73:
            r5 = 1920(0x780, float:2.69E-42)
            java.lang.String r11 = X.C152285yK.LIZ
            r12 = 0
            X.5U5 r8 = new X.5U5
            r8.<init>()
            r6 = r5
            r13 = r12
            X.C145765no.LIZIZ(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L64
        L84:
            int r3 = X.C79043V0l.LJJIIZ(r2, r6)
            X.5nk r2 = r1.LIZ(r2, r6)
            java.lang.String r1 = "h265"
            java.lang.String r0 = r2.LJLL
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L97
            goto L21
        L97:
            int r1 = r2.LJLJL
            r0 = 60
            if (r1 < r0) goto La2
            r0 = 8847360(0x870000, float:1.2397792E-38)
            if (r3 < r0) goto La2
            goto L21
        La2:
            if (r3 <= r4) goto La6
            goto L21
        La6:
            java.lang.String r0 = "avi"
            boolean r0 = ujb.o.LJJJJ(r6, r0, r5)
            if (r0 == 0) goto Lb0
            goto L21
        Lb0:
            r0 = 40
            if (r1 <= r0) goto Lb6
            goto L21
        Lb6:
            X.Ynr<java.lang.Boolean, java.lang.String, X.UCe> r2 = r14.LJLJJLL
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.String r0 = r14.LJLJI
            r2.invoke(r1, r0)
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5U7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

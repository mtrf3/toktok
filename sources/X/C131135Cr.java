package X;

import android.graphics.Bitmap;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.ugc.android.editor.track.control.VideoCoverHelper$loadVideoCover$1", f = "VideoCoverHelper.kt", l = {39, 41}, m = "invokeSuspend")
/* renamed from: X.5Cr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131135Cr extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ C55O LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns<Bitmap, C76800UCe> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C131135Cr(String str, C55O c55o, InterfaceC88472Yns<? super Bitmap, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super C131135Cr> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = str;
        this.LJLJJI = c55o;
        this.LJLJJL = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C131135Cr c131135Cr = new C131135Cr(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c131135Cr.LJLILLLLZI = obj;
        return c131135Cr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLIL
            r5 = 2
            r1 = 1
            r4 = 0
            if (r0 == 0) goto L48
            if (r0 == r1) goto L40
            if (r0 != r5) goto L82
            java.lang.Object r3 = r7.LJLILLLLZI
            X.2pa r3 = (X.InterfaceC70422pa) r3
            X.C141335gf.LIZJ(r8)
        L14:
            boolean r0 = X.C48841JEv.LJIILLIIL(r3)
            if (r0 == 0) goto L3d
            if (r8 == 0) goto L25
            X.Yns<android.graphics.Bitmap, X.UCe> r0 = r7.LJLJJL
            r0.invoke(r8)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L3d
        L25:
            X.55O r4 = r7.LJLJJI
            java.lang.String r3 = r7.LJLJI
            X.Yns<android.graphics.Bitmap, X.UCe> r1 = r7.LJLJJL
            boolean r0 = r4.LIZJ
            if (r0 == 0) goto L3d
            r0 = 0
            r4.LIZJ = r0
            kotlin.jvm.internal.AqS57S1200000_2 r2 = new kotlin.jvm.internal.AqS57S1200000_2
            r0 = 3
            r2.<init>(r4, r3, r1, r0)
            r0 = 300(0x12c, double:1.48E-321)
            X.C2ND.LIZ(r2, r0)
        L3d:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L40:
            java.lang.Object r3 = r7.LJLILLLLZI
            X.2pa r3 = (X.InterfaceC70422pa) r3
            X.C141335gf.LIZJ(r8)
            goto L14
        L48:
            X.C141335gf.LIZJ(r8)
            java.lang.Object r3 = r7.LJLILLLLZI
            X.2pa r3 = (X.InterfaceC70422pa) r3
            java.lang.String r0 = r7.LJLJI
            boolean r0 = ujb.o.LJJJJJL(r0)
            if (r0 == 0) goto L6e
            X.55O r2 = r7.LJLJJI
            r7.LJLILLLLZI = r3
            r7.LJLIL = r1
            r2.getClass()
            X.XIC r1 = X.C78613UtF.LIZ
            X.5Cs r0 = new X.5Cs
            r0.<init>(r2, r4)
            java.lang.Object r8 = X.XKX.LJI(r1, r0, r7)
            if (r8 != r6) goto L14
            return r6
        L6e:
            X.XIC r2 = X.C78613UtF.LIZ
            X.5Cq r1 = new X.5Cq
            java.lang.String r0 = r7.LJLJI
            r1.<init>(r0, r4)
            r7.LJLILLLLZI = r3
            r7.LJLIL = r5
            java.lang.Object r8 = X.XKX.LJI(r2, r1, r7)
            if (r8 != r6) goto L14
            return r6
        L82:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131135Cr.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

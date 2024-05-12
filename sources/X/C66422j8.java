package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.prop.mobileefffect.MobileEffectUtilKt$cropIconAndRename$2", f = "MobileEffectUtil.kt", l = {455, 456}, m = "invokeSuspend")
/* renamed from: X.2j8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66422j8 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super String>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66422j8(String str, InterfaceC67352kd<? super C66422j8> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C66422j8(this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004d A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLIL
            r2 = 0
            java.lang.String r6 = "_crop"
            r1 = 1
            r3 = 0
            r4 = 2
            if (r0 == 0) goto L4e
            if (r0 == r1) goto L67
            if (r0 != r4) goto L7d
            X.C141335gf.LIZJ(r8)
        L13:
            java.lang.String r4 = r7.LJLILLLLZI
            r1 = 46
            r0 = 6
            int r5 = ujb.s.LJJLIIIJLLLLLLLZ(r4, r1, r2, r0)
            java.lang.StringBuilder r4 = X.X1D.LIZ()
            java.lang.String r0 = r7.LJLILLLLZI
            java.lang.String r0 = r0.substring(r2, r5)
            java.lang.String r2 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r2)
            r4.append(r0)
            r4.append(r6)
            java.lang.String r1 = r7.LJLILLLLZI
            int r0 = r1.length()
            java.lang.String r0 = r1.substring(r5, r0)
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r2)
            r4.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r4)
            java.lang.String r0 = r7.LJLILLLLZI
            boolean r0 = X.C39579Fg7.LJJ(r0, r1)
            if (r0 != 0) goto L7c
            return r3
        L4e:
            X.C141335gf.LIZJ(r8)
            java.lang.String r0 = r7.LJLILLLLZI
            boolean r0 = ujb.s.LJJJLZIJ(r0, r6, r2)
            if (r0 == 0) goto L5c
            java.lang.String r0 = r7.LJLILLLLZI
            return r0
        L5c:
            java.lang.String r0 = r7.LJLILLLLZI
            r7.LJLIL = r1
            java.lang.Object r8 = X.C66432j9.LIZ(r0, r7)
            if (r8 != r5) goto L6a
            return r5
        L67:
            X.C141335gf.LIZJ(r8)
        L6a:
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            if (r8 != 0) goto L6f
            return r3
        L6f:
            java.lang.String r1 = r7.LJLILLLLZI
            r7.LJLIL = r4
            r0 = 252(0xfc, float:3.53E-43)
            java.lang.Object r0 = X.C66432j9.LIZIZ(r8, r1, r3, r7, r0)
            if (r0 != r5) goto L13
            return r5
        L7c:
            return r1
        L7d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66422j8.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super String> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

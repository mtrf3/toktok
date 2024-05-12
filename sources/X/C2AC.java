package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.LiveEffectTestHelper$updateMakeUp$1", f = "LiveEffectTestHelper.kt", l = {56, BaseNotice.CREATOR}, m = "invokeSuspend")
/* renamed from: X.2AC, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2AC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2AC(int i, String str, String str2, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2AC(this.LJLJJI, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r14.LJLIL
            r5 = 2
            r2 = 1
            java.lang.String r1 = "SMALL_ITEM_BEAUTY_PANEL"
            if (r0 == 0) goto L21
            if (r0 == r2) goto L45
            if (r0 != r5) goto L6e
            X.C141335gf.LIZJ(r15)
        L11:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r0 = r15.booleanValue()
            if (r0 != 0) goto L1e
            java.lang.String r0 = "update makeup fail"
            X.C30868C9o.LJI(r0)
        L1e:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L21:
            X.C141335gf.LIZJ(r15)
            X.1KC r7 = X.C1KC.LIZ
            java.lang.String r0 = r14.LJLILLLLZI
            java.lang.String r9 = X.C0TY.LIZLLL
            kotlin.jvm.internal.o.LJIIIIZZ(r9, r1)
            boolean r0 = r7.LIZIZ(r0, r9)
            if (r0 != 0) goto L55
            java.lang.String r8 = r14.LJLILLLLZI
            java.lang.String r10 = r14.LJLJI
            r11 = 0
            r15 = 120(0x78, float:1.68E-43)
            r14.LJLIL = r2
            r12 = r11
            r13 = r11
            java.lang.Object r15 = X.C0WK.LIZ(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r15 != r6) goto L48
            return r6
        L45:
            X.C141335gf.LIZJ(r15)
        L48:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r0 = r15.booleanValue()
            if (r0 != 0) goto L55
            java.lang.String r0 = "set makeup fail"
            X.C30868C9o.LJI(r0)
        L55:
            X.1KC r4 = X.C1KC.LIZ
            java.lang.String r3 = r14.LJLILLLLZI
            java.lang.String r2 = X.C0TY.LIZLLL
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r1)
            java.lang.String r1 = r14.LJLJI
            int r0 = r14.LJLJJI
            r14.LJLIL = r5
            r4.getClass()
            java.lang.Object r15 = X.C1KC.LJIIJJI(r0, r3, r2, r1, r14)
            if (r15 != r6) goto L11
            return r6
        L6e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2AC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

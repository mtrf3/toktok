package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.LiveEffectController$setEffect$2", f = "LiveEffectController.kt", l = {56, 59, 68, 69}, m = "invokeSuspend")
/* renamed from: X.2Bb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54272Bb extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public LiveEffect LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ InterfaceC65784Pro<Boolean> LJLJJLL;
    public final /* synthetic */ InterfaceC88472Yns<LiveEffect, C76800UCe> LJLJL;
    public final /* synthetic */ boolean LJLJLJ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54272Bb(String str, String str2, String str3, InterfaceC67352kd interfaceC67352kd, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, InterfaceC88472Yns interfaceC88472Yns, boolean z) {
        super(2, interfaceC67352kd);
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
        this.LJLJJLL = interfaceC65784Pro;
        this.LJLJL = interfaceC88472Yns;
        this.LJLJLJ = z;
        this.LJLJLLL = interfaceC65784Pro2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C54272Bb(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd, this.LJLJJLL, this.LJLJLLL, this.LJLJL, this.LJLJLJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00af  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            X.NAu r0 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r13.LJLILLLLZI
            r2 = 4
            r8 = 3
            r3 = 2
            r7 = 1
            if (r1 == 0) goto L20
            if (r1 == r7) goto L34
            if (r1 == r3) goto L6d
            if (r1 == r8) goto L82
            if (r1 != r2) goto Lb2
            X.C141335gf.LIZJ(r14)
        L15:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r0 = r14.booleanValue()
        L1b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L20:
            X.C141335gf.LIZJ(r14)
            X.1KC r6 = X.C1KC.LIZ
            java.lang.String r5 = r13.LJLJI
            java.lang.String r4 = r13.LJLJJI
            java.lang.String r1 = r13.LJLJJL
            r13.LJLILLLLZI = r7
            java.lang.Object r14 = r6.LJII(r5, r4, r1, r13)
            if (r14 != r0) goto L37
            return r0
        L34:
            X.C141335gf.LIZJ(r14)
        L37:
            r7 = r14
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r7 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r7
            if (r7 == 0) goto L42
            com.ss.android.ugc.effectmanager.effect.model.Effect r5 = r7.getEffect()
            if (r5 != 0) goto L45
        L42:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L45:
            X.0Re r4 = X.C1KC.LIZIZ
            com.ss.android.ugc.effectmanager.EffectManager r1 = r4.LIZ
            boolean r1 = r1.isEffectDownloaded(r5)
            if (r1 == 0) goto L77
        L50:
            X.UtN r1 = X.C36636EZk.LIZ
            X.2BZ r4 = new X.2BZ
            X.Pro<java.lang.Boolean> r5 = r13.LJLJJLL
            X.Yns<com.bytedance.android.livesdkapi.depend.model.LiveEffect, X.UCe> r6 = r13.LJLJL
            java.lang.String r8 = r13.LJLJJI
            java.lang.String r9 = r13.LJLJJL
            boolean r10 = r13.LJLJLJ
            X.Pro<X.UCe> r11 = r13.LJLJLLL
            r12 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r13.LJLILLLLZI = r3
            java.lang.Object r14 = X.XKX.LJI(r1, r4, r13)
            if (r14 != r0) goto L70
            return r0
        L6d:
            X.C141335gf.LIZJ(r14)
        L70:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r0 = r14.booleanValue()
            goto L1b
        L77:
            r13.LJLIL = r7
            r13.LJLILLLLZI = r8
            java.lang.Object r14 = r4.LIZ(r5, r13)
            if (r14 != r0) goto L87
            return r0
        L82:
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r7 = r13.LJLIL
            X.C141335gf.LIZJ(r14)
        L87:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r1 = r14.booleanValue()
            if (r1 == 0) goto Laf
        L90:
            X.UtN r1 = X.C36636EZk.LIZ
            X.2Ba r4 = new X.2Ba
            X.Pro<java.lang.Boolean> r5 = r13.LJLJJLL
            X.Yns<com.bytedance.android.livesdkapi.depend.model.LiveEffect, X.UCe> r6 = r13.LJLJL
            java.lang.String r8 = r13.LJLJJI
            java.lang.String r9 = r13.LJLJJL
            boolean r10 = r13.LJLJLJ
            X.Pro<X.UCe> r11 = r13.LJLJLLL
            r12 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r13.LJLIL = r12
            r13.LJLILLLLZI = r2
            java.lang.Object r14 = X.XKX.LJI(r1, r4, r13)
            if (r14 != r0) goto L15
            return r0
        Laf:
            r0 = 0
            goto L1b
        Lb2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54272Bb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.LiveEffectController$updateEffectValue$2", f = "LiveEffectController.kt", l = {185, 187, 191, 196, 197}, m = "invokeSuspend")
/* renamed from: X.2Bg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54322Bg extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public LiveEffect LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54322Bg(int i, String str, String str2, String str3, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
        this.LJLJJLL = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C54322Bg(this.LJLJJLL, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a9  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r11.LJLILLLLZI
            r10 = 0
            r7 = 5
            r9 = 4
            r8 = 3
            r4 = 2
            r5 = 0
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 == r3) goto L3f
            if (r0 == r4) goto L56
            if (r0 == r8) goto L86
            if (r0 == r9) goto L9b
            if (r0 != r7) goto Lbf
            X.C141335gf.LIZJ(r12)
        L1a:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r10 = r12.booleanValue()
        L20:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            return r0
        L25:
            X.C141335gf.LIZJ(r12)
            java.lang.String r0 = r11.LJLJI
            int r0 = r0.length()
            if (r0 != 0) goto L45
            X.1KC r2 = X.C1KC.LIZ
            java.lang.String r1 = r11.LJLJJI
            java.lang.String r0 = r11.LJLJJL
            r11.LJLILLLLZI = r3
            java.lang.Object r12 = r2.LJI(r1, r0, r11)
            if (r12 != r6) goto L42
            return r6
        L3f:
            X.C141335gf.LIZJ(r12)
        L42:
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r12 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r12
            goto L5b
        L45:
            X.1KC r3 = X.C1KC.LIZ
            java.lang.String r2 = r11.LJLJJI
            java.lang.String r1 = r11.LJLJJL
            java.lang.String r0 = r11.LJLJI
            r11.LJLILLLLZI = r4
            java.lang.Object r12 = r3.LJII(r2, r1, r0, r11)
            if (r12 != r6) goto L59
            return r6
        L56:
            X.C141335gf.LIZJ(r12)
        L59:
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r12 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r12
        L5b:
            r4 = r12
            if (r12 == 0) goto L64
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r12.getEffect()
            if (r2 != 0) goto L67
        L64:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L67:
            X.0Re r1 = X.C1KC.LIZIZ
            com.ss.android.ugc.effectmanager.EffectManager r0 = r1.LIZ
            boolean r0 = r0.isEffectDownloaded(r2)
            if (r0 == 0) goto L90
        L72:
            X.UtN r3 = X.C36636EZk.LIZ
            X.2Be r2 = new X.2Be
            java.lang.String r1 = r11.LJLJJL
            int r0 = r11.LJLJJLL
            r2.<init>(r4, r1, r0, r5)
            r11.LJLILLLLZI = r8
            java.lang.Object r12 = X.XKX.LJI(r3, r2, r11)
            if (r12 != r6) goto L89
            return r6
        L86:
            X.C141335gf.LIZJ(r12)
        L89:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r10 = r12.booleanValue()
            goto L20
        L90:
            r11.LJLIL = r4
            r11.LJLILLLLZI = r9
            java.lang.Object r12 = r1.LIZ(r2, r11)
            if (r12 != r6) goto La0
            return r6
        L9b:
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r4 = r11.LJLIL
            X.C141335gf.LIZJ(r12)
        La0:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r0 = r12.booleanValue()
            if (r0 == 0) goto L20
        La9:
            X.UtN r3 = X.C36636EZk.LIZ
            X.2Bf r2 = new X.2Bf
            java.lang.String r1 = r11.LJLJJL
            int r0 = r11.LJLJJLL
            r2.<init>(r4, r1, r0, r5)
            r11.LJLIL = r5
            r11.LJLILLLLZI = r7
            java.lang.Object r12 = X.XKX.LJI(r3, r2, r11)
            if (r12 != r6) goto L1a
            return r6
        Lbf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54322Bg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

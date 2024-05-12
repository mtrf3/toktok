package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel$sendAction$1", f = "KaraokeViewModel.kt", l = {502, 504, 507}, m = "invokeSuspend")
/* renamed from: X.2AY, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2AY extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ AbstractC07650Rt LJLILLLLZI;
    public final /* synthetic */ KaraokeViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2AY(KaraokeViewModel karaokeViewModel, AbstractC07650Rt abstractC07650Rt, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = abstractC07650Rt;
        this.LJLJI = karaokeViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2AY(this.LJLJI, this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLIL
            r3 = 3
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L15
            if (r0 == r2) goto L2e
            if (r0 == r5) goto Lf
            if (r0 != r3) goto L62
        Lf:
            X.C141335gf.LIZJ(r7)
        L12:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L15:
            X.C141335gf.LIZJ(r7)
            X.0Rt r1 = r6.LJLILLLLZI
            boolean r0 = r1 instanceof X.C31271Kp
            if (r0 == 0) goto L29
        L1e:
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r0 = r6.LJLJI
            r6.LJLIL = r2
            java.lang.Object r7 = r0.Av0(r1, r6)
            if (r7 != r4) goto L31
            return r4
        L29:
            boolean r0 = r1 instanceof X.C1KZ
            if (r0 == 0) goto L57
            goto L1e
        L2e:
            X.C141335gf.LIZJ(r7)
        L31:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r0 = r7.booleanValue()
            if (r0 != 0) goto L12
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r3 = r6.LJLJI
            X.1L9 r2 = new X.1L9
            r0 = 2131835137(0x7f113901, float:1.9303404E38)
            java.lang.String r1 = X.C15380j0.LJIILJJIL(r0)
            java.lang.String r0 = "getString(R.string.pm_LIVEKaraoke_tooFastToast)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r0 = "pm_mt_LIVEKaraoke_tooFastToast"
            r2.<init>(r1, r0)
            r6.LJLIL = r5
            java.lang.Object r0 = r3.iv0(r2, r6)
            if (r0 != r4) goto L12
            return r4
        L57:
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r0 = r6.LJLJI
            r6.LJLIL = r3
            java.lang.Object r0 = r0.zv0(r1, r6)
            if (r0 != r4) goto L12
            return r4
        L62:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2AY.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

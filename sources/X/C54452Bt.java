package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel$fetchTabList$2", f = "KaraokeViewModel.kt", l = {645, 647, 650}, m = "invokeSuspend")
/* renamed from: X.2Bt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54452Bt extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ KaraokeViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54452Bt(KaraokeViewModel karaokeViewModel, InterfaceC67352kd<? super C54452Bt> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = karaokeViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C54452Bt(this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLIL
            r5 = 3
            r4 = 2
            r1 = 1
            if (r0 == 0) goto L15
            if (r0 == r1) goto L33
            if (r0 == r4) goto Lf
            if (r0 != r5) goto L5e
        Lf:
            X.C141335gf.LIZJ(r7)
        L12:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L15:
            X.C141335gf.LIZJ(r7)
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r0 = r6.LJLILLLLZI
            X.0EV r0 = r0.LJLIL
            java.util.List<X.015> r2 = r0.LJFF
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L4e
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r0 = r6.LJLILLLLZI
            X.0EV r0 = r0.LJLIL
            r6.LJLIL = r1
            java.lang.Object r7 = r0.LJII(r6)
            if (r7 != r3) goto L36
            return r3
        L33:
            X.C141335gf.LIZJ(r7)
        L36:
            java.util.List r7 = (java.util.List) r7
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L12
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r1 = r6.LJLILLLLZI
            X.1LV r0 = new X.1LV
            r0.<init>(r7)
            r6.LJLIL = r4
            java.lang.Object r0 = r1.iv0(r0, r6)
            if (r0 != r3) goto L12
            return r3
        L4e:
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r1 = r6.LJLILLLLZI
            X.1LV r0 = new X.1LV
            r0.<init>(r2)
            r6.LJLIL = r5
            java.lang.Object r0 = r1.iv0(r0, r6)
            if (r0 != r3) goto L12
            return r3
        L5e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54452Bt.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

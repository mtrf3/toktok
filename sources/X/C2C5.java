package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel$prepareAudienceSongList$2", f = "KaraokeViewModel.kt", l = {627, 628, 630, 632, 635}, m = "invokeSuspend")
/* renamed from: X.2C5, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2C5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ KaraokeViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2C5(KaraokeViewModel karaokeViewModel, InterfaceC67352kd<? super C2C5> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = karaokeViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2C5(this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048 A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLIL
            r7 = 5
            r4 = 4
            r3 = 3
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L1b
            if (r0 == r5) goto L39
            if (r0 == r6) goto L49
            if (r0 == r3) goto L15
            if (r0 == r4) goto L15
            if (r0 != r7) goto L7b
        L15:
            X.C141335gf.LIZJ(r9)
        L18:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L1b:
            X.C141335gf.LIZJ(r9)
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r0 = r8.LJLILLLLZI
            X.0EV r0 = r0.LJLIL
            java.util.List<X.015> r0 = r0.LJFF
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L6e
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r1 = r8.LJLILLLLZI
            X.1LW r0 = X.C1LW.LIZ
            r8.LJLIL = r5
            java.lang.Object r0 = r1.iv0(r0, r8)
            if (r0 != r2) goto L3c
            return r2
        L39:
            X.C141335gf.LIZJ(r9)
        L3c:
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r0 = r8.LJLILLLLZI
            X.0EV r0 = r0.LJLIL
            r8.LJLIL = r6
            java.lang.Object r9 = r0.LJII(r8)
            if (r9 != r2) goto L4c
            return r2
        L49:
            X.C141335gf.LIZJ(r9)
        L4c:
            java.util.List r9 = (java.util.List) r9
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L61
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r1 = r8.LJLILLLLZI
            X.1LU r0 = X.C1LU.LIZ
            r8.LJLIL = r3
            java.lang.Object r0 = r1.iv0(r0, r8)
            if (r0 != r2) goto L18
            return r2
        L61:
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r1 = r8.LJLILLLLZI
            X.1LX r0 = X.C1LX.LIZ
            r8.LJLIL = r4
            java.lang.Object r0 = r1.iv0(r0, r8)
            if (r0 != r2) goto L18
            return r2
        L6e:
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r1 = r8.LJLILLLLZI
            X.1LX r0 = X.C1LX.LIZ
            r8.LJLIL = r7
            java.lang.Object r0 = r1.iv0(r0, r8)
            if (r0 != r2) goto L18
            return r2
        L7b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2C5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

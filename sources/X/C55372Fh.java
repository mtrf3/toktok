package X;

import com.bytedance.android.livesdk.model.message.KaraokeSwitchMessage;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.KaraokeMessageHelper$processSwitchMessage$1", f = "KaraokeMessageHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2Fh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55372Fh extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ KaraokeSwitchMessage LJLIL;
    public final /* synthetic */ C1Z1 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55372Fh(KaraokeSwitchMessage karaokeSwitchMessage, C1Z1 c1z1, InterfaceC67352kd<? super C55372Fh> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = karaokeSwitchMessage;
        this.LJLILLLLZI = c1z1;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55372Fh(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if (r1 != null) goto L8;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            X.C141335gf.LIZJ(r4)
            com.bytedance.android.livesdk.model.message.KaraokeSwitchMessage r1 = r3.LJLIL
            int r0 = r1.type
            r2 = 1
            if (r0 != 0) goto L23
            int r0 = r1.status
            if (r0 != 0) goto L1e
            X.1Kq r1 = X.C31281Kq.LIZ
        L10:
            if (r1 == 0) goto L1b
        L12:
            X.1Z1 r0 = r3.LJLILLLLZI
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r0 = r0.LJLILLLLZI
            if (r0 == 0) goto L1b
            r0.yv0(r1)
        L1b:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L1e:
            if (r0 != r2) goto L1b
            X.1Ks r1 = X.C31301Ks.LIZ
            goto L10
        L23:
            if (r0 != r2) goto L1b
            int r0 = r1.status
            if (r0 != 0) goto L2f
            X.1Kr r1 = new X.1Kr
            r1.<init>(r2)
            goto L12
        L2f:
            if (r0 != r2) goto L1b
            X.1Kr r1 = new X.1Kr
            r0 = 0
            r1.<init>(r0)
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55372Fh.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

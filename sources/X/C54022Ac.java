package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel$songListManager$2$1$1$start$2", f = "KaraokeViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2Ac, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54022Ac extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C29551Dz LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54022Ac(C29551Dz c29551Dz, InterfaceC67352kd<? super C54022Ac> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c29551Dz;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C54022Ac(this.LJLIL, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0048, code lost:
    
        if (r1.booleanValue() != false) goto L8;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.C141335gf.LIZJ(r7)
            X.1Dz r0 = r6.LJLIL
            X.17z r2 = r0.LIZJ()
            if (r2 == 0) goto L70
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "Really Start, checkPanel: "
            r1.append(r0)
            java.lang.String r0 = r2.LJFF()
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "KaraokeViewModel"
            X.C0NB.LIZIZ(r0, r1)
            long r3 = r2.LIZ
            r2.LJFF()
            X.013 r0 = r2.LJII
            java.lang.String r0 = r0.LIZIZ
            boolean r0 = ujb.o.LJJJJJL(r0)
            r5 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L73
            X.J0d<java.lang.Boolean> r0 = X.InterfaceC30442Bx8.F3
            java.lang.Object r1 = r0.LIZJ()
            java.lang.String r0 = "KARAOKE_ORIGINAL_SWITCH.value"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L73
        L4a:
            java.lang.String r0 = "livesdk_live_karaoke_play"
            X.BZI r2 = X.C28787BRn.LIZ(r0)
            r2.LJIIZILJ()
            java.lang.String r1 = "music_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r2.LJIJJ(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            boolean r0 = X.C29306Beo.LJJIFFI(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "is_vocal"
            r2.LJIJJ(r1, r0)
            r2.LJJIIJZLJL()
        L70:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L73:
            r5 = 0
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54022Ac.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

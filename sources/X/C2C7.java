package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel$tryNextDownload$1$downloadTask$1", f = "KaraokeViewModel.kt", l = {1172, 1178, 1179}, m = "invokeSuspend")
/* renamed from: X.2C7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2C7 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public C279917z LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ KaraokeViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2C7(KaraokeViewModel karaokeViewModel, InterfaceC67352kd<? super C2C7> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = karaokeViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2C7(this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007f A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r11.LJLILLLLZI
            r4 = 3
            r5 = 2
            r1 = 1
            if (r0 == 0) goto L15
            if (r0 == r1) goto L25
            if (r0 == r5) goto L61
            if (r0 != r4) goto L80
            X.C141335gf.LIZJ(r12)
        L12:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L15:
            X.C141335gf.LIZJ(r12)
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r0 = r11.LJLJI
            X.0vQ r0 = r0.LLFFF
            r11.LJLILLLLZI = r1
            java.lang.Object r12 = r0.LIZLLL(r11)
            if (r12 != r3) goto L28
            return r3
        L25:
            X.C141335gf.LIZJ(r12)
        L28:
            X.OSZ r12 = (X.OSZ) r12
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "download: "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "KDownloader"
            X.C0NB.LIZIZ(r0, r1)
            java.lang.Object r2 = r12.getFirst()
            X.17z r2 = (X.C279917z) r2
            if (r2 == 0) goto L12
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r1 = r11.LJLJI
            X.1Kt r0 = X.C31311Kt.LIZ
            r1.yv0(r0)
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r1 = r11.LJLJI
            java.lang.Object r0 = r12.getSecond()
            X.0vO r0 = (X.EnumC23060vO) r0
            r11.LJLIL = r2
            r11.LJLILLLLZI = r5
            java.lang.Object r12 = r1.vv0(r0, r2, r11)
            if (r12 != r3) goto L66
            return r3
        L61:
            X.17z r2 = r11.LJLIL
            X.C141335gf.LIZJ(r12)
        L66:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r10 = r12.booleanValue()
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r5 = r11.LJLJI
            X.0Rs r6 = X.EnumC07640Rs.ADD_TO_QUEUE
            java.lang.String r7 = ""
            long r8 = r2.LIZ
            r0 = 0
            r11.LJLIL = r0
            r11.LJLILLLLZI = r4
            java.lang.Object r0 = r5.ov0(r6, r7, r8, r10, r11)
            if (r0 != r3) goto L12
            return r3
        L80:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2C7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

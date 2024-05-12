package X;

import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopeInfoModel4FE;
import com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget;
import fjb.a;
import java.util.concurrent.CountDownLatch;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget$notifyRedEnvelopeInfos$3", f = "RedEnvelopeWidget.kt", l = {337, 345, 353, 376, 379}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class BSR extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ImageModel LJLILLLLZI;
    public final /* synthetic */ CountDownLatch LJLJI;
    public final /* synthetic */ C68322mC<Bitmap> LJLJJI;
    public final /* synthetic */ C68322mC<ImageModel> LJLJJL;
    public final /* synthetic */ C68322mC<Bitmap> LJLJJLL;
    public final /* synthetic */ C68322mC<C29701Eo> LJLJL;
    public final /* synthetic */ C34K LJLJLJ;
    public final /* synthetic */ RedEnvelopeWidget LJLJLLL;
    public final /* synthetic */ C68322mC<String> LJLL;
    public final /* synthetic */ String LJLLI;
    public final /* synthetic */ RedEnvelopeInfoModel4FE LJLLILLLL;
    public final /* synthetic */ boolean LJLLJ;
    public final /* synthetic */ android.net.Uri LJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BSR(ImageModel imageModel, CountDownLatch countDownLatch, C68322mC<Bitmap> c68322mC, C68322mC<ImageModel> c68322mC2, C68322mC<Bitmap> c68322mC3, C68322mC<C29701Eo> c68322mC4, C34K c34k, RedEnvelopeWidget redEnvelopeWidget, C68322mC<String> c68322mC5, String str, RedEnvelopeInfoModel4FE redEnvelopeInfoModel4FE, boolean z, android.net.Uri uri, InterfaceC67352kd<? super BSR> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = imageModel;
        this.LJLJI = countDownLatch;
        this.LJLJJI = c68322mC;
        this.LJLJJL = c68322mC2;
        this.LJLJJLL = c68322mC3;
        this.LJLJL = c68322mC4;
        this.LJLJLJ = c34k;
        this.LJLJLLL = redEnvelopeWidget;
        this.LJLL = c68322mC5;
        this.LJLLI = str;
        this.LJLLILLLL = redEnvelopeInfoModel4FE;
        this.LJLLJ = z;
        this.LJLLL = uri;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new BSR(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI, this.LJLLILLLL, this.LJLLJ, this.LJLLL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066 A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            X.NAu r1 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r15.LJLIL
            r2 = 5
            r8 = 4
            r9 = 3
            r10 = 2
            r11 = 1
            r7 = 0
            if (r0 == 0) goto L1c
            if (r0 == r11) goto L35
            if (r0 == r10) goto L4e
            if (r0 == r9) goto L67
            if (r0 == r8) goto L7c
            if (r0 != r2) goto La5
            X.C141335gf.LIZJ(r16)
        L19:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L1c:
            X.C141335gf.LIZJ(r16)
            X.XIA r6 = X.C78613UtF.LIZJ
            X.BSU r5 = new X.BSU
            com.bytedance.android.live.base.model.ImageModel r4 = r15.LJLILLLLZI
            java.util.concurrent.CountDownLatch r3 = r15.LJLJI
            X.2mC<android.graphics.Bitmap> r0 = r15.LJLJJI
            r5.<init>(r4, r3, r0, r7)
            r15.LJLIL = r11
            java.lang.Object r0 = X.XKX.LJI(r6, r5, r15)
            if (r0 != r1) goto L38
            return r1
        L35:
            X.C141335gf.LIZJ(r16)
        L38:
            X.XIA r6 = X.C78613UtF.LIZJ
            X.BST r5 = new X.BST
            X.2mC<com.bytedance.android.live.base.model.ImageModel> r4 = r15.LJLJJL
            X.2mC<android.graphics.Bitmap> r3 = r15.LJLJJLL
            java.util.concurrent.CountDownLatch r0 = r15.LJLJI
            r5.<init>(r4, r3, r0, r7)
            r15.LJLIL = r10
            java.lang.Object r0 = X.XKX.LJI(r6, r5, r15)
            if (r0 != r1) goto L51
            return r1
        L4e:
            X.C141335gf.LIZJ(r16)
        L51:
            X.XIA r6 = X.C78613UtF.LIZJ
            X.BSW r5 = new X.BSW
            X.2mC<X.1Eo> r4 = r15.LJLJL
            X.34K r3 = r15.LJLJLJ
            java.util.concurrent.CountDownLatch r0 = r15.LJLJI
            r5.<init>(r4, r3, r0, r7)
            r15.LJLIL = r9
            java.lang.Object r0 = X.XKX.LJI(r6, r5, r15)
            if (r0 != r1) goto L6a
            return r1
        L67:
            X.C141335gf.LIZJ(r16)
        L6a:
            X.XIA r4 = X.C78613UtF.LIZJ
            X.BSS r3 = new X.BSS
            java.util.concurrent.CountDownLatch r0 = r15.LJLJI
            r3.<init>(r0, r7)
            r15.LJLIL = r8
            java.lang.Object r0 = X.XKX.LJI(r4, r3, r15)
            if (r0 != r1) goto L7f
            return r1
        L7c:
            X.C141335gf.LIZJ(r16)
        L7f:
            X.UtN r0 = X.C36636EZk.LIZ
            X.BSa r3 = new X.BSa
            com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget r4 = r15.LJLJLLL
            X.2mC<android.graphics.Bitmap> r5 = r15.LJLJJI
            X.2mC<android.graphics.Bitmap> r6 = r15.LJLJJLL
            X.2mC<java.lang.String> r7 = r15.LJLL
            X.2mC<X.1Eo> r8 = r15.LJLJL
            X.34K r9 = r15.LJLJLJ
            java.lang.String r10 = r15.LJLLI
            com.bytedance.android.livesdk.envelope.model.RedEnvelopeInfoModel4FE r11 = r15.LJLLILLLL
            boolean r12 = r15.LJLLJ
            android.net.Uri r13 = r15.LJLLL
            r14 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15.LJLIL = r2
            java.lang.Object r0 = X.XKX.LJI(r0, r3, r15)
            if (r0 != r1) goto L19
            return r1
        La5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BSR.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

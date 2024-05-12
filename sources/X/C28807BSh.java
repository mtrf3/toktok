package X;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.EnvelopePortalMessage;
import fjb.a;
import java.util.concurrent.CountDownLatch;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.impl.revenue.portal.PortalLeaf$notifyPortal$4", f = "PortalLeaf.kt", l = {444, 456, 468, 491, 494}, m = "invokeSuspend")
/* renamed from: X.BSh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28807BSh extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ImageModel LJLILLLLZI;
    public final /* synthetic */ C34K LJLJI;
    public final /* synthetic */ C68322mC<Bitmap> LJLJJI;
    public final /* synthetic */ CountDownLatch LJLJJL;
    public final /* synthetic */ ImageModel LJLJJLL;
    public final /* synthetic */ C34K LJLJL;
    public final /* synthetic */ C68322mC<Bitmap> LJLJLJ;
    public final /* synthetic */ C68322mC<View> LJLJLLL;
    public final /* synthetic */ C34K LJLL;
    public final /* synthetic */ EnvelopePortalMessage LJLLI;
    public final /* synthetic */ C28817BSr LJLLILLLL;
    public final /* synthetic */ InterfaceC28808BSi LJLLJ;
    public final /* synthetic */ C68322mC<String> LJLLL;
    public final /* synthetic */ C68322mC<String> LJLLLL;
    public final /* synthetic */ C68322mC<ValueAnimator> LJLLLLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28807BSh(ImageModel imageModel, C34K c34k, C68322mC<Bitmap> c68322mC, CountDownLatch countDownLatch, ImageModel imageModel2, C34K c34k2, C68322mC<Bitmap> c68322mC2, C68322mC<View> c68322mC3, C34K c34k3, EnvelopePortalMessage envelopePortalMessage, C28817BSr c28817BSr, InterfaceC28808BSi interfaceC28808BSi, C68322mC<String> c68322mC4, C68322mC<String> c68322mC5, C68322mC<ValueAnimator> c68322mC6, InterfaceC67352kd<? super C28807BSh> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = imageModel;
        this.LJLJI = c34k;
        this.LJLJJI = c68322mC;
        this.LJLJJL = countDownLatch;
        this.LJLJJLL = imageModel2;
        this.LJLJL = c34k2;
        this.LJLJLJ = c68322mC2;
        this.LJLJLLL = c68322mC3;
        this.LJLL = c34k3;
        this.LJLLI = envelopePortalMessage;
        this.LJLLILLLL = c28817BSr;
        this.LJLLJ = interfaceC28808BSi;
        this.LJLLL = c68322mC4;
        this.LJLLLL = c68322mC5;
        this.LJLLLLLL = c68322mC6;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C28807BSh(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI, this.LJLLILLLL, this.LJLLJ, this.LJLLL, this.LJLLLL, this.LJLLLLLL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            X.NAu r1 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            r0 = r18
            int r7 = r0.LJLIL
            r12 = 0
            r5 = 5
            r4 = 4
            r3 = 3
            r2 = 2
            r6 = 1
            if (r7 == 0) goto L1e
            if (r7 == r6) goto L39
            if (r7 == r2) goto L54
            if (r7 == r3) goto L6d
            if (r7 == r4) goto L82
            if (r7 != r5) goto Lb3
            X.C141335gf.LIZJ(r19)
        L1b:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L1e:
            X.C141335gf.LIZJ(r19)
            X.XIA r5 = X.C78613UtF.LIZJ
            X.BSj r7 = new X.BSj
            com.bytedance.android.live.base.model.ImageModel r8 = r0.LJLILLLLZI
            X.34K r9 = r0.LJLJI
            X.2mC<android.graphics.Bitmap> r10 = r0.LJLJJI
            java.util.concurrent.CountDownLatch r11 = r0.LJLJJL
            r7.<init>(r8, r9, r10, r11, r12)
            r0.LJLIL = r6
            java.lang.Object r5 = X.XKX.LJI(r5, r7, r0)
            if (r5 != r1) goto L3c
            return r1
        L39:
            X.C141335gf.LIZJ(r19)
        L3c:
            X.XIA r5 = X.C78613UtF.LIZJ
            X.BSk r7 = new X.BSk
            com.bytedance.android.live.base.model.ImageModel r8 = r0.LJLJJLL
            X.34K r9 = r0.LJLJL
            X.2mC<android.graphics.Bitmap> r10 = r0.LJLJLJ
            java.util.concurrent.CountDownLatch r11 = r0.LJLJJL
            r7.<init>(r8, r9, r10, r11, r12)
            r0.LJLIL = r2
            java.lang.Object r2 = X.XKX.LJI(r5, r7, r0)
            if (r2 != r1) goto L57
            return r1
        L54:
            X.C141335gf.LIZJ(r19)
        L57:
            X.XIA r8 = X.C78613UtF.LIZJ
            X.BSd r7 = new X.BSd
            X.2mC<android.view.View> r6 = r0.LJLJLLL
            X.34K r5 = r0.LJLL
            java.util.concurrent.CountDownLatch r2 = r0.LJLJJL
            r7.<init>(r6, r5, r2, r12)
            r0.LJLIL = r3
            java.lang.Object r2 = X.XKX.LJI(r8, r7, r0)
            if (r2 != r1) goto L70
            return r1
        L6d:
            X.C141335gf.LIZJ(r19)
        L70:
            X.XIA r5 = X.C78613UtF.LIZJ
            X.BSg r3 = new X.BSg
            java.util.concurrent.CountDownLatch r2 = r0.LJLJJL
            r3.<init>(r2, r12)
            r0.LJLIL = r4
            java.lang.Object r2 = X.XKX.LJI(r5, r3, r0)
            if (r2 != r1) goto L85
            return r1
        L82:
            X.C141335gf.LIZJ(r19)
        L85:
            X.UtN r2 = X.C36636EZk.LIZ
            X.BSl r4 = new X.BSl
            X.34K r5 = r0.LJLJL
            X.34K r6 = r0.LJLJI
            X.34K r7 = r0.LJLL
            com.bytedance.android.livesdk.model.EnvelopePortalMessage r8 = r0.LJLLI
            X.BSr r9 = r0.LJLLILLLL
            X.2mC<android.graphics.Bitmap> r10 = r0.LJLJJI
            X.2mC<android.graphics.Bitmap> r11 = r0.LJLJLJ
            X.BSi r12 = r0.LJLLJ
            X.2mC<android.view.View> r13 = r0.LJLJLLL
            X.2mC<java.lang.String> r14 = r0.LJLLL
            X.2mC<java.lang.String> r15 = r0.LJLLLL
            X.2mC<android.animation.ValueAnimator> r3 = r0.LJLLLLLL
            r17 = 0
            r16 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r3 = 5
            r0.LJLIL = r3
            java.lang.Object r0 = X.XKX.LJI(r2, r4, r0)
            if (r0 != r1) goto L1b
            return r1
        Lb3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28807BSh.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

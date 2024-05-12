package com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper;

import X.C238889Zc;
import X.C58096Mr6;
import X.C780334l;
import X.C9Z3;
import X.C9ZN;
import X.P1B;
import X.P1C;
import X.XKQ;
import X.XKX;
import X.XRX;
import X.XRZ;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.JobSupport;

/* loaded from: classes16.dex */
public final class BaAutoMessageServiceImpl implements IBaAutoMessageService {
    public XKQ LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public JobSupport LJ;
    public C9ZN LJFF;
    public List<C9Z3> LJI = new ArrayList();
    public XKQ LJII;
    public XKQ LJIIIIZZ;
    public C238889Zc LJIIIZ;

    public static IBaAutoMessageService LJIJ() {
        Object LIZ = C58096Mr6.LIZ(IBaAutoMessageService.class, false);
        if (LIZ != null) {
            return (IBaAutoMessageService) LIZ;
        }
        if (C58096Mr6.LLLILZJ == null) {
            synchronized (IBaAutoMessageService.class) {
                if (C58096Mr6.LLLILZJ == null) {
                    C58096Mr6.LLLILZJ = new BaAutoMessageServiceImpl();
                }
            }
        }
        return C58096Mr6.LLLILZJ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService
    public final void LJII() {
        this.LJ = XKX.LIZLLL(C780334l.LJLIL, null, null, new XRZ(this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService
    public final void LJIIJ() {
        this.LJIIIIZZ = XKX.LIZLLL(C780334l.LJLIL, null, null, new P1B(this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService
    public final void LJIILJJIL() {
        this.LIZ = XKX.LIZLLL(C780334l.LJLIL, null, null, new XRX(this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService
    public final void LJIIZILJ() {
        this.LJII = XKX.LIZLLL(C780334l.LJLIL, null, null, new P1C(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC67352kd<? super X.C238889Zc> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C84840XRk
            if (r0 == 0) goto L48
            r5 = r7
            X.XRk r5 = (X.C84840XRk) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r4 = r5.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 == r1) goto L56
            if (r0 != r2) goto L4e
            com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl r0 = r5.LJLIL
            X.C141335gf.LIZJ(r4)
        L25:
            X.9Zc r0 = r0.LJIIIZ
            return r0
        L28:
            X.C141335gf.LIZJ(r4)
            X.XKQ r0 = r6.LJIIIIZZ
            if (r0 != 0) goto L3b
            r6.LJIIJ()
            r5.LJLJJI = r1
            java.lang.Object r4 = r6.LIZJ(r5)
            if (r4 != r3) goto L59
            return r3
        L3b:
            r5.LJLIL = r6
            r5.LJLJJI = r2
            java.lang.Object r0 = r0.LJJJJ(r5)
            if (r0 != r3) goto L46
            return r3
        L46:
            r0 = r6
            goto L25
        L48:
            X.XRk r5 = new X.XRk
            r5.<init>(r6, r7)
            goto L12
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L56:
            X.C141335gf.LIZJ(r4)
        L59:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl.LIZJ(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.InterfaceC67352kd<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C84838XRi
            if (r0 == 0) goto L4c
            r5 = r7
            X.XRi r5 = (X.C84838XRi) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4c
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r4 = r5.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 == r1) goto L5a
            if (r0 != r2) goto L52
            com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl r0 = r5.LJLIL
            X.C141335gf.LIZJ(r4)
        L25:
            boolean r0 = r0.LIZJ
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2c:
            X.C141335gf.LIZJ(r4)
            X.XKQ r0 = r6.LIZ
            if (r0 != 0) goto L3f
            r6.LJIILJJIL()
            r5.LJLJJI = r1
            java.lang.Object r4 = r6.LJFF(r5)
            if (r4 != r3) goto L5d
            return r3
        L3f:
            r5.LJLIL = r6
            r5.LJLJJI = r2
            java.lang.Object r0 = r0.LJJJJ(r5)
            if (r0 != r3) goto L4a
            return r3
        L4a:
            r0 = r6
            goto L25
        L4c:
            X.XRi r5 = new X.XRi
            r5.<init>(r6, r7)
            goto L12
        L52:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L5a:
            X.C141335gf.LIZJ(r4)
        L5d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl.LJFF(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(X.InterfaceC67352kd<? super java.util.List<X.C9Z3>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C84839XRj
            if (r0 == 0) goto L48
            r5 = r7
            X.XRj r5 = (X.C84839XRj) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r4 = r5.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 == r1) goto L56
            if (r0 != r2) goto L4e
            com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl r0 = r5.LJLIL
            X.C141335gf.LIZJ(r4)
        L25:
            java.util.List<X.9Z3> r0 = r0.LJI
            return r0
        L28:
            X.C141335gf.LIZJ(r4)
            X.XKQ r0 = r6.LJII
            if (r0 != 0) goto L3b
            r6.LJIIZILJ()
            r5.LJLJJI = r1
            java.lang.Object r4 = r6.LJIIIIZZ(r5)
            if (r4 != r3) goto L59
            return r3
        L3b:
            r5.LJLIL = r6
            r5.LJLJJI = r2
            java.lang.Object r0 = r0.LJJJJ(r5)
            if (r0 != r3) goto L46
            return r3
        L46:
            r0 = r6
            goto L25
        L48:
            X.XRj r5 = new X.XRj
            r5.<init>(r6, r7)
            goto L12
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L56:
            X.C141335gf.LIZJ(r4)
        L59:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl.LJIIIIZZ(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(X.InterfaceC67352kd<? super X.C9ZN> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C84842XRm
            if (r0 == 0) goto L48
            r5 = r7
            X.XRm r5 = (X.C84842XRm) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r4 = r5.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 == r1) goto L56
            if (r0 != r2) goto L4e
            com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl r0 = r5.LJLIL
            X.C141335gf.LIZJ(r4)
        L25:
            X.9ZN r0 = r0.LJFF
            return r0
        L28:
            X.C141335gf.LIZJ(r4)
            kotlinx.coroutines.JobSupport r0 = r6.LJ
            if (r0 != 0) goto L3b
            r6.LJII()
            r5.LJLJJI = r1
            java.lang.Object r4 = r6.LJIIL(r5)
            if (r4 != r3) goto L59
            return r3
        L3b:
            r5.LJLIL = r6
            r5.LJLJJI = r2
            java.lang.Object r0 = r0.LJJJJ(r5)
            if (r0 != r3) goto L46
            return r3
        L46:
            r0 = r6
            goto L25
        L48:
            X.XRm r5 = new X.XRm
            r5.<init>(r6, r7)
            goto L12
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L56:
            X.C141335gf.LIZJ(r4)
        L59:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl.LJIIL(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(X.InterfaceC67352kd<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C84843XRn
            if (r0 == 0) goto L4c
            r5 = r7
            X.XRn r5 = (X.C84843XRn) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4c
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r4 = r5.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 == r1) goto L5a
            if (r0 != r2) goto L52
            com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl r0 = r5.LJLIL
            X.C141335gf.LIZJ(r4)
        L25:
            boolean r0 = r0.LIZIZ
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2c:
            X.C141335gf.LIZJ(r4)
            X.XKQ r0 = r6.LIZ
            if (r0 != 0) goto L3f
            r6.LJIILJJIL()
            r5.LJLJJI = r1
            java.lang.Object r4 = r6.LJIILIIL(r5)
            if (r4 != r3) goto L5d
            return r3
        L3f:
            r5.LJLIL = r6
            r5.LJLJJI = r2
            java.lang.Object r0 = r0.LJJJJ(r5)
            if (r0 != r3) goto L4a
            return r3
        L4a:
            r0 = r6
            goto L25
        L4c:
            X.XRn r5 = new X.XRn
            r5.<init>(r6, r7)
            goto L12
        L52:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L5a:
            X.C141335gf.LIZJ(r4)
        L5d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl.LJIILIIL(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILL(X.InterfaceC67352kd<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C84841XRl
            if (r0 == 0) goto L4c
            r5 = r7
            X.XRl r5 = (X.C84841XRl) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4c
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r4 = r5.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 == r1) goto L5a
            if (r0 != r2) goto L52
            com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl r0 = r5.LJLIL
            X.C141335gf.LIZJ(r4)
        L25:
            boolean r0 = r0.LIZLLL
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2c:
            X.C141335gf.LIZJ(r4)
            X.XKQ r0 = r6.LIZ
            if (r0 != 0) goto L3f
            r6.LJIILJJIL()
            r5.LJLJJI = r1
            java.lang.Object r4 = r6.LJIILL(r5)
            if (r4 != r3) goto L5d
            return r3
        L3f:
            r5.LJLIL = r6
            r5.LJLJJI = r2
            java.lang.Object r0 = r0.LJJJJ(r5)
            if (r0 != r3) goto L4a
            return r3
        L4a:
            r0 = r6
            goto L25
        L4c:
            X.XRl r5 = new X.XRl
            r5.<init>(r6, r7)
            goto L12
        L52:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L5a:
            X.C141335gf.LIZJ(r4)
        L5d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl.LJIILL(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(boolean r7, X.InterfaceC67352kd<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C84837XRh
            if (r0 == 0) goto L4b
            r5 = r8
            X.XRh r5 = (X.C84837XRh) r5
            int r2 = r5.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4b
            int r2 = r2 - r1
            r5.LJLJJL = r2
        L12:
            java.lang.Object r2 = r5.LJLJI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJL
            r3 = 1
            if (r0 == 0) goto L31
            if (r0 != r3) goto L54
            boolean r7 = r5.LJLILLLLZI
            com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl r1 = r5.LJLIL
            X.C141335gf.LIZJ(r2)
        L24:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            if (r0 == 0) goto L51
            r1.LIZIZ = r7
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L31:
            X.C141335gf.LIZJ(r2)
            r5.LJLIL = r6
            r5.LJLILLLLZI = r7
            r5.LJLJJL = r3
            X.XIA r2 = X.C78613UtF.LIZJ
            X.XRY r1 = new X.XRY
            r0 = 0
            r1.<init>(r3, r7, r6, r0)
            java.lang.Object r2 = X.XKX.LJI(r2, r1, r5)
            if (r2 != r4) goto L49
            return r4
        L49:
            r1 = r6
            goto L24
        L4b:
            X.XRh r5 = new X.XRh
            r5.<init>(r6, r8)
            goto L12
        L51:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L54:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl.LIZ(boolean, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(boolean r7, X.InterfaceC67352kd<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C84835XRf
            if (r0 == 0) goto L4c
            r5 = r8
            X.XRf r5 = (X.C84835XRf) r5
            int r2 = r5.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4c
            int r2 = r2 - r1
            r5.LJLJJL = r2
        L12:
            java.lang.Object r2 = r5.LJLJI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r5.LJLJJL
            r0 = 1
            if (r1 == 0) goto L31
            if (r1 != r0) goto L55
            boolean r7 = r5.LJLILLLLZI
            com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl r1 = r5.LJLIL
            X.C141335gf.LIZJ(r2)
        L24:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            if (r0 == 0) goto L52
            r1.LIZJ = r7
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L31:
            X.C141335gf.LIZJ(r2)
            r5.LJLIL = r6
            r5.LJLILLLLZI = r7
            r5.LJLJJL = r0
            X.XIA r3 = X.C78613UtF.LIZJ
            X.XRY r2 = new X.XRY
            r1 = 0
            r0 = 2
            r2.<init>(r0, r7, r6, r1)
            java.lang.Object r2 = X.XKX.LJI(r3, r2, r5)
            if (r2 != r4) goto L4a
            return r4
        L4a:
            r1 = r6
            goto L24
        L4c:
            X.XRf r5 = new X.XRf
            r5.<init>(r6, r8)
            goto L12
        L52:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L55:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl.LIZIZ(boolean, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c A[Catch: Exception -> 0x0091, TryCatch #0 {Exception -> 0x0091, blocks: (B:11:0x0063, B:12:0x0066, B:14:0x006c, B:16:0x0070, B:17:0x007d, B:20:0x0080, B:22:0x008a, B:23:0x008e, B:28:0x0033, B:31:0x003a, B:33:0x0047, B:34:0x0050, B:38:0x003d), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e A[Catch: Exception -> 0x0091, TryCatch #0 {Exception -> 0x0091, blocks: (B:11:0x0063, B:12:0x0066, B:14:0x006c, B:16:0x0070, B:17:0x007d, B:20:0x0080, B:22:0x008a, B:23:0x008e, B:28:0x0033, B:31:0x003a, B:33:0x0047, B:34:0x0050, B:38:0x003d), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C9ZN r7, X.InterfaceC67352kd<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C84831XRb
            if (r0 == 0) goto L22
            r5 = r8
            X.XRb r5 = (X.C84831XRb) r5
            int r2 = r5.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.LJLJJL = r2
        L12:
            java.lang.Object r1 = r5.LJLJI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJL
            r3 = 1
            if (r0 == 0) goto L30
            if (r0 != r3) goto L28
            X.9ZN r7 = r5.LJLILLLLZI
            com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl r5 = r5.LJLIL
            goto L63
        L22:
            X.XRb r5 = new X.XRb
            r5.<init>(r6, r8)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C141335gf.LIZJ(r1)
            int r0 = r7.LIZIZ     // Catch: java.lang.Exception -> L91
            r2 = 2
            if (r0 == r3) goto L3d
            if (r0 == r2) goto L47
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L91
            return r0
        L3d:
            java.lang.String r1 = r7.LIZJ     // Catch: java.lang.Exception -> L91
            java.lang.Long r0 = r7.LIZ     // Catch: java.lang.Exception -> L91
            X.76L r0 = com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.api.AutoMsgSettingApiManager.LJI(r2, r1, r0)     // Catch: java.lang.Exception -> L91
            goto L50
        L47:
            java.lang.String r1 = r7.LIZJ     // Catch: java.lang.Exception -> L91
            java.lang.Long r0 = r7.LIZ     // Catch: java.lang.Exception -> L91
            X.76L r0 = com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.api.AutoMsgSettingApiManager.LJI(r3, r1, r0)     // Catch: java.lang.Exception -> L91
        L50:
            X.XKj r0 = X.XPR.LIZ(r0)     // Catch: java.lang.Exception -> L91
            r5.LJLIL = r6     // Catch: java.lang.Exception -> L91
            r5.LJLILLLLZI = r7     // Catch: java.lang.Exception -> L91
            r5.LJLJJL = r3     // Catch: java.lang.Exception -> L91
            java.lang.Object r1 = r0.LJJIJ(r5)     // Catch: java.lang.Exception -> L91
            if (r1 != r4) goto L61
            return r4
        L61:
            r5 = r6
            goto L66
        L63:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Exception -> L91
        L66:
            com.ss.android.ugc.aweme.base.api.BaseResponse r1 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r1     // Catch: java.lang.Exception -> L91
            int r0 = r1.status_code     // Catch: java.lang.Exception -> L91
            if (r0 != 0) goto L8e
            java.lang.Long r0 = r7.LIZ     // Catch: java.lang.Exception -> L91
            if (r0 != 0) goto L80
        L70:
            r5.LJFF = r7     // Catch: java.lang.Exception -> L91
            X.XKj r1 = new X.XKj     // Catch: java.lang.Exception -> L91
            r0 = 0
            r1.<init>(r0)     // Catch: java.lang.Exception -> L91
            r1.LJJLI(r7)     // Catch: java.lang.Exception -> L91
            r5.LJ = r1     // Catch: java.lang.Exception -> L91
        L7d:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L91
            return r0
        L80:
            long r3 = r0.longValue()     // Catch: java.lang.Exception -> L91
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L70
            r5.LJII()     // Catch: java.lang.Exception -> L91
            goto L7d
        L8e:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L91
            return r0
        L91:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl.LIZLLL(X.9ZN, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0066 A[Catch: Exception -> 0x009b, TryCatch #0 {Exception -> 0x009b, blocks: (B:11:0x005d, B:12:0x0060, B:14:0x0066, B:15:0x006d, B:17:0x0074, B:26:0x0090, B:27:0x0095, B:22:0x008d, B:33:0x0098, B:38:0x0033), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098 A[Catch: Exception -> 0x009b, TryCatch #0 {Exception -> 0x009b, blocks: (B:11:0x005d, B:12:0x0060, B:14:0x0066, B:15:0x006d, B:17:0x0074, B:26:0x0090, B:27:0x0095, B:22:0x008d, B:33:0x0098, B:38:0x0033), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.C9Z3 r10, X.InterfaceC67352kd<? super java.lang.Boolean> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C84833XRd
            if (r0 == 0) goto L22
            r5 = r11
            X.XRd r5 = (X.C84833XRd) r5
            int r2 = r5.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.LJLJJL = r2
        L12:
            java.lang.Object r1 = r5.LJLJI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJL
            r3 = 1
            if (r0 == 0) goto L30
            if (r0 != r3) goto L28
            X.9Z3 r10 = r5.LJLILLLLZI
            com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl r8 = r5.LJLIL
            goto L5d
        L22:
            X.XRd r5 = new X.XRd
            r5.<init>(r9, r11)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C141335gf.LIZJ(r1)
            com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.model.AutoReplyStruct r2 = new com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.model.AutoReplyStruct     // Catch: java.lang.Exception -> L9b
            r2.<init>()     // Catch: java.lang.Exception -> L9b
            long r0 = r10.LIZ     // Catch: java.lang.Exception -> L9b
            r2.messageId = r0     // Catch: java.lang.Exception -> L9b
            java.lang.String r0 = r10.LIZJ     // Catch: java.lang.Exception -> L9b
            r2.keyword = r0     // Catch: java.lang.Exception -> L9b
            java.lang.String r0 = r10.LIZLLL     // Catch: java.lang.Exception -> L9b
            r2.content = r0     // Catch: java.lang.Exception -> L9b
            r0 = 3
            X.76L r0 = com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.api.AutoMsgSettingApiManager.LJ(r0, r2)     // Catch: java.lang.Exception -> L9b
            X.XKj r0 = X.XPR.LIZ(r0)     // Catch: java.lang.Exception -> L9b
            r5.LJLIL = r9     // Catch: java.lang.Exception -> L9b
            r5.LJLILLLLZI = r10     // Catch: java.lang.Exception -> L9b
            r5.LJLJJL = r3     // Catch: java.lang.Exception -> L9b
            java.lang.Object r1 = r0.LJJIJ(r5)     // Catch: java.lang.Exception -> L9b
            if (r1 != r4) goto L5b
            return r4
        L5b:
            r8 = r9
            goto L60
        L5d:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Exception -> L9b
        L60:
            com.ss.android.ugc.aweme.base.api.BaseResponse r1 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r1     // Catch: java.lang.Exception -> L9b
            int r0 = r1.status_code     // Catch: java.lang.Exception -> L9b
            if (r0 != 0) goto L98
            java.util.List<X.9Z3> r0 = r8.LJI     // Catch: java.lang.Exception -> L9b
            java.util.Iterator r7 = r0.iterator()     // Catch: java.lang.Exception -> L9b
            r6 = 0
        L6d:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Exception -> L9b
            r5 = -1
            if (r0 == 0) goto L85
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Exception -> L9b
            X.9Z3 r0 = (X.C9Z3) r0     // Catch: java.lang.Exception -> L9b
            long r3 = r0.LIZ     // Catch: java.lang.Exception -> L9b
            long r1 = r10.LIZ     // Catch: java.lang.Exception -> L9b
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L83
            goto L87
        L83:
            r0 = 0
            goto L88
        L85:
            r6 = -1
            goto L8a
        L87:
            r0 = 1
        L88:
            if (r0 == 0) goto L8d
        L8a:
            if (r6 == r5) goto L95
            goto L90
        L8d:
            int r6 = r6 + 1
            goto L6d
        L90:
            java.util.List<X.9Z3> r0 = r8.LJI     // Catch: java.lang.Exception -> L9b
            com.bytedance.mt.protector.impl.collections.ListProtector.set(r0, r6, r10)     // Catch: java.lang.Exception -> L9b
        L95:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L9b
            return r0
        L98:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L9b
            return r0
        L9b:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl.LJ(X.9Z3, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0066 A[Catch: Exception -> 0x0078, TryCatch #0 {Exception -> 0x0078, blocks: (B:11:0x005d, B:12:0x0060, B:14:0x0066, B:17:0x0075, B:25:0x003b), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0075 A[Catch: Exception -> 0x0078, TryCatch #0 {Exception -> 0x0078, blocks: (B:11:0x005d, B:12:0x0060, B:14:0x0066, B:17:0x0075, B:25:0x003b), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.C9Z3 r7, X.InterfaceC67352kd<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C84832XRc
            if (r0 == 0) goto L22
            r5 = r8
            X.XRc r5 = (X.C84832XRc) r5
            int r2 = r5.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.LJLJJL = r2
        L12:
            java.lang.Object r2 = r5.LJLJI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJL
            r3 = 1
            if (r0 == 0) goto L30
            if (r0 != r3) goto L28
            X.9Z3 r7 = r5.LJLILLLLZI
            com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl r1 = r5.LJLIL
            goto L5d
        L22:
            X.XRc r5 = new X.XRc
            r5.<init>(r6, r8)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C141335gf.LIZJ(r2)
            int r1 = r7.LIZIZ
            r0 = 2
            if (r1 != r0) goto L3b
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L3b:
            com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.model.AutoReplyStruct r2 = new com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.model.AutoReplyStruct     // Catch: java.lang.Exception -> L78
            r2.<init>()     // Catch: java.lang.Exception -> L78
            long r0 = r7.LIZ     // Catch: java.lang.Exception -> L78
            r2.messageId = r0     // Catch: java.lang.Exception -> L78
            r0 = 4
            X.76L r0 = com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.api.AutoMsgSettingApiManager.LJ(r0, r2)     // Catch: java.lang.Exception -> L78
            X.XKj r0 = X.XPR.LIZ(r0)     // Catch: java.lang.Exception -> L78
            r5.LJLIL = r6     // Catch: java.lang.Exception -> L78
            r5.LJLILLLLZI = r7     // Catch: java.lang.Exception -> L78
            r5.LJLJJL = r3     // Catch: java.lang.Exception -> L78
            java.lang.Object r2 = r0.LJJIJ(r5)     // Catch: java.lang.Exception -> L78
            if (r2 != r4) goto L5b
            return r4
        L5b:
            r1 = r6
            goto L60
        L5d:
            X.C141335gf.LIZJ(r2)     // Catch: java.lang.Exception -> L78
        L60:
            com.ss.android.ugc.aweme.base.api.BaseResponse r2 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r2     // Catch: java.lang.Exception -> L78
            int r0 = r2.status_code     // Catch: java.lang.Exception -> L78
            if (r0 != 0) goto L75
            java.util.List<X.9Z3> r2 = r1.LJI     // Catch: java.lang.Exception -> L78
            kotlin.jvm.internal.AqS170S0100000_4 r1 = new kotlin.jvm.internal.AqS170S0100000_4     // Catch: java.lang.Exception -> L78
            r0 = 153(0x99, float:2.14E-43)
            r1.<init>(r7, r0)     // Catch: java.lang.Exception -> L78
            X.ORS.LJJLIL(r1, r2)     // Catch: java.lang.Exception -> L78
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L78
            return r0
        L75:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L78
            return r0
        L78:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl.LJI(X.9Z3, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(2:10|11)(2:20|21))(2:22|(2:24|25)(2:26|(1:28)(1:29)))|12|(3:14|15|16)|19|15|16))|31|6|7|(0)(0)|12|(0)|19|15|16) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e A[Catch: Exception -> 0x006c, TRY_LEAVE, TryCatch #0 {Exception -> 0x006c, blocks: (B:11:0x0055, B:12:0x0058, B:14:0x005e, B:26:0x003a), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(X.C9ZN r7, X.InterfaceC67352kd<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C84830XRa
            if (r0 == 0) goto L22
            r5 = r8
            X.XRa r5 = (X.C84830XRa) r5
            int r2 = r5.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.LJLJJL = r2
        L12:
            java.lang.Object r1 = r5.LJLJI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJL
            r3 = 1
            if (r0 == 0) goto L30
            if (r0 != r3) goto L28
            X.9ZN r7 = r5.LJLILLLLZI
            com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl r2 = r5.LJLIL
            goto L55
        L22:
            X.XRa r5 = new X.XRa
            r5.<init>(r6, r8)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C141335gf.LIZJ(r1)
            java.lang.Long r2 = r7.LIZ
            if (r2 != 0) goto L3a
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L3a:
            java.lang.String r1 = r7.LIZJ     // Catch: java.lang.Exception -> L6c
            r0 = 3
            X.76L r0 = com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.api.AutoMsgSettingApiManager.LJI(r0, r1, r2)     // Catch: java.lang.Exception -> L6c
            X.XKj r0 = X.XPR.LIZ(r0)     // Catch: java.lang.Exception -> L6c
            r5.LJLIL = r6     // Catch: java.lang.Exception -> L6c
            r5.LJLILLLLZI = r7     // Catch: java.lang.Exception -> L6c
            r5.LJLJJL = r3     // Catch: java.lang.Exception -> L6c
            java.lang.Object r1 = r0.LJJIJ(r5)     // Catch: java.lang.Exception -> L6c
            if (r1 != r4) goto L53
            return r4
        L53:
            r2 = r6
            goto L58
        L55:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Exception -> L6c
        L58:
            com.ss.android.ugc.aweme.base.api.BaseResponse r1 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r1     // Catch: java.lang.Exception -> L6c
            int r0 = r1.status_code     // Catch: java.lang.Exception -> L6c
            if (r0 != 0) goto L6c
            r2.LJFF = r7     // Catch: java.lang.Exception -> L6c
            X.XKj r1 = new X.XKj     // Catch: java.lang.Exception -> L6c
            r0 = 0
            r1.<init>(r0)     // Catch: java.lang.Exception -> L6c
            r1.LJJLI(r7)     // Catch: java.lang.Exception -> L6c
            r2.LJ = r1     // Catch: java.lang.Exception -> L6c
            goto L6d
        L6c:
            r3 = 0
        L6d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl.LJIIIZ(X.9ZN, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008c A[Catch: Exception -> 0x00d3, TryCatch #0 {Exception -> 0x00d3, blocks: (B:11:0x0083, B:12:0x0086, B:14:0x008c, B:16:0x0094, B:17:0x0097, B:20:0x009a, B:21:0x00a1, B:23:0x00a8, B:32:0x00c4, B:33:0x00ca, B:28:0x00c1, B:37:0x00d0, B:49:0x0041, B:52:0x0048, B:54:0x005e, B:55:0x0070, B:59:0x004b), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d0 A[Catch: Exception -> 0x00d3, TryCatch #0 {Exception -> 0x00d3, blocks: (B:11:0x0083, B:12:0x0086, B:14:0x008c, B:16:0x0094, B:17:0x0097, B:20:0x009a, B:21:0x00a1, B:23:0x00a8, B:32:0x00c4, B:33:0x00ca, B:28:0x00c1, B:37:0x00d0, B:49:0x0041, B:52:0x0048, B:54:0x005e, B:55:0x0070, B:59:0x004b), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJJI(X.C9Z3 r10, X.InterfaceC67352kd<? super java.lang.Boolean> r11) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl.LJIIJJI(X.9Z3, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILLIIL(boolean r7, X.InterfaceC67352kd<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C84836XRg
            if (r0 == 0) goto L4c
            r5 = r8
            X.XRg r5 = (X.C84836XRg) r5
            int r2 = r5.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4c
            int r2 = r2 - r1
            r5.LJLJJL = r2
        L12:
            java.lang.Object r2 = r5.LJLJI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r5.LJLJJL
            r0 = 1
            if (r1 == 0) goto L31
            if (r1 != r0) goto L55
            boolean r7 = r5.LJLILLLLZI
            com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl r1 = r5.LJLIL
            X.C141335gf.LIZJ(r2)
        L24:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            if (r0 == 0) goto L52
            r1.LIZLLL = r7
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L31:
            X.C141335gf.LIZJ(r2)
            r5.LJLIL = r6
            r5.LJLILLLLZI = r7
            r5.LJLJJL = r0
            X.XIA r3 = X.C78613UtF.LIZJ
            X.XRY r2 = new X.XRY
            r1 = 0
            r0 = 3
            r2.<init>(r0, r7, r6, r1)
            java.lang.Object r2 = X.XKX.LJI(r3, r2, r5)
            if (r2 != r4) goto L4a
            return r4
        L4a:
            r1 = r6
            goto L24
        L4c:
            X.XRg r5 = new X.XRg
            r5.<init>(r6, r8)
            goto L12
        L52:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L55:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl.LJIILLIIL(boolean, X.2kd):java.lang.Object");
    }
}

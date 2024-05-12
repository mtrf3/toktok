package com.ss.android.ugc.aweme.relation.recuser.popup;

import X.AYY;
import X.C237449To;
import X.C237459Tp;
import X.C246509lu;
import X.C78613UtF;
import X.C84661XKn;
import X.C93H;
import X.C93K;
import X.C9PC;
import X.InterfaceC237509Tu;
import X.InterfaceC237529Tw;
import X.URB;
import X.UTK;
import X.XIA;
import X.XKW;
import X.XKX;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.poplayer.core.PopupManager;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class RecUserAfterAuthPopupVM extends AssemViewModel<C93H> implements URB {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final XKW LJLJI;
    public final InterfaceC237529Tw LJLJJI;
    public final InterfaceC237509Tu LJLJJL;
    public C84661XKn LJLJJLL;
    public C84661XKn LJLJL;

    @Override // X.URB
    public final void UQ() {
        AYY.LIZ.getClass();
        if (this.LJLJL != null) {
            return;
        }
        this.LJLJL = XKX.LIZIZ(getAssemVMScope(), this.LJLJI, null, new C237459Tp(this, null), 2);
    }

    @Override // X.URB
    public final void cV() {
        C84661XKn c84661XKn = this.LJLJL;
        C84661XKn c84661XKn2 = this.LJLJJLL;
        if (c84661XKn == null && c84661XKn2 == null) {
            AYY.LIZ.getClass();
            PopupManager.LIZJ(C246509lu.class);
        } else {
            AYY.LIZ.getClass();
            setState(C93K.LJLIL);
            XKX.LIZLLL(getAssemVMScope(), this.LJLJI, null, new C9PC(this, c84661XKn, c84661XKn2, null), 2);
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C93H defaultState() {
        return new C93H(null, null);
    }

    @Override // X.URB
    public final void ex() {
        AYY.LIZ.getClass();
        if (this.LJLJJLL != null) {
            return;
        }
        this.LJLJJLL = XKX.LIZIZ(getAssemVMScope(), this.LJLJI, null, new C237449To(this, null), 2);
    }

    public RecUserAfterAuthPopupVM(String authEnterFrom, String authEnterMethod) {
        XIA ioDispatcher = C78613UtF.LIZJ;
        UTK utk = UTK.LIZIZ;
        InterfaceC237529Tw contactRepository = utk.LIZJ();
        InterfaceC237509Tu facebookRepository = utk.LJI();
        o.LJIIIZ(authEnterFrom, "authEnterFrom");
        o.LJIIIZ(authEnterMethod, "authEnterMethod");
        o.LJIIIZ(ioDispatcher, "ioDispatcher");
        o.LJIIIZ(contactRepository, "contactRepository");
        o.LJIIIZ(facebookRepository, "facebookRepository");
        this.LJLIL = authEnterFrom;
        this.LJLILLLLZI = authEnterMethod;
        this.LJLJI = ioDispatcher;
        this.LJLJJI = contactRepository;
        this.LJLJJL = facebookRepository;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:(9:11|12|13|14|(1:16)|17|(1:20)|21|22)(2:25|26))(2:27|28))(2:40|(2:42|(1:44))(2:45|(9:35|(1:37)|13|14|(0)|17|(1:20)|21|22)(4:38|(0)|21|22)))|29|30|(1:32)|33|(0)(0)))|50|6|7|(0)(0)|29|30|(0)|33|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0096, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0097, code lost:
    
        r2 = X.C141335gf.LIZ(r0);
        X.C3C5.m7constructorimpl(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0057, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0058, code lost:
    
        r2 = X.C141335gf.LIZ(r0);
        X.C3C5.m7constructorimpl(r2);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077 A[Catch: all -> 0x0096, TRY_ENTER, TryCatch #0 {all -> 0x0096, blocks: (B:12:0x0085, B:13:0x0088, B:35:0x0077), top: B:7:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gv0(X.InterfaceC68342mE<java.lang.Boolean> r10, X.InterfaceC68342mE<java.lang.Boolean> r11, X.InterfaceC67352kd<? super java.lang.Boolean> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof X.C9TC
            if (r0 == 0) goto L25
            r7 = r12
            X.9TC r7 = (X.C9TC) r7
            int r2 = r7.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r7.LJLJJL = r2
        L12:
            java.lang.Object r1 = r7.LJLJI
            X.NAu r8 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJJL
            r3 = 1
            java.lang.String r4 = "Auth_RecUser"
            r6 = 2
            if (r0 == 0) goto L36
            if (r0 == r3) goto L33
            if (r0 != r6) goto L2b
            int r5 = r7.LJLILLLLZI
            goto L85
        L25:
            X.9TC r7 = new X.9TC
            r7.<init>(r9, r12)
            goto L12
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L33:
            X.2mE r11 = r7.LJLIL
            goto L46
        L36:
            X.C141335gf.LIZJ(r1)
            if (r10 == 0) goto L74
            r7.LJLIL = r11     // Catch: java.lang.Throwable -> L57
            r7.LJLJJL = r3     // Catch: java.lang.Throwable -> L57
            java.lang.Object r1 = r10.LJI(r7)     // Catch: java.lang.Throwable -> L57
            if (r1 != r8) goto L49
            return r8
        L46:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Throwable -> L57
        L49:
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L57
            boolean r0 = r1.booleanValue()     // Catch: java.lang.Throwable -> L57
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L57
            X.C3C5.m7constructorimpl(r2)     // Catch: java.lang.Throwable -> L57
            goto L5f
        L57:
            r0 = move-exception
            X.3C4 r2 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r2)
        L5f:
            java.lang.Throwable r1 = X.C3C5.m10exceptionOrNullimpl(r2)
            if (r1 == 0) goto L6f
            X.AYY r0 = X.AYY.LIZ
            r0.getClass()
            java.lang.String r0 = "facebook sync fail"
            X.AYY.LIZ(r4, r0, r1)
        L6f:
            boolean r5 = X.C3C5.m13isSuccessimpl(r2)
            goto L75
        L74:
            r5 = 1
        L75:
            if (r11 == 0) goto Lb3
            r0 = 0
            r7.LJLIL = r0     // Catch: java.lang.Throwable -> L96
            r7.LJLILLLLZI = r5     // Catch: java.lang.Throwable -> L96
            r7.LJLJJL = r6     // Catch: java.lang.Throwable -> L96
            java.lang.Object r1 = r11.LJI(r7)     // Catch: java.lang.Throwable -> L96
            if (r1 != r8) goto L88
            return r8
        L85:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Throwable -> L96
        L88:
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L96
            boolean r0 = r1.booleanValue()     // Catch: java.lang.Throwable -> L96
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L96
            X.C3C5.m7constructorimpl(r2)     // Catch: java.lang.Throwable -> L96
            goto L9e
        L96:
            r0 = move-exception
            X.3C4 r2 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r2)
        L9e:
            java.lang.Throwable r1 = X.C3C5.m10exceptionOrNullimpl(r2)
            if (r1 == 0) goto Lae
            X.AYY r0 = X.AYY.LIZ
            r0.getClass()
            java.lang.String r0 = "contact sync fail"
            X.AYY.LIZ(r4, r0, r1)
        Lae:
            boolean r0 = X.C3C5.m13isSuccessimpl(r2)
            goto Lb4
        Lb3:
            r0 = 1
        Lb4:
            if (r0 != 0) goto Lb8
            if (r5 == 0) goto Lbd
        Lb8:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        Lbd:
            r3 = 0
            goto Lb8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.recuser.popup.RecUserAfterAuthPopupVM.gv0(X.2mE, X.2mE, X.2kd):java.lang.Object");
    }
}

package X;

import android.app.Activity;
import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.ADr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25879ADr implements InterfaceC36621EYv<String> {
    public final /* synthetic */ InterfaceC25880ADs LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    @Override // X.InterfaceC36621EYv
    public final void LIZJ(InterfaceC37276Ek4<String> interfaceC37276Ek4, Throwable th) {
        InterfaceC25880ADs interfaceC25880ADs = this.LJLIL;
        if (interfaceC25880ADs != null) {
            interfaceC25880ADs.onFailed();
        }
        Activity LJIJJ = C45804HyK.LJIJJ(this.LJLILLLLZI);
        o.LJI(LJIJJ);
        C26045AKb c26045AKb = new C26045AKb(LJIJJ);
        c26045AKb.LJIIIZ("Request Failed");
        c26045AKb.LJIIJ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0038, code lost:
    
        if (r2 != null) goto L17;
     */
    @Override // X.InterfaceC36621EYv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(X.InterfaceC37276Ek4<java.lang.String> r8, X.C64797Pbt<java.lang.String> r9) {
        /*
            r7 = this;
            if (r9 == 0) goto Lc1
            boolean r0 = r9.LIZIZ()
            if (r0 == 0) goto Lc1
            T r2 = r9.LIZIZ
            if (r2 == 0) goto Lc1
        Ld:
            java.lang.String r2 = (java.lang.String) r2
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = 0
            if (r0 == 0) goto L17
            goto L3a
        L17:
            X.Ol8 r0 = X.C25881ADt.LIZ     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L3a
            com.google.gson.o r0 = (com.google.gson.o) r0     // Catch: java.lang.Throwable -> L3a
            r0.getClass()     // Catch: java.lang.Throwable -> L3a
            com.google.gson.j r0 = com.google.gson.o.LIZ(r2)     // Catch: java.lang.Throwable -> L3a
            com.google.gson.m r1 = r0.LJIIZILJ()     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L3a
            java.lang.String r0 = "status_msg"
            com.google.gson.j r0 = r1.LJJIJ(r0)     // Catch: java.lang.UnsupportedOperationException -> Lb5
            if (r0 == 0) goto L3a
            java.lang.String r2 = r0.LJJIFFI()     // Catch: java.lang.UnsupportedOperationException -> Lb5
            if (r2 != 0) goto L3c
        L3a:
            java.lang.String r2 = ""
        L3c:
            if (r1 == 0) goto L59
            java.lang.String r0 = "status_code"
            com.google.gson.j r0 = r1.LJJIJ(r0)     // Catch: java.lang.UnsupportedOperationException -> Lb5
            if (r0 == 0) goto L59
            java.lang.String r0 = r0.toString()     // Catch: java.lang.UnsupportedOperationException -> Lb5
            if (r0 == 0) goto L59
            java.lang.Integer r0 = X.C38350F3i.LJJIL(r0)     // Catch: java.lang.UnsupportedOperationException -> Lb5
            if (r0 == 0) goto L59
            int r1 = r0.intValue()     // Catch: java.lang.UnsupportedOperationException -> Lb5
            if (r1 != 0) goto L5a
            goto Lc9
        L59:
            r1 = -1
        L5a:
            X.ADs r0 = r7.LJLIL
            if (r0 == 0) goto L61
            r0.onFailed()
        L61:
            r0 = -5006(0xffffffffffffec72, float:NaN)
            r6 = 0
            if (r1 == r0) goto L88
            r0 = -5003(0xffffffffffffec75, float:NaN)
            if (r1 == r0) goto L6f
            r0 = -5001(0xffffffffffffec77, float:NaN)
            if (r1 == r0) goto L6f
            goto Ld0
        L6f:
            X.ARb r1 = new X.ARb
            android.content.Context r0 = r7.LJLILLLLZI
            r1.<init>(r0)
            r1.LIZIZ(r2)
            X.ADq r0 = X.C25878ADq.LJLIL
            X.UC0.LIZJ(r1, r0)
            r1.LJII = r6
            X.ARf r0 = r1.LJI()
            r0.LIZLLL()
            return
        L88:
            X.ARb r5 = new X.ARb
            android.content.Context r0 = r7.LJLILLLLZI
            r5.<init>(r0)
            r0 = 2131822987(0x7f11098b, float:1.927876E38)
            r5.LJ(r0)
            r0 = 2131822986(0x7f11098a, float:1.9278759E38)
            r5.LIZ(r0)
            kotlin.jvm.internal.AqS28S0210000_4 r4 = new kotlin.jvm.internal.AqS28S0210000_4
            android.content.Context r3 = r7.LJLILLLLZI
            boolean r2 = r7.LJLJI
            X.ADs r1 = r7.LJLIL
            r0 = 10
            r4.<init>(r3, r1, r2, r0)
            X.UC0.LIZJ(r5, r4)
            r5.LJII = r6
            X.ARf r0 = r5.LJI()
            r0.LIZLLL()
            return
        Lb5:
            r1 = move-exception
            X.ADs r0 = r7.LJLIL
            if (r0 == 0) goto Lbd
            r0.onFailed()
        Lbd:
            X.C78983UzD.LJIIZILJ(r1)
            return
        Lc1:
            X.ADs r0 = r7.LJLIL
            if (r0 == 0) goto Le1
            r0.onFailed()
            goto Le1
        Lc9:
            X.ADs r0 = r7.LJLIL
            if (r0 == 0) goto Ld0
            r0.onSuccess()
        Ld0:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Le1
            android.content.Context r0 = r7.LJLILLLLZI
            android.app.Activity r0 = X.C45804HyK.LJIJJ(r0)
            if (r0 == 0) goto Le1
            X.C31811Ce7.LIZIZ(r0, r2)
        Le1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25879ADr.LJII(X.Ek4, X.Pbt):void");
    }

    public C25879ADr(Context context, InterfaceC25880ADs interfaceC25880ADs, boolean z) {
        this.LJLIL = interfaceC25880ADs;
        this.LJLILLLLZI = context;
        this.LJLJI = z;
    }
}

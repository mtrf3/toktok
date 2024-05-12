package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AE2 implements InterfaceC36621EYv<String> {
    public final /* synthetic */ AE6 LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;

    public AE2(AE6 ae6, Context context) {
        this.LJLIL = ae6;
        this.LJLILLLLZI = context;
    }

    @Override // X.InterfaceC36621EYv
    public final void LIZJ(InterfaceC37276Ek4<String> call, Throwable t) {
        o.LJIIIZ(call, "call");
        o.LJIIIZ(t, "t");
        AE6 ae6 = this.LJLIL;
        if (ae6 != null) {
            ae6.onFailed();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x003e, code lost:
    
        if (r1 != null) goto L14;
     */
    @Override // X.InterfaceC36621EYv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(X.InterfaceC37276Ek4<java.lang.String> r4, X.C64797Pbt<java.lang.String> r5) {
        /*
            r3 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "response"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            boolean r0 = r5.LIZIZ()
            if (r0 == 0) goto L73
        L11:
            T r1 = r5.LIZIZ
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r2 = 0
            if (r0 == 0) goto L1d
            goto L40
        L1d:
            X.Ol8 r0 = X.AE3.LIZ     // Catch: java.lang.Throwable -> L40
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L40
            com.google.gson.o r0 = (com.google.gson.o) r0     // Catch: java.lang.Throwable -> L40
            r0.getClass()     // Catch: java.lang.Throwable -> L40
            com.google.gson.j r0 = com.google.gson.o.LIZ(r1)     // Catch: java.lang.Throwable -> L40
            com.google.gson.m r2 = r0.LJIIZILJ()     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L40
            java.lang.String r0 = "status_msg"
            com.google.gson.j r0 = r2.LJJIJ(r0)     // Catch: java.lang.UnsupportedOperationException -> L67
            if (r0 == 0) goto L40
            java.lang.String r1 = r0.LJJIFFI()     // Catch: java.lang.UnsupportedOperationException -> L67
            if (r1 != 0) goto L42
        L40:
            java.lang.String r1 = ""
        L42:
            if (r2 == 0) goto L5f
            java.lang.String r0 = "status_code"
            com.google.gson.j r0 = r2.LJJIJ(r0)     // Catch: java.lang.UnsupportedOperationException -> L67
            if (r0 == 0) goto L5f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.UnsupportedOperationException -> L67
            if (r0 == 0) goto L5f
            java.lang.Integer r0 = X.C38350F3i.LJJIL(r0)     // Catch: java.lang.UnsupportedOperationException -> L67
            if (r0 == 0) goto L5f
            int r0 = r0.intValue()     // Catch: java.lang.UnsupportedOperationException -> L67
            if (r0 != 0) goto L5f
            goto L7b
        L5f:
            X.AE6 r0 = r3.LJLIL
            if (r0 == 0) goto L82
            r0.onFailed()
            goto L82
        L67:
            r1 = move-exception
            X.AE6 r0 = r3.LJLIL
            if (r0 == 0) goto L6f
            r0.onFailed()
        L6f:
            X.C78983UzD.LJIIZILJ(r1)
            return
        L73:
            X.AE6 r0 = r3.LJLIL
            if (r0 == 0) goto L93
            r0.onFailed()
            goto L93
        L7b:
            X.AE6 r0 = r3.LJLIL
            if (r0 == 0) goto L82
            r0.onSuccess()
        L82:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L93
            android.content.Context r0 = r3.LJLILLLLZI
            android.app.Activity r0 = X.C45804HyK.LJIJJ(r0)
            if (r0 == 0) goto L93
            X.C31811Ce7.LIZIZ(r0, r1)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AE2.LJII(X.Ek4, X.Pbt):void");
    }
}

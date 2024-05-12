package com.facebook.login;

import X.C66443Q5v;
import Y.IDCreatorS54S0000000_11;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class KatanaProxyLoginMethodHandler extends NativeAppLoginMethodHandler {
    public final String nameForLogging;
    public static final C66443Q5v Companion = new C66443Q5v();
    public static final Parcelable.Creator<KatanaProxyLoginMethodHandler> CREATOR = new IDCreatorS54S0000000_11(24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final String LJI() {
        return this.nameForLogging;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KatanaProxyLoginMethodHandler(Parcel source) {
        super(source);
        o.LJIIIZ(source, "source");
        this.nameForLogging = "katana_proxy_auth";
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    @Override // com.facebook.login.LoginMethodHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJIIL(com.facebook.login.LoginClient.Request r29) {
        /*
            r28 = this;
            r9 = r29
            X.Q5O r1 = r9.loginBehavior
            boolean r0 = m43.u.LJIIL
            if (r0 == 0) goto Ldd
            java.lang.String r0 = X.Q5G.LIZ()
            if (r0 == 0) goto Ldd
            boolean r0 = r1.allowsCustomTabAuth()
            if (r0 == 0) goto Ldd
            r20 = 1
        L16:
            X.Q5X r0 = com.facebook.login.LoginClient.Companion
            r0.getClass()
            java.lang.String r15 = X.Q5X.LIZ()
            r6 = r28
            com.facebook.login.LoginClient r0 = r6.LJ()
            r0.LJII()
            java.lang.String r13 = r9.applicationId
            java.util.Set<java.lang.String> r14 = r9.permissions
            boolean r16 = r9.LIZ()
            X.Q5V r5 = r9.defaultAudience
            if (r5 != 0) goto L37
            X.Q5V r5 = X.Q5V.NONE
        L37:
            java.lang.String r0 = r9.authId
            java.lang.String r18 = r6.LIZLLL(r0)
            java.lang.String r4 = r9.authType
            java.lang.String r8 = r9.messengerPageId
            boolean r7 = r9.resetMessengerState
            boolean r3 = r9.isFamilyLogin
            boolean r2 = r9.shouldSkipAccountDeduplication
            java.lang.String r1 = r9.nonce
            X.Psh r0 = r9.codeChallengeMethod
            if (r0 != 0) goto Ld8
        L4d:
            java.lang.Class<X.Q5A> r0 = X.Q5A.class
            boolean r0 = X.C40700FyC.LIZ(r0)
            if (r0 == 0) goto L89
        L55:
            r0 = 0
        L56:
            java.lang.String r1 = "e2e"
            r6.LIZ(r15, r1)
            java.util.Iterator r4 = r0.iterator()
            r3 = 0
        L60:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Le2
            int r3 = r3 + 1
            java.lang.Object r2 = r4.next()
            android.content.Intent r2 = (android.content.Intent) r2
            X.Q5X r0 = com.facebook.login.LoginClient.Companion
            r0.getClass()
            X.Q5U r0 = X.Q5U.Login
            int r1 = r0.toRequestCode()
            if (r2 != 0) goto L7c
            goto L60
        L7c:
            com.facebook.login.LoginClient r0 = r6.LJ()     // Catch: java.lang.Exception -> L60
            androidx.fragment.app.Fragment r0 = r0.fragment     // Catch: java.lang.Exception -> L60
            if (r0 != 0) goto L85
            goto Le1
        L85:
            X.C16880lQ.LJII(r0, r2, r1)     // Catch: java.lang.Exception -> L60
            goto Le1
        L89:
            java.lang.String r0 = "applicationId"
            kotlin.jvm.internal.o.LJIIIZ(r13, r0)     // Catch: java.lang.Throwable -> L55
            java.lang.String r0 = "permissions"
            kotlin.jvm.internal.o.LJIIIZ(r14, r0)     // Catch: java.lang.Throwable -> L55
            java.lang.String r0 = "defaultAudience"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)     // Catch: java.lang.Throwable -> L55
            java.lang.String r0 = "authType"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)     // Catch: java.lang.Throwable -> L55
            java.util.List<X.Q5J> r9 = X.Q5A.LIZIZ     // Catch: java.lang.Throwable -> L55
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L55
            r0.<init>()     // Catch: java.lang.Throwable -> L55
            java.util.Iterator r10 = r9.iterator()     // Catch: java.lang.Throwable -> L55
        La8:
            boolean r9 = r10.hasNext()     // Catch: java.lang.Throwable -> L55
            if (r9 == 0) goto L56
            java.lang.Object r12 = r10.next()     // Catch: java.lang.Throwable -> L55
            X.Q5J r12 = (X.Q5J) r12     // Catch: java.lang.Throwable -> L55
            X.Q5A r11 = X.Q5A.LIZ     // Catch: java.lang.Throwable -> L55
            X.Q5I r23 = X.Q5I.FACEBOOK     // Catch: java.lang.Throwable -> L55
            r27 = r5
            r14 = r14
            r9 = r13
            r24 = r3
            r25 = r2
            r26 = r1
            r21 = r8
            r22 = r7
            r19 = r4
            r17 = r5
            android.content.Intent r5 = r11.LJ(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch: java.lang.Throwable -> L55
            if (r5 == 0) goto Ld3
            r0.add(r5)     // Catch: java.lang.Throwable -> L55
        Ld3:
            r5 = r27
            r14 = r14
            r13 = r9
            goto La8
        Ld8:
            r0.name()
            goto L4d
        Ldd:
            r20 = 0
            goto L16
        Le1:
            return r3
        Le2:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.KatanaProxyLoginMethodHandler.LJIIL(com.facebook.login.LoginClient$Request):int");
    }

    public KatanaProxyLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.nameForLogging = "katana_proxy_auth";
    }
}

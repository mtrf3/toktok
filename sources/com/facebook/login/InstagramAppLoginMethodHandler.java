package com.facebook.login;

import X.C66442Q5u;
import X.EnumC66385Q3p;
import Y.IDCreatorS54S0000000_11;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class InstagramAppLoginMethodHandler extends NativeAppLoginMethodHandler {
    public final String nameForLogging;
    public final EnumC66385Q3p tokenSource;
    public static final C66442Q5u Companion = new C66442Q5u();
    public static final Parcelable.Creator<InstagramAppLoginMethodHandler> CREATOR = new IDCreatorS54S0000000_11(23);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final String LJI() {
        return this.nameForLogging;
    }

    @Override // com.facebook.login.NativeAppLoginMethodHandler
    public final EnumC66385Q3p LJIILJJIL() {
        return this.tokenSource;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstagramAppLoginMethodHandler(Parcel source) {
        super(source);
        o.LJIIIZ(source, "source");
        this.nameForLogging = "instagram_login";
        this.tokenSource = EnumC66385Q3p.INSTAGRAM_APPLICATION_WEB;
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.facebook.login.LoginMethodHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJIIL(com.facebook.login.LoginClient.Request r21) {
        /*
            r20 = this;
            X.Q5X r0 = com.facebook.login.LoginClient.Companion
            r0.getClass()
            java.lang.String r8 = X.Q5X.LIZ()
            r1 = r20
            com.facebook.login.LoginClient r0 = r1.LJ()
            X.1qj r0 = r0.LJII()
            if (r0 != 0) goto L1a
            android.content.Context r0 = m43.u.LIZJ()
        L1a:
            r4 = r21
            java.lang.String r6 = r4.applicationId
            java.util.Set<java.lang.String> r7 = r4.permissions
            boolean r9 = r4.LIZ()
            X.Q5V r10 = r4.defaultAudience
            if (r10 != 0) goto L2a
            X.Q5V r10 = X.Q5V.NONE
        L2a:
            java.lang.String r2 = r4.authId
            java.lang.String r11 = r1.LIZLLL(r2)
            java.lang.String r12 = r4.authType
            java.lang.String r14 = r4.messengerPageId
            boolean r15 = r4.resetMessengerState
            boolean r3 = r4.isFamilyLogin
            boolean r2 = r4.shouldSkipAccountDeduplication
            java.lang.Class<X.Q5A> r4 = X.Q5A.class
            boolean r4 = X.C40700FyC.LIZ(r4)
            if (r4 == 0) goto L65
        L42:
            r4 = 0
        L43:
            java.lang.String r0 = "e2e"
            r1.LIZ(r8, r0)
            X.Q5X r0 = com.facebook.login.LoginClient.Companion
            r0.getClass()
            X.Q5U r0 = X.Q5U.Login
            int r3 = r0.toRequestCode()
            r2 = 0
            if (r4 != 0) goto L57
        L56:
            return r2
        L57:
            com.facebook.login.LoginClient r0 = r1.LJ()     // Catch: java.lang.Exception -> L56
            androidx.fragment.app.Fragment r0 = r0.fragment     // Catch: java.lang.Exception -> L56
            if (r0 != 0) goto L60
            goto L63
        L60:
            X.C16880lQ.LJII(r0, r4, r3)     // Catch: java.lang.Exception -> L56
        L63:
            r2 = 1
            goto L56
        L65:
            java.lang.String r4 = "applicationId"
            kotlin.jvm.internal.o.LJIIIZ(r6, r4)     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = "permissions"
            kotlin.jvm.internal.o.LJIIIZ(r7, r4)     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = "defaultAudience"
            kotlin.jvm.internal.o.LJIIIZ(r10, r4)     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = "authType"
            kotlin.jvm.internal.o.LJIIIZ(r12, r4)     // Catch: java.lang.Throwable -> L42
            X.Q5l r5 = new X.Q5l     // Catch: java.lang.Throwable -> L42
            r5.<init>()     // Catch: java.lang.Throwable -> L42
            X.Q5A r4 = X.Q5A.LIZ     // Catch: java.lang.Throwable -> L42
            X.Q5I r16 = X.Q5I.INSTAGRAM     // Catch: java.lang.Throwable -> L42
            java.lang.String r19 = ""
            r13 = 0
            r18 = r2
            r17 = r3
            android.content.Intent r2 = r4.LJ(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> L42
            android.content.Intent r4 = X.Q5A.LJIJ(r0, r2)     // Catch: java.lang.Throwable -> L42
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.InstagramAppLoginMethodHandler.LJIIL(com.facebook.login.LoginClient$Request):int");
    }

    public InstagramAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.nameForLogging = "instagram_login";
        this.tokenSource = EnumC66385Q3p.INSTAGRAM_APPLICATION_WEB;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        o.LJIIIZ(dest, "dest");
        super.writeToParcel(dest, i);
    }
}

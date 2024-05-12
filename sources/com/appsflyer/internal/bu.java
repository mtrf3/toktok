package com.appsflyer.internal;

import java.util.Map;

/* loaded from: classes.dex */
public abstract class bu extends j {
    public boolean onConversionDataSuccess;
    public final boolean onInstallConversionDataLoadedNative;
    public final boolean onInstallConversionFailureNative;

    public bu() {
        this(null, null, null, null, null, null);
    }

    public String AFVersionDeclaration() {
        return o.AFInAppEventParameterName((Map<String, ?>) AFInAppEventParameterName()).toString();
    }

    public final boolean AFLogger$LogLevel() {
        return this.onInstallConversionFailureNative;
    }

    public final boolean getLevel() {
        return this.onConversionDataSuccess;
    }

    public final boolean init() {
        return this.onInstallConversionDataLoadedNative;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bu(java.lang.String r3, java.lang.String r4, java.lang.Boolean r5, java.lang.Boolean r6, java.lang.Boolean r7, android.content.Context r8) {
        /*
            r2 = this;
            if (r7 == 0) goto L21
            boolean r0 = r7.booleanValue()
        L6:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.<init>(r3, r4, r0, r8)
            r1 = 1
            if (r5 == 0) goto L1f
            boolean r0 = r5.booleanValue()
        L14:
            r2.onInstallConversionDataLoadedNative = r0
            if (r6 == 0) goto L1c
            boolean r1 = r6.booleanValue()
        L1c:
            r2.onInstallConversionFailureNative = r1
            return
        L1f:
            r0 = 1
            goto L14
        L21:
            r0 = 0
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.bu.<init>(java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, android.content.Context):void");
    }
}

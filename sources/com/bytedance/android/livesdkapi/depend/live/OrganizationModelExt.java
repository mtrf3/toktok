package com.bytedance.android.livesdkapi.depend.live;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.OrganizationModel;

/* loaded from: classes6.dex */
public final class OrganizationModelExt extends OrganizationModel {

    @InterfaceC65349Pkn("extra")
    public final String extra;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r3 = this;
            r1 = 0
            java.lang.String r0 = r3.extra     // Catch: java.lang.Exception -> L13
            if (r0 == 0) goto L13
            int r0 = r0.length()     // Catch: java.lang.Exception -> L13
            if (r0 <= 0) goto L13
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L13
            java.lang.String r0 = r3.extra     // Catch: java.lang.Exception -> L13
            r2.<init>(r0)     // Catch: java.lang.Exception -> L13
            goto L14
        L13:
            r2 = r1
        L14:
            java.lang.String r0 = r3.organizationId
            if (r0 == 0) goto L1e
            int r0 = r0.length()
            if (r0 != 0) goto L49
        L1e:
            r0 = 1
        L1f:
            java.lang.String r1 = ""
            if (r0 == 0) goto L30
            if (r2 == 0) goto L2d
            java.lang.String r0 = "percent_organization_id"
            java.lang.String r0 = r2.optString(r0)
            if (r0 != 0) goto L2e
        L2d:
            r0 = r1
        L2e:
            r3.organizationId = r0
        L30:
            java.lang.String r0 = r3.donateLink
            if (r0 == 0) goto L3a
            int r0 = r0.length()
            if (r0 != 0) goto L46
        L3a:
            if (r2 == 0) goto L44
            java.lang.String r0 = "tiltify_donation_link"
            java.lang.String r0 = r2.optString(r0)
            if (r0 != 0) goto L47
        L44:
            r3.donateLink = r1
        L46:
            return
        L47:
            r1 = r0
            goto L44
        L49:
            r0 = 0
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdkapi.depend.live.OrganizationModelExt.LIZ():void");
    }
}

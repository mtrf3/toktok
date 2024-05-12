package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC54341LUj;
import X.C113554cx;
import X.C40515FvD;
import X.C76800UCe;
import X.M5X;
import X.OSZ;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class UserProfileAction extends AbstractC54341LUj<C76800UCe> {
    public String previousPage = "";

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r3 == null) goto L19;
     */
    @Override // X.AbstractC54344LUm, com.bytedance.router.OpenResultCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSuccess(android.content.Intent r6) {
        /*
            r5 = this;
            super.onSuccess(r6)
            java.lang.String r0 = r5.previousPage
            java.lang.String r1 = "scan_external"
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r1)
            if (r0 == 0) goto L4c
            X.7au r4 = new X.7au
            r4.<init>()
            java.lang.String r0 = "previous_page"
            r4.LJIIIZ(r0, r1)
            X.Yp3 r3 = X.C88545Yp3.LIZIZ
            java.lang.String r2 = ""
            if (r3 == 0) goto L23
            java.lang.String r1 = r3.LJ()
            if (r1 != 0) goto L26
        L23:
            r1 = r2
            if (r3 == 0) goto L4f
        L26:
            boolean r0 = r3.isConnected()
        L2a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.LJFF(r0, r1)
            if (r3 == 0) goto L39
            java.lang.String r1 = r3.LIZIZ()
            if (r1 != 0) goto L3c
        L39:
            r1 = r2
            if (r3 == 0) goto L42
        L3c:
            java.lang.String r0 = r3.LJIILJJIL()
            if (r0 != 0) goto L4d
        L42:
            r4.LJIIIZ(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.LIZ
            java.lang.String r0 = "enter_personal_detail"
            X.FMX.LJIIL(r0, r1)
        L4c:
            return
        L4d:
            r2 = r0
            goto L42
        L4f:
            r0 = 0
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.deeplink.actions.UserProfileAction.onSuccess(android.content.Intent):void");
    }

    @Override // X.AbstractC54341LUj
    public OSZ<String, HashMap<String, Object>> buildInnerUrl(String outerUrl, HashMap<String, Object> originalQueryMap, M5X deepLinkData) {
        String str;
        String str2;
        String str3;
        o.LJIIIZ(outerUrl, "outerUrl");
        o.LJIIIZ(originalQueryMap, "originalQueryMap");
        o.LJIIIZ(deepLinkData, "deepLinkData");
        Uri parse = UriProtector.parse(outerUrl);
        Object obj = originalQueryMap.get("id");
        if (obj == null) {
            obj = originalQueryMap.get("uid");
        }
        Object obj2 = originalQueryMap.get("unique_id");
        String str4 = null;
        if (obj != null) {
            str = obj.toString();
        } else {
            str = null;
        }
        if (parse != null) {
            str4 = UriProtector.getQueryParameter(parse, "sec_uid");
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str4)) {
            C40515FvD.LIZJ().LJIIIIZZ(str, str4);
        }
        C40515FvD LIZJ = C40515FvD.LIZJ();
        Object obj3 = "";
        if (parse == null || (str2 = parse.toString()) == null) {
            str2 = "";
        }
        LIZJ.getClass();
        C40515FvD.LJFF(str2, str, str4);
        Object obj4 = originalQueryMap.get("invitation_id");
        if (o.LJ(originalQueryMap.get("tt_from"), "scan_code")) {
            this.previousPage = "scan_external";
        } else {
            Object obj5 = originalQueryMap.get("convert_url");
            if ((obj5 instanceof String) && (str3 = (String) obj5) != null && ujb.o.LJJJLIIL(str3, "https://www.tiktok.com/@", false)) {
                this.previousPage = "share_profile_link";
            }
        }
        OSZ[] oszArr = new OSZ[5];
        if (obj == null) {
            obj = "";
        }
        oszArr[0] = new OSZ("uid", obj);
        if (str4 == null) {
            str4 = "";
        }
        oszArr[1] = new OSZ("sec_user_id", str4);
        if (obj2 == null) {
            obj2 = "";
        }
        oszArr[2] = new OSZ("unique_id", obj2);
        if (obj4 != null) {
            obj3 = obj4;
        }
        oszArr[3] = new OSZ("invitation_id", obj3);
        oszArr[4] = new OSZ("extra_from_pre_page", this.previousPage);
        return new OSZ<>("//user/profile", C113554cx.LJJJLZIJ(oszArr));
    }
}

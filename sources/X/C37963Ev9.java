package X;

/* renamed from: X.Ev9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37963Ev9 {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(java.lang.String r11, org.json.JSONObject r12) {
        /*
            java.lang.String r0 = "from"
            kotlin.jvm.internal.o.LJIIJ(r11, r0)
            X.EvO r0 = X.C37876Etk.LJFF
            r10 = 0
            if (r0 == 0) goto L9a
            java.lang.String r2 = r0.LIZ()
        Le:
            if (r12 == 0) goto L9d
            java.lang.String r0 = "data"
            org.json.JSONObject r1 = r12.optJSONObject(r0)
            if (r1 == 0) goto L9d
            java.lang.String r0 = "packages"
            org.json.JSONObject r0 = r1.optJSONObject(r0)
            if (r0 == 0) goto L9d
            org.json.JSONArray r6 = r0.optJSONArray(r2)
            if (r6 == 0) goto L9d
            java.lang.String r0 = "BDXBridge"
            X.C37985EvV.LIZ(r0, r11, r6)
            r5 = 0
            if (r6 == 0) goto La4
            int r4 = r6.length()
            r3 = 0
        L33:
            if (r3 >= r4) goto La4
            if (r6 == 0) goto L97
            org.json.JSONObject r8 = r6.optJSONObject(r3)
            if (r8 == 0) goto L98
            java.lang.String r0 = "channel"
            java.lang.String r7 = r8.optString(r0)
        L43:
            java.lang.String r0 = "_jsb_auth"
            boolean r0 = kotlin.jvm.internal.o.LJ(r7, r0)
            if (r0 == 0) goto L53
            java.lang.String r0 = "DEFAULT"
            X.C37876Etk.LIZ(r0, r11, r8)
        L50:
            int r3 = r3 + 1
            goto L33
        L53:
            if (r7 == 0) goto L81
            java.lang.String r9 = "_jsb_auth."
            boolean r1 = ujb.o.LJJJLIIL(r7, r9, r5)
            r0 = 1
            if (r1 != r0) goto L81
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "find custom channel : "
            r1.append(r0)
            java.lang.String r2 = ""
            java.lang.String r0 = ujb.o.LJJJJZ(r7, r9, r2, r5)
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "msg"
            kotlin.jvm.internal.o.LJIIJ(r1, r0)
            java.lang.String r0 = ujb.o.LJJJJZ(r7, r9, r2, r5)
            X.C37876Etk.LIZ(r0, r11, r8)
            goto L50
        L81:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "find wrong channel: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "PermissionConfigRepository"
            X.C37887Etv.LIZIZ(r0, r1)
            goto L50
        L97:
            r8 = r10
        L98:
            r7 = r10
            goto L43
        L9a:
            r2 = r10
            goto Le
        L9d:
            java.lang.String r1 = "jsb_auth_parse_can_not_get_right_data"
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            X.C37985EvV.LIZIZ(r0, r1)
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37963Ev9.LIZ(java.lang.String, org.json.JSONObject):void");
    }
}

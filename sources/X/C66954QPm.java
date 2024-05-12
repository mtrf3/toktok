package X;

/* renamed from: X.QPm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66954QPm extends AbstractC67056QTk {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ C66953QPl LIZIZ;

    @Override // X.AbstractC67055QTj
    public final void onSuccess(QQI qqi) {
        try {
            this.LIZIZ.LJLIL = false;
            C66953QPl c66953QPl = this.LIZIZ;
            c66953QPl.LJLJLJ.sendEmptyMessageDelayed(1000, c66953QPl.LJLJJLL.LIZJ);
            if (this.LIZIZ.LJLLI) {
                this.LIZIZ.LJLLI = false;
                C66857QLt c66857QLt = this.LIZIZ.LJZI;
                if (c66857QLt != null) {
                    C66856QLs c66856QLs = new C66856QLs(c66857QLt.LIZ);
                    c66856QLs.LIZIZ.put("first_beat", Boolean.FALSE);
                    c66856QLs.LIZ();
                }
            }
        } catch (Exception e) {
            C38901fq.LJI(e);
        }
    }

    public C66954QPm(C66953QPl c66953QPl, String str) {
        this.LIZIZ = c66953QPl;
        this.LIZ = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0093 A[Catch: Exception -> 0x00b4, TryCatch #0 {Exception -> 0x00b4, blocks: (B:3:0x0004, B:5:0x000b, B:7:0x0015, B:9:0x001e, B:11:0x0024, B:13:0x0036, B:14:0x0040, B:15:0x007d, B:18:0x0085, B:20:0x0089, B:22:0x0093, B:23:0x00a6, B:27:0x004e, B:28:0x0053, B:30:0x005c, B:32:0x0070, B:33:0x0079), top: B:2:0x0004 }] */
    @Override // X.AbstractC67055QTj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onError(X.QQI r6, int r7) {
        /*
            r5 = this;
            X.QQK r6 = (X.QQK) r6
            java.lang.String r3 = "data"
            X.QPl r0 = r5.LIZIZ     // Catch: java.lang.Exception -> Lb4
            r2 = 0
            r0.LJLIL = r2     // Catch: java.lang.Exception -> Lb4
            if (r6 == 0) goto L51
            java.lang.String r1 = "session_expired"
            java.lang.String r0 = r6.LJIIIZ     // Catch: java.lang.Exception -> Lb4
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch: java.lang.Exception -> Lb4
            if (r0 == 0) goto L4e
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lb4
            r4.<init>()     // Catch: java.lang.Exception -> Lb4
            org.json.JSONObject r0 = r6.LJII     // Catch: java.lang.Exception -> Lb4
            if (r0 == 0) goto L40
            org.json.JSONObject r0 = r0.optJSONObject(r3)     // Catch: java.lang.Exception -> Lb4
            if (r0 == 0) goto L40
            org.json.JSONObject r0 = r6.LJII     // Catch: java.lang.Exception -> Lb4
            org.json.JSONObject r1 = r0.optJSONObject(r3)     // Catch: java.lang.Exception -> Lb4
            java.lang.String r0 = "log_id"
            java.lang.String r3 = r1.optString(r0)     // Catch: java.lang.Exception -> Lb4
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> Lb4
            if (r0 != 0) goto L40
            X.FBY r1 = new X.FBY     // Catch: java.lang.Exception -> Lb4
            java.lang.String r0 = "X-TT-LOGID"
            r1.<init>(r0, r3)     // Catch: java.lang.Exception -> Lb4
            r4.add(r1)     // Catch: java.lang.Exception -> Lb4
        L40:
            X.QPl r3 = r5.LIZIZ     // Catch: java.lang.Exception -> Lb4
            java.lang.String r1 = r5.LIZ     // Catch: java.lang.Exception -> Lb4
            X.QPv r0 = r3.LJLLJ     // Catch: java.lang.Exception -> Lb4
            X.QTW r0 = (X.QTW) r0     // Catch: java.lang.Exception -> Lb4
            boolean r0 = r0.LLIIIJ     // Catch: java.lang.Exception -> Lb4
            r3.LJ(r1, r4, r0)     // Catch: java.lang.Exception -> Lb4
            goto L7d
        L4e:
            java.lang.String r3 = r6.LJI     // Catch: java.lang.Exception -> Lb4
            goto L53
        L51:
            java.lang.String r3 = ""
        L53:
            X.C38901fq.LJIIIIZZ(r7, r3)     // Catch: java.lang.Exception -> Lb4
            X.QPl r0 = r5.LIZIZ     // Catch: java.lang.Exception -> Lb4
            org.json.JSONObject r0 = r0.LJZ     // Catch: java.lang.Exception -> Lb4
            if (r0 != 0) goto L79
            X.QPl r1 = r5.LIZIZ     // Catch: java.lang.Exception -> Lb4
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lb4
            r0.<init>()     // Catch: java.lang.Exception -> Lb4
            r1.LJZ = r0     // Catch: java.lang.Exception -> Lb4
            X.QPl r0 = r5.LIZIZ     // Catch: java.lang.Exception -> Lb4
            org.json.JSONObject r1 = r0.LJZ     // Catch: java.lang.Exception -> Lb4
            java.lang.String r0 = "error_code"
            r1.put(r0, r7)     // Catch: java.lang.Exception -> Lb4
            if (r3 == 0) goto L79
            X.QPl r0 = r5.LIZIZ     // Catch: java.lang.Exception -> Lb4
            org.json.JSONObject r1 = r0.LJZ     // Catch: java.lang.Exception -> Lb4
            java.lang.String r0 = "error_detail_msg"
            r1.put(r0, r3)     // Catch: java.lang.Exception -> Lb4
        L79:
            X.QPl r0 = r5.LIZIZ     // Catch: java.lang.Exception -> Lb4
            r0.LJLLLL = r2     // Catch: java.lang.Exception -> Lb4
        L7d:
            X.QPl r0 = r5.LIZIZ     // Catch: java.lang.Exception -> Lb4
            boolean r0 = r0.LJLLI     // Catch: java.lang.Exception -> Lb4
            if (r0 == 0) goto La6
            if (r6 == 0) goto La6
            org.json.JSONObject r0 = r6.LJII     // Catch: java.lang.Exception -> Lb4
            if (r0 == 0) goto La6
            X.QPl r0 = r5.LIZIZ     // Catch: java.lang.Exception -> Lb4
            r0.LJLLI = r2     // Catch: java.lang.Exception -> Lb4
            X.QPl r0 = r5.LIZIZ     // Catch: java.lang.Exception -> Lb4
            X.QLt r0 = r0.LJZI     // Catch: java.lang.Exception -> Lb4
            if (r0 == 0) goto La6
            X.QLs r3 = new X.QLs     // Catch: java.lang.Exception -> Lb4
            android.content.Context r0 = r0.LIZ     // Catch: java.lang.Exception -> Lb4
            r3.<init>(r0)     // Catch: java.lang.Exception -> Lb4
            android.content.ContentValues r2 = r3.LIZIZ     // Catch: java.lang.Exception -> Lb4
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> Lb4
            java.lang.String r0 = "first_beat"
            r2.put(r0, r1)     // Catch: java.lang.Exception -> Lb4
            r3.LIZ()     // Catch: java.lang.Exception -> Lb4
        La6:
            X.QPl r0 = r5.LIZIZ     // Catch: java.lang.Exception -> Lb4
            com.bytedance.common.utility.collection.WeakHandler r3 = r0.LJLJLJ     // Catch: java.lang.Exception -> Lb4
            X.FX7 r0 = r0.LJLJJLL     // Catch: java.lang.Exception -> Lb4
            long r1 = r0.LIZJ     // Catch: java.lang.Exception -> Lb4
            r0 = 1000(0x3e8, float:1.401E-42)
            r3.sendEmptyMessageDelayed(r0, r1)     // Catch: java.lang.Exception -> Lb4
            goto Lb8
        Lb4:
            r0 = move-exception
            X.C38901fq.LJI(r0)
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66954QPm.onError(X.QQI, int):void");
    }
}

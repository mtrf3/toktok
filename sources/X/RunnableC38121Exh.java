package X;

import com.bytedance.ies.web.jsbridge2.TimeLineEvent;

/* renamed from: X.Exh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC38121Exh implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ InterfaceC38149Ey9 LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ TimeLineEvent LJLJJI;
    public final /* synthetic */ AbstractC38114Exa LJLJJL;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x001d, code lost:
    
        if (r4 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r11 = this;
            X.Exa r0 = r11.LJLJJL
            boolean r0 = r0.LJFF
            if (r0 == 0) goto L7
            return
        L7:
            X.Exa r2 = r11.LJLJJL     // Catch: org.json.JSONException -> L29
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L29
            java.lang.String r0 = r11.LJLIL     // Catch: org.json.JSONException -> L29
            r1.<init>(r0)     // Catch: org.json.JSONException -> L29
            X.Ey9 r0 = r11.LJLILLLLZI     // Catch: org.json.JSONException -> L29
            X.Exd r4 = r2.LIZIZ(r1)     // Catch: org.json.JSONException -> L29
            r4.LJIILIIL = r0     // Catch: org.json.JSONException -> L29
            java.lang.String r0 = r11.LJLJI     // Catch: org.json.JSONException -> L1d
            r4.LJIILJJIL = r0     // Catch: org.json.JSONException -> L1d
            goto L1f
        L1d:
            if (r4 == 0) goto L2a
        L1f:
            java.util.List<com.bytedance.ies.web.jsbridge2.TimeLineEvent> r1 = r4.LJIIL
            com.bytedance.ies.web.jsbridge2.TimeLineEvent r0 = r11.LJLJJI
            java.util.concurrent.CopyOnWriteArrayList r1 = (java.util.concurrent.CopyOnWriteArrayList) r1
            r1.add(r0)
            goto L2a
        L29:
            r4 = 0
        L2a:
            boolean r0 = X.C38117Exd.LIZ(r4)
            if (r0 == 0) goto L77
            java.util.Objects.toString(r4)
            if (r4 == 0) goto L76
            X.Eyj r2 = new X.Eyj
            r2.<init>()
            java.lang.String r1 = "value"
            java.lang.String r0 = r11.LJLIL
            r2.LIZJ(r0, r1)
            java.lang.String r1 = "reason"
            java.lang.String r0 = "call_invalid_1"
            r2.LIZJ(r0, r1)
            java.util.List<com.bytedance.ies.web.jsbridge2.TimeLineEvent> r1 = r4.LJIIL
            java.lang.String r0 = "label_abstract_bridge_reject"
            r2.LIZ(r0, r1)
            X.Exa r5 = r11.LJLJJL
            java.lang.String r7 = r5.LJI()
            java.lang.String r8 = r4.LIZLLL
            r6 = 3
            java.lang.String r9 = "call_invalid_1"
            java.util.List<com.bytedance.ies.web.jsbridge2.TimeLineEvent> r10 = r4.LJIIL
            r5.LIZ(r6, r7, r8, r9, r10)
            X.Exa r3 = r11.LJLJJL
            X.Exy r2 = new X.Exy
            int r1 = r4.LIZ
            java.lang.String r0 = "Failed to parse invocation."
            r2.<init>(r1, r0)
            java.lang.String r0 = X.C79081V1x.LJIILIIL(r2)
            r3.LIZJ(r0, r4)
            X.Exa r0 = r11.LJLJJL
            r0.LJIILJJIL(r4)
        L76:
            return
        L77:
            X.Exa r0 = r11.LJLJJL
            r0.LJII(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC38121Exh.LIZ():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC38121Exh(C38115Exb c38115Exb, String str, C38124Exk c38124Exk, String str2, TimeLineEvent timeLineEvent) {
        this.LJLJJL = c38115Exb;
        this.LJLIL = str;
        this.LJLILLLLZI = c38124Exk;
        this.LJLJI = str2;
        this.LJLJJI = timeLineEvent;
    }
}

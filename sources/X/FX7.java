package X;

import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes7.dex */
public final class FX7 {
    public final String LIZ;
    public final java.util.Set<String> LIZIZ = new CopyOnWriteArraySet();
    public long LIZJ = 600000;

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FX7() {
        /*
            r4 = this;
            r4.<init>()
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            r4.LIZIZ = r0
            r0 = 600000(0x927c0, double:2.964394E-318)
            r4.LIZJ = r0
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "https://"
            r1.append(r0)
            X.FX5 r0 = X.C66960QPs.LIZ()
            r0.getClass()
            java.lang.String r0 = "api-va.tiktokv.com"
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            r4.LIZ = r1
            java.lang.String r2 = ""
            java.net.URI r0 = new java.net.URI     // Catch: java.lang.Exception -> L4f
            r0.<init>(r1)     // Catch: java.lang.Exception -> L4f
            java.lang.String r0 = r0.getHost()     // Catch: java.lang.Exception -> L4f
            java.lang.String r2 = r0.toLowerCase()     // Catch: java.lang.Exception -> L4f
            java.lang.String r0 = "[^\\.]+(\\.com|\\.net|\\.org|\\.cc|\\.me|\\.tel|\\.mobi|\\.asia|\\.biz|\\.info|\\.name|\\.tv|\\.app|\\.edu)"
            java.util.regex.Pattern r0 = com.bytedance.mt.protector.impl.PatternProtector.compile(r0)     // Catch: java.lang.Exception -> L4f
            java.util.regex.Matcher r1 = r0.matcher(r2)     // Catch: java.lang.Exception -> L4f
            boolean r0 = r1.find()     // Catch: java.lang.Exception -> L4f
            if (r0 == 0) goto L53
            java.lang.String r1 = r1.group()     // Catch: java.lang.Exception -> L4f
            goto L88
        L4f:
            r0 = move-exception
            X.C38901fq.LJI(r0)
        L53:
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L83
            if (r0 != 0) goto L91
            java.lang.String r0 = "\\."
            java.lang.String[] r3 = r2.split(r0)     // Catch: java.lang.Exception -> L83
            if (r3 == 0) goto L91
            int r0 = r3.length     // Catch: java.lang.Exception -> L83
            r2 = 1
            if (r0 <= r2) goto L91
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L83
            r1.<init>()     // Catch: java.lang.Exception -> L83
            int r0 = r3.length     // Catch: java.lang.Exception -> L83
            int r0 = r0 + (-2)
            r0 = r3[r0]     // Catch: java.lang.Exception -> L83
            r1.append(r0)     // Catch: java.lang.Exception -> L83
            java.lang.String r0 = "."
            r1.append(r0)     // Catch: java.lang.Exception -> L83
            int r0 = r3.length     // Catch: java.lang.Exception -> L83
            int r0 = r0 - r2
            r0 = r3[r0]     // Catch: java.lang.Exception -> L83
            r1.append(r0)     // Catch: java.lang.Exception -> L83
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L83
            goto L88
        L83:
            r0 = move-exception
            X.C38901fq.LJI(r0)
            goto L91
        L88:
            if (r1 == 0) goto L91
            java.util.Set<java.lang.String> r0 = r4.LIZIZ
            java.util.concurrent.CopyOnWriteArraySet r0 = (java.util.concurrent.CopyOnWriteArraySet) r0
            r0.add(r1)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FX7.<init>():void");
    }
}

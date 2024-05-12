package X;

import android.content.Context;
import java.util.Properties;
import org.json.JSONObject;

/* renamed from: X.FeT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39477FeT {
    public static C39477FeT LIZLLL;
    public final Context LIZ;
    public Properties LIZIZ;
    public final JSONObject LIZJ;

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x001c A[Catch: all -> 0x0031, TryCatch #1 {all -> 0x0031, blocks: (B:8:0x0011, B:19:0x001c), top: B:7:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C39477FeT(android.content.Context r5) {
        /*
            r4 = this;
            r4.<init>()
            r4.LIZ = r5
            r3 = 0
            android.content.pm.ApplicationInfo r0 = r5.getApplicationInfo()     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto Ld
            goto L10
        Ld:
            java.lang.String r0 = r0.sourceDir     // Catch: java.lang.Throwable -> L10
            goto L11
        L10:
            r0 = r3
        L11:
            java.lang.String r2 = X.C64065PCj.LIZIZ(r0)     // Catch: java.lang.Throwable -> L31
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L1c
            goto L31
        L1c:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L31
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = "meta_channel"
            java.lang.String r0 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r1, r0)     // Catch: java.lang.Throwable -> L31
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L31
            r0 = r0 ^ 1
            if (r0 != 0) goto L30
            goto L31
        L30:
            r3 = r1
        L31:
            r4.LIZJ = r3     // Catch: java.lang.Exception -> L34
            goto L38
        L34:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39477FeT.<init>(android.content.Context):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0016 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0010 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZ(java.lang.String r5) {
        /*
            r4 = this;
            org.json.JSONObject r0 = r4.LIZJ     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto L9
            java.lang.Object r3 = r0.get(r5)     // Catch: java.lang.Throwable -> L9
            goto La
        L9:
            r3 = 0
        La:
            if (r3 == 0) goto L16
        Lc:
            boolean r0 = r3 instanceof java.lang.String
            if (r0 != 0) goto L13
            java.lang.String r3 = ""
        L12:
            return r3
        L13:
            java.lang.String r3 = (java.lang.String) r3
            goto L12
        L16:
            java.util.Properties r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto L35
            java.util.Properties r2 = new java.util.Properties     // Catch: java.lang.Throwable -> Lc
            r2.<init>()     // Catch: java.lang.Throwable -> Lc
            r4.LIZIZ = r2     // Catch: java.lang.Throwable -> Lc
            android.content.Context r0 = r4.LIZ     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> L31
            android.content.res.AssetManager r1 = r0.getAssets()     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> L31
            java.lang.String r0 = "ss.properties"
            java.io.InputStream r0 = r1.open(r0)     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> L31
            r2.load(r0)     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> L31
            goto L35
        L31:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Throwable -> Lc
        L35:
            java.util.Properties r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Lc
            boolean r0 = r0.containsKey(r5)     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Lc
            java.util.Properties r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> Lc
            kotlin.jvm.internal.o.LJI(r0)     // Catch: java.lang.Throwable -> Lc
            java.lang.Object r3 = r0.get(r5)     // Catch: java.lang.Throwable -> Lc
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39477FeT.LIZ(java.lang.String):java.lang.String");
    }
}

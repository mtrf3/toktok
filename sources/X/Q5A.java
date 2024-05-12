package X;

import Y.ARunnableS6S0001000_11;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import m43.u;

/* loaded from: classes12.dex */
public final class Q5A {
    public static final Q5A LIZ;
    public static final List<Q5J> LIZIZ;
    public static final List<Q5J> LIZJ;
    public static final java.util.Map<String, List<Q5J>> LIZLLL;
    public static final AtomicBoolean LJ;
    public static final Integer[] LJFF;

    public static Cursor LIZIZ(ContentResolver contentResolver, android.net.Uri uri, String[] strArr) {
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, strArr, null, null, null}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "4393493248822291462"));
        return LIZJ2.LIZ ? (Cursor) LIZJ2.LIZIZ : contentResolver.query(uri, strArr, null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q5A.<clinit>():void");
    }

    public static final int LJIIL() {
        if (C40700FyC.LIZ(Q5A.class)) {
            return 0;
        }
        try {
            return LJFF[0].intValue();
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static final void LJIIZILJ() {
        if (C40700FyC.LIZ(Q5A.class)) {
            return;
        }
        try {
            if (!LJ.compareAndSet(false, true)) {
                return;
            }
            u.LJ().execute(new ARunnableS6S0001000_11(2, 0));
        } catch (Throwable unused) {
        }
    }

    public final List<Q5J> LIZ() {
        if (C40700FyC.LIZ(this)) {
            return null;
        }
        try {
            return C47261Igj.LJII(new Q5Z(), new C66434Q5m());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final Bundle LIZLLL(Q4W q4w) {
        if (C40700FyC.LIZ(Q5A.class) || q4w == null) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("error_description", q4w.toString());
            if (q4w instanceof C66406Q4k) {
                bundle.putString("error_type", "UserCanceled");
            }
            return bundle;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[LOOP:0: B:7:0x0015->B:17:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.content.Intent LJFF(android.content.Context r5) {
        /*
            java.lang.Class<X.Q5A> r0 = X.Q5A.class
            boolean r0 = X.C40700FyC.LIZ(r0)
            r4 = 0
            if (r0 == 0) goto La
            return r4
        La:
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)     // Catch: java.lang.Throwable -> L63
            java.util.List<X.Q5J> r0 = X.Q5A.LIZIZ     // Catch: java.lang.Throwable -> L63
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L63
        L15:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L62
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L63
            X.Q5J r2 = (X.Q5J) r2     // Catch: java.lang.Throwable -> L63
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = "com.facebook.platform.PLATFORM_SERVICE"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = r2.LIZJ()     // Catch: java.lang.Throwable -> L63
            android.content.Intent r1 = r1.setPackage(r0)     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = "android.intent.category.DEFAULT"
            android.content.Intent r2 = r1.addCategory(r0)     // Catch: java.lang.Throwable -> L63
            java.lang.Class<X.Q5A> r0 = X.Q5A.class
            boolean r0 = X.C40700FyC.LIZ(r0)     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L3f
            goto L41
        L3f:
            if (r2 != 0) goto L45
        L41:
            r2 = r4
        L42:
            if (r2 == 0) goto L15
            return r2
        L45:
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L41
            r0 = 0
            android.content.pm.ResolveInfo r0 = r1.resolveService(r2, r0)     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L51
            goto L41
        L51:
            android.content.pm.ServiceInfo r0 = r0.serviceInfo     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = r0.packageName     // Catch: java.lang.Throwable -> L41
            java.lang.String r0 = "resolveInfo.serviceInfo.packageName"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Throwable -> L41
            boolean r0 = X.C39242Fag.LIZ(r5, r1)     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L42
            goto L41
        L62:
            return r4
        L63:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q5A.LJFF(android.content.Context):android.content.Intent");
    }

    public static final Bundle LJIIIIZZ(Intent intent) {
        Bundle bundle = null;
        if (C40700FyC.LIZ(Q5A.class)) {
            return null;
        }
        try {
            o.LJIIIZ(intent, "intent");
            if (!LJIILL(LJIILJJIL(intent))) {
                return null;
            }
            bundle = C16880lQ.LJJLIIIIJ(intent, "com.facebook.platform.protocol.BRIDGE_ARGS");
            return bundle;
        } catch (Throwable unused) {
            return bundle;
        }
    }

    public static final UUID LJIIIZ(Intent intent) {
        String LLJJIJIIJIL;
        if (C40700FyC.LIZ(Q5A.class) || intent == null) {
            return null;
        }
        try {
            if (LJIILL(LJIILJJIL(intent))) {
                Bundle LJJLIIIIJ = C16880lQ.LJJLIIIIJ(intent, "com.facebook.platform.protocol.BRIDGE_ARGS");
                if (LJJLIIIIJ != null) {
                    LLJJIJIIJIL = LJJLIIIIJ.getString("action_id");
                } else {
                    LLJJIJIIJIL = null;
                }
            } else {
                LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "com.facebook.platform.protocol.CALL_ID");
            }
            if (LLJJIJIIJIL == null) {
                return null;
            }
            try {
                return UUID.fromString(LLJJIJIIJIL);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static final Q4W LJIIJ(Bundle bundle) {
        if (C40700FyC.LIZ(Q5A.class) || bundle == null) {
            return null;
        }
        try {
            String string = bundle.getString("error_type");
            if (string == null) {
                string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
            }
            String string2 = bundle.getString("error_description");
            if (string2 == null) {
                string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
            }
            if (string != null && ujb.o.LJJJJIZL(string, "UserCanceled", true)) {
                return new C66406Q4k(string2);
            }
            return new Q4W(string2);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final Bundle LJIILIIL(Intent intent) {
        if (C40700FyC.LIZ(Q5A.class)) {
            return null;
        }
        try {
            if (!LJIILL(LJIILJJIL(intent))) {
                return C16880lQ.LLJJIJI(intent);
            }
            return C16880lQ.LJJLIIIIJ(intent, "com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final int LJIILJJIL(Intent intent) {
        if (C40700FyC.LIZ(Q5A.class)) {
            return 0;
        }
        try {
            o.LJIIIZ(intent, "intent");
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static final boolean LJIILL(int i) {
        if (C40700FyC.LIZ(Q5A.class)) {
            return false;
        }
        try {
            if (!ORY.LJJIJIIJIL(Integer.valueOf(i), LJFF) || i < 20140701) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:5|6|(1:8)(9:38|39|10|11|12|13|(3:19|20|(2:(3:25|22|23)|26))(1:15)|(1:18)|17)|9|10|11|12|13|(0)(0)|(0)|17) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005f, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084 A[Catch: all -> 0x0093, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0093, blocks: (B:6:0x000b, B:30:0x008f, B:31:0x0092, B:18:0x0084), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.TreeSet<java.lang.Integer> LJII(X.Q5J r10) {
        /*
            r9 = this;
            java.lang.String r5 = "version"
            boolean r0 = X.C40700FyC.LIZ(r9)
            r8 = 0
            if (r0 == 0) goto Lb
            return r8
        Lb:
            java.util.TreeSet r4 = new java.util.TreeSet     // Catch: java.lang.Throwable -> L93
            r4.<init>()     // Catch: java.lang.Throwable -> L93
            android.content.Context r0 = m43.u.LIZJ()     // Catch: java.lang.Throwable -> L93
            android.content.ContentResolver r7 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L93
            java.lang.String[] r6 = new java.lang.String[]{r5}     // Catch: java.lang.Throwable -> L93
            boolean r0 = X.C40700FyC.LIZ(r9)     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L23
            goto L46
        L23:
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L46
            java.lang.String r0 = "content://"
            r1.append(r0)     // Catch: java.lang.Throwable -> L46
            java.lang.String r0 = r10.LIZJ()     // Catch: java.lang.Throwable -> L46
            r1.append(r0)     // Catch: java.lang.Throwable -> L46
            java.lang.String r0 = ".provider.PlatformProvider/versions"
            r1.append(r0)     // Catch: java.lang.Throwable -> L46
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L46
            android.net.Uri r3 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> L46
            java.lang.String r0 = "parse(CONTENT_SCHEME + appInfo.getPackage() + PLATFORM_PROVIDER_VERSIONS)"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)     // Catch: java.lang.Throwable -> L46
            goto L47
        L46:
            r3 = r8
        L47:
            android.content.Context r0 = m43.u.LIZJ()     // Catch: java.lang.Throwable -> L88
            android.content.pm.PackageManager r2 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L88
            java.lang.String r1 = r10.LIZJ()     // Catch: java.lang.Throwable -> L88
            java.lang.String r0 = ".provider.PlatformProvider"
            java.lang.String r1 = kotlin.jvm.internal.o.LJIILLIIL(r0, r1)     // Catch: java.lang.Throwable -> L88
            r0 = 0
            android.content.pm.ProviderInfo r0 = r2.resolveContentProvider(r1, r0)     // Catch: java.lang.RuntimeException -> L5f java.lang.Throwable -> L88
            goto L60
        L5f:
            r0 = r8
        L60:
            if (r0 == 0) goto L80
            android.database.Cursor r1 = LIZIZ(r7, r3, r6)     // Catch: java.lang.Throwable -> L67 java.lang.Throwable -> L88
            goto L68
        L67:
            r1 = r8
        L68:
            if (r1 == 0) goto L81
        L6a:
            boolean r0 = r1.moveToNext()     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L81
            int r0 = r1.getColumnIndex(r5)     // Catch: java.lang.Throwable -> L8b
            int r0 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L8b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L8b
            r4.add(r0)     // Catch: java.lang.Throwable -> L8b
            goto L6a
        L80:
            r1 = r8
        L81:
            if (r1 != 0) goto L84
        L83:
            return r4
        L84:
            r1.close()     // Catch: java.lang.Throwable -> L93
            goto L83
        L88:
            r0 = move-exception
            r1 = r8
            goto L8c
        L8b:
            r0 = move-exception
        L8c:
            if (r1 != 0) goto L8f
            goto L92
        L8f:
            r1.close()     // Catch: java.lang.Throwable -> L93
        L92:
            throw r0     // Catch: java.lang.Throwable -> L93
        L93:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q5A.LJII(X.Q5J):java.util.TreeSet");
    }

    public static final Intent LJIJ(Context context, Intent intent) {
        if (C40700FyC.LIZ(Q5A.class) || intent == null) {
            return null;
        }
        try {
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 0);
            if (resolveActivity == null) {
                return null;
            }
            String str = resolveActivity.activityInfo.packageName;
            o.LJIIIIZZ(str, "resolveInfo.activityInfo.packageName");
            if (!C39242Fag.LIZ(context, str)) {
                return null;
            }
            return intent;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final C66432Q5k LJIIJJI(List<? extends Q5J> list, int[] iArr) {
        if (C40700FyC.LIZ(this)) {
            return null;
        }
        try {
            LJIIZILJ();
            if (list == null) {
                C66432Q5k c66432Q5k = new C66432Q5k();
                c66432Q5k.LIZIZ = -1;
                return c66432Q5k;
            }
            for (Q5J q5j : list) {
                TreeSet<Integer> treeSet = q5j.LIZ;
                if (treeSet == null || !o.LJ(Boolean.valueOf(treeSet.isEmpty()), Boolean.FALSE)) {
                    q5j.LIZ(false);
                }
                int LIZJ2 = LIZJ(q5j.LIZ, LJIIL(), iArr);
                if (LIZJ2 != -1) {
                    C66432Q5k c66432Q5k2 = new C66432Q5k();
                    c66432Q5k2.LIZ = q5j;
                    c66432Q5k2.LIZIZ = LIZJ2;
                    return c66432Q5k2;
                }
            }
            C66432Q5k c66432Q5k3 = new C66432Q5k();
            c66432Q5k3.LIZIZ = -1;
            return c66432Q5k3;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final int LIZJ(TreeSet<Integer> treeSet, int i, int[] iArr) {
        if (C40700FyC.LIZ(Q5A.class)) {
            return 0;
        }
        if (treeSet == null) {
            return -1;
        }
        try {
            int length = iArr.length - 1;
            Iterator<Integer> descendingIterator = treeSet.descendingIterator();
            int i2 = -1;
            while (descendingIterator.hasNext()) {
                Integer fbAppVersion = descendingIterator.next();
                o.LJIIIIZZ(fbAppVersion, "fbAppVersion");
                i2 = Math.max(i2, fbAppVersion.intValue());
                while (length >= 0) {
                    if (iArr[length] > fbAppVersion.intValue()) {
                        length--;
                    } else if (iArr[length] == fbAppVersion.intValue()) {
                        if (length % 2 != 0) {
                            return -1;
                        }
                        return Math.min(i2, i);
                    }
                }
                return -1;
            }
            return -1;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static final Intent LJI(Intent intent, Bundle bundle, Q4W q4w) {
        if (C40700FyC.LIZ(Q5A.class)) {
            return null;
        }
        try {
            UUID LJIIIZ = LJIIIZ(intent);
            if (LJIIIZ == null) {
                return null;
            }
            Intent intent2 = new Intent();
            intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", LJIILJJIL(intent));
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", LJIIIZ.toString());
            if (q4w != null) {
                bundle2.putBundle("error", LIZLLL(q4w));
            }
            intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
            if (bundle != null) {
                intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
            }
            return intent2;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final void LJIILLIIL(Intent intent, String str, String str2, int i, Bundle bundle) {
        if (C40700FyC.LIZ(Q5A.class)) {
            return;
        }
        try {
            String LIZLLL2 = u.LIZLLL();
            Q4J.LJI();
            String str3 = u.LIZLLL;
            intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", i).putExtra("com.facebook.platform.protocol.PROTOCOL_ACTION", str2).putExtra("com.facebook.platform.extra.APPLICATION_ID", LIZLLL2);
            if (LJIILL(i)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("action_id", str);
                C66373Q3d.LJJII("app_name", str3, bundle2);
                intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
                if (bundle == null) {
                    bundle = new Bundle();
                }
                intent.putExtra("com.facebook.platform.protocol.METHOD_ARGS", bundle);
                return;
            }
            intent.putExtra("com.facebook.platform.protocol.CALL_ID", str);
            if (!C66373Q3d.LJIJJ(str3)) {
                intent.putExtra("com.facebook.platform.extra.APPLICATION_NAME", str3);
            }
            if (bundle != null) {
                intent.putExtras(bundle);
            }
        } catch (Throwable unused) {
        }
    }

    public final Intent LJ(Q5J q5j, String str, Collection collection, String str2, boolean z, Q5V q5v, String str3, String str4, boolean z2, String str5, boolean z3, Q5I q5i, boolean z4, boolean z5, String str6) {
        boolean z6;
        if (C40700FyC.LIZ(this)) {
            return null;
        }
        try {
            String LIZIZ2 = q5j.LIZIZ();
            if (LIZIZ2 == null) {
                return null;
            }
            Intent putExtra = new Intent().setClassName(q5j.LIZJ(), LIZIZ2).putExtra("client_id", str);
            o.LJIIIIZZ(putExtra, "Intent()\n            .setClassName(appInfo.getPackage(), activityName)\n            .putExtra(FACEBOOK_PROXY_AUTH_APP_ID_KEY, applicationId)");
            C16880lQ.LLILII();
            putExtra.putExtra("facebook_sdk_version", "13.1.0");
            if (!collection.isEmpty()) {
                z6 = false;
            } else {
                z6 = true;
            }
            if (!z6) {
                putExtra.putExtra("scope", TextUtils.join(",", collection));
            }
            if (!C66373Q3d.LJIJJ(str2)) {
                putExtra.putExtra("e2e", str2);
            }
            putExtra.putExtra("state", str3);
            putExtra.putExtra("response_type", q5j.LIZLLL());
            putExtra.putExtra("nonce", str6);
            putExtra.putExtra("return_scopes", "true");
            if (z) {
                putExtra.putExtra("default_audience", q5v.getNativeProtocolAudience());
            }
            putExtra.putExtra("legacy_override", C16880lQ.LLIL());
            putExtra.putExtra("auth_type", str4);
            if (z2) {
                putExtra.putExtra("fail_on_logged_out", true);
            }
            putExtra.putExtra("messenger_page_id", str5);
            putExtra.putExtra("reset_messenger_state", z3);
            if (z4) {
                putExtra.putExtra("fx_app", q5i.toString());
            }
            if (z5) {
                putExtra.putExtra("skip_dedupe", true);
            }
            return putExtra;
        } catch (Throwable unused) {
            return null;
        }
    }
}

package X;

import android.text.TextUtils;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class EAC {
    public static final EAC LIZ = new EAC();
    public static final CopyOnWriteArrayList<String> LIZIZ = new CopyOnWriteArrayList<>();
    public static final CopyOnWriteArrayList<String> LIZJ = new CopyOnWriteArrayList<>();

    /* JADX WARN: Removed duplicated region for block: B:14:0x0063 A[Catch: all -> 0x008d, TryCatch #3 {all -> 0x008d, blocks: (B:4:0x0020, B:7:0x0028, B:9:0x002c, B:14:0x0063, B:16:0x006b, B:18:0x0071, B:20:0x0077, B:21:0x007c, B:23:0x0082, B:25:0x0088, B:31:0x0069, B:35:0x0055, B:37:0x005b, B:34:0x004e, B:42:0x0032, B:45:0x0019, B:3:0x0003, B:12:0x0034, B:39:0x0046), top: B:2:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071 A[Catch: all -> 0x008d, TryCatch #3 {all -> 0x008d, blocks: (B:4:0x0020, B:7:0x0028, B:9:0x002c, B:14:0x0063, B:16:0x006b, B:18:0x0071, B:20:0x0077, B:21:0x007c, B:23:0x0082, B:25:0x0088, B:31:0x0069, B:35:0x0055, B:37:0x005b, B:34:0x004e, B:42:0x0032, B:45:0x0019, B:3:0x0003, B:12:0x0034, B:39:0x0046), top: B:2:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082 A[Catch: all -> 0x008d, TryCatch #3 {all -> 0x008d, blocks: (B:4:0x0020, B:7:0x0028, B:9:0x002c, B:14:0x0063, B:16:0x006b, B:18:0x0071, B:20:0x0077, B:21:0x007c, B:23:0x0082, B:25:0x0088, B:31:0x0069, B:35:0x0055, B:37:0x005b, B:34:0x004e, B:42:0x0032, B:45:0x0019, B:3:0x0003, B:12:0x0034, B:39:0x0046), top: B:2:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EAC() {
        /*
            r5 = this;
            r5.<init>()
            com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "ttnet_intercept_webview_block_list"
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            r2.getClass()     // Catch: java.lang.Throwable -> L18
            java.lang.Object r1 = com.bytedance.ies.abmock.SettingsManager.LJII(r1, r0)     // Catch: java.lang.Throwable -> L18
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch: java.lang.Throwable -> L18
            X.C3C5.m7constructorimpl(r1)     // Catch: java.lang.Throwable -> L18
            goto L20
        L18:
            r0 = move-exception
            X.3C4 r1 = X.C141335gf.LIZ(r0)     // Catch: java.lang.Throwable -> L8d
            X.C3C5.m7constructorimpl(r1)     // Catch: java.lang.Throwable -> L8d
        L20:
            boolean r0 = X.C3C5.m12isFailureimpl(r1)     // Catch: java.lang.Throwable -> L8d
            r4 = 0
            if (r0 == 0) goto L28
            r1 = r4
        L28:
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch: java.lang.Throwable -> L8d
            if (r1 == 0) goto L32
            java.util.List r3 = X.ORY.LJJZZIII(r1)     // Catch: java.lang.Throwable -> L8d
            if (r3 != 0) goto L34
        L32:
            X.OQg r3 = X.C61878OQg.INSTANCE     // Catch: java.lang.Throwable -> L8d
        L34:
            com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L4a
            java.lang.String r1 = "ttnet_intercept_webview_allow_list"
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            r2.getClass()     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L4a
            java.lang.Object r0 = com.bytedance.ies.abmock.SettingsManager.LJII(r1, r0)     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L4a
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L4a
            goto L61
        L46:
            X.C3C5.m7constructorimpl(r4)     // Catch: java.lang.Throwable -> L4a
            goto L4c
        L4a:
            r0 = move-exception
            goto L4e
        L4c:
            r1 = r4
            goto L55
        L4e:
            X.3C4 r1 = X.C141335gf.LIZ(r0)     // Catch: java.lang.Throwable -> L8d
            X.C3C5.m7constructorimpl(r1)     // Catch: java.lang.Throwable -> L8d
        L55:
            boolean r0 = X.C3C5.m12isFailureimpl(r1)     // Catch: java.lang.Throwable -> L8d
            if (r0 == 0) goto L5f
        L5b:
            r0 = r4
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch: java.lang.Throwable -> L8d
            goto L61
        L5f:
            r4 = r1
            goto L5b
        L61:
            if (r0 == 0) goto L69
            java.util.List r1 = X.ORY.LJJZZIII(r0)     // Catch: java.lang.Throwable -> L8d
            if (r1 != 0) goto L6b
        L69:
            X.OQg r1 = X.C61878OQg.INSTANCE     // Catch: java.lang.Throwable -> L8d
        L6b:
            boolean r0 = X.C38891fp.LJJI(r1)     // Catch: java.lang.Throwable -> L8d
            if (r0 != 0) goto L7c
            boolean r0 = X.C38891fp.LJJI(r1)     // Catch: java.lang.Throwable -> L8d
            if (r0 != 0) goto L7c
            java.util.concurrent.CopyOnWriteArrayList<java.lang.String> r0 = X.EAC.LIZIZ     // Catch: java.lang.Throwable -> L8d
            r0.addAll(r1)     // Catch: java.lang.Throwable -> L8d
        L7c:
            boolean r0 = X.C38891fp.LJJI(r3)     // Catch: java.lang.Throwable -> L8d
            if (r0 != 0) goto L8d
            boolean r0 = X.C38891fp.LJJI(r3)     // Catch: java.lang.Throwable -> L8d
            if (r0 != 0) goto L8d
            java.util.concurrent.CopyOnWriteArrayList<java.lang.String> r0 = X.EAC.LIZJ     // Catch: java.lang.Throwable -> L8d
            r0.addAll(r3)     // Catch: java.lang.Throwable -> L8d
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EAC.<init>():void");
    }

    public static boolean LIZ(String ref) {
        o.LJIIIZ(ref, "ref");
        if (TextUtils.isEmpty(ref)) {
            return false;
        }
        if (!s.LJJJLZIJ(ref, "https", false) && !s.LJJJLZIJ(ref, "http", false)) {
            return false;
        }
        return true;
    }
}

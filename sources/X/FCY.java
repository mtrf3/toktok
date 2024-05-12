package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.router.SmartRouter;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FCY {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(android.net.Uri uri) {
        if (uri == null) {
            return false;
        }
        String host = uri.getHost();
        String path = uri.getPath();
        if (!o.LJ(host, "ec") || !o.LJ(path, "/lynxview")) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(android.net.Uri uri) {
        if (uri == null) {
            return false;
        }
        String host = uri.getHost();
        String path = uri.getPath();
        if (!o.LJ(host, "ec") || !o.LJ(path, "/webview")) {
            return false;
        }
        return true;
    }

    public static void LIZLLL(Context context, android.net.Uri uri) {
        try {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.scheme("aweme");
            String uri2 = buildUpon.build().toString();
            o.LJIIIIZZ(uri2, "uriBuilder.build().toString()");
            SmartRouter.buildRoute(context, uri2).open();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x01d7: INVOKE 
      (r11v1 ?? I:Y.ARunnableS5S0310000_6)
      (r12 I:java.lang.Object)
      (r13 I:java.lang.Object)
      (r14 I:java.lang.Object)
      (r15 I:boolean)
      (r16 I:int)
     DIRECT call: Y.ARunnableS5S0310000_6.<init>(java.lang.Object, java.lang.Object, java.lang.Object, boolean, int):void A[Catch: all -> 0x01e7, MD:(java.lang.Object, java.lang.Object, java.lang.Object, boolean, int):void (m)] (LINE:50332119), block:B:127:0x01cf */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x01e4: INVOKE (r12 I:android.net.Uri), (r1 I:boolean), (r0 I:java.lang.String), (r15 I:boolean) STATIC call: X.FCa.LIZ(android.net.Uri, boolean, java.lang.String, boolean):void A[Catch: all -> 0x01e7, MD:(android.net.Uri, boolean, java.lang.String, boolean):void (m), TRY_LEAVE] (LINE:50332132), block:B:131:0x01de */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x01f8: INVOKE 
      (r11v0 ?? I:Y.ARunnableS5S0310000_6)
      (r12 I:java.lang.Object)
      (r13 I:java.lang.Object)
      (r14 I:java.lang.Object)
      (r15 I:boolean)
      (r16 I:int)
     DIRECT call: Y.ARunnableS5S0310000_6.<init>(java.lang.Object, java.lang.Object, java.lang.Object, boolean, int):void A[Catch: all -> 0x0208, MD:(java.lang.Object, java.lang.Object, java.lang.Object, boolean, int):void (m)] (LINE:50332152), block:B:139:0x01f0 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x0205: INVOKE (r12 I:android.net.Uri), (r1 I:boolean), (r0 I:java.lang.String), (r15 I:boolean) STATIC call: X.FCa.LIZ(android.net.Uri, boolean, java.lang.String, boolean):void A[Catch: all -> 0x0208, MD:(android.net.Uri, boolean, java.lang.String, boolean):void (m), TRY_LEAVE] (LINE:50332165), block:B:143:0x01ff */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d A[EDGE_INSN: B:29:0x009d->B:30:0x009d BREAK  A[LOOP:0: B:16:0x0067->B:89:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015c A[Catch: all -> 0x0174, TryCatch #2 {all -> 0x0174, blocks: (B:74:0x0156, B:76:0x015c, B:80:0x016b), top: B:73:0x0156 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016b A[Catch: all -> 0x0174, TRY_LEAVE, TryCatch #2 {all -> 0x0174, blocks: (B:74:0x0156, B:76:0x015c, B:80:0x016b), top: B:73:0x0156 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[LOOP:0: B:16:0x0067->B:89:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.net.Uri LIZ(android.net.Uri r16, boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FCY.LIZ(android.net.Uri, boolean, boolean):android.net.Uri");
    }
}

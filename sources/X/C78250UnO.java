package X;

import android.content.Context;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import java.io.File;
import java.math.BigInteger;
import java.security.MessageDigest;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.UnO, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78250UnO {
    public static final C78250UnO LIZ = new C78250UnO();

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.content.Context r8) {
        /*
            java.lang.String r5 = "ProfileAigcHelperUtil"
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.io.File r7 = new java.io.File     // Catch: java.lang.Exception -> L54
            java.io.File r1 = X.C16880lQ.LLIIIL(r8)     // Catch: java.lang.Exception -> L54
            java.lang.String r0 = "ai_avatar_images"
            r7.<init>(r1, r0)     // Catch: java.lang.Exception -> L54
            boolean r0 = r7.exists()     // Catch: java.lang.Exception -> L54
            if (r0 == 0) goto L4e
            java.io.File[] r6 = r7.listFiles()     // Catch: java.lang.Exception -> L54
            if (r6 == 0) goto L45
            int r4 = r6.length     // Catch: java.lang.Exception -> L54
            r3 = 0
        L20:
            if (r3 >= r4) goto L41
            r2 = r6[r3]     // Catch: java.lang.Exception -> L54
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Exception -> L54
            java.lang.String r0 = "deleting file: "
            r1.append(r0)     // Catch: java.lang.Exception -> L54
            java.lang.String r0 = r2.getName()     // Catch: java.lang.Exception -> L54
            r1.append(r0)     // Catch: java.lang.Exception -> L54
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Exception -> L54
            X.C221018lt.LIZ(r5, r0)     // Catch: java.lang.Exception -> L54
            X.C16880lQ.LLLZZIL(r2)     // Catch: java.lang.Exception -> L54
            int r3 = r3 + 1
            goto L20
        L41:
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Exception -> L54
            if (r0 != 0) goto L4a
        L45:
            java.lang.String r0 = "file list empty"
            X.C221018lt.LIZ(r5, r0)     // Catch: java.lang.Exception -> L54
        L4a:
            X.C16880lQ.LLLZZIL(r7)     // Catch: java.lang.Exception -> L54
            goto L68
        L4e:
            java.lang.String r0 = "directory doesn't exist"
            X.C221018lt.LIZ(r5, r0)     // Catch: java.lang.Exception -> L54
            goto L68
        L54:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "delete temp file failed, error: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C221018lt.LIZ(r5, r0)
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78250UnO.LIZ(android.content.Context):void");
    }

    public static android.net.Uri LIZJ(Context context, String str) {
        File[] listFiles;
        File file = new File(C16880lQ.LLIIIL(context), "ai_avatar_images");
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                String name = file2.getName();
                o.LJIIIIZZ(name, "it.name");
                if (ujb.o.LJJJLIIL(name, str, false)) {
                    C221018lt.LIZ("ProfileAigcHelperUtil", "found a name hit!");
                    android.net.Uri fromFile = android.net.Uri.fromFile(file2);
                    o.LJIIIIZZ(fromFile, "Uri.fromFile(this)");
                    return fromFile;
                }
            }
        }
        return null;
    }

    public static void LIZIZ(String imageUrl, Context context, InterfaceC78252UnQ listener) {
        o.LJIIIZ(imageUrl, "imageUrl");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(listener, "listener");
        listener.LIZ(imageUrl);
        File file = new File(C16880lQ.LLIIIL(context), "ai_avatar_images");
        if (!file.exists()) {
            file.mkdirs();
        }
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = imageUrl.getBytes(PVC.LIZ);
        o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
        String hashedUrl = new BigInteger(1, messageDigest.digest(bytes)).toString(16);
        o.LJIIIIZZ(hashedUrl, "hashedUrl");
        String substring = s.LJJLIL(64, hashedUrl).substring(0, 16);
        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("file name: ");
        LIZ2.append(substring);
        C221018lt.LIZ("ProfileAigcHelperUtil", X1D.LIZIZ(LIZ2));
        android.net.Uri LIZJ = LIZJ(context, substring);
        if (LIZJ != null) {
            listener.LIZIZ(LIZJ, imageUrl);
            return;
        }
        DownloadServiceManager downloadServiceManager = DownloadServiceManager.INSTANCE;
        X5R with = downloadServiceManager.getDownloadService().with(imageUrl);
        with.LIZJ = substring;
        with.LJII = downloadServiceManager.getRetryExpCount();
        with.LJ = file.getPath();
        with.LJIIL = new C78251UnP(listener, imageUrl, substring, context);
        with.LIZJ();
    }
}

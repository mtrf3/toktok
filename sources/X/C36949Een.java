package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.share.SystemShareActivity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Een, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36949Een {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(InputStream inputStream, FileOutputStream fileOutputStream) {
        byte[] bArr = new byte[2048];
        while (true) {
            try {
                try {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        AnonymousClass636.LJFF(fileOutputStream, null);
                        AnonymousClass636.LJFF(inputStream, null);
                        inputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, read);
                } finally {
                }
            } finally {
            }
        }
    }

    public static String LIZIZ(SystemShareActivity systemShareActivity, android.net.Uri uri, CreativeInfo creativeInfo) {
        int LJJLIIIJLLLLLLLZ;
        String substring;
        String path = uri.getPath();
        boolean z = false;
        if (path == null || (LJJLIIIJLLLLLLLZ = s.LJJLIIIJLLLLLLLZ(path, '/', 0, 6)) == -1) {
            substring = null;
        } else {
            substring = path.substring(LJJLIIIJLLLLLLLZ + 1);
            o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("SystemShareActivity getFilePathFromURI fileName = ");
        LIZ2.append(substring);
        C36922EeM.LJ(X1D.LIZIZ(LIZ2));
        if (!TextUtils.isEmpty(substring)) {
            String shareCreativeDir = AVExternalServiceImpl.LIZ().configService().cacheConfig().shareCreativeDir(creativeInfo);
            if (!C39579Fg7.LIZIZ(shareCreativeDir)) {
                C39579Fg7.LJ(shareCreativeDir, false);
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(shareCreativeDir);
            File file = new File(JBR.LJFF(LIZ3, File.separator, substring, LIZ3));
            try {
                InputStream openInputStream = systemShareActivity.getContentResolver().openInputStream(uri);
                if (openInputStream != null) {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    LIZ(openInputStream, fileOutputStream);
                    openInputStream.close();
                    fileOutputStream.close();
                    z = true;
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            if (z) {
                return file.getAbsolutePath();
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (r0 != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(com.ss.android.ugc.aweme.share.SystemShareActivity r5, android.net.Uri r6, com.ss.android.ugc.aweme.creative.CreativeInfo r7, boolean r8) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = "creativeInfo"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            r4 = 0
            r2 = 1
            r3 = 0
            if (r8 == 0) goto L36
            java.lang.String r1 = r6.getAuthority()
            if (r1 == 0) goto L34
            java.lang.String r0 = "com.zhiliaoapp.musically"
            boolean r0 = ujb.s.LJJJLZIJ(r1, r0, r3)
            if (r0 != r2) goto L34
            r0 = 1
        L1e:
            if (r0 != 0) goto L31
            java.lang.String r1 = r6.getAuthority()
            if (r1 == 0) goto L32
            java.lang.String r0 = "com.ss.android.ugc.trill"
            boolean r0 = ujb.s.LJJJLZIJ(r1, r0, r3)
            if (r0 != r2) goto L32
            r0 = 1
        L2f:
            if (r0 == 0) goto L36
        L31:
            return r4
        L32:
            r0 = 0
            goto L2f
        L34:
            r0 = 0
            goto L1e
        L36:
            java.lang.String r1 = "content"
            java.lang.String r0 = r6.getScheme()
            boolean r0 = ujb.o.LJJJJIZL(r1, r0, r2)
            if (r0 == 0) goto L82
            java.lang.String r1 = X.C00S.LIZIZ(r5, r6)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L7d
            goto L61
        L47:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r0 = "SystemShareActivity convertUriToPath exception = "
            r1.append(r0)     // Catch: java.lang.Throwable -> L7d
            X.C16880lQ.LLLLIIL(r2)     // Catch: java.lang.Throwable -> L7d
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L7d
            r1.append(r0)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L7d
            X.C36922EeM.LJ(r0)     // Catch: java.lang.Throwable -> L7d
            goto L76
        L61:
            if (r1 == 0) goto L69
            int r0 = r1.length()
            if (r0 != 0) goto L7b
        L69:
            if (r2 != 0) goto L76
            X.Eja r0 = X.C37247Ejb.LIZIZ
            r0.getClass()
            boolean r0 = X.C37246Eja.LJFF(r1)
            if (r0 != 0) goto L7a
        L76:
            java.lang.String r1 = LIZIZ(r5, r6, r7)
        L7a:
            return r1
        L7b:
            r2 = 0
            goto L69
        L7d:
            r0 = move-exception
            LIZIZ(r5, r6, r7)
            throw r0
        L82:
            java.lang.String r1 = "file"
            java.lang.String r0 = r6.getScheme()
            boolean r0 = ujb.o.LJJJJIZL(r1, r0, r2)
            if (r0 == 0) goto Lad
            java.io.File r0 = X.C16880lQ.LLIIJLIL(r5)
            java.lang.String r2 = r0.getParent()
            if (r2 == 0) goto La8
            java.lang.String r1 = r6.toString()
            java.lang.String r0 = "uri.toString()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            boolean r0 = ujb.s.LJJJLZIJ(r1, r2, r3)
            if (r0 == 0) goto La8
            return r4
        La8:
            java.lang.String r0 = r6.getPath()
            return r0
        Lad:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36949Een.LIZJ(com.ss.android.ugc.aweme.share.SystemShareActivity, android.net.Uri, com.ss.android.ugc.aweme.creative.CreativeInfo, boolean):java.lang.String");
    }
}

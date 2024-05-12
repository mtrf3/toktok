package X;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.Cursor;
import android.os.Build;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.cert.token.TokenCert;
import com.zhiliaoapp.musically.R;

/* renamed from: X.CgM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31950CgM {
    public static Cursor LIZ(ContentResolver contentResolver, android.net.Uri uri, String[] strArr, String str, String[] strArr2) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, strArr, str, strArr2, null}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "9095613789961317426"));
        return LIZJ.LIZ ? (Cursor) LIZJ.LIZIZ : contentResolver.query(uri, strArr, str, strArr2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        if (r3 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.net.Uri LIZIZ(android.content.Context r7, java.lang.String r8) {
        /*
            boolean r0 = X.C38354F3m.LJ(r8)
            r6 = 0
            if (r0 == 0) goto L8
            return r6
        L8:
            android.content.ContentResolver r5 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L42
            java.lang.String r4 = "_data= ?"
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L42
            r2 = 0
            r3[r2] = r8     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L42
            java.lang.String r0 = "_id"
            java.lang.String[] r1 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L42
            android.net.Uri r0 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L42
            android.database.Cursor r3 = LIZ(r5, r0, r1, r4, r3)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L42
            boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L43
            if (r0 == 0) goto L45
            java.lang.String r0 = r3.getString(r2)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L43
            android.net.Uri r2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L43
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L43
            android.net.Uri r0 = android.content.ContentUris.withAppendedId(r2, r0)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L43
            r3.close()
            return r0
        L38:
            r0 = move-exception
            r6 = r3
            goto L3c
        L3b:
            r0 = move-exception
        L3c:
            if (r6 == 0) goto L41
            r6.close()
        L41:
            throw r0
        L42:
            r3 = r6
        L43:
            if (r3 == 0) goto L48
        L45:
            r3.close()
        L48:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31950CgM.LIZIZ(android.content.Context, java.lang.String):android.net.Uri");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a5, code lost:
    
        if (r5 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x005e, code lost:
    
        if (r5 != null) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(android.content.Context r10, android.net.Uri r11) {
        /*
            java.lang.String r9 = ":"
            r5 = 0
            if (r11 != 0) goto L6
            return r5
        L6:
            java.lang.String r1 = r11.getScheme()
            boolean r0 = X.C38354F3m.LJ(r1)
            if (r0 != 0) goto L18
            java.lang.String r0 = "file"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1d
        L18:
            java.lang.String r0 = r11.getPath()
            return r0
        L1d:
            java.lang.String r0 = "http"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2a
            java.lang.String r0 = r11.toString()
            return r0
        L2a:
            java.lang.String r0 = "content"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lab
            java.lang.String r0 = "_data"
            java.lang.String[] r7 = new java.lang.String[]{r0}
            java.lang.String r8 = ""
            r6 = 0
            android.content.ContentResolver r0 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5e
            android.database.Cursor r5 = LIZ(r0, r11, r7, r5, r5)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5e
            if (r5 == 0) goto L4f
            boolean r0 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5e
            if (r0 == 0) goto L4f
            java.lang.String r8 = r5.getString(r6)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5e
        L4f:
            if (r5 == 0) goto L54
            r5.close()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5e
        L54:
            if (r5 == 0) goto L63
            goto L60
        L57:
            r0 = move-exception
            if (r5 == 0) goto L5d
            r5.close()     // Catch: java.lang.Exception -> L5d
        L5d:
            throw r0
        L5e:
            if (r5 == 0) goto L63
        L60:
            r5.close()     // Catch: java.lang.Exception -> L63
        L63:
            boolean r0 = X.C38354F3m.LJ(r8)
            if (r0 == 0) goto Laa
            android.content.ContentResolver r4 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La5
            java.lang.String r3 = "_id= ?"
            java.lang.String r2 = r11.getLastPathSegment()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La5
            boolean r0 = X.C38354F3m.LJ(r2)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La5
            r1 = 1
            if (r0 != 0) goto L86
            boolean r0 = r2.contains(r9)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La5
            if (r0 == 0) goto L86
            java.lang.String[] r0 = r2.split(r9)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La5
            r2 = r0[r1]     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La5
        L86:
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La5
            r1[r6] = r2     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La5
            android.net.Uri r0 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La5
            android.database.Cursor r5 = LIZ(r4, r0, r7, r3, r1)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La5
            boolean r0 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La5
            if (r0 == 0) goto L9a
            java.lang.String r8 = r5.getString(r6)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La5
        L9a:
            r5.close()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La5
            goto La7
        L9e:
            r0 = move-exception
            if (r5 == 0) goto La4
            r5.close()     // Catch: java.lang.Exception -> La4
        La4:
            throw r0
        La5:
            if (r5 == 0) goto Laa
        La7:
            r5.close()     // Catch: java.lang.Exception -> Laa
        Laa:
            return r8
        Lab:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31950CgM.LIZJ(android.content.Context, android.net.Uri):java.lang.String");
    }

    public static void LJ(Activity activity, Fragment fragment) {
        String str;
        if (Build.VERSION.SDK_INT <= 32) {
            str = "android.permission.READ_EXTERNAL_STORAGE";
        } else {
            str = "android.permission.READ_MEDIA_IMAGES";
        }
        new C77276UUm(activity, TokenCert.with("bpea-start_gallery_activity")).LIZ(new C31882CfG(activity, fragment), str);
    }

    public static void LIZLLL(Activity activity, Fragment fragment, Boolean bool, String str, String str2) {
        if (!"mounted".equals(C16880lQ.LLLLLLLZIL())) {
            KL2.LJ(activity, R.drawable.cpa, activity.getString(R.string.sp0));
        } else {
            new C77276UUm(activity, TokenCert.with("bpea-start_camera_activity")).LIZ(new C31871Cf5(activity, fragment, bool, str, str2), "android.permission.CAMERA");
        }
    }
}

package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.vesdk.VEUtils;
import java.io.File;
import java.io.InputStream;

/* renamed from: X.6mo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C170626mo {
    public static boolean LIZ(String str) {
        File externalFilesDir = C60903NvH.LJ.getExternalFilesDir(null);
        File filesDir = C60903NvH.LJ.getFilesDir();
        if (externalFilesDir != null && str.startsWith(externalFilesDir.getAbsolutePath())) {
            return true;
        }
        if (filesDir != null && str.startsWith(filesDir.getAbsolutePath())) {
            return true;
        }
        return false;
    }

    public static int[] LIZLLL(String str) {
        int i;
        int[] iArr = new int[6];
        if (str == null) {
            iArr[0] = 1;
            return iArr;
        }
        VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(str);
        if (videoFileInfo == null || (i = videoFileInfo.width) == 0) {
            iArr[0] = 1;
        } else {
            iArr[0] = 0;
            iArr[1] = videoFileInfo.duration;
            int i2 = videoFileInfo.rotation;
            if (i2 == 90 || i2 == 270) {
                iArr[2] = videoFileInfo.height;
                iArr[3] = i;
            } else {
                iArr[2] = i;
                iArr[3] = videoFileInfo.height;
            }
            iArr[4] = 320;
            iArr[5] = (videoFileInfo.height * 320) / i;
        }
        return iArr;
    }

    public static boolean LIZIZ(Context context, android.net.Uri uri) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                return false;
            }
            openInputStream.close();
            return true;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("media uri legal error: ");
            LIZ.append(e.toString());
            H78.LIZJ(X1D.LIZIZ(LIZ));
            return false;
        }
    }

    public static boolean LIZJ(Context context, String str) {
        if (str != null && !LIZ(str)) {
            return LIZIZ(context, UriProtector.parse(str));
        }
        return C39579Fg7.LIZIZ(str);
    }
}

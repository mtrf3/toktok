package X;

import android.app.ActivityManager;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public final class PP9 {
    public static boolean LIZ(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) C16880lQ.LLILL(context, "activity")).getRunningAppProcesses();
        String LLLZ = C16880lQ.LLLZ("%s:safemode", new Object[]{context.getPackageName()});
        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
        while (it.hasNext()) {
            if (it.next().processName.equals(LLLZ)) {
                return true;
            }
        }
        return false;
    }

    public static String LIZIZ(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            for (int i = 0; i < digest.length; i++) {
                byte b = digest[i];
                if ((b & 255) < 16) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(CardStruct.IStatusCode.DEFAULT);
                    LIZ.append(Integer.toHexString(digest[i] & 255));
                    stringBuffer.append(X1D.LIZIZ(LIZ));
                } else {
                    stringBuffer.append(Integer.toHexString(b & 255));
                }
            }
        } catch (NoSuchAlgorithmException e) {
            C16880lQ.LLLLIIL(e);
        }
        return stringBuffer.toString();
    }

    public static void LIZJ(int i, Exception exc) {
        if (C66465Q6r.LJIILLIIL.LIZIZ != null) {
            PJZ.LIZLLL("LaunchProtectException", C16880lQ.LLLZ("LaunchProtect stage: %d", new Object[]{Integer.valueOf(i)}), exc);
        }
        PSY.LIZJ(C16880lQ.LLLZ("reportInnerExceptionInStage %d", new Object[]{Integer.valueOf(i)}), exc);
    }
}

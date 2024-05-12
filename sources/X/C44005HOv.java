package X;

import Y.IDeS155S0200000_7;
import android.os.Build;
import com.bytedance.bpea.cert.token.TokenCert;
import java.util.Arrays;

/* renamed from: X.HOv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44005HOv {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(ActivityC45651qj activityC45651qj, TokenCert tokenCert, HCZ hcz, C44003HOt c44003HOt) {
        String[] strArr;
        if (Build.VERSION.SDK_INT >= 33) {
            strArr = new String[]{"android.permission.READ_MEDIA_VIDEO"};
        } else {
            strArr = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
        }
        C61099NyR.LIZIZ.LIZIZ(activityC45651qj, tokenCert).LIZ((String[]) Arrays.copyOf(strArr, strArr.length)).LIZJ(new IDeS155S0200000_7(hcz, c44003HOt, 3));
    }
}

package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.zhiliaoapp.musically.R;
import java.io.File;

/* renamed from: X.Fxs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40680Fxs {
    public static boolean LIZIZ(String str) {
        if (C38354F3m.LJ(str)) {
            return false;
        }
        if (!str.toLowerCase().startsWith("http://") && !str.toLowerCase().startsWith("https://")) {
            return false;
        }
        return true;
    }

    public static void LIZJ(Activity activity) {
        if (!"mounted".equals(C16880lQ.LLLLLLLZIL())) {
            KL2.LJ(activity, R.drawable.a_v, activity.getString(R.string.jkw));
            return;
        }
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction("android.intent.action.PICK");
        try {
            intent.putExtra("pns.sandbox.dataflow_id", 1207965186);
            C16880lQ.LJFF(activity, 10003, intent);
        } catch (Exception unused) {
            KL2.LJ(activity, R.drawable.a_v, activity.getString(R.string.jku));
        }
    }

    public static String LIZLLL(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        long longValue = CastLongProtector.valueOf(str).longValue();
        StringBuilder sb = new StringBuilder();
        do {
            long j = longValue % 23;
            longValue /= 23;
            if (j > 9) {
                sb.insert(0, (char) ((j + 97) - 10));
            } else {
                sb.insert(0, j);
            }
        } while (longValue != 0);
        return sb.toString();
    }

    public static android.net.Uri LIZ(Context context, File file) {
        if (context != null && Build.VERSION.SDK_INT >= 24 && context.getApplicationInfo().targetSdkVersion >= 24) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(context.getPackageName());
            LIZ.append(".fileprovider");
            return FileProvider.androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(context, X1D.LIZIZ(LIZ), file);
        }
        return android.net.Uri.fromFile(file);
    }
}

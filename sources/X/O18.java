package X;

import android.content.Context;
import android.os.Build;
import androidx.core.content.FileProvider;
import java.io.File;

/* loaded from: classes11.dex */
public final class O18 {
    public static android.net.Uri LIZ(Context context, File file) {
        if (Build.VERSION.SDK_INT >= 24) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(context.getPackageName());
            LIZ.append(".fileprovider");
            return FileProvider.androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(context, X1D.LIZIZ(LIZ), file);
        }
        return android.net.Uri.fromFile(file);
    }
}

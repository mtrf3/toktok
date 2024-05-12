package com.bytedance.android.livesdk;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import java.io.File;

/* loaded from: classes6.dex */
public class TTLiveFileProvider extends FileProvider {
    public static final String NAME = ".ttlive_provider";

    public static Uri getUri(Context context, String str, File file) {
        return FileProvider.androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(context, str, file);
    }

    public static Uri getUriForDifVersion(Context context, String str, File file) {
        if (Build.VERSION.SDK_INT >= 24) {
            return FileProvider.androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(context, str, file);
        }
        return Uri.fromFile(file);
    }
}

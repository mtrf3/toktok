package X;

import android.content.Context;
import android.os.Build;
import androidx.core.content.FileProvider;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OJT {
    public static final OJT LIZ = new OJT();
    public static final String[] LIZIZ = {"cc_create_info_uri"};

    public static String LIZJ(OJT ojt, Context context) {
        ojt.getClass();
        o.LJIIIZ(context, "context");
        String absolutePath = C16880lQ.LLIIJLIL(context).getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "context.filesDir.absolutePath");
        String separator = File.separator;
        o.LJIIIIZZ(separator, "separator");
        if (!ujb.o.LJJJJ(absolutePath, separator, false)) {
            absolutePath = o.LJIILLIIL(separator, absolutePath);
        }
        String LJIILLIIL = o.LJIILLIIL("CreativeTool/persistent/FixedCreativeInfo/edit_cap_cut/", absolutePath);
        File file = new File(LJIILLIIL);
        if (!file.exists() && !file.mkdirs()) {
            file.exists();
        }
        return LJIILLIIL;
    }

    public final File LIZ(Context context, String fileName) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(fileName, "fileName");
        return new File(LIZJ(this, context), fileName);
    }

    public final android.net.Uri LIZIZ(Context context, String relativePath) {
        o.LJIIIZ(relativePath, "relativePath");
        if (context == null) {
            return null;
        }
        File LIZ2 = LIZ(context, relativePath);
        if (!LIZ2.exists()) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return FileProvider.androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(context, o.LJIILLIIL(".CreativeTool.CCFileProvider", context.getPackageName()), LIZ2);
        }
        return android.net.Uri.fromFile(LIZ2);
    }
}

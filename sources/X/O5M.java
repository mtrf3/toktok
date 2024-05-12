package X;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;

/* loaded from: classes11.dex */
public final class O5M {
    public final O5O LIZ;

    public final void finalize() {
        super.finalize();
        OC6.LIZ("gecko-debug-tag", "gecko loader finalize lock");
        this.LIZ.LIZJ();
    }

    public final String LIZ(String str) {
        O5O o5o = this.LIZ;
        o5o.getClass();
        if (!TextUtils.isEmpty(str)) {
            O5P LIZ = o5o.LIZ(str.trim());
            O5Q LIZIZ = LIZ.LIZIZ(LIZ.LIZJ);
            return LIZIZ.LIZ(LIZIZ.LIZ, str.substring(LIZ.LIZJ.length() + 1)).getAbsolutePath();
        }
        throw new RuntimeException("relativePath is empty");
    }

    public O5M(Context context, String str) {
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                C61532OCy c61532OCy = EBC.LIZ;
                c61532OCy.LIZIZ();
                String rootDirectoryPath = c61532OCy.LJ.getRootDirectoryPath();
                if (TextUtils.isEmpty(rootDirectoryPath)) {
                    this.LIZ = new O5O(context, str, new File(C16880lQ.LLIIJLIL(context), "gecko_offline_res_x"));
                    return;
                } else {
                    this.LIZ = new O5O(context, str, new File(rootDirectoryPath));
                    return;
                }
            }
            throw new RuntimeException("access key is empty");
        }
        throw new RuntimeException("context is null");
    }
}

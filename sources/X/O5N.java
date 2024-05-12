package X;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* loaded from: classes11.dex */
public final class O5N implements OIJ {
    public final O5O LIZ;

    @Override // X.OIJ
    public final String LIZ() {
        return this.LIZ.LIZJ;
    }

    @Override // X.OIJ
    public final java.util.Map<String, Long> LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    public final void finalize() {
        super.finalize();
        try {
            this.LIZ.LIZJ();
        } catch (Exception e) {
            C45804HyK.LJJLIIIJJIZ(e);
        }
    }

    @Override // X.OIJ
    public final InputStream LIZJ(String str) {
        OC6.LIZ("WebOffline-falcon", "GeckoResLoader ready to load, file:", str);
        O5O o5o = this.LIZ;
        o5o.getClass();
        if (!TextUtils.isEmpty(str)) {
            O5P LIZ = o5o.LIZ(str.trim());
            O5Q LIZIZ = LIZ.LIZIZ(LIZ.LIZJ);
            String substring = str.substring(LIZ.LIZJ.length() + 1);
            LIZIZ.getClass();
            return new FileInputStream(LIZIZ.LIZ(LIZIZ.LIZ, substring));
        }
        throw new RuntimeException("relativePath is empty");
    }

    public O5N(Context context, String str, File file) {
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                this.LIZ = new O5O(context, str, file);
                return;
            }
            throw new RuntimeException("access key is empty");
        }
        throw new RuntimeException("context is null");
    }
}

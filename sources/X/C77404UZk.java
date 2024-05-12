package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UZk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77404UZk {
    public final String LIZ;
    public final String LIZIZ;
    public final List<String> LIZJ;
    public final String LIZLLL;
    public int LJ;

    public final String LIZIZ() {
        if (this.LJ < this.LIZJ.size()) {
            return (String) ListProtector.get(this.LIZJ, this.LJ);
        }
        throw new Exception("Array out of bound");
    }

    public final String LIZ() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        String str2 = this.LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(C39579Fg7.LJII(EF7.LIZIZ()).getPath());
        String str3 = File.separator;
        LIZ2.append(str3);
        LIZ2.append(str2);
        LIZ.append(X1D.LIZIZ(LIZ2));
        LIZ.append(str3);
        if (!TextUtils.isEmpty(this.LIZIZ)) {
            str = this.LIZIZ;
        } else {
            str = "default_activity";
        }
        LIZ.append(str);
        return X1D.LIZIZ(LIZ);
    }

    public final String LIZLLL() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LIZ());
        LIZ.append(File.separator);
        LIZIZ();
        LIZ.append(LIZJ(false));
        return X1D.LIZIZ(LIZ);
    }

    public final String LJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LIZ());
        LIZ.append(File.separator);
        LIZIZ();
        LIZ.append(LIZJ(true));
        return X1D.LIZIZ(LIZ);
    }

    public final String LIZJ(boolean z) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZLLL);
        if (z) {
            str = ".zip";
        } else {
            str = "";
        }
        LIZ.append(str);
        return X1D.LIZIZ(LIZ);
    }

    public C77404UZk(String relativePath, List zipUrl, String md5) {
        o.LJIIIZ(relativePath, "relativePath");
        o.LJIIIZ(zipUrl, "zipUrl");
        o.LJIIIZ(md5, "md5");
        this.LIZ = "newpendant";
        this.LIZIZ = relativePath;
        this.LIZJ = zipUrl;
        this.LIZLLL = md5;
    }
}

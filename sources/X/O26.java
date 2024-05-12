package X;

import android.webkit.WebResourceResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class O26 {
    public String LIZ;
    public WebResourceResponse LIZIZ;
    public C24730y5 LIZJ;
    public JSONArray LIZLLL;
    public String LJ;
    public String LJFF;
    public final android.net.Uri LJI;
    public String LJII;
    public EnumC60881Nuv LJIIIIZZ;
    public O29 LJIIIZ;
    public boolean LJIIJ;
    public long LJIIJJI;
    public InputStream LJIIL;
    public C60889Nv3 LJIILIIL;
    public String LJIILJJIL;
    public long LJIILL;
    public JSONObject LJIILLIIL;

    public final String LIZ() {
        O29 o29 = this.LJIIIZ;
        if (o29 != null) {
            int i = O27.LIZIZ[o29.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return "offline";
                        }
                    } else {
                        if (this.LJIIJ) {
                            return "cdnCache";
                        }
                        return "cdn";
                    }
                } else {
                    if (this.LJIIIIZZ != EnumC60881Nuv.ASSET) {
                        return "offline";
                    }
                    return "buildin";
                }
            } else {
                if (this.LJIIJ) {
                    return "gecko";
                }
                return "geckoUpdate";
            }
        }
        return "unknown";
    }

    public InputStream LIZJ() {
        String str = this.LJII;
        if (str == null) {
            str = "";
        }
        File file = new File(str);
        InputStream inputStream = this.LJIIL;
        if (inputStream != null) {
            return inputStream;
        }
        if (file.exists()) {
            return new FileInputStream(file);
        }
        return null;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[srcUri=");
        LIZ.append(this.LJI);
        LIZ.append(", filePath=");
        LIZ.append(this.LJII);
        LIZ.append(", type=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(',');
        LIZ.append("from=");
        LIZ.append(this.LJIIIZ);
        LIZ.append(", fileStream=");
        LIZ.append(this.LJIIL);
        LIZ.append(", model=");
        LIZ.append(this.LJIILIIL);
        LIZ.append(']');
        return X1D.LIZIZ(LIZ);
    }

    public static File LIZIZ(O26 o26) {
        String str = o26.LJII;
        if (str == null) {
            str = "";
        }
        EnumC60881Nuv enumC60881Nuv = o26.LJIIIIZZ;
        if (enumC60881Nuv == null || O27.LIZ[enumC60881Nuv.ordinal()] != 1) {
            return new File(str);
        }
        return new File(str);
    }

    public O26(android.net.Uri srcUri, String str, EnumC60881Nuv enumC60881Nuv, O29 o29, boolean z, long j, boolean z2, InputStream inputStream, C60889Nv3 c60889Nv3, String str2, long j2) {
        o.LJIIJ(srcUri, "srcUri");
        this.LJI = srcUri;
        this.LJII = str;
        this.LJIIIIZZ = enumC60881Nuv;
        this.LJIIIZ = o29;
        this.LJIIJ = z;
        this.LJIIJJI = j;
        this.LJIIL = inputStream;
        this.LJIILIIL = c60889Nv3;
        this.LJIILJJIL = str2;
        this.LJIILL = j2;
        this.LJIILLIIL = null;
        this.LIZ = "";
        this.LIZJ = new C24730y5(0);
        this.LIZLLL = new JSONArray();
    }
}

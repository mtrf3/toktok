package X;

import android.webkit.WebResourceResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import kotlin.jvm.internal.o;
import org.json.JSONArray;

/* loaded from: classes11.dex */
public class O1I {
    public String LIZ;
    public WebResourceResponse LIZIZ;
    public C60547NpX LIZJ;
    public C60547NpX LIZLLL;
    public JSONArray LJ;
    public final android.net.Uri LJFF;
    public String LJI;
    public F3S LJII;
    public EnumC60490Noc LJIIIIZZ;
    public boolean LJIIIZ;
    public long LJIIJ;
    public boolean LJIIJJI;
    public InputStream LJIIL;
    public C60235NkV LJIILIIL;
    public String LJIILJJIL;
    public long LJIILL;

    public final String LIZ() {
        EnumC60490Noc enumC60490Noc = this.LJIIIIZZ;
        if (enumC60490Noc != null) {
            int i = C60491Nod.LIZ[enumC60490Noc.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return "offline";
                        }
                    } else {
                        if (this.LJIIIZ) {
                            return "cdnCache";
                        }
                        return "cdn";
                    }
                } else {
                    if (this.LJII != F3S.ASSET) {
                        return "offline";
                    }
                    return "buildin";
                }
            } else {
                if (this.LJIIIZ) {
                    return "gecko";
                }
                return "geckoUpdate";
            }
        }
        return "custom";
    }

    public InputStream LIZIZ() {
        String str = this.LJI;
        if (str == null) {
            str = "";
        }
        File file = new File(str);
        InputStream inputStream = this.LJIIL;
        if (inputStream != null) {
            return inputStream;
        }
        if (file.exists() && !file.isDirectory()) {
            return new FileInputStream(file);
        }
        return null;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[srcUri=");
        LIZ.append(this.LJFF);
        LIZ.append(", filePath=");
        LIZ.append(this.LJI);
        LIZ.append(", type=");
        LIZ.append(this.LJII);
        LIZ.append(',');
        LIZ.append("from=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", fileStream=");
        LIZ.append(this.LJIIL);
        LIZ.append(", model=");
        LIZ.append(this.LJIILIIL);
        LIZ.append(']');
        return X1D.LIZIZ(LIZ);
    }

    public O1I(android.net.Uri srcUri, String str, F3S f3s, EnumC60490Noc enumC60490Noc, boolean z, long j, boolean z2, InputStream inputStream, C60235NkV c60235NkV, String str2, long j2) {
        o.LJIIJ(srcUri, "srcUri");
        this.LJFF = srcUri;
        this.LJI = str;
        this.LJII = f3s;
        this.LJIIIIZZ = enumC60490Noc;
        this.LJIIIZ = z;
        this.LJIIJ = j;
        this.LJIIJJI = z2;
        this.LJIIL = inputStream;
        this.LJIILIIL = c60235NkV;
        this.LJIILJJIL = str2;
        this.LJIILL = j2;
        this.LIZ = "";
        this.LIZJ = new C60547NpX("bdx_resourceloader_fetch", null, null, 254);
        this.LIZLLL = new C60547NpX("bdx_resourceloader_performance", null, null, 254);
        this.LJ = new JSONArray();
    }
}

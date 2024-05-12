package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import defpackage.i0;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes8.dex */
public final class HD2 {
    public static int LJ;
    public String LIZ;
    public final String LIZIZ;
    public Bitmap.CompressFormat LIZJ = Bitmap.CompressFormat.PNG;
    public final SimpleDateFormat LIZLLL;

    public final String LIZ() {
        String str;
        if (this.LIZJ == Bitmap.CompressFormat.JPEG) {
            str = ".jpeg";
        } else {
            str = ".png";
        }
        Locale locale = Locale.getDefault();
        String LJFF = i0.LJFF("%s/IMG_%s", str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZLLL.format(new Date()));
        LIZ.append("_");
        int i = LJ + 1;
        LJ = i;
        LIZ.append(i);
        return C16880lQ.LLLZI(locale, LJFF, new Object[]{this.LIZ, X1D.LIZIZ(LIZ)});
    }

    public final String LIZIZ() {
        String str;
        if (this.LIZJ == Bitmap.CompressFormat.JPEG) {
            str = ".jpeg";
        } else {
            str = ".png";
        }
        Locale locale = Locale.getDefault();
        String LJFF = i0.LJFF("%s/IMG_%s", str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZLLL.format(new Date()));
        LIZ.append("_");
        int i = LJ + 1;
        LJ = i;
        return C16880lQ.LLLZI(locale, LJFF, new Object[]{this.LIZIZ, C08380Uo.LIZ(LIZ, i, "_frame", LIZ)});
    }

    public HD2(CreativeInfo creativeInfo) {
        File file = new File(AVServiceImpl.LIZ().photoDir(creativeInfo));
        if (!file.exists()) {
            file.mkdirs();
        }
        this.LIZ = file.getAbsolutePath();
        this.LIZIZ = file.getAbsolutePath();
        this.LIZLLL = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault());
    }

    public final void LIZJ(String str) {
        this.LIZ = str;
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
    }
}

package X;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes11.dex */
public final class OIC {
    public final Context LIZ;
    public final String LIZIZ;
    public final List<Pattern> LIZJ;
    public final List<android.net.Uri> LIZLLL;
    public final String LJ;
    public final OIM LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;

    public OIC(OIG oig) {
        Context context = oig.LIZ;
        if (context != null) {
            Context LLLLL = C16880lQ.LLLLL(context);
            if (LLLLL == null) {
                this.LIZ = oig.LIZ;
            } else {
                this.LIZ = LLLLL;
            }
            if (TextUtils.isEmpty(oig.LIZJ)) {
                this.LJI = C61588OFc.LIZJ(this.LIZ);
            } else {
                this.LJI = oig.LIZJ;
            }
            if (!TextUtils.isEmpty(oig.LIZIZ)) {
                this.LIZIZ = oig.LIZIZ;
                if (!TextUtils.isEmpty(oig.LJIIIIZZ)) {
                    this.LJII = oig.LJIIIIZZ;
                    this.LIZJ = oig.LJFF;
                    List<android.net.Uri> list = oig.LJI;
                    if (list == null) {
                        this.LIZLLL = Arrays.asList(android.net.Uri.fromFile(new File(C16880lQ.LLIIJLIL(this.LIZ), "gecko_offline_res_x")));
                    } else {
                        this.LIZLLL = list;
                    }
                    this.LJ = oig.LJII;
                    this.LJFF = oig.LIZLLL;
                    String str = oig.LJIIIZ;
                    this.LJIIIIZZ = str;
                    if (!TextUtils.isEmpty(str)) {
                        return;
                    } else {
                        throw new IllegalArgumentException("region == null");
                    }
                }
                throw new IllegalArgumentException("host empty");
            }
            throw new IllegalArgumentException("accessKey empty");
        }
        throw new IllegalArgumentException("context == null");
    }
}

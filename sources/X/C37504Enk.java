package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pia.core.setting.Config;
import com.bytedance.pia.core.setting.Settings;

/* renamed from: X.Enk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37504Enk {
    public String LIZ;
    public String LIZIZ;
    public Object LIZJ;
    public boolean LIZLLL;
    public Config LJ;
    public String LJFF;
    public android.net.Uri LJI;

    /* JADX WARN: Can't wrap try/catch for region: R(25:17|(1:19)|20|(4:24|(1:28)|29|(1:31))|32|(2:36|(1:38))|39|(1:41)|42|(14:78|79|45|(10:71|72|(1:74)|50|(7:64|65|(1:67)|55|(2:59|60)|57|58)|54|55|(0)|57|58)|49|50|(1:52)|64|65|(0)|55|(0)|57|58)|44|45|(1:47)|71|72|(0)|50|(0)|64|65|(0)|55|(0)|57|58) */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0108, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0109, code lost:
    
        X.C37238EjS.LIZLLL(4, "[Runtime] create custom UserAgent error:", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00ea, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00eb, code lost:
    
        X.C37238EjS.LIZLLL(4, "[Runtime] create Retrofit error:", r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0126 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C37499Enf LIZ() {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37504Enk.LIZ():X.Enf");
    }

    public final String LIZIZ() {
        if (TextUtils.isEmpty(this.LIZIZ)) {
            return null;
        }
        if (!Settings.LIZ().isPiaQueryDisable && !this.LIZIZ.contains("__pia_manifest__") && !this.LIZIZ.contains("_pia_")) {
            return null;
        }
        String str = this.LJFF;
        if (str != null) {
            return str;
        }
        android.net.Uri parse = UriProtector.parse(this.LIZIZ);
        this.LJI = parse;
        if (parse.getBooleanQueryParameter("__pia_manifest__", false)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(C85693Xx.LIZJ(this.LJI, null));
            LIZ.append(UriProtector.getQueryParameter(this.LJI, "__pia_manifest__"));
            this.LJFF = X1D.LIZIZ(LIZ);
        } else if (this.LJI.getBooleanQueryParameter("_pia_", false)) {
            this.LJFF = C85693Xx.LIZJ(this.LJI, null);
        }
        if (Settings.LIZ().isPiaQueryDisable) {
            this.LJFF = C85693Xx.LIZJ(this.LJI, null);
        }
        return this.LJFF;
    }
}

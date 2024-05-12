package X;

import com.ss.android.ugc.aweme.specialplus.SpecialPlusConfig;
import java.io.File;
import ujb.o;

/* renamed from: X.HsE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45426HsE {
    public static final String LIZ;
    public static final C36478ETi LIZIZ;

    static {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(C44172HVg.LIZ.getFilesDir().toString());
        LIZ = JBR.LJFF(LIZ2, File.separator, "superentrance", LIZ2);
        LIZIZ = new C36478ETi();
    }

    public static String LIZ(SpecialPlusConfig specialPlusConfig) {
        if (o.LJJJJ(specialPlusConfig.getPlusIcon().getUrl(), ".webp", false)) {
            return "special_plus_icon.webp";
        }
        return "special_plus_icon.png";
    }
}

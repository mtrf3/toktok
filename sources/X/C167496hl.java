package X;

import android.util.Base64;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.o;

/* renamed from: X.6hl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C167496hl {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(String str) {
        if (str == null) {
            str = "";
        }
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt <= 127) {
                i2++;
            } else if (charAt <= 2047) {
                i2 += 2;
            } else if (Character.isHighSurrogate(charAt)) {
                i2 += 4;
                i++;
            } else {
                i2 += 3;
            }
            i++;
        }
        if (i2 > 300) {
            return false;
        }
        return true;
    }

    public static File LIZJ(CreativeInfo creativeInfo) {
        String LJJIIJ = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJIIJ(creativeInfo, "");
        if (!C1B6.LIZIZ(LJJIIJ)) {
            C1I0.LIZJ(LJJIIJ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(C78966Uyw.LJIJJLI(LJJIIJ));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US);
        Date time = Calendar.getInstance(TimeZone.getTimeZone("GMT+8")).getTime();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(simpleDateFormat.format(time));
        LIZ3.append(".mp3");
        LIZ2.append(X1D.LIZIZ(LIZ3));
        return new File(X1D.LIZIZ(LIZ2));
    }

    public static File LIZ(CreativeInfo creativeInfo, String data) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(data, "data");
        try {
            File LIZJ = LIZJ(creativeInfo);
            new FileOutputStream(LIZJ).write(Base64.decode(data, 0));
            return LIZJ;
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            C170666ms.LIZIZ(KMP.LJFF(LIZ2, "Base64 to File failed, Exception: ", e, LIZ2));
            return null;
        }
    }
}

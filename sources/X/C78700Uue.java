package X;

import android.content.Context;
import android.os.Environment;
import com.ss.android.ugc.aweme.translation.model.RealtimeCaptionsTranslationResult;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.Uue, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78700Uue {
    public static final String LIZ;

    static {
        File LLIIJI;
        StringBuilder LIZ2 = X1D.LIZ();
        Context context = C39579Fg7.LJLIL;
        if (Environment.isExternalStorageEmulated()) {
            LLIIJI = C16880lQ.LLIIJLIL(context);
        } else {
            LLIIJI = C16880lQ.LLIIJI(context, null);
            if (LLIIJI != null) {
                C39579Fg7.LJFF(LLIIJI);
            } else {
                LLIIJI = C16880lQ.LLIIJLIL(context);
            }
        }
        LIZ2.append(LLIIJI.getPath());
        String LJFF = JBR.LJFF(LIZ2, File.separator, "realtime_captions_cache", LIZ2);
        LIZ = LJFF;
        C37247Ejb.LIZIZ.getClass();
        C37246Eja.LIZLLL(LJFF);
        if (!AnonymousClass845.LIZ) {
            C37246Eja.LIZIZ(LJFF);
        }
    }

    public static boolean LIZ(RealtimeCaptionsTranslationResult data, String filePath) {
        o.LJIIIZ(data, "data");
        o.LJIIIZ(filePath, "filePath");
        if (AnonymousClass845.LIZ) {
            C37246Eja c37246Eja = C37247Ejb.LIZIZ;
            String str = LIZ;
            c37246Eja.getClass();
            if (!C37246Eja.LJFF(str)) {
                C37246Eja.LIZIZ(str);
            }
        }
        C37246Eja c37246Eja2 = C37247Ejb.LIZIZ;
        c37246Eja2.getClass();
        C36871EdX.LJ(filePath);
        c37246Eja2.getClass();
        if (!C37246Eja.LJFF(filePath)) {
            C37246Eja.LIZJ(filePath);
        }
        return C39579Fg7.LJJI(filePath, data.translatedContent);
    }

    public static String LIZIZ(String awemeId, String languageCode) {
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(languageCode, "languageCode");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LIZ);
        LIZ2.append(File.separator);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("cla_realtime_[");
        LIZ3.append(awemeId);
        LIZ3.append("]_[");
        LIZ3.append(languageCode);
        LIZ3.append(']');
        LIZ2.append(X1D.LIZIZ(LIZ3));
        return X1D.LIZIZ(LIZ2);
    }
}

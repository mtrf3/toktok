package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes16.dex */
public final class XAN {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(ModelInfo modelInfo) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(modelInfo.getName());
        LIZ2.append("_v");
        LIZ2.append(modelInfo.getVersion());
        LIZ2.append("_size");
        LIZ2.append(modelInfo.getType());
        LIZ2.append("_md5");
        LIZ2.append(C79146V4k.LJJIIZI(modelInfo));
        LIZ2.append(".model");
        return X1D.LIZIZ(LIZ2);
    }

    public static String LIZIZ(String sourceStr) {
        o.LJIIJ(sourceStr, "sourceStr");
        if (!s.LJJJLZIJ(sourceStr, "md5", false)) {
            return null;
        }
        try {
            String substring = sourceStr.substring(s.LJJLIIIJL(sourceStr, "md5", 0, false, 6) + 3, s.LJJLIIJ(sourceStr, "_model", 6));
            o.LJFF(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String LIZJ(String sourceStr) {
        boolean z;
        o.LJIIJ(sourceStr, "sourceStr");
        int LJJLIIJ = s.LJJLIIJ(sourceStr, "/", 6);
        int LIZ2 = C15160ie.LIZ(sourceStr, "_v[0-9]");
        int i = LJJLIIJ + 1;
        if (C107244Iu.LIZIZ(sourceStr) || i < 0 || LIZ2 < 0 || i >= LIZ2 || i >= sourceStr.length() || LIZ2 > sourceStr.length()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            String substring = sourceStr.substring(i, LIZ2);
            o.LJFF(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        int LIZ3 = C15160ie.LIZ(sourceStr, "\\.model|_model|\\.dat");
        if (LIZ3 > 0 && LIZ3 > LJJLIIJ) {
            String substring2 = sourceStr.substring(i, LIZ3);
            o.LJFF(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring2;
        }
        String substring3 = sourceStr.substring(i, sourceStr.length());
        o.LJFF(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring3;
    }

    public static int LIZLLL(String str) {
        int LIZ2;
        if (!s.LJJJLZIJ(str, "size", false)) {
            return 0;
        }
        int LJJLIIJ = s.LJJLIIJ(str, "size", 6);
        if (s.LJJJLZIJ(str, "md5", false)) {
            LIZ2 = C15160ie.LIZ(str, "_md5");
        } else {
            LIZ2 = C15160ie.LIZ(str, "\\.model|_model|\\.dat");
        }
        if (LJJLIIJ >= LIZ2) {
            return -1;
        }
        String substring = str.substring(LJJLIIJ + 4, LIZ2);
        o.LJFF(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        try {
            return CastIntegerProtector.parseInt(substring);
        } catch (Exception unused) {
            return -1;
        }
    }

    public static String LJ(String sourceStr) {
        o.LJIIJ(sourceStr, "sourceStr");
        s.LJJLIIJ(sourceStr, "/", 6);
        int LJJLIIJ = s.LJJLIIJ(sourceStr, "_v", 6);
        int LIZ2 = C15160ie.LIZ(sourceStr, "\\.model|_model|\\.dat");
        if (LJJLIIJ > 0) {
            String substring = sourceStr.substring(LJJLIIJ + 2, LIZ2);
            o.LJFF(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        return "1.0";
    }
}

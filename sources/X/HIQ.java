package X;

import com.ss.android.ugc.gamora.editor.smartsynthesis.SmartSynthesisModelPath;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HIQ {
    public static final C5H3 LIZ = C221108m2.LIZ(EnumC221088m0.NONE, HIR.LJLIL);
    public static final List<String> LIZIZ = C47261Igj.LJJIJIIJI("480", "576", "720", "1080");
    public static final List<String> LIZJ = C47261Igj.LJJIJIIJI("720", "1024", "1280", "1920");
    public static final java.util.Map<String, String> LIZLLL = new LinkedHashMap();

    public static boolean LIZ() {
        String str;
        C5H3 c5h3 = LIZ;
        SmartSynthesisModelPath smartSynthesisModelPath = (SmartSynthesisModelPath) c5h3.getValue();
        String str2 = null;
        if (smartSynthesisModelPath != null) {
            str2 = smartSynthesisModelPath.smartcodec;
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        if (str2.length() <= 0) {
            return false;
        }
        SmartSynthesisModelPath smartSynthesisModelPath2 = (SmartSynthesisModelPath) c5h3.getValue();
        if (smartSynthesisModelPath2 != null && (str = smartSynthesisModelPath2.statics) != null) {
            str3 = str;
        }
        if (str3.length() <= 0) {
            return false;
        }
        return true;
    }

    public static final void LIZIZ(String msg) {
        o.LJIIIZ(msg, "msg");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("SmartSynthesisModelFetcher -> ");
        LIZ2.append(msg);
        H78.LIZ(X1D.LIZIZ(LIZ2));
    }
}

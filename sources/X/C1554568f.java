package X;

import android.graphics.Typeface;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.68f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1554568f {
    public static C1554568f LIZLLL;
    public final java.util.Map<String, TextFontStyleData> LIZ = new ConcurrentHashMap();
    public final java.util.Map<String, Typeface> LIZIZ = new ConcurrentHashMap();
    public InterfaceC84498XEg LIZJ;

    public static C1554568f LIZ() {
        if (LIZLLL == null) {
            synchronized (C1554568f.class) {
                if (LIZLLL == null) {
                    LIZLLL = new C1554568f();
                }
            }
        }
        return LIZLLL;
    }

    public static Typeface LIZIZ(String str) {
        if (TextUtils.isEmpty(str) || !C1B6.LIZIZ(str)) {
            return null;
        }
        try {
            return C16880lQ.LJJLIIIJLLLLLLLZ(str);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public static void LIZJ(TextFontStyleData textFontStyleData) {
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("font_title", textFontStyleData.title);
        c6bk.LIZ.put("font_name", textFontStyleData.fileName);
        C43882HKc.LIZLLL(0, "font_resource_download_error_state", c6bk.LJ(), C48331Ixz.LJ());
    }

    public final TextFontStyleData LIZLLL(Effect effect) {
        Typeface LIZIZ;
        try {
            TextFontStyleData textFontStyleData = (TextFontStyleData) C60903NvH.LJIIJJI().LIZ().LJI(effect.getExtra(), TextFontStyleData.class);
            if (textFontStyleData != null && !TextUtils.isEmpty(textFontStyleData.fileName)) {
                TextFontStyleData textFontStyleData2 = (TextFontStyleData) ((ConcurrentHashMap) this.LIZ).get(textFontStyleData.fileName);
                if (textFontStyleData2 == null) {
                    ((ConcurrentHashMap) this.LIZ).put(textFontStyleData.fileName, textFontStyleData);
                } else {
                    textFontStyleData2.fileName = textFontStyleData.fileName;
                    textFontStyleData2.fontName = textFontStyleData.fontName;
                    textFontStyleData2.fontSize = textFontStyleData.fontSize;
                    textFontStyleData2.title = textFontStyleData.title;
                    textFontStyleData2.enableBgColor = textFontStyleData.enableBgColor;
                    textFontStyleData2.enableMaskBlurLightColor = textFontStyleData.enableMaskBlurLightColor;
                    textFontStyleData = textFontStyleData2;
                }
                textFontStyleData.LIZJ = effect;
                if (((ConcurrentHashMap) this.LIZIZ).get(textFontStyleData.fileName) == null && !TextUtils.isEmpty(effect.getUnzipPath()) && C44687HgJ.LIZIZ(effect.getUnzipPath())) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(effect.getUnzipPath());
                    String str = File.separator;
                    LIZ.append(str);
                    LIZ.append(textFontStyleData.fileName);
                    Typeface LIZIZ2 = LIZIZ(X1D.LIZIZ(LIZ));
                    if (LIZIZ2 != null) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(effect.getUnzipPath());
                        LIZ2.append(str);
                        LIZ2.append(textFontStyleData.fileName);
                        textFontStyleData.LIZ = X1D.LIZIZ(LIZ2);
                        textFontStyleData.LIZIZ = 1;
                        ((ConcurrentHashMap) this.LIZIZ).put(textFontStyleData.fileName, LIZIZ2);
                        LIZJ(textFontStyleData);
                        return textFontStyleData;
                    }
                    for (File file : new File(effect.getUnzipPath()).listFiles()) {
                        if (file.isFile() && !file.getAbsolutePath().endsWith(".json") && (LIZIZ = LIZIZ(file.getAbsolutePath())) != null) {
                            textFontStyleData.LIZ = file.getAbsolutePath();
                            textFontStyleData.LIZIZ = 1;
                            ((ConcurrentHashMap) this.LIZIZ).put(textFontStyleData.fileName, LIZIZ);
                            LIZJ(textFontStyleData);
                            return textFontStyleData;
                        }
                    }
                    return null;
                }
                return null;
            }
            return null;
        } catch (Exception e) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("parseTextFontStyleData err: ");
            LIZ3.append(e.getMessage());
            H7B.LIZJ(X1D.LIZIZ(LIZ3));
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }
}

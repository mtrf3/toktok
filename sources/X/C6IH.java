package X;

import android.graphics.Typeface;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.6IH, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6IH {
    public static C6IH LJFF;
    public static final String[] LJI = {"default", "Proxima-Nova-Semibold.otf"};
    public final java.util.Map<String, TextFontStyleData> LIZ = Collections.synchronizedMap(new LinkedHashMap());
    public final java.util.Map<String, Typeface> LIZIZ = new ConcurrentHashMap();
    public String LIZJ = "default";
    public String LIZLLL = "default";
    public final InterfaceC84498XEg LJ = AVServiceImpl.LIZ().effectService().createFontEffectPlatform(EF7.LIZIZ());

    public static C6IH LJ() {
        if (LJFF == null) {
            synchronized (C6IH.class) {
                if (LJFF == null) {
                    LJFF = new C6IH();
                }
            }
        }
        return LJFF;
    }

    public final Typeface LIZ() {
        if (((ConcurrentHashMap) this.LIZIZ).get(this.LIZJ) != null) {
            return (Typeface) ((ConcurrentHashMap) this.LIZIZ).get(this.LIZJ);
        }
        return Typeface.DEFAULT_BOLD;
    }

    public final List<TextFontStyleData> LIZLLL() {
        if (this.LIZ.size() == 0) {
            return new ArrayList();
        }
        for (TextFontStyleData textFontStyleData : this.LIZ.values()) {
            if (textFontStyleData != null) {
                if (!TextUtils.isEmpty(textFontStyleData.fileName)) {
                    if (((ConcurrentHashMap) this.LIZIZ).get(textFontStyleData.fileName) != null) {
                        textFontStyleData.LIZIZ = 1;
                    }
                }
                Typeface LJFF2 = LJFF(textFontStyleData.LIZ);
                if (LJFF2 != null) {
                    ((ConcurrentHashMap) this.LIZIZ).put(textFontStyleData.fileName, LJFF2);
                    textFontStyleData.LIZIZ = 1;
                } else {
                    textFontStyleData.LIZIZ = 2;
                }
            }
        }
        return new ArrayList(this.LIZ.values());
    }

    public static Typeface LJFF(String str) {
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

    public final Typeface LIZIZ(int i) {
        if (i == 1) {
            if (((ConcurrentHashMap) this.LIZIZ).get(this.LIZLLL) != null) {
                return (Typeface) ((ConcurrentHashMap) this.LIZIZ).get(this.LIZLLL);
            }
            return Typeface.DEFAULT_BOLD;
        }
        return LIZ();
    }

    public final String LIZJ(int i) {
        if (i == 1) {
            return this.LIZLLL;
        }
        return this.LIZJ;
    }

    public final TextFontStyleData LJI(Effect effect) {
        Typeface LJFF2;
        try {
            TextFontStyleData textFontStyleData = (TextFontStyleData) C6YJ.LIZ.LJI(effect.getExtra(), TextFontStyleData.class);
            if (!TextUtils.isEmpty(textFontStyleData.fileName)) {
                TextFontStyleData textFontStyleData2 = this.LIZ.get(textFontStyleData.fileName);
                if (textFontStyleData2 == null) {
                    this.LIZ.put(textFontStyleData.fileName, textFontStyleData);
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
                    Typeface LJFF3 = LJFF(X1D.LIZIZ(LIZ));
                    if (LJFF3 != null) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(effect.getUnzipPath());
                        LIZ2.append(str);
                        LIZ2.append(textFontStyleData.fileName);
                        textFontStyleData.LIZ = X1D.LIZIZ(LIZ2);
                        textFontStyleData.LIZIZ = 1;
                        ((ConcurrentHashMap) this.LIZIZ).put(textFontStyleData.fileName, LJFF3);
                        return textFontStyleData;
                    }
                    for (File file : new File(effect.getUnzipPath()).listFiles()) {
                        if (file.isFile() && !file.getAbsolutePath().endsWith(".json") && (LJFF2 = LJFF(file.getAbsolutePath())) != null) {
                            textFontStyleData.LIZ = file.getAbsolutePath();
                            textFontStyleData.LIZIZ = 1;
                            ((ConcurrentHashMap) this.LIZIZ).put(textFontStyleData.fileName, LJFF2);
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

    public final void LJII(int i, String str) {
        if (i == 1) {
            this.LIZLLL = str;
        } else {
            this.LIZJ = str;
        }
    }
}

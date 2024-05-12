package X;

import Y.ACallableS105S0100000_2;
import Y.IDObjectS384S0100000_2;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import defpackage.e1;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.68M, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C68M {
    public static C68M LJFF;
    public static final String[] LJI = {"default", "Proxima-Nova-Semibold.otf"};
    public final java.util.Map<String, TextFontStyleData> LIZ = Collections.synchronizedMap(new LinkedHashMap());
    public final java.util.Map<String, Typeface> LIZIZ = new ConcurrentHashMap();
    public String LIZJ = "default";
    public String LIZLLL = "default";
    public InterfaceC1549866k<List<TextFontStyleData>> LJ;

    public static C68M LJIIJ() {
        if (LJFF == null) {
            synchronized (C68M.class) {
                if (LJFF == null) {
                    LJFF = new C68M();
                }
            }
        }
        return LJFF;
    }

    public final int LIZJ() {
        TextFontStyleData textFontStyleData = this.LIZ.get(this.LIZJ);
        if (textFontStyleData != null) {
            return textFontStyleData.fontSize;
        }
        return 0;
    }

    public final Typeface LIZLLL() {
        if (((ConcurrentHashMap) this.LIZIZ).get(this.LIZJ) != null) {
            return (Typeface) ((ConcurrentHashMap) this.LIZIZ).get(this.LIZJ);
        }
        return Typeface.DEFAULT_BOLD;
    }

    public final List<TextFontStyleData> LJIIIZ() {
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
                Typeface LJIILL = LJIILL(textFontStyleData.LIZ);
                if (LJIILL != null) {
                    ((ConcurrentHashMap) this.LIZIZ).put(textFontStyleData.fileName, LJIILL);
                    textFontStyleData.LIZIZ = 1;
                } else {
                    textFontStyleData.LIZIZ = 2;
                }
            }
        }
        return new ArrayList(this.LIZ.values());
    }

    public final String LJII() {
        List<TextFontStyleData> LJIIIZ = LJIIIZ();
        if (!((ArrayList) LJIIIZ).isEmpty() && ((TextFontStyleData) ListProtector.get(LJIIIZ, 0)).LIZJ()) {
            return ((TextFontStyleData) ListProtector.get(LJIIIZ, 0)).fileName;
        }
        return null;
    }

    public static boolean LJIILJJIL(int i) {
        for (String str : LJI) {
            if (str.equals(LJIIJ().LJI(i))) {
                return true;
            }
        }
        return false;
    }

    public static Typeface LJIILL(String str) {
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

    public final Typeface LJ(int i) {
        if (i == 1) {
            if (((ConcurrentHashMap) this.LIZIZ).get(this.LIZLLL) != null) {
                return (Typeface) ((ConcurrentHashMap) this.LIZIZ).get(this.LIZLLL);
            }
            return Typeface.DEFAULT_BOLD;
        }
        return LIZLLL();
    }

    public final TextFontStyleData LJFF(int i) {
        return this.LIZ.get(LJI(i));
    }

    public final String LJI(int i) {
        if (i == 1) {
            return this.LIZLLL;
        }
        return this.LIZJ;
    }

    public final TextFontStyleData LJIIIIZZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.LIZ.get(str);
    }

    public final String LJIIJJI(Typeface typeface) {
        for (String str : ((ConcurrentHashMap) this.LIZIZ).keySet()) {
            if (typeface != null && typeface.equals(((ConcurrentHashMap) this.LIZIZ).get(str))) {
                return str;
            }
        }
        return "default";
    }

    public final Typeface LJIIL(String str) {
        if (TextUtils.isEmpty(str) || ((ConcurrentHashMap) this.LIZIZ).size() == 0) {
            return null;
        }
        Typeface typeface = (Typeface) ((ConcurrentHashMap) this.LIZIZ).get(str);
        if (typeface == null && this.LIZ.get(str) != null && (typeface = LJIILL(this.LIZ.get(str).LIZ)) != null) {
            ((ConcurrentHashMap) this.LIZIZ).put(str, typeface);
        }
        return typeface;
    }

    public final Typeface LJIILIIL(String str) {
        if (TextUtils.isEmpty(str) || this.LIZ.size() == 0) {
            return null;
        }
        for (TextFontStyleData textFontStyleData : this.LIZ.values()) {
            if (str.equals(textFontStyleData.fontName)) {
                return LJIIL(textFontStyleData.fileName);
            }
        }
        return null;
    }

    public final TextFontStyleData LJIIZILJ(Effect effect) {
        Typeface LJIILL;
        try {
            TextFontStyleData textFontStyleData = (TextFontStyleData) C6PB.LIZIZ().LJI(effect.getExtra(), TextFontStyleData.class);
            if (!TextUtils.isEmpty(textFontStyleData.fileName)) {
                TextFontStyleData textFontStyleData2 = this.LIZ.get(textFontStyleData.fileName);
                if (textFontStyleData2 == null) {
                    this.LIZ.put(textFontStyleData.fileName, textFontStyleData);
                    textFontStyleData2 = textFontStyleData;
                } else {
                    textFontStyleData2.fileName = textFontStyleData.fileName;
                    textFontStyleData2.fontName = textFontStyleData.fontName;
                    textFontStyleData2.fontSize = textFontStyleData.fontSize;
                    textFontStyleData2.title = textFontStyleData.title;
                    textFontStyleData2.enableBgColor = textFontStyleData.enableBgColor;
                    textFontStyleData2.enableMaskBlurLightColor = textFontStyleData.enableMaskBlurLightColor;
                }
                textFontStyleData2.LIZJ = effect;
                if (((ConcurrentHashMap) this.LIZIZ).get(textFontStyleData2.fileName) == null && !TextUtils.isEmpty(effect.getUnzipPath()) && C44687HgJ.LIZIZ(effect.getUnzipPath())) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(effect.getUnzipPath());
                    String str = File.separator;
                    LIZ.append(str);
                    LIZ.append(textFontStyleData2.fileName);
                    Typeface LJIILL2 = LJIILL(X1D.LIZIZ(LIZ));
                    if (LJIILL2 != null) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(effect.getUnzipPath());
                        LIZ2.append(str);
                        LIZ2.append(textFontStyleData2.fileName);
                        textFontStyleData2.LIZ = X1D.LIZIZ(LIZ2);
                        textFontStyleData2.LIZIZ = 1;
                        ((ConcurrentHashMap) this.LIZIZ).put(textFontStyleData2.fileName, LJIILL2);
                        LJIILLIIL(textFontStyleData2, true, null);
                        return textFontStyleData2;
                    }
                    for (File file : new File(effect.getUnzipPath()).listFiles()) {
                        if (file.isFile() && !file.getAbsolutePath().endsWith(".json") && (LJIILL = LJIILL(file.getAbsolutePath())) != null) {
                            textFontStyleData2.LIZ = file.getAbsolutePath();
                            textFontStyleData2.LIZIZ = 1;
                            ((ConcurrentHashMap) this.LIZIZ).put(textFontStyleData2.fileName, LJIILL);
                            LJIILLIIL(textFontStyleData2, true, null);
                            return textFontStyleData2;
                        }
                    }
                }
            }
            return textFontStyleData;
        } catch (Exception e) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("parseTextFontStyleData err: ");
            LIZ3.append(e.getMessage());
            H7B.LIZJ(X1D.LIZIZ(LIZ3));
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public final void LJIJ(Context context) {
        LJIJI(context, Boolean.FALSE);
    }

    public final void LJIJJ(EffectChannelResponse effectChannelResponse) {
        Iterator<Effect> it = effectChannelResponse.getAllCategoryEffects().iterator();
        while (it.hasNext()) {
            LJIIZILJ(it.next());
        }
        if (this.LJ != null && !this.LIZ.isEmpty()) {
            this.LJ.accept(new ArrayList(this.LIZ.values()));
        }
        if (effectChannelResponse.getAllCategoryEffects().isEmpty()) {
            WPZ.LIZIZ.LJ("text", "", "", false);
        } else {
            WPZ.LIZIZ.LJ("text", "", "", true);
        }
        for (String str : this.LIZ.keySet()) {
            if (((ConcurrentHashMap) this.LIZIZ).get(str) == null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("text font ");
                LIZ.append(str);
                LIZ.append(" is null");
                H7B.LJ(X1D.LIZIZ(LIZ));
                AnonymousClass699.LIZ().LJJJJLI(AnonymousClass699.LIZIZ().LIZ, false, true, new IDObjectS384S0100000_2(this, 6));
                return;
            }
        }
    }

    public final void LJIL(int i) {
        List<TextFontStyleData> LJIIIZ = LJIIIZ();
        if (!((ArrayList) LJIIIZ).isEmpty() && ((TextFontStyleData) ListProtector.get(LJIIIZ, 0)).LIZJ()) {
            LJIJJLI(i, ((TextFontStyleData) ListProtector.get(LJIIIZ, 0)).fileName);
        }
    }

    public final void LIZ(TextFontStyleData textFontStyleData, Effect effect) {
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
    }

    public final void LIZIZ(final String str, final C68O c68o) {
        if (((ConcurrentHashMap) this.LIZIZ).get(str) == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("text font ");
            LIZ.append(str);
            LIZ.append(" is null");
            H7B.LJ(X1D.LIZIZ(LIZ));
            AnonymousClass699.LIZ().LJJJJLI(AnonymousClass699.LIZIZ().LIZ, false, true, new IFetchEffectChannelListener() { // from class: X.68N
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
                public final void onFail(ExceptionResult exceptionResult) {
                    c68o.LIZ(Boolean.FALSE);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("textFontDownload err: ");
                    LIZ2.append(exceptionResult.getMsg());
                    H7B.LIZJ(X1D.LIZIZ(LIZ2));
                    c68o.onFail();
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                    Iterator<Effect> it = effectChannelResponse.getAllCategoryEffects().iterator();
                    boolean z = false;
                    while (it.hasNext()) {
                        TextFontStyleData LJIIZILJ = C68M.this.LJIIZILJ(it.next());
                        if (LJIIZILJ != null && TextUtils.equals(LJIIZILJ.fontName, str)) {
                            c68o.LIZ(Boolean.TRUE);
                            z = true;
                        }
                        c68o.onSuccess();
                    }
                    if (!z) {
                        c68o.LIZ(Boolean.FALSE);
                    }
                }
            });
            return;
        }
        c68o.onSuccess();
        c68o.LIZ(Boolean.TRUE);
    }

    public final void LJIJI(Context context, Boolean bool) {
        if (context == null) {
            return;
        }
        IDObjectS384S0100000_2 iDObjectS384S0100000_2 = new IDObjectS384S0100000_2(this, 5);
        if (bool.booleanValue()) {
            AnonymousClass699.LIZ().LJJJJLI(AnonymousClass699.LIZIZ().LIZ, true, false, iDObjectS384S0100000_2);
        } else if (e1.LIZ(31744, "creative_tools_textfont_request_frequency", true, false)) {
            C10K.LIZJ(new ACallableS105S0100000_2(iDObjectS384S0100000_2, 25));
        } else {
            AnonymousClass699.LIZ().LJJJJLI(AnonymousClass699.LIZIZ().LIZ, false, false, iDObjectS384S0100000_2);
        }
    }

    public final void LJIJJLI(int i, String str) {
        if (i == 1) {
            this.LIZLLL = str;
        } else {
            this.LIZJ = str;
        }
    }

    public static void LJIILLIIL(TextFontStyleData textFontStyleData, boolean z, Exception exc) {
        C68P c68p = AnonymousClass699.LIZLLL;
        if (c68p != null) {
            c68p.LIZ(textFontStyleData, z, exc);
        }
    }
}

package com.lynx.tasm.behavior.shadow.text;

import X.C03880Dg;
import X.C39519Ff9;
import X.C61590OFe;
import X.C61592OFg;
import X.C65300Pk0;
import X.C74069T5d;
import X.C74071T5f;
import X.C79234V7u;
import X.C79689VPh;
import X.C79690VPi;
import X.C79691VPj;
import X.C79694VPm;
import X.C79696VPo;
import X.C79729VQv;
import X.C79732VQy;
import X.C79743VRj;
import X.C79745VRl;
import X.C79747VRn;
import X.C79748VRo;
import X.C79749VRp;
import X.C79750VRq;
import X.C79751VRr;
import X.C79754VRu;
import X.C79756VRw;
import X.C79758VRy;
import X.C79759VRz;
import X.F5B;
import X.V9Y;
import X.V9Z;
import X.VNU;
import X.VP2;
import X.VPD;
import X.VQ3;
import X.VQC;
import X.VRD;
import X.VRO;
import X.VRP;
import X.VRQ;
import X.X1D;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.TypedValue;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.shadow.LayoutNode;
import com.lynx.tasm.behavior.shadow.NativeLayoutNodeRef;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.ui.utils.BackgroundDrawable;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public class BaseTextShadowNode extends ShadowNode {
    public static Method LJJIIZI = null;
    public static Object LJJIJ = null;
    public static boolean LJJIJIIJI = true;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public boolean LJJ;
    public boolean LJJI;
    public boolean LJJIFFI;
    public boolean LJJII;
    public int LJJIII;
    public boolean LJJIIJ;
    public int LJJIIJZLJL;
    public boolean LJJIIZ;
    public float LJIL = 1.0E21f;
    public final C79743VRj LJIJI = new C79743VRj();

    public static Object LJJIIZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-8784305695260550510"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public final void LJJIJIL() {
        this.LJJIFFI = true;
        for (int i = 0; i < LJIILJJIL(); i++) {
            ShadowNode LJIILIIL = LJIILIIL(i);
            if (LJIILIIL instanceof BaseTextShadowNode) {
                ((BaseTextShadowNode) LJIILIIL).LJJIJIL();
            }
        }
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public void LJIJJLI(VNU vnu) {
        this.LJIIL = vnu;
        this.LJJ = LJIILL().LLF;
        this.LJJI = LJIILL().LLFFF;
        this.LJIJI.LJIJ = LJIILL().LLIFFJFJJ;
    }

    public final CharSequence LJJIJ(RawTextShadowNode rawTextShadowNode) {
        if (!this.LJJIIZ || !LJJIJIIJI) {
            return LJJIJIIJI(rawTextShadowNode);
        }
        try {
            return (CharSequence) LJJIIZ(LJJIJ, LJJIIZI, new Object[]{LJJIJIIJI(rawTextShadowNode)});
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("process emoji: ");
            LIZ.append(e);
            LLog.LIZLLL(3, "lynx_BaseTextShadowNode", X1D.LIZIZ(LIZ));
            return LJJIJIIJI(rawTextShadowNode);
        }
    }

    public final CharSequence LJJIJIIJI(RawTextShadowNode rawTextShadowNode) {
        int i;
        if (rawTextShadowNode.LJIJJ) {
            String str = rawTextShadowNode.LJIJI;
            boolean z = this.LJJIFFI;
            if (str == null) {
                return null;
            }
            int length = str.length();
            StringBuilder sb = new StringBuilder(length);
            int i2 = 0;
            while (i2 < length) {
                if (str.charAt(i2) == '\\' && (i = i2 + 1) < length) {
                    StringBuilder sb2 = new StringBuilder();
                    for (i = i2 + 1; i < length && i < i2 + 5; i++) {
                        char charAt = str.charAt(i);
                        if ((charAt >= '0' && charAt <= '9') || ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z'))) {
                            sb2.append(charAt);
                        }
                    }
                    try {
                        sb.append((char) CastIntegerProtector.parseInt(sb2.toString(), 16));
                        i2 += sb2.length();
                    } catch (Exception unused) {
                        sb.append(str.charAt(i2));
                    }
                } else {
                    sb.append(str.charAt(i2));
                }
                if (z && sb.length() > 0 && !Character.isHighSurrogate(sb.charAt(sb.length() - 1))) {
                    sb.append((char) 8203);
                }
                i2++;
            }
            return sb.toString();
        }
        return C79234V7u.LJI(rawTextShadowNode.LJIJI, this.LJJIFFI);
    }

    public final void LJJIJL(boolean z) {
        this.LJIJJ = z;
        setFontSize(this.LJIJI.LJIILIIL);
        for (int i = 0; i < LJIILJJIL(); i++) {
            ShadowNode LJIILIIL = LJIILIIL(i);
            if (LJIILIIL instanceof BaseTextShadowNode) {
                ((BaseTextShadowNode) LJIILIIL).LJJIJL(this.LJIJJ);
            }
        }
    }

    public final void LJJIJLIJ(float f) {
        this.LJIL = f;
        if (this.LJIJJLI && f != 1.0E21f && !this.LJJ) {
            f = V9Y.LIZ((int) V9Y.LIZIZ(f));
        } else if (this.LJIJJ) {
            f = TypedValue.applyDimension(2, V9Y.LIZIZ(f), DisplayMetricsHolder.LIZIZ()) * this.LJIIL.LIZ().getResources().getConfiguration().fontScale;
        }
        C79743VRj c79743VRj = this.LJIJI;
        if (c79743VRj.LJIIJ != f) {
            c79743VRj.LJIIJ = f;
            LJIIIIZZ();
        }
    }

    @VPD(name = "custom-baseline-shift")
    public void setBaselineShift(String str) {
        try {
            try {
                if (str.contains("px")) {
                    float parseFloat = Float.parseFloat(str.substring(0, str.indexOf("px")).trim());
                    this.LJIJI.LJIILL = V9Y.LIZ(parseFloat);
                    this.LJIJI.LJFF = 3;
                } else if (str.contains("%")) {
                    String trim = str.substring(0, str.indexOf("%")).trim();
                    C79743VRj c79743VRj = this.LJIJI;
                    float parseFloat2 = Float.parseFloat(trim) * 0.01f;
                    C79743VRj c79743VRj2 = this.LJIJI;
                    c79743VRj.LJIILL = parseFloat2 * c79743VRj2.LJIILIIL;
                    c79743VRj2.LJFF = 3;
                } else {
                    float parseFloat3 = Float.parseFloat(str.trim());
                    C79743VRj c79743VRj3 = this.LJIJI;
                    c79743VRj3.LJIILL = parseFloat3 * c79743VRj3.LJIILIIL;
                    c79743VRj3.LJFF = 3;
                }
            } catch (Exception e) {
                LLog.LIZLLL(4, "BaseTextShadowNode", e.toString());
                C79743VRj c79743VRj4 = this.LJIJI;
                c79743VRj4.LJIILL = 0.0f;
                c79743VRj4.LJFF = -1;
            }
        } finally {
            LJIIIIZZ();
        }
    }

    @VPD(name = "color")
    public void setColor(F5B f5b) {
        ReadableType type = f5b.getType();
        ReadableType readableType = ReadableType.Array;
        if (type == readableType) {
            ReadableArray asArray = f5b.asArray();
            if (asArray.size() < 2 || asArray.getType(1) != readableType) {
                this.LJIJI.LJJIII = null;
            } else {
                int i = asArray.getInt(0);
                if (i == 2) {
                    this.LJIJI.LJJIII = new VRQ(asArray.getArray(1));
                    if (this.LJJII) {
                        this.LJIJI.LJJIII.LJII(true);
                    }
                } else if (i == 3) {
                    this.LJIJI.LJJIII = new VRO(asArray.getArray(1));
                } else {
                    this.LJIJI.LJJIII = null;
                }
            }
        } else if (f5b.getType() == ReadableType.Int) {
            this.LJIJI.LIZJ = Integer.valueOf(f5b.asInt());
            this.LJIJI.LJJIII = null;
        } else if (f5b.getType() == ReadableType.Long) {
            this.LJIJI.LIZJ = Integer.valueOf((int) f5b.asLong());
            this.LJIJI.LJJIII = null;
        } else {
            C79743VRj c79743VRj = this.LJIJI;
            c79743VRj.LIZJ = null;
            c79743VRj.LJJIII = null;
        }
        LJIIIIZZ();
    }

    @VPD(defaultInt = 0, name = "direction")
    public void setDirection(int i) {
        this.LJIJI.LJ = i;
        LJIIIIZZ();
    }

    @VPD(name = "bitmap-gradient")
    public void setEnableBitmapGradient(boolean z) {
        this.LJJII = z;
        VRP vrp = this.LJIJI.LJJIII;
        if (vrp != null) {
            vrp.LJII(z);
        }
    }

    @VPD(name = "android-emoji-compat")
    public void setEnableEmojiCompat(boolean z) {
        this.LJJIIZ = z;
        if (z && LJJIJIIJI && LJJIIZI == null) {
            try {
                Class<?> cls = Class.forName("androidx.emoji2.text.f");
                LJJIJ = cls.getDeclaredMethod("get", new Class[0]).invoke(null, new Object[0]);
                LJJIIZI = cls.getDeclaredMethod("process", CharSequence.class);
            } catch (Exception e) {
                LJJIJIIJI = false;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("enable emoji e: ");
                LIZ.append(e);
                LLog.LIZLLL(4, "lynx_BaseTextShadowNode", X1D.LIZIZ(LIZ));
            }
        }
        LJIIIIZZ();
    }

    @VPD(name = "enable-font-scaling")
    public void setEnableFontScaling(String str) {
        LJJIJL(Boolean.parseBoolean(str));
    }

    @VPD(name = "font-family")
    public void setFontFamily(String str) {
        if (str == null) {
            if (!TextUtils.isEmpty(this.LJIJI.LJIJI)) {
                this.LJIJI.LJIJI = null;
                LJIIIIZZ();
                return;
            }
            return;
        }
        if (!str.equals(this.LJIJI.LJIJI)) {
            this.LJIJI.LJIJI = str;
            LJIIIIZZ();
        }
    }

    @VPD(defaultFloat = 1.0E21f, name = "font-size")
    public void setFontSize(float f) {
        if (f != 1.0E21f) {
            f = Math.round(f);
        }
        if (this.LJIJJ) {
            f = TypedValue.applyDimension(2, V9Y.LIZIZ(f), DisplayMetricsHolder.LIZIZ()) * this.LJIIL.LIZ().getResources().getConfiguration().fontScale;
        }
        C79743VRj c79743VRj = this.LJIJI;
        float f2 = (int) f;
        if (c79743VRj.LJIILIIL != f2) {
            c79743VRj.LJIILIIL = f2;
        }
        LJIIIIZZ();
    }

    @VPD(defaultInt = 0, name = "font-style")
    public void setFontStyle(int i) {
        if (i == 0) {
            C79743VRj c79743VRj = this.LJIJI;
            if (c79743VRj.LJII != 0) {
                c79743VRj.LJII = 0;
                LJIIIIZZ();
                return;
            }
            return;
        }
        if (i != 1 && i != 2) {
            return;
        }
        C79743VRj c79743VRj2 = this.LJIJI;
        if (c79743VRj2.LJII == 2) {
            return;
        }
        c79743VRj2.LJII = 2;
        LJIIIIZZ();
    }

    @VPD(defaultInt = 0, name = "font-weight")
    public void setFontWeight(int i) {
        int i2 = 0;
        switch (i) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i2 = 1;
                break;
        }
        C79743VRj c79743VRj = this.LJIJI;
        if (i != c79743VRj.LJI) {
            c79743VRj.LJI = i;
            c79743VRj.LJII = i2;
            LJIIIIZZ();
        }
    }

    @VPD(name = "include-font-padding")
    public void setIncludeFontPadding(boolean z) {
        this.LJIJI.LJIJ = z;
        LJIIIIZZ();
    }

    @VPD(defaultFloat = 1.0E21f, name = "letter-spacing")
    public void setLetterSpacing(float f) {
        this.LJIJI.LJIIJJI = f;
        LJIIIIZZ();
    }

    @VPD(defaultFloat = 1.0E21f, name = "line-height")
    public void setLineHeight(float f) {
        if (!this.LJJ) {
            LJJIJLIJ(f);
        }
    }

    @VPD(defaultFloat = 0.0f, name = "line-spacing")
    public void setLineSpacing(float f) {
        if (this.LJJ) {
            this.LJIJI.LJIIL = f;
        } else {
            this.LJIJI.LJIIL = V9Y.LIZIZ(f);
        }
        LJIIIIZZ();
    }

    @VPD(defaultInt = 3, name = "text-align")
    public void setTextAlign(int i) {
        this.LJIJI.LIZLLL = i;
        LJIIIIZZ();
    }

    @VPD(name = "text-decoration")
    public void setTextDecoration(ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() != 3) {
            C79743VRj c79743VRj = this.LJIJI;
            c79743VRj.LJIL = 0;
            c79743VRj.LJJ = 4;
            c79743VRj.LJJI = 0;
            LJIIIIZZ();
            return;
        }
        int i = readableArray.getInt(0);
        int i2 = readableArray.getInt(1);
        int i3 = readableArray.getInt(2);
        C79743VRj c79743VRj2 = this.LJIJI;
        c79743VRj2.LJIL = i;
        c79743VRj2.LJJ = i2;
        c79743VRj2.LJJI = i3;
        LJIIIIZZ();
    }

    @VPD(name = "text-indent")
    public void setTextIndent(ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() != 2) {
            this.LJIJI.LJIILJJIL = null;
        } else {
            this.LJIJI.LJIILJJIL = new C79754VRu(readableArray);
        }
        LJIIIIZZ();
    }

    @VPD(name = "text-maxlength")
    public void setTextMaxLength(String str) {
        try {
            try {
                this.LJIJI.LIZIZ = Integer.valueOf(str).intValue();
                LJIIIIZZ();
            } catch (Throwable unused) {
                C79743VRj c79743VRj = this.LJIJI;
                c79743VRj.LIZIZ = -1;
            }
        } finally {
            C79743VRj c79743VRj2 = this.LJIJI;
            if (c79743VRj2.LIZIZ < 0) {
                c79743VRj2.LIZIZ = -1;
            }
        }
    }

    @VPD(name = "text-maxline")
    public void setTextMaxLine(String str) {
        try {
            try {
                this.LJIJI.LIZ = Integer.valueOf(str).intValue();
            } catch (Throwable unused) {
                C79743VRj c79743VRj = this.LJIJI;
                c79743VRj.LIZ = -1;
            }
        } finally {
            C79743VRj c79743VRj2 = this.LJIJI;
            if (c79743VRj2.LIZ < 0) {
                c79743VRj2.LIZ = -1;
            }
            LJIIIIZZ();
        }
    }

    @VPD(defaultInt = 0, name = "text-overflow")
    public void setTextOverflow(int i) {
        this.LJIJI.LJIIIZ = i;
        LJIIIIZZ();
    }

    @VPD(name = "text-shadow")
    public void setTextShadow(ReadableArray readableArray) {
        this.LJIJI.LJIJJLI = null;
        if (readableArray == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) C79729VQv.LIZIZ(readableArray);
        if (arrayList.size() == 0) {
            return;
        }
        this.LJIJI.LJIJJLI = (C79729VQv) ListProtector.get(arrayList, 0);
    }

    @VPD(name = "text-stroke-color")
    public void setTextStrokeColor(F5B f5b) {
        if (f5b.getType() == ReadableType.Int) {
            this.LJIJI.LJJIFFI = f5b.asInt();
        } else if (f5b.getType() == ReadableType.Long) {
            this.LJIJI.LJJIFFI = (int) f5b.asLong();
        } else {
            this.LJIJI.LJJIFFI = 0;
        }
        LJIIIIZZ();
    }

    @VPD(defaultFloat = 0.0f, name = "text-stroke-width")
    public void setTextStrokeWidth(float f) {
        this.LJIJI.LJJII = f;
        LJIIIIZZ();
    }

    @VPD(name = "text-vertical-align")
    public void setTextVerticalAlign(String str) {
        if ("top".equals(str)) {
            this.LJIJI.LJFF = 0;
        } else if ("center".equals(str)) {
            this.LJIJI.LJFF = 1;
        } else if ("bottom".equals(str)) {
            this.LJIJI.LJFF = 2;
        }
        LJIIIIZZ();
    }

    @VPD(name = "use-web-line-height")
    public void setUseWebLineHeight(boolean z) {
        if (this.LJIJJLI != z) {
            this.LJIJJLI = z;
            float f = this.LJIL;
            if (f != 1.0E21f) {
                setLineHeight(f);
            }
        }
    }

    @VPD(defaultInt = 0, name = "white-space")
    public void setWhiteSpace(int i) {
        this.LJIJI.LJIIIIZZ = i;
        LJIIIIZZ();
    }

    @VPD(name = "word-break")
    public void setWordBreakStrategy(int i) {
        if (i == 1) {
            if (this.LJJI) {
                LJJIJIL();
            } else {
                this.LJJIII = 1;
            }
        } else if (i == 0) {
            this.LJJIII = 2;
        } else {
            this.LJJIII = 0;
        }
        LJIIIIZZ();
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final void LJIIL(ShadowNode shadowNode, int i) {
        super.LJIIL(shadowNode, i);
        if (shadowNode instanceof BaseTextShadowNode) {
            ((BaseTextShadowNode) shadowNode).LJJIJL(this.LJIJJ);
        }
    }

    public void LJJIIJ(SpannableStringBuilder spannableStringBuilder, RawTextShadowNode rawTextShadowNode) {
        spannableStringBuilder.append(LJJIJ(rawTextShadowNode));
    }

    public void LJJIIZI(SpannableStringBuilder spannableStringBuilder, List<C79758VRy> list) {
        BackgroundDrawable backgroundDrawable;
        int length = spannableStringBuilder.length();
        int LJIILJJIL = LJIILJJIL();
        for (int i = 0; i < LJIILJJIL; i++) {
            ShadowNode LJIILIIL = LJIILIIL(i);
            if (LJIILIIL instanceof RawTextShadowNode) {
                RawTextShadowNode rawTextShadowNode = (RawTextShadowNode) LJIILIIL;
                if (rawTextShadowNode.LJIJI != null) {
                    LJJIIJ(spannableStringBuilder, rawTextShadowNode);
                }
            } else if (LJIILIIL instanceof AbsInlineImageShadowNode) {
                spannableStringBuilder.append("I");
                AbsInlineImageShadowNode absInlineImageShadowNode = (AbsInlineImageShadowNode) LJIILIIL;
                int length2 = spannableStringBuilder.length() - 1;
                int length3 = spannableStringBuilder.length();
                V9Z LJJIL = absInlineImageShadowNode.LJJIL();
                absInlineImageShadowNode.LJJJIL(LJJIL);
                LJJIL.LJLLILLLL = absInlineImageShadowNode.LJJIJL;
                VQ3 vq3 = absInlineImageShadowNode.LJJIJLIJ;
                if (vq3 != null && (backgroundDrawable = vq3.LIZIZ) != null) {
                    backgroundDrawable.setBounds(0, 0, (int) Math.ceil(((LayoutNode) absInlineImageShadowNode.LJI.LIZ).LJII()), (int) Math.ceil((int) ((LayoutNode) absInlineImageShadowNode.LJI.LIZ).LJFF()));
                    LJJIL.LJLLL = absInlineImageShadowNode.LJJIJLIJ;
                }
                LJJIL.LJLLJ = absInlineImageShadowNode.LJIJI.LJIILL;
                ArrayList arrayList = (ArrayList) list;
                arrayList.add(new C79758VRy(length2, length3, LJJIL));
                if (absInlineImageShadowNode.LJIJ()) {
                    arrayList.add(new C79758VRy(length2, length3, absInlineImageShadowNode.LJJIFFI()));
                }
                this.LJIJI.LJIILLIIL = true;
            } else if (LJIILIIL instanceof NativeLayoutNodeRef) {
                spannableStringBuilder.append("B");
                NativeLayoutNodeRef nativeLayoutNodeRef = (NativeLayoutNodeRef) LJIILIIL;
                int length4 = spannableStringBuilder.length() - 1;
                int length5 = spannableStringBuilder.length();
                nativeLayoutNodeRef.LJIJI = length4;
                nativeLayoutNodeRef.LJIJJ = length5;
                C79748VRo c79748VRo = new C79748VRo();
                C79689VPh c79689VPh = nativeLayoutNodeRef.LJIILIIL;
                if (c79689VPh != null) {
                    int i2 = c79689VPh.LIZ;
                    float f = c79689VPh.LIZIZ;
                    c79748VRo.LJLIL = i2;
                    c79748VRo.LJLILLLLZI = f;
                }
                C79758VRy c79758VRy = new C79758VRy(length4, length5, c79748VRo);
                ArrayList arrayList2 = (ArrayList) list;
                arrayList2.add(c79758VRy);
                arrayList2.add(new C79758VRy(length4, length5, nativeLayoutNodeRef.LJJIFFI()));
                this.LJIJI.LJIIZILJ = true;
            } else if (LJIILIIL instanceof BaseTextShadowNode) {
                BaseTextShadowNode baseTextShadowNode = (BaseTextShadowNode) LJIILIIL;
                C79743VRj c79743VRj = baseTextShadowNode.LJIJI;
                if (c79743VRj.LIZJ == null && c79743VRj.LJJII > 0.0f) {
                    Integer num = this.LJIJI.LIZJ;
                    if (num != null) {
                        c79743VRj.LIZJ = Integer.valueOf(num.intValue());
                    } else {
                        c79743VRj.LIZJ = -16777216;
                    }
                }
                baseTextShadowNode.LJJIIZI(spannableStringBuilder, list);
                C79743VRj c79743VRj2 = this.LJIJI;
                boolean z = c79743VRj2.LJIILLIIL;
                C79743VRj c79743VRj3 = baseTextShadowNode.LJIJI;
                c79743VRj2.LJIILLIIL = z | c79743VRj3.LJIILLIIL;
                c79743VRj2.LJIIZILJ |= c79743VRj3.LJIIZILJ;
                this.LJJIIJ = baseTextShadowNode.LJJIIJ | this.LJJIIJ;
            } else if (LJIILIIL instanceof TextSelectionShadowNode) {
                this.LJJIIJZLJL = ((TextSelectionShadowNode) LJIILIIL).LJIJI;
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Unexpected view type nested under text node: ");
                LIZ.append(LJIILIIL.getClass());
                throw new RuntimeException(X1D.LIZIZ(LIZ));
            }
        }
        int length6 = spannableStringBuilder.length();
        if (length6 > length) {
            LJJIIJZLJL(length, length6, list);
        }
    }

    public final void LJJIII(Layout layout, SpannableStringBuilder spannableStringBuilder, float f) {
        C79748VRo c79748VRo;
        int i;
        int i2;
        for (int i3 = 0; i3 < LJIILJJIL(); i3++) {
            ShadowNode LJIILIIL = LJIILIIL(i3);
            if (LJIILIIL instanceof NativeLayoutNodeRef) {
                NativeLayoutNodeRef nativeLayoutNodeRef = (NativeLayoutNodeRef) LJIILIIL;
                C79748VRo[] c79748VRoArr = (C79748VRo[]) spannableStringBuilder.getSpans(nativeLayoutNodeRef.LJIJI, nativeLayoutNodeRef.LJIJJ, C79748VRo.class);
                if (c79748VRoArr.length == 1) {
                    c79748VRo = c79748VRoArr[0];
                } else {
                    c79748VRo = null;
                }
                C79696VPo c79696VPo = new C79696VPo();
                int lineForOffset = layout.getLineForOffset(nativeLayoutNodeRef.LJIJI);
                int paragraphDirection = layout.getParagraphDirection(lineForOffset);
                float primaryHorizontal = layout.getPrimaryHorizontal(nativeLayoutNodeRef.LJIJI) + f;
                if (paragraphDirection == -1) {
                    if (c79748VRo == null) {
                        i2 = 0;
                    } else {
                        i2 = c79748VRo.LJLJL;
                    }
                    primaryHorizontal -= i2;
                }
                c79696VPo.LIZ = primaryHorizontal;
                if (c79748VRo != null) {
                    int lineTop = layout.getLineTop(lineForOffset);
                    int lineBottom = layout.getLineBottom(lineForOffset);
                    int lineAscent = layout.getLineAscent(lineForOffset);
                    int lineDescent = layout.getLineDescent(lineForOffset);
                    if (!c79748VRo.LJLJJL) {
                        i = (lineBottom - lineDescent) - c79748VRo.LJLJJLL;
                    } else {
                        int i4 = c79748VRo.LJLIL;
                        if (i4 != 4) {
                            if (i4 != 7) {
                                if (i4 != 11) {
                                    lineTop = (lineTop - lineAscent) + c79748VRo.LJLJI;
                                } else {
                                    lineTop = ((lineBottom + lineTop) - c79748VRo.LJLJJLL) / 2;
                                }
                            } else {
                                lineTop = lineBottom - c79748VRo.LJLJJLL;
                            }
                        }
                        i = lineTop;
                    }
                    c79696VPo.LIZIZ = i;
                }
                nativeLayoutNodeRef.nativeAlignNativeNode(nativeLayoutNodeRef.LIZ, c79696VPo.LIZIZ, c79696VPo.LIZ);
            } else if (LJIILIIL instanceof InlineTextShadowNode) {
                ((BaseTextShadowNode) LJIILIIL).LJJIII(layout, spannableStringBuilder, f);
            }
        }
    }

    public void LJJIIJZLJL(int i, int i2, List<C79758VRy> list) {
        boolean z;
        boolean z2;
        C79689VPh c79689VPh;
        boolean z3;
        int i3;
        if (this.LJIJI.LIZJ != null) {
            C79751VRr c79751VRr = new C79751VRr(this.LJIJI.LIZJ.intValue());
            C79743VRj c79743VRj = this.LJIJI;
            float f = c79743VRj.LJJII;
            if (f > 0.0f && (i3 = c79743VRj.LJJIFFI) != 0) {
                c79751VRr.LJLILLLLZI = i3;
                c79751VRr.LJLJI = f;
                this.LJJIIJ = true;
            }
            ((ArrayList) list).add(new C79758VRy(i, i2, c79751VRr));
        }
        C79743VRj c79743VRj2 = this.LJIJI;
        if (c79743VRj2.LJJ != 4 || c79743VRj2.LJJI != 0) {
            int i4 = c79743VRj2.LJIL;
            if ((i4 & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i4 & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z || z2) {
                C79743VRj c79743VRj3 = this.LJIJI;
                ((ArrayList) list).add(new C79758VRy(i, i2, new C79759VRz(z, z2, c79743VRj3.LJJ, c79743VRj3.LJJI)));
            }
        } else {
            if ((c79743VRj2.LJIL & 2) != 0) {
                ((ArrayList) list).add(new C79758VRy(i, i2, new LynxStrikethroughSpan()));
            }
            if ((this.LJIJI.LJIL & 1) != 0) {
                ((ArrayList) list).add(new C79758VRy(i, i2, new LynxUnderlineSpan()));
            }
        }
        C79743VRj c79743VRj4 = this.LJIJI;
        if (c79743VRj4.LJ == 0 && !this.LJJ) {
            Layout.Alignment LIZIZ = c79743VRj4.LIZIZ(false);
            C79743VRj c79743VRj5 = this.LJIJI;
            int i5 = c79743VRj5.LJ;
            if (c79743VRj5.LIZLLL == 3) {
                z3 = true;
            } else {
                z3 = false;
            }
            ((ArrayList) list).add(new C79749VRp(i, i2, LIZIZ, i5, z3, c79743VRj5));
        }
        if ((this.LJIJI.LJFF != -1 || ((c79689VPh = this.LJIILIIL) != null && c79689VPh.LIZ != 0)) && Build.VERSION.SDK_INT > 28) {
            C79743VRj c79743VRj6 = this.LJIJI;
            C79745VRl c79745VRl = new C79745VRl(c79743VRj6.LJFF, c79743VRj6.LJIILL);
            C79689VPh c79689VPh2 = this.LJIILIIL;
            if (c79689VPh2 != null) {
                int i6 = c79689VPh2.LIZ;
                float f2 = c79689VPh2.LIZIZ;
                c79745VRl.LJLIL = i6;
                c79745VRl.LJLILLLLZI = f2;
            }
            ((ArrayList) list).add(new C79758VRy(i, i2, c79745VRl));
        }
        if (!VQC.LIZ(this.LJIJI.LJIIJ)) {
            ((ArrayList) list).add(new C79758VRy(i, i2, new C79747VRn(this.LJIJI.LJIIJ, this.LJJ)));
        }
        if (this.LJIJI.LJIJJLI != null) {
            ((ArrayList) list).add(new C79758VRy(i, i2, new VRD(this.LJIJI.LJIJJLI)));
        }
        if (this.LJIJI.LJIIJJI != 1.0E21f) {
            ((ArrayList) list).add(new C79758VRy(i, i2, new C74069T5d(this.LJIJI.LJIIJJI)));
        }
        if (!TextUtils.isEmpty(this.LJIJI.LJIJI)) {
            C79743VRj c79743VRj7 = this.LJIJI;
            String str = c79743VRj7.LJIJI;
            int LIZJ = c79743VRj7.LIZJ();
            Typeface LIZJ2 = C61590OFe.LIZJ(LIZJ, LJIILL(), str);
            if (LIZJ2 == null) {
                C61592OFg.LIZ.LIZJ(LJIILL(), str, LIZJ, new VP2(this));
                if (C79732VQy.LIZIZ()) {
                    LIZJ2 = C79732VQy.LIZ();
                }
            }
            ((ArrayList) list).add(new C79758VRy(i, i2, new C79756VRw(LIZJ2)));
        }
        if (Build.VERSION.SDK_INT >= 28) {
            C79743VRj c79743VRj8 = this.LJIJI;
            ((ArrayList) list).add(new C79758VRy(i, i2, new C74071T5f(c79743VRj8.LJII, c79743VRj8.LJI)));
        } else {
            int i7 = this.LJIJI.LJII;
            if (i7 == 1 || i7 == 2) {
                ((ArrayList) list).add(new C79758VRy(i, i2, new StyleSpan(this.LJIJI.LIZJ())));
            }
        }
        if (this.LJIJI.LJJIII != null) {
            ((ArrayList) list).add(new C79758VRy(i, i2, new C79750VRq(this.LJIJI.LJJIII)));
        }
    }

    public final void LJJIJIIJIL(SpannableStringBuilder spannableStringBuilder, C79694VPm c79694VPm, C79691VPj c79691VPj) {
        for (int i = 0; i < LJIILJJIL(); i++) {
            ShadowNode LJIILIIL = LJIILIIL(i);
            if (LJIILIIL instanceof NativeLayoutNodeRef) {
                NativeLayoutNodeRef nativeLayoutNodeRef = (NativeLayoutNodeRef) LJIILIIL;
                C79690VPi LJJIII = nativeLayoutNodeRef.LJJIII(c79691VPj, c79694VPm);
                for (C79748VRo c79748VRo : (C79748VRo[]) spannableStringBuilder.getSpans(nativeLayoutNodeRef.LJIJI, nativeLayoutNodeRef.LJIJJ, C79748VRo.class)) {
                    int ceil = (int) Math.ceil(LJJIII.LIZ[0]);
                    int ceil2 = (int) Math.ceil(LJJIII.LIZ[1]);
                    int ceil3 = (int) Math.ceil(LJJIII.LIZ[2]);
                    c79748VRo.LJLJL = ceil;
                    c79748VRo.LJLJJLL = ceil2;
                    c79748VRo.LJLJLJ = ceil3;
                }
            } else if (LJIILIIL instanceof BaseTextShadowNode) {
                ((BaseTextShadowNode) LJIILIIL).LJJIJIIJIL(spannableStringBuilder, c79694VPm, c79691VPj);
            }
        }
    }
}

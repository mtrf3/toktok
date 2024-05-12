package com.bytedance.ies.xelement.text.text;

import X.C58387Mvn;
import X.C79234V7u;
import X.C79743VRj;
import X.C79758VRy;
import X.InterfaceC58371MvX;
import X.InterfaceC88472Yns;
import X.OJD;
import X.VEF;
import X.VNU;
import X.VPD;
import X.VQC;
import X.VS4;
import X.VS5;
import X.VS6;
import android.content.Context;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.ies.xelement.text.inlinetext.LynxInlineTextShadowNode;
import com.bytedance.ies.xelement.text.inlinetruncation.LynxInlineTruncationShadowNode;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.text.RawTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.TextShadowNode;
import defpackage.g0;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class LynxTextShadowNode extends TextShadowNode implements VEF {
    public static final OJD LJJJJLI = new OJD("^[\\s]+|[\\s]+$");
    public int LJJJJJ;
    public SpannableStringBuilder LJJJJJL;
    public String LJJJJIZL = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public InterfaceC88472Yns<? super Context, ? extends InterfaceC58371MvX> LJJJJL = C58387Mvn.LJLIL;

    @Override // com.lynx.tasm.behavior.shadow.text.TextShadowNode
    public final boolean LJJIZ() {
        return false;
    }

    @Override // com.lynx.tasm.behavior.shadow.text.TextShadowNode
    public final void LJJJ() {
        super.LJJJ();
        CharSequence charSequence = this.LJJIJIL;
        if (charSequence == null) {
            charSequence = "";
        }
        this.LJJJJJL = new SpannableStringBuilder(charSequence);
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode, com.lynx.tasm.behavior.shadow.ShadowNode
    public final void LJIJJLI(VNU vnu) {
        super.LJIJJLI(vnu);
        if (g0.LJJJ()) {
            VS5 LIZ = VS4.LIZ();
            InterfaceC88472Yns<? super Context, ? extends InterfaceC58371MvX> interfaceC88472Yns = this.LJJJJL;
            if (vnu != null) {
                InterfaceC58371MvX invoke = interfaceC88472Yns.invoke(vnu);
                o.LJIIJ(invoke, "<set-?>");
                LIZ.LIZ = invoke;
                return;
            }
            o.LJIIZILJ();
            throw null;
        }
    }

    public final float LJJJI(TextPaint textPaint) {
        CharSequence charSequence;
        int LJIILJJIL = LJIILJJIL();
        float f = 0.0f;
        for (int i = 0; i < LJIILJJIL; i++) {
            ShadowNode LJIILIIL = LJIILIIL(i);
            if ((LJIILIIL instanceof LynxInlineTruncationShadowNode) && (charSequence = ((TextShadowNode) LJIILIIL).LJJIJIL) != null) {
                f = Layout.getDesiredWidth(charSequence, textPaint) + f;
            }
        }
        return (float) Math.ceil(f + 0.5f);
    }

    @VPD(name = "ellipsize-mode")
    public final void setEllipsizeMode(String ellipsizeMode) {
        o.LJIIJ(ellipsizeMode, "ellipsizeMode");
        int hashCode = ellipsizeMode.hashCode();
        if (hashCode != 3056464) {
            if (hashCode == 3552336 && ellipsizeMode.equals("tail")) {
                setTextOverflow(1);
            }
        } else if (ellipsizeMode.equals("clip")) {
            setTextOverflow(0);
        }
        LJIIIIZZ();
    }

    @VPD(name = "richtype")
    public final void setRichType(String type) {
        float f;
        o.LJIIJ(type, "type");
        if (g0.LJJJ()) {
            this.LJJJJIZL = type;
            if (o.LJ(type, "bracket")) {
                C79743VRj c79743VRj = this.LJIJI;
                o.LJFF(c79743VRj, "this.textAttributes");
                if (VQC.LIZ(c79743VRj.LJIIJ)) {
                    f = 40.0f;
                } else {
                    C79743VRj c79743VRj2 = this.LJIJI;
                    o.LJFF(c79743VRj2, "this.textAttributes");
                    f = c79743VRj2.LJIIJ;
                }
                setLineHeight(f);
            }
            LJIIIIZZ();
        }
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode
    @VPD(name = "text-maxline")
    public void setTextMaxLine(String textMaxLine) {
        o.LJIIJ(textMaxLine, "textMaxLine");
        super.setTextMaxLine(textMaxLine);
        this.LJJJJJ = CastIntegerProtector.parseInt(textMaxLine);
        LJIIIIZZ();
    }

    @Override // X.VEF
    public final void LIZ(Typeface typeface, int i) {
        LJIIIIZZ();
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode
    public final void LJJIIJ(SpannableStringBuilder spannableStringBuilder, RawTextShadowNode node) {
        String str;
        o.LJIIJ(node, "node");
        String str2 = node.LJIJI;
        if (str2 != null) {
            str = C79234V7u.LJI(LJJJJLI.replace(str2, ""), false);
        } else {
            str = null;
        }
        if (g0.LJJJ()) {
            if (o.LJ(this.LJJJJIZL, "bracket")) {
                VNU LJIILL = LJIILL();
                C79743VRj c79743VRj = this.LJIJI;
                o.LJFF(c79743VRj, "this.textAttributes");
                spannableStringBuilder.append(VS6.LIZ(LJIILL, str, (int) c79743VRj.LJIIJ));
                return;
            }
            spannableStringBuilder.append((CharSequence) str);
            return;
        }
        spannableStringBuilder.append((CharSequence) str);
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode
    public final void LJJIIZI(SpannableStringBuilder spannableStringBuilder, List<C79758VRy> list) {
        if (g0.LJJJ()) {
            int LJIILJJIL = LJIILJJIL();
            for (int i = 0; i < LJIILJJIL; i++) {
                ShadowNode LJIILIIL = LJIILIIL(i);
                if (LJIILIIL instanceof LynxInlineTextShadowNode) {
                    LynxInlineTextShadowNode lynxInlineTextShadowNode = (LynxInlineTextShadowNode) LJIILIIL;
                    String str = this.LJJJJIZL;
                    lynxInlineTextShadowNode.getClass();
                    o.LJIIJ(str, "<set-?>");
                    lynxInlineTextShadowNode.LJJIJL = str;
                }
            }
        }
        super.LJJIIZI(spannableStringBuilder, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x02ee, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0332, code lost:
    
        if (r4 > 0) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0132, code lost:
    
        if (r9 != false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f4  */
    @Override // com.lynx.tasm.behavior.shadow.text.TextShadowNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LIZJ(com.lynx.tasm.behavior.shadow.LayoutNode r27, float r28, X.EnumC79692VPk r29, float r30, X.EnumC79692VPk r31) {
        /*
            Method dump skipped, instructions count: 935
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.text.text.LynxTextShadowNode.LIZJ(com.lynx.tasm.behavior.shadow.LayoutNode, float, X.VPk, float, X.VPk):long");
    }
}

package com.lynx.tasm.behavior.shadow.text;

import X.AbstractC79752VRs;
import X.C0XW;
import X.C61S;
import X.C79690VPi;
import X.C79691VPj;
import X.C79694VPm;
import X.C79696VPo;
import X.C79743VRj;
import X.C79744VRk;
import X.C79751VRr;
import X.C79754VRu;
import X.C79758VRy;
import X.InterfaceC79695VPn;
import X.VPD;
import X.VQC;
import X.VRS;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import com.bytedance.ies.xelement.text.inlinetruncation.LynxInlineTruncationShadowNode;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.tasm.behavior.shadow.LayoutNode;
import com.lynx.tasm.behavior.shadow.NativeLayoutNodeRef;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public class TextShadowNode extends BaseTextShadowNode implements InterfaceC79695VPn {
    public C79744VRk LJJIJIIJIL;
    public CharSequence LJJIJIL;
    public boolean LJJIJL;
    public boolean LJJIJLIJ;
    public boolean LJJIL;
    public boolean LJJIZ;
    public float LJJJ = Float.MIN_VALUE;
    public float LJJJI = Float.MAX_VALUE;
    public float LJJJIL = Float.MIN_VALUE;
    public C79694VPm LJJJJ;
    public C79691VPj LJJJJI;

    @Override // com.lynx.tasm.behavior.shadow.LayoutNode
    public final void LJIIIZ() {
        if (!(this instanceof LynxInlineTruncationShadowNode)) {
            this.LJJIJIIJIL = null;
            LJJJ();
        }
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final Object LJIILLIIL() {
        HashSet hashSet;
        if (this.LJJIJIIJIL == null) {
            return null;
        }
        boolean z = false;
        if (this.LJIJI.LJIIZILJ) {
            hashSet = new HashSet();
            CharSequence text = this.LJJIJIIJIL.LIZ.getText();
            for (int i = 0; i < LJIILJJIL(); i++) {
                ShadowNode LJIILIIL = LJIILIIL(i);
                if (LJIILIIL instanceof NativeLayoutNodeRef) {
                    NativeLayoutNodeRef nativeLayoutNodeRef = (NativeLayoutNodeRef) LJIILIIL;
                    if (text.charAt(nativeLayoutNodeRef.LJIJI) != "B".charAt(0)) {
                        hashSet.add(Integer.valueOf(nativeLayoutNodeRef.LJIIIIZZ));
                    }
                }
            }
        } else {
            hashSet = null;
        }
        C79744VRk c79744VRk = this.LJJIJIIJIL;
        Layout layout = c79744VRk.LIZ;
        C79743VRj c79743VRj = this.LJIJI;
        boolean z2 = c79743VRj.LJIILLIIL;
        if (this.LJJIJLIJ && c79743VRj.LIZLLL == 5) {
            z = true;
        }
        VRS vrs = new VRS(layout, z2, hashSet, z);
        vrs.LJ = this.LJJIIJZLJL;
        vrs.LJFF = c79744VRk.LIZJ;
        vrs.LJI = this.LJJIIJ;
        this.LJJIJIIJIL = null;
        return vrs;
    }

    public TextShadowNode() {
        if (!(this instanceof LynxInlineTruncationShadowNode)) {
            LJIIJ(this);
        }
    }

    public boolean LJJIZ() {
        if (LJIILJJIL() != 1 || !(LJIILIIL(0) instanceof RawTextShadowNode) || !VQC.LIZ(this.LJIJI.LJIIJ)) {
            return false;
        }
        return true;
    }

    public void LJJJ() {
        boolean z;
        boolean z2;
        int i;
        if (LJJIZ()) {
            CharSequence LJJIJ = LJJIJ((RawTextShadowNode) LJIILIIL(0));
            this.LJJIJIL = LJJIJ;
            if (LJJIJ == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(this.LJJIJIL);
            LJJIIJZLJL(0, this.LJJIJIL.length(), arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C79758VRy) it.next()).LIZ(spannableStringBuilder);
            }
            this.LJJIJIL = spannableStringBuilder;
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        ArrayList arrayList2 = new ArrayList();
        LJJIIZI(spannableStringBuilder2, arrayList2);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ((C79758VRy) ListProtector.get(arrayList2, size)).LIZ(spannableStringBuilder2);
        }
        this.LJJIJIL = spannableStringBuilder2;
        AbstractC79752VRs[] abstractC79752VRsArr = (AbstractC79752VRs[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), AbstractC79752VRs.class);
        for (int i2 = 0; i2 < abstractC79752VRsArr.length; i2++) {
            if (this.LJJIZ || (i = abstractC79752VRsArr[i2].LJLIL) == 5 || i == 8 || i == 4 || i == 7 || i == 11) {
                z = true;
            } else {
                z = false;
            }
            this.LJJIZ = z;
            if (this.LJJIL || abstractC79752VRsArr[i2].LJLIL == 6) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.LJJIL = z2;
        }
        if (this.LJJIZ || this.LJJIL) {
            LJJIL(this);
        }
        float f = this.LJIJI.LJIIJ;
        if (f == 1.0E21f) {
            f = 0.0f;
        }
        C0XW c0xw = new C0XW(Arrays.asList(Float.valueOf(this.LJJJI), Float.valueOf(this.LJJJIL), Float.valueOf(this.LJJJ), Float.valueOf(f)));
        CharSequence charSequence = this.LJJIJIL;
        for (AbstractC79752VRs abstractC79752VRs : (AbstractC79752VRs[]) ((SpannableStringBuilder) charSequence).getSpans(0, charSequence.length(), AbstractC79752VRs.class)) {
            abstractC79752VRs.LJLJJI = c0xw;
            abstractC79752VRs.LJLJJL = LJIILL().LLF;
        }
    }

    public final void LJJIL(BaseTextShadowNode baseTextShadowNode) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(baseTextShadowNode.LJIJI.LJIILIIL);
        textPaint.setTypeface(Typeface.defaultFromStyle(baseTextShadowNode.LJIJI.LIZJ()));
        if (this.LJJIZ) {
            this.LJJJI = Math.min(textPaint.getFontMetrics().ascent, this.LJJJI);
            this.LJJJIL = Math.max(textPaint.getFontMetrics().descent, this.LJJJIL);
        }
        if (this.LJJIL) {
            textPaint.getTextBounds("x", 0, 1, new Rect());
            this.LJJJ = Math.max(this.LJJJ, r2.height());
        }
        for (int i = 0; i < baseTextShadowNode.LJIILJJIL(); i++) {
            ShadowNode LJIILIIL = baseTextShadowNode.LJIILIIL(i);
            if (LJIILIIL instanceof InlineTextShadowNode) {
                LJJIL((BaseTextShadowNode) LJIILIIL);
            }
        }
    }

    @VPD(name = "enable-full-justify")
    public void setEnableFullJustify(boolean z) {
        if (this.LJJIJLIJ != z) {
            LJIIIIZZ();
            this.LJJIJLIJ = z;
        }
    }

    @VPD(name = "tail-color-convert")
    public void setEnableTailColorConvert(boolean z) {
        this.LJJIJL = z;
        LJIIIIZZ();
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode
    @VPD(defaultFloat = 1.0E21f, name = "line-height")
    public void setLineHeight(float f) {
        LJJIJLIJ(f);
    }

    @Override // X.InterfaceC79695VPn
    public final void LIZIZ(C61S c61s, C79696VPo c79696VPo) {
        C79744VRk c79744VRk = this.LJJIJIIJIL;
        if (c79744VRk == null) {
            return;
        }
        LJJIII(c79744VRk.LIZ, (SpannableStringBuilder) this.LJJIJIL, c79744VRk.LIZJ);
    }

    @Override // X.InterfaceC79695VPn
    public final C79690VPi LIZLLL(C79691VPj c79691VPj, C79694VPm c79694VPm) {
        this.LJJJJ = c79694VPm;
        this.LJJJJI = c79691VPj;
        long LIZJ = LIZJ(this, c79694VPm.LIZ, c79694VPm.LIZIZ, c79694VPm.LIZJ, c79694VPm.LIZLLL);
        return new C79690VPi(Float.intBitsToFloat((int) ((LIZJ >> 32) & (-1))), Float.intBitsToFloat((int) (LIZJ & (-1))), (float) this.LJII);
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode
    public final void LJJIIJZLJL(int i, int i2, List<C79758VRy> list) {
        int i3;
        if (this.LJIJI.LJIILJJIL != null) {
            C79754VRu c79754VRu = this.LJIJI.LJIILJJIL;
            float LJII = ((LayoutNode) this.LJI.LIZ).LJII();
            int i4 = c79754VRu.LIZ;
            float f = c79754VRu.LIZIZ;
            if (i4 != 0) {
                f *= LJII;
            }
            ((ArrayList) list).add(new C79758VRy(i, i2, new LeadingMarginSpan.Standard((int) f, 0)));
        }
        super.LJJIIJZLJL(i, i2, list);
        if (this.LJIJI.LIZJ == null) {
            C79751VRr c79751VRr = new C79751VRr(-16777216);
            C79743VRj c79743VRj = this.LJIJI;
            float f2 = c79743VRj.LJJII;
            if (f2 > 0.0f && (i3 = c79743VRj.LJJIFFI) != 0) {
                c79751VRr.LJLILLLLZI = i3;
                c79751VRr.LJLJI = f2;
                this.LJJIIJ = true;
            }
            ((ArrayList) list).add(new C79758VRy(i, i2, c79751VRr));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x014b, code lost:
    
        if (r1 != (-1)) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long LIZJ(com.lynx.tasm.behavior.shadow.LayoutNode r21, float r22, X.EnumC79692VPk r23, float r24, X.EnumC79692VPk r25) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.shadow.text.TextShadowNode.LIZJ(com.lynx.tasm.behavior.shadow.LayoutNode, float, X.VPk, float, X.VPk):long");
    }
}

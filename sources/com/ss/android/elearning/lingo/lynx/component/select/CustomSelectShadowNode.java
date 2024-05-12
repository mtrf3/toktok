package com.ss.android.elearning.lingo.lynx.component.select;

import X.C58127Mrb;
import X.C79693VPl;
import X.C79697VPp;
import X.C79907VXr;
import X.EnumC79692VPk;
import X.InterfaceC79664VOi;
import X.NJO;
import X.TBP;
import X.VPD;
import X.X1D;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.behavior.shadow.LayoutNode;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class CustomSelectShadowNode extends ShadowNode implements InterfaceC79664VOi {
    public final TBP LJIJI;

    public CustomSelectShadowNode() {
        LJIIJJI(this);
        this.LJIJI = new TBP(C58127Mrb.LIZIZ.getApplicationContext());
    }

    @VPD(name = "enable-rtl")
    public final void enableRTL(boolean z) {
        TBP tbp = this.LJIJI;
        if (tbp != null) {
            if (z) {
                C79907VXr c79907VXr = tbp.LJLIL;
                if (c79907VXr != null) {
                    c79907VXr.setTextAlignment(3);
                }
            } else {
                C79907VXr c79907VXr2 = tbp.LJLIL;
                if (c79907VXr2 != null) {
                    c79907VXr2.setTextAlignment(2);
                }
            }
        }
        LJIIIIZZ();
    }

    @VPD(name = "fontSize")
    public final void setFontSize(int i) {
        TBP tbp = this.LJIJI;
        if (tbp != null) {
            tbp.setFontSize(i);
        }
        LJIIIIZZ();
    }

    @VPD(name = "text-models")
    public final void setTextModels(ReadableArray textModels) {
        o.LJIIIZ(textModels, "textModels");
        TBP tbp = this.LJIJI;
        if (tbp != null) {
            tbp.setTextModels(textModels);
        }
        LJIIIIZZ();
    }

    @Override // X.InterfaceC79664VOi
    public final long LIZJ(LayoutNode layoutNode, float f, EnumC79692VPk enumC79692VPk, float f2, EnumC79692VPk enumC79692VPk2) {
        int i;
        int makeMeasureSpec;
        TBP tbp = this.LJIJI;
        if (tbp == null) {
            return 0L;
        }
        if (enumC79692VPk == null) {
            i = -1;
        } else {
            i = C79693VPl.LIZ[enumC79692VPk.ordinal()];
        }
        int i2 = 0;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    makeMeasureSpec = 0;
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(1073741823, LiveLayoutPreloadThreadPriority.DEFAULT);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) f, LiveLayoutPreloadThreadPriority.DEFAULT);
            }
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) f, 1073741824);
        }
        if (enumC79692VPk2 != null) {
            int i3 = C79693VPl.LIZ[enumC79692VPk2.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        i2 = View.MeasureSpec.makeMeasureSpec(1073741823, LiveLayoutPreloadThreadPriority.DEFAULT);
                    }
                } else {
                    i2 = View.MeasureSpec.makeMeasureSpec((int) f2, LiveLayoutPreloadThreadPriority.DEFAULT);
                }
            } else {
                i2 = View.MeasureSpec.makeMeasureSpec((int) f2, 1073741824);
            }
        }
        tbp.measure(makeMeasureSpec, i2);
        NJO njo = NJO.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SHADOW-NODE:measure---");
        LIZ.append(tbp.getText());
        LIZ.append(tbp.hashCode());
        njo.LIZIZ("CustomSelectShadowNode", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("SHADOW-NODE:measure---origin size ");
        LIZ2.append(f);
        LIZ2.append('-');
        LIZ2.append(enumC79692VPk);
        LIZ2.append(' ');
        LIZ2.append(f2);
        LIZ2.append('-');
        LIZ2.append(enumC79692VPk2);
        njo.LIZIZ("CustomSelectShadowNode", X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("SHADOW-NODE:measured size ");
        LIZ3.append(tbp.getMeasuredWidth());
        LIZ3.append(' ');
        LIZ3.append(tbp.getMeasuredHeight());
        njo.LIZIZ("CustomSelectShadowNode", X1D.LIZIZ(LIZ3));
        return C79697VPp.LIZ(tbp.getMeasuredWidth(), tbp.getMeasuredHeight());
    }
}

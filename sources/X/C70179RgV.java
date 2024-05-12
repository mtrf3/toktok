package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButton;
import com.ss.android.ugc.aweme.utils.Au2S11S0300000_12;
import defpackage.a1;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.RgV, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70179RgV extends LinearLayout {
    public final LinkedList<C113724dE> LJLIL;
    public InterfaceC70181RgX LJLILLLLZI;
    public boolean LJLJI;

    public final boolean getEnableButtonVibration() {
        return this.LJLJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(List<PdpButton> list) {
        boolean z;
        int i;
        int LIZIZ;
        if (getChildCount() > 0) {
            LinkedList<C113724dE> linkedList = this.LJLIL;
            while (getChildCount() > 0) {
                View childAt = getChildAt(0);
                C16880lQ.LJLLL(childAt, this);
                if (childAt instanceof C113724dE) {
                    linkedList.add(childAt);
                }
            }
        }
        int i2 = 0;
        for (PdpButton pdpButton : list) {
            int i3 = i2 + 1;
            String str = null;
            if (i2 >= 0) {
                PdpButton pdpButton2 = pdpButton;
                C113724dE c113724dE = (C113724dE) ORS.LJJLJLI(this.LJLIL);
                if (c113724dE == null) {
                    Context context = getContext();
                    o.LJIIIIZZ(context, "context");
                    c113724dE = new C113724dE(context, null);
                }
                String str2 = pdpButton2.desc;
                if (str2 == null) {
                    Integer num = pdpButton2.descId;
                    if (num != null) {
                        str = c113724dE.getContext().getString(num.intValue());
                    }
                    str2 = str;
                }
                c113724dE.setText(str2);
                Integer num2 = pdpButton2.buttonStatus;
                int value = EnumC70052ReS.ENABLE.getValue();
                if (num2 == null || num2.intValue() != value) {
                    z = false;
                } else {
                    z = true;
                }
                c113724dE.setEnabled(z);
                c113724dE.setMaxLines(2);
                c113724dE.setSupportClickWhenDisable(true);
                c113724dE.setTextAlignment(4);
                c113724dE.setButtonSize(3);
                Integer num3 = pdpButton2.buttonStyle;
                int value2 = EnumC70180RgW.WHITE_STYLE.getValue();
                if (num3 == null || num3.intValue() != value2) {
                    int value3 = EnumC70180RgW.RED_STYLE.getValue();
                    if (num3 == null || num3.intValue() != value3) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                } else {
                    i = 5;
                }
                c113724dE.setButtonVariant(i);
                c113724dE.LJJJIL(true);
                C16880lQ.LJIIJ(new Au2S11S0300000_12(this, c113724dE, pdpButton2, i2, 0), c113724dE);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, C7MY.LIZIZ(44));
                if (i2 != 0) {
                    LIZIZ = C7MY.LIZIZ(8);
                } else {
                    LIZIZ = C7MY.LIZIZ(0);
                }
                layoutParams.setMarginStart(LIZIZ);
                layoutParams.weight = 1.0f;
                c113724dE.setLayoutParams(layoutParams);
                InterfaceC70181RgX interfaceC70181RgX = this.LJLILLLLZI;
                if (interfaceC70181RgX != null) {
                    interfaceC70181RgX.LIZIZ(c113724dE, pdpButton2);
                }
                addView(c113724dE);
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    public final void setEnableButtonVibration(boolean z) {
        this.LJLJI = z;
    }

    public final void setPdpBottomButtonListener(InterfaceC70181RgX pdpBottomButtonListener) {
        o.LJIIIZ(pdpBottomButtonListener, "pdpBottomButtonListener");
        this.LJLILLLLZI = pdpBottomButtonListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70179RgV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        setOrientation(0);
        setPadding(0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
        setBaselineAligned(false);
        this.LJLIL = new LinkedList<>();
    }
}

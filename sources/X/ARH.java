package X;

import Y.ACListenerS17S0301000_4;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ARH extends AbstractC243009gG {
    public final List<ARN> LJ;
    public final List<ARL> LJFF;

    @Override // X.ARS
    public final View LIZIZ() {
        int i;
        SY4 sy4;
        LinearLayout linearLayout = new LinearLayout((Context) this.LIZIZ);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        Iterator it = ((ArrayList) this.LJFF).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 >= 0) {
                ARL arl = (ARL) next;
                ARN arn = (ARN) ListProtector.get(this.LJ, i2);
                if (arl.LIZ == 1) {
                    sy4 = new ARR((Context) this.LIZIZ);
                    LIZLLL(sy4);
                    sy4.setTextColor(((ARJ) this.LIZJ).LJIIIZ);
                    sy4.setTuxFont(((ARJ) this.LIZJ).LIZLLL);
                } else {
                    sy4 = new SY4((Context) this.LIZIZ, null, 6, 0);
                    LIZLLL(sy4);
                    sy4.setTextColor(((ARJ) this.LIZJ).LJIIJ);
                    sy4.setButtonVariant(((ARJ) this.LIZJ).LJIJ);
                }
                sy4.setText(arl.LJFF);
                C16880lQ.LJJIZ(sy4, new ACListenerS17S0301000_4(arl, arn, this, i2, 1));
                sy4.setEnabled(arl.LJ);
                InterfaceC88472Yns<? super SY4, C76800UCe> interfaceC88472Yns = arl.LIZLLL;
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(sy4);
                }
                ((ArrayList) arl.LIZJ).add(sy4);
                linearLayout.addView(sy4);
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        int LIZIZ = C7MY.LIZIZ(18);
        int LIZIZ2 = C7MY.LIZIZ(18);
        int size = ((ArrayList) this.LJFF).size();
        if (size != 0) {
            if (size != 1) {
                i = C7MY.LIZIZ(4);
            } else {
                i = C7MY.LIZIZ(16);
            }
        } else {
            i = 0;
        }
        linearLayout.setPadding(LIZIZ, 0, LIZIZ2, i);
        return linearLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ARH(Context context) {
        super(context);
        o.LJIIIZ(context, "context");
        this.LJ = new ArrayList();
        this.LJFF = new ArrayList();
    }

    @Override // X.ARS
    public final void LIZ(C26231ARf dialog) {
        o.LJIIIZ(dialog, "dialog");
        this.LIZLLL = dialog;
        for (ARN arn : this.LJ) {
            arn.getClass();
            arn.LIZIZ = dialog;
        }
    }

    public final void LIZLLL(SY4 sy4) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)));
        sy4.setLayoutParams(layoutParams);
        sy4.setButtonSize(((ARJ) this.LIZJ).LJFF);
        sy4.setGravity(17);
    }

    public final void LJ(int i, InterfaceC88472Yns<? super ARN, C76800UCe> interfaceC88472Yns) {
        CharSequence text = ((Context) this.LIZIZ).getText(i);
        o.LJIIIIZZ(text, "context.getText(resId)");
        LJFF(text, interfaceC88472Yns);
    }

    public final void LJFF(CharSequence text, InterfaceC88472Yns<? super ARN, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(text, "text");
        LIZJ(0, text, interfaceC88472Yns);
    }

    public final void LJI(int i, InterfaceC88472Yns<? super ARN, C76800UCe> interfaceC88472Yns) {
        CharSequence text = ((Context) this.LIZIZ).getText(i);
        o.LJIIIIZZ(text, "context.getText(resId)");
        LJII(text, interfaceC88472Yns);
    }

    public final void LJII(CharSequence text, InterfaceC88472Yns<? super ARN, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(text, "text");
        LIZJ(1, text, interfaceC88472Yns);
    }

    public final void LIZJ(int i, CharSequence charSequence, InterfaceC88472Yns<? super ARN, C76800UCe> interfaceC88472Yns) {
        ((ArrayList) this.LJ).add(new ARN(((ArrayList) this.LJ).size()));
        ((ArrayList) this.LJFF).add(new ARL((ARJ) this.LIZJ, i, charSequence, interfaceC88472Yns));
    }
}

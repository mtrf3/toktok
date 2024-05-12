package X;

import Y.ACListenerS32S0100000_12;
import Y.ARunnableS23S0300000_12;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.text.Bidi;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.T4z, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74065T4z {
    public static final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(C8D1.LJLIL);
    public ViewGroup LIZ;
    public View.OnClickListener LJFF;
    public boolean LJI;
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1179));
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1176));
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1178));
    public final C62822Ol8 LJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1177));
    public final int LJII = R.layout.aug;

    public final ViewGroup LIZIZ() {
        ViewGroup viewGroup = this.LIZ;
        if (viewGroup != null) {
            return viewGroup;
        }
        o.LJIJI("contentView");
        throw null;
    }

    public final ViewGroup LIZJ() {
        Object value = this.LIZJ.getValue();
        o.LJIIIIZZ(value, "<get-expandContainer>(...)");
        return (ViewGroup) value;
    }

    public final ImageView LIZLLL() {
        Object value = this.LJ.getValue();
        o.LJIIIIZZ(value, "<get-expandImageView>(...)");
        return (ImageView) value;
    }

    public final TextView LJ() {
        Object value = this.LIZLLL.getValue();
        o.LJIIIIZZ(value, "<get-expandTextView>(...)");
        return (TextView) value;
    }

    public final TextView LJFF() {
        Object value = this.LIZIZ.getValue();
        o.LJIIIIZZ(value, "<get-txtDesc>(...)");
        return (TextView) value;
    }

    public final void LJI(ViewStub viewStub) {
        o.LJIIIZ(viewStub, "viewStub");
        if (viewStub.getParent() == null) {
            return;
        }
        viewStub.setLayoutResource(this.LJII);
        View inflate = viewStub.inflate();
        o.LJII(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.LIZ = (ViewGroup) inflate;
        this.LJI = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(int i, String str, InterfaceC88472Yns spanProcessor) {
        int i2;
        int i3;
        String LIZIZ;
        String str2;
        int i4;
        int i5;
        o.LJIIIZ(spanProcessor, "spanProcessor");
        if (!this.LJI) {
            return;
        }
        if (str == null || TextUtils.isEmpty(str)) {
            LIZIZ().setVisibility(8);
            return;
        }
        LIZIZ().setVisibility(0);
        if (C90193gN.LIZIZ(LJFF().getContext())) {
            i2 = -1;
        } else {
            i2 = -2;
        }
        boolean baseIsLeftToRight = new Bidi(str, i2).baseIsLeftToRight();
        TextView LJFF = LJFF();
        ViewGroup LIZJ = LIZJ();
        boolean LIZIZ2 = C90193gN.LIZIZ(LIZJ.getContext());
        ViewParent parent = LJFF.getParent();
        o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        boolean z = !baseIsLeftToRight;
        C16310kV.LJIIIZ((View) parent, z ? 1 : 0);
        if (baseIsLeftToRight) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        LJFF.setGravity(i3);
        LIZJ.setLayoutDirection(LIZIZ2 ? 1 : 0);
        new C13650gD(z).LIZ().LJFF(str);
        if (baseIsLeftToRight) {
            LIZIZ = C78920UyC.LIZ((char) 8237, str, (char) 8237);
        } else {
            LIZIZ = QZP.LIZIZ("(?<!^)(#)([a-zA-Z0-9])", str, "\u200e$1\u200e$2");
        }
        if (TextUtils.equals(LJFF().getText(), LIZIZ)) {
            return;
        }
        if (!TextUtils.isEmpty(LJFF().getText())) {
            TextView LJFF2 = LJFF();
            ViewGroup LIZJ2 = LIZJ();
            TextView LJ = LJ();
            ImageView LIZLLL = LIZLLL();
            LIZLLL.setSelected(false);
            LJ.setText(C86V.LJFF(R.string.g7k));
            LIZLLL.setRotation(0.0f);
            LJFF2.getLayoutParams().height = -2;
            ViewGroup.LayoutParams layoutParams = LIZJ2.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = ((Number) LJIIIIZZ.getValue()).intValue();
            LIZJ2.setLayoutParams(marginLayoutParams);
        }
        int LJIIJJI = (int) (KL2.LJIIJJI(LJFF().getContext()) - KL2.LIZJ(LJFF().getContext(), 32.0f));
        SpannableString spannableString = new SpannableString(LIZIZ);
        CharSequence text = LJ().getText();
        if (text == null || (str2 = text.toString()) == null) {
            str2 = "";
        }
        TextView LJFF3 = LJFF();
        TextPaint paint = LJFF().getPaint();
        C74064T4y c74064T4y = new C74064T4y(LJFF3, paint, LJIIJJI, str2, i);
        SpannableString spannableString2 = (SpannableString) spanProcessor.invoke(spannableString);
        DynamicLayout dynamicLayout = new DynamicLayout(spannableString2.toString(), paint, LJIIJJI, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (dynamicLayout.getLineCount() > c74064T4y.LIZJ) {
            int i6 = 1;
            c74064T4y.LIZLLL = true;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("...");
            LIZ.append(str2);
            float LIZJ3 = KL2.LIZJ(EF7.LIZIZ(), 5.0f) + paint.measureText(X1D.LIZIZ(LIZ)) + 45.0f;
            int lineStart = dynamicLayout.getLineStart(c74064T4y.LIZJ - 1);
            int lineStart2 = dynamicLayout.getLineStart(c74064T4y.LIZJ) - 1;
            float measureText = paint.measureText(spannableString2.subSequence(lineStart, lineStart2).toString());
            float f = (int) (LJIIJJI - LIZJ3);
            if (measureText > f) {
                float f2 = measureText - f;
                while (c74064T4y.LIZ.measureText(spannableString2.subSequence(lineStart2 - i6, lineStart2).toString()) <= f2 && (i6 = i6 + 1) < 15) {
                }
            } else {
                i6 = 0;
            }
            new SpannableString("");
            TextView textView = c74064T4y.LJ;
            if (textView != null) {
                if (C74064T4y.LIZIZ(c74064T4y.LIZIZ, textView, C74064T4y.LIZ(spannableString2, lineStart2, i6)) == C74064T4y.LIZIZ(c74064T4y.LIZIZ, c74064T4y.LJ, spannableString2)) {
                    c74064T4y.LIZLLL = false;
                } else {
                    spannableString2 = C74064T4y.LIZ(spannableString2, lineStart2, i6);
                }
            } else {
                spannableString2 = C74064T4y.LIZ(spannableString2, lineStart2, i6);
            }
        }
        LJFF().setText(spannableString2);
        if (!c74064T4y.LIZLLL) {
            LIZLLL().setVisibility(8);
            LJ().setVisibility(8);
            return;
        }
        TextView LJ2 = LJ();
        if (!TextUtils.isEmpty(LIZIZ)) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        LJ2.setVisibility(i4);
        ImageView LIZLLL2 = LIZLLL();
        if (!TextUtils.isEmpty(LIZIZ)) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        LIZLLL2.setVisibility(i5);
        LJFF().post(new ARunnableS23S0300000_12(this, spannableString, spannableString2, 6));
        TextView LJFF4 = LJFF();
        if (C8D2.LJLIL == null) {
            C8D2.LJLIL = new C8D2();
        }
        LJFF4.setOnTouchListener(C8D2.LJLIL);
        C16880lQ.LJIJI(LJ(), new ACListenerS32S0100000_12(this, 177));
    }
}

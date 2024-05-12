package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.Aau, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26516Aau extends LinearLayout {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    public final TuxTextView getDivider() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-divider>(...)");
        return (TuxTextView) value;
    }

    public final TuxTextView getMaxScore() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-maxScore>(...)");
        return (TuxTextView) value;
    }

    public final TuxTextView getScore() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-score>(...)");
        return (TuxTextView) value;
    }

    public final void setStyle(int i) {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.gv, context);
        getDivider().setTextColor(LJIIIIZZ);
        getMaxScore().setTextColor(LJIIIIZZ);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return;
                        }
                        TuxTextView score = getScore();
                        Context context2 = getContext();
                        o.LJIIIIZZ(context2, "context");
                        score.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context2));
                        TuxTextView maxScore = getMaxScore();
                        Context context3 = getContext();
                        o.LJIIIIZZ(context3, "context");
                        maxScore.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context3));
                        TuxTextView divider = getDivider();
                        Context context4 = getContext();
                        o.LJIIIIZZ(context4, "context");
                        divider.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context4));
                        getScore().setTuxFont(62);
                        getDivider().setTuxFont(61);
                        getMaxScore().setTuxFont(62);
                        return;
                    }
                    Context context5 = getContext();
                    o.LJIIIIZZ(context5, "context");
                    Integer LJI = C79045V0n.LJI(R.attr.go, context5);
                    if (LJI != null) {
                        getScore().setTextColor(LJI.intValue());
                    }
                    getScore().setTuxFont(13);
                    getDivider().setTuxFont(51);
                    getMaxScore().setTuxFont(51);
                    return;
                }
                TuxTextView score2 = getScore();
                Context context6 = getContext();
                o.LJIIIIZZ(context6, "context");
                score2.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context6));
                getScore().setTuxFont(12);
                getDivider().setTuxFont(71);
                getMaxScore().setTuxFont(71);
                return;
            }
            TuxTextView score3 = getScore();
            Context context7 = getContext();
            o.LJIIIIZZ(context7, "context");
            score3.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context7));
            getScore().setTuxFont(62);
            getDivider().setTuxFont(61);
            getMaxScore().setTuxFont(61);
            return;
        }
        getScore().setTextColor(LJIIIIZZ);
        getScore().setTuxFont(51);
        getDivider().setTuxFont(81);
        getMaxScore().setTuxFont(81);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26516Aau(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a6c, this, true);
        this.LJLIL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1247));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1245));
        this.LJLJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1246));
        setOrientation(0);
        getDivider().setText("/");
        getMaxScore().setText("5");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a6o});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…le.commerce_RatingNumber)");
        int i = obtainStyledAttributes.getInt(0, 3);
        obtainStyledAttributes.recycle();
        setStyle(i);
    }
}

package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.7YF, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7YF extends FrameLayout {
    public TuxTextView LJLIL;
    public FrameLayout LJLILLLLZI;

    public final void setFont(int i) {
        TuxTextView tuxTextView;
        if (i != 62) {
            if (i == 72 && (tuxTextView = this.LJLIL) != null) {
                tuxTextView.setPadding(C7MY.LIZIZ(4), C7MY.LIZIZ(0), C7MY.LIZIZ(4), O6R.LJJIIZ(C32151Nz.LJIIZILJ(0)));
            }
        } else {
            TuxTextView tuxTextView2 = this.LJLIL;
            if (tuxTextView2 != null) {
                tuxTextView2.setPadding(C7MY.LIZIZ(5), C7MY.LIZIZ(1), C7MY.LIZIZ(5), O6R.LJJIIZ(C32151Nz.LJIIZILJ(1)));
            }
        }
        TuxTextView tuxTextView3 = this.LJLIL;
        if (tuxTextView3 != null) {
            tuxTextView3.setTuxFont(i);
        }
    }

    public final void setText(int i) {
        TuxTextView tuxTextView = this.LJLIL;
        if (tuxTextView == null) {
            return;
        }
        tuxTextView.setText(getContext().getString(i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7YF(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7YF(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        Drawable background;
        Drawable background2;
        a1.LJFF(context, "context");
        if (C16880lQ.LLLZIIL(R.layout.bv_, C16880lQ.LLZIL(context), this) != null) {
            this.LJLIL = (TuxTextView) findViewById(R.id.gzu);
            this.LJLILLLLZI = (FrameLayout) findViewById(R.id.gzt);
            if (AnonymousClass636.LJIILJJIL(context)) {
                FrameLayout frameLayout = this.LJLILLLLZI;
                if (frameLayout != null && (background2 = frameLayout.getBackground()) != null) {
                    background2.setAlpha(71);
                }
                TuxTextView tuxTextView = this.LJLIL;
                if (tuxTextView == null) {
                    return;
                }
                tuxTextView.setAlpha(1.0f);
                return;
            }
            FrameLayout frameLayout2 = this.LJLILLLLZI;
            if (frameLayout2 != null && (background = frameLayout2.getBackground()) != null) {
                background.setAlpha(51);
            }
            TuxTextView tuxTextView2 = this.LJLIL;
            if (tuxTextView2 == null) {
                return;
            }
            tuxTextView2.setAlpha(1.0f);
        }
    }
}

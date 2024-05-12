package X;

import Y.ACListenerS23S0101000_4;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Adr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26699Adr extends FrameLayout {
    public final C119774mz LJLIL;
    public C26695Adn LJLILLLLZI;
    public C26695Adn LJLJI;
    public InterfaceC88471Ynr<? super Integer, ? super ReviewFilterStruct, C76800UCe> LJLJJI;

    public final C119774mz getFlow() {
        return this.LJLIL;
    }

    public final C26695Adn getInitClickView() {
        return this.LJLJI;
    }

    public final C26695Adn getLastClickView() {
        return this.LJLILLLLZI;
    }

    public final InterfaceC88471Ynr<Integer, ReviewFilterStruct, C76800UCe> getListener() {
        return this.LJLJJI;
    }

    public final void LIZ(List<ReviewFilterStruct> list) {
        if (this.LJLIL.getChildCount() != 0) {
            return;
        }
        this.LJLIL.removeAllViews();
        Iterator it = ((ArrayList) list).iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                ReviewFilterStruct reviewFilterStruct = (ReviewFilterStruct) next;
                Context context = getContext();
                o.LJIIIIZZ(context, "context");
                TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                Context context2 = getContext();
                o.LJIIIIZZ(context2, "context");
                tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context2));
                tuxTextView.setTuxFont(71);
                tuxTextView.setGravity(17);
                int i3 = C27162AlK.LJIIIZ;
                int i4 = C27162AlK.LJIILIIL;
                tuxTextView.setPadding(i3, i4, i3, i4);
                tuxTextView.setBackgroundResource(R.drawable.afw);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(reviewFilterStruct.name);
                LIZ.append(' ');
                LIZ.append(reviewFilterStruct.countStr);
                tuxTextView.setText(X1D.LIZIZ(LIZ));
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams.rightMargin = i3;
                marginLayoutParams.bottomMargin = i3;
                marginLayoutParams.setMarginEnd(i3);
                tuxTextView.setLayoutParams(marginLayoutParams);
                tuxTextView.setTag(reviewFilterStruct);
                C16880lQ.LJJJJI(tuxTextView, new ACListenerS23S0101000_4(i, this, 1));
                this.LJLIL.addView(tuxTextView);
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    public final void setInitClickView(C26695Adn c26695Adn) {
        this.LJLJI = c26695Adn;
    }

    public final void setLastClickView(C26695Adn c26695Adn) {
        this.LJLILLLLZI = c26695Adn;
    }

    public final void setListener(InterfaceC88471Ynr<? super Integer, ? super ReviewFilterStruct, C76800UCe> interfaceC88471Ynr) {
        this.LJLJJI = interfaceC88471Ynr;
    }

    public final void setOnSelectedChangeListener(InterfaceC88471Ynr<? super Integer, ? super ReviewFilterStruct, C76800UCe> interfaceC88471Ynr) {
        this.LJLJJI = interfaceC88471Ynr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26699Adr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        C119774mz c119774mz = new C119774mz(context, null, 6);
        c119774mz.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        c119774mz.setGravity(-1);
        this.LJLIL = c119774mz;
        addView(c119774mz);
    }
}

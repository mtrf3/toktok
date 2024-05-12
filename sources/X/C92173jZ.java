package X;

import Y.ACListenerS21S0100000_1;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.3jZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92173jZ extends FrameLayout {
    public final View LJLIL;

    public final void setOnClickNotNowListener(InterfaceC88472Yns<? super View, C76800UCe> interfaceC88472Yns) {
        ACListenerS21S0100000_1 aCListenerS21S0100000_1;
        SY4 sy4 = (SY4) this.LJLIL.findViewById(R.id.axl);
        if (interfaceC88472Yns != null) {
            aCListenerS21S0100000_1 = new ACListenerS21S0100000_1(interfaceC88472Yns, (InterfaceC88472Yns<? super View, C76800UCe>) 112);
        } else {
            aCListenerS21S0100000_1 = null;
        }
        C16880lQ.LJJIZ(sy4, aCListenerS21S0100000_1);
    }

    public final void setOnClickTurnOnListener(InterfaceC88472Yns<? super View, C76800UCe> interfaceC88472Yns) {
        ACListenerS21S0100000_1 aCListenerS21S0100000_1;
        SY4 sy4 = (SY4) this.LJLIL.findViewById(R.id.b05);
        if (interfaceC88472Yns != null) {
            aCListenerS21S0100000_1 = new ACListenerS21S0100000_1(interfaceC88472Yns, (InterfaceC88472Yns<? super View, C76800UCe>) 112);
        } else {
            aCListenerS21S0100000_1 = null;
        }
        C16880lQ.LJJIZ(sy4, aCListenerS21S0100000_1);
    }

    public final void setUnreadHint(int i) {
        TextView textView = (TextView) this.LJLIL.findViewById(R.id.mu2);
        if (i > 0) {
            String quantityString = getContext().getResources().getQuantityString(R.plurals.r0, i, Integer.valueOf(i));
            o.LJIIIIZZ(quantityString, "context.resources.getQua…al, unreadCnt, unreadCnt)");
            String valueOf = String.valueOf(i);
            int LJJLIIIJL = s.LJJLIIIJL(quantityString, valueOf, 0, false, 6);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(quantityString);
            if (LJJLIIIJL >= 0) {
                spannableStringBuilder.setSpan(new T5U(43, false), LJJLIIIJL, valueOf.length() + LJJLIIIJL, 33);
            }
            textView.setText(spannableStringBuilder);
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92173jZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.c52, this, true);
    }
}

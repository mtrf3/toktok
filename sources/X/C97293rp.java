package X;

import Y.ACListenerS21S0100000_1;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.3rp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97293rp extends ConstraintLayout {
    public InterfaceC88472Yns<? super String, C76800UCe> LJLIL;

    public final InterfaceC88472Yns<String, C76800UCe> getOnConfirm() {
        return this.LJLIL;
    }

    public final void setOnConfirm(InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        this.LJLIL = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C97293rp(ActivityC45651qj activityC45651qj, AttributeSet attributeSet, int i) {
        super(activityC45651qj, attributeSet, i);
        float f;
        new LinkedHashMap();
        View inflate = View.inflate(activityC45651qj, R.layout.b8r, this);
        View findViewById = inflate.findViewById(R.id.cad);
        o.LJIIIIZZ(findViewById, "root.findViewById(R.id.disclaimer_content)");
        TuxTextView tuxTextView = (TuxTextView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.cab);
        o.LJIIIIZZ(findViewById2, "root.findViewById(R.id.disclaimer_avatar)");
        ImageView imageView = (ImageView) findViewById2;
        if (C90193gN.LIZ()) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        imageView.setScaleX(f);
        View findViewById3 = inflate.findViewById(R.id.cac);
        o.LJIIIIZZ(findViewById3, "root.findViewById(R.id.disclaimer_confirm_btn)");
        View findViewById4 = inflate.findViewById(R.id.cag);
        o.LJIIIIZZ(findViewById4, "root.findViewById(R.id.disclaimer_title)");
        C96943rG LJFF = C96963rI.LJFF();
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(80));
        LJFF.getClass();
        C96943rG.LIZ(LJJIIZ, imageView);
        C96963rI.LJII().getClass();
        ((TextView) findViewById4).setText(C97343ru.LJI(R.string.cne, C97353rv.LIZJ()));
        C96963rI.LJII().getClass();
        C96963rI.LJII().getClass();
        C96963rI.LJII().getClass();
        tuxTextView.setText(C97343ru.LJI(R.string.cmp, C97353rv.LIZJ(), C97353rv.LIZJ(), C97353rv.LIZJ()));
        C96963rI.LJIIIZ().getClass();
        C97223ri.LIZIZ(tuxTextView, false);
        C16880lQ.LJJIZ((SY4) findViewById3, new ACListenerS21S0100000_1(this, 129));
    }
}

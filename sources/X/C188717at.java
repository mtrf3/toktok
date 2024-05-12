package X;

import Y.ACListenerS23S0100000_3;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.7at, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188717at extends LU7 {
    public InterfaceC65784Pro<C76800UCe> LJLJJL;
    public InterfaceC65784Pro<C76800UCe> LJLJJLL;

    @Override // X.LU7
    public final View LIZ() {
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, C7MY.LIZIZ(66)));
        C26338AVi.LJIIIZ(relativeLayout, C1FJ.LIZIZ(16), C1FJ.LIZIZ(16), C1FJ.LIZIZ(16), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))), 16);
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        layoutParams.addRule(16, R.id.i_7);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setId(R.id.i_9);
        tuxTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        tuxTextView.setTuxFont(42);
        tuxTextView.setTextColorRes(R.attr.go);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(tuxTextView);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        TuxTextView tuxTextView2 = new TuxTextView(context2, null, 6, 0);
        tuxTextView2.setId(R.id.i_9);
        tuxTextView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        tuxTextView2.setTuxFont(81);
        tuxTextView2.setTextColorRes(R.attr.go);
        tuxTextView2.setText(tuxTextView2.getContext().getString(R.string.qiv));
        tuxTextView2.setMaxLines(1);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(tuxTextView2);
        relativeLayout.addView(linearLayout);
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "context");
        SY4 sy4 = new SY4(context3, null, 6, 0);
        sy4.setId(R.id.i_7);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(O6R.LJJIIZ(C32151Nz.LJIIZILJ(80)), -2);
        layoutParams2.addRule(15);
        layoutParams2.addRule(16, R.id.i_6);
        layoutParams2.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
        sy4.setLayoutParams(layoutParams2);
        sy4.setText(sy4.getContext().getString(R.string.efd));
        sy4.setButtonSize(1);
        sy4.setButtonVariant(1);
        sy4.setTuxFont(52);
        relativeLayout.addView(sy4);
        Context context4 = getContext();
        o.LJIIIIZZ(context4, "context");
        SY4 sy42 = new SY4(context4, null, 6, 0);
        sy42.setId(R.id.i_6);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(O6R.LJJIIZ(C32151Nz.LJIIZILJ(80)), -2);
        layoutParams3.addRule(21);
        layoutParams3.addRule(15);
        sy42.setLayoutParams(layoutParams3);
        sy42.setButtonSize(1);
        sy42.setButtonVariant(0);
        sy42.setTuxFont(52);
        sy42.setText(sy42.getContext().getString(R.string.a9g));
        relativeLayout.addView(sy42);
        addView(relativeLayout);
        return relativeLayout;
    }

    public final void LIZLLL(User user) {
        o.LJIIIZ(user, "user");
        if (C99W.LIZ) {
            getView().findViewById(R.id.i_7).getClass();
            ((SY4) getView().findViewById(R.id.i_7)).setButtonVariant(5);
            getView().findViewById(R.id.i_6).getClass();
        }
        ((TextView) getView().findViewById(R.id.i_9)).setText(AV1.LIZLLL(user));
        C16880lQ.LJJIZ((SY4) getView().findViewById(R.id.i_7), new ACListenerS23S0100000_3(this, 142));
        C16880lQ.LJJIZ((SY4) getView().findViewById(R.id.i_6), new ACListenerS23S0100000_3(this, 143));
    }

    public final void setAcceptCallback(InterfaceC65784Pro<C76800UCe> onAccept) {
        o.LJIIIZ(onAccept, "onAccept");
        this.LJLJJL = onAccept;
    }

    public final void setDeleteCallback(InterfaceC65784Pro<C76800UCe> onDelete) {
        o.LJIIIZ(onDelete, "onDelete");
        this.LJLJJLL = onDelete;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C188717at(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }
}

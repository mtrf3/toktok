package X;

import Y.ACListenerS24S0100000_4;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.9Hw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C234409Hw extends LinearLayout {
    public C9HK LJLIL;

    public final TextView getTextView() {
        View findViewById = findViewById(R.id.c0j);
        o.LJIIIIZZ(findViewById, "this.findViewById<TuxTex…w>(R.id.cta_feature_text)");
        return (TextView) findViewById;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C234409Hw(Context context) {
        super(context, null, 0);
        int i;
        new LinkedHashMap();
        if (C2318698c.LIZ() >= 2) {
            i = 40;
        } else {
            i = 44;
        }
        int LIZIZ = C7MY.LIZIZ(i);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(R.id.c0e);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, LIZIZ);
        layoutParams.gravity = 17;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(linearLayout.getContext().getResources().getDrawable(R.drawable.bz3, linearLayout.getContext().getTheme()));
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.setId(R.id.c0i);
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(LIZIZ, LIZIZ));
        relativeLayout.setVisibility(8);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        TuxIconView tuxIconView = new TuxIconView(context2, null, 0, 6, null);
        tuxIconView.setId(R.id.c0f);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(C7MY.LIZIZ(24), C7MY.LIZIZ(24));
        layoutParams2.addRule(20);
        layoutParams2.addRule(21);
        layoutParams2.addRule(10);
        layoutParams2.addRule(12);
        tuxIconView.setLayoutParams(layoutParams2);
        tuxIconView.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)));
        tuxIconView.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)));
        tuxIconView.setTintColorRes(R.attr.go);
        relativeLayout.addView(tuxIconView);
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "context");
        AVS avs = new AVS(context3, null, 6);
        avs.setId(R.id.c0g);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(C7MY.LIZIZ(15), C7MY.LIZIZ(15));
        layoutParams3.addRule(20);
        layoutParams3.addRule(12);
        layoutParams3.bottomMargin = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
        layoutParams3.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)));
        avs.setLayoutParams(layoutParams3);
        avs.setVisibility(8);
        avs.setVariant(1);
        relativeLayout.addView(avs);
        Context context4 = getContext();
        o.LJIIIIZZ(context4, "context");
        AVS avs2 = new AVS(context4, null, 6);
        avs2.setId(R.id.c0h);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(C7MY.LIZIZ(8), C7MY.LIZIZ(8));
        layoutParams4.addRule(21);
        layoutParams4.addRule(10);
        layoutParams4.topMargin = O6R.LJJIIZ(C32151Nz.LJIIZILJ(8));
        layoutParams4.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
        avs2.setLayoutParams(layoutParams4);
        avs2.setVisibility(8);
        avs2.setVariant(0);
        relativeLayout.addView(avs2);
        linearLayout.addView(relativeLayout);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setId(R.id.c0l);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 17;
        layoutParams5.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
        layoutParams5.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
        linearLayout2.setLayoutParams(layoutParams5);
        linearLayout2.setVisibility(8);
        Context context5 = getContext();
        o.LJIIIIZZ(context5, "context");
        TuxTextView tuxTextView = new TuxTextView(context5, null, 6, 0);
        tuxTextView.setId(R.id.c0j);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, LIZIZ);
        layoutParams6.gravity = 17;
        tuxTextView.setLayoutParams(layoutParams6);
        tuxTextView.setGravity(17);
        tuxTextView.setTextColorRes(R.attr.go);
        tuxTextView.setTuxFont(42);
        tuxTextView.setMinTextSize(C32151Nz.LJIIZILJ(12));
        linearLayout2.addView(tuxTextView);
        Context context6 = getContext();
        o.LJIIIIZZ(context6, "context");
        AVS avs3 = new AVS(context6, null, 6);
        avs3.setId(R.id.c0k);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(C7MY.LIZIZ(15), C7MY.LIZIZ(15));
        layoutParams7.gravity = 17;
        layoutParams7.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)));
        avs3.setLayoutParams(layoutParams7);
        avs3.setVisibility(8);
        avs3.setVariant(1);
        linearLayout2.addView(avs3);
        linearLayout.addView(linearLayout2);
        C9AE.LIZ(linearLayout, C9AC.LIGHT_MASK, C32151Nz.LJIIZILJ(8));
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, LIZIZ);
        layoutParams8.gravity = 17;
        layoutParams8.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)));
        layoutParams8.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)));
        linearLayout3.setLayoutParams(layoutParams8);
        linearLayout3.addView(linearLayout);
        addView(linearLayout3);
    }

    public final void LIZ(C9HK newStyle) {
        o.LJIIIZ(newStyle, "newStyle");
        this.LJLIL = newStyle;
        int i = C9HJ.LIZ[newStyle.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                findViewById(R.id.c0l).setVisibility(0);
                findViewById(R.id.c0i).setVisibility(8);
                return;
            }
            findViewById(R.id.c0i).setVisibility(0);
            findViewById(R.id.c0l).setVisibility(8);
            return;
        }
        findViewById(R.id.c0l).setVisibility(0);
        findViewById(R.id.c0i).setVisibility(8);
    }

    public final void setComponentWidth(int i) {
        ((TextView) findViewById(R.id.c0j)).setWidth(i);
        View findViewById = findViewById(R.id.c0l);
        o.LJIIIIZZ(findViewById, "this.findViewById<Linear…a_feature_text_and_alert)");
        C26338AVi.LJI(findViewById, 0, 0, 0, 0, false, 16);
    }

    public final void setIconDebounceOnClickListener(InterfaceC65784Pro<C76800UCe> clickFunc) {
        o.LJIIIZ(clickFunc, "clickFunc");
        View findViewById = findViewById(R.id.c0f);
        if (findViewById != null) {
            C16880lQ.LJIIJ(new Au2S15S0100000_4(clickFunc, 81, 42), findViewById);
        }
    }

    public final void LIZIZ(C9HK c9hk, Integer num, InterfaceC65784Pro clickFunc) {
        o.LJIIIZ(clickFunc, "clickFunc");
        if (num != null) {
            num.intValue();
            ((TuxIconView) findViewById(R.id.c0f)).setIconRes(num.intValue());
        }
        setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS24S0100000_4(clickFunc, 258)));
        if (c9hk == null) {
            c9hk = C9HK.ICON;
        }
        LIZ(c9hk);
    }
}

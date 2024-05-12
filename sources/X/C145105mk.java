package X;

import Y.ACListenerS22S0100000_2;
import Y.ACListenerS37S0200000_2;
import Y.ARunnableS21S0200000_2;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.5mk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145105mk {
    public static final View LIZ(Context context, EnumC145125mm variant, InterfaceC88471Ynr<? super View, ? super View, C76800UCe> interfaceC88471Ynr, InterfaceC88471Ynr<? super View, ? super View, C76800UCe> interfaceC88471Ynr2) {
        o.LJIIIZ(variant, "variant");
        final View root = C16880lQ.LLLZIIL(R.layout.bzi, C16880lQ.LLZIL(context), null);
        if (root != null) {
            View findViewById = root.findViewById(R.id.f5g);
            o.LJIIIIZZ(findViewById, "findViewById(R.id.iv_intro_background)");
            final ImageView imageView = (ImageView) findViewById;
            View findViewById2 = root.findViewById(R.id.f5h);
            o.LJIIIIZZ(findViewById2, "findViewById(R.id.iv_intro_foreground)");
            final ImageView imageView2 = (ImageView) findViewById2;
            View findViewById3 = root.findViewById(R.id.m97);
            o.LJIIIIZZ(findViewById3, "findViewById(R.id.tv_intro_title)");
            TuxTextView tuxTextView = (TuxTextView) findViewById3;
            View findViewById4 = root.findViewById(R.id.m95);
            o.LJIIIIZZ(findViewById4, "findViewById(R.id.tv_intro_desc)");
            TextView textView = (TextView) findViewById4;
            View findViewById5 = root.findViewById(R.id.aws);
            findViewById5.getClass();
            o.LJIIIIZZ(findViewById5, "findViewById<TuxButton?>…seNewRadiusDesign(true) }");
            SY4 sy4 = (SY4) findViewById5;
            View findViewById6 = root.findViewById(R.id.awt);
            findViewById6.getClass();
            o.LJIIIIZZ(findViewById6, "findViewById<TuxButton?>…seNewRadiusDesign(true) }");
            SY4 sy42 = (SY4) findViewById6;
            View findViewById7 = root.findViewById(R.id.e99);
            o.LJIIIIZZ(findViewById7, "findViewById(R.id.ic_close_panel)");
            TuxIconView tuxIconView = (TuxIconView) findViewById7;
            int i = C145115ml.LIZ[variant.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    tuxTextView.setText(root.getResources().getString(R.string.jmd));
                    tuxTextView.setTuxFont(33);
                    textView.setVisibility(8);
                    sy42.setVisibility(8);
                    C26338AVi.LJI(sy4, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(32))), null, null, null, false, 30);
                    sy4.setText(root.getResources().getString(R.string.jmh));
                }
            } else {
                tuxTextView.setText(root.getResources().getString(R.string.jme));
                textView.setText(root.getResources().getString(R.string.jmd));
                sy42.setText(root.getResources().getString(R.string.jmc));
                sy4.setText(root.getResources().getString(R.string.jmb));
            }
            C16880lQ.LJJIZ(sy4, new ACListenerS37S0200000_2(interfaceC88471Ynr2, root, 19));
            C16880lQ.LJJIZ(sy42, new ACListenerS37S0200000_2(interfaceC88471Ynr, root, 20));
            C16880lQ.LJJJ(tuxIconView, new ACListenerS22S0100000_2(root, 162));
            root.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.5mj
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View v) {
                    o.LJIIIZ(v, "v");
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View v) {
                    o.LJIIIZ(v, "v");
                    root.postDelayed(new ARunnableS21S0200000_2(imageView, imageView2, 69), 500L);
                }
            });
        }
        o.LJIIIIZZ(root, "root");
        return root;
    }
}

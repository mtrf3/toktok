package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.9w0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC252769w0 extends LinearLayout implements View.OnClickListener {
    public final Context LJLIL;
    public final AttributeSet LJLILLLLZI;
    public final int LJLJI;
    public InterfaceC252779w1 LJLJJI;
    public final java.util.Map<Integer, View> LJLJJL;

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLJJL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final TextView getContextTextView() {
        TextView iv_context = (TextView) LIZ(R.id.f10);
        o.LJIIIIZZ(iv_context, "iv_context");
        return iv_context;
    }

    public final TextView getTitleTextView() {
        TextView iv_title = (TextView) LIZ(R.id.fbg);
        o.LJIIIIZZ(iv_title, "iv_title");
        return iv_title;
    }

    public final AttributeSet getAttrs() {
        return this.LJLILLLLZI;
    }

    public final int getDefStyleAttr() {
        return this.LJLJI;
    }

    public final InterfaceC252779w1 getMClickListener() {
        return this.LJLJJI;
    }

    public final Context getMContext() {
        return this.LJLIL;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer num;
        InterfaceC252779w1 interfaceC252779w1;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int id = LIZ(R.id.ezm).getId();
        if (num == null || num.intValue() != id) {
            int id2 = LIZ(R.id.f0h).getId();
            if (num == null || num.intValue() != id2) {
                int id3 = LIZ(R.id.f10).getId();
                if (num == null || num.intValue() != id3) {
                    int id4 = LIZ(R.id.fbg).getId();
                    if (num == null || num.intValue() != id4 || (interfaceC252779w1 = this.LJLJJI) == null) {
                        return;
                    }
                    interfaceC252779w1.LIZJ();
                    return;
                }
                InterfaceC252779w1 interfaceC252779w12 = this.LJLJJI;
                if (interfaceC252779w12 == null) {
                    return;
                }
                interfaceC252779w12.LIZJ();
                return;
            }
            InterfaceC252779w1 interfaceC252779w13 = this.LJLJJI;
            if (interfaceC252779w13 == null) {
                return;
            }
            interfaceC252779w13.LIZ();
            return;
        }
        InterfaceC252779w1 interfaceC252779w14 = this.LJLJJI;
        if (interfaceC252779w14 == null) {
            return;
        }
        interfaceC252779w14.LIZIZ();
    }

    public final void setButtonBackgroundDrawable(Drawable drawable) {
        o.LJIIIZ(drawable, "drawable");
        LIZ(R.id.ezm).setBackground(drawable);
    }

    public final void setButtonTextColor(int i) {
        ((TextView) LIZ(R.id.ezm)).setTextColor(i);
    }

    public final void setContextText(String text) {
        o.LJIIIZ(text, "text");
        ((TextView) LIZ(R.id.f10)).setText(text);
    }

    public final void setIconImage(Drawable drawable) {
        o.LJIIIZ(drawable, "drawable");
        ((ImageView) LIZ(R.id.f51)).setImageDrawable(drawable);
    }

    public final void setItemText(String text) {
        o.LJIIIZ(text, "text");
        ((TextView) LIZ(R.id.ezm)).setText(text);
    }

    public final void setMClickListener(InterfaceC252779w1 interfaceC252779w1) {
        this.LJLJJI = interfaceC252779w1;
    }

    public final void setOnInternalClickListener(InterfaceC252779w1 listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJJI = listener;
    }

    public final void setTitleText(int i) {
        ((TextView) LIZ(R.id.fbg)).setText(getContext().getResources().getText(i));
    }

    public final void setTitleTextColor(int i) {
        ((TextView) LIZ(R.id.fbg)).setTextColor(i);
    }

    public final void setTitleText(String text) {
        o.LJIIIZ(text, "text");
        ((TextView) LIZ(R.id.fbg)).setText(text);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC252769w0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJJL = C62850Ola.LJFF(context, "mContext");
        this.LJLIL = context;
        this.LJLILLLLZI = attributeSet;
        this.LJLJI = 0;
        LinearLayout.inflate(context, R.layout.c66, this);
        C16880lQ.LJJIZ((SY4) LIZ(R.id.ezm), this);
        C16880lQ.LJIILLIIL((ImageView) LIZ(R.id.f0h), this);
        C16880lQ.LJJJJI((TuxTextView) LIZ(R.id.f10), this);
        C16880lQ.LJJJJI((TuxTextView) LIZ(R.id.fbg), this);
        LIZ(R.id.ezm).setOnTouchListener(new AnonymousClass806(0.5f));
        LIZ(R.id.f0h).setOnTouchListener(new AnonymousClass806(0.5f));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a0w, R.attr.a0x, R.attr.a0y, R.attr.a0z, R.attr.a10, R.attr.a11, R.attr.a12, R.attr.a13});
        o.LJIIIIZZ(obtainStyledAttributes, "mContext.obtainStyledAtt…yleable.NoticeButtonView)");
        Drawable drawable = obtainStyledAttributes.getDrawable(3);
        if (drawable != null) {
            ((ImageView) LIZ(R.id.f51)).setImageDrawable(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
        if (drawable2 != null) {
            ((ImageView) LIZ(R.id.f0h)).setImageDrawable(drawable2);
        }
        ((TextView) LIZ(R.id.fbg)).setText(C16880lQ.LLLZLZ(obtainStyledAttributes, 6));
        ((TextView) LIZ(R.id.f10)).setText(C16880lQ.LLLZLZ(obtainStyledAttributes, 1));
        ((TextView) LIZ(R.id.ezm)).setText(C16880lQ.LLLZLZ(obtainStyledAttributes, 4));
        obtainStyledAttributes.recycle();
    }
}

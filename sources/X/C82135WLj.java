package X;

import Y.ACListenerS27S0100000_7;
import Y.ACListenerS34S0100000_14;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WLj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82135WLj extends LinearLayout {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final java.util.Map<Integer, View> LJLJJLL;

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    private final C170736mz getCloseImage() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-closeImage>(...)");
        return (C170736mz) value;
    }

    private final C164106cI getIconImage() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-iconImage>(...)");
        return (C164106cI) value;
    }

    private final LinearLayout getNoticeRoot() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-noticeRoot>(...)");
        return (LinearLayout) value;
    }

    private final TuxTextView getTitleContext() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-titleContext>(...)");
        return (TuxTextView) value;
    }

    private final TuxTextView getTitleText() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-titleText>(...)");
        return (TuxTextView) value;
    }

    public final void setContentClickListener(InterfaceC65784Pro<C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        C16880lQ.LJJJJI(getTitleContext(), new ACListenerS34S0100000_14(listener, 28));
    }

    public final void setIconImage(Drawable drawable) {
        o.LJIIIZ(drawable, "drawable");
        getIconImage().setImageDrawable(drawable);
    }

    public final void setOnCloseClickListener(InterfaceC65784Pro<C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        C16880lQ.LJJJZ(getCloseImage(), new ACListenerS27S0100000_7(listener, 50));
    }

    public final void setTitleContent(CharSequence text) {
        o.LJIIIZ(text, "text");
        getTitleContext().setText(text);
    }

    public final void setTitleText(CharSequence text) {
        o.LJIIIZ(text, "text");
        getTitleText().setText(text);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82135WLj(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(attrs, "attrs");
        this.LJLJJLL = new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 163));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 162));
        this.LJLJI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 158));
        this.LJLJJI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 169));
        this.LJLJJL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 159));
        View.inflate(context, R.layout.bl_, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, new int[]{R.attr.a42, R.attr.age, R.attr.b29, R.attr.bjg, R.attr.bjp, R.attr.bjr});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…, R.styleable.NoticeView)");
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        if (drawable != null) {
            getIconImage().setImageDrawable(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
        if (drawable2 != null) {
            getCloseImage().setImageDrawable(drawable2);
        }
        getTitleText().setText(C16880lQ.LLLZLZ(obtainStyledAttributes, 4));
        TuxTextView titleText = getTitleText();
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "this.context");
        titleText.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context2));
        getTitleContext().setText(C16880lQ.LLLZLZ(obtainStyledAttributes, 3));
        getTitleContext().setTextColor(C04330Ez.LIZIZ(getContext(), R.color.ck));
        int color = obtainStyledAttributes.getColor(2, C04330Ez.LIZIZ(getContext(), R.color.ar));
        obtainStyledAttributes.recycle();
        C163526bM.LIZ(this, color, SFS.LJII(4.0d, context), C04330Ez.LIZIZ(getContext(), R.color.ce), SFS.LJII(12.0d, context), 0, 2);
        C16880lQ.LJIIZILJ(getNoticeRoot(), ViewOnClickListenerC82137WLl.LJLIL);
    }
}

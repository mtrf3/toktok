package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.5ZB, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5ZB extends FrameLayout {
    public final View LJLIL;
    public InterfaceC88472Yns<? super ImageView, C76800UCe> LJLILLLLZI;

    public final InterfaceC88472Yns<ImageView, C76800UCe> getCustomImage() {
        return this.LJLILLLLZI;
    }

    public final View getView() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5ZB(Context context) {
        super(context, null, R.attr.kw);
        a1.LJFF(context, "context");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.cq, this, true);
        o.LJIIIIZZ(LLLLIILL, "from(context).inflate(R.…ltip_message, this, true)");
        this.LJLIL = LLLLIILL;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.tf, R.attr.tg, R.attr.th, R.attr.ti, R.attr.tj, R.attr.tk, R.attr.tl, R.attr.tm, R.attr.tn, R.attr.to}, R.attr.kw, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…Tooltip, defStyleAttr, 0)");
        ((TextView) LLLLIILL.findViewById(R.id.ghd)).setTextColor(obtainStyledAttributes.getColor(8, -1));
        ((TuxTextView) LLLLIILL.findViewById(R.id.ghd)).setTuxFont(obtainStyledAttributes.getInt(7, 0));
        obtainStyledAttributes.recycle();
    }

    public final void LIZ(CharSequence message) {
        o.LJIIIZ(message, "message");
        ((TextView) this.LJLIL.findViewById(R.id.ghd)).setText(message);
        if (!TextUtils.isEmpty(message)) {
            this.LJLIL.findViewById(R.id.ghd).setVisibility(0);
        } else {
            this.LJLIL.findViewById(R.id.ghd).setVisibility(8);
        }
    }

    public final void setCustomImage(InterfaceC88472Yns<? super ImageView, C76800UCe> interfaceC88472Yns) {
        this.LJLILLLLZI = interfaceC88472Yns;
        if (interfaceC88472Yns != null) {
            ((ImageView) this.LJLIL.findViewById(R.id.egd)).setVisibility(0);
            View findViewById = this.LJLIL.findViewById(R.id.egd);
            o.LJIIIIZZ(findViewById, "view.image");
            interfaceC88472Yns.invoke(findViewById);
        }
    }
}

package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.8ve, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnClickListenerC227068ve extends LinearLayout implements View.OnClickListener {
    public TuxIconView LJLIL;
    public ImageView LJLILLLLZI;
    public TextView LJLJI;
    public View LJLJJI;
    public View LJLJJL;
    public InterfaceC227078vf LJLJJLL;

    public final ImageView getMCloseImage() {
        return this.LJLILLLLZI;
    }

    public final TuxIconView getMIconImage() {
        return this.LJLIL;
    }

    public final View getMNoticeBg() {
        return this.LJLJJL;
    }

    public final View getMTitleContainer() {
        return this.LJLJJI;
    }

    public final TextView getMTitleText() {
        return this.LJLJI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        o.LJIIIZ(v, "v");
        if (this.LJLJJLL == null) {
            return;
        }
        if (v.getId() == R.id.f0h) {
            InterfaceC227078vf interfaceC227078vf = this.LJLJJLL;
            o.LJI(interfaceC227078vf);
            interfaceC227078vf.LIZ();
        } else {
            if (v.getId() != R.id.l_j) {
                return;
            }
            InterfaceC227078vf interfaceC227078vf2 = this.LJLJJLL;
            o.LJI(interfaceC227078vf2);
            interfaceC227078vf2.LIZIZ();
        }
    }

    public final void setMCloseImage(ImageView imageView) {
        this.LJLILLLLZI = imageView;
    }

    public final void setMIconImage(TuxIconView tuxIconView) {
        this.LJLIL = tuxIconView;
    }

    public final void setMNoticeBg(View view) {
        this.LJLJJL = view;
    }

    public final void setMTitleContainer(View view) {
        this.LJLJJI = view;
    }

    public final void setMTitleText(TextView textView) {
        this.LJLJI = textView;
    }

    public final void setOnInternalClickListener(InterfaceC227078vf interfaceC227078vf) {
        this.LJLJJLL = interfaceC227078vf;
    }

    public final void setTitleText(int i) {
        TextView textView = this.LJLJI;
        o.LJI(textView);
        textView.setText(getContext().getResources().getText(i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC227068ve(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ImageView imageView;
        TuxIconView tuxIconView;
        a1.LJFF(context, "context");
        LinearLayout.inflate(context, R.layout.bgq, this);
        this.LJLIL = (TuxIconView) findViewById(R.id.f51);
        this.LJLILLLLZI = (ImageView) findViewById(R.id.f0h);
        this.LJLJI = (TextView) findViewById(R.id.mo6);
        this.LJLJJI = findViewById(R.id.l_j);
        this.LJLJJL = findViewById(R.id.h3w);
        ImageView imageView2 = this.LJLILLLLZI;
        if (imageView2 != null) {
            imageView2.setOnTouchListener(new AnonymousClass806(0.5f));
        }
        View view = this.LJLJJI;
        if (view != null) {
            view.setOnTouchListener(new AnonymousClass806(0.5f));
        }
        ImageView imageView3 = this.LJLILLLLZI;
        if (imageView3 != null) {
            C16880lQ.LJIILLIIL(imageView3, this);
        }
        View view2 = this.LJLJJI;
        if (view2 != null) {
            C16880lQ.LJIIJ(this, view2);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a42, R.attr.age, R.attr.b29, R.attr.bjg, R.attr.bjp, R.attr.bjr});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…, R.styleable.NoticeView)");
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        if (drawable != null && (tuxIconView = this.LJLIL) != null) {
            tuxIconView.setImageDrawable(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
        if (drawable2 != null && (imageView = this.LJLILLLLZI) != null) {
            imageView.setImageDrawable(drawable2);
        }
        TextView textView = this.LJLJI;
        if (textView != null) {
            textView.setText(C16880lQ.LLLZLZ(obtainStyledAttributes, 4));
        }
        TextView textView2 = this.LJLJI;
        if (textView2 != null) {
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "getContext()");
            Integer LJI = C79045V0n.LJI(R.attr.go, context2);
            o.LJI(LJI);
            textView2.setTextColor(LJI.intValue());
        }
        View view3 = this.LJLJJL;
        if (view3 != null) {
            Context context3 = getContext();
            o.LJIIIIZZ(context3, "getContext()");
            Integer LJI2 = C79045V0n.LJI(R.attr.cl, context3);
            o.LJI(LJI2);
            view3.setBackgroundColor(obtainStyledAttributes.getColor(2, LJI2.intValue()));
        }
        obtainStyledAttributes.recycle();
    }
}

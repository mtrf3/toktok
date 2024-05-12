package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.8vV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnClickListenerC226978vV extends LinearLayout implements View.OnClickListener {
    public C62846OlW LJLIL;
    public TuxIconView LJLILLLLZI;
    public TextView LJLJI;
    public View LJLJJI;
    public View LJLJJL;
    public InterfaceC226988vW LJLJJLL;

    public TextView getTitleTextView() {
        return this.LJLJI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.LJLJJLL == null) {
            return;
        }
        if (view.getId() == R.id.f0h) {
            this.LJLJJLL.LIZ();
        } else {
            if (view.getId() != R.id.l_j) {
                return;
            }
            this.LJLJJLL.LIZIZ();
        }
    }

    public void setCloseImage(int i) {
        this.LJLILLLLZI.setImageResource(i);
    }

    public void setIconImage(Drawable drawable) {
        this.LJLIL.getHierarchy().LJIILL(drawable, 1);
    }

    public void setIconImageResource(Drawable drawable) {
        this.LJLIL.setImageDrawable(drawable);
    }

    public void setNoticeBackgroundColor(int i) {
        this.LJLJJL.setBackgroundColor(i);
    }

    public void setOnInternalClickListener(InterfaceC226988vW interfaceC226988vW) {
        this.LJLJJLL = interfaceC226988vW;
    }

    public void setTitleText(int i) {
        this.LJLJI.setText(getContext().getResources().getText(i));
    }

    public void setTitleTextColor(int i) {
        this.LJLJI.setTextColor(i);
    }

    public void setCloseImage(Bitmap bitmap) {
        this.LJLILLLLZI.setImageBitmap(bitmap);
    }

    public void setIconImage(int i) {
        this.LJLIL.setImageResource(i);
    }

    public void setTitleText(CharSequence charSequence) {
        this.LJLJI.setText(charSequence);
    }

    public void setCloseImage(Drawable drawable) {
        this.LJLILLLLZI.setImageDrawable(drawable);
    }

    public void setIconImage(Bitmap bitmap) {
        this.LJLIL.setImageBitmap(bitmap);
    }

    public void setTitleText(String str) {
        this.LJLJI.setText(str);
    }

    public void setIconImage(UrlModel urlModel) {
        C78765Uvh.LJFF(this.LJLIL, urlModel);
    }

    public ViewOnClickListenerC226978vV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LinearLayout.inflate(context, R.layout.bon, this);
        this.LJLIL = (C62846OlW) findViewById(R.id.f51);
        this.LJLILLLLZI = (TuxIconView) findViewById(R.id.f0h);
        this.LJLJI = (TextView) findViewById(R.id.mo6);
        this.LJLJJI = findViewById(R.id.l_j);
        this.LJLJJL = findViewById(R.id.h3w);
        this.LJLILLLLZI.setOnTouchListener(new AnonymousClass806(0.5f));
        this.LJLJJI.setOnTouchListener(new AnonymousClass806(0.5f));
        C16880lQ.LJJJ(this.LJLILLLLZI, this);
        C16880lQ.LJIIJ(this, this.LJLJJI);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a42, R.attr.age, R.attr.b29, R.attr.bjg, R.attr.bjp, R.attr.bjr});
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        if (drawable != null) {
            this.LJLIL.setImageDrawable(drawable);
        }
        obtainStyledAttributes.getDrawable(0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = resourceId;
            c2068389v.LIZLLL = Integer.valueOf(R.attr.gu);
            this.LJLILLLLZI.setTuxIcon(c2068389v);
        }
        this.LJLJI.setText(C16880lQ.LLLZLZ(obtainStyledAttributes, 4));
        this.LJLJI.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, getContext()));
        this.LJLJJL.setBackgroundColor(obtainStyledAttributes.getColor(2, getResources().getColor(R.color.ar)));
        obtainStyledAttributes.recycle();
    }
}

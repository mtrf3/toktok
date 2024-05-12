package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.o;
import o53.IDdS477S0100000_12;

/* loaded from: classes13.dex */
public final class THN extends LinearLayout {
    public final W5G LJLIL;
    public final TextView LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public float LJLJJLL;
    public float LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;

    private final View getDotView() {
        return (View) this.LJLJI.getValue();
    }

    public final void LIZIZ() {
        int i;
        if (this.LJLJLJ) {
            i = this.LJLJJI;
        } else {
            i = this.LJLJJL;
        }
        this.LJLILLLLZI.setTextColor(i);
        this.LJLIL.setImageAlpha(Color.alpha(i));
    }

    public final void LIZJ() {
        if (this.LJLJLLL) {
            if (this.LJLJLJ && !this.LJLL) {
                C78880UxY.LJLIIL(this.LJLILLLLZI);
                this.LJLILLLLZI.setTypeface(Typeface.defaultFromStyle(1));
                return;
            } else {
                this.LJLILLLLZI.setTypeface(Typeface.defaultFromStyle(0));
                return;
            }
        }
        C78880UxY.LJLIIL(this.LJLILLLLZI);
    }

    private final int getIconHeight() {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        return (int) C74275TDb.LIZIZ(context, 24.0f);
    }

    public final int getSelectColor() {
        return this.LJLJJI;
    }

    public final TextView getTextView() {
        return this.LJLILLLLZI;
    }

    public final int getUnSelectColor() {
        return this.LJLJJL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public THN(Context context) {
        super(context, null, 0);
        o.LJIIIZ(context, "context");
        this.LJLJI = C221108m2.LIZIZ(new AqS159S0200000_12(this, context, 6));
        this.LJLJJI = context.getResources().getColor(R.color.y0);
        this.LJLJJL = context.getResources().getColor(R.color.y1);
        this.LJLJJLL = 15.0f;
        this.LJLJL = 15.0f;
        this.LJLJLLL = true;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.cs6, this, true);
        View findViewById = LLLLIILL.findViewById(R.id.kyo);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.tab_item_img)");
        this.LJLIL = (W5G) findViewById;
        View findViewById2 = LLLLIILL.findViewById(R.id.kyq);
        o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.id.tab_item_text)");
        TextView textView = (TextView) findViewById2;
        this.LJLILLLLZI = textView;
        textView.setTextSize(15.0f);
        LIZIZ();
        LIZJ();
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        C78866UxK.LJJIIJZLJL(textView);
    }

    public final void LIZ(boolean z) {
        int i;
        View dotView = getDotView();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        dotView.setVisibility(i);
    }

    public final void LIZLLL(InterfaceC81599W0t interfaceC81599W0t) {
        if (interfaceC81599W0t != null && (this.LJLIL.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.LayoutParams layoutParams = this.LJLIL.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int iconHeight = getIconHeight();
                marginLayoutParams.height = iconHeight;
                marginLayoutParams.width = (int) (interfaceC81599W0t.getWidth() * (iconHeight / interfaceC81599W0t.getHeight()));
                this.LJLIL.setAspectRatio(interfaceC81599W0t.getWidth() / interfaceC81599W0t.getHeight());
                this.LJLIL.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public final void setDotColor(int i) {
        View dotView = getDotView();
        TDY tdy = new TDY();
        tdy.LIZLLL(1);
        tdy.LIZIZ(i);
        tdy.LJ(i, 0);
        dotView.setBackground(tdy.LIZ());
    }

    public final void setImage(UrlModel urlModel) {
        o.LJIIIZ(urlModel, "urlModel");
        setImageVisibility(true);
        C78764Uvg.LJII(this.LJLIL, urlModel, Bitmap.Config.ARGB_8888, true, new IDdS477S0100000_12(this, 0));
    }

    public final void setImageVisibility(boolean z) {
        int i;
        W5G w5g = this.LJLIL;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        w5g.setVisibility(i);
    }

    public final void setOnlyBoldOnSelection(boolean z) {
        if (z == this.LJLJLLL) {
            return;
        }
        this.LJLJLLL = z;
        LIZJ();
    }

    public final void setSelectColor(int i) {
        if (this.LJLJJI == i) {
            return;
        }
        this.LJLJJI = i;
        if (this.LJLJLJ) {
            LIZIZ();
        }
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        float f;
        super.setSelected(z);
        this.LJLJLJ = z;
        LIZIZ();
        if (this.LJLJLJ) {
            f = this.LJLJJLL;
        } else {
            f = this.LJLJL;
        }
        if (this.LJLILLLLZI.getTextSize() != f) {
            this.LJLILLLLZI.setTextSize(f);
        }
        LIZJ();
    }

    public final void setText(int i) {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        String string = context.getResources().getString(i);
        o.LJIIIIZZ(string, "context.resources.getString(stringRes)");
        setText(string);
    }

    public final void setTextVisibility(boolean z) {
        int i;
        TextView textView = this.LJLILLLLZI;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public final void setUnSelectColor(int i) {
        if (this.LJLJJL == i) {
            return;
        }
        this.LJLJJL = i;
        if (!this.LJLJLJ) {
            LIZIZ();
        }
    }

    public final void setImage(String url) {
        o.LJIIIZ(url, "url");
        setImageVisibility(true);
        C78764Uvg.LJIIIZ(this.LJLIL, url, -1, -1);
    }

    public final void setText(String str) {
        if (!TextUtils.isEmpty(str)) {
            setTextVisibility(true);
            this.LJLILLLLZI.setText(str);
        } else {
            setTextVisibility(false);
        }
    }

    public final void setImage(int i) {
        setImageVisibility(true);
        this.LJLIL.setImageResource(i);
    }

    public final void setImage(Drawable drawable) {
        setImageVisibility(true);
        this.LJLIL.setImageDrawable(drawable);
    }
}

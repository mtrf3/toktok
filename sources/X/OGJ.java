package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OGJ extends FrameLayout {
    public View LJLIL;
    public ImageView LJLILLLLZI;
    public EditText LJLJI;
    public View LJLJJI;
    public View LJLJJL;
    public View LJLJJLL;

    public final void setPlayerExtraListener(OGM ogm) {
    }

    public final String getEditTextContent() {
        EditText editText = this.LJLJI;
        if (editText != null) {
            Editable editableText = editText.getEditableText();
            if (editableText == null) {
                return null;
            }
            return editableText.toString();
        }
        o.LJIJI("editTextView");
        throw null;
    }

    public final View getEditTextLayout() {
        View view = this.LJLJJI;
        if (view != null) {
            return view;
        }
        o.LJIJI("editTextLayout");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OGJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o.LJIIIZ(context, "context");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.bnj, this, true);
        o.LJIIIIZZ(LLLLIILL, "from(context).inflate(R.…t_extra_view, this, true)");
        this.LJLIL = LLLLIILL;
        View findViewById = LLLLIILL.findViewById(R.id.l41);
        o.LJIIIIZZ(findViewById, "contentRootView.findView…ext_edit_play_status_img)");
        this.LJLILLLLZI = (ImageView) findViewById;
        View view = this.LJLIL;
        if (view != null) {
            View findViewById2 = view.findViewById(R.id.apm);
            o.LJIIIIZZ(findViewById2, "contentRootView.findView…Id(R.id.bottom_edit_text)");
            this.LJLJI = (EditText) findViewById2;
            View view2 = this.LJLIL;
            if (view2 != null) {
                View findViewById3 = view2.findViewById(R.id.apn);
                o.LJIIIIZZ(findViewById3, "contentRootView.findView….bottom_edit_text_layout)");
                this.LJLJJI = findViewById3;
                View view3 = this.LJLIL;
                if (view3 != null) {
                    View findViewById4 = view3.findViewById(R.id.d_t);
                    o.LJIIIIZZ(findViewById4, "contentRootView.findView…Id(R.id.finish_edit_text)");
                    this.LJLJJL = findViewById4;
                    View view4 = this.LJLIL;
                    if (view4 != null) {
                        View findViewById5 = view4.findViewById(R.id.l3o);
                        o.LJIIIIZZ(findViewById5, "contentRootView.findViewById(R.id.text_box_view)");
                        this.LJLJJLL = findViewById5;
                        int LIZ = C5RE.LIZ(1.0f);
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setShape(0);
                        gradientDrawable.setColor(0);
                        gradientDrawable.setStroke(LIZ, -1);
                        gradientDrawable.setCornerRadius(0);
                        View view5 = this.LJLJJLL;
                        if (view5 != null) {
                            view5.setBackground(gradientDrawable);
                            ImageView imageView = this.LJLILLLLZI;
                            if (imageView != null) {
                                C16880lQ.LJIIJ(new C59798NdS(new AqS160S0100000_10(this, 413)), imageView);
                                View view6 = this.LJLJJL;
                                if (view6 != null) {
                                    C16880lQ.LJIIJ(new C59798NdS(new AqS160S0100000_10(this, 414)), view6);
                                    EditText editText = this.LJLJI;
                                    if (editText != null) {
                                        editText.addTextChangedListener(new OGK(this));
                                        context.getResources().getDimensionPixelOffset(R.dimen.ajp);
                                        context.getResources().getDimensionPixelOffset(R.dimen.ajq);
                                        return;
                                    }
                                    o.LJIJI("editTextView");
                                    throw null;
                                }
                                o.LJIJI("editFinishView");
                                throw null;
                            }
                            o.LJIJI("playStatusImageView");
                            throw null;
                        }
                        o.LJIJI("textBoxView");
                        throw null;
                    }
                    o.LJIJI("contentRootView");
                    throw null;
                }
                o.LJIJI("contentRootView");
                throw null;
            }
            o.LJIJI("contentRootView");
            throw null;
        }
        o.LJIJI("contentRootView");
        throw null;
    }
}

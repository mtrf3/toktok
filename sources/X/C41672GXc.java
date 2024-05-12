package X;

import Y.ACListenerS42S0200000_7;
import android.content.Context;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.GXc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41672GXc extends LinearLayout {
    public final TuxTextView LJLIL;
    public final SmartImageView LJLILLLLZI;
    public final SY4 LJLJI;
    public final SY4 LJLJJI;
    public final View LJLJJL;
    public InterfaceC88472Yns<? super String, C76800UCe> LJLJJLL;
    public final TextPaint LJLJL;
    public boolean LJLJLJ;

    public final SmartImageView getCoverImgView() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41672GXc(Context context) {
        super(context, null, 0);
        int i;
        a1.LJFF(context, "context");
        SY4 sy4 = null;
        this.LJLJL = new TextPaint();
        if (C00F.LIZ(31744, 0, "studio_keep_editing_popup_change_to_push", true) == 2) {
            i = R.layout.ib;
        } else {
            i = R.layout.ia;
        }
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), i, this, true);
        View findViewById = findViewById(R.id.iza);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.restore_title_text)");
        this.LJLIL = (TuxTextView) findViewById;
        View findViewById2 = findViewById(R.id.iz9);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.restore_popup_cover)");
        this.LJLILLLLZI = (SmartImageView) findViewById2;
        SY4 sy42 = (SY4) findViewById(R.id.iz7);
        this.LJLJI = sy42 == null ? null : sy42;
        SY4 sy43 = (SY4) findViewById(R.id.iz6);
        if (sy43 != null) {
            sy43.setButtonVariant(5);
            sy4 = sy43;
        }
        this.LJLJJI = sy4;
        this.LJLJJL = findViewById(R.id.kaa);
    }

    public final void setCancelAction(InterfaceC65784Pro<C76800UCe> action) {
        o.LJIIIZ(action, "action");
        SY4 sy4 = this.LJLJJI;
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS42S0200000_7(this, action, 52));
        }
    }

    public final void setClicked(boolean z) {
        this.LJLJLJ = z;
    }

    public final void setConfirmAction(InterfaceC65784Pro<C76800UCe> action) {
        o.LJIIIZ(action, "action");
        setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS42S0200000_7(this, action, 53)));
        SY4 sy4 = this.LJLJI;
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS42S0200000_7(this, action, 54));
        }
    }

    public final void setDismissAction(InterfaceC88472Yns<? super String, C76800UCe> action) {
        o.LJIIIZ(action, "action");
        this.LJLJJLL = action;
    }

    public final void setText(int i) {
        this.LJLIL.setText(getResources().getText(i));
    }

    public final void setText(String text) {
        o.LJIIIZ(text, "text");
        this.LJLIL.setText(text);
    }

    public final void LIZ(int i, boolean z) {
        String text = getResources().getText(i).toString();
        o.LJIIIZ(text, "text");
        if (z) {
            SY4 sy4 = this.LJLJI;
            if (sy4 == null) {
                return;
            }
            sy4.setText(text);
            return;
        }
        SY4 sy42 = this.LJLJJI;
        if (sy42 == null) {
            return;
        }
        sy42.setText(text);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        LinearLayout.LayoutParams layoutParams;
        super.onMeasure(i, i2);
        int LIZ = C00F.LIZ(31744, 0, "studio_keep_editing_popup_change_to_push", true);
        if (LIZ != 1) {
            if (LIZ != 2) {
                return;
            }
            SY4 sy4 = this.LJLJI;
            if (sy4 != null) {
                if (sy4.getMeasuredWidth() < C7MY.LIZIZ(76)) {
                    C77125UOr.LJIIIZ(C7MY.LIZIZ(76), sy4.getMeasuredHeight(), sy4);
                }
                if (sy4.getMeasuredWidth() == sy4.getMaxWidth() && sy4.getPaint().measureText(sy4.getText().toString()) >= (sy4.getMeasuredWidth() - sy4.getPaddingLeft()) - sy4.getPaddingRight() && sy4.getTextSize() <= C7MY.LIZIZ(12)) {
                    sy4.setMaxWidth(Integer.MAX_VALUE);
                }
            }
            TuxTextView tuxTextView = this.LJLIL;
            CharSequence text = tuxTextView.getText();
            o.LJIIIIZZ(text, "tv.text");
            StaticLayout LJJIIJ = C1A7.LJJIIJ(tuxTextView, text, this.LJLJL, (this.LJLIL.getMeasuredWidth() - this.LJLIL.getPaddingLeft()) - this.LJLIL.getPaddingRight(), Float.valueOf(this.LJLIL.getTextSize()));
            if (this.LJLIL.getMaxLines() == -1) {
                return;
            }
            if (LJJIIJ.getLineCount() <= this.LJLIL.getMaxLines() && LJJIIJ.getLineEnd(LJJIIJ.getLineCount() - 1) == this.LJLIL.getText().length()) {
                return;
            }
            TuxTextView tuxTextView2 = this.LJLIL;
            tuxTextView2.setMaxLines(4);
            ViewGroup.LayoutParams layoutParams2 = tuxTextView2.getLayoutParams();
            if (!(layoutParams2 instanceof LinearLayout.LayoutParams) || (layoutParams = (LinearLayout.LayoutParams) layoutParams2) == null) {
                return;
            }
            layoutParams.gravity = 48;
            tuxTextView2.setLayoutParams(layoutParams);
            return;
        }
        if (this.LJLIL.getLineCount() > 1) {
            View view = this.LJLJJL;
            if (view == null) {
                return;
            }
            C77125UOr.LJIIIZ(-1, O6R.LJJIIZ(C32151Nz.LJIIZILJ(10)), view);
            return;
        }
        View view2 = this.LJLJJL;
        if (view2 == null) {
            return;
        }
        C77125UOr.LJIIIZ(-1, O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)), view2);
    }
}

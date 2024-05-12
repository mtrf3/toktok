package X;

import Y.ACListenerS21S0100000_1;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.4Wh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110754Wh extends LinearLayout {
    public final C62822Ol8 LJLIL;
    public boolean LJLILLLLZI;

    private final Keva getStore() {
        return (Keva) this.LJLIL.getValue();
    }

    public final void LIZIZ() {
        final int i;
        if (this.LJLILLLLZI || getStore().getBoolean("shown", false)) {
            return;
        }
        this.LJLILLLLZI = true;
        View.inflate(getContext(), R.layout.b_d, this);
        C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 91), findViewById(R.id.ee2));
        final TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.ee1);
        String string = tuxTextView.getContext().getString(R.string.eto);
        o.LJIIIIZZ(string, "context.getString(R.stri…de_chat_banner_addkw_btn)");
        String string2 = tuxTextView.getContext().getString(R.string.etn, string);
        o.LJIIIIZZ(string2, "context.getString(R.stri…e_chat_banner, highlight)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
        int LJJLIIIJL = s.LJJLIIIJL(string2, string, 0, false, 6);
        int length = string.length() + LJJLIIIJL;
        if (LJJLIIIJL >= 0 && length >= 0) {
            Integer LIZJ = C72972SkS.LIZJ(tuxTextView, "context", R.attr.go);
            if (LIZJ != null) {
                i = LIZJ.intValue();
            } else {
                i = 0;
            }
            spannableStringBuilder.setSpan(new ClickableSpan() { // from class: X.4Wg
                @Override // android.text.style.ClickableSpan
                public final void onClick(View p0) {
                    o.LJIIIZ(p0, "p0");
                    SmartRouter.buildRoute(tuxTextView.getContext(), "//chatcontrol/setting/keywords").open();
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint ds) {
                    o.LJIIIZ(ds, "ds");
                    ds.setColor(i);
                }
            }, LJJLIIIJL, length, 33);
            spannableStringBuilder.setSpan(new T5U(42, false), LJJLIIIJL, length, 33);
        }
        tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
        tuxTextView.setText(spannableStringBuilder);
    }

    public final void LIZ() {
        getStore().storeBoolean("shown", true);
        removeAllViews();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C110754Wh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = C221108m2.LIZIZ(C110764Wi.LJLIL);
    }
}

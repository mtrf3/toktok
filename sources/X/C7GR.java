package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.7GR, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7GR {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(TuxTextView tuxTextView, final View.OnClickListener onClickListener, int i, int i2) {
        Context context = tuxTextView.getContext();
        String string = context.getString(i2);
        o.LJIIIIZZ(string, "context.getString(lastString)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(i, string));
        final int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.eb, context);
        AbstractC188397aN abstractC188397aN = new AbstractC188397aN(LJIIIIZZ, onClickListener) { // from class: X.7aM
            public final /* synthetic */ View.OnClickListener LJLJJI;

            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                o.LJIIIZ(view, "view");
                this.LJLJJI.onClick(view);
            }

            @Override // X.AbstractC188397aN, android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint ds) {
                o.LJIIIZ(ds, "ds");
                T5S t5s = new T5S();
                t5s.LIZ(82);
                ds.setTypeface(t5s.getTypeface());
                super.updateDrawState(ds);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(LJIIIIZZ, LJIIIIZZ);
                this.LJLJJI = onClickListener;
            }
        };
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        o.LJIIIIZZ(spannableStringBuilder2, "builder.toString()");
        int LJJLIIIJL = s.LJJLIIIJL(spannableStringBuilder2, string, 0, false, 6);
        spannableStringBuilder.setSpan(abstractC188397aN, LJJLIIIJL, string.length() + LJJLIIIJL, 34);
        tuxTextView.setHighlightColor(C04330Ez.LIZIZ(context, R.color.cz));
        tuxTextView.setText(spannableStringBuilder);
        tuxTextView.setMovementMethod(AnonymousClass894.LIZ());
    }
}

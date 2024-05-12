package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.9uh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C251959uh {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, TuxTextView tuxTextView, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, int i) {
        String string = context.getString(R.string.dua);
        String LIZIZ = OKG.LIZIZ(string, "context.getString(R.stri…tbox_link_termsofservice)", context, R.string.du_, "context.getString(R.stri…ntbox_link_privacypolicy)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(i, string, LIZIZ));
        int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.d4, context);
        C251949ug c251949ug = new C251949ug(LJIIIIZZ, onClickListener);
        C251949ug c251949ug2 = new C251949ug(LJIIIIZZ, onClickListener2);
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        o.LJIIIIZZ(spannableStringBuilder2, "builder.toString()");
        int LJJLIIIJL = s.LJJLIIIJL(spannableStringBuilder2, string, 0, false, 6);
        int LJJLIIIJL2 = s.LJJLIIIJL(spannableStringBuilder2, LIZIZ, 0, false, 6);
        spannableStringBuilder.setSpan(c251949ug, LJJLIIIJL, string.length() + LJJLIIIJL, 34);
        spannableStringBuilder.setSpan(c251949ug2, LJJLIIIJL2, LIZIZ.length() + LJJLIIIJL2, 34);
        tuxTextView.setHighlightColor(C04330Ez.LIZIZ(context, R.color.cz));
        tuxTextView.setText(spannableStringBuilder);
        tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}

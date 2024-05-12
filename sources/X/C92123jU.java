package X;

import android.app.Activity;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3jU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92123jU {
    public static final /* synthetic */ int LIZ = 0;

    public static CharSequence LIZ(final Activity context, IMUser iMUser, final C99033ud c99033ud) {
        String str;
        o.LJIIIZ(context, "context");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(R.string.haa));
        final int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.go, context);
        spannableStringBuilder.setSpan(new ClickableSpan() { // from class: X.3i7
            @Override // android.text.style.ClickableSpan
            public final void onClick(View widget) {
                o.LJIIIZ(widget, "widget");
                widget.invalidate();
                C99033ud c99033ud2 = C99033ud.this;
                if (c99033ud2 == null) {
                    return;
                }
                C98793uF.LIZLLL(new C91423iM(c99033ud2), context, "10", null, 24);
                C784736d.LIZIZ("report");
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint ds) {
                o.LJIIIZ(ds, "ds");
                ds.setColor(LJIIIIZZ);
                ds.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
                ds.setUnderlineText(false);
            }
        }, 0, spannableStringBuilder.length(), 33);
        Spannable[] spannableArr = new Spannable[2];
        if (iMUser != null) {
            str = iMUser.getNickName();
        } else {
            str = null;
        }
        spannableArr[0] = new SpannableString(str);
        spannableArr[1] = spannableStringBuilder;
        return C1A7.LJIJ(context, R.string.ha_, spannableArr);
    }
}

package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.watch.history.api.WatchHistoryDialogCopy;
import com.zhiliaoapp.musically.R;
import ujb.o;
import ujb.s;

/* renamed from: X.7Zy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188147Zy {
    public static CharSequence LIZIZ(WatchHistoryDialogCopy watchHistoryDialogCopy, final String str) {
        String body;
        if (watchHistoryDialogCopy == null || (body = watchHistoryDialogCopy.getBody()) == null) {
            return null;
        }
        if (str == null || o.LJJJJJL(str)) {
            return body;
        }
        final Context LIZIZ = EF7.LIZIZ();
        String string = LIZIZ.getString(R.string.tuu);
        kotlin.jvm.internal.o.LJIIIIZZ(string, "context.getString(R.stri…h_history_learn_more_btn)");
        if (o.LJJJJJL(string)) {
            return body;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C00F.LIZIZ(body, ' ', string));
        final int LIZIZ2 = C04330Ez.LIZIZ(LIZIZ, R.color.b5);
        final int LIZIZ3 = C04330Ez.LIZIZ(LIZIZ, R.color.b5);
        AbstractC188397aN abstractC188397aN = new AbstractC188397aN(LIZIZ2, LIZIZ3) { // from class: X.7aL
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                kotlin.jvm.internal.o.LJIIIZ(view, "view");
                SmartRoute buildRoute = SmartRouter.buildRoute(LIZIZ, "//webview");
                buildRoute.withParam(UriProtector.parse(str).buildUpon().appendQueryParameter("hide_nav_bar", "1").appendQueryParameter("use_spark", "1").build());
                buildRoute.open();
            }

            @Override // X.AbstractC188397aN, android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint ds) {
                kotlin.jvm.internal.o.LJIIIZ(ds, "ds");
                super.updateDrawState(ds);
                T5S t5s = new T5S();
                t5s.LIZ(82);
                ds.setTypeface(t5s.getTypeface());
                ds.setUnderlineText(false);
            }
        };
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        kotlin.jvm.internal.o.LJIIIIZZ(spannableStringBuilder2, "builder.toString()");
        int LJJLIIIJL = s.LJJLIIIJL(spannableStringBuilder2, string, 0, false, 6);
        spannableStringBuilder.setSpan(abstractC188397aN, LJJLIIIJL, string.length() + LJJLIIIJL, 33);
        return SpannableString.valueOf(spannableStringBuilder);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (r0 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
    
        if (r13 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c1, code lost:
    
        if (r0 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b7, code lost:
    
        if (r13 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x011f, code lost:
    
        if (r0 != null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0115, code lost:
    
        if (r13 == null) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C188217a5 LIZ(X.EnumC188177a1 r11, android.content.Context r12, com.ss.android.ugc.aweme.watch.history.api.WatchHistoryCopyResponse r13) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C188147Zy.LIZ(X.7a1, android.content.Context, com.ss.android.ugc.aweme.watch.history.api.WatchHistoryCopyResponse):X.7a5");
    }
}

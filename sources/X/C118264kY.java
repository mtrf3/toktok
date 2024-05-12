package X;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.4kY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C118264kY {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(int r7, android.text.Editable r8, boolean r9) {
        /*
            r2 = 1
            r3 = 0
            if (r8 == 0) goto L1b
            java.lang.String r1 = r8.toString()
            if (r1 == 0) goto L15
            java.lang.String r0 = "@"
            boolean r0 = ujb.o.LJJJJ(r1, r0, r3)
            if (r0 != r2) goto L15
            java.lang.String r0 = ""
            return r0
        L15:
            int r0 = r8.length()
            if (r0 != 0) goto L6c
        L1b:
            r0 = 1
        L1c:
            r6 = 0
            if (r0 != 0) goto L21
            if (r7 != 0) goto L22
        L21:
            return r6
        L22:
            X.FvF r0 = X.C78842Uww.LJJ(r3, r7)
            X.4kV r5 = r0.iterator()
            r4 = r6
        L2b:
            boolean r0 = r5.LJLJI
            if (r0 == 0) goto L44
            java.lang.Object r2 = r5.next()
            r0 = r2
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            char r1 = r8.charAt(r0)
            r0 = 64
            if (r1 != r0) goto L2b
            r4 = r2
            goto L2b
        L44:
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L21
            int r1 = r4.intValue()
            java.lang.Class<com.ss.android.ugc.aweme.comment.widgets.CommentEditText$MentionSpan> r0 = com.ss.android.ugc.aweme.comment.widgets.CommentEditText$MentionSpan.class
            java.lang.Object[] r0 = r8.getSpans(r1, r7, r0)
            com.ss.android.ugc.aweme.comment.widgets.CommentEditText$MentionSpan[] r0 = (com.ss.android.ugc.aweme.comment.widgets.CommentEditText$MentionSpan[]) r0
            if (r0 == 0) goto L59
            int r0 = r0.length
            if (r0 != 0) goto L8b
        L59:
            int r0 = r1 + 1
            java.lang.CharSequence r0 = r8.subSequence(r0, r7)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "  "
            boolean r0 = ujb.s.LJJJLZIJ(r2, r0, r3)
            if (r0 == 0) goto L6e
            return r6
        L6c:
            r0 = 0
            goto L1c
        L6e:
            r0 = 10
            boolean r0 = ujb.s.LJJJZ(r2, r0)
            if (r0 == 0) goto L77
            return r6
        L77:
            if (r9 == 0) goto L81
            java.lang.CharSequence r0 = ujb.s.LJZI(r2)
            java.lang.String r2 = r0.toString()
        L81:
            int r1 = r2.length()
            r0 = 24
            if (r1 <= r0) goto L8a
            return r6
        L8a:
            return r2
        L8b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C118264kY.LIZ(int, android.text.Editable, boolean):java.lang.String");
    }

    public static void LIZIZ(View view, SpannableString spannableString, int i, int i2) {
        if (TextUtils.isEmpty(spannableString)) {
            return;
        }
        if (i <= 0) {
            i = 0;
        }
        if (TextUtils.isEmpty(spannableString) || i > i2 || i >= spannableString.length() || i2 > spannableString.length()) {
            return;
        }
        spannableString.setSpan(new ForegroundColorSpan(view.getResources().getColor(R.color.ma)), i, i2, 17);
    }
}

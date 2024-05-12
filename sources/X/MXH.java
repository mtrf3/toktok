package X;

import Y.ARunnableS9S0301000_9;
import Y.IDCSpanS29S0100000_3;
import android.content.Context;
import android.os.Build;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentImageStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MXH {
    public static final void LIZ(TextView view, SpannableStringBuilder spannableStringBuilder, BaseNotice notice, int i, int i2) {
        Comment comment;
        String str;
        List<CommentImageStruct> imageList;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(spannableStringBuilder, "spannableStringBuilder");
        o.LJIIIZ(notice, "notice");
        if (i2 == 0) {
            view.post(new ARunnableS9S0301000_9(i, view, spannableStringBuilder, notice, 1));
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            view.setBreakStrategy(0);
        }
        int i3 = notice.type;
        if (i3 == 31) {
            comment = notice.commentNotice.getComment();
        } else {
            if (i3 == 45) {
                comment = notice.atMe.getComment();
            }
            str = "";
            String addCreateTimeSpan = MVV.addCreateTimeSpan(spannableStringBuilder, notice, view.getContext());
            TextPaint paint = view.getPaint();
            o.LJIIIIZZ(paint, "view.paint");
            int length = addCreateTimeSpan.length() + str.length();
            TextPaint paint2 = view.getPaint();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(addCreateTimeSpan);
            view.setText(LIZJ(spannableStringBuilder, paint, i2, i, length, (int) paint2.measureText(X1D.LIZIZ(LIZ))));
        }
        if (comment != null && (imageList = comment.getImageList()) != null && !imageList.isEmpty()) {
            spannableStringBuilder.append(" T");
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_image;
            c2068389v.LJ = Integer.valueOf(R.attr.go);
            c2068389v.LIZJ = AnonymousClass391.LIZ(14.0d);
            c2068389v.LIZIZ = AnonymousClass391.LIZ(14.0d);
            Context context = view.getContext();
            o.LJIIIIZZ(context, "textView.context");
            spannableStringBuilder.setSpan(c2068389v.LIZIZ(2, context), spannableStringBuilder.length() - 2, spannableStringBuilder.length(), 33);
            String string = view.getContext().getString(R.string.dii);
            o.LJIIIIZZ(string, "textView.context.getStri…Notification_xNotifBody2)");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(' ');
            LIZ2.append(string);
            spannableStringBuilder.append((CharSequence) X1D.LIZIZ(LIZ2));
            spannableStringBuilder.setSpan(new IDCSpanS29S0100000_3(((CommentImageStruct) ListProtector.get(imageList, 0)).getOriginUrl(), 0), (spannableStringBuilder.length() - string.length()) - 2, spannableStringBuilder.length(), 33);
            boolean isClickable = view.isClickable();
            boolean isLongClickable = view.isLongClickable();
            view.setMovementMethod(AnonymousClass898.LIZ);
            view.setClickable(isClickable);
            view.setLongClickable(isLongClickable);
            spannableStringBuilder.setSpan(new NotificationBoldSpan(), spannableStringBuilder.length() - string.length(), spannableStringBuilder.length(), 33);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(" T");
            LIZ3.append(string);
            str = X1D.LIZIZ(LIZ3);
            String addCreateTimeSpan2 = MVV.addCreateTimeSpan(spannableStringBuilder, notice, view.getContext());
            TextPaint paint3 = view.getPaint();
            o.LJIIIIZZ(paint3, "view.paint");
            int length2 = addCreateTimeSpan2.length() + str.length();
            TextPaint paint22 = view.getPaint();
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(str);
            LIZ4.append(addCreateTimeSpan2);
            view.setText(LIZJ(spannableStringBuilder, paint3, i2, i, length2, (int) paint22.measureText(X1D.LIZIZ(LIZ4))));
        }
        str = "";
        String addCreateTimeSpan22 = MVV.addCreateTimeSpan(spannableStringBuilder, notice, view.getContext());
        TextPaint paint32 = view.getPaint();
        o.LJIIIIZZ(paint32, "view.paint");
        int length22 = addCreateTimeSpan22.length() + str.length();
        TextPaint paint222 = view.getPaint();
        StringBuilder LIZ42 = X1D.LIZ();
        LIZ42.append(str);
        LIZ42.append(addCreateTimeSpan22);
        view.setText(LIZJ(spannableStringBuilder, paint32, i2, i, length22, (int) paint222.measureText(X1D.LIZIZ(LIZ42))));
    }

    public static final void LIZIZ(TextView view, SpannableStringBuilder spannableStringBuilder, BaseNotice notice, int i, int i2) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(spannableStringBuilder, "spannableStringBuilder");
        o.LJIIIZ(notice, "notice");
        if (i2 == 0) {
            view.post(new ARunnableS9S0301000_9(i, view, spannableStringBuilder, notice, 2));
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            view.setBreakStrategy(0);
        }
        String addCreateTimeSpan = MVV.addCreateTimeSpan(spannableStringBuilder, notice, view.getContext());
        TextPaint paint = view.getPaint();
        o.LJIIIIZZ(paint, "view.paint");
        view.setText(LIZJ(spannableStringBuilder, paint, i2, i, addCreateTimeSpan.length(), (int) view.getPaint().measureText(addCreateTimeSpan)));
    }

    public static final SpannableStringBuilder LIZJ(SpannableStringBuilder spannableStringBuilder, TextPaint textPaint, int i, int i2, int i3, int i4) {
        o.LJIIIZ(spannableStringBuilder, "spannableStringBuilder");
        if (i < 0) {
            return spannableStringBuilder;
        }
        DynamicLayout dynamicLayout = new DynamicLayout(spannableStringBuilder, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (dynamicLayout.getLineCount() <= i2) {
            return spannableStringBuilder;
        }
        float measureText = i - (textPaint.measureText("... ") + i4);
        int lineStart = dynamicLayout.getLineStart(i2 - 1);
        while (lineStart < spannableStringBuilder.length() - i3 && '\n' != spannableStringBuilder.charAt(lineStart)) {
            int i5 = lineStart + 1;
            measureText -= textPaint.measureText(spannableStringBuilder, lineStart, i5);
            if (measureText <= 0.0f) {
                break;
            }
            lineStart = i5;
        }
        CharSequence subSequence = spannableStringBuilder.subSequence(spannableStringBuilder.length() - i3, spannableStringBuilder.length());
        o.LJIIIIZZ(subSequence, "spannableStringBuilder.s…gBuilder.length\n        )");
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder.subSequence(0, lineStart));
        spannableStringBuilder2.append((CharSequence) "... ");
        spannableStringBuilder2.append(subSequence);
        return spannableStringBuilder2;
    }
}

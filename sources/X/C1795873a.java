package X;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.zhiliaoapp.musically.R;

/* renamed from: X.73a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1795873a {
    public static void LIZ(Comment comment, TextView textView, String str) {
        Integer LJI;
        int i;
        String labelText = comment.getLabelText();
        if (C76E.LJI(comment, str)) {
            textView.setVisibility(0);
            if (comment.getUser().getFollowStatus() == EnumC57435MgR.FOLLOWED.getValue()) {
                i = R.string.gkd;
            } else {
                i = R.string.exk;
            }
            textView.setText(i);
            textView.setTextColor(C78886Uxe.LJJIFFI(R.attr.gx, R.color.cu, textView.getContext()));
            return;
        }
        if (TextUtils.isEmpty(labelText) || comment.getLabelType() == 9) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(labelText);
        if (comment.getLabelType() == 1) {
            if ((((Number) C182497Ef.LIZ.getValue()).intValue() & 16) == 16) {
                Context context = textView.getContext();
                if (context != null && (LJI = C79045V0n.LJI(R.attr.eh, context)) != null) {
                    textView.setTextColor(LJI.intValue());
                }
                if (C1803676a.LIZ()) {
                    C74J.LIZ(textView);
                    return;
                } else {
                    if (!(textView instanceof TuxTextView)) {
                        return;
                    }
                    ((TuxTextView) textView).setTuxFont(62);
                    return;
                }
            }
            Integer LJI2 = C79045V0n.LJI(R.attr.eb, textView.getContext());
            if (LJI2 == null) {
                return;
            }
            textView.setTextColor(LJI2.intValue());
            return;
        }
        textView.setTextColor(C78886Uxe.LJJIFFI(R.attr.gx, R.color.cu, textView.getContext()));
    }

    public static void LIZIZ(Comment comment, TuxTextView tuxTextView, String str) {
        if (!TextUtils.isEmpty(comment.getLabelText()) || C76E.LJI(comment, str)) {
            String trim = C16880lQ.LLLZ(tuxTextView.getResources().getString(R.string.dk5), new Object[]{""}).trim();
            if (!TextUtils.isEmpty(trim)) {
                tuxTextView.setVisibility(0);
                tuxTextView.setText(trim);
                tuxTextView.setTuxFont(62);
                return;
            }
        }
        tuxTextView.setVisibility(8);
    }
}

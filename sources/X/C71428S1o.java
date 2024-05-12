package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.S1o, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71428S1o {
    public static final TuxTextView LIZ(Context context, String content, InterfaceC71429S1p style) {
        int LIZIZ;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(content, "content");
        o.LJIIIZ(style, "style");
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZJ = Float.valueOf(style.LJ());
        c110614Vt.LIZIZ = Integer.valueOf(style.LJII());
        tuxTextView.setBackground(c110614Vt.LIZ(context));
        tuxTextView.setPadding(style.getItemPaddingHorizontal(), 0, style.getItemPaddingHorizontal(), 0);
        tuxTextView.setGravity(16);
        tuxTextView.setIncludeFontPadding(false);
        tuxTextView.setText(content);
        tuxTextView.setTuxFont(style.getTextFont());
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        Integer LJI = C79045V0n.LJI(style.LIZ(), context);
        if (LJI != null) {
            LIZIZ = LJI.intValue();
        } else {
            LIZIZ = C04330Ez.LIZIZ(context, R.color.cu);
        }
        tuxTextView.setTextColor(LIZIZ);
        return tuxTextView;
    }

    public static final ConstraintLayout LIZIZ(Context context, String str, InterfaceC71429S1p style) {
        int LIZIZ;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(style, "style");
        int generateViewId = View.generateViewId();
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setIconRes(R.raw.icon_star_fill);
        Integer LJI = C79045V0n.LJI(style.LIZJ(), context);
        if (LJI != null) {
            tuxIconView.setTintColor(LJI.intValue());
        }
        tuxIconView.setId(generateViewId);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setText(str);
        tuxTextView.setTuxFont(style.getTextFont());
        tuxTextView.setMaxLines(1);
        tuxTextView.setGravity(16);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setIncludeFontPadding(false);
        Integer LJI2 = C79045V0n.LJI(style.LIZ(), context);
        if (LJI2 != null) {
            LIZIZ = LJI2.intValue();
        } else {
            LIZIZ = C04330Ez.LIZIZ(context, R.color.cu);
        }
        tuxTextView.setTextColor(LIZIZ);
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZJ = Float.valueOf(style.LJ());
        c110614Vt.LIZIZ = Integer.valueOf(style.LJII());
        constraintLayout.setBackground(c110614Vt.LIZ(context));
        constraintLayout.setPadding(style.getItemPaddingHorizontal(), 0, style.getItemPaddingHorizontal(), 0);
        C018905p c018905p = new C018905p(style.LIZLLL(), style.LIZLLL());
        c018905p.startToStart = 0;
        c018905p.topToTop = 0;
        c018905p.setMargins(0, style.LJI(), 0, 0);
        constraintLayout.addView(tuxIconView, c018905p);
        C018905p c018905p2 = new C018905p(-2, style.getItemHeight());
        c018905p2.setMarginStart(context.getResources().getDimensionPixelSize(R.dimen.p2));
        c018905p2.startToEnd = generateViewId;
        c018905p2.constrainedWidth = true;
        c018905p2.endToEnd = 0;
        c018905p2.topToTop = 0;
        c018905p2.bottomToBottom = 0;
        constraintLayout.addView(tuxTextView, c018905p2);
        return constraintLayout;
    }
}

package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.q;

/* renamed from: X.4l6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C118604l6 {
    public static View LIZ(Context context, String str) {
        LinearLayout LIZ = q.LIZ(context, 0);
        View view = new View(context);
        view.setBackground(context.getDrawable(R.drawable.bwc));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(view.getResources().getDimensionPixelOffset(R.dimen.dp), view.getResources().getDimensionPixelOffset(R.dimen.dm));
        layoutParams.setMarginStart(view.getResources().getDimensionPixelOffset(R.dimen.dn));
        layoutParams.topMargin = view.getResources().getDimensionPixelOffset(R.dimen.do);
        view.setLayoutParams(layoutParams);
        LIZ.addView(view);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMarginStart(tuxTextView.getResources().getDimensionPixelOffset(R.dimen.dr));
        tuxTextView.setLayoutParams(layoutParams2);
        tuxTextView.setTuxFont(41);
        tuxTextView.setTextColorRes(R.attr.go);
        tuxTextView.setText(str);
        LIZ.addView(tuxTextView);
        LIZ.setPadding(0, 0, 0, context.getResources().getDimensionPixelOffset(R.dimen.dq));
        return LIZ;
    }
}

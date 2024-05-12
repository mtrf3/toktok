package X;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* renamed from: X.4Vz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110674Vz {
    public static void LIZ(Activity activity, int i) {
        activity.getWindow().addFlags(67108864);
        View view = new View(activity);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, C63081OpJ.LJJJJLI(activity)));
        view.setBackgroundColor(i);
        ((ViewGroup) activity.getWindow().getDecorView()).addView(view);
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(viewGroup.getChildCount() - 1);
        viewGroup2.setFitsSystemWindows(true);
        viewGroup2.setClipToPadding(true);
    }
}

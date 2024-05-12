package X;

import android.view.View;
import com.google.android.material.datepicker.MaterialCalendar;
import com.zhiliaoapp.musically.R;

/* renamed from: X.VjA, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80536VjA extends C16120kC {
    public final /* synthetic */ MaterialCalendar LIZ;

    public C80536VjA(MaterialCalendar materialCalendar) {
        this.LIZ = materialCalendar;
    }

    @Override // X.C16120kC
    public final void onInitializeAccessibilityNodeInfo(View view, C17760mq c17760mq) {
        String string;
        super.onInitializeAccessibilityNodeInfo(view, c17760mq);
        if (this.LIZ.LJLLI.getVisibility() == 0) {
            string = this.LIZ.getString(R.string.i_k);
        } else {
            string = this.LIZ.getString(R.string.i_i);
        }
        c17760mq.LJJ(string);
    }
}

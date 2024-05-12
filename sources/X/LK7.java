package X;

import android.os.Bundle;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LK7 implements View.OnClickListener {
    public final /* synthetic */ ActivityC45651qj LJLIL;

    public LK7(ActivityC45651qj activityC45651qj) {
        this.LJLIL = activityC45651qj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Boolean LJ = C27740Aue.LJ(view);
        o.LJIIIIZZ(LJ, "isDoubleClick(it)");
        if (LJ.booleanValue()) {
            return;
        }
        C221018lt.LJFF("InboxPageHelper", "back icon clicked");
        Bundle bundle = new Bundle();
        bundle.putString("fromStart", "RootNode");
        bundle.putBoolean("isSmoothScroll", true);
        C54030LIk.LIZIZ = LJF.GOBACK_ICON.getValue();
        ActivityC45651qj activityC45651qj = this.LJLIL;
        if (activityC45651qj != null) {
            com.bytedance.hox.Hox.LJLLI.LIZ(activityC45651qj).Cv0(bundle, "page_feed");
        }
    }
}

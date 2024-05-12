package X;

import Y.ACListenerS29S0100000_9;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MFW extends RecyclerView.ViewHolder {
    public final View LJLIL;
    public final ActivityC45651qj LJLILLLLZI;

    public static void L(String str) {
        FMX.LJIILL("story_archive", new OSZ("personal_homepage", "enter_from"), new OSZ(str, "action_type"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MFW(ActivityC45651qj activity, View view) {
        super(view);
        o.LJIIIZ(view, "view");
        o.LJIIIZ(activity, "activity");
        this.LJLIL = view;
        this.LJLILLLLZI = activity;
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 0), view);
        C9AE.LIZ(view, C9AC.STRONG_MASK, 0.0f);
    }
}

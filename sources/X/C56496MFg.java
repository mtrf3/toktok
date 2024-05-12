package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.MFg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56496MFg extends RecyclerView.ViewHolder {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56496MFg(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        c188727au.LJIIIZ("action_type", "show");
        c188727au.LJIIIZ("optimize_type", "edit_profile");
        FMX.LJIIL("optimize_profile", c188727au.LIZ);
        C16880lQ.LJIIJ(ViewOnClickListenerC56497MFh.LJLIL, itemView.findViewById(R.id.i6o));
        C188727au c188727au2 = new C188727au();
        c188727au2.LJIIIZ("enter_from", "personal_homepage");
        c188727au2.LJIIIZ("action_type", "show");
        c188727au2.LJIIIZ("optimize_type", "find_friends");
        FMX.LJIIL("optimize_profile", c188727au2.LIZ);
        C16880lQ.LJIIJ(ViewOnClickListenerC56498MFi.LJLIL, itemView.findViewById(R.id.djm));
        C188727au c188727au3 = new C188727au();
        c188727au3.LJIIIZ("enter_from", "personal_homepage");
        c188727au3.LJIIIZ("action_type", "show");
        c188727au3.LJIIIZ("optimize_type", "shoot");
        FMX.LJIIL("optimize_profile", c188727au3.LIZ);
        C16880lQ.LJIIJ(ViewOnClickListenerC56495MFf.LJLIL, itemView.findViewById(R.id.jxp));
    }
}

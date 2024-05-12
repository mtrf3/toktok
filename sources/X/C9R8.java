package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.LiveEventBottomSheetFragment;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9R8, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9R8 {
    public static void LIZ(FragmentManager fragmentManager, User user, List list) {
        o.LJIIIZ(user, "user");
        LiveEventBottomSheetFragment liveEventBottomSheetFragment = new LiveEventBottomSheetFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("live_event_user", user);
        o.LJII(list, "null cannot be cast to non-null type java.io.Serializable");
        bundle.putSerializable("live_event_list", (Serializable) list);
        liveEventBottomSheetFragment.setArguments(bundle);
        ASL asl = new ASL();
        asl.LIZ.LJLLILLLL = liveEventBottomSheetFragment;
        asl.LJI(1);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLJ = true;
        tuxSheet.LJZI = false;
        tuxSheet.show(fragmentManager, "LiveEventBottomSheetFragment");
    }
}

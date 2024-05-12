package X;

import Y.IDDListenerS144S0100000_4;
import android.os.Bundle;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushOffReasonsData;
import com.ss.android.ugc.aweme.setting.serverpush.ui.PushOffReasonBottomSheetFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.AJt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26037AJt {
    public static PushOffReasonBottomSheetFragment LIZ(ActivityC45651qj fragmentActivity, AV9 av9, String str, PushOffReasonsData reasons) {
        o.LJIIIZ(fragmentActivity, "fragmentActivity");
        o.LJIIIZ(str, "switch");
        o.LJIIIZ(reasons, "reasons");
        PushOffReasonBottomSheetFragment pushOffReasonBottomSheetFragment = new PushOffReasonBottomSheetFragment();
        Bundle bundle = new Bundle();
        bundle.putString("enter_from", av9.LIZ);
        bundle.putString("enter_method", av9.LIZIZ);
        pushOffReasonBottomSheetFragment.setArguments(bundle);
        ASL asl = new ASL();
        asl.LIZ.LJLLILLLL = pushOffReasonBottomSheetFragment;
        asl.LJI(1);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLJ = true;
        tuxSheet.LJZI = false;
        asl.LJFF(16);
        IDDListenerS144S0100000_4 iDDListenerS144S0100000_4 = new IDDListenerS144S0100000_4(pushOffReasonBottomSheetFragment, 6);
        TuxSheet tuxSheet2 = asl.LIZ;
        tuxSheet2.LJLILLLLZI = iDDListenerS144S0100000_4;
        C1DG.LJII(fragmentActivity, "fragmentActivity.supportFragmentManager", tuxSheet2, "PushOffReasons");
        PushOffReasonBottomSheetFragment.LJLLL = reasons;
        PushOffReasonBottomSheetFragment.LJLLLL = str;
        return pushOffReasonBottomSheetFragment;
    }
}

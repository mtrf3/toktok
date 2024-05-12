package X;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.profile.ui.multiaccount.ChooseAccountBottomSheetFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AV6 {
    public static void LIZ(FragmentManager fm, AV9 av9, String tag, Bundle bundle, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnCancelListener onCancelListener) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(tag, "tag");
        ASL asl = new ASL();
        ChooseAccountBottomSheetFragment chooseAccountBottomSheetFragment = new ChooseAccountBottomSheetFragment();
        Bundle bundle2 = new Bundle();
        if (av9 != null) {
            bundle2.putString("enter_from", av9.LIZ);
            bundle2.putString("enter_method", av9.LIZIZ);
            bundle2.putString("channel", av9.LIZJ);
            bundle2.putString("sdk_name", av9.LIZLLL);
            bundle2.putString("sdk_version", av9.LJ);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        chooseAccountBottomSheetFragment.setArguments(bundle2);
        asl.LIZ.LJLLILLLL = chooseAccountBottomSheetFragment;
        asl.LJI(1);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLJ = true;
        tuxSheet.LJZI = false;
        if (onDismissListener != null) {
            asl.LJ(onDismissListener);
        }
        if (onCancelListener != null) {
            asl.LIZ.LJLIL = onCancelListener;
        }
        asl.LIZ.show(fm, tag);
    }
}

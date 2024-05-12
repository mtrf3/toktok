package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.review.OptionPickerDialogFragment;
import java.util.ArrayList;

/* renamed from: X.Rr6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70836Rr6 {
    public static OptionPickerDialogFragment LIZ(FragmentManager fragmentManager, String str, ArrayList arrayList, String str2, boolean z) {
        OptionPickerDialogFragment optionPickerDialogFragment = new OptionPickerDialogFragment();
        Bundle LIZJ = AnonymousClass036.LIZJ("title", str, "init_option_key", str2);
        LIZJ.putParcelableArrayList("option_list", arrayList);
        optionPickerDialogFragment.setArguments(LIZJ);
        ASL asl = new ASL();
        asl.LJI(0);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJZI = false;
        tuxSheet.LJLLJ = true;
        tuxSheet.LJLLILLLL = optionPickerDialogFragment;
        tuxSheet.LJLILLLLZI = optionPickerDialogFragment;
        if (z) {
            asl.LJI(0);
        } else {
            asl.LJI(1);
            int i = (int) C27162AlK.LIZJ;
            TuxSheet tuxSheet2 = asl.LIZ;
            tuxSheet2.LJLLLLLL = i;
            tuxSheet2.LJZL = true;
        }
        asl.LIZ.show(fragmentManager, "OptionPickerDialogFragment");
        return optionPickerDialogFragment;
    }
}

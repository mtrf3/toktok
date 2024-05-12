package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.review.OptionPickerDialogFragmentV1;
import java.util.ArrayList;

/* renamed from: X.Rr7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70837Rr7 {
    public static OptionPickerDialogFragmentV1 LIZ(FragmentManager fragmentManager, String str, ArrayList arrayList, String str2, String str3) {
        OptionPickerDialogFragmentV1 optionPickerDialogFragmentV1 = new OptionPickerDialogFragmentV1();
        Bundle LIZJ = AnonymousClass036.LIZJ("title", str, "init_option_key", str2);
        LIZJ.putString("selected_option_key", str3);
        LIZJ.putParcelableArrayList("option_list", arrayList);
        optionPickerDialogFragmentV1.setArguments(LIZJ);
        ASL asl = new ASL();
        asl.LJI(0);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJZI = false;
        tuxSheet.LJLLJ = true;
        tuxSheet.LJLLILLLL = optionPickerDialogFragmentV1;
        tuxSheet.LJLILLLLZI = optionPickerDialogFragmentV1;
        asl.LJI(0);
        asl.LIZ.show(fragmentManager, "OptionPickerDialogFragmentV1");
        return optionPickerDialogFragmentV1;
    }
}

package X;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.address.widget.RegionPickerDialogFragment;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS61S0201000_12;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Aq0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27452Aq0 {
    public static boolean LIZ(ClientConfig clientConfig, String str) {
        String str2;
        if (clientConfig == null || (str2 = clientConfig.singleStageSelectorKeys) == null) {
            return false;
        }
        return ORZ.LJLJJI(str, s.LJLJJL(str2, new String[]{"."}, 0, 6));
    }

    public static void LIZIZ(int i, String str, List list, int i2, FragmentManager fragmentManager, String str2, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns, AqS61S0201000_12 aqS61S0201000_12, Boolean bool, Boolean bool2, String str3, InterfaceC71003Rtn interfaceC71003Rtn, boolean z, String str4, String str5, String str6, String str7, Integer num, boolean z2, int i3) {
        boolean z3;
        int i4 = i;
        List list2 = list;
        Boolean bool3 = bool;
        String str8 = str;
        InterfaceC88472Yns<? super List<Region>, C76800UCe> onItemClick = aqS61S0201000_12;
        String str9 = str2;
        int i5 = i2;
        boolean z4 = z2;
        Integer num2 = num;
        String str10 = str7;
        String str11 = str6;
        String str12 = str3;
        Boolean bool4 = bool2;
        InterfaceC71003Rtn interfaceC71003Rtn2 = interfaceC71003Rtn;
        boolean z5 = z;
        String str13 = str4;
        String str14 = str5;
        if ((i3 & 1) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((i3 & 2) != 0) {
            i4 = 0;
        }
        if ((i3 & 4) != 0) {
            str8 = null;
        }
        if ((i3 & 8) != 0) {
            list2 = null;
        }
        if ((i3 & 64) != 0) {
            str9 = null;
        }
        if ((i3 & 512) != 0) {
            onItemClick = C27464AqC.LJLIL;
        }
        if ((i3 & 1024) != 0) {
            bool3 = null;
        }
        if ((i3 & 2048) != 0) {
            bool4 = null;
        }
        if ((i3 & 4096) != 0) {
            str12 = null;
        }
        if ((i3 & FileUtils.BUFFER_SIZE) != 0) {
            interfaceC71003Rtn2 = null;
        }
        if ((i3 & 16384) != 0) {
            z5 = false;
        }
        if ((32768 & i3) != 0) {
            str13 = null;
        }
        if ((65536 & i3) != 0) {
            str14 = null;
        }
        if ((131072 & i3) != 0) {
            str11 = null;
        }
        if ((262144 & i3) != 0) {
            str10 = null;
        }
        if ((524288 & i3) != 0) {
            num2 = null;
        }
        if ((i3 & 1048576) != 0) {
            z4 = false;
        }
        o.LJIIIZ(onItemClick, "onItemClick");
        if (fragmentManager == null) {
            return;
        }
        RegionPickerDialogFragment regionPickerDialogFragment = new RegionPickerDialogFragment();
        Bundle LIZ = C141415gn.LIZ("implement_type", i4);
        if (str8 != null) {
            LIZ.putString("geo_name_id", str8);
        }
        if (list2 != null) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            ORS.LJJLIIIJILLIZJL(list2, arrayList);
            LIZ.putParcelableArrayList("current_selected_region_list", arrayList);
        }
        LIZ.putBoolean("needs_dim", z3);
        if (i5 < 1) {
            i5 = Integer.MAX_VALUE;
        }
        LIZ.putInt("level_count", i5);
        LIZ.putString("page_info", str9);
        if (o.LJ(bool3, Boolean.TRUE)) {
            LIZ.putInt("height", C60996Nwm.LJ(EF7.LIZIZ()));
            LIZ.putBoolean("needs_dim", false);
        }
        if (interfaceC71003Rtn2 != null) {
            C79234V7u.LJJIJIIJI(LIZ, interfaceC71003Rtn2, null);
        } else if (str12 != null) {
            C79234V7u.LJJIJLIJ(LIZ, str12);
        }
        regionPickerDialogFragment.LJLJLJ = str14;
        regionPickerDialogFragment.LJLJLLL = str11;
        regionPickerDialogFragment.setArguments(LIZ);
        regionPickerDialogFragment.LJLIL = interfaceC88472Yns;
        regionPickerDialogFragment.LJLILLLLZI = onItemClick;
        regionPickerDialogFragment.LJLJI = interfaceC65784Pro;
        regionPickerDialogFragment.LJLJJI = bool4;
        regionPickerDialogFragment.LJLJJL = bool3;
        regionPickerDialogFragment.LJLJJLL = z5;
        regionPickerDialogFragment.LJLJL = str13;
        regionPickerDialogFragment.LJLL = str10;
        regionPickerDialogFragment.LJLLI = num2;
        regionPickerDialogFragment.LJLLILLLL = z4;
        regionPickerDialogFragment.show(fragmentManager, "");
    }
}

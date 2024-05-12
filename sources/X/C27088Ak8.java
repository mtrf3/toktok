package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ak8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27088Ak8 {
    public static DistrictFragment LIZ(String str, List list, int i, String str2, Boolean bool, Boolean bool2, Boolean bool3, InterfaceC71003Rtn interfaceC71003Rtn, boolean z, String str3, String str4, String str5, Integer num, boolean z2, boolean z3, int i2) {
        String str6;
        boolean z4 = z3;
        boolean z5 = z2;
        String str7 = str5;
        String str8 = str2;
        String str9 = str4;
        int i3 = i;
        String str10 = str3;
        InterfaceC71003Rtn interfaceC71003Rtn2 = interfaceC71003Rtn;
        boolean z6 = z;
        String str11 = "";
        if ((i2 & 1) != 0) {
            str = "";
        }
        if ((i2 & 2) != 0) {
            list = null;
        }
        if ((i2 & 4) != 0) {
            i3 = 0;
        }
        if ((i2 & 8) != 0) {
            str8 = null;
        }
        if ((i2 & 16) != 0) {
            bool = null;
        }
        if ((i2 & 32) != 0) {
            bool2 = null;
        }
        if ((i2 & 64) != 0) {
            bool3 = null;
        }
        if ((i2 & 128) != 0) {
            interfaceC71003Rtn2 = null;
        }
        if ((i2 & 256) != 0) {
            z6 = false;
        }
        if ((i2 & 512) != 0) {
            str10 = null;
        }
        if ((i2 & 1024) != 0) {
            str9 = null;
        }
        if ((i2 & 2048) != 0) {
            str7 = null;
        }
        if ((i2 & 4096) != 0) {
            num = null;
        }
        if ((i2 & FileUtils.BUFFER_SIZE) != 0) {
            z5 = false;
        }
        if ((i2 & 16384) != 0) {
            z4 = false;
        }
        Bundle bundle = new Bundle();
        District[] districtArr = new District[1];
        if (str == null) {
            str6 = "";
        } else {
            str6 = str;
        }
        districtArr[0] = new District(null, str6, null, null, null, null, null, null, null, 509, null);
        ArrayList<? extends Parcelable> LJII = C47261Igj.LJII(districtArr);
        if (list != null) {
            for (Region region : list) {
                LJII.add(new District(region.name, region.geoNameId, region.code, null, null, null, null, null, null, 504, null));
            }
        }
        bundle.putParcelableArrayList("current_selected_region_list", LJII);
        if (i3 >= 1) {
            bundle.putInt("level_count", Math.max(i3, LJII.size() - 1) - 1);
        }
        if (bool != null) {
            bundle.putBoolean("needSearchBox", bool.booleanValue());
        }
        if (bool2 != null) {
            bundle.putBoolean("needStandaloneSearch", bool2.booleanValue());
        }
        if (bool3 != null) {
            bundle.putBoolean("needLocate", bool3.booleanValue());
        }
        if (interfaceC71003Rtn2 != null) {
            C79234V7u.LJJIJIIJI(bundle, interfaceC71003Rtn2, null);
        }
        bundle.putBoolean("if_auto_locate", z6);
        if (str10 != null) {
            bundle.putString("previous_page", str10);
        }
        if (str7 != null) {
            bundle.putString("location", str7);
        }
        if (str8 != null) {
            bundle.putString("page_info", str8);
        }
        if (num != null) {
            bundle.putInt("is_with_delivery_info", num.intValue());
        }
        if (str != null) {
            str11 = str;
        }
        bundle.putString("country_geo_name_id", str11);
        DistrictFragment districtFragment = new DistrictFragment();
        districtFragment.setArguments(bundle);
        districtFragment.LJLJJL = str9;
        districtFragment.LJLJJLL = z5;
        districtFragment.LJLJL = z4;
        return districtFragment;
    }
}

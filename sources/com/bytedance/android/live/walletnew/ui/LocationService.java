package com.bytedance.android.live.walletnew.ui;

import X.ActivityC45651qj;
import X.C45804HyK;
import X.C47261Igj;
import X.C77553Uc9;
import X.C77757UfR;
import X.C77857Uh3;
import X.InterfaceC77761UfV;
import X.InterfaceC77762UfW;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.wallet.api.ILocationPickerService;
import com.bytedance.android.live.wallet.model.LocationObject;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class LocationService implements ILocationPickerService {
    public static final C77757UfR LJLIL = new C77757UfR();

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    public final void LIZ(Context context, String str, C77553Uc9 c77553Uc9, C77857Uh3 c77857Uh3) {
        Hd(context, "CA", str, 1, c77553Uc9, c77857Uh3);
    }

    public final void LIZLLL(Context context, String str, C77553Uc9 c77553Uc9, C77857Uh3 c77857Uh3) {
        Hd(context, "US", str, 3, c77553Uc9, c77857Uh3);
    }

    @Override // com.bytedance.android.live.wallet.api.ILocationPickerService
    public final void rI(Context context, String str, String str2, C77553Uc9 c77553Uc9, C77857Uh3 c77857Uh3) {
        if (o.LJ(str, "United States")) {
            LIZLLL(context, str2, c77553Uc9, c77857Uh3);
        } else {
            if (!o.LJ(str, "Canada")) {
                return;
            }
            LIZ(context, str2, c77553Uc9, c77857Uh3);
        }
    }

    @Override // com.bytedance.android.live.wallet.api.ILocationPickerService
    public final void Hd(Context context, String region, String str, int i, InterfaceC77761UfV interfaceC77761UfV, InterfaceC77762UfW interfaceC77762UfW) {
        ActivityC45651qj LJJIFFI;
        FragmentManager supportFragmentManager;
        List<String> LJJIJIIJI;
        FragmentManager supportFragmentManager2;
        o.LJIIIZ(region, "region");
        if (context != null) {
            ActivityC45651qj LJJIFFI2 = C45804HyK.LJJIFFI(context);
            if ((LJJIFFI2 == null || (supportFragmentManager2 = LJJIFFI2.getSupportFragmentManager()) == null || (supportFragmentManager2.LJJJIL("LocationPicker") == null && context != null)) && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null) {
                LocationList locationList = new LocationList();
                locationList.LJLIL = context;
                locationList.LJLJI = region;
                if (str == null) {
                    str = "";
                }
                locationList.LJLLL = str;
                locationList.LJLJLLL = i;
                locationList.LJLJJI = interfaceC77761UfV;
                locationList.LJLJJL = interfaceC77762UfW;
                LJLIL.getClass();
                if (o.LJ(region, "CA")) {
                    LJJIJIIJI = C47261Igj.LJJIJIIJI("region", "province");
                } else {
                    LJJIJIIJI = C47261Igj.LJJIJIIJI("region", "state", "county", "city");
                }
                locationList.LJLLLLLL = LJJIJIIJI;
                if (LJJIJIIJI != null) {
                    if (LJJIJIIJI.size() != locationList.LJLJLLL + 1) {
                        locationList.LJLLI = 2;
                        locationList.LJZ = "Location Key Size not Match, Please set the location key in LocationService.kt";
                        locationList.dismiss();
                    }
                    int i2 = locationList.LJLJLLL + 1;
                    LocationObject[] locationObjectArr = new LocationObject[i2];
                    for (int i3 = 0; i3 < i2; i3++) {
                        locationObjectArr[i3] = new LocationObject();
                    }
                    locationList.LJLZ = locationObjectArr;
                    locationList.show(supportFragmentManager, "LocationPicker");
                    return;
                }
                o.LJIJI("locationKey");
                throw null;
            }
        }
    }
}

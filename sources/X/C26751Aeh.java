package X;

import android.content.Intent;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;

/* renamed from: X.Aeh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26751Aeh {
    public static AddressPageStarter.AddressListEnterParams LIZ(Intent intent) {
        boolean z;
        boolean z2;
        Integer num;
        int i;
        String LLJJIJIIJIL;
        Integer num2 = null;
        if (intent == null) {
            return null;
        }
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "trackParams");
        try {
            String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(intent, "is_select_mode");
            if (LLJJIJIIJIL3 != null) {
                z = Boolean.parseBoolean(LLJJIJIIJIL3);
            } else {
                z = false;
            }
            if (!z && (LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "is_select_mode")) != null && CastIntegerProtector.parseInt(LLJJIJIIJIL) == 1) {
                z = true;
            }
            String LLJJIJIIJIL4 = C16880lQ.LLJJIJIIJIL(intent, "from_incentive");
            if (LLJJIJIIJIL4 != null) {
                z2 = Boolean.parseBoolean(LLJJIJIIJIL4);
            } else {
                z2 = false;
            }
            String LLJJIJIIJIL5 = C16880lQ.LLJJIJIIJIL(intent, "incentive_record_id");
            String LLJJIJIIJIL6 = C16880lQ.LLJJIJIIJIL(intent, "product_id");
            String LLJJIJIIJIL7 = C16880lQ.LLJJIJIIJIL(intent, "mark_unavailable_address");
            if (LLJJIJIIJIL7 != null) {
                num = Integer.valueOf(CastIntegerProtector.parseInt(LLJJIJIIJIL7));
            } else {
                num = null;
            }
            String LLJJIJIIJIL8 = C16880lQ.LLJJIJIIJIL(intent, WM7.SCENE_SERVICE);
            if (LLJJIJIIJIL8 == null || LLJJIJIIJIL8.length() == 0) {
                num2 = 0;
            } else {
                String LLJJIJIIJIL9 = C16880lQ.LLJJIJIIJIL(intent, WM7.SCENE_SERVICE);
                if (LLJJIJIIJIL9 != null) {
                    num2 = Integer.valueOf(CastIntegerProtector.parseInt(LLJJIJIIJIL9));
                }
            }
            String LLJJIJIIJIL10 = C16880lQ.LLJJIJIIJIL(intent, "scene_params_str");
            String LLJJIJIIJIL11 = C16880lQ.LLJJIJIIJIL(intent, "select_scene");
            if (LLJJIJIIJIL11 == null || LLJJIJIIJIL11.length() == 0) {
                i = 0;
            } else {
                i = Integer.valueOf(CastIntegerProtector.parseInt(LLJJIJIIJIL11));
            }
            return new AddressPageStarter.AddressListEnterParams(z, LLJJIJIIJIL2, z2, LLJJIJIIJIL5, LLJJIJIIJIL6, num, num2, LLJJIJIIJIL10, i, C16880lQ.LLJJIJIIJIL(intent, "extra_info"));
        } catch (Exception unused) {
            return new AddressPageStarter.AddressListEnterParams(false, LLJJIJIIJIL2, false, null, null, null, null, null, null, null, 1020, null);
        }
    }
}

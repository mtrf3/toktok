package com.ss.android.ugc.aweme.donation;

import X.ASL;
import X.ActivityC45651qj;
import X.C3AP;
import X.C42885GsL;
import X.C58096Mr6;
import X.C62867Olr;
import X.C76L;
import X.C770830u;
import X.DialogC111054Xl;
import X.EFJ;
import X.ExecutorC142245i8;
import X.RunnableC65751PrH;
import X.V1B;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.donation.detail.DonationFragment;
import com.ss.android.ugc.aweme.donation.detail.DonationInterceptor;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class DonationServiceImpl implements IDonationService {
    public static IDonationService LJI() {
        Object LIZ = C58096Mr6.LIZ(IDonationService.class, false);
        if (LIZ != null) {
            return (IDonationService) LIZ;
        }
        if (C58096Mr6.y == null) {
            synchronized (IDonationService.class) {
                if (C58096Mr6.y == null) {
                    C58096Mr6.y = new DonationServiceImpl();
                }
            }
        }
        return C58096Mr6.y;
    }

    @Override // com.ss.android.ugc.aweme.donation.IDonationService
    public final DonationInterceptor LIZJ() {
        return new DonationInterceptor();
    }

    @Override // com.ss.android.ugc.aweme.donation.IDonationService
    public final DialogC111054Xl LIZIZ(Context context) {
        return new DialogC111054Xl(context);
    }

    @Override // com.ss.android.ugc.aweme.donation.IDonationService
    public final void LIZ(int i, ActivityC45651qj activityC45651qj, Bundle bundle, Fragment fragment, String str) {
        C76L donateDetail;
        DialogC111054Xl dialogC111054Xl = new DialogC111054Xl(activityC45651qj);
        V1B.LJLJJL(dialogC111054Xl);
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str2 = EFJ.LIZJ;
        DonateApi donateApi = (DonateApi) C770830u.LIZJ(str2, "API_URL_PREFIX_SI", LIZLLL, str2).LIZ.LIZ(DonateApi.class);
        long j = 0L;
        try {
            j = Long.valueOf(CastLongProtector.parseLong(str));
        } catch (NumberFormatException unused) {
        }
        donateDetail = donateApi.getDonateDetail(null, 0, Integer.valueOf(i), str, j, 3, "", true);
        C62867Olr c62867Olr = new C62867Olr(activityC45651qj, str, dialogC111054Xl, bundle, fragment, i);
        donateDetail.LJFF(new RunnableC65751PrH(donateDetail, c62867Olr), ExecutorC142245i8.LJLILLLLZI);
    }

    @Override // com.ss.android.ugc.aweme.donation.IDonationService
    public final void LIZLLL(Context context, String str, String str2, String str3, Bundle bundle) {
        o.LJIIIZ(context, "context");
        C3AP.LIZ(context, str, 1, str2, str3, new JSONObject().toString(), null, new C42885GsL(context, bundle));
    }

    @Override // com.ss.android.ugc.aweme.donation.IDonationService
    public final TuxSheet LJ(int i, Bundle bundle, String orgId, String orgType, String effectId) {
        o.LJIIIZ(orgId, "orgId");
        o.LJIIIZ(orgType, "orgType");
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(bundle, "bundle");
        DonationFragment donationFragment = new DonationFragment();
        bundle.putInt("ngo_id", i);
        bundle.putString("organization_id", orgId);
        bundle.putString("organization_type", orgType);
        bundle.putString("sticker_id", effectId);
        bundle.putInt("item_type", 4);
        donationFragment.setArguments(bundle);
        ASL asl = new ASL();
        asl.LIZ.LJLLILLLL = donationFragment;
        asl.LJI(0);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJZI = false;
        return tuxSheet;
    }

    @Override // com.ss.android.ugc.aweme.donation.IDonationService
    public final TuxSheet LJFF(int i, Bundle bundle, String orgId, String orgType, String str) {
        o.LJIIIZ(orgId, "orgId");
        o.LJIIIZ(orgType, "orgType");
        DonationFragment donationFragment = new DonationFragment();
        bundle.putInt("ngo_id", i);
        bundle.putString("organization_id", orgId);
        bundle.putString("organization_type", orgType);
        bundle.putString("profile_uid", str);
        bundle.putInt("item_type", 3);
        donationFragment.setArguments(bundle);
        ASL asl = new ASL();
        asl.LIZ.LJLLILLLL = donationFragment;
        asl.LJI(0);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJZI = false;
        return tuxSheet;
    }
}

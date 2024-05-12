package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.AgeGateServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.StoreRegionResponseData;
import org.json.JSONObject;
import ujb.o;

/* renamed from: X.OBt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61501OBt extends AbstractC67055QTj<C68922R3e> {
    public final /* synthetic */ long LIZ;
    public final /* synthetic */ AgeGateServiceImpl LIZIZ;

    @Override // X.AbstractC67055QTj
    public final void onSuccess(C68922R3e c68922R3e) {
        int i;
        JSONObject jSONObject;
        String str;
        boolean z;
        C68922R3e c68922R3e2 = c68922R3e;
        long currentTimeMillis = System.currentTimeMillis() - this.LIZ;
        if (c68922R3e2 != null) {
            i = c68922R3e2.LIZLLL;
        } else {
            i = 0;
        }
        OPZ.LIZLLL(0, i, currentTimeMillis, "/passport/app/store_region/");
        String str2 = null;
        if (c68922R3e2 != null) {
            jSONObject = c68922R3e2.LJIILJJIL;
        } else {
            jSONObject = null;
        }
        AgeGateServiceImpl ageGateServiceImpl = this.LIZIZ;
        StoreRegionResponseData storeRegionResponseData = (StoreRegionResponseData) GsonProtectorUtils.fromJson(C75792yF.LIZIZ(), String.valueOf(jSONObject), StoreRegionResponseData.class);
        if (storeRegionResponseData != null) {
            str = storeRegionResponseData.storeRegion;
        } else {
            str = null;
        }
        StoreRegionResponseData storeRegionResponseData2 = (StoreRegionResponseData) GsonProtectorUtils.fromJson(C75792yF.LIZIZ(), String.valueOf(jSONObject), StoreRegionResponseData.class);
        if (storeRegionResponseData2 != null) {
            str2 = storeRegionResponseData2.countryName;
        }
        ageGateServiceImpl.LJFF(0, str, str2, "passport_api");
        try {
            StoreRegionResponseData storeRegionResponseData3 = (StoreRegionResponseData) C75792yF.LIZIZ().LJI(String.valueOf(jSONObject), StoreRegionResponseData.class);
            if (storeRegionResponseData3 != null) {
                z = storeRegionResponseData3.enabledRegionOption;
            } else {
                z = true;
            }
            ageGateServiceImpl.LJFF = z;
        } catch (Exception unused) {
        }
        if (C78685UuP.LJJJZ(this.LIZIZ.LJ.LIZ)) {
            C188727au LIZJ = C78920UyC.LIZJ(o.LJJJJIZL(this.LIZIZ.LJ.LIZ, C85990Xow.LIZ(), true) ? 1 : 0, "is_accurate");
            LIZJ.LJIIIZ("reg_region", this.LIZIZ.LJ.LIZ);
            FMX.LJIIL("store_region_accuracy", LIZJ.LIZ);
        }
    }

    public C61501OBt(long j, AgeGateServiceImpl ageGateServiceImpl) {
        this.LIZ = j;
        this.LIZIZ = ageGateServiceImpl;
    }

    @Override // X.AbstractC67055QTj
    public final void onError(C68922R3e c68922R3e, int i) {
        OPZ.LIZLLL(1, i, System.currentTimeMillis() - this.LIZ, "/passport/app/store_region/");
    }
}

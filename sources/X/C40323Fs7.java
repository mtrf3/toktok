package X;

import android.util.Pair;
import com.bytedance.geckox.model.UpdatePackage;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Fs7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C40323Fs7 extends AbstractC61537ODd {
    @Override // X.AbstractC61537ODd
    public final void LJIIL() {
        IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
        if (LJJI != null) {
            LJJI.LJI();
            NHG.LJIILIIL();
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LIZIZ(UpdatePackage updatePackage) {
        C09900aA.LJIIJJI("aweme_service_gecko_activate_rate", 0, LJIILLIIL(updatePackage.getVersion(), null));
        IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
        if (LJJI != null) {
            LJJI.LJI();
            NHG nhg = NHG.LIZ;
            updatePackage.getVersion();
            nhg.LJII(updatePackage.getChannel());
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LJIIIIZZ(UpdatePackage updatePackage) {
        C09900aA.LJIIJJI("aweme_service_gecko_download_rate", 0, LJIILLIIL(updatePackage.getVersion(), null));
        IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
        if (LJJI != null) {
            LJJI.LJI();
            NHG.LIZ.LJIIJJI(updatePackage.getVersion(), updatePackage.getFullPackage().getLength(), updatePackage.getChannel());
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LJIILIIL(UpdatePackage updatePackage) {
        IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
        if (LJJI != null) {
            LJJI.LJI();
            NHG.LJIIL(updatePackage.getChannel(), updatePackage.isPatchUpdate());
        }
    }

    public static JSONObject LJIILLIIL(long j, Throwable th) {
        JSONObject jSONObject = new JSONObject();
        if (j != -1) {
            try {
                jSONObject.put("gecko_id", String.valueOf(j));
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        if (th != null) {
            jSONObject.put("errorDesc", th.toString());
        }
        return jSONObject;
    }

    @Override // X.AbstractC61537ODd
    public final void LIZ(UpdatePackage updatePackage, Throwable th) {
        C09900aA.LJIIJJI("aweme_service_gecko_activate_rate", 1, LJIILLIIL(updatePackage.getVersion(), th));
        IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
        if (LJJI != null) {
            LJJI.LJI();
            NHG nhg = NHG.LIZ;
            updatePackage.getVersion();
            nhg.LJI(updatePackage.getChannel(), th);
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LIZLLL(Throwable th, java.util.Map map) {
        C09900aA.LJIIJJI("aweme_service_gecko_check_update_rate", 1, LJIILLIIL(-1L, th));
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
                if (LJJI != null) {
                    LJJI.LJI();
                    NHG.LJIIIIZZ((List) entry.getValue(), false);
                }
            }
        }
    }

    @Override // X.AbstractC61537ODd
    public void LJFF(java.util.Map<String, List<Pair<String, Long>>> map, java.util.Map<String, List<UpdatePackage>> map2) {
        C09900aA.LJIIJJI("aweme_service_gecko_check_update_rate", 0, LJIILLIIL(-1L, null));
        if (map2 != null && !map2.isEmpty()) {
            Iterator<Map.Entry<String, List<UpdatePackage>>> it = map2.entrySet().iterator();
            while (it.hasNext()) {
                List<UpdatePackage> value = it.next().getValue();
                if (!C38891fp.LJJI(value)) {
                    ArrayList arrayList = new ArrayList();
                    for (UpdatePackage updatePackage : value) {
                        arrayList.add(new Pair(updatePackage.getChannel(), Long.valueOf(updatePackage.getVersion())));
                    }
                    IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
                    if (LJJI != null) {
                        LJJI.LJI();
                        NHG.LJIIIIZZ(arrayList, true);
                    }
                }
            }
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LJI(UpdatePackage updatePackage, Throwable th) {
        C09900aA.LJIIJJI("aweme_service_gecko_download_rate", 1, LJIILLIIL(updatePackage.getVersion(), th));
        IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
        if (LJJI != null) {
            LJJI.LJI();
            NHG.LJIIJ(updatePackage.getVersion(), updatePackage.getChannel(), updatePackage.getFullPackage().getLength(), th);
        }
    }
}

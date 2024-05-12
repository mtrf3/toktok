package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.exception.BDLocationException;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import com.ss.android.ugc.tiktok.location_api.service.proxy.BDLocationProxy;
import java.util.List;

/* renamed from: X.XdF, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85265XdF implements InterfaceC56182M3e {
    public final /* synthetic */ InterfaceC73573Su9<PoiSearchApi.PoiSearchResultWrapper> LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ PoiSearchApi.PoiSearchRecallResult LIZLLL;
    public final /* synthetic */ List<PoiSearchApi.PoiGroup> LJ;

    @Override // X.InterfaceC56182M3e
    public final void LIZ(J0X j0x) {
        if (!this.LIZ.isDisposed() && j0x != null) {
            this.LIZ.onError(j0x);
        }
    }

    @Override // X.InterfaceC56182M3e
    public final void LIZIZ(BDLocationProxy bDLocationProxy) {
        int i;
        List<PoiData> list = null;
        if (bDLocationProxy != null) {
            double unshiftedLatitude = bDLocationProxy.getUnshiftedLatitude();
            double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
            if (unshiftedLatitude != LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && bDLocationProxy.getUnshiftedLongitude() != LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                PoiSearchApi.PoiSearchRecallResult poiSearchRecallResult = this.LIZLLL;
                List<PoiSearchApi.PoiGroup> list2 = this.LJ;
                double unshiftedLatitude2 = bDLocationProxy.getUnshiftedLatitude();
                double unshiftedLongitude = bDLocationProxy.getUnshiftedLongitude();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("logId: ");
                LIZ.append(poiSearchRecallResult.getLogId());
                C85267XdH.LIZJ(X1D.LIZIZ(LIZ));
                double d2 = Double.MAX_VALUE;
                for (PoiSearchApi.PoiGroup poiGroup : list2) {
                    if (poiGroup != null && (poiGroup.getLatitude() != d || poiGroup.getLongitude() != d)) {
                        double latitude = poiGroup.getLatitude();
                        double cos = Math.cos(StrictMath.toRadians((latitude + unshiftedLatitude2) / 2.0d)) * StrictMath.toRadians(unshiftedLongitude - poiGroup.getLongitude()) * 6371008.7714d;
                        double radians = StrictMath.toRadians(unshiftedLatitude2 - latitude) * 6371008.7714d;
                        double sqrt = Math.sqrt((radians * radians) + (cos * cos));
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("unshiftedLatitude: ");
                        LIZ2.append(unshiftedLatitude2);
                        LIZ2.append("; unshiftedLongitude: ");
                        LIZ2.append(unshiftedLongitude);
                        LIZ2.append("; latitude: ");
                        LIZ2.append(poiGroup.getLatitude());
                        LIZ2.append("; longitude: ");
                        LIZ2.append(poiGroup.getLongitude());
                        LIZ2.append("; distance: ");
                        LIZ2.append(sqrt);
                        C85267XdH.LIZJ(X1D.LIZIZ(LIZ2));
                        if (sqrt < d2) {
                            list = poiGroup.getPoiList();
                            d2 = sqrt;
                        }
                    }
                    d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                }
            }
        }
        if (!this.LIZ.isDisposed()) {
            if (list != null) {
                InterfaceC73573Su9<PoiSearchApi.PoiSearchResultWrapper> interfaceC73573Su9 = this.LIZ;
                PoiSearchApi.PoiSearchRecallResult poiSearchRecallResult2 = this.LIZLLL;
                if (poiSearchRecallResult2.isSuccessful$poi_release()) {
                    i = 200;
                } else {
                    i = 0;
                }
                interfaceC73573Su9.onNext(new PoiSearchApi.PoiSearchResultWrapper(i, new PoiSearchApi.PoiSearchResult(0, 0, 0, 0, poiSearchRecallResult2.getLogId(), list, poiSearchRecallResult2.getCacheForSearch()), null, null, 12, null));
                interfaceC73573Su9.onComplete();
                return;
            }
            InterfaceC73573Su9<PoiSearchApi.PoiSearchResultWrapper> interfaceC73573Su92 = this.LIZ;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append('(');
            LIZ3.append(this.LIZIZ);
            LIZ3.append(',');
            interfaceC73573Su92.onError(new J0X(JBR.LJFF(LIZ3, this.LIZJ, ") location empty", LIZ3), "location sdk", ""));
        }
    }

    @Override // X.InterfaceC56182M3e, com.bytedance.bdlocation.callback.BDLocationCallback
    public final void onError(BDLocationException bDLocationException) {
        C56181M3d.LIZ(this, bDLocationException);
    }

    @Override // X.InterfaceC56182M3e, com.bytedance.bdlocation.callback.BDLocationCallback
    public final void onLocationChanged(BDLocation bDLocation) {
        C56181M3d.LIZIZ(this, bDLocation);
    }

    public C85265XdF(C73433Srt c73433Srt, String str, String str2, PoiSearchApi.PoiSearchRecallResult poiSearchRecallResult, List list) {
        this.LIZ = c73433Srt;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = poiSearchRecallResult;
        this.LJ = list;
    }
}

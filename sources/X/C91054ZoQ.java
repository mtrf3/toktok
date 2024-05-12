package X;

import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.LocationUtil;
import com.bytedance.bdlocation.callback.LocationUploadCallback;
import com.bytedance.bdlocation.log.Logger;
import com.bytedance.bdlocation.network.response.LocInfoRspData;
import com.bytedance.bdlocation.network.response.LocationResp;

/* renamed from: X.ZoQ, reason: case insensitive filesystem */
/* loaded from: classes24.dex */
public final class C91054ZoQ implements LocationUploadCallback {
    public final /* synthetic */ long LIZ;
    public final /* synthetic */ BDLocation LIZIZ;
    public final /* synthetic */ C91055ZoR LIZJ;

    @Override // com.bytedance.bdlocation.callback.LocationUploadCallback
    public final void onError(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LocationCallbackServer upload interval:");
        LIZ.append(System.currentTimeMillis() - this.LIZ);
        Logger.i(X1D.LIZIZ(LIZ));
        this.LIZJ.LIZJ(LocationUtil.toOriginLocation(this.LIZIZ), false);
    }

    @Override // com.bytedance.bdlocation.callback.LocationUploadCallback
    public final void onSuccess(LocationResp locationResp) {
        BDLocation bDLocation;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(locationResp);
        LIZ.append("---uploadSource:");
        LIZ.append(this.LIZJ.LIZJ.getUploadSource());
        Logger.d("BDRegionLocation Upload success:", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("LocationCallbackServer upload intervalTime:");
        LIZ2.append(System.currentTimeMillis() - this.LIZ);
        Logger.i(X1D.LIZIZ(LIZ2));
        LocInfoRspData parseLocInfoRsp = LocationUtil.parseLocInfoRsp(locationResp);
        if (parseLocInfoRsp != null) {
            bDLocation = LocationUtil.locationResultToBDLocation(LocationUtil.toOriginLocation(this.LIZIZ), parseLocInfoRsp.location);
        } else {
            bDLocation = null;
        }
        C91055ZoR c91055ZoR = this.LIZJ;
        if (bDLocation == null) {
            bDLocation = LocationUtil.toOriginLocation(this.LIZIZ);
        }
        c91055ZoR.LIZJ(bDLocation, false);
    }

    public C91054ZoQ(C91055ZoR c91055ZoR, long j, BDLocation bDLocation) {
        this.LIZJ = c91055ZoR;
        this.LIZ = j;
        this.LIZIZ = bDLocation;
    }
}

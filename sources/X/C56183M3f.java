package X;

import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.callback.BDLocationCallback;
import com.bytedance.bdlocation.exception.BDLocationException;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.poi.service.PoiServiceImpl;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import kotlin.jvm.internal.o;

/* renamed from: X.M3f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56183M3f implements BDLocationCallback {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ InterfaceC56182M3e LIZJ;
    public final /* synthetic */ long LIZLLL;
    public final /* synthetic */ Cert LJ;
    public final /* synthetic */ Cert LJFF;

    @Override // com.bytedance.bdlocation.callback.BDLocationCallback
    public final void onError(BDLocationException bDLocationException) {
        String str;
        InterfaceC56182M3e interfaceC56182M3e = this.LIZJ;
        if (interfaceC56182M3e != null) {
            interfaceC56182M3e.onError(bDLocationException);
        }
        IPoiService LIZIZ = PoiServiceImpl.LIZIZ();
        M3Z m3z = new M3Z("fetch_location_result");
        m3z.LIZ(0L);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append('_');
        LIZ.append(this.LIZIZ);
        String valueStr = X1D.LIZIZ(LIZ);
        o.LJIIIZ(valueStr, "valueStr");
        m3z.LIZLLL = valueStr;
        LIZIZ.LJJLIIIJ(m3z);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("e = ");
        if (bDLocationException != null) {
            str = bDLocationException.getMessage();
        } else {
            str = null;
        }
        LIZ2.append(str);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("LocationService", X1D.LIZIZ(LIZ2));
    }

    @Override // com.bytedance.bdlocation.callback.BDLocationCallback
    public final void onLocationChanged(BDLocation bDLocation) {
        IPoiService LIZIZ = PoiServiceImpl.LIZIZ();
        M3Z m3z = new M3Z("fetch_location_result");
        m3z.LIZ(1L);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append('_');
        LIZ.append(this.LIZIZ);
        String valueStr = X1D.LIZIZ(LIZ);
        o.LJIIIZ(valueStr, "valueStr");
        m3z.LIZLLL = valueStr;
        LIZIZ.LJJLIIIJ(m3z);
        InterfaceC56182M3e interfaceC56182M3e = this.LIZJ;
        if (interfaceC56182M3e != null) {
            interfaceC56182M3e.onLocationChanged(bDLocation);
        }
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("LocationService", String.valueOf(bDLocation));
        if (bDLocation != null && !bDLocation.isCache()) {
            IPoiService LIZIZ2 = PoiServiceImpl.LIZIZ();
            M3Z m3z2 = new M3Z("fetch_location_cost_time");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(this.LIZ);
            LIZ2.append('_');
            LIZ2.append(this.LIZIZ);
            String valueStr2 = X1D.LIZIZ(LIZ2);
            o.LJIIIZ(valueStr2, "valueStr");
            m3z2.LIZLLL = valueStr2;
            m3z2.LIZ(System.currentTimeMillis() - this.LIZLLL);
            LIZIZ2.LJJLIIIJ(m3z2);
        }
        Cert cert = this.LJ;
        if (cert != null) {
            C56184M3g.LIZ(this.LJFF, cert, bDLocation, this.LIZ, this.LIZIZ);
        }
    }

    public C56183M3f(String str, String str2, InterfaceC56182M3e interfaceC56182M3e, long j, Cert cert, Cert cert2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = interfaceC56182M3e;
        this.LIZLLL = j;
        this.LJ = cert;
        this.LJFF = cert2;
    }
}

package X;

import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.ttlivestreamer.livestreamv2.LiveStream;
import com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfColorHistFilter;
import org.json.JSONObject;

/* renamed from: X.OZo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C62120OZo implements IMainService.DownLoadFinishListener, BmfColorHistFilter.ResultCallback {
    public final /* synthetic */ Object LIZ;

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfColorHistFilter.ResultCallback
    public final void onResult(JSONObject jSONObject, long j) {
        ((LiveStream) this.LIZ).lambda$initBmfVideoFilters$11(jSONObject, j);
    }

    public /* synthetic */ C62120OZo(Object obj) {
        this.LIZ = obj;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService.DownLoadFinishListener
    public final void doAfterDownLoad(int i, Boolean bool) {
        C62114OZi c62114OZi = (C62114OZi) this.LIZ;
        if (c62114OZi.LIZIZ != null) {
            if (bool.booleanValue()) {
                ((ScanQRCodeActivityV2) c62114OZi.LIZIZ).LLFZ();
                ((ScanQRCodeActivityV2) c62114OZi.LIZIZ).LLIIJI();
                ((ScanQRCodeActivityV2) c62114OZi.LIZIZ).LJZL.clearAnimation();
                return;
            }
            ((ScanQRCodeActivityV2) c62114OZi.LIZIZ).LLIIJI();
            if (i == 0) {
                ((ScanQRCodeActivityV2) c62114OZi.LIZIZ).LLII(200);
            } else if (i == -1) {
                ((ScanQRCodeActivityV2) c62114OZi.LIZIZ).LLII(0);
            } else {
                ((ScanQRCodeActivityV2) c62114OZi.LIZIZ).LLII(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
            }
        }
    }
}

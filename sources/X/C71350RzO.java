package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceCommodityListViewModel;
import com.ss.android.ugc.aweme.ecommerce.model.CommonVideoAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.model.EnterContext;
import com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoResponseData;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.RzO, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71350RzO<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ ECommerceCommodityListViewModel LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ List<String> LIZJ;
    public final /* synthetic */ java.util.Map<String, EnterContext> LIZLLL;
    public final /* synthetic */ Long LJ;

    public C71350RzO(ECommerceCommodityListViewModel eCommerceCommodityListViewModel, long j, List<String> list, java.util.Map<String, EnterContext> map, Long l) {
        this.LIZ = eCommerceCommodityListViewModel;
        this.LIZIZ = j;
        this.LIZJ = list;
        this.LIZLLL = map;
        this.LJ = l;
    }

    @Override // X.C10I
    public final Object then(C10K c10k) {
        boolean z;
        String str;
        boolean z2;
        String str2;
        Integer num;
        Integer num2;
        String str3;
        String str4;
        String str5;
        long j;
        GetItemProductInfoResponseData getItemProductInfoResponseData;
        Long startClickTime;
        BaseResponse.ServerTimeExtra serverTimeExtra;
        BaseResponse baseResponse = (BaseResponse) c10k.LJIIJJI();
        boolean z3 = false;
        if (baseResponse != null && baseResponse.status_code == 0) {
            z = true;
        } else {
            z = false;
        }
        Integer num3 = null;
        GetItemProductInfoResponseData getItemProductInfoResponseData2 = null;
        if (z) {
            this.LIZ.LJLJJI = false;
            BaseResponse baseResponse2 = (BaseResponse) c10k.LJIIJJI();
            if (baseResponse2 != null && (serverTimeExtra = baseResponse2.extra) != null) {
                str2 = serverTimeExtra.logid;
            } else {
                str2 = null;
            }
            Long valueOf = Long.valueOf(SystemClock.elapsedRealtime() - this.LIZIZ);
            BaseResponse baseResponse3 = (BaseResponse) c10k.LJIIJJI();
            if (baseResponse3 != null) {
                num = Integer.valueOf(baseResponse3.status_code);
            } else {
                num = null;
            }
            List<String> list = this.LIZJ;
            Iterator<Map.Entry<String, EnterContext>> it = this.LIZLLL.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    num2 = it.next().getValue().getReqType();
                    if (num2 != null) {
                        break;
                    }
                } else {
                    num2 = null;
                    break;
                }
            }
            CommonVideoAnchorModel commonVideoAnchorModel = this.LIZ.LJLILLLLZI;
            if (commonVideoAnchorModel != null) {
                str3 = commonVideoAnchorModel.getEventType();
            } else {
                str3 = null;
            }
            CommonVideoAnchorModel commonVideoAnchorModel2 = this.LIZ.LJLILLLLZI;
            if (commonVideoAnchorModel2 != null) {
                str4 = commonVideoAnchorModel2.getAuthorUid();
            } else {
                str4 = null;
            }
            CommonVideoAnchorModel commonVideoAnchorModel3 = this.LIZ.LJLILLLLZI;
            if (commonVideoAnchorModel3 != null) {
                str5 = commonVideoAnchorModel3.getGroupId();
            } else {
                str5 = null;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Long l = this.LJ;
            long j2 = 0;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            C71363Rzb.LJIJJLI(3, 3, num, num2, valueOf, Long.valueOf(elapsedRealtime - j), str2, str3, str4, str5, list);
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            CommonVideoAnchorModel commonVideoAnchorModel4 = this.LIZ.LJLILLLLZI;
            if (commonVideoAnchorModel4 != null && (startClickTime = commonVideoAnchorModel4.getStartClickTime()) != null) {
                j2 = startClickTime.longValue();
            }
            long j3 = elapsedRealtime2 - j2;
            GetItemProductInfoResponse getItemProductInfoResponse = (GetItemProductInfoResponse) c10k.LJIIJJI();
            if (getItemProductInfoResponse != null && (getItemProductInfoResponseData = getItemProductInfoResponse.data) != null) {
                z3 = o.LJ(getItemProductInfoResponseData.containMultiPanelResp, Boolean.TRUE);
            }
            C71363Rzb.LJIILL(3, j3, z3, false, "comment_anchor");
            ECommerceCommodityListViewModel eCommerceCommodityListViewModel = this.LIZ;
            GetItemProductInfoResponse getItemProductInfoResponse2 = (GetItemProductInfoResponse) c10k.LJIIJJI();
            if (getItemProductInfoResponse2 != null) {
                getItemProductInfoResponseData2 = getItemProductInfoResponse2.data;
            }
            eCommerceCommodityListViewModel.gv0(getItemProductInfoResponseData2);
        } else {
            C71359RzX c71359RzX = C71359RzX.LIZ;
            CommonVideoAnchorModel commonVideoAnchorModel5 = this.LIZ.LJLILLLLZI;
            if (commonVideoAnchorModel5 != null) {
                str = commonVideoAnchorModel5.getEventType();
            } else {
                str = null;
            }
            if (this.LIZ.LJLJI.size() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            long elapsedRealtime3 = SystemClock.elapsedRealtime() - this.LIZIZ;
            BaseResponse baseResponse4 = (BaseResponse) c10k.LJIIJJI();
            if (baseResponse4 != null) {
                num3 = Integer.valueOf(baseResponse4.status_code);
            }
            C71359RzX.LIZJ(c71359RzX, 3, str, z2, elapsedRealtime3, num3);
        }
        return C76800UCe.LIZ;
    }
}

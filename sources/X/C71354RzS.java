package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.PdpPreviewServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.model.EnterContext;
import com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoResponseData;
import com.ss.android.ugc.aweme.ecommerce.service.IPdpPreviewService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.RzS, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71354RzS<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ C71362Rza LIZ;
    public final /* synthetic */ List<String> LIZIZ;
    public final /* synthetic */ int[] LIZJ;
    public final /* synthetic */ boolean LIZLLL;
    public final /* synthetic */ long LJ;
    public final /* synthetic */ java.util.Map<String, EnterContext> LJFF;
    public final /* synthetic */ String LJI;
    public final /* synthetic */ Aweme LJII;
    public final /* synthetic */ InterfaceC44105HSr LJIIIIZZ;

    public C71354RzS(C71362Rza c71362Rza, List<String> list, int[] iArr, boolean z, long j, java.util.Map<String, EnterContext> map, String str, Aweme aweme, InterfaceC44105HSr interfaceC44105HSr) {
        this.LIZ = c71362Rza;
        this.LIZIZ = list;
        this.LIZJ = iArr;
        this.LIZLLL = z;
        this.LJ = j;
        this.LJFF = map;
        this.LJI = str;
        this.LJII = aweme;
        this.LJIIIIZZ = interfaceC44105HSr;
    }

    @Override // X.C10I
    public final Object then(C10K c10k) {
        List list;
        int i;
        String str;
        Integer num;
        Integer num2;
        GetItemProductInfoResponse getItemProductInfoResponse;
        GetItemProductInfoResponseData getItemProductInfoResponseData;
        BaseResponse.ServerTimeExtra serverTimeExtra;
        C71362Rza c71362Rza = this.LIZ;
        List<String> list2 = this.LIZIZ;
        int[] iArr = this.LIZJ;
        c71362Rza.getClass();
        IPdpPreviewService LIZJ = PdpPreviewServiceImpl.LIZJ();
        Integer num3 = null;
        if (iArr != null) {
            list = ORY.LJJZ(iArr);
        } else {
            list = null;
        }
        LIZJ.LIZ(null, null, list2, list);
        BaseResponse baseResponse = (BaseResponse) c10k.LJIIJJI();
        if (baseResponse != null && baseResponse.status_code == 0) {
            if (this.LIZLLL) {
                i = 4;
            } else {
                i = 2;
            }
            BaseResponse baseResponse2 = (BaseResponse) c10k.LJIIJJI();
            if (baseResponse2 != null && (serverTimeExtra = baseResponse2.extra) != null) {
                str = serverTimeExtra.logid;
            } else {
                str = null;
            }
            Long valueOf = Long.valueOf(SystemClock.elapsedRealtime() - this.LJ);
            BaseResponse baseResponse3 = (BaseResponse) c10k.LJIIJJI();
            if (baseResponse3 != null) {
                num = Integer.valueOf(baseResponse3.status_code);
            } else {
                num = null;
            }
            List<String> list3 = this.LIZIZ;
            Iterator<Map.Entry<String, EnterContext>> it = this.LJFF.entrySet().iterator();
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
            C71363Rzb.LJIJJLI(i, 0, num, num2, valueOf, Long.valueOf(System.currentTimeMillis() - this.LIZ.LJIIIIZZ), str, this.LJI, this.LJII.getAuthorUid(), this.LJII.getGroupId(), list3);
            if (this.LIZLLL && (getItemProductInfoResponse = (GetItemProductInfoResponse) c10k.LJIIJJI()) != null && (getItemProductInfoResponseData = getItemProductInfoResponse.data) != null && o.LJ(getItemProductInfoResponseData.containMultiPanelResp, Boolean.TRUE)) {
                C71370Rzi.LJIIJ(this.LJII.getAid(), "video_anchor", ((GetItemProductInfoResponse) c10k.LJIIJJI()).data);
            } else {
                this.LIZ.LJJIIZ(((GetItemProductInfoResponse) c10k.LJIIJJI()).data, false);
            }
        } else {
            C71359RzX c71359RzX = C71359RzX.LIZ;
            String str2 = this.LJI;
            boolean LJJLJ = this.LJIIIIZZ.LJJLJ();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJ;
            BaseResponse baseResponse4 = (BaseResponse) c10k.LJIIJJI();
            if (baseResponse4 != null) {
                num3 = Integer.valueOf(baseResponse4.status_code);
            }
            long currentTimeMillis = System.currentTimeMillis() - this.LIZ.LJIIIIZZ;
            c71359RzX.getClass();
            C71359RzX.LIZIZ(2, str2, LJJLJ, elapsedRealtime, num3, currentTimeMillis);
        }
        return C76800UCe.LIZ;
    }
}

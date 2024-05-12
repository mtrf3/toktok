package X;

import Y.ACallableS106S0100000_3;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: X.8rT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C224478rT extends C8BS<BatchDetailList> {
    public final C8RO LJLIL = new C8RO("BatchDetailModel");
    public int LJLILLLLZI;

    public C224478rT(int i) {
        this.LJLILLLLZI = i;
    }

    @Override // X.C8BS
    public final boolean checkParams(Object... objArr) {
        if (objArr != null && objArr.length >= 1) {
            return true;
        }
        return false;
    }

    @Override // X.C8BS
    public final void handleData(BatchDetailList batchDetailList) {
        LogPbBean logPbBean;
        BatchDetailList batchDetailList2 = batchDetailList;
        if (batchDetailList2 == null || batchDetailList2.items == null) {
            this.LJLIL.LIZLLL("data is null or items null!");
            return;
        }
        super.handleData(batchDetailList2);
        int size = batchDetailList2.items.size();
        String str = batchDetailList2.requestId;
        for (int i = 0; i < size; i++) {
            Aweme R1 = AwemeService.LIZ().R1((Aweme) ListProtector.get(batchDetailList2.items, i));
            if (TextUtils.isEmpty(str) && (logPbBean = batchDetailList2.logPbBean) != null) {
                str = logPbBean.getImprId();
            }
            IRequestIdService LJ = RequestIdService.LJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(R1.getAid());
            LIZ.append(this.LJLILLLLZI);
            LJ.LIZJ(i, X1D.LIZIZ(LIZ), str);
            ListProtector.set(batchDetailList2.items, i, R1);
            List<Aweme> list = batchDetailList2.items;
            if (list != null) {
                C7HV.LIZIZ.LIZJ(list, C7KB.OTHERS);
            }
        }
        C8RO c8ro = this.LJLIL;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[handleData] ");
        LIZ2.append(size);
        LIZ2.append(",");
        LIZ2.append(str);
        c8ro.LJIIIIZZ(X1D.LIZIZ(LIZ2));
    }

    @Override // X.C8BS
    public final boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        this.LJLIL.LJIIIIZZ("[sendRequest]");
        FGR.LIZIZ().LIZ(this.mHandler, new ACallableS106S0100000_3(objArr, 0), 0);
        return true;
    }
}

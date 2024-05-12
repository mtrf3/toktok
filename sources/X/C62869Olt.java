package X;

import Y.ACallableS81S0101000_10;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.donation.DonateApi;
import com.ss.android.ugc.aweme.donation.DonateResponse;
import com.ss.android.ugc.aweme.donation.DonorStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Olt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62869Olt extends AbstractC51036K1g<DonorStruct, DonateResponse> {
    public final String LJLIL;
    public final Integer LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final Long LJLJJLL;
    public final Integer LJLJL;
    public final String LJLJLJ;
    public final DonateApi LJLJLLL;
    public final DonateApi LJLL;

    @Override // X.C8BS
    public final boolean checkParams(Object... params) {
        o.LJIIIZ(params, "params");
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final List<DonorStruct> getItems() {
        List<DonorStruct> list;
        DonateResponse donateResponse = (DonateResponse) this.mData;
        if (donateResponse != null && (list = donateResponse.donorList) != null) {
            return ORZ.LLJILJILJ(list);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isHasMore() {
        DonateResponse donateResponse = (DonateResponse) this.mData;
        if (donateResponse != null) {
            return o.LJ(donateResponse.hasMore, Boolean.TRUE);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.ss.android.ugc.aweme.donation.DonateResponse, T] */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.ss.android.ugc.aweme.donation.DonateResponse, T, java.lang.Object] */
    @Override // X.C8BS
    public final void handleData(Object obj) {
        ?? r9 = (DonateResponse) obj;
        if (this.mListQueryType == 4) {
            if (r9 != 0) {
                T t = this.mData;
                if (t == 0) {
                    this.mData = r9;
                    return;
                }
                if (r9.donorList == null) {
                    return;
                }
                Collection collection = ((DonateResponse) t).donorList;
                if (collection == null) {
                    collection = new ArrayList();
                }
                List LLJILJILJ = ORZ.LLJILJILJ(collection);
                Collection collection2 = r9.donorList;
                if (collection2 == null) {
                    collection2 = C61878OQg.INSTANCE;
                }
                ((ArrayList) LLJILJILJ).addAll(collection2);
                DonateResponse mData = (DonateResponse) this.mData;
                Integer num = r9.cursor;
                Boolean bool = r9.hasMore;
                o.LJIIIIZZ(mData, "mData");
                this.mData = new DonateResponse(mData.ngo, LLJILJILJ, num, bool, mData.banner, mData.donationSummary);
                return;
            }
            return;
        }
        super.handleData(r9);
    }

    @Override // X.AbstractC51036K1g
    public final void loadMoreList(Object... params) {
        int i;
        o.LJIIIZ(params, "params");
        Integer num = getData().cursor;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        FGR.LIZIZ().LIZ(this.mHandler, new ACallableS81S0101000_10(i, this, 2), 0);
    }

    @Override // X.AbstractC51036K1g
    public final void refreshList(Object... params) {
        o.LJIIIZ(params, "params");
        FGR.LIZIZ().LIZ(this.mHandler, new ACallableS81S0101000_10(0, this, 2), 0);
    }

    public C62869Olt(String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, Long l) {
        this.LJLIL = str;
        this.LJLILLLLZI = num;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = str4;
        this.LJLJJLL = l;
        this.LJLJL = num2;
        this.LJLJLJ = str5;
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str6 = EFJ.LIZJ;
        this.LJLJLLL = (DonateApi) C770830u.LIZJ(str6, "API_URL_PREFIX_SI", LIZLLL, str6).LIZ.LIZ(DonateApi.class);
        this.LJLL = (DonateApi) C40084FoG.LIZIZ(str6).LIZ.LIZ(DonateApi.class);
    }
}

package X;

import Y.ARunnableS9S0101000_5;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.challenge.api.ChallengeApi;
import com.ss.android.ugc.aweme.challenge.model.ChallengeAwemeList;
import com.ss.android.ugc.aweme.commercialize.challenge.service.CommerceChallengeServiceImpl;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes8.dex */
public final class HDL implements Callable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ MH1 LJLJLJ;
    public final /* synthetic */ int LJLJI = 20;
    public final /* synthetic */ String LJLJL = null;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        this.LJLJLJ.LJLJJL.getClass();
        this.LJLJLJ.LJLJJLL = SystemClock.elapsedRealtime();
        String str2 = this.LJLIL;
        long j = this.LJLILLLLZI;
        int i = this.LJLJI;
        int i2 = this.LJLJJI;
        boolean z = this.LJLJJL;
        String str3 = this.LJLJLJ.LJLJI;
        String str4 = this.LJLJJLL;
        String str5 = this.LJLJL;
        boolean LJIILIIL = CommerceChallengeServiceImpl.LIZIZ().LJIILIIL(str2);
        if (i2 == 2) {
            if (LJIILIIL) {
                str = ChallengeApi.LJFF;
            } else {
                str = ChallengeApi.LIZJ;
            }
        } else if (LJIILIIL) {
            str = ChallengeApi.LJI;
        } else {
            str = ChallengeApi.LIZLLL;
        }
        HashMap hashMap = new HashMap();
        if (z) {
            C116484hg.LIZIZ(hashMap, "hashtag_name", str2, 1, "query_type");
        } else {
            C116484hg.LIZIZ(hashMap, "ch_id", str2, 0, "query_type");
        }
        if (str4 != null) {
            hashMap.put("search_id", str4);
        }
        hashMap.put("cursor", String.valueOf(j));
        hashMap.put("count", String.valueOf(i));
        hashMap.put("type", String.valueOf(5));
        hashMap.put("source", String.valueOf(str3));
        if (!TextUtils.isEmpty(str5)) {
            hashMap.put("top_item_id", str5);
        }
        ChallengeAwemeList challengeAwemeList = ChallengeApi.LJII.getChallengeAwemeList(str, hashMap).get();
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS9S0101000_5(2, challengeAwemeList, 10));
        return challengeAwemeList;
    }

    public HDL(MH1 mh1, String str, long j, int i, boolean z, String str2) {
        this.LJLJLJ = mh1;
        this.LJLIL = str;
        this.LJLILLLLZI = j;
        this.LJLJJI = i;
        this.LJLJJL = z;
        this.LJLJJLL = str2;
    }
}

package X;

import com.ss.android.ugc.aweme.challenge.api.ChallengeApi;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes8.dex */
public final class HDN implements Callable {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ int LJLJI = 20;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        long j = this.LJLIL;
        long j2 = this.LJLILLLLZI;
        int i = this.LJLJI;
        HashMap hashMap = new HashMap();
        hashMap.put("max_cursor", String.valueOf(j));
        hashMap.put("min_cursor", String.valueOf(j2));
        hashMap.put("count", String.valueOf(i));
        hashMap.put("is_hash_tag", String.valueOf(1));
        return ChallengeApi.LJII.getChallengeList(hashMap).get();
    }

    public HDN(long j, long j2) {
        this.LJLIL = j;
        this.LJLILLLLZI = j2;
    }
}

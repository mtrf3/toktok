package X;

import com.ss.android.ugc.aweme.commercialize.profile.FakeUserAwemeApi;
import com.ss.android.ugc.aweme.services.RetrofitService;
import java.util.concurrent.Callable;

/* renamed from: X.LgR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class CallableC54887LgR<V> implements Callable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;

    public CallableC54887LgR(int i, String str, long j, String str2, String str3, long j2, String str4) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = j;
        this.LJLJJI = j2;
        this.LJLJJL = i;
        this.LJLJJLL = str3;
        this.LJLJL = str4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return ((FakeUserAwemeApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(EFJ.LIZJ).create(FakeUserAwemeApi.class)).getFakeUserAwemeList(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL).execute().LIZIZ;
    }
}

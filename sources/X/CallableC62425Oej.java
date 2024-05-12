package X;

import com.ss.android.ugc.aweme.feed.api.AwemeStatsApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Callable;

/* renamed from: X.Oej, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class CallableC62425Oej<V> implements Callable {
    public final /* synthetic */ Aweme LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    public CallableC62425Oej(String str, Aweme aweme, String str2) {
        this.LJLIL = aweme;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C62683Oit c62683Oit = new C62683Oit();
        c62683Oit.LIZ = this.LJLIL.getAid();
        c62683Oit.LIZIZ = 1;
        c62683Oit.LJ = this.LJLIL.getAwemeType();
        c62683Oit.LJI = 1;
        c62683Oit.LJII = this.LJLILLLLZI;
        String str = this.LJLJI;
        if (str != null) {
            c62683Oit.LJJIIZI = str;
        }
        AwemeStatsApi.LIZ(c62683Oit.LIZ());
        return C76800UCe.LIZ;
    }
}

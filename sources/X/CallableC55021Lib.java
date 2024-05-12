package X;

import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.awemepushlib.interaction.PushService;
import java.util.concurrent.Callable;

/* renamed from: X.Lib, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class CallableC55021Lib<V> implements Callable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    public CallableC55021Lib(String str, String str2, String str3, String str4, String str5, int i) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
        this.LJLJJL = str5;
        this.LJLJJLL = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        BatchDetailList LIZIZ;
        Aweme loadPushCacheSync;
        try {
            if (((Boolean) C33710DKw.LIZIZ.getValue()).booleanValue() && C33710DKw.LIZIZ() && (loadPushCacheSync = PushService.createIPushApibyMonsterPlugin(false).loadPushCacheSync(this.LJLIL)) != null) {
                LIZIZ = new BatchDetailList();
                LIZIZ.items = C47261Igj.LJJIJ(loadPushCacheSync);
            } else {
                LIZIZ = JG5.LIZ().LIZIZ(this.LJLILLLLZI, this.LJLJI, this.LJLJJLL, this.LJLJJI, this.LJLJJL);
            }
            return new OSZ(0, LIZIZ);
        } catch (Exception e) {
            if (e instanceof C38333F2r) {
                i = ((C38306F1q) e).getErrorCode();
            } else {
                i = 3020004;
            }
            return new OSZ(Integer.valueOf(i), null);
        }
    }
}

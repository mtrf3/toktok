package X;

import com.ss.android.ugc.aweme.ttsvoice.repo.TTSVoiceApi;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.T8x, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class CallableC74167T8x<V> implements Callable {
    public final /* synthetic */ C74166T8w LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI = 20;
    public final /* synthetic */ int LJLJJI;

    public CallableC74167T8x(C74166T8w c74166T8w, String str, int i) {
        this.LJLIL = c74166T8w;
        this.LJLILLLLZI = str;
        this.LJLJJI = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        TTSVoiceApi tTSVoiceApi = (TTSVoiceApi) this.LJLIL.LJLIL.getValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[\"");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append("\"]");
        List<String> LJJIJ = C47261Igj.LJJIJ(X1D.LIZIZ(LIZ));
        Boolean bool = Boolean.FALSE;
        return tTSVoiceApi.getVoiceDetailsFuture(LJJIJ, bool, bool, Boolean.TRUE, Long.valueOf(this.LJLJI), Long.valueOf(this.LJLJJI)).get();
    }
}

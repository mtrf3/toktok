package X;

import com.ss.android.ugc.aweme.voiceconversion.repo.VoiceConversionApi;
import java.util.concurrent.Callable;

/* renamed from: X.T8z, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class CallableC74169T8z<V> implements Callable {
    public final /* synthetic */ C74165T8v LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI = 20;
    public final /* synthetic */ long LJLJJI;

    public CallableC74169T8z(C74165T8v c74165T8v, String str, long j) {
        this.LJLIL = c74165T8v;
        this.LJLILLLLZI = str;
        this.LJLJJI = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return ((VoiceConversionApi) this.LJLIL.LJLIL.getValue()).getVoiceDetailsVideoListFuture(this.LJLILLLLZI, Long.valueOf(this.LJLJI), Long.valueOf(this.LJLJJI)).get();
    }
}

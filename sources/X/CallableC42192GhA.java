package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.vesdk.VEMediaParser;
import java.util.concurrent.Callable;

/* renamed from: X.GhA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC42192GhA<V> implements Callable {
    public final /* synthetic */ VEMediaParser LJLIL;
    public final /* synthetic */ MyMediaModel LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;

    public CallableC42192GhA(VEMediaParser vEMediaParser, MyMediaModel myMediaModel, int i, int i2) {
        this.LJLIL = vEMediaParser;
        this.LJLILLLLZI = myMediaModel;
        this.LJLJI = i;
        this.LJLJJI = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.LJLIL.getVideoFrame(this.LJLILLLLZI.startTime, this.LJLJI, this.LJLJJI, true);
    }
}

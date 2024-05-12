package X;

import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.concurrent.Callable;

/* renamed from: X.GaH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC41765GaH<V> implements Callable {
    public final /* synthetic */ PublishModel LJLIL;
    public final /* synthetic */ C41759GaB LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    public CallableC41765GaH(PublishModel publishModel, C41759GaB c41759GaB, boolean z) {
        this.LJLIL = publishModel;
        this.LJLILLLLZI = c41759GaB;
        this.LJLJI = z;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C78934UyQ.LJLIL.LJFF().getPublishXService().reportPublishFailure(this.LJLIL, this.LJLILLLLZI, this.LJLJI);
        return C76800UCe.LIZ;
    }
}

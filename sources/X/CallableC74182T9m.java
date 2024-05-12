package X;

import com.ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.T9m, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class CallableC74182T9m<V> implements Callable {
    public final /* synthetic */ String LJLIL;

    public CallableC74182T9m(String str) {
        this.LJLIL = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        HF6 iStickerPropService = C60903NvH.LJIIJJI().getIStickerPropService();
        String stickerIds = this.LJLIL;
        iStickerPropService.getClass();
        o.LJIIIZ(stickerIds, "stickerIds");
        return PropReuseServiceImpl.LJIIJ().LIZJ(stickerIds);
    }
}

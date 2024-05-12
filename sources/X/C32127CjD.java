package X;

import com.bytedance.android.livesdk.gift.model.GiftPage;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CjD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32127CjD extends AbstractC32126CjC {
    public final Runnable LIZ;
    public final List<GiftPage> LIZIZ;
    public final String LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C32127CjD(Runnable runnable, List<? extends GiftPage> currentGiftPages, String requestHash) {
        o.LJIIIZ(currentGiftPages, "currentGiftPages");
        o.LJIIIZ(requestHash, "requestHash");
        this.LIZ = runnable;
        this.LIZIZ = currentGiftPages;
        this.LIZJ = requestHash;
    }
}

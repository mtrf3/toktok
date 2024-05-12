package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.NKs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59186NKs extends AbstractC59184NKq {
    @Override // X.AbstractC59184NKq
    public final String LIZIZ() {
        return "feed_lynx_mask_preload_status";
    }

    @Override // X.AbstractC59184NKq
    public final String LIZJ() {
        return "feed_lynx_mask_preload_usage";
    }

    @Override // X.AbstractC59184NKq
    public final boolean LIZ() {
        return C59207NLn.LIZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59186NKs(Aweme aweme) {
        super(aweme);
        o.LJIIIZ(aweme, "aweme");
    }
}

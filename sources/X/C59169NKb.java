package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.NKb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59169NKb extends AbstractC59184NKq {
    @Override // X.AbstractC59184NKq
    public final boolean LIZ() {
        return true;
    }

    @Override // X.AbstractC59184NKq
    public final String LIZIZ() {
        return "feed_lynx_superlike_preload_status";
    }

    @Override // X.AbstractC59184NKq
    public final String LIZJ() {
        return "feed_lynx_superlike_preload_usage";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59169NKb(Aweme aweme) {
        super(aweme);
        o.LJIIIZ(aweme, "aweme");
    }
}

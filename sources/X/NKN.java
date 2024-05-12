package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NKN extends AbstractC59184NKq {
    public NKR LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final boolean LJIILIIL;

    @Override // X.AbstractC59184NKq
    public final boolean LIZ() {
        return this.LJIILIIL;
    }

    @Override // X.AbstractC59184NKq
    public final String LIZIZ() {
        return this.LJIIJJI;
    }

    @Override // X.AbstractC59184NKq
    public final String LIZJ() {
        return this.LJIIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NKN(Aweme aweme) {
        super(aweme);
        o.LJIIIZ(aweme, "aweme");
        this.LJIIJJI = "feed_lynx_product_banner_preload_status";
        this.LJIIL = "feed_lynx_product_banner_preload_usage";
        this.LJIILIIL = true;
    }
}

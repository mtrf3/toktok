package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.NKl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59179NKl extends AbstractC59184NKq {
    public final String LJIIJ;
    public final String LJIIJJI;
    public final boolean LJIIL;

    @Override // X.AbstractC59184NKq
    public final boolean LIZ() {
        return this.LJIIL;
    }

    @Override // X.AbstractC59184NKq
    public final String LIZIZ() {
        return this.LJIIJ;
    }

    @Override // X.AbstractC59184NKq
    public final String LIZJ() {
        return this.LJIIJJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59179NKl(Aweme aweme) {
        super(aweme);
        o.LJIIIZ(aweme, "aweme");
        this.LJIIJ = "feed_lynx_product_tile_preload_status";
        this.LJIIJJI = "feed_lynx_product_tile_preload_usage";
        this.LJIIL = true;
    }
}

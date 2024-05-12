package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JWo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49302JWo extends AbstractC49300JWm<SearchMixFeed> {
    @Override // X.AbstractC49300JWm
    public final EnumC49272JVk LIZIZ() {
        return EnumC49272JVk.ALL_COLUMNS;
    }

    @Override // X.AbstractC49300JWm
    public final List LIZ(SearchMixFeed item, C49847JhL streamRoot) {
        o.LJIIIZ(item, "item");
        o.LJIIIZ(streamRoot, "streamRoot");
        return C61878OQg.INSTANCE;
    }
}

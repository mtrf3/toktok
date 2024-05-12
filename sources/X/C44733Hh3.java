package X;

import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardContainerSharedVM;
import java.io.Closeable;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Hh3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44733Hh3 implements Closeable {
    public final /* synthetic */ String LJLIL;

    public C44733Hh3(String str) {
        this.LJLIL = str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((ConcurrentHashMap) SearchCardContainerSharedVM.LJLJJI.getValue()).remove(this.LJLIL);
    }
}

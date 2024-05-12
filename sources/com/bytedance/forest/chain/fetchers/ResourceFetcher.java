package com.bytedance.forest.chain.fetchers;

import X.C61295O3v;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.Request;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public abstract class ResourceFetcher {
    public final Forest forest;

    public abstract void cancel();

    public abstract void fetchAsync(Request request, C61295O3v c61295O3v, InterfaceC88472Yns<? super C61295O3v, C76800UCe> interfaceC88472Yns);

    public abstract void fetchSync(Request request, C61295O3v c61295O3v);

    public final Forest getForest() {
        return this.forest;
    }

    public ResourceFetcher(Forest forest) {
        o.LJIIJ(forest, "forest");
        this.forest = forest;
    }
}

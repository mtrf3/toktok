package X;

import com.bytedance.forest.Forest;
import com.bytedance.forest.chain.fetchers.BuiltinFetcher;
import com.bytedance.forest.chain.fetchers.CDNFetcher;
import com.bytedance.forest.chain.fetchers.GeckoFetcher;
import com.bytedance.forest.chain.fetchers.MemoryFetcher;
import com.bytedance.forest.chain.fetchers.ResourceFetcher;
import com.bytedance.forest.model.Request;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.O3i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61282O3i {
    public static C61284O3k LIZ(Forest forest, Request request) {
        Object obj;
        Object obj2;
        o.LJIIJ(forest, "forest");
        LinkedList linkedList = new LinkedList();
        if (request.getOnlyOnline()) {
            request.setFetcherSequence(C47261Igj.LJJIJIL("cdn"));
        } else if (request.getEnableMemoryCache() && !request.getFetcherSequence().contains("memory")) {
            ListProtector.add(request.getFetcherSequence(), 0, "memory");
        }
        if (request.getFetcherSequence().isEmpty()) {
            C39930Flm.LIZIZ("FetcherChain", "Fetcher sequence is empty", null);
        }
        if (request.getDisableBuiltin()) {
            request.getFetcherSequence().remove("builtin");
        }
        if (request.getDisableCdn()) {
            request.getFetcherSequence().remove("cdn");
        }
        if (request.getDisableOffline()) {
            request.getFetcherSequence().remove("gecko");
        }
        for (String str : request.getFetcherSequence()) {
            switch (str.hashCode()) {
                case -1077756671:
                    if (str.equals("memory")) {
                        linkedList.add(new MemoryFetcher(forest));
                        break;
                    }
                    break;
                case 98349:
                    if (str.equals("cdn")) {
                        linkedList.add(new CDNFetcher(forest));
                        break;
                    }
                    break;
                case 98230121:
                    if (str.equals("gecko")) {
                        linkedList.add(new GeckoFetcher(forest));
                        break;
                    }
                    break;
                case 230960163:
                    if (str.equals("builtin")) {
                        linkedList.add(new BuiltinFetcher(forest));
                        break;
                    }
                    break;
            }
            try {
                Class<? extends ResourceFetcher> cls = forest.getFetcherMap$forest_release().get(str);
                if (cls != null) {
                    linkedList.add(cls.getConstructor(Forest.class).newInstance(forest));
                    obj2 = cls;
                } else {
                    obj2 = null;
                }
                C3C5.m7constructorimpl(obj2);
                obj = obj2;
            } catch (Throwable th) {
                Object LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
                obj = LIZ;
            }
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(obj);
            if (m10exceptionOrNullimpl != null) {
                C39930Flm.LIZIZ("ResourceFetchScheduler", "add custom fetcher failed", m10exceptionOrNullimpl);
            }
        }
        return new C61284O3k(linkedList);
    }
}

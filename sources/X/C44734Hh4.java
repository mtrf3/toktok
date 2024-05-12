package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SharedViewModelProvider;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardContainerSharedVM;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.Hh4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44734Hh4 {
    public static SearchCardContainerSharedVM LIZ(Lifecycle lifecycle, EnumC46469ILp searchCardContainerType) {
        o.LJIIIZ(lifecycle, "lifecycle");
        o.LJIIIZ(searchCardContainerType, "searchCardContainerType");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(lifecycle.hashCode());
        LIZ.append('-');
        LIZ.append(searchCardContainerType.name());
        String LIZIZ = X1D.LIZIZ(LIZ);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) SearchCardContainerSharedVM.LJLJJI.getValue();
        Object obj = concurrentHashMap.get(LIZIZ);
        Object obj2 = obj;
        if (obj == null) {
            SearchCardContainerSharedVM searchCardContainerSharedVM = (SearchCardContainerSharedVM) new SharedViewModelProvider((ViewModelProvider.Factory) null, 1, (DefaultConstructorMarker) null).get(lifecycle, searchCardContainerType.name(), SearchCardContainerSharedVM.class);
            searchCardContainerSharedVM.addCloseable(new C44733Hh3(LIZIZ));
            Object putIfAbsent = concurrentHashMap.putIfAbsent(LIZIZ, searchCardContainerSharedVM);
            obj2 = searchCardContainerSharedVM;
            if (putIfAbsent != null) {
                obj2 = putIfAbsent;
            }
        }
        return (SearchCardContainerSharedVM) obj2;
    }
}

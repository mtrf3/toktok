package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.F5c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38396F5c<ResultT> implements InterfaceC40563Fvz {
    public final /* synthetic */ String LJLIL;

    public C38396F5c(String str) {
        this.LJLIL = str;
    }

    @Override // X.InterfaceC40563Fvz
    public final void onSuccess(Object obj) {
        int intValue = ((Number) obj).intValue();
        String packageName = this.LJLIL;
        o.LJIIIZ(packageName, "packageName");
        ConcurrentHashMap<String, Integer> concurrentHashMap = C37101EhF.LIZ;
        synchronized (concurrentHashMap) {
            concurrentHashMap.put(packageName, Integer.valueOf(intValue));
        }
    }
}

package X;

import android.os.SystemClock;
import android.util.LruCache;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OIw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC61686OIw extends PQ5 {
    public final LruCache<C43069GvJ, Boolean> LIZIZ;

    public abstract boolean LIZIZ(String str, String str2, boolean z);

    public AbstractC61686OIw(String str) {
        super(str);
        this.LIZIZ = new LruCache<>(100);
    }

    @Override // X.PQ5
    public final Object LIZ(List<? extends Object> list) {
        SystemClock.elapsedRealtimeNanos();
        if (list != null && list.size() == 3 && (ListProtector.get(list, 0) instanceof Collection) && (ListProtector.get(list, 1) instanceof Collection) && (ListProtector.get(list, 2) instanceof Boolean)) {
            Object obj = ListProtector.get(list, 0);
            if (obj != null) {
                Collection<String> collection = (Collection) obj;
                Object obj2 = ListProtector.get(list, 1);
                if (obj2 != null) {
                    Collection collection2 = (Collection) obj2;
                    if (collection.isEmpty() || collection2.isEmpty()) {
                        return Boolean.FALSE;
                    }
                    Object obj3 = ListProtector.get(list, 2);
                    if (obj3 != null) {
                        boolean booleanValue = ((Boolean) obj3).booleanValue();
                        C43069GvJ c43069GvJ = new C43069GvJ(collection, collection2, booleanValue);
                        Boolean bool = this.LIZIZ.get(c43069GvJ);
                        if (bool != null) {
                            boolean booleanValue2 = bool.booleanValue();
                            SystemClock.elapsedRealtimeNanos();
                            return Boolean.valueOf(booleanValue2);
                        }
                        for (String str : collection) {
                            Iterator it = collection2.iterator();
                            while (it.hasNext()) {
                                if (LIZIZ(str, (String) it.next(), booleanValue)) {
                                    LruCache<C43069GvJ, Boolean> lruCache = this.LIZIZ;
                                    Boolean bool2 = Boolean.TRUE;
                                    lruCache.put(c43069GvJ, bool2);
                                    SystemClock.elapsedRealtimeNanos();
                                    return bool2;
                                }
                            }
                        }
                        LruCache<C43069GvJ, Boolean> lruCache2 = this.LIZIZ;
                        Boolean bool3 = Boolean.FALSE;
                        lruCache2.put(c43069GvJ, bool3);
                        SystemClock.elapsedRealtimeNanos();
                        return bool3;
                    }
                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.Boolean");
                }
                throw new C37692Eqm("null cannot be cast to non-null type kotlin.collections.Collection<kotlin.String>");
            }
            throw new C37692Eqm("null cannot be cast to non-null type kotlin.collections.Collection<kotlin.String>");
        }
        throw new C61596OFk(105, "params error");
    }
}

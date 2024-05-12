package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;

/* renamed from: X.U7n, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76679U7n {
    public final U7T LIZ;
    public final C73318Sq2 LIZIZ;
    public final long LIZJ;
    public final java.util.Set<Long> LIZLLL;

    public final java.util.Set<Long> LIZ() {
        long j;
        java.util.Set<Long> set = this.LIZLLL;
        List<LinkUser> list = this.LIZ.LJIIJJI.LJII;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<LinkUser> it = list.iterator();
        while (it.hasNext()) {
            Long userId = it.next().getUserId();
            if (userId != null) {
                j = userId.longValue();
            } else {
                j = 0;
            }
            arrayList.add(Long.valueOf(j));
        }
        return F5P.LJIIJJI(set, arrayList);
    }

    public C76679U7n(U7T mLinker) {
        o.LJIIIZ(mLinker, "mLinker");
        this.LIZ = mLinker;
        this.LIZIZ = new C73318Sq2();
        this.LIZJ = C025908h.LIZ();
        this.LIZLLL = new CopyOnWriteArraySet();
    }
}

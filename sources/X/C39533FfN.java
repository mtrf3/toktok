package X;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.FfN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39533FfN extends QXX {
    public final C39532FfM LJLIL;

    public C39533FfN() {
        super((Object) null);
        this.LJLIL = new C39532FfM(2);
    }

    @Override // X.QXX
    public final void LJJZZIII(Throwable th, Throwable th2) {
        if (th2 != th) {
            if (th2 != null) {
                C39532FfM c39532FfM = this.LJLIL;
                while (true) {
                    Reference poll = ((ReferenceQueue) c39532FfM.LIZIZ).poll();
                    if (poll == null) {
                        break;
                    } else {
                        ((ConcurrentHashMap) c39532FfM.LIZ).remove(poll);
                    }
                }
                List list = (List) ((ConcurrentHashMap) c39532FfM.LIZ).get(new C39535FfP(th, null));
                if (list == null) {
                    list = new Vector(2);
                    List list2 = (List) ((ConcurrentHashMap) c39532FfM.LIZ).putIfAbsent(new C39535FfP(th, (ReferenceQueue) c39532FfM.LIZIZ), list);
                    if (list2 != null) {
                        list = list2;
                    }
                }
                list.add(th2);
                return;
            }
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", th2);
    }
}

package X;

import com.bytedance.im.core.proto.MessageBody;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.OsK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63268OsK implements InterfaceC86963bA<C63120Opw> {
    public final /* synthetic */ AtomicInteger LIZ;
    public final /* synthetic */ AtomicInteger LIZIZ;
    public final /* synthetic */ List LIZJ;
    public final /* synthetic */ java.util.Map LIZLLL;
    public final /* synthetic */ ConcurrentHashMap LJ;
    public final /* synthetic */ int LJFF;
    public final /* synthetic */ C63622Oy2 LJI;
    public final /* synthetic */ C63267OsJ LJII;

    @Override // X.InterfaceC86963bA
    public final void LIZIZ(C63623Oy3 c63623Oy3) {
        if (this.LIZIZ.addAndGet(1) + this.LIZ.get() == this.LIZJ.size()) {
            this.LJII.LJIILL(this.LJI, this.LJFF, this.LIZLLL);
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [X.OxL] */
    @Override // X.InterfaceC86963bA
    public final void onSuccess(C63120Opw c63120Opw) {
        C63120Opw c63120Opw2 = c63120Opw;
        if (this.LIZIZ.get() + this.LIZ.addAndGet(1) == this.LIZJ.size()) {
            MessageBody messageBody = (MessageBody) this.LIZLLL.get(c63120Opw2.getConversationId());
            if (messageBody != null) {
                ?? newBuilder2 = messageBody.newBuilder2();
                newBuilder2.LJII = Long.valueOf(c63120Opw2.getConversationShortId());
                this.LJ.put(c63120Opw2.getConversationId(), newBuilder2.build());
            }
            if (this.LIZIZ.get() == 0) {
                C63267OsJ.LJIILIIL(this.LJ, this.LJFF, false);
            } else {
                this.LJII.LJIILL(this.LJI, this.LJFF, this.LIZLLL);
            }
        }
    }

    public C63268OsK(C63267OsJ c63267OsJ, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, List list, java.util.Map map, ConcurrentHashMap concurrentHashMap, int i, C63622Oy2 c63622Oy2) {
        this.LJII = c63267OsJ;
        this.LIZ = atomicInteger;
        this.LIZIZ = atomicInteger2;
        this.LIZJ = list;
        this.LIZLLL = map;
        this.LJ = concurrentHashMap;
        this.LJFF = i;
        this.LJI = c63622Oy2;
    }
}

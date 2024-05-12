package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.Ydv, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87855Ydv implements InterfaceC31342CRu {
    public Boolean LIZ;
    public final Queue<Runnable> LIZIZ;
    public final C09800a0 LIZJ;

    @Override // X.InterfaceC31342CRu
    public final boolean LIZ() {
        return this.LIZJ.LIZIZ();
    }

    public final void LIZIZ() {
        this.LIZJ.LIZLLL();
    }

    @Override // X.InterfaceC31342CRu
    public final void stop() {
        ((LinkedList) this.LIZIZ).clear();
        this.LIZJ.LJ();
    }

    public C87855Ydv(DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LIZIZ = new LinkedList();
        C09800a0 c09800a0 = new C09800a0(dataChannel, new AqS171S0100000_5(this, 662));
        c09800a0.LIZ(new C87859Ydz());
        c09800a0.LIZ(new C87852Yds());
        c09800a0.LIZ(new C87853Ydt());
        c09800a0.LIZ(new C87851Ydr());
        c09800a0.LIZ(new C87860Ye0());
        c09800a0.LIZ(new C87850Ydq());
        c09800a0.LIZ(new C87849Ydp());
        c09800a0.LIZ(new C87842Ydi());
        this.LIZJ = c09800a0;
    }

    @Override // X.InterfaceC31342CRu
    public final void LIZJ(Runnable runnable) {
        if (LIZ()) {
            runnable.run();
        } else {
            ((LinkedList) this.LIZIZ).offer(runnable);
        }
    }
}

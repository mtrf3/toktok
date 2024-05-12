package X;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.3vJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99453vJ implements InterfaceC99713vj {
    public final InterfaceC99713vj LIZIZ;
    public boolean LIZJ;
    public final C62822Ol8 LIZLLL;
    public long LJ;
    public long LJFF;
    public String LJI;

    @Override // X.InterfaceC99713vj
    public final void LIZIZ(int i) {
        this.LIZIZ.LIZIZ(i);
    }

    @Override // X.InterfaceC99713vj
    public final void LIZJ(C109544Rq msg, boolean z, C102033zT c102033zT) {
        o.LJIIIZ(msg, "msg");
        this.LIZIZ.LIZJ(msg, z, c102033zT);
    }

    @Override // X.InterfaceC99713vj
    public final void LJFF() {
        this.LIZIZ.LJFF();
    }

    @Override // X.InterfaceC99713vj
    public final void LJI(InterfaceC99673vf observer) {
        o.LJIIIZ(observer, "observer");
        this.LIZIZ.LJI(observer);
    }

    @Override // X.InterfaceC99713vj
    public final int LJII() {
        return this.LIZIZ.LJII();
    }

    @Override // X.InterfaceC99713vj
    public final String getConversationId() {
        return this.LIZIZ.getConversationId();
    }

    @Override // X.InterfaceC99713vj
    public final void refresh() {
        this.LIZIZ.refresh();
    }

    @Override // X.InterfaceC99713vj
    public final void resume() {
        this.LIZIZ.resume();
    }

    @Override // X.InterfaceC99713vj
    public final void stop() {
        this.LIZIZ.stop();
    }

    @Override // X.InterfaceC99713vj
    public final void LIZLLL() {
        this.LIZIZ.LIZLLL();
        CopyOnWriteArrayList<C99453vJ> copyOnWriteArrayList = C98693u5.LJFF;
        if (copyOnWriteArrayList.contains(this)) {
            copyOnWriteArrayList.remove(this);
        }
    }

    @Override // X.InterfaceC99713vj
    public final List<C109544Rq> LJ() {
        List LJ;
        long j;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.LIZJ) {
            LJ = this.LIZIZ.LJ();
            C109544Rq c109544Rq = (C109544Rq) ORZ.LJLLLLLL(0, LJ);
            if (c109544Rq != null) {
                j = c109544Rq.getCreatedAt();
            } else {
                j = 0;
            }
            if (j <= this.LJ || c109544Rq == null || c109544Rq.isSelf()) {
                C109544Rq c109544Rq2 = (C109544Rq) this.LIZLLL.getValue();
                c109544Rq2.setUuid("typing-message");
                c109544Rq2.setConversationId(this.LJI);
                c109544Rq2.setSender(this.LJFF);
                c109544Rq2.setCreatedAt(this.LJ);
                List LJJIJIL = C47261Igj.LJJIJIL(c109544Rq2);
                LJJIJIL.addAll(LJ);
                LJ = LJJIJIL;
            }
        } else {
            LJ = this.LIZIZ.LJ();
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getMessageList cost: ");
        LIZ.append(elapsedRealtime2 - elapsedRealtime);
        C34B.LIZIZ("TypingStatusMessageModel", X1D.LIZIZ(LIZ));
        return LJ;
    }

    public C99453vJ(InterfaceC99713vj major) {
        o.LJIIIZ(major, "major");
        this.LIZIZ = major;
        this.LIZLLL = C221108m2.LIZIZ(C99473vL.LJLIL);
        this.LJI = "";
    }

    @Override // X.InterfaceC99713vj
    public final void LIZ(InterfaceC99673vf interfaceC99673vf) {
        this.LIZIZ.LIZ(interfaceC99673vf);
        C98693u5.LJFF.add(this);
        if (this.LIZJ) {
            if (C98693u5.LIZJ.get(getConversationId()) == null) {
                this.LIZJ = false;
                this.LJ = 0L;
                this.LJFF = 0L;
                C98693u5.LIZIZ(getConversationId(), false);
                return;
            }
            return;
        }
        C98843uK c98843uK = C98693u5.LIZJ.get(getConversationId());
        if (c98843uK == null) {
            return;
        }
        String conversationId = c98843uK.LIZ;
        long j = c98843uK.LIZIZ;
        long j2 = c98843uK.LIZJ;
        o.LJIIIZ(conversationId, "conversationId");
        this.LIZJ = true;
        this.LJ = j;
        this.LJFF = j2;
        this.LJI = conversationId;
        Message obtain = Message.obtain();
        obtain.what = c98843uK.LIZ.hashCode();
        obtain.obj = c98843uK;
        ((Handler) C98693u5.LIZ.getValue()).sendMessageDelayed(obtain, ((Number) C98693u5.LIZIZ.getValue()).longValue());
    }
}

package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessage;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.api.TakoSug;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3vz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99873vz implements InterfaceC99713vj {
    public final InterfaceC99713vj LIZIZ;
    public final C62822Ol8 LIZJ;
    public final C62822Ol8 LIZLLL;
    public final C62822Ol8 LJ;
    public boolean LJFF;
    public long LJI;
    public boolean LJII;
    public List<TakoSug> LJIIIIZZ;

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
        C96963rI.LJI().LIZ = null;
    }

    @Override // X.InterfaceC99713vj
    public final List<C109544Rq> LJ() {
        long j;
        if (this.LJII) {
            List<C109544Rq> LLJILJILJ = ORZ.LLJILJILJ(this.LIZIZ.LJ());
            ListProtector.add(LLJILJILJ, 0, LJIIJ());
            return LLJILJILJ;
        }
        if (this.LJFF) {
            List<C109544Rq> LJ = this.LIZIZ.LJ();
            C109544Rq c109544Rq = (C109544Rq) ORZ.LJLLLLLL(0, LJ);
            if (c109544Rq != null) {
                j = c109544Rq.getCreatedAt();
            } else {
                j = 0;
            }
            if (j > this.LJI && c109544Rq != null && !c109544Rq.isSelf()) {
                return LJ;
            }
            C109544Rq c109544Rq2 = (C109544Rq) this.LIZLLL.getValue();
            c109544Rq2.setCreatedAt(this.LJI);
            List<C109544Rq> LJJIJIL = C47261Igj.LJJIJIL(c109544Rq2);
            LJJIJIL.addAll(LJ);
            return LJJIJIL;
        }
        return this.LIZIZ.LJ();
    }

    public final C109544Rq LJIIJ() {
        return (C109544Rq) this.LJ.getValue();
    }

    public final boolean LJIIIIZZ() {
        if (C44H.LIZ() || C93793mB.LJIIIZ((C109544Rq) ORZ.LJLLLLLL(0, this.LIZIZ.LJ()))) {
            return false;
        }
        return true;
    }

    public C99873vz(InterfaceC99713vj major) {
        o.LJIIIZ(major, "major");
        this.LIZIZ = major;
        this.LIZJ = C221108m2.LIZIZ(C99863vy.LJLIL);
        this.LIZLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 1065));
        this.LJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 1064));
        this.LJIIIIZZ = C61878OQg.INSTANCE;
    }

    @Override // X.InterfaceC99713vj
    public final void LIZ(InterfaceC99673vf interfaceC99673vf) {
        this.LIZIZ.LIZ(interfaceC99673vf);
        C97043rQ LJI = C96963rI.LJI();
        LJI.getClass();
        LJI.LIZ = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00eb, code lost:
    
        if (r6.intValue() != r5) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C109544Rq> LJIIJJI(java.util.List<com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.api.TakoCard> r12) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C99873vz.LJIIJJI(java.util.List):java.util.List");
    }

    public static C109544Rq LJIIIZ(int i, Long l) {
        long j;
        Long LJJIZ;
        C109544Rq build = new FakeMessage.Builder().build();
        C96963rI.LJII().getClass();
        String LIZIZ = C97353rv.LIZIZ();
        long j2 = 0;
        if (LIZIZ != null && (LJJIZ = C38350F3i.LJJIZ(LIZIZ)) != null) {
            j = LJJIZ.longValue();
        } else {
            j = 0;
        }
        build.setSender(j);
        C96963rI.LJII().getClass();
        build.setConversationId(C97353rv.LIZLLL());
        build.setMsgType(i);
        if (l != null) {
            j2 = l.longValue();
        }
        build.setOrderIndex(j2);
        return build;
    }
}

package X;

import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HZ7 implements InterfaceC81640W2i {
    public final C40871j1 LIZ = new C40871j1(EnumC45994I3i.NORMAL);

    @Override // X.InterfaceC81640W2i
    public final C40871j1 LIZIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC81640W2i
    public final void LIZ(EnumC45994I3i state) {
        o.LJIIIZ(state, "state");
        C40871j1 c40871j1 = this.LIZ;
        o.LJII(c40871j1, "null cannot be cast to non-null type com.bytedance.als.MutableLiveState<com.ss.android.ugc.aweme.nows.combination.RecordMode>");
        c40871j1.LJI(state);
    }
}

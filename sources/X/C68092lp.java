package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.2lp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68092lp extends F9E implements IEvent {
    public final int LJLIL;
    public final boolean LJLILLLLZI;
    public final long LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Boolean.valueOf(this.LJLILLLLZI), Long.valueOf(this.LJLJI)};
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C2U8.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C2U8.LIZIZ(this);
        return this;
    }

    public /* synthetic */ C68092lp(int i, boolean z) {
        this(i, 0L, z);
    }

    public C68092lp(int i, long j, boolean z) {
        this.LJLIL = i;
        this.LJLILLLLZI = z;
        this.LJLJI = j;
    }
}

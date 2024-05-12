package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.JmA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50146JmA extends F9E implements IEvent {
    public final long LJLIL;
    public final long LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final long LJLJJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.LJLIL), Long.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI), Long.valueOf(this.LJLJJL)};
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

    public C50146JmA(long j, long j2, int i, long j3, int i2) {
        this.LJLIL = j;
        this.LJLILLLLZI = j2;
        this.LJLJI = i;
        this.LJLJJI = i2;
        this.LJLJJL = j3;
    }
}

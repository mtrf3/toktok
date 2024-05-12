package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.2IP, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2IP extends F9E implements IEvent {
    public final boolean LJLIL;
    public final boolean LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), Boolean.valueOf(this.LJLILLLLZI)};
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

    public C2IP(boolean z, boolean z2) {
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
    }
}

package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.2ah, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61192ah extends F9E implements IEvent {
    public final boolean LJLIL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL)};
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

    public C61192ah(boolean z) {
        this.LJLIL = z;
    }
}

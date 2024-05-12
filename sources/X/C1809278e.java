package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.78e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1809278e extends F9E implements IEvent {
    public final int LJLIL;
    public final boolean LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Boolean.valueOf(this.LJLILLLLZI)};
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

    public C1809278e(int i, boolean z) {
        this.LJLIL = i;
        this.LJLILLLLZI = z;
    }
}

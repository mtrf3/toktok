package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.Fuj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40485Fuj implements IEvent {
    public final int LJLIL;
    public final int LJLILLLLZI;

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

    public C40485Fuj(int i, int i2) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }
}

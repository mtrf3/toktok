package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.3Mt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82793Mt implements IEvent {
    public final int LJLIL;

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

    public C82793Mt(int i) {
        this.LJLIL = i;
    }
}
package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.7zL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203877zL implements IEvent {
    public final String LJLIL;
    public final boolean LJLILLLLZI;

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

    public C203877zL(String str, boolean z) {
        this.LJLIL = str;
        this.LJLILLLLZI = z;
    }
}

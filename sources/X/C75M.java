package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.75M, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C75M implements IEvent {
    public final String LJLIL;
    public final String LJLILLLLZI;

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

    public C75M(String str, String str2) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
    }
}
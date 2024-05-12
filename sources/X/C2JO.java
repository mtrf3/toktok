package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.2JO, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2JO implements IEvent {
    public final String LJLIL;
    public final Object LJLILLLLZI;

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

    public C2JO(String str, Object obj) {
        this.LJLIL = str;
        this.LJLILLLLZI = obj;
    }
}

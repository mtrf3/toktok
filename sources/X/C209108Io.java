package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.8Io, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C209108Io implements IEvent {
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

    public C209108Io(String str, String str2) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
    }
}

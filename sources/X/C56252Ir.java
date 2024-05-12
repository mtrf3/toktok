package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.2Ir, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56252Ir implements IEvent {
    public final String LJLIL;
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

    public C56252Ir(String str, int i) {
        this.LJLIL = str;
        this.LJLILLLLZI = i;
    }
}

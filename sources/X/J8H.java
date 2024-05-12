package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* loaded from: classes9.dex */
public final class J8H implements IEvent {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final boolean LJLJI;

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

    public J8H(String str, String str2, boolean z) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = z;
    }
}

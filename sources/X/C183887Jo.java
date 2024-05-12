package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.7Jo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183887Jo implements IEvent {
    public final String LJLIL;
    public final boolean LJLILLLLZI;
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

    public C183887Jo(String str) {
        this.LJLILLLLZI = true;
        this.LJLIL = str;
        this.LJLJI = true;
    }

    public C183887Jo(boolean z, String str) {
        this.LJLILLLLZI = z;
        this.LJLIL = str;
    }
}

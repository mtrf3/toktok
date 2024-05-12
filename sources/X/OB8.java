package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* loaded from: classes11.dex */
public final class OB8 implements IEvent {
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

    public OB8(String str, boolean z) {
        this.LJLIL = str;
        this.LJLILLLLZI = z;
    }
}

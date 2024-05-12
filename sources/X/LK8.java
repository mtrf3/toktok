package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LK8 implements IEvent {
    public final int LJLIL;
    public final OSZ<Boolean, Boolean> LJLILLLLZI;

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

    public LK8(int i, OSZ<Boolean, Boolean> consentPair) {
        o.LJIIIZ(consentPair, "consentPair");
        this.LJLIL = i;
        this.LJLILLLLZI = consentPair;
    }
}

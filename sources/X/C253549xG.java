package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.9xG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C253549xG extends F9E implements IEvent {
    public final String LJLIL;
    public final String LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

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

    public C253549xG(String str, String optionId) {
        o.LJIIIZ(optionId, "optionId");
        this.LJLIL = str;
        this.LJLILLLLZI = optionId;
    }
}

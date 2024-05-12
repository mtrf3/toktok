package X;

import com.ss.android.ugc.aweme.common.AnchorTransData;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.7TR, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7TR implements IEvent {
    public final AnchorTransData LJLIL;

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

    public C7TR(AnchorTransData anchorTransData) {
        this.LJLIL = anchorTransData;
    }
}

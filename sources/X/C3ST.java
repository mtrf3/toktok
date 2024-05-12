package X;

import android.content.Intent;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.3ST, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3ST implements IEvent {
    public final Intent LJLIL;

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

    public C3ST(Intent intent) {
        this.LJLIL = intent;
    }
}

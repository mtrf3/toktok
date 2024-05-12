package X;

import android.os.Bundle;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.Ft2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40380Ft2 implements IEvent {
    public final Bundle LJLIL;

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

    public C40380Ft2(Bundle bundle) {
        this.LJLIL = bundle;
    }
}

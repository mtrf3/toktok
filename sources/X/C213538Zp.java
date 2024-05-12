package X;

import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.8Zp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C213538Zp extends F9E implements IEvent {
    public final Challenge LJLIL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
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

    public C213538Zp(Challenge challenge) {
        this.LJLIL = challenge;
    }
}

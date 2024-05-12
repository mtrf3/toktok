package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.Fsh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40359Fsh implements IEvent {
    public final int LJLIL;
    public final Aweme LJLILLLLZI;

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

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("state:");
        LIZ.append(this.LJLIL);
        LIZ.append("  materialId:");
        LIZ.append((String) null);
        LIZ.append(" videoPath:");
        LIZ.append((String) null);
        return X1D.LIZIZ(LIZ);
    }

    public C40359Fsh(Aweme aweme, int i) {
        this.LJLIL = i;
        this.LJLILLLLZI = aweme;
    }
}

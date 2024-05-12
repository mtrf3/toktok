package X;

import com.ss.android.ugc.aweme.feed.model.AwemeStatisticsBackup;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.2TC, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2TC implements IEvent {
    public final java.util.Map<String, AwemeStatisticsBackup> LJLIL;
    public final int LJLILLLLZI;

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

    public C2TC(java.util.Map<String, AwemeStatisticsBackup> map, int i) {
        this.LJLIL = map;
        this.LJLILLLLZI = i;
    }
}

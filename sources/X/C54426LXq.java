package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.LXq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54426LXq implements IEvent {
    public final String LJLIL;

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

    public C54426LXq(String uid) {
        o.LJIIIZ(uid, "uid");
        this.LJLIL = uid;
    }
}

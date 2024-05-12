package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.6sL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174056sL implements IEvent {
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

    public C174056sL(String awemeId) {
        o.LJIIIZ(awemeId, "awemeId");
        this.LJLIL = awemeId;
    }
}

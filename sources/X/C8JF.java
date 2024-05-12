package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.8JF, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8JF implements IEvent {
    public final boolean LJLIL;
    public final String LJLILLLLZI;
    public final boolean LJLJI;

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

    public /* synthetic */ C8JF(String str) {
        this(true, str, false);
    }

    public C8JF(boolean z, String awemeId, boolean z2) {
        o.LJIIIZ(awemeId, "awemeId");
        this.LJLIL = z;
        this.LJLILLLLZI = awemeId;
        this.LJLJI = z2;
    }
}

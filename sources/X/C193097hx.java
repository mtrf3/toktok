package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.7hx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193097hx implements IEvent {
    public final String LJLIL;
    public final int LJLILLLLZI;
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

    public C193097hx(String awemeId, int i, boolean z) {
        o.LJIIIZ(awemeId, "awemeId");
        this.LJLIL = awemeId;
        this.LJLILLLLZI = i;
        this.LJLJI = z;
    }
}

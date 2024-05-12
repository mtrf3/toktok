package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.8WU, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8WU implements IEvent {
    public final boolean LJLIL;
    public final int LJLILLLLZI;
    public final Y9G LJLJI;
    public final boolean LJLJJI;

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

    public /* synthetic */ C8WU(int i, Y9G y9g) {
        this(false, i, y9g, true);
    }

    public C8WU(boolean z, int i, Y9G user, boolean z2) {
        o.LJIIIZ(user, "user");
        this.LJLIL = z;
        this.LJLILLLLZI = i;
        this.LJLJI = user;
        this.LJLJJI = z2;
    }
}

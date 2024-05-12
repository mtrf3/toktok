package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.2IY, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2IY implements IEvent {
    public final float LJLIL;
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

    public C2IY(float f, String enterFrom, boolean z) {
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LJLIL = f;
        this.LJLILLLLZI = enterFrom;
        this.LJLJI = z;
    }
}

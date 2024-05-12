package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.QWn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67137QWn extends F9E implements IEvent {
    public final C47766Ios LJLIL;
    public final String LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
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

    public C67137QWn(C47766Ios c47766Ios, String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LJLIL = c47766Ios;
        this.LJLILLLLZI = enterFrom;
    }
}

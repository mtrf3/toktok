package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.IOe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46536IOe extends F9E implements IEvent {
    public final C71767SEp LJLIL;

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

    public C46536IOe(C71767SEp subPaymentItem) {
        o.LJIIIZ(subPaymentItem, "subPaymentItem");
        this.LJLIL = subPaymentItem;
    }
}

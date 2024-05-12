package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.NFi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59046NFi implements IEvent {
    public final Integer LJLIL;
    public final Integer LJLILLLLZI;

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

    public C59046NFi(Integer num, Integer num2) {
        this.LJLIL = num;
        this.LJLILLLLZI = num2;
    }
}

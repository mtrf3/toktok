package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.3ba, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87223ba implements IEvent {
    public final int LJLIL;
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

    public C87223ba(int i, Integer num) {
        this.LJLIL = i;
        this.LJLILLLLZI = num;
    }
}

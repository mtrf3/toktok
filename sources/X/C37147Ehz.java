package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.Ehz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37147Ehz implements IEvent {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public final int LJLIL;

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

    public C37147Ehz(int i) {
        this.LJLIL = i;
    }
}

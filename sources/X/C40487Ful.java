package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.Ful, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40487Ful implements IEvent {
    public final int LJLIL;
    public final String LJLILLLLZI;

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

    public C40487Ful(int i, String str) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
    }
}

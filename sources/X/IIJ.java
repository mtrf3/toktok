package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* loaded from: classes9.dex */
public final class IIJ extends F9E implements IEvent {
    public final String LJLIL;
    public final int LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI)};
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

    public IIJ(String str, int i) {
        this.LJLIL = str;
        this.LJLILLLLZI = i;
    }
}
package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* loaded from: classes9.dex */
public final class JYS implements IEvent {
    public final int LJLIL;
    public final C50287JoR LJLILLLLZI;
    public final java.util.Map<String, Object> LJLJI;

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

    public JYS(int i) {
        this.LJLIL = i;
    }

    public JYS(int i, C50287JoR c50287JoR) {
        this.LJLIL = i;
        this.LJLILLLLZI = c50287JoR;
    }

    public JYS(int i, java.util.Map<String, Object> map) {
        this.LJLIL = i;
        this.LJLJI = map;
    }
}

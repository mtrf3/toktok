package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* loaded from: classes7.dex */
public final class F9N implements IEvent {
    public static final /* synthetic */ int LJLJJL = 0;
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;

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

    public F9N(int i, int i2, String str, String str2) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = str;
        this.LJLJJI = str2;
    }
}

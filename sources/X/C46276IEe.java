package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.IEe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46276IEe implements IEvent {
    public final int LJLIL;
    public String LJLILLLLZI;

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

    public C46276IEe() {
        this.LJLIL = 11;
    }

    public C46276IEe(Object obj) {
        this.LJLIL = 8;
    }

    public C46276IEe(int i) {
        this(i, 0);
    }

    public C46276IEe(int i, String str) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
    }

    public C46276IEe(int i, int i2) {
        this.LJLIL = i;
    }
}

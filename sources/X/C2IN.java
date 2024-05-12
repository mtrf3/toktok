package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.2IN, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2IN extends F9E implements IEvent {
    public final int LJLIL = 4;
    public final String LJLILLLLZI;
    public final boolean LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), this.LJLILLLLZI, Boolean.valueOf(this.LJLJI)};
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

    public C2IN(String str, boolean z) {
        this.LJLILLLLZI = str;
        this.LJLJI = z;
    }
}

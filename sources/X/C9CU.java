package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.9CU, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9CU extends F9E implements IEvent {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final java.util.Map<String, Object> LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
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

    public C9CU(String str, String str2, java.util.Map<String, ? extends Object> map) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = map;
    }
}

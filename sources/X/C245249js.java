package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.9js, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C245249js implements IEvent {
    public final boolean LJLIL;
    public final int LJLILLLLZI;
    public final String LJLJI;

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

    public C245249js(int i, String str, boolean z) {
        this.LJLIL = z;
        this.LJLILLLLZI = i;
        this.LJLJI = str;
    }
}

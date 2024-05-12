package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.6t8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174546t8 implements IEvent {
    public final boolean LJLIL;
    public final String LJLILLLLZI;
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

    public C174546t8(boolean z, String str, String str2) {
        this.LJLIL = z;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }
}

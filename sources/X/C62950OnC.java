package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.OnC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62950OnC implements IEvent {
    public final String LJLIL;
    public final String LJLILLLLZI;
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

    public C62950OnC() {
        this.LJLIL = "";
        this.LJLILLLLZI = "";
        this.LJLJI = "";
        this.LJLJJI = "";
    }

    public C62950OnC(String str, String str2, String str3, String str4) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
    }
}

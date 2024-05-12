package X;

import android.os.Bundle;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.Nb4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59650Nb4 implements IEvent {
    public static final /* synthetic */ int LJLJJI = 0;
    public final InterfaceC59655Nb9 LJLIL;
    public final Bundle LJLILLLLZI;
    public final java.util.Map<String, String> LJLJI;

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

    public C59650Nb4(C59652Nb6 c59652Nb6, Bundle bundle, java.util.Map map) {
        this.LJLIL = c59652Nb6;
        this.LJLILLLLZI = bundle;
        this.LJLJI = map;
    }
}

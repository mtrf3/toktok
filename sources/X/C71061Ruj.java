package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.Ruj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71061Ruj extends F9E implements IEvent {
    public final boolean LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), this.LJLILLLLZI, this.LJLJI};
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

    public C71061Ruj(String roomId, String str) {
        o.LJIIIZ(roomId, "roomId");
        this.LJLIL = true;
        this.LJLILLLLZI = roomId;
        this.LJLJI = str;
    }
}

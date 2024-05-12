package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.Wak, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82562Wak implements IEvent {
    public final EnumC82563Wal LJLIL;
    public final EnumC82565Wan LJLILLLLZI;
    public final int LJLJI;
    public final float LJLJJI;

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

    public C82562Wak(EnumC82563Wal state, EnumC82565Wan producer, int i, float f) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(producer, "producer");
        this.LJLIL = state;
        this.LJLILLLLZI = producer;
        this.LJLJI = i;
        this.LJLJJI = f;
    }
}

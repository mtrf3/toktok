package X;

import android.content.Context;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.4dQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C113844dQ implements IEvent {
    public final Context LJLIL;
    public final boolean LJLILLLLZI;
    public final InterfaceC62225ObV LJLJI;

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

    public C113844dQ(Context context, InterfaceC62225ObV channel) {
        o.LJIIIZ(channel, "channel");
        this.LJLIL = context;
        this.LJLILLLLZI = true;
        this.LJLJI = channel;
    }
}

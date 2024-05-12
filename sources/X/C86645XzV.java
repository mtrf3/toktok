package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.XzV, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86645XzV implements IEvent {
    public final boolean LJLIL;
    public final String LJLILLLLZI;
    public final EnumC86777Y3x LJLJI;
    public final boolean LJLJJI;

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

    public C86645XzV(boolean z, String str, EnumC86777Y3x source, boolean z2) {
        o.LJIIIZ(source, "source");
        this.LJLIL = z;
        this.LJLILLLLZI = str;
        this.LJLJI = source;
        this.LJLJJI = z2;
    }
}

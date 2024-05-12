package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.2If, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56132If implements IEvent {
    public final Aweme LJLIL;
    public final String LJLILLLLZI;

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

    public C56132If(Aweme aweme, String enterfrom) {
        o.LJIIIZ(enterfrom, "enterfrom");
        this.LJLIL = aweme;
        this.LJLILLLLZI = enterfrom;
    }
}

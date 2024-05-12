package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.2Ih, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56152Ih implements IEvent {
    public final String LJLIL;
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

    public C56152Ih(String enterFrom, String str) {
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LJLIL = enterFrom;
        this.LJLILLLLZI = str;
    }
}

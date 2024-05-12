package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.3zP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101993zP implements IEvent {
    public final InterfaceC88472Yns<String, C76800UCe> LJLIL;
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

    public C101993zP(String enterMethod, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(enterMethod, "enterMethod");
        this.LJLIL = interfaceC88472Yns;
        this.LJLILLLLZI = enterMethod;
    }
}

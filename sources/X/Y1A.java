package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y1A implements IEvent {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final EnumC86777Y3x LJLJI;
    public final int LJLJJI;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJLJJL;

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

    /* JADX WARN: Multi-variable type inference failed */
    public Y1A(String str, String str2, EnumC86777Y3x enterMethod, int i, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(enterMethod, "enterMethod");
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = enterMethod;
        this.LJLJJI = i;
        this.LJLJJL = interfaceC88472Yns;
    }
}

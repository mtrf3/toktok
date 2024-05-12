package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y19 implements IEvent {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final EnumC86777Y3x LJLJI;
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

    public Y19(String str, String str2, EnumC86777Y3x enterMethod, String str3) {
        o.LJIIIZ(enterMethod, "enterMethod");
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = enterMethod;
        this.LJLJJI = str3;
    }
}

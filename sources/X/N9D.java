package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N9D extends F9E implements IEvent {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final XBaseParamModel LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
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

    public N9D(String eventName, String str, XBaseParamModel xBaseParamModel) {
        o.LJIIIZ(eventName, "eventName");
        this.LJLIL = eventName;
        this.LJLILLLLZI = str;
        this.LJLJI = xBaseParamModel;
    }
}

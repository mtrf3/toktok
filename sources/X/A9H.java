package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A9H implements IEvent {
    public final A9F LJLIL;
    public final int LJLILLLLZI;
    public final Float LJLJI;
    public final Integer LJLJJI;
    public final Integer LJLJJL;

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

    public /* synthetic */ A9H(A9F a9f) {
        this(a9f, -1, null, null, null);
    }

    public A9H(A9F onPageChangeMode, int i, Float f, Integer num, Integer num2) {
        o.LJIIIZ(onPageChangeMode, "onPageChangeMode");
        this.LJLIL = onPageChangeMode;
        this.LJLILLLLZI = i;
        this.LJLJI = f;
        this.LJLJJI = num;
        this.LJLJJL = num2;
    }
}

package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class ASB extends ASG {
    public final Aweme LJLILLLLZI;
    public final String LJLJI;

    public String LIZLLL() {
        return "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ASB(InterfaceC26269ASr actionsManager, AS3 as3) {
        super(as3);
        o.LJIIIZ(actionsManager, "actionsManager");
        this.LJLJI = "";
        if (actionsManager instanceof C62435Oet) {
            C62435Oet c62435Oet = (C62435Oet) actionsManager;
            this.LJLILLLLZI = c62435Oet.LJLIL;
            this.LJLJI = c62435Oet.LJLILLLLZI;
        }
    }
}

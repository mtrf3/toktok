package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ATH extends ASB {
    public final C62435Oet LJLJJI;

    @Override // X.ASG
    public final void LIZ(View v) {
        o.LJIIIZ(v, "v");
        Aweme aweme = this.LJLILLLLZI;
        o.LJI(aweme);
        C98273tP.LIZJ(this.LJLJJI.LJLILLLLZI, aweme, "long_press");
        IFH.LIZLLL(this.LJLJJI.LJLILLLLZI, "long_press");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ATH(C62435Oet actionsManager, AS3 as3) {
        super(actionsManager, as3);
        o.LJIIIZ(actionsManager, "actionsManager");
        this.LJLJJI = actionsManager;
    }
}

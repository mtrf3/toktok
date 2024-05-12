package Y;

import X.C76800UCe;
import X.C82622Wbi;
import X.HYT;
import X.InterfaceC83142Wk6;
import android.app.Activity;
import com.ss.android.ugc.aweme.services.editeffect.EditEffectAnchorManager;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.concurrent.Callable;

/* loaded from: classes8.dex */
public class ACallableS9S1400000_7 implements Callable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS9S1400000_7 aCallableS9S1400000_7) {
        HYT.LIZIZ((C82622Wbi) aCallableS9S1400000_7.l4, (EditEffectAnchorManager) aCallableS9S1400000_7.l3, (ShortVideoContext) aCallableS9S1400000_7.l1, (InterfaceC83142Wk6) aCallableS9S1400000_7.l2, aCallableS9S1400000_7.s0);
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS9S1400000_7 aCallableS9S1400000_7) {
        HYT.LIZIZ((C82622Wbi) aCallableS9S1400000_7.l4, (EditEffectAnchorManager) aCallableS9S1400000_7.l3, (ShortVideoContext) aCallableS9S1400000_7.l1, (InterfaceC83142Wk6) aCallableS9S1400000_7.l2, aCallableS9S1400000_7.s0);
        return C76800UCe.LIZ;
    }

    public ACallableS9S1400000_7(Activity activity, C82622Wbi c82622Wbi, EditEffectAnchorManager editEffectAnchorManager, ShortVideoContext shortVideoContext, InterfaceC83142Wk6 interfaceC83142Wk6, String str, int i) {
        this.$t = i;
        this.l1 = shortVideoContext;
        this.l2 = interfaceC83142Wk6;
        this.s0 = str;
        this.l3 = editEffectAnchorManager;
        this.l4 = c82622Wbi;
    }
}

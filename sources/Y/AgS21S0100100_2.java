package Y;

import X.C10I;
import X.C10K;
import X.C147295qH;
import X.C63C;
import X.C76800UCe;
import X.H78;
import X.X1D;
import com.ss.android.ugc.aweme.nows.ui.NowsEditRootScene;
import com.ss.android.vesdk.VEUtils;

/* loaded from: classes3.dex */
public class AgS21S0100100_2 implements C10I {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            default:
                return null;
        }
    }

    public static final Object then$0(AgS21S0100100_2 agS21S0100100_2, C10K c10k) {
        C63C LLLI = ((NowsEditRootScene) agS21S0100100_2.l0).LLLI();
        if (LLLI != null) {
            LLLI.LJI();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditRootScene -> resizeImageWithEffect cost ");
        LIZ.append(System.currentTimeMillis() - agS21S0100100_2.j1);
        LIZ.append('s');
        H78.LIZ(X1D.LIZIZ(LIZ));
        H78.LIZ("EditRootScene -> resizeImageWithEffect: clearResizeImageWithEffectCache");
        VEUtils.clearResizeImageWithEffectCache();
        return C76800UCe.LIZ;
    }

    public static final Object then$1(AgS21S0100100_2 agS21S0100100_2, C10K c10k) {
        ((C147295qH) agS21S0100100_2.l0).LLJJIII().LJI();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditRootScene -> resizeImageWithEffect cost ");
        LIZ.append(System.currentTimeMillis() - agS21S0100100_2.j1);
        LIZ.append('s');
        H78.LIZ(X1D.LIZIZ(LIZ));
        H78.LIZ("EditRootScene -> resizeImageWithEffect: clearResizeImageWithEffectCache");
        VEUtils.clearResizeImageWithEffectCache();
        return C76800UCe.LIZ;
    }

    public AgS21S0100100_2(Object obj, long j, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j1 = j;
    }
}

package o53;

import X.C158056If;
import X.C16880lQ;
import X.C74240TBs;
import X.InterfaceC71856SIa;
import X.SIZ;
import X.TEZ;
import X.W4V;
import android.graphics.drawable.Animatable;
import com.ss.android.ugc.aweme.global.config.settings.pojo.ContentLanguageGuideSetting;

/* loaded from: classes13.dex */
public class IDdS197S0200000_12 extends W4V {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.W4V, X.W4Z
    public final void LJFF(String str, Object obj, Animatable animatable) {
        switch (this.$t) {
            case 0:
                LJFF$0(this, str, obj, animatable);
                return;
            case 1:
                LJFF$1(this, str, obj, animatable);
                return;
            default:
                super.LJFF(str, obj, animatable);
                return;
        }
    }

    public IDdS197S0200000_12(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void LJFF$0(IDdS197S0200000_12 iDdS197S0200000_12, String str, Object obj, Animatable animatable) {
        TEZ tez = (TEZ) iDdS197S0200000_12.l0;
        if (tez == null) {
            return;
        }
        tez.LJJIJLIJ(tez.LJIILLIIL() - 1);
        if (((TEZ) iDdS197S0200000_12.l0).LJIILLIIL() > 0) {
            return;
        }
        InterfaceC71856SIa interfaceC71856SIa = (InterfaceC71856SIa) iDdS197S0200000_12.l1;
        if (interfaceC71856SIa != null) {
            SIZ.LIZ(((TEZ) iDdS197S0200000_12.l0).LJFF());
            interfaceC71856SIa.onSuccess();
        }
        TEZ tez2 = (TEZ) iDdS197S0200000_12.l0;
        SIZ.LIZJ.clear();
        SIZ.LIZLLL.LIZ.set(0);
        if (tez2.LJIILLIIL() > 0) {
            return;
        }
        tez2.LJJIJLIJ(SIZ.LIZIZ);
    }

    public static final void LJFF$1(IDdS197S0200000_12 iDdS197S0200000_12, String str, Object obj, Animatable animatable) {
        try {
            ((C74240TBs) iDdS197S0200000_12.l0).LJLILLLLZI.LIZLLL(((ContentLanguageGuideSetting) iDdS197S0200000_12.l1).getCode());
        } catch (C158056If e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}

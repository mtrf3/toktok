package X;

import com.ss.android.ugc.aweme.ecomsearch.middle.ui.EcAbstractSearchIntermediateFragmentNew;
import com.ss.android.ugc.aweme.impl.OptimizerHelperServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KA2 implements InterfaceC51344KDc {
    public final /* synthetic */ EcAbstractSearchIntermediateFragmentNew LIZ;

    public KA2(EcAbstractSearchIntermediateFragmentNew ecAbstractSearchIntermediateFragmentNew) {
        this.LIZ = ecAbstractSearchIntermediateFragmentNew;
    }

    @Override // X.InterfaceC51344KDc
    public final void LIZ() {
        String str;
        AbstractC029409q adapter = this.LIZ.Gl().getAdapter();
        if ((adapter instanceof KBQ) && (str = ((KBQ) adapter).LJLJLLL) != null) {
            EcAbstractSearchIntermediateFragmentNew ecAbstractSearchIntermediateFragmentNew = this.LIZ;
            K4I LIZ = K4O.LIZ(str);
            String Kl = ecAbstractSearchIntermediateFragmentNew.Kl();
            LIZ.getClass();
            LIZ.LJI = Kl;
            String Ll = ecAbstractSearchIntermediateFragmentNew.Ll();
            if (Ll == null) {
                Ll = ecAbstractSearchIntermediateFragmentNew.Kl();
            }
            LIZ.LJIIIIZZ = Ll;
            LIZ.LJII = C51214K8c.LJ(ecAbstractSearchIntermediateFragmentNew.vl());
            LIZ.LIZ();
            if (o.LJ(str, ecAbstractSearchIntermediateFragmentNew.LJLL)) {
                OptimizerHelperServiceImpl.LJIIIZ().LIZLLL();
            }
        }
    }
}

package Y;

import X.ActivityC45651qj;
import X.C10K;
import X.C51141K5h;
import X.CallableC49925Jib;
import X.JHN;
import X.KC5;
import X.KDP;
import android.view.ViewTreeObserver;
import com.ss.android.ugc.aweme.ecomsearch.middle.ui.EcDynamicSingleIntermediateFragmentNew;
import com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService;

/* loaded from: classes9.dex */
public class IDDListenerS394S0100000_8 implements ViewTreeObserver.OnPreDrawListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.$t) {
            case 0:
                return onPreDraw$0(this);
            case 1:
                return onPreDraw$1(this);
            default:
                return false;
        }
    }

    public static final boolean onPreDraw$0(IDDListenerS394S0100000_8 iDDListenerS394S0100000_8) {
        EcDynamicSingleIntermediateFragmentNew ecDynamicSingleIntermediateFragmentNew = (EcDynamicSingleIntermediateFragmentNew) iDDListenerS394S0100000_8.l0;
        if (ecDynamicSingleIntermediateFragmentNew.LL) {
            ISearchMiddleForECService iSearchMiddleForECService = ecDynamicSingleIntermediateFragmentNew.LJZ;
            ActivityC45651qj mo49getActivity = ecDynamicSingleIntermediateFragmentNew.mo49getActivity();
            C51141K5h.LIZ.getClass();
            if (C51141K5h.LIZ(mo49getActivity)) {
                if (iSearchMiddleForECService != null) {
                    iSearchMiddleForECService.LJIIIZ();
                    return true;
                }
                return true;
            }
            KC5 kc5 = KDP.LIZ;
            if (kc5 == null || kc5.LIZ == 0) {
                return true;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j = kc5.LIZ;
            C10K.LIZJ(new CallableC49925Jib((int) (currentTimeMillis - j), kc5.LIZJ, kc5.LIZIZ, j, kc5.LJ, kc5.LIZLLL));
            KDP.LIZ = null;
            return true;
        }
        return true;
    }

    public static final boolean onPreDraw$1(IDDListenerS394S0100000_8 iDDListenerS394S0100000_8) {
        ((JHN) iDDListenerS394S0100000_8.l0).LIZLLL();
        ((JHN) iDDListenerS394S0100000_8.l0).getViewTreeObserver().removeOnPreDrawListener(iDDListenerS394S0100000_8);
        return true;
    }

    public IDDListenerS394S0100000_8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}

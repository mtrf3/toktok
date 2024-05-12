package Y;

import X.C36213EJd;
import X.E6T;
import X.E71;
import X.InterfaceC64592gB;
import com.ss.android.ugc.aweme.data.HybridABApi;

/* loaded from: classes7.dex */
public class AfS0S1110100_6 implements InterfaceC64592gB {
    public final int $t;
    public long j3;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS0S1110100_6 afS0S1110100_6, Object obj) {
        String str;
        HybridABApi.HybridExperimentResponse hybridExperimentResponse = (HybridABApi.HybridExperimentResponse) obj;
        HybridABApi.HybridABExtra hybridABExtra = hybridExperimentResponse.extra;
        if (hybridABExtra != null) {
            str = hybridABExtra.logId;
        } else {
            str = null;
        }
        E6T.LJI = str;
        ((E71) afS0S1110100_6.l1).LIZ.LIZ(hybridExperimentResponse.configMap, hybridExperimentResponse.closedExperiment);
        E6T.LIZ(hybridExperimentResponse.statusCode, afS0S1110100_6.s0, "", afS0S1110100_6.z2, afS0S1110100_6.j3);
        E6T.LJIIIIZZ = true;
        C36213EJd.LIZIZ = true;
        E71 e71 = (E71) afS0S1110100_6.l1;
        e71.getClass();
        e71.LJFF = false;
        e71.LIZLLL.removeNetworkChangeObserver(e71);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c3, code lost:
    
        if (r0 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e8, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
    
        if (r0 != null) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$1(Y.AfS0S1110100_6 r6, java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS0S1110100_6.accept$1(Y.AfS0S1110100_6, java.lang.Object):void");
    }

    public AfS0S1110100_6(E71 e71, String str, long j, boolean z, int i) {
        this.$t = i;
        this.l1 = e71;
        this.s0 = str;
        this.j3 = j;
        this.z2 = z;
    }
}

package X;

import Y.AObserverS81S0100000_13;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UF4 extends AbstractC61103NyV {
    public final /* synthetic */ UPK LIZIZ;
    public final /* synthetic */ ActivityC45651qj LIZJ;

    public UF4(UPK upk, ActivityC45651qj activityC45651qj) {
        this.LIZIZ = upk;
        this.LIZJ = activityC45651qj;
    }

    @Override // X.AbstractC61103NyV
    public final void LIZIZ(C61101NyT c61101NyT, C164906da... permissionsStatus) {
        NextLiveData<Boolean> nextLiveData;
        o.LJIIIZ(permissionsStatus, "permissionsStatus");
        int i = C76873UEz.LIZ[permissionsStatus[0].LIZIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 || c61101NyT == null) {
                    return;
                }
                c61101NyT.LIZ();
                return;
            }
            UP0 up0 = (UP0) this.LIZIZ.LJFF.getValue();
            if (up0 != null && (nextLiveData = up0.LJII) != null) {
                nextLiveData.observe(this.LIZJ, new AObserverS81S0100000_13(c61101NyT, 74));
            }
            UP0 up02 = (UP0) this.LIZIZ.LJFF.getValue();
            if (up02 == null) {
                return;
            }
            up02.LIZIZ(false);
            return;
        }
        if (c61101NyT == null) {
            return;
        }
        c61101NyT.LIZ();
    }
}

package X;

import com.ss.android.ugc.aweme.aigc.AIGCAvatarServiceImpl;
import java.util.List;

/* loaded from: classes13.dex */
public final class ST5 implements HPI {
    public final /* synthetic */ ST2 LIZ;
    public final /* synthetic */ List<String> LIZIZ;
    public final /* synthetic */ ActivityC45651qj LIZJ;

    @Override // X.HPI
    public final void LIZ(int[] iArr, String[] strArr) {
        if (C78605Ut7.LIZIZ(iArr)) {
            AIGCAvatarServiceImpl.LJIILLIIL(this.LIZJ, this.LIZ, this.LIZIZ);
        } else {
            ST2 st2 = this.LIZ;
            if (st2 == null) {
                return;
            }
            st2.LIZ(ST4.FAIL, -1);
        }
    }

    public ST5(ActivityC45651qj activityC45651qj, C72116SSa c72116SSa, List list) {
        this.LIZ = c72116SSa;
        this.LIZIZ = list;
        this.LIZJ = activityC45651qj;
    }
}

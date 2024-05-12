package X;

import com.ss.android.ugc.aweme.profile.aigc.ProfileAigcProgressAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class STG implements STO {
    public final /* synthetic */ ProfileAigcProgressAssem LJLIL;

    public STG(ProfileAigcProgressAssem profileAigcProgressAssem) {
        this.LJLIL = profileAigcProgressAssem;
    }

    @Override // X.STO
    public void onUpdate(ST8 callback) {
        STF stf;
        int i;
        Integer num;
        o.LJIIIZ(callback, "callback");
        ST8 st8 = this.LJLIL.LJLLLLLL;
        STF stf2 = null;
        if (st8 != null) {
            stf = st8.LIZ;
        } else {
            stf = null;
        }
        if (stf == STF.IN_PROGRESS) {
            STF stf3 = callback.LIZ;
            if (st8 != null) {
                stf2 = st8.LIZ;
            }
            if (stf3 == stf2) {
                Integer num2 = callback.LJFF;
                int i2 = 0;
                if (num2 != null) {
                    i = num2.intValue();
                } else {
                    i = 0;
                }
                ST8 st82 = this.LJLIL.LJLLLLLL;
                if (st82 != null && (num = st82.LJFF) != null) {
                    i2 = num.intValue();
                }
                if (i < i2) {
                    return;
                }
            }
        }
        ProfileAigcProgressAssem profileAigcProgressAssem = this.LJLIL;
        profileAigcProgressAssem.LJLLLLLL = callback;
        if (!profileAigcProgressAssem.A3()) {
            ProfileAigcProgressAssem profileAigcProgressAssem2 = this.LJLIL;
            if (!profileAigcProgressAssem2.LJLLJ) {
                profileAigcProgressAssem2.LJLLJ = o.LJ(callback.LJII, "fast");
            }
        }
        this.LJLIL.O3(callback);
    }
}

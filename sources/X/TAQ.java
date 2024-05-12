package X;

import com.ss.android.ugc.aweme.prop.mobileefffect.EffectEditAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TAQ implements InterfaceC61107NyZ {
    public final /* synthetic */ EffectEditAssem LIZ;
    public final /* synthetic */ ActivityC45651qj LIZIZ;

    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZIZ(C164906da... results) {
        o.LJIIIZ(results, "results");
        if (results.length == 0) {
            return;
        }
        int i = C76594U4g.LIZ[results[0].LIZIZ.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                return;
            }
            C5S1 c5s1 = new C5S1(this.LIZIZ);
            c5s1.LIZLLL(this.LIZIZ.getString(R.string.jga));
            c5s1.LJ();
            return;
        }
        this.LIZ.e4();
    }

    public TAQ(EffectEditAssem effectEditAssem, ActivityC45651qj activityC45651qj) {
        this.LIZ = effectEditAssem;
        this.LIZIZ = activityC45651qj;
    }
}

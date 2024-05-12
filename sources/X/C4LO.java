package X;

import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4LO, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4LO {
    public static final /* synthetic */ int LJ = 0;
    public final Fragment LIZ;
    public final C99033ud LIZIZ;
    public final C98593tv LIZJ;
    public final boolean LIZLLL;

    public final void LIZ(Assembler assembler) {
        C98563ts c98563ts;
        Fragment fragment = this.LIZ;
        C99033ud c99033ud = this.LIZIZ;
        if (!(c99033ud instanceof C98563ts) || (c98563ts = (C98563ts) c99033ud) == null) {
            return;
        }
        assembler.mv0(fragment, new AqS167S0100000_1(c98563ts, 539));
        assembler.mv0(fragment, new AqS167S0100000_1(this, 540));
    }

    public C4LO(BaseFragment fragment, C99033ud sessionInfo, C98593tv c98593tv, boolean z) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(sessionInfo, "sessionInfo");
        this.LIZ = fragment;
        this.LIZIZ = sessionInfo;
        this.LIZJ = c98593tv;
        this.LIZLLL = z;
    }
}

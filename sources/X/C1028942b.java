package X;

import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.42b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1028942b {
    public final ActivityC45651qj LIZ;
    public final InterfaceC65784Pro<C4BE> LIZIZ;
    public final C99033ud LIZJ;
    public final boolean LIZLLL;
    public final FragmentManager LJ;

    public C1028942b(ActivityC45651qj activity, AqS151S0100000_1 aqS151S0100000_1, C99033ud sessionInfo, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(sessionInfo, "sessionInfo");
        this.LIZ = activity;
        this.LIZIZ = aqS151S0100000_1;
        this.LIZJ = sessionInfo;
        this.LIZLLL = z;
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
        this.LJ = supportFragmentManager;
    }
}

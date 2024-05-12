package X;

import com.ss.android.ugc.aweme.experiments.LandscapeOptExperiment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8L2, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8L2 extends AbstractC65781Prl implements InterfaceC88472Yns<C8NH, C76800UCe> {
    public static final C8L2 LJLIL = new C8L2();

    public C8L2() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8NH c8nh) {
        C8NH reusedUiSlotAssem = c8nh;
        o.LJIIIZ(reusedUiSlotAssem, "$this$reusedUiSlotAssem");
        reusedUiSlotAssem.LJ = C212518Vr.LIZLLL;
        reusedUiSlotAssem.LJ(Y01.LIZIZ.LJIIIIZZ());
        reusedUiSlotAssem.LIZLLL = R.id.n9a;
        if (LandscapeOptExperiment.LIZ()) {
            reusedUiSlotAssem.LIZLLL(C8VK.LAZY);
        }
        return C76800UCe.LIZ;
    }
}

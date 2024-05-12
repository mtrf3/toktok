package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.nows.service.NowsTabServiceImpl;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.AXt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26401AXt extends C248389ow {
    @Override // X.C248389ow
    public final void LIZJ() {
        EventBus.LIZJ().LJIJ(this);
    }

    @QD3
    public final void onEvent(C107794Kx event) {
        o.LJIIIZ(event, "event");
        NowsTabServiceImpl.LJJIIJ().LJJIFFI(event);
    }

    @Override // X.C248389ow
    public final void LIZIZ(ActivityC45651qj activityC45651qj, Fragment fragment) {
        NowsTabServiceImpl.LJJIIJ().LJI(activityC45651qj, fragment);
        EventBus.LIZJ().LJIILJJIL(this);
    }
}

package X;

import android.view.View;
import com.ss.android.ugc.aweme.common.MobClick;
import kotlin.jvm.internal.o;

/* renamed from: X.WId, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82051WId implements InterfaceC81972WFc {
    public final /* synthetic */ WID LIZ;

    @Override // X.InterfaceC81972WFc
    public final void LIZ(C81975WFf c81975WFf) {
    }

    @Override // X.InterfaceC81972WFc
    public final void LIZIZ(C81975WFf c81975WFf) {
    }

    @Override // X.InterfaceC81972WFc
    public final boolean LIZJ(C81975WFf c81975WFf) {
        return false;
    }

    public C82051WId(WID wid) {
        this.LIZ = wid;
    }

    @Override // X.InterfaceC81972WFc
    public final void LIZLLL(View view, C81975WFf c81975WFf) {
        o.LJIIIZ(view, "view");
        ((WIF) this.LIZ.LIZ.LJ(WIF.class, null)).h1(!C60903NvH.LJIIJJI().LJJIL().getSpeedPanelOpen(false));
        MobClick obtain = MobClick.obtain();
        obtain.setEventName("speed_edit");
        obtain.setLabelName("shoot_page");
        obtain.setJsonObject(QCU.LIZIZ(this.LIZ.LIZ));
        FMX.onEvent(obtain);
        if (!C53557L0f.LIZ()) {
            C78609UtB.LJJJJZ(this.LIZ.LJIILIIL());
        }
    }
}

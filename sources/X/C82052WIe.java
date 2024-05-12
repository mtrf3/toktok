package X;

import android.view.View;
import com.ss.android.ugc.aweme.common.MobClick;
import kotlin.jvm.internal.o;

/* renamed from: X.WIe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82052WIe implements InterfaceC81972WFc {
    public final /* synthetic */ WI6 LIZ;

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

    public C82052WIe(WI6 wi6) {
        this.LIZ = wi6;
    }

    @Override // X.InterfaceC81972WFc
    public final void LIZLLL(View view, C81975WFf c81975WFf) {
        o.LJIIIZ(view, "view");
        C78928UyK.LIZIZ(false, false, false, this.LIZ.LIZIZ());
        ((InterfaceC45968I2i) this.LIZ.LIZ.LJ(InterfaceC45968I2i.class, null)).a5(true);
        MobClick obtain = MobClick.obtain();
        obtain.setEventName("music_edit");
        obtain.setLabelName("shoot_page");
        obtain.setJsonObject(QCU.LIZIZ(this.LIZ.LIZ));
        FMX.onEvent(obtain);
    }
}

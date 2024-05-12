package X;

import android.view.View;
import android.view.ViewStub;
import kotlin.jvm.internal.o;

/* renamed from: X.40Z, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C40Z extends AbstractC1036945d<C1023840c> {
    public final ViewStub LIZIZ;
    public final C3Q9 LIZJ;
    public final XKW LIZLLL;
    public C3WQ LJ;
    public View LJFF;

    @Override // X.AbstractC1036945d
    public final void LIZIZ() {
        View view = this.LJFF;
        if (view != null) {
            view.setVisibility(8);
            C3WQ c3wq = this.LJ;
            if (c3wq != null) {
                c3wq.LIZ();
                return;
            } else {
                o.LJIJI("chatNoticeDelegate");
                throw null;
            }
        }
        o.LJIJI("view");
        throw null;
    }

    @Override // X.AbstractC1036945d
    public final Object LJ(C1023840c c1023840c, InterfaceC67352kd interfaceC67352kd) {
        View inflate = this.LIZIZ.inflate();
        o.LJIIIIZZ(inflate, "tcmBannerStub.inflate()");
        this.LJFF = inflate;
        C3WQ c3wq = new C3WQ();
        this.LJ = c3wq;
        return c3wq;
    }

    @Override // X.AbstractC1036945d
    public final Object LJFF(C1023840c c1023840c, InterfaceC67352kd interfaceC67352kd) {
        return XKX.LJI(this.LIZLLL, new C1023640a(this, c1023840c, null), interfaceC67352kd);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40Z(ViewStub viewStub, C3Q9 conversationListModel, XIA dispatcher) {
        super(C41X.TCM);
        o.LJIIIZ(conversationListModel, "conversationListModel");
        o.LJIIIZ(dispatcher, "dispatcher");
        this.LIZIZ = viewStub;
        this.LIZJ = conversationListModel;
        this.LIZLLL = dispatcher;
    }
}

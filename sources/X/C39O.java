package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.List;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.39O, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C39O implements C3J7, C3JJ {
    public final C39H LJLIL = new C39H();
    public final C39N LJLILLLLZI = C39N.LOGIN;

    @Override // X.C3JJ
    public final void LIZLLL() {
    }

    @Override // X.C3J7
    public final void LJI(List<? extends C3L4> list) {
        this.LJLIL.getClass();
    }

    @Override // X.C3JJ
    public final void LJIILIIL() {
    }

    @Override // X.C3JJ
    public final void LJIIJ() {
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // X.C3JJ
    public final void LJIIL() {
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // X.C3J7
    public final C39N LIZJ() {
        return this.LJLILLLLZI;
    }

    @Override // X.C3J7
    public final void LIZIZ(InterfaceC88472Yns<? super InterfaceC81693In, C76800UCe> interfaceC88472Yns) {
        C39H c39h = this.LJLIL;
        c39h.getClass();
        c39h.LJLJI = interfaceC88472Yns;
    }

    @Override // X.C3J7
    public final void LJFF(InterfaceC88472Yns<? super InterfaceC81723Iq, C76800UCe> interfaceC88472Yns) {
        C39H c39h = this.LJLIL;
        c39h.getClass();
        c39h.LJLILLLLZI = interfaceC88472Yns;
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onUserUpdate(C39R event) {
        o.LJIIIZ(event, "event");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserUpdate: ");
        LIZ.append(event.LJLJI);
        C81843Jc.LIZIZ("SessionRefactor-SessionUserRelation", X1D.LIZIZ(LIZ));
        final String LIZJ = C81273Gx.LIZJ(event.LJLIL);
        final IMUser iMUser = event.LJLJI;
        InterfaceC81723Iq interfaceC81723Iq = new InterfaceC81723Iq(iMUser, LIZJ) { // from class: X.39P
            public final String LIZ;
            public final IMUser LIZIZ;
            public final String LIZJ;

            @Override // X.InterfaceC81703Io
            public final String LIZ() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC81723Iq
            public final String LIZIZ() {
                return this.LIZ;
            }

            @Override // X.InterfaceC81703Io
            public final C3L4 LIZLLL(C3L4 c3l4) {
                if (c3l4 instanceof C3L3) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("user: ");
                    LIZ2.append(this.LIZIZ.isBlock());
                    String msg = X1D.LIZIZ(LIZ2);
                    o.LJIIIZ(msg, "msg");
                    C34B.LIZJ("SessionRefactor-SessionUserRelation", msg);
                    IMUser user = this.LIZIZ;
                    o.LJIIIZ(user, "user");
                    ((C3L3) c3l4).LLIIIZ = user;
                }
                return c3l4;
            }

            {
                o.LJIIIZ(iMUser, "updatedIMUser");
                this.LIZ = LIZJ;
                this.LIZIZ = iMUser;
                this.LIZJ = "SessionUserRelationUpdater-SingleUpdateOperation";
            }
        };
        InterfaceC88472Yns<? super InterfaceC81723Iq, C76800UCe> interfaceC88472Yns = this.LJLIL.LJLILLLLZI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(interfaceC81723Iq);
        }
    }
}

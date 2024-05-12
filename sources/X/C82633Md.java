package X;

import com.ss.android.ugc.aweme.im.service.model.IMContact;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Md, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82633Md extends AbstractC82703Mk<C82013Jt, C63120Opw, IMContact> {
    public final C82013Jt LIZ = new AbstractC113374cf<C63120Opw, IMContact>() { // from class: X.3Jt
        public static final /* synthetic */ int LJII = 0;

        @Override // X.AbstractC113374cf
        public final InterfaceC88472Yns<C63120Opw, IMContact> LJ() {
            return new C82053Jx(this);
        }

        @Override // X.AbstractC113374cf
        public final Object LJI(InterfaceC67352kd<? super List<C63120Opw>> interfaceC67352kd) {
            C3Q9.LIZ.getClass();
            C75782yE.LIZ();
            List<C63120Opw> LJIILIIL = C4WC.LJIILIIL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("loadInternal: ");
            ArrayList arrayList = (ArrayList) LJIILIIL;
            LIZ.append(arrayList.size());
            C34B.LJI("RecentLoader", X1D.LIZIZ(LIZ));
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C82223Ko c82223Ko = C99033ud.Companion;
                String conversationId = ((C63120Opw) next).getConversationId();
                c82223Ko.getClass();
                if (!C82223Ko.LIZ(conversationId)) {
                    arrayList2.add(next);
                }
            }
            return ORZ.LLJILJILJ(arrayList2);
        }

        @Override // X.AbstractC113374cf
        public final Object LJIIIIZZ(InterfaceC67352kd<? super List<C63120Opw>> interfaceC67352kd) {
            throw new UnsupportedOperationException("Recent not support load more");
        }
    };

    @Override // X.AbstractC82703Mk
    public final C82013Jt LIZ() {
        return this.LIZ;
    }

    @Override // X.AbstractC82703Mk
    public final /* bridge */ /* synthetic */ C82013Jt LIZIZ() {
        return this.LIZ;
    }
}

package X;

import com.ss.android.ugc.aweme.friends.service.ISocialFriendsService;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G0Q extends G0C<C35656Dz2> {
    @Override // X.G04
    public final EnumC40761FzB type() {
        return EnumC40761FzB.JOURNEY_ON_UPDATE_ADD_FB_FRIENDS_ID;
    }

    @Override // X.G04
    public final boolean LIZIZ(C35656Dz2 c35656Dz2) {
        EnumC40753Fz3 enumC40753Fz3;
        InterfaceC40766FzG interfaceC40766FzG;
        InterfaceC40766FzG interfaceC40766FzG2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("shouldHandle scene:");
        G15 g15 = this.LIZIZ;
        EnumC40753Fz3 enumC40753Fz32 = null;
        if (g15 != null && (interfaceC40766FzG2 = g15.LIZ) != null) {
            enumC40753Fz3 = interfaceC40766FzG2.type();
        } else {
            enumC40753Fz3 = null;
        }
        LIZ.append(enumC40753Fz3);
        C40741Fyr.LIZ(X1D.LIZIZ(LIZ));
        G15 g152 = this.LIZIZ;
        if (g152 != null && (interfaceC40766FzG = g152.LIZ) != null) {
            enumC40753Fz32 = interfaceC40766FzG.type();
        }
        if (enumC40753Fz32 == EnumC40753Fz3.NUJ_SCENE_NEW_VERSION) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0Q(G0D context, G15 flowEngine) {
        super(context, flowEngine);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(flowEngine, "flowEngine");
    }

    @Override // X.G0C, X.G04
    public final void LIZ(G0D context, C35656Dz2 c35656Dz2, InterfaceC88472Yns<? super C40745Fyv, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(context, "context");
        super.LIZ(context, c35656Dz2, interfaceC88472Yns);
        C77266UUc c77266UUc = C77266UUc.LIZIZ;
        c77266UUc.LJJJI();
        InterfaceC40755Fz5 interfaceC40755Fz5 = (InterfaceC40755Fz5) this.LIZ.LJLILLLLZI;
        ISocialFriendsService LJJIL = c77266UUc.LJJIL();
        if (LJJIL == null) {
            LIZLLL();
        } else {
            LJJIL.LIZLLL(interfaceC40755Fz5.LIZ(), new C40833G0v(interfaceC40755Fz5, this));
        }
    }
}

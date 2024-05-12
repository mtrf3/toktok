package X;

import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import kotlin.jvm.internal.o;

/* renamed from: X.Tn4, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75682Tn4 extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC75441TjB, C75732Tns<C75683Tn5>, C76800UCe> {
    public static final C75682Tn4 LJLIL = new C75682Tn4();

    public C75682Tn4() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC75441TjB interfaceC75441TjB, C75732Tns<C75683Tn5> c75732Tns) {
        InterfaceC75441TjB session = interfaceC75441TjB;
        C75732Tns<C75683Tn5> message = c75732Tns;
        o.LJIIIZ(session, "session");
        o.LJIIIZ(message, "message");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("on Session Destroy---");
        LIZ.append(message.LIZ);
        LIZ.append(" isInProgress = ");
        LIZ.append(RandomLinkMicManager.LJIIIZ());
        C0NB.LIZIZ("QuickPairManager", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("on Session Destroy---isTerminator = ");
        LIZ2.append(B5G.LIZIZ().LJJIJL);
        LIZ2.append(" isBequickDisconnct = ");
        LIZ2.append(C31073CHl.LIZLLL());
        C0NB.LIZIZ("QuickPairManager", X1D.LIZIZ(LIZ2));
        if (o.LJ("onLinkMicStateChanged", message.LIZ.LJLIL) && session.LJJJJ() == EnumC31946CgI.MULTI_ARCH) {
            if (!B5G.LIZIZ().LJJIJL && C31073CHl.LIZLLL() && RandomLinkMicManager.LJLJLJ.compareTo(EnumC75692TnE.LINKING) >= 0) {
                RandomLinkMicManager.LJLIL.getClass();
                RandomLinkMicManager.LJIIZILJ();
            } else {
                RandomLinkMicManager.LIZJ(false);
                RandomLinkMicManager.LJLIL.getClass();
                RandomLinkMicManager.LJLILLLLZI = null;
            }
        }
        return C76800UCe.LIZ;
    }
}

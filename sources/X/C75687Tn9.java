package X;

import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import kotlin.jvm.internal.o;

/* renamed from: X.Tn9, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75687Tn9 extends AbstractC65781Prl implements InterfaceC88472Yns<C75718Tne, C76800UCe> {
    public static final C75687Tn9 LJLIL = new C75687Tn9();

    public C75687Tn9() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C75718Tne c75718Tne) {
        C73411SrX c73411SrX;
        C75718Tne data = c75718Tne;
        o.LJIIIZ(data, "data");
        if (data.LJLJI == EnumC75915Tqp.SDK_INVITE && data.LJLILLLLZI == 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" data userId = ");
            LIZ.append(data.LJLIL);
            LIZ.append(" countDown = ");
            LIZ.append(data.LJLILLLLZI);
            LIZ.append(" source = ");
            LIZ.append(data.LJLJI);
            C0NB.LIZIZ("QuickPairManager", X1D.LIZIZ(LIZ));
            if (RandomLinkMicManager.LJLJLJ.compareTo(EnumC75692TnE.IDLE) > 0 && ((c73411SrX = RandomLinkMicManager.LJLJL) == null || !c73411SrX.isDisposed())) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("invite timeout, reset state to waiting, keep pairing, waiting time: ");
                LIZ2.append(RandomLinkMicManager.LJLJJI);
                C0NB.LIZIZ("QuickPairManager", X1D.LIZIZ(LIZ2));
                RandomLinkMicManager randomLinkMicManager = RandomLinkMicManager.LJLIL;
                EnumC75692TnE enumC75692TnE = EnumC75692TnE.WAITING;
                randomLinkMicManager.getClass();
                RandomLinkMicManager.LJIJI(enumC75692TnE);
                B5G.LIZIZ().LJIILIIL(EnumC75636TmK.MATCH);
            }
        }
        return C76800UCe.LIZ;
    }
}

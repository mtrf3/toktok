package X;

import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import kotlin.jvm.internal.o;

/* renamed from: X.Tn8, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75686Tn8 extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC75441TjB, C75732Tns<C75593Tld>, C76800UCe> {
    public static final C75686Tn8 LJLIL = new C75686Tn8();

    public C75686Tn8() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC75441TjB session, C75732Tns<C75593Tld> c75732Tns) {
        C75732Tns<C75593Tld> message = c75732Tns;
        o.LJIIIZ(session, "session");
        o.LJIIIZ(message, "message");
        int size = C8E.LIZLLL().LJIILJJIL().size();
        if (o.LJ("im", message.LIZ.LIZIZ) && RandomLinkMicManager.LJLJLJ == EnumC75692TnE.LINKING_SUCCESS) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("user List Change ");
            LIZ.append(size);
            C0NB.LJ("QuickPairManager", X1D.LIZIZ(LIZ));
            if (size > 2) {
                C15610jN.LIZJ(RunnableC75704TnQ.LJLIL, 1000L);
            }
        }
        return C76800UCe.LIZ;
    }
}

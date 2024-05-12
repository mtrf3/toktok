package X;

import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.IBw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46216IBw extends ESP {
    public List<? extends AVChallenge> LJLILLLLZI;
    public final InterfaceC88471Ynr<List<String>, InterfaceC88472Yns<? super List<? extends AVChallenge>, C76800UCe>, C76800UCe> LJLJI;

    @Override // X.ESP
    public final boolean LJIIJ(T4Q session) {
        o.LJIIIZ(session, "session");
        return true;
    }

    @Override // X.ESP
    public final void LJIIJJI() {
        this.LJLILLLLZI = null;
    }

    public C46216IBw(C42581GnR fetchChallenge) {
        o.LJIIIZ(fetchChallenge, "fetchChallenge");
        this.LJLJI = fetchChallenge;
    }

    @Override // X.ESP
    public final void LJIIL(ERS result, T4Q session) {
        o.LJIIIZ(result, "result");
        o.LJIIIZ(session, "session");
        Effect effect = session.LIZ;
        this.LJLILLLLZI = null;
        List<String> challenge = effect.getChallenge();
        if (challenge != null) {
            this.LJLJI.invoke(challenge, new AqS173S0100000_7(this, 299));
        }
    }
}

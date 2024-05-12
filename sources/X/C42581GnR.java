package X;

import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GnR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42581GnR extends AbstractC65781Prl implements InterfaceC88471Ynr<List<? extends String>, InterfaceC88472Yns<? super List<? extends AVChallenge>, ? extends C76800UCe>, C76800UCe> {
    public static final C42581GnR LJLIL = new C42581GnR();

    public C42581GnR() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(List<? extends String> list, InterfaceC88472Yns<? super List<? extends AVChallenge>, ? extends C76800UCe> interfaceC88472Yns) {
        List<? extends String> challengeIds = list;
        final InterfaceC88472Yns<? super List<? extends AVChallenge>, ? extends C76800UCe> onSuccess = interfaceC88472Yns;
        o.LJIIIZ(challengeIds, "challengeIds");
        o.LJIIIZ(onSuccess, "onSuccess");
        String str = (String) ORZ.LJLLLL(challengeIds);
        if (str != null) {
            C60903NvH.LJIIJJI().getChallengeService().LIZ(str, new InterfaceC15040iS() { // from class: X.5dK
                @Override // X.InterfaceC15040iS
                public final void accept(Object obj) {
                    onSuccess.invoke(C47261Igj.LJJIJ(obj));
                }
            });
        }
        return C76800UCe.LIZ;
    }
}

package X;

import Y.AgS121S0100000_3;
import com.ss.android.ugc.aweme.feed.assem.addiction.AntiAddictionToastAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8PJ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8PJ extends AbstractC65781Prl implements InterfaceC88471Ynr<AntiAddictionToastAssem, C43I<? extends C76800UCe>, C76800UCe> {
    public static final C8PJ LJLIL = new C8PJ();

    public C8PJ() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(AntiAddictionToastAssem antiAddictionToastAssem, C43I<? extends C76800UCe> c43i) {
        AntiAddictionToastAssem selectSubscribe = antiAddictionToastAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null && C27740Aue.LJFF(selectSubscribe.LLIFFJFJJ) && !selectSubscribe.q4().LJLL && C27740Aue.LJFF(selectSubscribe.LLIFFJFJJ)) {
            C10K<Void> LJII = C10K.LJII(100L);
            AgS121S0100000_3 agS121S0100000_3 = new AgS121S0100000_3(selectSubscribe, 3);
            C10C c10c = C10K.LJIIIIZZ;
            LJII.LJ(agS121S0100000_3, c10c, null);
            C10K.LJII(7000L).LJ(new AgS121S0100000_3(selectSubscribe, 4), c10c, null);
        }
        return C76800UCe.LIZ;
    }
}

package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.relation.settings.AuthCardFreqParams;
import kotlin.jvm.internal.o;

/* renamed from: X.Mo5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57909Mo5 extends AbstractC65781Prl implements InterfaceC65784Pro<AuthCardFreqParams> {
    public static final C57909Mo5 LJLIL = new C57909Mo5();

    public C57909Mo5() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final AuthCardFreqParams invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        AuthCardFreqParams authCardFreqParams = C57908Mo4.LIZIZ;
        Object LJIIIIZZ = LIZLLL.LJIIIIZZ("social_permission_card_freq", AuthCardFreqParams.class, authCardFreqParams);
        if (LJIIIIZZ == 0) {
            C57908Mo4.LIZ.getClass();
        } else {
            authCardFreqParams = LJIIIIZZ;
        }
        o.LJIIIIZZ(authCardFreqParams, "SettingsManager.getInsta…a)\n            ?: DEFAULT");
        return authCardFreqParams;
    }
}

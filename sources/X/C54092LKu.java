package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.feed.motivatelogin.MotivateLoginPopupFreqParams;
import kotlin.jvm.internal.o;

/* renamed from: X.LKu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54092LKu extends AbstractC65781Prl implements InterfaceC65784Pro<MotivateLoginPopupFreqParams> {
    public static final C54092LKu LJLIL = new C54092LKu();

    public C54092LKu() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final MotivateLoginPopupFreqParams invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        MotivateLoginPopupFreqParams motivateLoginPopupFreqParams = C54091LKt.LIZIZ;
        Object LJIIIIZZ = LIZLLL.LJIIIIZZ("motivate_login_popup_freq", MotivateLoginPopupFreqParams.class, motivateLoginPopupFreqParams);
        if (LJIIIIZZ == 0) {
            C54091LKt.LIZ.getClass();
        } else {
            motivateLoginPopupFreqParams = LJIIIIZZ;
        }
        o.LJIIIIZZ(motivateLoginPopupFreqParams, "SettingsManager.getInsta…a)\n            ?: DEFAULT");
        return motivateLoginPopupFreqParams;
    }
}

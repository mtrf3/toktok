package X;

import com.ss.android.ugc.aweme.notice.api.ab.GuideOutPushExperiment;

/* renamed from: X.YPw, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87348YPw extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C87348YPw LJLIL = new C87348YPw();

    public C87348YPw() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((GuideOutPushExperiment.LIZ().featureExp & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

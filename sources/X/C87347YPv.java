package X;

import com.ss.android.ugc.aweme.notice.api.ab.GuideOutPushExperiment;

/* renamed from: X.YPv, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87347YPv extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C87347YPv LJLIL = new C87347YPv();

    public C87347YPv() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((GuideOutPushExperiment.LIZ().featureExp & 1) == 0) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

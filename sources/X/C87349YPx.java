package X;

import com.ss.android.ugc.aweme.notice.api.ab.GuideOutPushExperiment;

/* renamed from: X.YPx, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87349YPx extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C87349YPx LJLIL = new C87349YPx();

    public C87349YPx() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((GuideOutPushExperiment.LIZ().featureExp & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

package X;

import com.ss.android.ugc.aweme.ecommerce.core.preloader.ImagePreloadExperiment;

/* renamed from: X.DQk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33854DQk extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C33854DQk LJLIL = new C33854DQk();

    public C33854DQk() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        long intValue = ((Number) C33850DQg.LIZIZ.getValue()).intValue() / ImagePreloadExperiment.PRIORITY_DEFAULT;
        if (!C33850DQg.LIZ()) {
            intValue = 0;
        }
        return Long.valueOf(intValue);
    }
}

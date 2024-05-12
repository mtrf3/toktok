package X;

import com.ss.android.ugc.aweme.publish.business.foreground.FastForegroundPublishStrategy;

/* loaded from: classes8.dex */
public final class HIY extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final HIY LJLIL = new HIY();

    public HIY() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        InterfaceC09240Xw LIZIZ;
        FastForegroundPublishStrategy fastForegroundPublishStrategy;
        C09580Ze LIZJ = C09580Ze.LIZJ();
        if (LIZJ != null && (LIZIZ = LIZJ.LIZIZ(EF7.LJIIIZ)) != null && (fastForegroundPublishStrategy = (FastForegroundPublishStrategy) LIZIZ.LJIILJJIL(FastForegroundPublishStrategy.class)) != null) {
            z = fastForegroundPublishStrategy.getValue();
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

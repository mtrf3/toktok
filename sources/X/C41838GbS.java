package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;

/* renamed from: X.GbS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41838GbS extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C41838GbS LJLIL = new C41838GbS();

    public C41838GbS() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(AVExternalServiceImpl.LIZ().configService().avsettingsConfig().longVideoThresholdWithTolerance());
    }
}

package X;

import com.ss.android.ugc.aweme.search.common.config.FeedSearchGuide;

/* renamed from: X.JtM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50592JtM extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C50592JtM LJLIL = new C50592JtM();

    public C50592JtM() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        long j;
        Long l;
        C50591JtL.LIZ.getClass();
        FeedSearchGuide LIZ = C50591JtL.LIZ();
        if (LIZ != null && (l = LIZ.showTipsDelay) != null) {
            j = l.longValue();
        } else {
            j = 30000;
        }
        return Long.valueOf(j);
    }
}

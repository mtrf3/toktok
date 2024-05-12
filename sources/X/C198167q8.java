package X;

import com.ss.android.ugc.aweme.nows.campaign.p004new.year.NowNewYearEventConfig;
import com.ss.android.ugc.aweme.nows.campaign.p004new.year.NowNewYearTimeRange;

/* renamed from: X.7q8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198167q8 extends AbstractC65781Prl implements InterfaceC65784Pro<NowNewYearTimeRange> {
    public static final C198167q8 LJLIL = new C198167q8();

    public C198167q8() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final NowNewYearTimeRange invoke() {
        C198177q9.LIZ.getClass();
        int i = C198147q6.LIZ[((EnumC198137q5) C198177q9.LJ.getValue()).ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return ((NowNewYearEventConfig) C198177q9.LIZJ.getValue()).newYearTime;
        }
        return ((NowNewYearEventConfig) C198177q9.LIZJ.getValue()).chrisTime;
    }
}

package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.inbox.InboxRefresh;

/* renamed from: X.Yag, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87654Yag extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C87654Yag LJLIL = new C87654Yag();

    public C87654Yag() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        long j;
        try {
            j = CastLongProtector.parseLong(((InboxRefresh) C87652Yae.LIZIZ.getValue()).getRefreshThresholdByTabChange()) * 1000;
        } catch (Exception unused) {
            j = 60000;
        }
        return Long.valueOf(j);
    }
}

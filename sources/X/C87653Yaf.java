package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.inbox.InboxRefresh;

/* renamed from: X.Yaf, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87653Yaf extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C87653Yaf LJLIL = new C87653Yaf();

    public C87653Yaf() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        long j;
        try {
            j = CastLongProtector.parseLong(((InboxRefresh) C87652Yae.LIZIZ.getValue()).getRefreshThresholdByResume()) * 1000;
        } catch (Exception unused) {
            j = 60000;
        }
        return Long.valueOf(j);
    }
}

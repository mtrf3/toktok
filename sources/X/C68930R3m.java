package X;

import com.ss.android.ugc.aweme.notification.frequency.AbsNoticeFrequencyActionManager;
import com.ss.android.ugc.aweme.notification.frequency.Config;
import kotlin.jvm.internal.o;

/* renamed from: X.R3m, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68930R3m extends AbsNoticeFrequencyActionManager {
    public final String LJ;

    @Override // com.ss.android.ugc.aweme.notification.frequency.AbsNoticeFrequencyActionManager
    public final void LIZ() {
    }

    @Override // com.ss.android.ugc.aweme.notification.frequency.AbsNoticeFrequencyActionManager
    public final int LIZIZ() {
        for (Config config : (Config[]) C68931R3n.LIZIZ.getValue()) {
            if (config.actionName == 2) {
                return config.saveMaxCount;
            }
        }
        return 100;
    }

    @Override // com.ss.android.ugc.aweme.notification.frequency.AbsNoticeFrequencyActionManager
    public final String LIZLLL() {
        return this.LJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68930R3m(InterfaceC68924R3g executor) {
        super(executor);
        o.LJIIIZ(executor, "executor");
        this.LJ = "inbox_notice_read_frequency";
    }
}

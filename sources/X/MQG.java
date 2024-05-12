package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.notification.ab.NoticeCollapsibility;

/* loaded from: classes10.dex */
public final class MQG {
    public static final /* synthetic */ int LIZ = 0;

    public static final int LIZ() {
        try {
            SettingsManager.LIZLLL().getClass();
            NoticeCollapsibility noticeCollapsibility = (NoticeCollapsibility) SettingsManager.LJII("notice_collapsibility", NoticeCollapsibility.class);
            if (noticeCollapsibility != null) {
                return noticeCollapsibility.extraNoticeCount;
            }
        } catch (Throwable unused) {
        }
        return 0;
    }
}

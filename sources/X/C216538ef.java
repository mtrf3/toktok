package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ab.DanmakuMoveDurationSetting;

/* renamed from: X.8ef, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216538ef extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C216538ef LJLIL = new C216538ef();

    public C216538ef() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        long j;
        try {
            SettingsManager.LIZLLL().getClass();
            j = SettingsManager.LJFF("danmaku_move_duration", 6000L);
        } catch (Throwable unused) {
            j = DanmakuMoveDurationSetting.INSTANCE.getDEFAULT();
        }
        return Long.valueOf(j);
    }
}

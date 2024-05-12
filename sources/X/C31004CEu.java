package X;

import com.bytedance.android.livesdk.livesetting.watchlive.BackRoomListSettingConfigSetting;
import java.util.List;

/* renamed from: X.CEu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31004CEu extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends String>> {
    public static final C31004CEu LJLIL = new C31004CEu();

    public C31004CEu() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<? extends String> invoke() {
        List<String> list = BackRoomListSettingConfigSetting.INSTANCE.getValue().multiList;
        if (list == null) {
            return C47261Igj.LJII("jump_source_all");
        }
        return list;
    }
}

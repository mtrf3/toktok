package X;

import com.bytedance.android.livesdk.livesetting.watchlive.BackRoomListSettingConfigSetting;
import java.util.List;

/* renamed from: X.CEs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31002CEs extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends String>> {
    public static final C31002CEs LJLIL = new C31002CEs();

    public C31002CEs() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<? extends String> invoke() {
        List<String> list = BackRoomListSettingConfigSetting.INSTANCE.getValue().blockList;
        if (list == null) {
            return C47261Igj.LJII("jump_source_room_back", "jump_source_mic_room", "jump_source_recommend_end_at_follow_button_style");
        }
        return list;
    }
}

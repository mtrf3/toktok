package X;

import com.bytedance.android.livesdk.livesetting.watchlive.BackRoomListSettingConfigSetting;
import java.util.List;

/* renamed from: X.CEt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31003CEt extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends String>> {
    public static final C31003CEt LJLIL = new C31003CEt();

    public C31003CEt() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<? extends String> invoke() {
        List<String> list = BackRoomListSettingConfigSetting.INSTANCE.getValue().multiList;
        if (list == null) {
            return C47261Igj.LJII("jump_source_all", "jump_source_live_end", "jump_source_mic_room");
        }
        return list;
    }
}

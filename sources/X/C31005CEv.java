package X;

import com.bytedance.android.livesdk.livesetting.watchlive.BackRoomListSettingConfigSetting;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CEv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31005CEv extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends String>> {
    public static final C31005CEv LJLIL = new C31005CEv();

    public C31005CEv() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<? extends String> invoke() {
        List<String> list = BackRoomListSettingConfigSetting.INSTANCE.getValue().singleList;
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }
}

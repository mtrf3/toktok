package X;

import com.bytedance.android.livesdk.watch.chatroom.StackContext;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.List;

/* loaded from: classes6.dex */
public final class CP4 implements CPD {
    @Override // X.CPD
    public final boolean LIZ(EnterRoomConfig enterRoomConfig, EnterRoomConfig enterRoomConfig2, StackContext stackContext) {
        String LJIJ = V0N.LJIJ(enterRoomConfig2);
        C62822Ol8 c62822Ol8 = C31006CEw.LIZ;
        if (((List) c62822Ol8.getValue()).contains("jump_source_all") || ORZ.LJLJJI(LJIJ, (Iterable) c62822Ol8.getValue())) {
            return true;
        }
        return false;
    }
}

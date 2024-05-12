package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostAndCoHostAddAgeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveLowAgeCountrySetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.UserWithAgeSetting;

/* renamed from: X.BdF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29209BdF implements InterfaceC29110Bbe {
    @Override // X.InterfaceC29110Bbe
    public final boolean LJIIIZ() {
        if (LiveLowAgeCountrySetting.INSTANCE.getValue() && !UserWithAgeSetting.INSTANCE.getValue() && LiveHostAndCoHostAddAgeSetting.INSTANCE.getValue() == 0) {
            return true;
        }
        return false;
    }
}

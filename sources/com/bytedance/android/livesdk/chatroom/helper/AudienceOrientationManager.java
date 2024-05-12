package com.bytedance.android.livesdk.chatroom.helper;

import X.BN7;
import X.BN8;
import X.C0NB;
import X.C15380j0;
import X.C221108m2;
import X.C38995FSd;
import X.C62822Ol8;
import X.X1D;
import android.provider.Settings;
import com.bytedance.android.livesdk.OrientationSensorEvent;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveEnableOrientationSetting;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public final class AudienceOrientationManager {
    public static final AudienceOrientationManager LIZ = new AudienceOrientationManager();
    public static final AtomicInteger LIZIZ = new AtomicInteger(C15380j0.LIZ);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(BN8.LJLIL);

    static {
        C38995FSd.LIZIZ().submit(BN7.LJLIL);
    }

    public static final void start() {
        LIZ.LIZ(LIZIZ.get());
    }

    public final void LIZ(int i) {
        if (LiveEnableOrientationSetting.isEnable()) {
            int i2 = 0;
            if (Settings.System.getInt(C15380j0.LIZLLL().getContentResolver(), "accelerometer_rotation", 0) == 1) {
                if (i != 1) {
                    i2 = 1;
                }
                if (LIZIZ.compareAndSet(i2, i)) {
                    DataChannelGlobal.LJLJJI.sv0(OrientationSensorEvent.class, Integer.valueOf(i));
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(">>>>>>>>>>【");
                    LIZ2.append(this);
                    LIZ2.append("】  call on orientation changed: ");
                    LIZ2.append(i);
                    C0NB.LJIIIIZZ(X1D.LIZIZ(LIZ2));
                }
            }
        }
    }
}

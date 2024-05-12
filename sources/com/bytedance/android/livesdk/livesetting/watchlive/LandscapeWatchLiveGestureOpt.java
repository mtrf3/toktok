package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C221108m2;
import X.C32204CkS;
import X.C5H3;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SettingsKey("landscape_watch_live_gesture_opt")
/* loaded from: classes6.dex */
public final class LandscapeWatchLiveGestureOpt {

    @Group(isDefault = true, value = "default")
    public static final LandscapeScrollConfig DEFAULT;
    public static final LandscapeWatchLiveGestureOpt INSTANCE;
    public static final C5H3 currentValue$delegate;
    public static final boolean enable;
    public static final boolean enableHorOpt;
    public static final boolean enableScrollAngleOpt;
    public static final int scrollAngle;

    static {
        boolean z;
        LandscapeWatchLiveGestureOpt landscapeWatchLiveGestureOpt = new LandscapeWatchLiveGestureOpt();
        INSTANCE = landscapeWatchLiveGestureOpt;
        boolean z2 = false;
        z2 = false;
        DEFAULT = new LandscapeScrollConfig(z2, z2, z2 ? 1 : 0, 7, null);
        currentValue$delegate = C221108m2.LIZIZ(C32204CkS.LJLIL);
        boolean enable2 = landscapeWatchLiveGestureOpt.getCurrentValue().getEnable();
        enable = enable2;
        if (enable2 && landscapeWatchLiveGestureOpt.getCurrentValue().getScrollAngle() >= 0) {
            z = true;
        } else {
            z = false;
        }
        enableScrollAngleOpt = z;
        if (enable2 && landscapeWatchLiveGestureOpt.getCurrentValue().getEnableHorOpt()) {
            z2 = true;
        }
        enableHorOpt = z2;
        scrollAngle = landscapeWatchLiveGestureOpt.getCurrentValue().getScrollAngle();
    }

    public final LandscapeScrollConfig getCurrentValue() {
        return (LandscapeScrollConfig) currentValue$delegate.getValue();
    }

    /* loaded from: classes6.dex */
    public static final class LandscapeScrollConfig implements Serializable {

        @InterfaceC65349Pkn("enable")
        public boolean enable;

        @InterfaceC65349Pkn("enable_hor_opt")
        public boolean enableHorOpt;

        @InterfaceC65349Pkn("vertical_angle")
        public int scrollAngle;

        /* JADX WARN: Multi-variable type inference failed */
        public LandscapeScrollConfig() {
            this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, null);
        }

        public final boolean getEnable() {
            return this.enable;
        }

        public final boolean getEnableHorOpt() {
            return this.enableHorOpt;
        }

        public final int getScrollAngle() {
            return this.scrollAngle;
        }

        public final void setEnable(boolean z) {
            this.enable = z;
        }

        public final void setEnableHorOpt(boolean z) {
            this.enableHorOpt = z;
        }

        public final void setScrollAngle(int i) {
            this.scrollAngle = i;
        }

        public LandscapeScrollConfig(boolean z, boolean z2, int i) {
            this.enable = z;
            this.enableHorOpt = z2;
            this.scrollAngle = i;
        }

        public /* synthetic */ LandscapeScrollConfig(boolean z, boolean z2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? 0 : i);
        }
    }

    public final boolean getEnable() {
        return enable;
    }

    public final boolean getEnableHorOpt() {
        return enableHorOpt;
    }

    public final boolean getEnableScrollAngleOpt() {
        return enableScrollAngleOpt;
    }

    public final int getScrollAngle() {
        return scrollAngle;
    }
}

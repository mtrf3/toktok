package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import X.C107244Iu;
import X.X1D;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;

@SettingsKey("live_surface_view_scene")
/* loaded from: classes6.dex */
public final class LiveSurfaceViewSceneSetting {
    public static final LiveSurfaceViewSceneSetting INSTANCE = new LiveSurfaceViewSceneSetting();

    @Group(isDefault = true, value = "default")
    public static final SurfaceViewScene DEFAULT = new SurfaceViewScene(false, false, false, false, null, 31, null);

    @Group("v1")
    public static final SurfaceViewScene ENABLE = new SurfaceViewScene(false, false, true, false, null, 16, null);

    @Group("all scene")
    public static final SurfaceViewScene All = new SurfaceViewScene(true, true, true, true, null, 16, null);

    public final SurfaceViewScene getAll() {
        return All;
    }

    public final SurfaceViewScene getDEFAULT() {
        return DEFAULT;
    }

    public final SurfaceViewScene getENABLE() {
        return ENABLE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean isEnableScene(EnterRoomConfig enterRoomConfig) {
        String str;
        String str2;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig.RoomsData roomsData2;
        EnterRoomConfig.RoomsData roomsData3;
        SurfaceViewScene surfaceViewScene = (SurfaceViewScene) SettingsManager.INSTANCE.getValueSafely(LiveSurfaceViewSceneSetting.class);
        if (surfaceViewScene == null) {
            surfaceViewScene = DEFAULT;
        }
        StringBuilder LIZ = X1D.LIZ();
        String str3 = null;
        if (enterRoomConfig != null && (roomsData3 = enterRoomConfig.mRoomsData) != null) {
            str = roomsData3.enterFromMerge;
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append('_');
        if (enterRoomConfig != null && (roomsData2 = enterRoomConfig.mRoomsData) != null) {
            str3 = roomsData2.enterMethod;
        }
        LIZ.append(str3);
        if (C107244Iu.LIZ(X1D.LIZIZ(LIZ), surfaceViewScene.forbidden_entrance)) {
            return false;
        }
        if (enterRoomConfig == null || (roomsData = enterRoomConfig.mRoomsData) == null || (str2 = roomsData.enterRoomScene) == null) {
            str2 = "";
        }
        switch (str2.hashCode()) {
            case -1336041635:
                if (str2.equals("outside_with_feed")) {
                    return surfaceViewScene.outside_with_feed;
                }
                return false;
            case 380150922:
                if (str2.equals("outside_normal_click")) {
                    return surfaceViewScene.outside_normal_click;
                }
                return false;
            case 823139725:
                if (str2.equals("inner_draw")) {
                    return surfaceViewScene.inner_draw;
                }
                return false;
            case 823321719:
                if (str2.equals("inner_jump")) {
                    return surfaceViewScene.inner_jump;
                }
                return false;
            default:
                return false;
        }
    }
}

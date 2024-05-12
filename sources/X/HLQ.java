package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.services.AVSettingsServiceImpl;
import com.ss.android.ugc.aweme.services.GeoFencingServiceImpl;
import com.ss.android.ugc.aweme.services.IShortVideoConfig;
import com.ss.android.ugc.aweme.services.config.ShortVideoConfigImpl;
import com.ss.android.ugc.aweme.services.external.ICacheService;
import com.ss.android.ugc.aweme.services.external.IConfigService;
import com.ss.android.ugc.aweme.services.external.IGeofencingService;
import com.ss.android.ugc.aweme.services.external.IPrivacyConfig;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HLQ implements IConfigService {
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(HLR.LJLIL);
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(HLP.LJLIL);

    @Override // com.ss.android.ugc.aweme.services.external.IConfigService
    public final ICacheService cacheConfig() {
        return (C43057Gv7) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IConfigService
    public final IPrivacyConfig privacyConfig() {
        return new HLO();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IConfigService
    public final IShortVideoConfig shortVideoConfig() {
        return ShortVideoConfigImpl.Companion.getInstance();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IConfigService
    public final IAVSettingsService avsettingsConfig() {
        AVSettingsServiceImpl aVSettingsServiceImpl = AVSettingsServiceImpl.getInstance();
        o.LJIIIIZZ(aVSettingsServiceImpl, "getInstance()");
        return aVSettingsServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.services.external.IConfigService
    public final IGeofencingService geoFencingConfig() {
        return GeoFencingServiceImpl.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.services.external.IConfigService
    public final void updateServerSettings(IESSettingsProxy iESSettingsProxy) {
        AVSettingsServiceImpl.getInstance().updateServerSettings(iESSettingsProxy);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IConfigService
    public final void userAction(int i) {
        if (i != 2) {
            return;
        }
        EQ7.LIZ.clear();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IConfigService
    public final void mobUserExitEditAction(String shootWay, String draftId) {
        o.LJIIIZ(shootWay, "shootWay");
        o.LJIIIZ(draftId, "draftId");
        if (ActivityStack.getActivityStack().length != 1) {
            Activity[] activityStack = ActivityStack.getActivityStack();
            o.LJIIIIZZ(activityStack, "getActivityStack()");
            int length = activityStack.length - 1;
            if (length < 0) {
                length = 0;
            }
            if (!(ORZ.LLFII(ORY.LJJLIIIJLJLI(length, activityStack)) instanceof InterfaceC42677Goz)) {
                return;
            }
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZLLL("shoot_way", shootWay);
        c145995oB.LIZLLL("new_draft_id", draftId);
        FMX.LJIIL("exit_camera_on_edit_page", c145995oB.LIZ);
    }
}

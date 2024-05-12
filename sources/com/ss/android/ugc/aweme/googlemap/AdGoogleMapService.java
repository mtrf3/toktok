package com.ss.android.ugc.aweme.googlemap;

import X.C6D8;
import X.EnumC217558gJ;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.poi.map.service.GoogleMapServiceImpl;
import com.ss.android.ugc.aweme.poi_api.service.IGoogleMapService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdGoogleMapService implements IAdGoogleMapService {
    @Override // com.ss.android.ugc.aweme.googlemap.IAdGoogleMapService
    public final void LIZ() {
        String str;
        User currentUser;
        try {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("ad_google_map_enable", false)) {
                IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
                if (createIUserServicebyMonsterPlugin != null && (currentUser = createIUserServicebyMonsterPlugin.getCurrentUser()) != null) {
                    str = currentUser.getUid();
                } else {
                    str = null;
                }
                if (C6D8.LIZLLL() || str == null || str.length() == 0) {
                    return;
                }
                IGoogleMapService LJFF = GoogleMapServiceImpl.LJFF();
                o.LJIIIIZZ(LJFF, "get().getService(IGoogleMapService::class.java)");
                LJFF.LIZ(EnumC217558gJ.KEEP, "COMMERCE_GOOGLE_MAP_INIT_TASK", "", "");
            }
        } catch (Exception unused) {
        }
    }
}

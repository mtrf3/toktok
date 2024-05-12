package com.ss.android.ugc.aweme.setting.serverpush.api;

import X.AbstractC36908Ee8;
import X.C10K;
import X.C38776FJs;
import X.C46104I7o;
import X.C76L;
import X.E4Q;
import X.E4T;
import X.EF7;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.setting.serverpush.model.BatchUpdatePushSwitchesResp;
import com.ss.android.ugc.aweme.setting.serverpush.model.FetchPushOffReasonsResp;
import com.ss.android.ugc.aweme.setting.serverpush.model.NotificationSettings;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettingDynamicUI;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettingDynamicUIResponse;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import java.util.concurrent.ExecutionException;

/* loaded from: classes16.dex */
public final class PushSettingsApiManager {
    public static final PushUserSettingsApi LIZ = (PushUserSettingsApi) C46104I7o.LJIIZILJ(Api.LIZ, PushUserSettingsApi.class);

    /* loaded from: classes16.dex */
    public interface PushUserSettingsApi {
        @E4Q("/tiktok/user/relation/social/data/check/v1")
        C10K<SocialRelationDataCheckResponse> checkSocialRelationData(@InterfaceC64989Pez("social_platform") int i);

        @InterfaceC195757mF
        @E4T("/cloudpush/push_close_feedback")
        C76L<BaseResponse> feedbackPushOffReasons(@InterfaceC64985Pev("device_id") long j, @InterfaceC64985Pev("user_id") long j2, @InterfaceC64985Pev("close_switch") String str, @InterfaceC64985Pev("reason_category_list") String str2, @InterfaceC64985Pev("input_reason_text") String str3);

        @E4Q("/tiktok/v1/notification/settings/")
        C76L<NotificationSettings> getNotificationsSettings();

        @E4T("/cloudpush/push_close_feedback_reason")
        C76L<FetchPushOffReasonsResp> getPushOffReasons();

        @E4T("/notification/settings/view")
        C76L<PushSettingDynamicUIResponse> getPushSettingDynamicUI();

        @E4Q("/aweme/v1/user/settings/")
        C76L<PushSettings> getUserSettings(@InterfaceC64989Pez("last_settings_version") String str);

        @E4T("/tiktok/user/relation/social/data/delete/v1")
        C76L<BaseResponse> removeSocialRelationData(@InterfaceC64989Pez("social_platform") int i);

        @E4Q("/aweme/v1/user/set/settings/")
        C76L<BaseResponse> setItem(@InterfaceC64989Pez("field") String str, @InterfaceC64989Pez("value") int i);

        @InterfaceC195757mF
        @E4T("/cloudpush/user_set_setting")
        C76L<BatchUpdatePushSwitchesResp> setItems(@InterfaceC64985Pev("fields") String str, @InterfaceC64985Pev("value") int i, @InterfaceC64985Pev("close_other") boolean z);

        @E4Q("/aweme/v1/user/set/settings/")
        C76L<BaseResponse> setPrivateItem(@InterfaceC64989Pez("field") String str, @InterfaceC64989Pez("private_setting") int i);

        @E4Q("/aweme/v1/user/set/settings/")
        C76L<BaseResponse> setPrivateItem(@InterfaceC64989Pez("field") String str, @InterfaceC64989Pez("private_setting") int i, @InterfaceC64989Pez("enable_stitch") int i2);

        @E4Q("/aweme/v1/user/set/settings/")
        C76L<BaseResponse> setPrivateItem(@InterfaceC64989Pez("field") String str, @InterfaceC64989Pez("private_setting") int i, @InterfaceC64989Pez("aweme_id") String str2);

        @E4T("/aweme/v1/user/set/settings/")
        C76L<BaseResponse> setResidenceItem(@InterfaceC64989Pez("field") String str, @InterfaceC64989Pez("user_residence") String str2);

        @E4T("/tiktok/v1/notification/settings/set/")
        C76L<BaseResponse> setUserSettingsForLogout(@InterfaceC64989Pez("field") String str, @InterfaceC64989Pez("status") int i);
    }

    public static PushSettingDynamicUI LIZLLL() {
        try {
            return LIZ.getPushSettingDynamicUI().get().uiData;
        } catch (ExecutionException e) {
            throw AbstractC36908Ee8.getCompatibleException(e);
        }
    }

    public static NotificationSettings LJ() {
        try {
            return LIZ.getNotificationsSettings().get();
        } catch (ExecutionException e) {
            throw AbstractC36908Ee8.getCompatibleException(e);
        }
    }

    public static BaseResponse LJI() {
        try {
            return LIZ.getPushOffReasons().get();
        } catch (ExecutionException e) {
            throw AbstractC36908Ee8.getCompatibleException(e);
        }
    }

    public static PushSettings LJFF() {
        try {
            return LIZ.getUserSettings(C38776FJs.LJIIL().LJ(EF7.LIZIZ(), "last_user_setting_version")).get();
        } catch (ExecutionException e) {
            throw AbstractC36908Ee8.getCompatibleException(e);
        }
    }

    public static C10K<SocialRelationDataCheckResponse> LIZIZ(int i) {
        return LIZ.checkSocialRelationData(i);
    }

    public static BaseResponse LJII(int i) {
        try {
            return LIZ.removeSocialRelationData(i).get();
        } catch (ExecutionException e) {
            throw AbstractC36908Ee8.getCompatibleException(e);
        }
    }

    public static BaseResponse LJIIIZ(int i, String str) {
        try {
            return LIZ.setPrivateItem(str, i).get();
        } catch (ExecutionException e) {
            throw AbstractC36908Ee8.getCompatibleException(e);
        }
    }

    public static BaseResponse LJIIJJI(int i, String str) {
        try {
            return LIZ.setItem(str, i).get();
        } catch (ExecutionException e) {
            throw AbstractC36908Ee8.getCompatibleException(e);
        }
    }

    public static BaseResponse LJIIL(int i, String str) {
        try {
            return LIZ.setUserSettingsForLogout(str, i).get();
        } catch (ExecutionException e) {
            throw AbstractC36908Ee8.getCompatibleException(e);
        }
    }

    public static BatchUpdatePushSwitchesResp LIZ(String str, int i, boolean z) {
        try {
            return LIZ.setItems(str, i, z).get();
        } catch (ExecutionException e) {
            throw AbstractC36908Ee8.getCompatibleException(e);
        }
    }

    public static BaseResponse LJIIIIZZ(int i, int i2, String str) {
        try {
            return LIZ.setPrivateItem(str, i, i2).get();
        } catch (ExecutionException e) {
            throw AbstractC36908Ee8.getCompatibleException(e);
        }
    }

    public static BaseResponse LJIIJ(int i, String str, String str2) {
        try {
            return LIZ.setPrivateItem(str, i, str2).get();
        } catch (ExecutionException e) {
            throw AbstractC36908Ee8.getCompatibleException(e);
        }
    }

    public static BaseResponse LIZJ(long j, long j2, String str, String str2, String str3) {
        try {
            return LIZ.feedbackPushOffReasons(j, j2, str, str2, str3).get();
        } catch (ExecutionException e) {
            throw AbstractC36908Ee8.getCompatibleException(e);
        }
    }
}

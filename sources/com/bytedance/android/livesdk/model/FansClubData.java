package com.bytedance.android.livesdk.model;

import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;
import java.util.Map;

/* loaded from: classes14.dex */
public class FansClubData {

    @InterfaceC65349Pkn("anchor_id")
    public long anchorId;

    @InterfaceC65349Pkn("available_gift_ids")
    public List<Long> availableGiftIds;

    @InterfaceC65349Pkn("badge")
    public UserBadge badge;

    @InterfaceC65349Pkn("club_name")
    public String clubName;

    @InterfaceC65349Pkn("level")
    public int level;

    @InterfaceC65349Pkn("user_fans_club_status")
    public int userFansClubStatus;

    /* loaded from: classes14.dex */
    public static class UserBadge {

        @InterfaceC65349Pkn("icons")
        public Map<Integer, ImageModel> icons;

        @InterfaceC65349Pkn("title")
        public String title;
    }

    public static boolean isValid(FansClubData fansClubData) {
        if (fansClubData != null && !TextUtils.isEmpty(fansClubData.clubName)) {
            return true;
        }
        return false;
    }
}

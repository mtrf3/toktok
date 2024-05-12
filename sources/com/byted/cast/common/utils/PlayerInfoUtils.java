package com.byted.cast.common.utils;

import android.text.TextUtils;
import com.byted.cast.common.api.PlayerInfo;
import com.byted.cast.common.bean.XiguaBdLinkUriInfo;

/* loaded from: classes29.dex */
public class PlayerInfoUtils {
    public static String getBdLinkUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        XiguaBdLinkUriInfo xiguaBdLinkUriInfo = (XiguaBdLinkUriInfo) GsonUtils.fromJsonIgnoreException(str, XiguaBdLinkUriInfo.class);
        if (xiguaBdLinkUriInfo == null) {
            return str;
        }
        return xiguaBdLinkUriInfo.getTargetResolutionUrl();
    }

    public static String getUrlByProtocolType(PlayerInfo playerInfo, String str) {
        if (playerInfo == null || TextUtils.isEmpty(playerInfo.getUrl())) {
            return "";
        }
        return getUrlByProtocolType(playerInfo.getUrl(), str);
    }

    public static String getUrlByProtocolType(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if ("BDLink".equals(str2)) {
            return getBdLinkUrl(str);
        }
        return str;
    }
}

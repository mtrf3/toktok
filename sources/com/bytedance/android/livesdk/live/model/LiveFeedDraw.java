package com.bytedance.android.livesdk.live.model;

import X.BLP;
import X.InterfaceC65349Pkn;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveFeedDraw {
    public static final BLP Companion = new BLP();

    @InterfaceC65349Pkn("url")
    public String url = "";

    @InterfaceC65349Pkn("settings")
    public Map<String, LiveFeedSettings> settings = new HashMap();

    public static final String conventRequestFrom(String str, String str2) {
        Companion.getClass();
        return BLP.LIZ(str, str2);
    }

    public static final LiveFeedSettings getSettings(String str) {
        Companion.getClass();
        return BLP.LIZIZ(str);
    }

    public static final LiveFeedSettings getSettings(String str, String str2) {
        Companion.getClass();
        return BLP.LIZJ(str, str2);
    }

    public static final LiveFeedDraw defaultInstance() {
        Companion.getClass();
        return new LiveFeedDraw();
    }

    public final Map<String, LiveFeedSettings> getSettings() {
        return this.settings;
    }

    public final String getUrl() {
        return this.url;
    }

    public static final String getChannelId(String str) {
        Companion.getClass();
        return String.valueOf(BLP.LIZIZ(str).channel_id);
    }

    public static final String getReqFrom(String str) {
        Companion.getClass();
        return BLP.LIZIZ(str).param;
    }

    public static final boolean isEnable(String str) {
        Companion.getClass();
        return o.LJ(BLP.LIZIZ(str).enable, "1");
    }

    public final void setSettings(Map<String, LiveFeedSettings> map) {
        o.LJIIIZ(map, "<set-?>");
        this.settings = map;
    }

    public final void setUrl(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.url = str;
    }

    public static final String getChannelId(String str, String str2) {
        Companion.getClass();
        return String.valueOf(BLP.LIZJ(str, str2).channel_id);
    }

    public static final String getReqFrom(String str, String str2) {
        Companion.getClass();
        return BLP.LIZJ(str, str2).param;
    }

    public static final boolean isEnable(String str, String str2) {
        Companion.getClass();
        return o.LJ(BLP.LIZJ(str, str2).enable, "1");
    }

    public static final boolean isFollow(String str, String str2) {
        Companion.getClass();
        return BLP.LIZJ(str, str2).isFollow;
    }
}

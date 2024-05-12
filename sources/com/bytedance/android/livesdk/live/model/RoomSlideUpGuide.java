package com.bytedance.android.livesdk.live.model;

import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class RoomSlideUpGuide {

    @InterfaceC65349Pkn("max_show_times")
    public int maxShowTimes;

    @InterfaceC65349Pkn("play_times")
    public int playTimes;

    @InterfaceC65349Pkn("new_play_times")
    public int newPlayTimes = 3;

    @InterfaceC65349Pkn("switch")
    public Map<String, Boolean> switchs = new HashMap();

    @InterfaceC65349Pkn("ec_switch")
    public Map<String, Boolean> ecSwitches = new HashMap();

    public static RoomSlideUpGuide defaultInstance() {
        RoomSlideUpGuide roomSlideUpGuide = new RoomSlideUpGuide();
        roomSlideUpGuide.playTimes = 3;
        roomSlideUpGuide.maxShowTimes = 2;
        roomSlideUpGuide.newPlayTimes = 3;
        roomSlideUpGuide.switchs = new HashMap();
        return roomSlideUpGuide;
    }

    public int getMaxShowTimes() {
        return this.maxShowTimes;
    }

    public int getNewPlayTimes() {
        return this.newPlayTimes;
    }

    public int getPlayTimes() {
        return this.playTimes;
    }

    public boolean isBaseLiveGuideEnable(String str) {
        Boolean bool;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Map<String, Boolean> map = this.switchs;
        if (map != null) {
            bool = map.get(str);
        } else {
            bool = Boolean.FALSE;
        }
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public boolean isECSearchGuideEnable(String str) {
        Boolean bool;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Map<String, Boolean> map = this.ecSwitches;
        if (map != null) {
            bool = map.get(str);
        } else {
            bool = Boolean.FALSE;
        }
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }
}

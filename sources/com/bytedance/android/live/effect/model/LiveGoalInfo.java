package com.bytedance.android.live.effect.model;

import X.C07670Rv;
import X.C47959Irz;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class LiveGoalInfo {

    @InterfaceC65349Pkn("canvas")
    public Canvas canvas;

    @InterfaceC65349Pkn("cur_num")
    public Long curNum;

    @InterfaceC65349Pkn("drag_mode")
    public int dragMode;

    @InterfaceC65349Pkn("effect_position")
    public int effectPosition;

    @InterfaceC65349Pkn("first_use")
    public int firstUse;

    @InterfaceC65349Pkn("goal_num")
    public Long goalNum;

    @InterfaceC65349Pkn("goal_str")
    public String goalStr;

    @InterfaceC65349Pkn("icon_path")
    public String iconPath;

    @InterfaceC65349Pkn("init_position")
    public Area initPosition;

    @InterfaceC65349Pkn("last_position")
    public LastPosition lastPosition;

    @InterfaceC65349Pkn("max_line")
    public Integer maxLine;

    @InterfaceC65349Pkn("play_anim_timestamp")
    public String playAnimTimeStamp;

    @InterfaceC65349Pkn("play_guide_animation")
    public int playGuideAnimation;

    @InterfaceC65349Pkn("safe_area")
    public Area safeArea;

    @InterfaceC65349Pkn("safe_area_height")
    public Integer safeAreaHeight;

    @InterfaceC65349Pkn("time")
    public String time;

    @InterfaceC65349Pkn("transparency")
    public float transparency;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveGoalInfo)) {
            return false;
        }
        LiveGoalInfo liveGoalInfo = (LiveGoalInfo) obj;
        return o.LJ(this.iconPath, liveGoalInfo.iconPath) && o.LJ(this.goalNum, liveGoalInfo.goalNum) && o.LJ(this.curNum, liveGoalInfo.curNum) && o.LJ(this.goalStr, liveGoalInfo.goalStr) && o.LJ(this.time, liveGoalInfo.time) && Float.compare(this.transparency, liveGoalInfo.transparency) == 0 && o.LJ(this.maxLine, liveGoalInfo.maxLine) && o.LJ(this.initPosition, liveGoalInfo.initPosition) && o.LJ(this.safeArea, liveGoalInfo.safeArea) && o.LJ(this.canvas, liveGoalInfo.canvas) && o.LJ(this.lastPosition, liveGoalInfo.lastPosition) && this.dragMode == liveGoalInfo.dragMode && this.firstUse == liveGoalInfo.firstUse && this.effectPosition == liveGoalInfo.effectPosition && this.playGuideAnimation == liveGoalInfo.playGuideAnimation && o.LJ(this.safeAreaHeight, liveGoalInfo.safeAreaHeight) && o.LJ(this.playAnimTimeStamp, liveGoalInfo.playAnimTimeStamp);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8 = this.iconPath.hashCode() * 31;
        Long l = this.goalNum;
        int i = 0;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int i2 = (hashCode8 + hashCode) * 31;
        Long l2 = this.curNum;
        if (l2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l2.hashCode();
        }
        int LIZIZ = C47959Irz.LIZIZ(this.transparency, C79062V1e.LJ(this.time, C79062V1e.LJ(this.goalStr, (i2 + hashCode2) * 31, 31), 31), 31);
        Integer num = this.maxLine;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i3 = (LIZIZ + hashCode3) * 31;
        Area area = this.initPosition;
        if (area == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = area.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        Area area2 = this.safeArea;
        if (area2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = area2.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        Canvas canvas = this.canvas;
        if (canvas == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = canvas.hashCode();
        }
        int hashCode9 = (((((((((this.lastPosition.hashCode() + ((i5 + hashCode6) * 31)) * 31) + this.dragMode) * 31) + this.firstUse) * 31) + this.effectPosition) * 31) + this.playGuideAnimation) * 31;
        Integer num2 = this.safeAreaHeight;
        if (num2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num2.hashCode();
        }
        int i6 = (hashCode9 + hashCode7) * 31;
        String str = this.playAnimTimeStamp;
        if (str != null) {
            i = str.hashCode();
        }
        return i6 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LiveGoalInfo(iconPath=");
        sb.append(this.iconPath);
        sb.append(", goalNum=");
        sb.append(this.goalNum);
        sb.append(", curNum=");
        sb.append(this.curNum);
        sb.append(", goalStr=");
        sb.append(this.goalStr);
        sb.append(", time=");
        sb.append(this.time);
        sb.append(", transparency=");
        sb.append(this.transparency);
        sb.append(", maxLine=");
        sb.append(this.maxLine);
        sb.append(", initPosition=");
        sb.append(this.initPosition);
        sb.append(", safeArea=");
        sb.append(this.safeArea);
        sb.append(", canvas=");
        sb.append(this.canvas);
        sb.append(", lastPosition=");
        sb.append(this.lastPosition);
        sb.append(", dragMode=");
        sb.append(this.dragMode);
        sb.append(", firstUse=");
        sb.append(this.firstUse);
        sb.append(", effectPosition=");
        sb.append(this.effectPosition);
        sb.append(", playGuideAnimation=");
        sb.append(this.playGuideAnimation);
        sb.append(", safeAreaHeight=");
        sb.append(this.safeAreaHeight);
        sb.append(", playAnimTimeStamp=");
        return C07670Rv.LIZIZ(sb, this.playAnimTimeStamp, ')');
    }

    public LiveGoalInfo(String iconPath, Long l, Long l2, String goalStr, String time, float f, Integer num, Area area, Area area2, Canvas canvas, LastPosition lastPosition, int i, int i2, int i3, int i4, Integer num2, String str) {
        o.LJIIIZ(iconPath, "iconPath");
        o.LJIIIZ(goalStr, "goalStr");
        o.LJIIIZ(time, "time");
        o.LJIIIZ(lastPosition, "lastPosition");
        this.iconPath = iconPath;
        this.goalNum = l;
        this.curNum = l2;
        this.goalStr = goalStr;
        this.time = time;
        this.transparency = f;
        this.maxLine = num;
        this.initPosition = area;
        this.safeArea = area2;
        this.canvas = canvas;
        this.lastPosition = lastPosition;
        this.dragMode = i;
        this.firstUse = i2;
        this.effectPosition = i3;
        this.playGuideAnimation = i4;
        this.safeAreaHeight = num2;
        this.playAnimTimeStamp = str;
    }

    public /* synthetic */ LiveGoalInfo(String str, Long l, Long l2, String str2, String str3, float f, Integer num, Area area, Area area2, Canvas canvas, LastPosition lastPosition, int i, int i2, int i3, int i4, Integer num2, String str4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i5 & 2) != 0 ? null : l, (i5 & 4) != 0 ? null : l2, str2, str3, f, (i5 & 64) != 0 ? null : num, (i5 & 128) != 0 ? null : area, (i5 & 256) != 0 ? null : area2, (i5 & 512) != 0 ? null : canvas, lastPosition, (i5 & 2048) != 0 ? 0 : i, (i5 & 4096) != 0 ? 1 : i2, (i5 & FileUtils.BUFFER_SIZE) != 0 ? 0 : i3, (i5 & 16384) != 0 ? 1 : i4, (32768 & i5) != 0 ? null : num2, (i5 & 65536) == 0 ? str4 : null);
    }
}

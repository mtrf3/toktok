package com.bytedance.touchpoint.core.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.WM7;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class TouchPoint extends F9E {
    public boolean LJLIL;

    @InterfaceC65349Pkn("ab_versions")
    public String abVersions;

    @InterfaceC65349Pkn("event_params")
    public Map<String, String> customEventParams;

    @InterfaceC65349Pkn("data")
    public String data;

    @InterfaceC65349Pkn("launch_plan_id")
    public Integer launchPlanId;

    @InterfaceC65349Pkn("preview_schema")
    public String previewSchema;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public String scene;

    @InterfaceC65349Pkn("touchpoint_id")
    public int touchPointId;

    @InterfaceC65349Pkn("touchpoint_name")
    public String touchPointName;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.touchPointId), this.touchPointName, this.launchPlanId, this.customEventParams, this.scene, this.abVersions, this.previewSchema, this.data, Boolean.valueOf(this.LJLIL)};
    }

    public TouchPoint(int i, String touchPointName, Integer num, Map<String, String> map, String str, String str2, String str3, String data, boolean z) {
        o.LJIIIZ(touchPointName, "touchPointName");
        o.LJIIIZ(data, "data");
        this.touchPointId = i;
        this.touchPointName = touchPointName;
        this.launchPlanId = num;
        this.customEventParams = map;
        this.scene = str;
        this.abVersions = str2;
        this.previewSchema = str3;
        this.data = data;
        this.LJLIL = z;
    }

    public /* synthetic */ TouchPoint(int i, String str, Integer num, Map map, String str2, String str3, String str4, String str5, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, num, (i2 & 8) != 0 ? null : map, (i2 & 16) == 0 ? str2 : null, str3, str4, str5, (i2 & 256) != 0 ? false : z);
    }
}

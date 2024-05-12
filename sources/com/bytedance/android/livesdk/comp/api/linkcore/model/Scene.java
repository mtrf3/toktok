package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.WM7;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class Scene extends F9E {

    @InterfaceC65349Pkn("desc")
    public final String desc;

    @InterfaceC65349Pkn("layout_id")
    public Map<String, String> layoutId;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public final int scene;

    @InterfaceC65349Pkn("version")
    public final int version;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Scene copy$default(Scene scene, int i, int i2, String str, Map map, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = scene.scene;
        }
        if ((i3 & 2) != 0) {
            i2 = scene.version;
        }
        if ((i3 & 4) != 0) {
            str = scene.desc;
        }
        if ((i3 & 8) != 0) {
            map = scene.layoutId;
        }
        return scene.copy(i, i2, str, map);
    }

    public final Scene copy(int i, int i2, String desc, Map<String, String> layoutId) {
        o.LJIIIZ(desc, "desc");
        o.LJIIIZ(layoutId, "layoutId");
        return new Scene(i, i2, desc, layoutId);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.scene), Integer.valueOf(this.version), this.desc, this.layoutId};
    }

    public final String getDesc() {
        return this.desc;
    }

    public final Map<String, String> getLayoutId() {
        return this.layoutId;
    }

    public final int getScene() {
        return this.scene;
    }

    public final int getVersion() {
        return this.version;
    }

    public final void setLayoutId(Map<String, String> map) {
        o.LJIIIZ(map, "<set-?>");
        this.layoutId = map;
    }

    public Scene(int i, int i2, String desc, Map<String, String> layoutId) {
        o.LJIIIZ(desc, "desc");
        o.LJIIIZ(layoutId, "layoutId");
        this.scene = i;
        this.version = i2;
        this.desc = desc;
        this.layoutId = layoutId;
    }
}

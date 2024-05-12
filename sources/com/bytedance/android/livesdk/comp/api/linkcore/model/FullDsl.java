package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.InterfaceC65349Pkn;
import X.WM7;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class FullDsl {

    @InterfaceC65349Pkn("layouts")
    public final List<Layout> layouts;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public List<Scene> scene;

    public final List<Layout> getLayouts() {
        return this.layouts;
    }

    public final List<Scene> getScene() {
        return this.scene;
    }

    public final void setScene(List<Scene> list) {
        o.LJIIIZ(list, "<set-?>");
        this.scene = list;
    }

    public FullDsl(List<Scene> scene, List<Layout> layouts) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(layouts, "layouts");
        this.scene = scene;
        this.layouts = layouts;
    }
}

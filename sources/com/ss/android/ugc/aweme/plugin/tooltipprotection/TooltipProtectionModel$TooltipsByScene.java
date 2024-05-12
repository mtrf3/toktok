package com.ss.android.ugc.aweme.plugin.tooltipprotection;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.WM7;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TooltipProtectionModel$TooltipsByScene {

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public final int scene;

    @InterfaceC65349Pkn("type")
    public final List<Integer> tooltips;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TooltipProtectionModel$TooltipsByScene)) {
            return false;
        }
        TooltipProtectionModel$TooltipsByScene tooltipProtectionModel$TooltipsByScene = (TooltipProtectionModel$TooltipsByScene) obj;
        return this.scene == tooltipProtectionModel$TooltipsByScene.scene && o.LJ(this.tooltips, tooltipProtectionModel$TooltipsByScene.tooltips);
    }

    public final int hashCode() {
        return this.tooltips.hashCode() + (this.scene * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TooltipsByScene(scene=");
        LIZ.append(this.scene);
        LIZ.append(", tooltips=");
        return C1NE.LIZIZ(LIZ, this.tooltips, ')', LIZ);
    }

    public TooltipProtectionModel$TooltipsByScene(int i, List<Integer> tooltips) {
        o.LJIIIZ(tooltips, "tooltips");
        this.scene = i;
        this.tooltips = tooltips;
    }
}

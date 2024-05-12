package com.bytedance.helios.api.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.OQY;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class SceneConfig extends F9E {

    @InterfaceC65349Pkn("allow_list")
    public final Set<String> allowList;

    @InterfaceC65349Pkn("block_list")
    public final Set<String> blockList;

    @InterfaceC65349Pkn("is_collect_stack")
    public final boolean isCollectStack;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("sample_rate")
    public final double sampleRate;

    @InterfaceC65349Pkn("targets")
    public final Set<Integer> targets;

    public SceneConfig() {
        this(null, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, null, null, false, 63, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.name, Double.valueOf(this.sampleRate), this.targets, this.blockList, this.allowList, Boolean.valueOf(this.isCollectStack)};
    }

    public SceneConfig(String name, double d, Set<Integer> targets, Set<String> blockList, Set<String> allowList, boolean z) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(targets, "targets");
        o.LJIIIZ(blockList, "blockList");
        o.LJIIIZ(allowList, "allowList");
        this.name = name;
        this.sampleRate = d;
        this.targets = targets;
        this.blockList = blockList;
        this.allowList = allowList;
        this.isCollectStack = z;
    }

    public SceneConfig(String str, double d, Set set, Set set2, Set set3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.001d : d, (i & 4) != 0 ? OQY.INSTANCE : set, (i & 8) != 0 ? OQY.INSTANCE : set2, (i & 16) != 0 ? OQY.INSTANCE : set3, (i & 32) != 0 ? false : z);
    }
}

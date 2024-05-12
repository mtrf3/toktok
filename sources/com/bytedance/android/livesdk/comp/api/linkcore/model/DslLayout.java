package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C5UN;
import X.F9E;
import X.OSZ;
import X.X1D;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.b0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class DslLayout extends F9E {
    public final Map<String, Layout> data;
    public final int scene;
    public final int version;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DslLayout copy$default(DslLayout dslLayout, int i, int i2, Map map, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = dslLayout.scene;
        }
        if ((i3 & 2) != 0) {
            i2 = dslLayout.version;
        }
        if ((i3 & 4) != 0) {
            map = dslLayout.data;
        }
        return dslLayout.copy(i, i2, map);
    }

    public final DslLayout copy(int i, int i2, Map<String, Layout> data) {
        o.LJIIIZ(data, "data");
        return new DslLayout(i, i2, data);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.scene), Integer.valueOf(this.version), this.data};
    }

    public final Map<String, String> getBusinessSceneMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Layout> entry : this.data.entrySet()) {
            linkedHashMap.put(entry.getValue().getLayoutId(), entry.getKey());
        }
        return linkedHashMap;
    }

    public final Map<String, String> getSceneMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Layout> entry : this.data.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue().getLayoutId());
        }
        return linkedHashMap;
    }

    public final String toShortString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DslLayout{scene = ");
        LIZ.append(this.scene);
        LIZ.append(", version = ");
        return b0.LIZJ(LIZ, this.version, '}', LIZ);
    }

    public final Map<String, Layout> getData() {
        return this.data;
    }

    public final int getScene() {
        return this.scene;
    }

    public final int getVersion() {
        return this.version;
    }

    public final Layout getLayout(String layoutName) {
        o.LJIIIZ(layoutName, "layoutName");
        return this.data.get(layoutName);
    }

    public final Layout getLayoutByLayoutId(String layoutId) {
        o.LJIIIZ(layoutId, "layoutId");
        Map<String, Layout> map = this.data;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Layout> entry : map.entrySet()) {
            if (o.LJ(entry.getValue().getLayoutId(), layoutId)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        List LJJLJLI = C5UN.LJJLJLI(linkedHashMap);
        if (LJJLJLI == null || LJJLJLI.isEmpty()) {
            return null;
        }
        return (Layout) ((OSZ) ListProtector.get(LJJLJLI, 0)).getSecond();
    }

    public DslLayout(int i, int i2, Map<String, Layout> data) {
        o.LJIIIZ(data, "data");
        this.scene = i;
        this.version = i2;
        this.data = data;
    }
}

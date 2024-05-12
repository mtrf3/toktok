package com.bytedance.android.livesdk.sei;

import X.InterfaceC65349Pkn;
import X.WM7;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class SeiDsl {

    @InterfaceC65349Pkn("layoutId")
    public String layoutId = "";

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public int scene;

    @InterfaceC65349Pkn("sync_layout_id")
    public final String syncLayoutId;

    @InterfaceC65349Pkn("version")
    public int version;

    public final int hashCode() {
        int i = (this.scene * 31) + this.version;
        String str = this.layoutId;
        if (str != null) {
            i = (i * 31) + str.hashCode();
        }
        String str2 = this.syncLayoutId;
        if (str2 != null) {
            return (i * 31) + str2.hashCode();
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SeiDsl)) {
            return false;
        }
        SeiDsl seiDsl = (SeiDsl) obj;
        if (this.scene == seiDsl.scene && this.version == seiDsl.version && o.LJ(this.layoutId, seiDsl.layoutId) && o.LJ(this.syncLayoutId, seiDsl.syncLayoutId)) {
            return true;
        }
        return false;
    }
}

package com.bytedance.android.livesdk.livesetting.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class SlotBizTypeDisallow implements Serializable {

    @InterfaceC65349Pkn("disallow_all")
    public boolean disallowAll;

    @InterfaceC65349Pkn("frame_slot_disallow_list")
    public List<String> frameSlotDisallowList;

    @InterfaceC65349Pkn("icon_slot_disallow_list")
    public List<String> iconSlotDisallowList;

    /* JADX WARN: Multi-variable type inference failed */
    public SlotBizTypeDisallow() {
        this(false, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean getDisallowAll() {
        return this.disallowAll;
    }

    public final List<String> getFrameSlotDisallowList() {
        return this.frameSlotDisallowList;
    }

    public final List<String> getIconSlotDisallowList() {
        return this.iconSlotDisallowList;
    }

    public final void setDisallowAll(boolean z) {
        this.disallowAll = z;
    }

    public final void setFrameSlotDisallowList(List<String> list) {
        this.frameSlotDisallowList = list;
    }

    public final void setIconSlotDisallowList(List<String> list) {
        this.iconSlotDisallowList = list;
    }

    public SlotBizTypeDisallow(boolean z, List<String> list, List<String> list2) {
        this.disallowAll = z;
        this.iconSlotDisallowList = list;
        this.frameSlotDisallowList = list2;
    }

    public /* synthetic */ SlotBizTypeDisallow(boolean z, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
    }
}

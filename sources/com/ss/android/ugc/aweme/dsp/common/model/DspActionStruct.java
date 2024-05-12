package com.ss.android.ugc.aweme.dsp.common.model;

import X.InterfaceC65349Pkn;
import X.WM7;
import X.X1D;
import defpackage.q;
import java.io.Serializable;

/* loaded from: classes13.dex */
public final class DspActionStruct implements Serializable {

    @InterfaceC65349Pkn("action_type")
    public Integer actionType;

    @InterfaceC65349Pkn("extra")
    public String extra;

    @InterfaceC65349Pkn("item_id")
    public String itemId;

    @InterfaceC65349Pkn("item_type")
    public Integer itemType;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public Integer scene;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DspActionStruct(actionType=");
        LIZ.append(this.actionType);
        LIZ.append(", itemType=");
        LIZ.append(this.itemType);
        LIZ.append(", itemId=");
        LIZ.append(this.itemId);
        LIZ.append(", scene=");
        LIZ.append(this.scene);
        LIZ.append(",extra=");
        return q.LIZIZ(LIZ, this.extra, ')', LIZ);
    }

    public final Integer getActionType() {
        return this.actionType;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final Integer getItemType() {
        return this.itemType;
    }

    public final Integer getScene() {
        return this.scene;
    }

    public final void setActionType(Integer num) {
        this.actionType = num;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setItemId(String str) {
        this.itemId = str;
    }

    public final void setItemType(Integer num) {
        this.itemType = num;
    }

    public final void setScene(Integer num) {
        this.scene = num;
    }
}

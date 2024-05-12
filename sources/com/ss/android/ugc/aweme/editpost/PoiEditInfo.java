package com.ss.android.ugc.aweme.editpost;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PoiEditInfo implements Serializable {

    @InterfaceC65349Pkn("anchor_content")
    public final CreateAnchorInfo createAnchorInfo;

    @InterfaceC65349Pkn("action")
    public final int editAction;

    @InterfaceC65349Pkn("poi_id")
    public final String poiId;

    public static /* synthetic */ PoiEditInfo copy$default(PoiEditInfo poiEditInfo, int i, String str, CreateAnchorInfo createAnchorInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = poiEditInfo.editAction;
        }
        if ((i2 & 2) != 0) {
            str = poiEditInfo.poiId;
        }
        if ((i2 & 4) != 0) {
            createAnchorInfo = poiEditInfo.createAnchorInfo;
        }
        return poiEditInfo.copy(i, str, createAnchorInfo);
    }

    public final PoiEditInfo copy(int i, String poiId, CreateAnchorInfo createAnchorInfo) {
        o.LJIIIZ(poiId, "poiId");
        return new PoiEditInfo(i, poiId, createAnchorInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiEditInfo)) {
            return false;
        }
        PoiEditInfo poiEditInfo = (PoiEditInfo) obj;
        return this.editAction == poiEditInfo.editAction && o.LJ(this.poiId, poiEditInfo.poiId) && o.LJ(this.createAnchorInfo, poiEditInfo.createAnchorInfo);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PoiEditInfo(editAction=");
        LIZ.append(this.editAction);
        LIZ.append(", poiId=");
        LIZ.append(this.poiId);
        LIZ.append(", createAnchorInfo=");
        LIZ.append(this.createAnchorInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.poiId, this.editAction * 31, 31);
        CreateAnchorInfo createAnchorInfo = this.createAnchorInfo;
        if (createAnchorInfo == null) {
            hashCode = 0;
        } else {
            hashCode = createAnchorInfo.hashCode();
        }
        return LJ + hashCode;
    }

    public final CreateAnchorInfo getCreateAnchorInfo() {
        return this.createAnchorInfo;
    }

    public final int getEditAction() {
        return this.editAction;
    }

    public final String getPoiId() {
        return this.poiId;
    }

    public PoiEditInfo(int i, String poiId, CreateAnchorInfo createAnchorInfo) {
        o.LJIIIZ(poiId, "poiId");
        this.editAction = i;
        this.poiId = poiId;
        this.createAnchorInfo = createAnchorInfo;
    }
}

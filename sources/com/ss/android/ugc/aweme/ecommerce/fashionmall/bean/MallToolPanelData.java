package com.ss.android.ugc.aweme.ecommerce.fashionmall.bean;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MallToolPanelData extends BaseResponse {

    @InterfaceC65349Pkn("block_list")
    public List<CommonBlock> blockList;

    @InterfaceC65349Pkn("style")
    public String style;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MallToolPanelData copy$default(MallToolPanelData mallToolPanelData, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mallToolPanelData.style;
        }
        if ((i & 2) != 0) {
            list = mallToolPanelData.blockList;
        }
        return mallToolPanelData.copy(str, list);
    }

    public final MallToolPanelData copy(String str, List<CommonBlock> list) {
        return new MallToolPanelData(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MallToolPanelData)) {
            return false;
        }
        MallToolPanelData mallToolPanelData = (MallToolPanelData) obj;
        return o.LJ(this.style, mallToolPanelData.style) && o.LJ(this.blockList, mallToolPanelData.blockList);
    }

    public int hashCode() {
        String str = this.style;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<CommonBlock> list = this.blockList;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MallToolPanelData(style=");
        LIZ.append(this.style);
        LIZ.append(", blockList=");
        return C1NE.LIZIZ(LIZ, this.blockList, ')', LIZ);
    }

    public final List<CommonBlock> getBlockList() {
        return this.blockList;
    }

    public final String getStyle() {
        return this.style;
    }

    public final void setBlockList(List<CommonBlock> list) {
        this.blockList = list;
    }

    public final void setStyle(String str) {
        this.style = str;
    }

    public MallToolPanelData(String str, List<CommonBlock> list) {
        this.style = str;
        this.blockList = list;
    }

    public /* synthetic */ MallToolPanelData(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, list);
    }
}

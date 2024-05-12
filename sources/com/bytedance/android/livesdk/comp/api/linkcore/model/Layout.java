package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C113554cx;
import X.C12400eC;
import X.C169696lJ;
import X.C5UN;
import X.C61878OQg;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.ORZ;
import X.OSZ;
import X.UC7;
import X.X1D;
import android.graphics.RectF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class Layout {

    @InterfaceC65349Pkn("anchorZoomLayoutId")
    public String anchorZoomLayoutId;
    public String businessType;

    @InterfaceC65349Pkn("divideDataForAndroid")
    public Map<String, ? extends List<? extends RectF>> divideData;
    public final boolean isNormalType;

    @InterfaceC65349Pkn("overlay")
    public final Integer isOverlay;

    @InterfaceC65349Pkn("layoutData")
    public Map<String, ? extends Map<String, LayoutArray>> layoutData;

    @InterfaceC65349Pkn("layoutId")
    public String layoutId;

    @InterfaceC65349Pkn("micCount")
    public int micCount;

    @InterfaceC65349Pkn("resolution")
    public Map<String, Resolution> resolutionMap;
    public int scene;

    @InterfaceC65349Pkn("type")
    public String type;
    public int version;

    @InterfaceC65349Pkn("view_for_audience")
    public Insets viewForAudience;

    @InterfaceC65349Pkn("view_for_canvas")
    public Insets viewForCanvas;

    @InterfaceC65349Pkn("view_for_link")
    public Insets viewForLink;

    @InterfaceC65349Pkn("view_for_pad")
    public Insets viewForPad;

    @InterfaceC65349Pkn("view_for_search")
    public final Insets viewForSearch;

    @InterfaceC65349Pkn("zoomLayoutId")
    public String zoomLayoutId;

    public static /* synthetic */ Layout copy$default(Layout layout, int i, String str, String str2, String str3, String str4, Insets insets, Insets insets2, Insets insets3, Insets insets4, Insets insets5, Map map, Map map2, Map map3, int i2, int i3, boolean z, String str5, Integer num, int i4, Object obj) {
        String str6 = str3;
        String str7 = str2;
        int i5 = i;
        String str8 = str;
        Insets insets6 = insets4;
        Insets insets7 = insets3;
        Insets insets8 = insets2;
        String str9 = str4;
        Insets insets9 = insets;
        int i6 = i2;
        Map map4 = map3;
        Map map5 = map2;
        Insets insets10 = insets5;
        Map map6 = map;
        Integer num2 = num;
        String str10 = str5;
        int i7 = i3;
        boolean z2 = z;
        if ((i4 & 1) != 0) {
            i5 = layout.micCount;
        }
        if ((i4 & 2) != 0) {
            str8 = layout.type;
        }
        if ((i4 & 4) != 0) {
            str7 = layout.layoutId;
        }
        if ((i4 & 8) != 0) {
            str6 = layout.zoomLayoutId;
        }
        if ((i4 & 16) != 0) {
            str9 = layout.anchorZoomLayoutId;
        }
        if ((i4 & 32) != 0) {
            insets9 = layout.viewForLink;
        }
        if ((i4 & 64) != 0) {
            insets8 = layout.viewForCanvas;
        }
        if ((i4 & 128) != 0) {
            insets7 = layout.viewForAudience;
        }
        if ((i4 & 256) != 0) {
            insets6 = layout.viewForPad;
        }
        if ((i4 & 512) != 0) {
            insets10 = layout.viewForSearch;
        }
        if ((i4 & 1024) != 0) {
            map6 = layout.layoutData;
        }
        if ((i4 & 2048) != 0) {
            map5 = layout.divideData;
        }
        if ((i4 & 4096) != 0) {
            map4 = layout.resolutionMap;
        }
        if ((i4 & FileUtils.BUFFER_SIZE) != 0) {
            i6 = layout.scene;
        }
        if ((i4 & 16384) != 0) {
            i7 = layout.version;
        }
        if ((32768 & i4) != 0) {
            z2 = layout.isNormalType;
        }
        if ((65536 & i4) != 0) {
            str10 = layout.businessType;
        }
        if ((i4 & 131072) != 0) {
            num2 = layout.isOverlay;
        }
        Insets insets11 = insets9;
        Insets insets12 = insets8;
        Insets insets13 = insets7;
        return layout.copy(i5, str8, str7, str6, str9, insets11, insets12, insets13, insets6, insets10, map6, map5, map4, i6, i7, z2, str10, num2);
    }

    public final Layout copy(int i, String type, String layoutId, String zoomLayoutId, String anchorZoomLayoutId, Insets viewForLink, Insets viewForCanvas, Insets viewForAudience, Insets viewForPad, Insets insets, Map<String, ? extends Map<String, LayoutArray>> layoutData, Map<String, ? extends List<? extends RectF>> divideData, Map<String, Resolution> resolutionMap, int i2, int i3, boolean z, String str, Integer num) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(layoutId, "layoutId");
        o.LJIIIZ(zoomLayoutId, "zoomLayoutId");
        o.LJIIIZ(anchorZoomLayoutId, "anchorZoomLayoutId");
        o.LJIIIZ(viewForLink, "viewForLink");
        o.LJIIIZ(viewForCanvas, "viewForCanvas");
        o.LJIIIZ(viewForAudience, "viewForAudience");
        o.LJIIIZ(viewForPad, "viewForPad");
        o.LJIIIZ(layoutData, "layoutData");
        o.LJIIIZ(divideData, "divideData");
        o.LJIIIZ(resolutionMap, "resolutionMap");
        return new Layout(i, type, layoutId, zoomLayoutId, anchorZoomLayoutId, viewForLink, viewForCanvas, viewForAudience, viewForPad, insets, layoutData, divideData, resolutionMap, i2, i3, z, str, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Layout)) {
            return false;
        }
        Layout layout = (Layout) obj;
        return this.micCount == layout.micCount && o.LJ(this.type, layout.type) && o.LJ(this.layoutId, layout.layoutId) && o.LJ(this.zoomLayoutId, layout.zoomLayoutId) && o.LJ(this.anchorZoomLayoutId, layout.anchorZoomLayoutId) && o.LJ(this.viewForLink, layout.viewForLink) && o.LJ(this.viewForCanvas, layout.viewForCanvas) && o.LJ(this.viewForAudience, layout.viewForAudience) && o.LJ(this.viewForPad, layout.viewForPad) && o.LJ(this.viewForSearch, layout.viewForSearch) && o.LJ(this.layoutData, layout.layoutData) && o.LJ(this.divideData, layout.divideData) && o.LJ(this.resolutionMap, layout.resolutionMap) && this.scene == layout.scene && this.version == layout.version && this.isNormalType == layout.isNormalType && o.LJ(this.businessType, layout.businessType) && o.LJ(this.isOverlay, layout.isOverlay);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.viewForPad.hashCode() + ((this.viewForAudience.hashCode() + ((this.viewForCanvas.hashCode() + ((this.viewForLink.hashCode() + C79062V1e.LJ(this.anchorZoomLayoutId, C79062V1e.LJ(this.zoomLayoutId, C79062V1e.LJ(this.layoutId, C79062V1e.LJ(this.type, this.micCount * 31, 31), 31), 31), 31)) * 31)) * 31)) * 31)) * 31;
        Insets insets = this.viewForSearch;
        int i = 0;
        if (insets == null) {
            hashCode = 0;
        } else {
            hashCode = insets.hashCode();
        }
        int LIZ = (((C12400eC.LIZ(this.resolutionMap, C12400eC.LIZ(this.divideData, C12400eC.LIZ(this.layoutData, (hashCode3 + hashCode) * 31, 31), 31), 31) + this.scene) * 31) + this.version) * 31;
        boolean z = this.isNormalType;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (LIZ + i2) * 31;
        String str = this.businessType;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        Integer num = this.isOverlay;
        if (num != null) {
            i = num.hashCode();
        }
        return i4 + i;
    }

    public final boolean isFixedType() {
        return o.LJ(this.type, "fix");
    }

    public final boolean isFloatType() {
        return o.LJ(this.type, "float");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Layout(micCount=");
        sb.append(this.micCount);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", layoutId=");
        sb.append(this.layoutId);
        sb.append(", zoomLayoutId=");
        sb.append(this.zoomLayoutId);
        sb.append(", anchorZoomLayoutId=");
        sb.append(this.anchorZoomLayoutId);
        sb.append(", viewForLink=");
        sb.append(this.viewForLink);
        sb.append(", viewForCanvas=");
        sb.append(this.viewForCanvas);
        sb.append(", viewForAudience=");
        sb.append(this.viewForAudience);
        sb.append(", viewForPad=");
        sb.append(this.viewForPad);
        sb.append(", viewForSearch=");
        sb.append(this.viewForSearch);
        sb.append(", layoutData=");
        sb.append(this.layoutData);
        sb.append(", divideData=");
        sb.append(this.divideData);
        sb.append(", resolutionMap=");
        sb.append(this.resolutionMap);
        sb.append(", scene=");
        sb.append(this.scene);
        sb.append(", version=");
        sb.append(this.version);
        sb.append(", isNormalType=");
        sb.append(this.isNormalType);
        sb.append(", businessType=");
        sb.append(this.businessType);
        sb.append(", isOverlay=");
        return UC7.LIZ(sb, this.isOverlay, ')');
    }

    public final String getAnchorZoomLayoutId() {
        return this.anchorZoomLayoutId;
    }

    public final String getBusinessType() {
        return this.businessType;
    }

    public final Map<String, List<RectF>> getDivideData() {
        return this.divideData;
    }

    public final Map<String, Map<String, LayoutArray>> getLayoutData() {
        return this.layoutData;
    }

    public final String getLayoutId() {
        return this.layoutId;
    }

    public final int getMicCount() {
        return this.micCount;
    }

    public final Map<String, Resolution> getResolutionMap() {
        return this.resolutionMap;
    }

    public final int getScene() {
        return this.scene;
    }

    public final String getType() {
        return this.type;
    }

    public final int getVersion() {
        return this.version;
    }

    public final Insets getViewForAudience() {
        return this.viewForAudience;
    }

    public final Insets getViewForCanvas() {
        return this.viewForCanvas;
    }

    public final Insets getViewForLink() {
        return this.viewForLink;
    }

    public final Insets getViewForPad() {
        return this.viewForPad;
    }

    public final Insets getViewForSearch() {
        return this.viewForSearch;
    }

    public final String getZoomLayoutId() {
        return this.zoomLayoutId;
    }

    public final boolean isNormalType() {
        return this.isNormalType;
    }

    public final Integer isOverlay() {
        return this.isOverlay;
    }

    private final LayoutArray getLayoutByFixPos(int i) {
        Map<String, LayoutArray> indexLayoutArrayMap;
        LayoutArrayList layoutMaskConfigListByOnlineMicCount = getLayoutMaskConfigListByOnlineMicCount(1);
        if (layoutMaskConfigListByOnlineMicCount != null && (indexLayoutArrayMap = layoutMaskConfigListByOnlineMicCount.getIndexLayoutArrayMap()) != null) {
            return indexLayoutArrayMap.get(String.valueOf(i));
        }
        return null;
    }

    public final boolean dslEqual(Layout layout) {
        if (layout != null && layout.scene == this.scene && layout.version == this.version && o.LJ(layout.layoutId, this.layoutId)) {
            return true;
        }
        return false;
    }

    public final LayoutArrayList getLayoutMaskConfigListByOnlineMicCount(int i) {
        if (this.layoutData.size() == 1) {
            Map map = (Map) ((OSZ) ListProtector.get(C5UN.LJJLJLI(this.layoutData), 0)).getSecond();
            List<? extends RectF> list = this.divideData.get(((OSZ) ListProtector.get(C5UN.LJJLJLI(this.layoutData), 0)).getFirst());
            if (list == null) {
                list = C61878OQg.INSTANCE;
            }
            return new LayoutArrayList(map, list);
        }
        Map<String, ? extends Map<String, LayoutArray>> map2 = this.layoutData;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('c');
        LIZ.append(i);
        Map<String, LayoutArray> map3 = map2.get(X1D.LIZIZ(LIZ));
        if (map3 != null) {
            Map<String, ? extends List<? extends RectF>> map4 = this.divideData;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append('c');
            LIZ2.append(i);
            List<? extends RectF> list2 = map4.get(X1D.LIZIZ(LIZ2));
            if (list2 == null) {
                list2 = C61878OQg.INSTANCE;
            }
            return new LayoutArrayList(map3, list2);
        }
        return null;
    }

    public final String getTargetLayoutData(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            if (this.layoutData.size() == 1) {
                return (String) ListProtector.get(ORZ.LLJI(this.layoutData.keySet()), 0);
            }
            return C169696lJ.LIZIZ('c', intValue);
        }
        return "";
    }

    public final void setAnchorZoomLayoutId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.anchorZoomLayoutId = str;
    }

    public final void setBusinessType(String str) {
        this.businessType = str;
    }

    public final void setDivideData(Map<String, ? extends List<? extends RectF>> map) {
        o.LJIIIZ(map, "<set-?>");
        this.divideData = map;
    }

    public final void setLayoutData(Map<String, ? extends Map<String, LayoutArray>> map) {
        o.LJIIIZ(map, "<set-?>");
        this.layoutData = map;
    }

    public final void setLayoutId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.layoutId = str;
    }

    public final void setMicCount(int i) {
        this.micCount = i;
    }

    public final void setResolutionMap(Map<String, Resolution> map) {
        o.LJIIIZ(map, "<set-?>");
        this.resolutionMap = map;
    }

    public final void setScene(int i) {
        this.scene = i;
    }

    public final void setType(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.type = str;
    }

    public final void setVersion(int i) {
        this.version = i;
    }

    public final void setViewForAudience(Insets insets) {
        o.LJIIIZ(insets, "<set-?>");
        this.viewForAudience = insets;
    }

    public final void setViewForCanvas(Insets insets) {
        o.LJIIIZ(insets, "<set-?>");
        this.viewForCanvas = insets;
    }

    public final void setViewForLink(Insets insets) {
        o.LJIIIZ(insets, "<set-?>");
        this.viewForLink = insets;
    }

    public final void setViewForPad(Insets insets) {
        o.LJIIIZ(insets, "<set-?>");
        this.viewForPad = insets;
    }

    public final void setZoomLayoutId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.zoomLayoutId = str;
    }

    public final LayoutArray getLayoutByPosAndSize(int i, int i2) {
        Map<String, LayoutArray> indexLayoutArrayMap;
        if (isFixedType()) {
            return getLayoutByFixPos(i + 1);
        }
        LayoutArrayList layoutMaskConfigListByOnlineMicCount = getLayoutMaskConfigListByOnlineMicCount(i2);
        if (layoutMaskConfigListByOnlineMicCount != null && (indexLayoutArrayMap = layoutMaskConfigListByOnlineMicCount.getIndexLayoutArrayMap()) != null) {
            return indexLayoutArrayMap.get(String.valueOf(i + 1));
        }
        return null;
    }

    public Layout(int i, String type, String layoutId, String zoomLayoutId, String anchorZoomLayoutId, Insets viewForLink, Insets viewForCanvas, Insets viewForAudience, Insets viewForPad, Insets insets, Map<String, ? extends Map<String, LayoutArray>> layoutData, Map<String, ? extends List<? extends RectF>> divideData, Map<String, Resolution> resolutionMap, int i2, int i3, boolean z, String str, Integer num) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(layoutId, "layoutId");
        o.LJIIIZ(zoomLayoutId, "zoomLayoutId");
        o.LJIIIZ(anchorZoomLayoutId, "anchorZoomLayoutId");
        o.LJIIIZ(viewForLink, "viewForLink");
        o.LJIIIZ(viewForCanvas, "viewForCanvas");
        o.LJIIIZ(viewForAudience, "viewForAudience");
        o.LJIIIZ(viewForPad, "viewForPad");
        o.LJIIIZ(layoutData, "layoutData");
        o.LJIIIZ(divideData, "divideData");
        o.LJIIIZ(resolutionMap, "resolutionMap");
        this.micCount = i;
        this.type = type;
        this.layoutId = layoutId;
        this.zoomLayoutId = zoomLayoutId;
        this.anchorZoomLayoutId = anchorZoomLayoutId;
        this.viewForLink = viewForLink;
        this.viewForCanvas = viewForCanvas;
        this.viewForAudience = viewForAudience;
        this.viewForPad = viewForPad;
        this.viewForSearch = insets;
        this.layoutData = layoutData;
        this.divideData = divideData;
        this.resolutionMap = resolutionMap;
        this.scene = i2;
        this.version = i3;
        this.isNormalType = z;
        this.businessType = str;
        this.isOverlay = num;
    }

    public /* synthetic */ Layout(int i, String str, String str2, String str3, String str4, Insets insets, Insets insets2, Insets insets3, Insets insets4, Insets insets5, Map map, Map map2, Map map3, int i2, int i3, boolean z, String str5, Integer num, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, str3, str4, insets, insets2, insets3, insets4, insets5, (i4 & 1024) != 0 ? C113554cx.LJJJLIIL() : map, (i4 & 2048) != 0 ? C113554cx.LJJJLIIL() : map2, (i4 & 4096) != 0 ? C113554cx.LJJJLIIL() : map3, (i4 & FileUtils.BUFFER_SIZE) != 0 ? 4 : i2, (i4 & 16384) != 0 ? 1 : i3, (32768 & i4) != 0 ? false : z, (65536 & i4) != 0 ? null : str5, (i4 & 131072) == 0 ? num : null);
    }
}

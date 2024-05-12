package com.bytedance.helios.api.config;

import X.C47261Igj;
import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class AnchorInfoModel extends F9E {

    @InterfaceC65349Pkn("anchor_lifecycles")
    public final List<String> anchorLifeCycles;

    @InterfaceC65349Pkn("anchor_pages")
    public final List<String> anchorPages;

    @InterfaceC65349Pkn("anchor_time_delay")
    public final long anchorTimeDelay;

    @InterfaceC65349Pkn("anchor_type")
    public final String anchorType;

    @InterfaceC65349Pkn("check_fragments")
    public final List<FragmentCheckModel> checkFragments;

    @InterfaceC65349Pkn("exempt_fragments")
    public final List<String> exemptFragments;

    @InterfaceC65349Pkn("max_anchor_check_count")
    public final int maxAnchorCheckCount;

    @InterfaceC65349Pkn("remove_anchor_lifecycles")
    public final List<String> removeAnchorLifecycles;

    @InterfaceC65349Pkn("resource_ids")
    public final List<String> resourceIds;

    @InterfaceC65349Pkn("resource_pages")
    public final List<String> resourcePages;

    @InterfaceC65349Pkn("skip_anchor_actions")
    public final List<String> skipAnchorActions;

    public AnchorInfoModel() {
        this(null, null, null, null, 0L, 0, null, null, null, null, null, 2047, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.anchorType, this.anchorPages, this.anchorLifeCycles, this.resourceIds, Long.valueOf(this.anchorTimeDelay), Integer.valueOf(this.maxAnchorCheckCount), this.resourcePages, this.removeAnchorLifecycles, this.skipAnchorActions, this.exemptFragments, this.checkFragments};
    }

    public AnchorInfoModel(String anchorType, List<String> anchorPages, List<String> anchorLifeCycles, List<String> resourceIds, long j, int i, List<String> resourcePages, List<String> removeAnchorLifecycles, List<String> skipAnchorActions, List<String> exemptFragments, List<FragmentCheckModel> checkFragments) {
        o.LJIIIZ(anchorType, "anchorType");
        o.LJIIIZ(anchorPages, "anchorPages");
        o.LJIIIZ(anchorLifeCycles, "anchorLifeCycles");
        o.LJIIIZ(resourceIds, "resourceIds");
        o.LJIIIZ(resourcePages, "resourcePages");
        o.LJIIIZ(removeAnchorLifecycles, "removeAnchorLifecycles");
        o.LJIIIZ(skipAnchorActions, "skipAnchorActions");
        o.LJIIIZ(exemptFragments, "exemptFragments");
        o.LJIIIZ(checkFragments, "checkFragments");
        this.anchorType = anchorType;
        this.anchorPages = anchorPages;
        this.anchorLifeCycles = anchorLifeCycles;
        this.resourceIds = resourceIds;
        this.anchorTimeDelay = j;
        this.maxAnchorCheckCount = i;
        this.resourcePages = resourcePages;
        this.removeAnchorLifecycles = removeAnchorLifecycles;
        this.skipAnchorActions = skipAnchorActions;
        this.exemptFragments = exemptFragments;
        this.checkFragments = checkFragments;
    }

    public AnchorInfoModel(String str, List list, List list2, List list3, long j, int i, List list4, List list5, List list6, List list7, List list8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "multiple_page" : str, (i2 & 2) != 0 ? C61878OQg.INSTANCE : list, (i2 & 4) != 0 ? C47261Igj.LJJIJ("onActivityStop") : list2, (i2 & 8) != 0 ? C47261Igj.LJJIJIIJI("cr", "ar", "nar") : list3, (i2 & 16) != 0 ? 3000L : j, (i2 & 32) != 0 ? 3 : i, (i2 & 64) != 0 ? C61878OQg.INSTANCE : list4, (i2 & 128) != 0 ? C47261Igj.LJJIJIIJI("onActivityStart", "onActivityResume") : list5, (i2 & 256) != 0 ? C61878OQg.INSTANCE : list6, (i2 & 512) != 0 ? C61878OQg.INSTANCE : list7, (i2 & 1024) != 0 ? C61878OQg.INSTANCE : list8);
    }
}

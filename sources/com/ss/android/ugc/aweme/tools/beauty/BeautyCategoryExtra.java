package com.ss.android.ugc.aweme.tools.beauty;

import X.F9E;
import X.ILU;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class BeautyCategoryExtra extends F9E {

    @InterfaceC65349Pkn("ab_group")
    public final String abGroup;

    @InterfaceC65349Pkn("category_default")
    public boolean beautyModeDefault;

    @InterfaceC65349Pkn("categoryid")
    public String categoryId;

    /* renamed from: default, reason: not valid java name */
    @InterfaceC65349Pkn("default")
    public final boolean f32default;

    @InterfaceC65349Pkn("exclusive")
    public final boolean exclusive;

    @InterfaceC65349Pkn("panel_type")
    public final String panelType;

    @InterfaceC65349Pkn("parentid")
    public String parentId;

    @InterfaceC65349Pkn("Primary_panel_icon")
    public String primaryPanelIcon;

    @InterfaceC65349Pkn("primary_panel_icon_list")
    public List<String> primaryPanelIconList;

    @InterfaceC65349Pkn("Primary_panel_name")
    public String primaryPanelName;

    @InterfaceC65349Pkn("region_3")
    public final boolean regionM;

    @InterfaceC65349Pkn("region_2")
    public final boolean regionT;

    @InterfaceC65349Pkn("showSwitch")
    public boolean showSwitch;

    @InterfaceC65349Pkn("showTips")
    public boolean showTips;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BeautyCategoryExtra() {
        /*
            r17 = this;
            r1 = 0
            r2 = 0
            r15 = 16383(0x3fff, float:2.2957E-41)
            r0 = r17
            r3 = r2
            r4 = r2
            r5 = r1
            r6 = r2
            r7 = r2
            r8 = r2
            r9 = r1
            r10 = r1
            r11 = r1
            r12 = r1
            r13 = r1
            r14 = r2
            r16 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra.<init>():void");
    }

    public static /* synthetic */ BeautyCategoryExtra copy$default(BeautyCategoryExtra beautyCategoryExtra, String str, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5, boolean z6, String str3, String str4, String str5, List list, String str6, boolean z7, int i, Object obj) {
        String str7 = str;
        boolean z8 = z;
        boolean z9 = z2;
        boolean z10 = z3;
        String str8 = str2;
        boolean z11 = z4;
        boolean z12 = z5;
        boolean z13 = z6;
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        List list2 = list;
        String str12 = str6;
        boolean z14 = z7;
        if ((i & 1) != 0) {
            str7 = beautyCategoryExtra.abGroup;
        }
        if ((i & 2) != 0) {
            z8 = beautyCategoryExtra.regionT;
        }
        if ((i & 4) != 0) {
            z9 = beautyCategoryExtra.regionM;
        }
        if ((i & 8) != 0) {
            z10 = beautyCategoryExtra.f32default;
        }
        if ((i & 16) != 0) {
            str8 = beautyCategoryExtra.panelType;
        }
        if ((i & 32) != 0) {
            z11 = beautyCategoryExtra.exclusive;
        }
        if ((i & 64) != 0) {
            z12 = beautyCategoryExtra.showTips;
        }
        if ((i & 128) != 0) {
            z13 = beautyCategoryExtra.showSwitch;
        }
        if ((i & 256) != 0) {
            str9 = beautyCategoryExtra.categoryId;
        }
        if ((i & 512) != 0) {
            str10 = beautyCategoryExtra.parentId;
        }
        if ((i & 1024) != 0) {
            str11 = beautyCategoryExtra.primaryPanelIcon;
        }
        if ((i & 2048) != 0) {
            list2 = beautyCategoryExtra.primaryPanelIconList;
        }
        if ((i & 4096) != 0) {
            str12 = beautyCategoryExtra.primaryPanelName;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            z14 = beautyCategoryExtra.beautyModeDefault;
        }
        return beautyCategoryExtra.copy(str7, z8, z9, z10, str8, z11, z12, z13, str9, str10, str11, list2, str12, z14);
    }

    public final BeautyCategoryExtra copy(String abGroup, boolean z, boolean z2, boolean z3, String panelType, boolean z4, boolean z5, boolean z6, String categoryId, String parentId, String primaryPanelIcon, List<String> primaryPanelIconList, String primaryPanelName, boolean z7) {
        o.LJIIIZ(abGroup, "abGroup");
        o.LJIIIZ(panelType, "panelType");
        o.LJIIIZ(categoryId, "categoryId");
        o.LJIIIZ(parentId, "parentId");
        o.LJIIIZ(primaryPanelIcon, "primaryPanelIcon");
        o.LJIIIZ(primaryPanelIconList, "primaryPanelIconList");
        o.LJIIIZ(primaryPanelName, "primaryPanelName");
        return new BeautyCategoryExtra(abGroup, z, z2, z3, panelType, z4, z5, z6, categoryId, parentId, primaryPanelIcon, primaryPanelIconList, primaryPanelName, z7);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.abGroup, Boolean.valueOf(this.regionT), Boolean.valueOf(this.regionM), Boolean.valueOf(this.f32default), this.panelType, Boolean.valueOf(this.exclusive), Boolean.valueOf(this.showTips), Boolean.valueOf(this.showSwitch), this.categoryId, this.parentId, this.primaryPanelIcon, this.primaryPanelIconList, this.primaryPanelName, Boolean.valueOf(this.beautyModeDefault)};
    }

    public final String getAbGroup() {
        return this.abGroup;
    }

    public final boolean getBeautyModeDefault() {
        return this.beautyModeDefault;
    }

    public final String getCategoryId() {
        return this.categoryId;
    }

    public final boolean getDefault() {
        return this.f32default;
    }

    public final boolean getExclusive() {
        return this.exclusive;
    }

    public final String getPanelType() {
        return this.panelType;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final String getPrimaryPanelIcon() {
        return this.primaryPanelIcon;
    }

    public final List<String> getPrimaryPanelIconList() {
        return this.primaryPanelIconList;
    }

    public final String getPrimaryPanelName() {
        return this.primaryPanelName;
    }

    public final boolean getRegionM() {
        return this.regionM;
    }

    public final boolean getRegionT() {
        return this.regionT;
    }

    public final boolean getShowSwitch() {
        return this.showSwitch;
    }

    public final boolean getShowTips() {
        return this.showTips;
    }

    public final void setBeautyModeDefault(boolean z) {
        this.beautyModeDefault = z;
    }

    public final void setCategoryId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.categoryId = str;
    }

    public final void setParentId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.parentId = str;
    }

    public final void setPrimaryPanelIcon(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.primaryPanelIcon = str;
    }

    public final void setPrimaryPanelIconList(List<String> list) {
        o.LJIIIZ(list, "<set-?>");
        this.primaryPanelIconList = list;
    }

    public final void setPrimaryPanelName(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.primaryPanelName = str;
    }

    public final void setShowSwitch(boolean z) {
        this.showSwitch = z;
    }

    public final void setShowTips(boolean z) {
        this.showTips = z;
    }

    public BeautyCategoryExtra(String abGroup, boolean z, boolean z2, boolean z3, String panelType, boolean z4, boolean z5, boolean z6, String categoryId, String parentId, String primaryPanelIcon, List<String> primaryPanelIconList, String primaryPanelName, boolean z7) {
        o.LJIIIZ(abGroup, "abGroup");
        o.LJIIIZ(panelType, "panelType");
        o.LJIIIZ(categoryId, "categoryId");
        o.LJIIIZ(parentId, "parentId");
        o.LJIIIZ(primaryPanelIcon, "primaryPanelIcon");
        o.LJIIIZ(primaryPanelIconList, "primaryPanelIconList");
        o.LJIIIZ(primaryPanelName, "primaryPanelName");
        this.abGroup = abGroup;
        this.regionT = z;
        this.regionM = z2;
        this.f32default = z3;
        this.panelType = panelType;
        this.exclusive = z4;
        this.showTips = z5;
        this.showSwitch = z6;
        this.categoryId = categoryId;
        this.parentId = parentId;
        this.primaryPanelIcon = primaryPanelIcon;
        this.primaryPanelIconList = primaryPanelIconList;
        this.primaryPanelName = primaryPanelName;
        this.beautyModeDefault = z7;
    }

    public /* synthetic */ BeautyCategoryExtra(String str, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5, boolean z6, String str3, String str4, String str5, List list, String str6, boolean z7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "1" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? ILU.MALE.getFlag() : str2, (i & 32) != 0 ? false : z4, (i & 64) != 0 ? false : z5, (i & 128) != 0 ? false : z6, (i & 256) != 0 ? "" : str3, (i & 512) != 0 ? "" : str4, (i & 1024) != 0 ? "" : str5, (i & 2048) != 0 ? new ArrayList() : list, (i & 4096) == 0 ? str6 : "", (i & FileUtils.BUFFER_SIZE) == 0 ? z7 : false);
    }
}

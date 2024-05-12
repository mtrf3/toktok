package com.ss.android.ugc.aweme.ml.infra;

import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes9.dex */
public class FeatureTypeConfig {

    @InterfaceC65349Pkn("enable")
    public boolean enable;

    @InterfaceC65349Pkn("range")
    public int range;

    @InterfaceC65349Pkn("exclude_this")
    public boolean rangeExcludeThis;

    @InterfaceC65349Pkn("sub_type")
    public String subType = "all";
    public List<String> subTypeList;

    public final List<String> getSubTypeList() {
        if (this.subTypeList == null) {
            this.subTypeList = s.LJLJJL(this.subType, new String[]{"|"}, 0, 6);
        }
        return this.subTypeList;
    }

    public String toString() {
        return super.toString();
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final int getRange() {
        return this.range;
    }

    public final boolean getRangeExcludeThis() {
        return this.rangeExcludeThis;
    }

    public final String getSubType() {
        return this.subType;
    }

    public final boolean containSubType(String type) {
        o.LJIIIZ(type, "type");
        return containSubType(type, false);
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setRange(int i) {
        this.range = i;
    }

    public final void setRangeExcludeThis(boolean z) {
        this.rangeExcludeThis = z;
    }

    public final void setSubType(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.subType = str;
    }

    public final boolean containSubType(String type, boolean z) {
        List<String> subTypeList;
        o.LJIIIZ(type, "type");
        if (TextUtils.isEmpty(this.subType) || (subTypeList = getSubTypeList()) == null) {
            return false;
        }
        if ((z || !subTypeList.contains("all")) && !subTypeList.contains(type)) {
            return false;
        }
        return true;
    }
}

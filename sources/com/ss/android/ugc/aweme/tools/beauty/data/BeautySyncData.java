package com.ss.android.ugc.aweme.tools.beauty.data;

import X.F9E;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class BeautySyncData extends F9E {
    public String categoryId;
    public String effectId;
    public String parentId;
    public String resourceId;

    public static /* synthetic */ BeautySyncData copy$default(BeautySyncData beautySyncData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = beautySyncData.effectId;
        }
        if ((i & 2) != 0) {
            str2 = beautySyncData.resourceId;
        }
        if ((i & 4) != 0) {
            str3 = beautySyncData.categoryId;
        }
        if ((i & 8) != 0) {
            str4 = beautySyncData.parentId;
        }
        return beautySyncData.copy(str, str2, str3, str4);
    }

    public final BeautySyncData copy(String effectId, String resourceId, String str, String str2) {
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(resourceId, "resourceId");
        return new BeautySyncData(effectId, resourceId, str, str2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.effectId, this.resourceId, this.categoryId, this.parentId};
    }

    public final String getCategoryId() {
        return this.categoryId;
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final String getResourceId() {
        return this.resourceId;
    }

    public final void setCategoryId(String str) {
        this.categoryId = str;
    }

    public final void setEffectId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.effectId = str;
    }

    public final void setParentId(String str) {
        this.parentId = str;
    }

    public final void setResourceId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.resourceId = str;
    }

    public BeautySyncData(String effectId, String resourceId, String str, String str2) {
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(resourceId, "resourceId");
        this.effectId = effectId;
        this.resourceId = resourceId;
        this.categoryId = str;
        this.parentId = str2;
    }
}

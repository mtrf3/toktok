package com.ss.android.ugc.aweme.tools.beauty;

import X.C82916WgS;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class BeautyCategory {
    public final BeautyCategoryExtra beautyCategoryExtra;
    public final List<ComposerBeauty> beautyList;
    public final EffectCategoryResponse categoryResponse;
    public boolean selected;

    public int hashCode() {
        Integer num;
        String id = this.categoryResponse.getId();
        if (id != null) {
            num = Integer.valueOf(id.hashCode());
        } else {
            num = null;
        }
        return num.intValue();
    }

    public final BeautyCategoryExtra getBeautyCategoryExtra() {
        return this.beautyCategoryExtra;
    }

    public final List<ComposerBeauty> getBeautyList() {
        return this.beautyList;
    }

    public final EffectCategoryResponse getCategoryResponse() {
        return this.categoryResponse;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BeautyCategory)) {
            return false;
        }
        if (C82916WgS.LJLILLLLZI.LIZ()) {
            BeautyCategory beautyCategory = (BeautyCategory) obj;
            if (o.LJ(beautyCategory.categoryResponse.getId(), this.categoryResponse.getId()) && o.LJ(beautyCategory.beautyList, this.beautyList)) {
                return true;
            }
            return false;
        }
        return o.LJ(((BeautyCategory) obj).categoryResponse.getId(), this.categoryResponse.getId());
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public BeautyCategory(EffectCategoryResponse categoryResponse, BeautyCategoryExtra beautyCategoryExtra, List<ComposerBeauty> beautyList, boolean z) {
        o.LJIIIZ(categoryResponse, "categoryResponse");
        o.LJIIIZ(beautyCategoryExtra, "beautyCategoryExtra");
        o.LJIIIZ(beautyList, "beautyList");
        this.categoryResponse = categoryResponse;
        this.beautyCategoryExtra = beautyCategoryExtra;
        this.beautyList = beautyList;
        this.selected = z;
    }

    public /* synthetic */ BeautyCategory(EffectCategoryResponse effectCategoryResponse, BeautyCategoryExtra beautyCategoryExtra, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(effectCategoryResponse, beautyCategoryExtra, list, (i & 8) != 0 ? false : z);
    }
}

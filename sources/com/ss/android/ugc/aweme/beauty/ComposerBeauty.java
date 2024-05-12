package com.ss.android.ugc.aweme.beauty;

import X.InterfaceC65784Pro;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class ComposerBeauty {
    public boolean add2Nodes;
    public final ComposerBeautyExtraBeautify beautifyExtra;
    public final boolean categoryExclusive;
    public final BeautyCategoryExtra categoryExtra;
    public final String categoryId;
    public final List<ComposerBeauty> childList;
    public int defaultProgress;
    public int downloadStateInternal;
    public InterfaceC65784Pro<Integer> downloadStateLazy;
    public final Effect effect;
    public boolean enable;
    public final ComposerBeautyExtra extra;
    public final boolean isBeautyMode;
    public final boolean isCollectionType;
    public boolean isLocalItem;
    public int localIconResId;
    public final String parentId;
    public final String parentName;
    public final String parentResId;
    public int progressValue;
    public int secondProgressValue;
    public boolean selected;
    public boolean showDot;
    public boolean showRedDot;

    public final int getDownloadState() {
        Integer invoke;
        int i = 1;
        if (this.downloadStateInternal == 1) {
            InterfaceC65784Pro<Integer> interfaceC65784Pro = this.downloadStateLazy;
            if (interfaceC65784Pro != null && (invoke = interfaceC65784Pro.invoke()) != null) {
                i = invoke.intValue();
            }
            this.downloadStateInternal = i;
            this.downloadStateLazy = null;
        }
        return this.downloadStateInternal;
    }

    public int hashCode() {
        return this.effect.getEffectId().hashCode();
    }

    public final boolean needFaceDetect() {
        Iterator<String> it = this.effect.getRequirements().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (o.LJ(next, "faceDetect")) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean getAdd2Nodes() {
        return this.add2Nodes;
    }

    public final ComposerBeautyExtraBeautify getBeautifyExtra() {
        return this.beautifyExtra;
    }

    public final boolean getCategoryExclusive() {
        return this.categoryExclusive;
    }

    public final BeautyCategoryExtra getCategoryExtra() {
        return this.categoryExtra;
    }

    public final String getCategoryId() {
        return this.categoryId;
    }

    public final List<ComposerBeauty> getChildList() {
        return this.childList;
    }

    public final int getDefaultProgress() {
        return this.defaultProgress;
    }

    public final InterfaceC65784Pro<Integer> getDownloadStateLazy() {
        return this.downloadStateLazy;
    }

    public final Effect getEffect() {
        return this.effect;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final ComposerBeautyExtra getExtra() {
        return this.extra;
    }

    public final int getLocalIconResId() {
        return this.localIconResId;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final String getParentName() {
        return this.parentName;
    }

    public final String getParentResId() {
        return this.parentResId;
    }

    public final int getProgressValue() {
        return this.progressValue;
    }

    public final int getSecondProgressValue() {
        return this.secondProgressValue;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final boolean getShowDot() {
        return this.showDot;
    }

    public final boolean getShowRedDot() {
        return this.showRedDot;
    }

    public final boolean isBeautyMode() {
        return this.isBeautyMode;
    }

    public final boolean isCollectionType() {
        return this.isCollectionType;
    }

    public final boolean isLocalItem() {
        return this.isLocalItem;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposerBeauty)) {
            return false;
        }
        boolean z = this.isBeautyMode;
        if (z) {
            ComposerBeauty composerBeauty = (ComposerBeauty) obj;
            if (z != composerBeauty.isBeautyMode) {
                return false;
            }
            return o.LJ(composerBeauty.categoryExtra.getCategoryId(), this.categoryExtra.getCategoryId());
        }
        ComposerBeauty composerBeauty2 = (ComposerBeauty) obj;
        if (o.LJ(composerBeauty2.effect.getEffectId(), this.effect.getEffectId()) && o.LJ(this.categoryId, composerBeauty2.categoryId) && o.LJ(this.parentId, composerBeauty2.parentId)) {
            return true;
        }
        return false;
    }

    public final void setAdd2Nodes(boolean z) {
        this.add2Nodes = z;
    }

    public final void setDefaultProgress(int i) {
        this.defaultProgress = i;
    }

    public final void setDownloadState(int i) {
        this.downloadStateLazy = null;
        this.downloadStateInternal = i;
    }

    public final void setDownloadStateLazy(InterfaceC65784Pro<Integer> interfaceC65784Pro) {
        this.downloadStateLazy = interfaceC65784Pro;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setLocalIconResId(int i) {
        this.localIconResId = i;
    }

    public final void setLocalItem(boolean z) {
        this.isLocalItem = z;
    }

    public final void setProgressValue(int i) {
        this.progressValue = i;
    }

    public final void setSecondProgressValue(int i) {
        this.secondProgressValue = i;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public final void setShowDot(boolean z) {
        this.showDot = z;
    }

    public final void setShowRedDot(boolean z) {
        this.showRedDot = z;
    }

    public ComposerBeauty(Effect effect, ComposerBeautyExtra extra, ComposerBeautyExtraBeautify beautifyExtra, String categoryId, boolean z, boolean z2, String str, String str2, String str3, List<ComposerBeauty> list, boolean z3, boolean z4, boolean z5, int i, int i2, boolean z6, boolean z7, boolean z8, int i3, int i4, int i5, BeautyCategoryExtra categoryExtra, boolean z9) {
        o.LJIIIZ(effect, "effect");
        o.LJIIIZ(extra, "extra");
        o.LJIIIZ(beautifyExtra, "beautifyExtra");
        o.LJIIIZ(categoryId, "categoryId");
        o.LJIIIZ(categoryExtra, "categoryExtra");
        this.effect = effect;
        this.extra = extra;
        this.beautifyExtra = beautifyExtra;
        this.categoryId = categoryId;
        this.categoryExclusive = z;
        this.isCollectionType = z2;
        this.parentId = str;
        this.parentName = str2;
        this.parentResId = str3;
        this.childList = list;
        this.selected = z3;
        this.showRedDot = z4;
        this.showDot = z5;
        this.progressValue = i;
        this.secondProgressValue = i2;
        this.enable = z6;
        this.add2Nodes = z7;
        this.isLocalItem = z8;
        this.localIconResId = i3;
        this.defaultProgress = i4;
        this.downloadStateInternal = i5;
        this.categoryExtra = categoryExtra;
        this.isBeautyMode = z9;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ComposerBeauty(com.ss.android.ugc.effectmanager.effect.model.Effect r42, com.ss.android.ugc.aweme.beauty.ComposerBeautyExtra r43, com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify r44, java.lang.String r45, boolean r46, boolean r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.util.List r51, boolean r52, boolean r53, boolean r54, int r55, int r56, boolean r57, boolean r58, boolean r59, int r60, int r61, int r62, com.ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra r63, boolean r64, int r65, kotlin.jvm.internal.DefaultConstructorMarker r66) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.beauty.ComposerBeauty.<init>(com.ss.android.ugc.effectmanager.effect.model.Effect, com.ss.android.ugc.aweme.beauty.ComposerBeautyExtra, com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean, boolean, boolean, int, int, boolean, boolean, boolean, int, int, int, com.ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

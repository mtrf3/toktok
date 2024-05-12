package com.ss.android.ugc.aweme.tools.beauty.service;

import X.C76800UCe;
import X.C83137Wk1;
import X.C83138Wk2;
import X.F9E;
import X.ILU;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.ss.android.ugc.aweme.tools.beauty.data.NoneComposer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class BeautyFilterConfig extends F9E {
    public static final C83137Wk1 Companion = new C83137Wk1();
    public final int abGroup;
    public boolean autoApplyBeauty;
    public boolean beautyDownloadToThread;
    public boolean beautyEffectOptimize;
    public boolean beautyMainSwitchConfig;
    public boolean beautyMobAddConfig;
    public int beautyOptimizeEffectChange;
    public boolean beautySwitchStatus;
    public C83138Wk2 dataConfig;
    public ILU defaultGender;
    public String extraJson;
    public InterfaceC88472Yns<? super ComposerBeautyExtraBeautify, C76800UCe> getChildrenInitBeautyValueVBlock;
    public final boolean hasTitle;
    public boolean isConvertKey;
    public int itemShape;
    public NoneComposer noneItem;
    public boolean primaryBeautyPanelEnable;
    public final String sequenceKey;
    public boolean uLike2ComposerTagValueConvert;
    public InterfaceC88472Yns<? super InterfaceC65784Pro<C76800UCe>, Boolean> updateComposerNodesInterceptor;
    public boolean useResetAll;

    public static /* synthetic */ BeautyFilterConfig copy$default(BeautyFilterConfig beautyFilterConfig, int i, String str, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = beautyFilterConfig.abGroup;
        }
        if ((i2 & 2) != 0) {
            str = beautyFilterConfig.sequenceKey;
        }
        if ((i2 & 4) != 0) {
            z = beautyFilterConfig.hasTitle;
        }
        return beautyFilterConfig.copy(i, str, z);
    }

    public static /* synthetic */ void getItemShape$annotations() {
    }

    public static /* synthetic */ void getUseResetAll$annotations() {
    }

    public final BeautyFilterConfig copy(int i, String sequenceKey, boolean z) {
        o.LJIIIZ(sequenceKey, "sequenceKey");
        return new BeautyFilterConfig(i, sequenceKey, z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.abGroup), this.sequenceKey, Boolean.valueOf(this.hasTitle)};
    }

    public final int getAbGroup() {
        return this.abGroup;
    }

    public final boolean getAutoApplyBeauty() {
        return this.autoApplyBeauty;
    }

    public final boolean getBeautyDownloadToThread() {
        return this.beautyDownloadToThread;
    }

    public final boolean getBeautyEffectOptimize() {
        return this.beautyEffectOptimize;
    }

    public final boolean getBeautyMainSwitchConfig() {
        return this.beautyMainSwitchConfig;
    }

    public final boolean getBeautyMobAddConfig() {
        return this.beautyMobAddConfig;
    }

    public final int getBeautyOptimizeEffectChange() {
        return this.beautyOptimizeEffectChange;
    }

    public final boolean getBeautySwitchStatus() {
        return this.beautySwitchStatus;
    }

    public final C83138Wk2 getDataConfig() {
        return this.dataConfig;
    }

    public final ILU getDefaultGender() {
        return this.defaultGender;
    }

    public final String getExtraJson() {
        return this.extraJson;
    }

    public final InterfaceC88472Yns<ComposerBeautyExtraBeautify, C76800UCe> getGetChildrenInitBeautyValueVBlock() {
        return this.getChildrenInitBeautyValueVBlock;
    }

    public final boolean getHasTitle() {
        return this.hasTitle;
    }

    public final int getItemShape() {
        return this.itemShape;
    }

    public final NoneComposer getNoneItem() {
        return this.noneItem;
    }

    public final boolean getPrimaryBeautyPanelEnable() {
        return this.primaryBeautyPanelEnable;
    }

    public final String getSequenceKey() {
        return this.sequenceKey;
    }

    public final boolean getULike2ComposerTagValueConvert() {
        return this.uLike2ComposerTagValueConvert;
    }

    public final InterfaceC88472Yns<InterfaceC65784Pro<C76800UCe>, Boolean> getUpdateComposerNodesInterceptor() {
        return this.updateComposerNodesInterceptor;
    }

    public final boolean getUseResetAll() {
        return this.useResetAll;
    }

    public final boolean isConvertKey() {
        return this.isConvertKey;
    }

    public final void setAutoApplyBeauty(boolean z) {
        this.autoApplyBeauty = z;
    }

    public final void setBeautyDownloadToThread(boolean z) {
        this.beautyDownloadToThread = z;
    }

    public final void setBeautyEffectOptimize(boolean z) {
        this.beautyEffectOptimize = z;
    }

    public final void setBeautyMainSwitchConfig(boolean z) {
        this.beautyMainSwitchConfig = z;
    }

    public final void setBeautyMobAddConfig(boolean z) {
        this.beautyMobAddConfig = z;
    }

    public final void setBeautyOptimizeEffectChange(int i) {
        this.beautyOptimizeEffectChange = i;
    }

    public final void setBeautySwitchStatus(boolean z) {
        this.beautySwitchStatus = z;
    }

    public final void setConvertKey(boolean z) {
        this.isConvertKey = z;
    }

    public final void setDataConfig(C83138Wk2 c83138Wk2) {
        o.LJIIIZ(c83138Wk2, "<set-?>");
        this.dataConfig = c83138Wk2;
    }

    public final void setDefaultGender(ILU ilu) {
        o.LJIIIZ(ilu, "<set-?>");
        this.defaultGender = ilu;
    }

    public final void setExtraJson(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.extraJson = str;
    }

    public final void setGetChildrenInitBeautyValueVBlock(InterfaceC88472Yns<? super ComposerBeautyExtraBeautify, C76800UCe> interfaceC88472Yns) {
        this.getChildrenInitBeautyValueVBlock = interfaceC88472Yns;
    }

    public final void setItemShape(int i) {
        this.itemShape = i;
    }

    public final void setNoneItem(NoneComposer noneComposer) {
        this.noneItem = noneComposer;
    }

    public final void setPrimaryBeautyPanelEnable(boolean z) {
        this.primaryBeautyPanelEnable = z;
    }

    public final void setULike2ComposerTagValueConvert(boolean z) {
        this.uLike2ComposerTagValueConvert = z;
    }

    public final void setUpdateComposerNodesInterceptor(InterfaceC88472Yns<? super InterfaceC65784Pro<C76800UCe>, Boolean> interfaceC88472Yns) {
        this.updateComposerNodesInterceptor = interfaceC88472Yns;
    }

    public final void setUseResetAll(boolean z) {
        this.useResetAll = z;
    }

    public BeautyFilterConfig(int i, String sequenceKey, boolean z) {
        o.LJIIIZ(sequenceKey, "sequenceKey");
        this.abGroup = i;
        this.sequenceKey = sequenceKey;
        this.hasTitle = z;
        this.useResetAll = true;
        this.extraJson = "beautify";
        this.defaultGender = ILU.FEMALE;
        this.dataConfig = new C83138Wk2();
        this.beautySwitchStatus = true;
    }

    public /* synthetic */ BeautyFilterConfig(int i, String str, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, str, (i2 & 4) != 0 ? true : z);
    }
}

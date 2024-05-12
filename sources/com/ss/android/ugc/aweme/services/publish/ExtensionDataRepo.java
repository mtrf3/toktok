package com.ss.android.ugc.aweme.services.publish;

import X.C61878OQg;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ExtensionDataRepo extends ViewModel {
    public final MutableLiveData<Boolean> anchorExtension;
    public final MutableLiveData<Boolean> anchorState;
    public final MutableLiveData<Boolean> couponExtension;
    public List<com.ss.android.ugc.aweme.common.AnchorTransData> defaultAnchorList;
    public final MutableLiveData<Boolean> gameExtension;
    public final MutableLiveData<Boolean> goodsExtension;
    public final MutableLiveData<Boolean> goodsState;
    public final MutableLiveData<Boolean> i18nPrivacy;
    public final MutableLiveData<Boolean> i18nShopExtension;
    public final MutableLiveData<Boolean> i18nStarAtlasClosed;
    public IPermissionAction iPermissionAction;
    public final MutableLiveData<Boolean> isGoodsAdd;
    public final MutableLiveData<Boolean> mediumExtension;
    public final MutableLiveData<Boolean> microAppExtension;
    public final MutableLiveData<Boolean> movieExtension;
    public final MutableLiveData<Boolean> postExtension;
    public final MutableLiveData<Boolean> seedingExtension;
    public InterfaceC88472Yns<? super Integer, Boolean> showPermissionAction;
    public final MutableLiveData<Boolean> starAtlasState;
    public final MutableLiveData<Boolean> wikiExtension;
    public InterfaceC65784Pro<C76800UCe> resetGoodsAction = ExtensionDataRepo$resetGoodsAction$1.INSTANCE;
    public InterfaceC65784Pro<C76800UCe> resetAnchor = ExtensionDataRepo$resetAnchor$1.INSTANCE;
    public InterfaceC88472Yns<? super String, C76800UCe> restoreGoodsPublishModel = ExtensionDataRepo$restoreGoodsPublishModel$1.INSTANCE;
    public MutableLiveData<String> zipUrl = new MutableLiveData<>();
    public MutableLiveData<com.ss.android.ugc.aweme.common.AnchorTransData> updateAnchor = new MutableLiveData<>();
    public MutableLiveData<List<com.ss.android.ugc.aweme.common.AnchorTransData>> updateAnchors = new MutableLiveData<>();

    public ExtensionDataRepo() {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        Boolean bool = Boolean.FALSE;
        mutableLiveData.setValue(bool);
        this.isGoodsAdd = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        Boolean bool2 = Boolean.TRUE;
        mutableLiveData2.setValue(bool2);
        this.i18nPrivacy = mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>();
        mutableLiveData3.setValue(bool2);
        this.i18nStarAtlasClosed = mutableLiveData3;
        MutableLiveData<Boolean> mutableLiveData4 = new MutableLiveData<>();
        mutableLiveData4.setValue(bool2);
        this.starAtlasState = mutableLiveData4;
        MutableLiveData<Boolean> mutableLiveData5 = new MutableLiveData<>();
        mutableLiveData5.setValue(bool2);
        this.goodsState = mutableLiveData5;
        MutableLiveData<Boolean> mutableLiveData6 = new MutableLiveData<>();
        mutableLiveData6.setValue(bool2);
        this.anchorState = mutableLiveData6;
        MutableLiveData<Boolean> mutableLiveData7 = new MutableLiveData<>();
        mutableLiveData7.setValue(bool);
        this.movieExtension = mutableLiveData7;
        MutableLiveData<Boolean> mutableLiveData8 = new MutableLiveData<>();
        mutableLiveData8.setValue(bool);
        this.postExtension = mutableLiveData8;
        MutableLiveData<Boolean> mutableLiveData9 = new MutableLiveData<>();
        mutableLiveData9.setValue(bool);
        this.seedingExtension = mutableLiveData9;
        MutableLiveData<Boolean> mutableLiveData10 = new MutableLiveData<>();
        mutableLiveData10.setValue(bool);
        this.goodsExtension = mutableLiveData10;
        MutableLiveData<Boolean> mutableLiveData11 = new MutableLiveData<>();
        mutableLiveData11.setValue(bool);
        this.i18nShopExtension = mutableLiveData11;
        MutableLiveData<Boolean> mutableLiveData12 = new MutableLiveData<>();
        mutableLiveData12.setValue(bool);
        this.wikiExtension = mutableLiveData12;
        MutableLiveData<Boolean> mutableLiveData13 = new MutableLiveData<>();
        mutableLiveData13.setValue(bool);
        this.gameExtension = mutableLiveData13;
        MutableLiveData<Boolean> mutableLiveData14 = new MutableLiveData<>();
        mutableLiveData14.setValue(bool);
        this.anchorExtension = mutableLiveData14;
        MutableLiveData<Boolean> mutableLiveData15 = new MutableLiveData<>();
        mutableLiveData15.setValue(bool);
        this.couponExtension = mutableLiveData15;
        MutableLiveData<Boolean> mutableLiveData16 = new MutableLiveData<>();
        mutableLiveData16.setValue(bool);
        this.mediumExtension = mutableLiveData16;
        MutableLiveData<Boolean> mutableLiveData17 = new MutableLiveData<>();
        mutableLiveData17.setValue(bool);
        this.microAppExtension = mutableLiveData17;
        this.defaultAnchorList = C61878OQg.INSTANCE;
    }

    public final MutableLiveData<Boolean> getAnchorExtension() {
        return this.anchorExtension;
    }

    public final MutableLiveData<Boolean> getAnchorState() {
        return this.anchorState;
    }

    public final MutableLiveData<Boolean> getCouponExtension() {
        return this.couponExtension;
    }

    public final List<com.ss.android.ugc.aweme.common.AnchorTransData> getDefaultAnchorList() {
        return this.defaultAnchorList;
    }

    public final MutableLiveData<Boolean> getGameExtension() {
        return this.gameExtension;
    }

    public final MutableLiveData<Boolean> getGoodsExtension() {
        return this.goodsExtension;
    }

    public final MutableLiveData<Boolean> getGoodsState() {
        return this.goodsState;
    }

    public final MutableLiveData<Boolean> getI18nPrivacy() {
        return this.i18nPrivacy;
    }

    public final MutableLiveData<Boolean> getI18nShopExtension() {
        return this.i18nShopExtension;
    }

    public final MutableLiveData<Boolean> getI18nStarAtlasClosed() {
        return this.i18nStarAtlasClosed;
    }

    public final IPermissionAction getIPermissionAction() {
        return this.iPermissionAction;
    }

    public final MutableLiveData<Boolean> getMediumExtension() {
        return this.mediumExtension;
    }

    public final MutableLiveData<Boolean> getMicroAppExtension() {
        return this.microAppExtension;
    }

    public final MutableLiveData<Boolean> getMovieExtension() {
        return this.movieExtension;
    }

    public final MutableLiveData<Boolean> getPostExtension() {
        return this.postExtension;
    }

    public final InterfaceC65784Pro<C76800UCe> getResetAnchor() {
        return this.resetAnchor;
    }

    public final InterfaceC65784Pro<C76800UCe> getResetGoodsAction() {
        return this.resetGoodsAction;
    }

    public final InterfaceC88472Yns<String, C76800UCe> getRestoreGoodsPublishModel() {
        return this.restoreGoodsPublishModel;
    }

    public final MutableLiveData<Boolean> getSeedingExtension() {
        return this.seedingExtension;
    }

    public final InterfaceC88472Yns<Integer, Boolean> getShowPermissionAction() {
        return this.showPermissionAction;
    }

    public final MutableLiveData<Boolean> getStarAtlasState() {
        return this.starAtlasState;
    }

    public final MutableLiveData<com.ss.android.ugc.aweme.common.AnchorTransData> getUpdateAnchor() {
        return this.updateAnchor;
    }

    public final MutableLiveData<List<com.ss.android.ugc.aweme.common.AnchorTransData>> getUpdateAnchors() {
        return this.updateAnchors;
    }

    public final MutableLiveData<Boolean> getWikiExtension() {
        return this.wikiExtension;
    }

    public final MutableLiveData<String> getZipUrl() {
        return this.zipUrl;
    }

    public final MutableLiveData<Boolean> isGoodsAdd() {
        return this.isGoodsAdd;
    }

    public final void setDefaultAnchorList(List<com.ss.android.ugc.aweme.common.AnchorTransData> list) {
        o.LJIIIZ(list, "<set-?>");
        this.defaultAnchorList = list;
    }

    public final void setIPermissionAction(IPermissionAction iPermissionAction) {
        this.iPermissionAction = iPermissionAction;
    }

    public final void setResetAnchor(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(interfaceC65784Pro, "<set-?>");
        this.resetAnchor = interfaceC65784Pro;
    }

    public final void setResetGoodsAction(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(interfaceC65784Pro, "<set-?>");
        this.resetGoodsAction = interfaceC65784Pro;
    }

    public final void setRestoreGoodsPublishModel(InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.restoreGoodsPublishModel = interfaceC88472Yns;
    }

    public final void setShowPermissionAction(InterfaceC88472Yns<? super Integer, Boolean> interfaceC88472Yns) {
        this.showPermissionAction = interfaceC88472Yns;
    }

    public final void setUpdateAnchor(MutableLiveData<com.ss.android.ugc.aweme.common.AnchorTransData> mutableLiveData) {
        o.LJIIIZ(mutableLiveData, "<set-?>");
        this.updateAnchor = mutableLiveData;
    }

    public final void setUpdateAnchors(MutableLiveData<List<com.ss.android.ugc.aweme.common.AnchorTransData>> mutableLiveData) {
        o.LJIIIZ(mutableLiveData, "<set-?>");
        this.updateAnchors = mutableLiveData;
    }

    public final void setZipUrl(MutableLiveData<String> mutableLiveData) {
        o.LJIIIZ(mutableLiveData, "<set-?>");
        this.zipUrl = mutableLiveData;
    }
}

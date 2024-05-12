package com.bytedance.lynx.spark.schema.model;

import X.C60908NvM;
import X.EnumC39924Flg;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class SparkSchemaParam extends HybridSchemaParam {
    public boolean blockBackPress;
    public String clickTime;
    public C60908NvM containerBgColor;
    public boolean disableAutoRemoveLoading;
    public boolean disableBackPress;
    public boolean disableHardwareAccelerate;
    public boolean forbiddenAnim;
    public boolean hideError;
    public boolean hideLoading;
    public int keyboardAdjust;
    public boolean keyboardCompat;
    public C60908NvM loadingBgColor;
    public boolean showProgressBarInAllPage;
    public Integer skeletonDuration;
    public String skeletonFromAlpha;
    public String skeletonPath;
    public String skeletonToAlpha;
    public boolean skeletonWithAnimation;
    public String sparkPerfBid;
    public String sparkPerfBiz;
    public boolean subscribeNetworkLevel;
    public boolean useMutableContext;
    public boolean usePreload;
    public boolean webviewProgressBar;

    /* JADX WARN: Multi-variable type inference failed */
    public SparkSchemaParam() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public void adjustValues() {
    }

    public final boolean getBlockBackPress() {
        return this.blockBackPress;
    }

    public final String getClickTime() {
        return this.clickTime;
    }

    public final C60908NvM getContainerBgColor() {
        return this.containerBgColor;
    }

    public final boolean getDisableAutoRemoveLoading() {
        return this.disableAutoRemoveLoading;
    }

    public final boolean getDisableBackPress() {
        return this.disableBackPress;
    }

    public final boolean getDisableHardwareAccelerate() {
        return this.disableHardwareAccelerate;
    }

    public final boolean getForbiddenAnim() {
        return this.forbiddenAnim;
    }

    public final boolean getHideError() {
        return this.hideError;
    }

    public final boolean getHideLoading() {
        return this.hideLoading;
    }

    public final int getKeyboardAdjust() {
        return this.keyboardAdjust;
    }

    public final boolean getKeyboardCompat() {
        return this.keyboardCompat;
    }

    public final C60908NvM getLoadingBgColor() {
        return this.loadingBgColor;
    }

    public final boolean getShowProgressBarInAllPage() {
        return this.showProgressBarInAllPage;
    }

    public final Integer getSkeletonDuration() {
        return this.skeletonDuration;
    }

    public final String getSkeletonFromAlpha() {
        return this.skeletonFromAlpha;
    }

    public final String getSkeletonPath() {
        return this.skeletonPath;
    }

    public final String getSkeletonToAlpha() {
        return this.skeletonToAlpha;
    }

    public final boolean getSkeletonWithAnimation() {
        return this.skeletonWithAnimation;
    }

    public final String getSparkPerfBid() {
        return this.sparkPerfBid;
    }

    public final String getSparkPerfBiz() {
        return this.sparkPerfBiz;
    }

    public final boolean getSubscribeNetworkLevel() {
        return this.subscribeNetworkLevel;
    }

    public final boolean getUseMutableContext() {
        return this.useMutableContext;
    }

    public final boolean getUsePreload() {
        return this.usePreload;
    }

    public final boolean getWebviewProgressBar() {
        return this.webviewProgressBar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SparkSchemaParam(EnumC39924Flg engineType) {
        super(engineType);
        o.LJIIJ(engineType, "engineType");
        this.keyboardAdjust = 1;
    }

    public final void setBlockBackPress(boolean z) {
        this.blockBackPress = z;
    }

    public final void setClickTime(String str) {
        this.clickTime = str;
    }

    public final void setContainerBgColor(C60908NvM c60908NvM) {
        this.containerBgColor = c60908NvM;
    }

    public final void setDisableAutoRemoveLoading(boolean z) {
        this.disableAutoRemoveLoading = z;
    }

    public final void setDisableBackPress(boolean z) {
        this.disableBackPress = z;
    }

    public final void setDisableHardwareAccelerate(boolean z) {
        this.disableHardwareAccelerate = z;
    }

    public final void setForbiddenAnim(boolean z) {
        this.forbiddenAnim = z;
    }

    public final void setHideError(boolean z) {
        this.hideError = z;
    }

    public final void setHideLoading(boolean z) {
        this.hideLoading = z;
    }

    public final void setKeyboardAdjust(int i) {
        this.keyboardAdjust = i;
    }

    public final void setKeyboardCompat(boolean z) {
        this.keyboardCompat = z;
    }

    public final void setLoadingBgColor(C60908NvM c60908NvM) {
        this.loadingBgColor = c60908NvM;
    }

    public final void setShowProgressBarInAllPage(boolean z) {
        this.showProgressBarInAllPage = z;
    }

    public final void setSkeletonDuration(Integer num) {
        this.skeletonDuration = num;
    }

    public final void setSkeletonFromAlpha(String str) {
        this.skeletonFromAlpha = str;
    }

    public final void setSkeletonPath(String str) {
        this.skeletonPath = str;
    }

    public final void setSkeletonToAlpha(String str) {
        this.skeletonToAlpha = str;
    }

    public final void setSkeletonWithAnimation(boolean z) {
        this.skeletonWithAnimation = z;
    }

    public final void setSparkPerfBid(String str) {
        this.sparkPerfBid = str;
    }

    public final void setSparkPerfBiz(String str) {
        this.sparkPerfBiz = str;
    }

    public final void setSubscribeNetworkLevel(boolean z) {
        this.subscribeNetworkLevel = z;
    }

    public final void setUseMutableContext(boolean z) {
        this.useMutableContext = z;
    }

    public final void setUsePreload(boolean z) {
        this.usePreload = z;
    }

    public final void setWebviewProgressBar(boolean z) {
        this.webviewProgressBar = z;
    }

    public /* synthetic */ SparkSchemaParam(EnumC39924Flg enumC39924Flg, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EnumC39924Flg.UNKNOWN : enumC39924Flg);
    }
}

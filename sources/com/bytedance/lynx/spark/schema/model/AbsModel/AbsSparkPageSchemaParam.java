package com.bytedance.lynx.spark.schema.model.AbsModel;

import X.C04330Ez;
import X.C38262Ezy;
import X.C39836FkG;
import X.C60908NvM;
import X.EnumC39924Flg;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public abstract class AbsSparkPageSchemaParam extends SparkSchemaParam {
    public boolean disableGetResourcesCallback;
    public boolean hideNavBar;
    public boolean hideStatusBar;
    public C60908NvM navBarColor;
    public String navBtnType;
    public C60908NvM navigationBarBgColor;
    public boolean optTitle;
    public int pageDepthOfReportShow;
    public String screenOrientation;
    public String showCloseAll;
    public boolean showNavBarInTransStatusBar;
    public boolean showWebUrl;
    public C60908NvM statusBarBgColor;
    public String statusFontMode;
    public String title;
    public C60908NvM titleColor;
    public boolean transNavigationBar;
    public boolean transStatusBar;
    public boolean useWebviewTitle;

    /* JADX WARN: Multi-variable type inference failed */
    public AbsSparkPageSchemaParam() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean getDisableGetResourcesCallback() {
        return this.disableGetResourcesCallback;
    }

    public final boolean getHideNavBar() {
        return this.hideNavBar;
    }

    public final boolean getHideStatusBar() {
        return this.hideStatusBar;
    }

    public final C60908NvM getNavBarColor() {
        return this.navBarColor;
    }

    public final String getNavBtnType() {
        return this.navBtnType;
    }

    public final C60908NvM getNavigationBarBgColor() {
        return this.navigationBarBgColor;
    }

    public final boolean getOptTitle() {
        return this.optTitle;
    }

    public final int getPageDepthOfReportShow() {
        return this.pageDepthOfReportShow;
    }

    public final String getScreenOrientation() {
        return this.screenOrientation;
    }

    public final String getShowCloseAll() {
        return this.showCloseAll;
    }

    public final boolean getShowNavBarInTransStatusBar() {
        return this.showNavBarInTransStatusBar;
    }

    public final boolean getShowWebUrl() {
        return this.showWebUrl;
    }

    public final C60908NvM getStatusBarBgColor() {
        return this.statusBarBgColor;
    }

    public final String getStatusFontMode() {
        return this.statusFontMode;
    }

    public final String getTitle() {
        return this.title;
    }

    public final C60908NvM getTitleColor() {
        return this.titleColor;
    }

    public final boolean getTransNavigationBar() {
        return this.transNavigationBar;
    }

    public final boolean getTransStatusBar() {
        return this.transStatusBar;
    }

    public final boolean getUseWebviewTitle() {
        return this.useWebviewTitle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsSparkPageSchemaParam(EnumC39924Flg engineType) {
        super(engineType);
        int i;
        o.LJIIJ(engineType, "engineType");
        this.title = "";
        try {
            C39836FkG.LJII.getClass();
            i = C04330Ez.LIZIZ(C38262Ezy.LIZ().LIZIZ(), R.color.ci);
        } catch (Exception unused) {
            i = -16777216;
        }
        this.titleColor = new C60908NvM(i);
        this.showCloseAll = "";
        this.useWebviewTitle = true;
        this.screenOrientation = "portrait";
    }

    public final void setDisableGetResourcesCallback(boolean z) {
        this.disableGetResourcesCallback = z;
    }

    public final void setHideNavBar(boolean z) {
        this.hideNavBar = z;
    }

    public final void setHideStatusBar(boolean z) {
        this.hideStatusBar = z;
    }

    public final void setNavBarColor(C60908NvM c60908NvM) {
        this.navBarColor = c60908NvM;
    }

    public final void setNavBtnType(String str) {
        this.navBtnType = str;
    }

    public final void setNavigationBarBgColor(C60908NvM c60908NvM) {
        this.navigationBarBgColor = c60908NvM;
    }

    public final void setOptTitle(boolean z) {
        this.optTitle = z;
    }

    public final void setPageDepthOfReportShow(int i) {
        this.pageDepthOfReportShow = i;
    }

    public final void setScreenOrientation(String str) {
        this.screenOrientation = str;
    }

    public final void setShowCloseAll(String str) {
        o.LJIIJ(str, "<set-?>");
        this.showCloseAll = str;
    }

    public final void setShowNavBarInTransStatusBar(boolean z) {
        this.showNavBarInTransStatusBar = z;
    }

    public final void setShowWebUrl(boolean z) {
        this.showWebUrl = z;
    }

    public final void setStatusBarBgColor(C60908NvM c60908NvM) {
        this.statusBarBgColor = c60908NvM;
    }

    public final void setStatusFontMode(String str) {
        this.statusFontMode = str;
    }

    public final void setTitle(String str) {
        o.LJIIJ(str, "<set-?>");
        this.title = str;
    }

    public final void setTitleColor(C60908NvM c60908NvM) {
        o.LJIIJ(c60908NvM, "<set-?>");
        this.titleColor = c60908NvM;
    }

    public final void setTransNavigationBar(boolean z) {
        this.transNavigationBar = z;
    }

    public final void setTransStatusBar(boolean z) {
        this.transStatusBar = z;
    }

    public final void setUseWebviewTitle(boolean z) {
        this.useWebviewTitle = z;
    }

    public /* synthetic */ AbsSparkPageSchemaParam(EnumC39924Flg enumC39924Flg, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EnumC39924Flg.UNKNOWN : enumC39924Flg);
    }
}

package com.bytedance.android.livesdk.container.config.base;

import X.C31248COe;
import X.C31934Cg6;
import X.CN1;
import X.CNI;
import X.CNK;
import X.CNS;
import X.COQ;
import android.net.Uri;
import com.bytedance.android.live.browser.IContainerService;
import com.bytedance.android.livesdk.container.config.live.LivePageConfig;
import com.bytedance.android.livesdk.container.type.HColor;
import com.bytedance.mt.protector.impl.UriProtector;
import java.lang.reflect.Field;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PageConfig extends HybridConfig {
    public LivePageConfig extraConfig;

    @CNS(name = "hide_nav_bar")
    public boolean hideNavBar;

    @CNS(name = "hide_status_bar")
    public boolean hideStatusBar;

    @CNS(name = "nav_bar_color")
    public HColor navBarColor;

    @CNS(name = "nav_btn_type")
    public String navBtnType;

    @CNS(name = "show_closeall")
    public boolean showCloseAll;

    @CNS(name = "status_bar_bg_color")
    public HColor statusBgColor;

    @CNS(name = "status_font_mode")
    public String statusFontMode;

    @CNS(name = "title")
    public String title;

    @CNS(name = "title_color")
    public HColor titleColor;

    @CNS(name = "trans_status_bar")
    public boolean transStatusBar;

    /* JADX WARN: Multi-variable type inference failed */
    public PageConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final LivePageConfig getExtraConfig() {
        return this.extraConfig;
    }

    public final boolean getHideNavBar() {
        return this.hideNavBar;
    }

    public final boolean getHideStatusBar() {
        return this.hideStatusBar;
    }

    public final HColor getNavBarColor() {
        return this.navBarColor;
    }

    public final String getNavBtnType() {
        return this.navBtnType;
    }

    public final boolean getShowCloseAll() {
        return this.showCloseAll;
    }

    public final HColor getStatusBgColor() {
        return this.statusBgColor;
    }

    public final String getStatusFontMode() {
        return this.statusFontMode;
    }

    public final String getTitle() {
        return this.title;
    }

    public final HColor getTitleColor() {
        return this.titleColor;
    }

    public final boolean getTransStatusBar() {
        return this.transStatusBar;
    }

    public PageConfig(Uri uri) {
        super(uri);
        String name;
        String queryParameter;
        String name2;
        String queryParameter2;
        this.title = "";
        if (uri != null) {
            setOriginUri(uri.toString());
            Class<PageConfig> cls = PageConfig.class;
            while (true) {
                if (cls == null) {
                    break;
                }
                Field[] declaredFields = cls.getDeclaredFields();
                o.LJIIIIZZ(declaredFields, "clazz.declaredFields");
                for (Field field : declaredFields) {
                    CNS cns = (CNS) field.getAnnotation(CNS.class);
                    if (cns != null && (queryParameter2 = UriProtector.getQueryParameter(uri, (name2 = cns.name()))) != null) {
                        field.setAccessible(true);
                        Class<?> type = field.getType();
                        o.LJIIIIZZ(type, "it.type");
                        field.set(this, C31248COe.LIZ(uri, name2, queryParameter2, type));
                    }
                }
                cls = cls.getSuperclass();
            }
            Class<LivePageConfig> cls2 = LivePageConfig.class;
            LivePageConfig newInstance = cls2.newInstance();
            do {
                Field[] declaredFields2 = cls2.getDeclaredFields();
                o.LJIIIIZZ(declaredFields2, "clazz.declaredFields");
                for (Field field2 : declaredFields2) {
                    CNS cns2 = (CNS) field2.getAnnotation(CNS.class);
                    if (cns2 != null && (queryParameter = UriProtector.getQueryParameter(uri, (name = cns2.name()))) != null) {
                        field2.setAccessible(true);
                        Class<?> type2 = field2.getType();
                        o.LJIIIIZZ(type2, "it.type");
                        field2.set(newInstance, C31248COe.LIZ(uri, name, queryParameter, type2));
                    }
                }
                cls2 = cls2.getSuperclass();
            } while (cls2 != null);
            this.extraConfig = newInstance;
        }
    }

    @Override // com.bytedance.android.livesdk.container.config.base.HybridConfig
    public void checkSchema(Uri uri) {
        C31934Cg6 PR;
        COQ b90;
        o.LJIIIZ(uri, "uri");
        super.checkSchema(uri);
        if (!CNI.LIZLLL.contains(uri.getHost())) {
            if (getEngineType() == CNK.WEB_VIEW) {
                IContainerService iContainerService = (IContainerService) CN1.LIZ(IContainerService.class);
                if (iContainerService != null && (b90 = iContainerService.b90()) != null) {
                    String uri2 = uri.toString();
                    o.LJIIIIZZ(uri2, "uri.toString()");
                    b90.LJ(uri2);
                    return;
                }
                return;
            }
            IContainerService iContainerService2 = (IContainerService) CN1.LIZ(IContainerService.class);
            if (iContainerService2 == null || (PR = iContainerService2.PR()) == null) {
                return;
            }
            String uri3 = uri.toString();
            o.LJIIIIZZ(uri3, "uri.toString()");
            PR.LJ(uri3);
        }
    }

    public final void setExtraConfig(LivePageConfig livePageConfig) {
        this.extraConfig = livePageConfig;
    }

    public final void setHideNavBar(boolean z) {
        this.hideNavBar = z;
    }

    public final void setHideStatusBar(boolean z) {
        this.hideStatusBar = z;
    }

    public final void setNavBarColor(HColor hColor) {
        this.navBarColor = hColor;
    }

    public final void setNavBtnType(String str) {
        this.navBtnType = str;
    }

    public final void setShowCloseAll(boolean z) {
        this.showCloseAll = z;
    }

    public final void setStatusBgColor(HColor hColor) {
        this.statusBgColor = hColor;
    }

    public final void setStatusFontMode(String str) {
        this.statusFontMode = str;
    }

    public final void setTitle(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.title = str;
    }

    public final void setTitleColor(HColor hColor) {
        this.titleColor = hColor;
    }

    public final void setTransStatusBar(boolean z) {
        this.transStatusBar = z;
    }

    public /* synthetic */ PageConfig(Uri uri, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uri);
    }
}

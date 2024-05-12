package com.bytedance.android.livesdk.container.config.base;

import X.C15380j0;
import X.C31248COe;
import X.C31934Cg6;
import X.CN1;
import X.CNI;
import X.CNK;
import X.CNO;
import X.CNP;
import X.CNS;
import X.COQ;
import android.net.Uri;
import com.bytedance.android.live.browser.IContainerService;
import com.bytedance.android.livesdk.container.config.live.LivePopupConfig;
import com.bytedance.android.livesdk.container.type.HColor;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import java.lang.reflect.Field;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PopupConfig extends HybridConfig {

    @CNS(name = "transition_animation")
    public String animation;

    @CNS(name = "dialog_transition_animation")
    public String dialogAnimation;

    @CNS(name = "disable_mask_click_close")
    public boolean disableMaskClose;
    public LivePopupConfig extraConfig;

    @CNS(name = "gravity")
    public String gravity;

    @CNS(name = "height")
    public int height;

    @CNS(name = "mask_bg_color")
    public HColor maskBgColor;

    @CNS(name = "enable_pull_down_close")
    public boolean pullDownClose;

    @CNS(name = "radius")
    public int radius;

    @CNS(name = "show_mask")
    public boolean showMask;

    @CNS(name = "width")
    public int width;

    /* JADX WARN: Multi-variable type inference failed */
    public PopupConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void adjustValues() {
        if (o.LJ(this.gravity, "center")) {
            if (this.width == C15380j0.LJIIL()) {
                this.width = CNO.LIZ;
            }
            if (this.height == C15380j0.LJIIJJI()) {
                this.height = CNO.LIZIZ;
            }
        }
    }

    public final String getAnimation() {
        return this.animation;
    }

    public final String getDialogAnimation() {
        return this.dialogAnimation;
    }

    public final boolean getDisableMaskClose() {
        return this.disableMaskClose;
    }

    public final LivePopupConfig getExtraConfig() {
        return this.extraConfig;
    }

    public final String getGravity() {
        return this.gravity;
    }

    public final int getHeight() {
        return this.height;
    }

    public final HColor getMaskBgColor() {
        return this.maskBgColor;
    }

    public final boolean getPullDownClose() {
        return this.pullDownClose;
    }

    public final int getRadius() {
        return this.radius;
    }

    public final boolean getShowMask() {
        return this.showMask;
    }

    public final int getWidth() {
        return this.width;
    }

    public PopupConfig(Uri uri) {
        super(uri);
        String name;
        String queryParameter;
        String name2;
        String queryParameter2;
        this.gravity = "bottom";
        this.width = C15380j0.LJIIL();
        this.height = C15380j0.LJIIJJI();
        this.radius = CNP.LIZ;
        this.animation = "auto";
        this.dialogAnimation = LiveGiftNewGifterBadgeSetting.DEFAULT;
        if (uri != null) {
            setOriginUri(uri.toString());
            Class<PopupConfig> cls = PopupConfig.class;
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
            Class<LivePopupConfig> cls2 = LivePopupConfig.class;
            LivePopupConfig newInstance = cls2.newInstance();
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
            adjustValues();
        }
    }

    @Override // com.bytedance.android.livesdk.container.config.base.HybridConfig
    public void checkSchema(Uri uri) {
        C31934Cg6 PR;
        COQ b90;
        o.LJIIIZ(uri, "uri");
        super.checkSchema(uri);
        if (!CNI.LJ.contains(uri.getHost())) {
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

    public final void setAnimation(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.animation = str;
    }

    public final void setDialogAnimation(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.dialogAnimation = str;
    }

    public final void setDisableMaskClose(boolean z) {
        this.disableMaskClose = z;
    }

    public final void setExtraConfig(LivePopupConfig livePopupConfig) {
        this.extraConfig = livePopupConfig;
    }

    public final void setGravity(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.gravity = str;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setMaskBgColor(HColor hColor) {
        this.maskBgColor = hColor;
    }

    public final void setPullDownClose(boolean z) {
        this.pullDownClose = z;
    }

    public final void setRadius(int i) {
        this.radius = i;
    }

    public final void setShowMask(boolean z) {
        this.showMask = z;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public /* synthetic */ PopupConfig(Uri uri, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uri);
    }
}

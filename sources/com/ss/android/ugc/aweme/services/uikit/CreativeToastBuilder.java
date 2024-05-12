package com.ss.android.ugc.aweme.services.uikit;

import X.V0N;
import com.ss.android.ugc.aweme.services.uikit.CreativeToast;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CreativeToastBuilder {
    public final CreativeToastConfig config;

    /* loaded from: classes8.dex */
    public enum CancelType {
        GONE,
        VISIBLE,
        VISIBLE_AFTER_5S,
        VISIBLE_AFTER_15S;

        public static CancelType valueOf(String str) {
            return (CancelType) V0N.LJJJ(CancelType.class, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CreativeToastBuilder() {
        boolean z = false;
        this.config = new CreativeToastConfig(z, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 8191, 0 == true ? 1 : 0);
    }

    public final CreativeToastConfig getConfig() {
        return this.config;
    }

    public final CreativeToastBuilder acrossActivities(boolean z) {
        this.config.setAcrossActivities(Boolean.valueOf(z));
        return this;
    }

    public final CreativeToastBuilder blockContinuousToast(boolean z) {
        this.config.setBlockContinuousToast(z);
        return this;
    }

    public final CreativeToastBuilder duration(long j) {
        this.config.setDuration(Long.valueOf(j));
        return this;
    }

    public final CreativeToastBuilder forceTheme(int i) {
        this.config.setThemeRes(Integer.valueOf(i));
        return this;
    }

    public final CreativeToastBuilder icon(int i) {
        this.config.setIcon(Integer.valueOf(i));
        return this;
    }

    public final CreativeToastBuilder iconColor(int i) {
        this.config.setIconColor(Integer.valueOf(i));
        return this;
    }

    public final CreativeToastBuilder iconColorRes(int i) {
        this.config.setIconColorRes(Integer.valueOf(i));
        return this;
    }

    public final CreativeToastBuilder isCenterToast(boolean z) {
        this.config.setCenterToast(z);
        return this;
    }

    public final CreativeToastBuilder message(String message) {
        o.LJIIIZ(message, "message");
        this.config.setMessage(message);
        return this;
    }

    public final CreativeToastBuilder messageRes(int i) {
        this.config.setMessageRes(Integer.valueOf(i));
        return this;
    }

    public final CreativeToastBuilder onDismissListener(CreativeToast.OnDismissListener dismissListener) {
        o.LJIIIZ(dismissListener, "dismissListener");
        this.config.setDismissListener(dismissListener);
        return this;
    }

    public final CreativeToastBuilder onShowListener(CreativeToast.OnShowListener showListener) {
        o.LJIIIZ(showListener, "showListener");
        this.config.setShowListener(showListener);
        return this;
    }
}

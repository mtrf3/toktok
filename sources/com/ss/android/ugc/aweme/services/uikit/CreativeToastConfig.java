package com.ss.android.ugc.aweme.services.uikit;

import com.ss.android.ugc.aweme.services.uikit.CreativeToast;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CreativeToastConfig {
    public Boolean acrossActivities;
    public boolean blockContinuousToast;
    public CreativeToast.OnDismissListener dismissListener;
    public Long duration;
    public Integer icon;
    public Integer iconColor;
    public Integer iconColorRes;
    public boolean isCenterToast;
    public Integer maxWidth;
    public String message;
    public Integer messageRes;
    public CreativeToast.OnShowListener showListener;
    public Integer themeRes;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CreativeToastConfig() {
        /*
            r16 = this;
            r1 = 0
            r2 = 0
            r14 = 8191(0x1fff, float:1.1478E-41)
            r0 = r16
            r3 = r2
            r4 = r2
            r5 = r2
            r6 = r2
            r7 = r2
            r8 = r2
            r9 = r2
            r10 = r2
            r11 = r1
            r12 = r2
            r13 = r2
            r15 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.uikit.CreativeToastConfig.<init>():void");
    }

    public static /* synthetic */ CreativeToastConfig copy$default(CreativeToastConfig creativeToastConfig, boolean z, String str, Integer num, Long l, Integer num2, Integer num3, Integer num4, Integer num5, Boolean bool, Integer num6, boolean z2, CreativeToast.OnDismissListener onDismissListener, CreativeToast.OnShowListener onShowListener, int i, Object obj) {
        if ((i & 1) != 0) {
            z = creativeToastConfig.isCenterToast;
        }
        if ((i & 2) != 0) {
            str = creativeToastConfig.message;
        }
        if ((i & 4) != 0) {
            num = creativeToastConfig.messageRes;
        }
        if ((i & 8) != 0) {
            l = creativeToastConfig.duration;
        }
        if ((i & 16) != 0) {
            num2 = creativeToastConfig.icon;
        }
        if ((i & 32) != 0) {
            num3 = creativeToastConfig.iconColor;
        }
        if ((i & 64) != 0) {
            num4 = creativeToastConfig.iconColorRes;
        }
        if ((i & 128) != 0) {
            num5 = creativeToastConfig.maxWidth;
        }
        if ((i & 256) != 0) {
            bool = creativeToastConfig.acrossActivities;
        }
        if ((i & 512) != 0) {
            num6 = creativeToastConfig.themeRes;
        }
        if ((i & 1024) != 0) {
            z2 = creativeToastConfig.blockContinuousToast;
        }
        if ((i & 2048) != 0) {
            onDismissListener = creativeToastConfig.dismissListener;
        }
        if ((i & 4096) != 0) {
            onShowListener = creativeToastConfig.showListener;
        }
        return creativeToastConfig.copy(z, str, num, l, num2, num3, num4, num5, bool, num6, z2, onDismissListener, onShowListener);
    }

    public final CreativeToastConfig copy(boolean z, String str, Integer num, Long l, Integer num2, Integer num3, Integer num4, Integer num5, Boolean bool, Integer num6, boolean z2, CreativeToast.OnDismissListener onDismissListener, CreativeToast.OnShowListener onShowListener) {
        return new CreativeToastConfig(z, str, num, l, num2, num3, num4, num5, bool, num6, z2, onDismissListener, onShowListener);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreativeToastConfig)) {
            return false;
        }
        CreativeToastConfig creativeToastConfig = (CreativeToastConfig) obj;
        return this.isCenterToast == creativeToastConfig.isCenterToast && o.LJ(this.message, creativeToastConfig.message) && o.LJ(this.messageRes, creativeToastConfig.messageRes) && o.LJ(this.duration, creativeToastConfig.duration) && o.LJ(this.icon, creativeToastConfig.icon) && o.LJ(this.iconColor, creativeToastConfig.iconColor) && o.LJ(this.iconColorRes, creativeToastConfig.iconColorRes) && o.LJ(this.maxWidth, creativeToastConfig.maxWidth) && o.LJ(this.acrossActivities, creativeToastConfig.acrossActivities) && o.LJ(this.themeRes, creativeToastConfig.themeRes) && this.blockContinuousToast == creativeToastConfig.blockContinuousToast && o.LJ(this.dismissListener, creativeToastConfig.dismissListener) && o.LJ(this.showListener, creativeToastConfig.showListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    public int hashCode() {
        boolean z = this.isCenterToast;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.message;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.messageRes;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.duration;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.icon;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.iconColor;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.iconColorRes;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.maxWidth;
        int hashCode7 = (hashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Boolean bool = this.acrossActivities;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num6 = this.themeRes;
        int hashCode9 = (((hashCode8 + (num6 == null ? 0 : num6.hashCode())) * 31) + (this.blockContinuousToast ? 1 : 0)) * 31;
        CreativeToast.OnDismissListener onDismissListener = this.dismissListener;
        int hashCode10 = (hashCode9 + (onDismissListener == null ? 0 : onDismissListener.hashCode())) * 31;
        CreativeToast.OnShowListener onShowListener = this.showListener;
        return hashCode10 + (onShowListener != null ? onShowListener.hashCode() : 0);
    }

    public String toString() {
        return "CreativeToastConfig(isCenterToast=" + this.isCenterToast + ", message=" + this.message + ", messageRes=" + this.messageRes + ", duration=" + this.duration + ", icon=" + this.icon + ", iconColor=" + this.iconColor + ", iconColorRes=" + this.iconColorRes + ", maxWidth=" + this.maxWidth + ", acrossActivities=" + this.acrossActivities + ", themeRes=" + this.themeRes + ", blockContinuousToast=" + this.blockContinuousToast + ", dismissListener=" + this.dismissListener + ", showListener=" + this.showListener + ')';
    }

    public final Boolean getAcrossActivities() {
        return this.acrossActivities;
    }

    public final boolean getBlockContinuousToast() {
        return this.blockContinuousToast;
    }

    public final CreativeToast.OnDismissListener getDismissListener() {
        return this.dismissListener;
    }

    public final Long getDuration() {
        return this.duration;
    }

    public final Integer getIcon() {
        return this.icon;
    }

    public final Integer getIconColor() {
        return this.iconColor;
    }

    public final Integer getIconColorRes() {
        return this.iconColorRes;
    }

    public final Integer getMaxWidth() {
        return this.maxWidth;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Integer getMessageRes() {
        return this.messageRes;
    }

    public final CreativeToast.OnShowListener getShowListener() {
        return this.showListener;
    }

    public final Integer getThemeRes() {
        return this.themeRes;
    }

    public final boolean isCenterToast() {
        return this.isCenterToast;
    }

    public final void setAcrossActivities(Boolean bool) {
        this.acrossActivities = bool;
    }

    public final void setBlockContinuousToast(boolean z) {
        this.blockContinuousToast = z;
    }

    public final void setCenterToast(boolean z) {
        this.isCenterToast = z;
    }

    public final void setDismissListener(CreativeToast.OnDismissListener onDismissListener) {
        this.dismissListener = onDismissListener;
    }

    public final void setDuration(Long l) {
        this.duration = l;
    }

    public final void setIcon(Integer num) {
        this.icon = num;
    }

    public final void setIconColor(Integer num) {
        this.iconColor = num;
    }

    public final void setIconColorRes(Integer num) {
        this.iconColorRes = num;
    }

    public final void setMaxWidth(Integer num) {
        this.maxWidth = num;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setMessageRes(Integer num) {
        this.messageRes = num;
    }

    public final void setShowListener(CreativeToast.OnShowListener onShowListener) {
        this.showListener = onShowListener;
    }

    public final void setThemeRes(Integer num) {
        this.themeRes = num;
    }

    public CreativeToastConfig(boolean z, String str, Integer num, Long l, Integer num2, Integer num3, Integer num4, Integer num5, Boolean bool, Integer num6, boolean z2, CreativeToast.OnDismissListener onDismissListener, CreativeToast.OnShowListener onShowListener) {
        this.isCenterToast = z;
        this.message = str;
        this.messageRes = num;
        this.duration = l;
        this.icon = num2;
        this.iconColor = num3;
        this.iconColorRes = num4;
        this.maxWidth = num5;
        this.acrossActivities = bool;
        this.themeRes = num6;
        this.blockContinuousToast = z2;
        this.dismissListener = onDismissListener;
        this.showListener = onShowListener;
    }

    public /* synthetic */ CreativeToastConfig(boolean z, String str, Integer num, Long l, Integer num2, Integer num3, Integer num4, Integer num5, Boolean bool, Integer num6, boolean z2, CreativeToast.OnDismissListener onDismissListener, CreativeToast.OnShowListener onShowListener, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : num3, (i & 64) != 0 ? null : num4, (i & 128) != 0 ? null : num5, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : num6, (i & 1024) == 0 ? z2 : false, (i & 2048) != 0 ? null : onDismissListener, (i & 4096) == 0 ? onShowListener : null);
    }
}

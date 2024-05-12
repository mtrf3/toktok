package com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed;

import X.X1D;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class VideoImageMixedInitParam {
    public final Drawable clickableDrawable;
    public final boolean isAIGCPath;
    public final boolean isSoundSync;
    public final boolean isUgcTemplate;
    public final boolean showAutoCut;
    public final boolean showEditorPro;
    public final Drawable unClickableDrawable;

    public static /* synthetic */ VideoImageMixedInitParam copy$default(VideoImageMixedInitParam videoImageMixedInitParam, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Drawable drawable, Drawable drawable2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = videoImageMixedInitParam.showAutoCut;
        }
        if ((i & 2) != 0) {
            z2 = videoImageMixedInitParam.showEditorPro;
        }
        if ((i & 4) != 0) {
            z3 = videoImageMixedInitParam.isSoundSync;
        }
        if ((i & 8) != 0) {
            z4 = videoImageMixedInitParam.isUgcTemplate;
        }
        if ((i & 16) != 0) {
            z5 = videoImageMixedInitParam.isAIGCPath;
        }
        if ((i & 32) != 0) {
            drawable = videoImageMixedInitParam.clickableDrawable;
        }
        if ((i & 64) != 0) {
            drawable2 = videoImageMixedInitParam.unClickableDrawable;
        }
        return videoImageMixedInitParam.copy(z, z2, z3, z4, z5, drawable, drawable2);
    }

    public final VideoImageMixedInitParam copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Drawable drawable, Drawable drawable2) {
        return new VideoImageMixedInitParam(z, z2, z3, z4, z5, drawable, drawable2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoImageMixedInitParam)) {
            return false;
        }
        VideoImageMixedInitParam videoImageMixedInitParam = (VideoImageMixedInitParam) obj;
        return this.showAutoCut == videoImageMixedInitParam.showAutoCut && this.showEditorPro == videoImageMixedInitParam.showEditorPro && this.isSoundSync == videoImageMixedInitParam.isSoundSync && this.isUgcTemplate == videoImageMixedInitParam.isUgcTemplate && this.isAIGCPath == videoImageMixedInitParam.isAIGCPath && o.LJ(this.clickableDrawable, videoImageMixedInitParam.clickableDrawable) && o.LJ(this.unClickableDrawable, videoImageMixedInitParam.unClickableDrawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public int hashCode() {
        boolean z = this.showAutoCut;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r02 = this.showEditorPro;
        int i2 = r02;
        if (r02 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ?? r03 = this.isSoundSync;
        int i4 = r03;
        if (r03 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        ?? r04 = this.isUgcTemplate;
        int i6 = r04;
        if (r04 != 0) {
            i6 = 1;
        }
        int i7 = (((i5 + i6) * 31) + (this.isAIGCPath ? 1 : 0)) * 31;
        Drawable drawable = this.clickableDrawable;
        int hashCode = (i7 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.unClickableDrawable;
        return hashCode + (drawable2 != null ? drawable2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoImageMixedInitParam(showAutoCut=");
        LIZ.append(this.showAutoCut);
        LIZ.append(", showEditorPro=");
        LIZ.append(this.showEditorPro);
        LIZ.append(", isSoundSync=");
        LIZ.append(this.isSoundSync);
        LIZ.append(", isUgcTemplate=");
        LIZ.append(this.isUgcTemplate);
        LIZ.append(", isAIGCPath=");
        LIZ.append(this.isAIGCPath);
        LIZ.append(", clickableDrawable=");
        LIZ.append(this.clickableDrawable);
        LIZ.append(", unClickableDrawable=");
        LIZ.append(this.unClickableDrawable);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final Drawable getClickableDrawable() {
        return this.clickableDrawable;
    }

    public final boolean getShowAutoCut() {
        return this.showAutoCut;
    }

    public final boolean getShowEditorPro() {
        return this.showEditorPro;
    }

    public final Drawable getUnClickableDrawable() {
        return this.unClickableDrawable;
    }

    public final boolean isAIGCPath() {
        return this.isAIGCPath;
    }

    public final boolean isSoundSync() {
        return this.isSoundSync;
    }

    public final boolean isUgcTemplate() {
        return this.isUgcTemplate;
    }

    public VideoImageMixedInitParam(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Drawable drawable, Drawable drawable2) {
        this.showAutoCut = z;
        this.showEditorPro = z2;
        this.isSoundSync = z3;
        this.isUgcTemplate = z4;
        this.isAIGCPath = z5;
        this.clickableDrawable = drawable;
        this.unClickableDrawable = drawable2;
    }

    public /* synthetic */ VideoImageMixedInitParam(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Drawable drawable, Drawable drawable2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) == 0 ? z5 : false, (i & 32) != 0 ? null : drawable, (i & 64) == 0 ? drawable2 : null);
    }
}

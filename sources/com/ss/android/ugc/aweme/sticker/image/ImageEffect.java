package com.ss.android.ugc.aweme.sticker.image;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class ImageEffect extends Effect {
    public long applyEndTime;
    public long applyStartTime;
    public long clickStartTime;
    public long downLoadEndTime;
    public long downLoadStartTime;
    public ResourceInfo resourceInfo;

    @InterfaceC65349Pkn("template_item")
    public final TemplateItem templateItem;
    public boolean zipCache;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ImageEffect() {
        /*
            r16 = this;
            r1 = 0
            r3 = 0
            r13 = 0
            r14 = 255(0xff, float:3.57E-43)
            r0 = r16
            r2 = r1
            r5 = r3
            r7 = r3
            r9 = r3
            r11 = r3
            r15 = r1
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.image.ImageEffect.<init>():void");
    }

    public static /* synthetic */ ImageEffect copy$default(ImageEffect imageEffect, TemplateItem templateItem, ResourceInfo resourceInfo, long j, long j2, long j3, long j4, long j5, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            templateItem = imageEffect.templateItem;
        }
        if ((i & 2) != 0) {
            resourceInfo = imageEffect.resourceInfo;
        }
        if ((i & 4) != 0) {
            j = imageEffect.clickStartTime;
        }
        if ((i & 8) != 0) {
            j2 = imageEffect.downLoadStartTime;
        }
        if ((i & 16) != 0) {
            j3 = imageEffect.downLoadEndTime;
        }
        if ((i & 32) != 0) {
            j4 = imageEffect.applyStartTime;
        }
        if ((i & 64) != 0) {
            j5 = imageEffect.applyEndTime;
        }
        if ((i & 128) != 0) {
            z = imageEffect.zipCache;
        }
        return imageEffect.copy(templateItem, resourceInfo, j, j2, j3, j4, j5, z);
    }

    public final Object[] LIZ() {
        return new Object[]{this.templateItem, this.resourceInfo, Long.valueOf(this.clickStartTime), Long.valueOf(this.downLoadStartTime), Long.valueOf(this.downLoadEndTime), Long.valueOf(this.applyStartTime), Long.valueOf(this.applyEndTime), Boolean.valueOf(this.zipCache)};
    }

    public final ImageEffect copy(TemplateItem templateItem, ResourceInfo resourceInfo, long j, long j2, long j3, long j4, long j5, boolean z) {
        return new ImageEffect(templateItem, resourceInfo, j, j2, j3, j4, j5, z);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ImageEffect) {
            return C78966Uyw.LJIIIZ(((ImageEffect) obj).LIZ(), LIZ());
        }
        return false;
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public int hashCode() {
        return Objects.hash(LIZ());
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String toString() {
        return C78966Uyw.LJJJLL("ImageEffect:%s,%s,%s,%s,%s,%s,%s,%s", LIZ());
    }

    public final long getApplyEndTime() {
        return this.applyEndTime;
    }

    public final long getApplyStartTime() {
        return this.applyStartTime;
    }

    public final long getClickStartTime() {
        return this.clickStartTime;
    }

    public final long getDownLoadEndTime() {
        return this.downLoadEndTime;
    }

    public final long getDownLoadStartTime() {
        return this.downLoadStartTime;
    }

    public final ResourceInfo getResourceInfo() {
        return this.resourceInfo;
    }

    public final TemplateItem getTemplateItem() {
        return this.templateItem;
    }

    public final boolean getZipCache() {
        return this.zipCache;
    }

    public final void setApplyEndTime(long j) {
        this.applyEndTime = j;
    }

    public final void setApplyStartTime(long j) {
        this.applyStartTime = j;
    }

    public final void setClickStartTime(long j) {
        this.clickStartTime = j;
    }

    public final void setDownLoadEndTime(long j) {
        this.downLoadEndTime = j;
    }

    public final void setDownLoadStartTime(long j) {
        this.downLoadStartTime = j;
    }

    public final void setResourceInfo(ResourceInfo resourceInfo) {
        this.resourceInfo = resourceInfo;
    }

    public final void setZipCache(boolean z) {
        this.zipCache = z;
    }

    public ImageEffect(TemplateItem templateItem, ResourceInfo resourceInfo, long j, long j2, long j3, long j4, long j5, boolean z) {
        super(null, 1, null);
        this.templateItem = templateItem;
        this.resourceInfo = resourceInfo;
        this.clickStartTime = j;
        this.downLoadStartTime = j2;
        this.downLoadEndTime = j3;
        this.applyStartTime = j4;
        this.applyEndTime = j5;
        this.zipCache = z;
    }

    public /* synthetic */ ImageEffect(TemplateItem templateItem, ResourceInfo resourceInfo, long j, long j2, long j3, long j4, long j5, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : templateItem, (i & 2) == 0 ? resourceInfo : null, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? 0L : j2, (i & 16) != 0 ? 0L : j3, (i & 32) != 0 ? 0L : j4, (i & 64) == 0 ? j5 : 0L, (i & 128) != 0 ? false : z);
    }
}

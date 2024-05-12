package com.ss.android.ugc.aweme.inbox.widget.multi.horizontal;

import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LocalCellConfig implements Serializable {
    public final Object badgeUrl;
    public final int bizType;
    public final Object imageUrl;
    public final String schemaUrl;
    public final Object title;
    public final int uiType;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LocalCellConfig() {
        /*
            r9 = this;
            r1 = 0
            r3 = 0
            r7 = 63
            r0 = r9
            r2 = r1
            r4 = r3
            r5 = r3
            r6 = r3
            r8 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.LocalCellConfig.<init>():void");
    }

    public static /* synthetic */ LocalCellConfig copy$default(LocalCellConfig localCellConfig, int i, int i2, Object obj, Object obj2, Object obj3, String str, int i3, Object obj4) {
        if ((i3 & 1) != 0) {
            i = localCellConfig.bizType;
        }
        if ((i3 & 2) != 0) {
            i2 = localCellConfig.uiType;
        }
        if ((i3 & 4) != 0) {
            obj = localCellConfig.imageUrl;
        }
        if ((i3 & 8) != 0) {
            obj2 = localCellConfig.badgeUrl;
        }
        if ((i3 & 16) != 0) {
            obj3 = localCellConfig.title;
        }
        if ((i3 & 32) != 0) {
            str = localCellConfig.schemaUrl;
        }
        return localCellConfig.copy(i, i2, obj, obj2, obj3, str);
    }

    public final LocalCellConfig copy(int i, int i2, Object obj, Object obj2, Object obj3, String str) {
        return new LocalCellConfig(i, i2, obj, obj2, obj3, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalCellConfig)) {
            return false;
        }
        LocalCellConfig localCellConfig = (LocalCellConfig) obj;
        return this.bizType == localCellConfig.bizType && this.uiType == localCellConfig.uiType && o.LJ(this.imageUrl, localCellConfig.imageUrl) && o.LJ(this.badgeUrl, localCellConfig.badgeUrl) && o.LJ(this.title, localCellConfig.title) && o.LJ(this.schemaUrl, localCellConfig.schemaUrl);
    }

    public int hashCode() {
        int i = ((this.bizType * 31) + this.uiType) * 31;
        Object obj = this.imageUrl;
        int hashCode = (i + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.badgeUrl;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.title;
        int hashCode3 = (hashCode2 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        String str = this.schemaUrl;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LocalCellConfig(bizType=");
        LIZ.append(this.bizType);
        LIZ.append(", uiType=");
        LIZ.append(this.uiType);
        LIZ.append(", imageUrl=");
        LIZ.append(this.imageUrl);
        LIZ.append(", badgeUrl=");
        LIZ.append(this.badgeUrl);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", schemaUrl=");
        return q.LIZIZ(LIZ, this.schemaUrl, ')', LIZ);
    }

    public final Object getBadgeUrl() {
        return this.badgeUrl;
    }

    public final int getBizType() {
        return this.bizType;
    }

    public final Object getImageUrl() {
        return this.imageUrl;
    }

    public final String getSchemaUrl() {
        return this.schemaUrl;
    }

    public final Object getTitle() {
        return this.title;
    }

    public final int getUiType() {
        return this.uiType;
    }

    public LocalCellConfig(int i, int i2, Object obj, Object obj2, Object obj3, String str) {
        this.bizType = i;
        this.uiType = i2;
        this.imageUrl = obj;
        this.badgeUrl = obj2;
        this.title = obj3;
        this.schemaUrl = str;
    }

    public /* synthetic */ LocalCellConfig(int i, int i2, Object obj, Object obj2, Object obj3, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) == 0 ? i2 : -1, (i3 & 4) != 0 ? null : obj, (i3 & 8) != 0 ? null : obj2, (i3 & 16) == 0 ? obj3 : null, (i3 & 32) != 0 ? "" : str);
    }
}

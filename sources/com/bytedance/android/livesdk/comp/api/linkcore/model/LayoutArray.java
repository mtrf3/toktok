package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.graphics.RectF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LayoutArray {

    @InterfaceC65349Pkn("business_id")
    public final String businessId;

    @InterfaceC65349Pkn("config_id")
    public final String configId;

    @InterfaceC65349Pkn("pos")
    public List<Float> pos;
    public RectF rectF;

    @InterfaceC65349Pkn("reso_id")
    public final String reso_id;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LayoutArray copy$default(LayoutArray layoutArray, List list, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = layoutArray.pos;
        }
        if ((i & 2) != 0) {
            str = layoutArray.reso_id;
        }
        if ((i & 4) != 0) {
            str2 = layoutArray.businessId;
        }
        if ((i & 8) != 0) {
            str3 = layoutArray.configId;
        }
        return layoutArray.copy(list, str, str2, str3);
    }

    public static /* synthetic */ void getReso_id$annotations() {
    }

    public final LayoutArray copy(List<Float> pos, String reso_id, String str, String str2) {
        o.LJIIIZ(pos, "pos");
        o.LJIIIZ(reso_id, "reso_id");
        return new LayoutArray(pos, reso_id, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LayoutArray)) {
            return false;
        }
        LayoutArray layoutArray = (LayoutArray) obj;
        return o.LJ(this.pos, layoutArray.pos) && o.LJ(this.reso_id, layoutArray.reso_id) && o.LJ(this.businessId, layoutArray.businessId) && o.LJ(this.configId, layoutArray.configId);
    }

    private final RectF createLayoutSize() {
        return new RectF(((Number) ListProtector.get(this.pos, 0)).floatValue(), ((Number) ListProtector.get(this.pos, 1)).floatValue(), ((Number) ListProtector.get(this.pos, 2)).floatValue(), ((Number) ListProtector.get(this.pos, 3)).floatValue());
    }

    public final float getBottom$livebase_release() {
        RectF rectF = this.rectF;
        if (rectF != null) {
            return rectF.bottom;
        }
        RectF createLayoutSize = createLayoutSize();
        this.rectF = createLayoutSize;
        return createLayoutSize.bottom;
    }

    public final float getHeight() {
        RectF rectF = this.rectF;
        if (rectF != null) {
            return rectF.height();
        }
        RectF createLayoutSize = createLayoutSize();
        this.rectF = createLayoutSize;
        return createLayoutSize.height();
    }

    public final float getLeft() {
        RectF rectF = this.rectF;
        if (rectF != null) {
            return rectF.left;
        }
        RectF createLayoutSize = createLayoutSize();
        this.rectF = createLayoutSize;
        return createLayoutSize.left;
    }

    public final RectF getLocationRectF() {
        RectF rectF = this.rectF;
        if (rectF != null) {
            return rectF;
        }
        RectF createLayoutSize = createLayoutSize();
        this.rectF = createLayoutSize;
        return createLayoutSize;
    }

    public final float getRight() {
        RectF rectF = this.rectF;
        if (rectF != null) {
            return rectF.right;
        }
        RectF createLayoutSize = createLayoutSize();
        this.rectF = createLayoutSize;
        return createLayoutSize.right;
    }

    public final float getTop() {
        RectF rectF = this.rectF;
        if (rectF != null) {
            return rectF.top;
        }
        RectF createLayoutSize = createLayoutSize();
        this.rectF = createLayoutSize;
        return createLayoutSize.top;
    }

    public final float getWidth() {
        RectF rectF = this.rectF;
        if (rectF != null) {
            return rectF.width();
        }
        RectF createLayoutSize = createLayoutSize();
        this.rectF = createLayoutSize;
        return createLayoutSize.width();
    }

    public int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.reso_id, this.pos.hashCode() * 31, 31);
        String str = this.businessId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        String str2 = this.configId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LayoutArray(pos=");
        LIZ.append(this.pos);
        LIZ.append(", reso_id=");
        LIZ.append(this.reso_id);
        LIZ.append(", businessId=");
        LIZ.append(this.businessId);
        LIZ.append(", configId=");
        return q.LIZIZ(LIZ, this.configId, ')', LIZ);
    }

    public final String getBusinessId() {
        return this.businessId;
    }

    public final String getConfigId() {
        return this.configId;
    }

    public final List<Float> getPos() {
        return this.pos;
    }

    public final String getReso_id() {
        return this.reso_id;
    }

    public final void setPos(List<Float> list) {
        o.LJIIIZ(list, "<set-?>");
        this.pos = list;
    }

    public LayoutArray(List<Float> pos, String reso_id, String str, String str2) {
        o.LJIIIZ(pos, "pos");
        o.LJIIIZ(reso_id, "reso_id");
        this.pos = pos;
        this.reso_id = reso_id;
        this.businessId = str;
        this.configId = str2;
    }

    public /* synthetic */ LayoutArray(List list, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}

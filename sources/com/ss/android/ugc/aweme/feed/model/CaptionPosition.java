package com.ss.android.ugc.aweme.feed.model;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class CaptionPosition implements Serializable {

    @InterfaceC65349Pkn("horizontal")
    public Float horizontal;

    @InterfaceC65349Pkn("vertical")
    public List<Float> vertical;

    public CaptionPosition() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CaptionPosition copy$default(CaptionPosition captionPosition, List list, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            list = captionPosition.vertical;
        }
        if ((i & 2) != 0) {
            f = captionPosition.horizontal;
        }
        return captionPosition.copy(list, f);
    }

    public final CaptionPosition copy(List<Float> vertical, Float f) {
        o.LJIIIZ(vertical, "vertical");
        return new CaptionPosition(vertical, f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CaptionPosition)) {
            return false;
        }
        CaptionPosition captionPosition = (CaptionPosition) obj;
        return o.LJ(this.vertical, captionPosition.vertical) && o.LJ(this.horizontal, captionPosition.horizontal);
    }

    public int hashCode() {
        int hashCode = this.vertical.hashCode() * 31;
        Float f = this.horizontal;
        return hashCode + (f == null ? 0 : f.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CaptionPosition(vertical=");
        LIZ.append(this.vertical);
        LIZ.append(", horizontal=");
        LIZ.append(this.horizontal);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final Float getHorizontal() {
        return this.horizontal;
    }

    public final List<Float> getVertical() {
        return this.vertical;
    }

    public CaptionPosition(List<Float> vertical, Float f) {
        o.LJIIIZ(vertical, "vertical");
        this.vertical = vertical;
        this.horizontal = f;
    }

    public CaptionPosition(List list, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list, (i & 2) != 0 ? Float.valueOf(0.5f) : f);
    }
}

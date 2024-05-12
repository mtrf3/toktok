package com.ss.android.ugc.aweme.infoSticker.customsticker.api;

import X.AnonymousClass391;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.infoSticker.customsticker.helper.Coordinate;
import com.ss.android.ugc.aweme.infoSticker.customsticker.helper.Location;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class CutoutResult {
    public Location bbox;
    public String content;

    @InterfaceC65349Pkn("contours_point")
    public List<? extends List<Coordinate>> contoursPoint;

    /* JADX WARN: Multi-variable type inference failed */
    public CutoutResult() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CutoutResult copy$default(CutoutResult cutoutResult, String str, List list, Location location, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cutoutResult.content;
        }
        if ((i & 2) != 0) {
            list = cutoutResult.contoursPoint;
        }
        if ((i & 4) != 0) {
            location = cutoutResult.bbox;
        }
        return cutoutResult.copy(str, list, location);
    }

    public final CutoutResult copy(String content, List<? extends List<Coordinate>> contoursPoint, Location location) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(contoursPoint, "contoursPoint");
        return new CutoutResult(content, contoursPoint, location);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutoutResult)) {
            return false;
        }
        CutoutResult cutoutResult = (CutoutResult) obj;
        return o.LJ(this.content, cutoutResult.content) && o.LJ(this.contoursPoint, cutoutResult.contoursPoint) && o.LJ(this.bbox, cutoutResult.bbox);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CutoutResult(content=");
        LIZ.append(this.content);
        LIZ.append(", contoursPoint=");
        LIZ.append(this.contoursPoint);
        LIZ.append(", bbox=");
        LIZ.append(this.bbox);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public int hashCode() {
        int hashCode;
        int LIZIZ = AnonymousClass391.LIZIZ(this.contoursPoint, this.content.hashCode() * 31, 31);
        Location location = this.bbox;
        if (location == null) {
            hashCode = 0;
        } else {
            hashCode = location.hashCode();
        }
        return LIZIZ + hashCode;
    }

    public final Location getBbox() {
        return this.bbox;
    }

    public final String getContent() {
        return this.content;
    }

    public final List<List<Coordinate>> getContoursPoint() {
        return this.contoursPoint;
    }

    public final void setBbox(Location location) {
        this.bbox = location;
    }

    public final void setContent(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.content = str;
    }

    public final void setContoursPoint(List<? extends List<Coordinate>> list) {
        o.LJIIIZ(list, "<set-?>");
        this.contoursPoint = list;
    }

    public CutoutResult(String content, List<? extends List<Coordinate>> contoursPoint, Location location) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(contoursPoint, "contoursPoint");
        this.content = content;
        this.contoursPoint = contoursPoint;
        this.bbox = location;
    }

    public /* synthetic */ CutoutResult(String str, List list, Location location, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? null : location);
    }
}

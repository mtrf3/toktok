package com.ss.android.ugc.aweme.commercialize.model;

import X.C07670Rv;
import X.C16880lQ;
import X.C1JX;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AnoleComponentLayoutModel implements Serializable {

    @InterfaceC65349Pkn("bottom")
    public final double bottom;

    @InterfaceC65349Pkn("left")
    public final double left;

    @InterfaceC65349Pkn("right")
    public final double right;

    @InterfaceC65349Pkn("top")
    public final double top;

    @InterfaceC65349Pkn("type")
    public final String type;

    @InterfaceC65349Pkn("x")
    public final double x;

    @InterfaceC65349Pkn("y")
    public final double y;

    public static /* synthetic */ AnoleComponentLayoutModel copy$default(AnoleComponentLayoutModel anoleComponentLayoutModel, String str, double d, double d2, double d3, double d4, double d5, double d6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = anoleComponentLayoutModel.type;
        }
        if ((i & 2) != 0) {
            d = anoleComponentLayoutModel.x;
        }
        if ((i & 4) != 0) {
            d2 = anoleComponentLayoutModel.y;
        }
        if ((i & 8) != 0) {
            d3 = anoleComponentLayoutModel.left;
        }
        if ((i & 16) != 0) {
            d4 = anoleComponentLayoutModel.top;
        }
        if ((i & 32) != 0) {
            d5 = anoleComponentLayoutModel.right;
        }
        if ((i & 64) != 0) {
            d6 = anoleComponentLayoutModel.bottom;
        }
        return anoleComponentLayoutModel.copy(str, d, d2, d3, d4, d5, d6);
    }

    public final AnoleComponentLayoutModel copy(String str, double d, double d2, double d3, double d4, double d5, double d6) {
        return new AnoleComponentLayoutModel(str, d, d2, d3, d4, d5, d6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnoleComponentLayoutModel)) {
            return false;
        }
        AnoleComponentLayoutModel anoleComponentLayoutModel = (AnoleComponentLayoutModel) obj;
        return o.LJ(this.type, anoleComponentLayoutModel.type) && Double.compare(this.x, anoleComponentLayoutModel.x) == 0 && Double.compare(this.y, anoleComponentLayoutModel.y) == 0 && Double.compare(this.left, anoleComponentLayoutModel.left) == 0 && Double.compare(this.top, anoleComponentLayoutModel.top) == 0 && Double.compare(this.right, anoleComponentLayoutModel.right) == 0 && Double.compare(this.bottom, anoleComponentLayoutModel.bottom) == 0;
    }

    public int hashCode() {
        int hashCode;
        String str = this.type;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return C16880lQ.LLJI(this.bottom) + C1JX.LIZIZ(this.right, C1JX.LIZIZ(this.top, C1JX.LIZIZ(this.left, C1JX.LIZIZ(this.y, C1JX.LIZIZ(this.x, hashCode * 31, 31), 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnoleComponentLayoutModel(type=");
        LIZ.append(this.type);
        LIZ.append(", x=");
        LIZ.append(this.x);
        LIZ.append(", y=");
        LIZ.append(this.y);
        LIZ.append(", left=");
        LIZ.append(this.left);
        LIZ.append(", top=");
        LIZ.append(this.top);
        LIZ.append(", right=");
        LIZ.append(this.right);
        LIZ.append(", bottom=");
        return C07670Rv.LIZ(LIZ, this.bottom, ')', LIZ);
    }

    public final double getBottom() {
        return this.bottom;
    }

    public final double getLeft() {
        return this.left;
    }

    public final double getRight() {
        return this.right;
    }

    public final double getTop() {
        return this.top;
    }

    public final String getType() {
        return this.type;
    }

    public final double getX() {
        return this.x;
    }

    public final double getY() {
        return this.y;
    }

    public AnoleComponentLayoutModel(String str, double d, double d2, double d3, double d4, double d5, double d6) {
        this.type = str;
        this.x = d;
        this.y = d2;
        this.left = d3;
        this.top = d4;
        this.right = d5;
        this.bottom = d6;
    }
}

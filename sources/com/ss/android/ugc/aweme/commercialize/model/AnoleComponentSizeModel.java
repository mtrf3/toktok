package com.ss.android.ugc.aweme.commercialize.model;

import X.C07670Rv;
import X.C16880lQ;
import X.C1JX;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AnoleComponentSizeModel implements Serializable {

    @InterfaceC65349Pkn("height")
    public final double height;

    @InterfaceC65349Pkn("type")
    public final String type;

    @InterfaceC65349Pkn("width")
    public final double width;

    public static /* synthetic */ AnoleComponentSizeModel copy$default(AnoleComponentSizeModel anoleComponentSizeModel, String str, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = anoleComponentSizeModel.type;
        }
        if ((i & 2) != 0) {
            d = anoleComponentSizeModel.width;
        }
        if ((i & 4) != 0) {
            d2 = anoleComponentSizeModel.height;
        }
        return anoleComponentSizeModel.copy(str, d, d2);
    }

    public final AnoleComponentSizeModel copy(String str, double d, double d2) {
        return new AnoleComponentSizeModel(str, d, d2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnoleComponentSizeModel)) {
            return false;
        }
        AnoleComponentSizeModel anoleComponentSizeModel = (AnoleComponentSizeModel) obj;
        return o.LJ(this.type, anoleComponentSizeModel.type) && Double.compare(this.width, anoleComponentSizeModel.width) == 0 && Double.compare(this.height, anoleComponentSizeModel.height) == 0;
    }

    public int hashCode() {
        int hashCode;
        String str = this.type;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return C16880lQ.LLJI(this.height) + C1JX.LIZIZ(this.width, hashCode * 31, 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnoleComponentSizeModel(type=");
        LIZ.append(this.type);
        LIZ.append(", width=");
        LIZ.append(this.width);
        LIZ.append(", height=");
        return C07670Rv.LIZ(LIZ, this.height, ')', LIZ);
    }

    public final double getHeight() {
        return this.height;
    }

    public final String getType() {
        return this.type;
    }

    public final double getWidth() {
        return this.width;
    }

    public AnoleComponentSizeModel(String str, double d, double d2) {
        this.type = str;
        this.width = d;
        this.height = d2;
    }
}

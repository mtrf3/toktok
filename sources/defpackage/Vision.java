package defpackage;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class Vision {

    @InterfaceC65349Pkn("checkBoxPos")
    public final Integer _checkBoxPos;

    @InterfaceC65349Pkn("hasSASAButton")
    public final Integer _hasSASAButton;

    @InterfaceC65349Pkn("ospEmptyMethodStyle")
    public final Integer _ospEmptyMethodStyle;

    @InterfaceC65349Pkn("saveCardPos")
    public final Integer _saveCardPos;

    /* JADX WARN: Multi-variable type inference failed */
    public Vision() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vision)) {
            return false;
        }
        Vision vision = (Vision) obj;
        return o.LJ(this._checkBoxPos, vision._checkBoxPos) && o.LJ(this._saveCardPos, vision._saveCardPos) && o.LJ(this._hasSASAButton, vision._hasSASAButton) && o.LJ(this._ospEmptyMethodStyle, vision._ospEmptyMethodStyle);
    }

    public final int hashCode() {
        Integer num = this._checkBoxPos;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this._saveCardPos;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this._hasSASAButton;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this._ospEmptyMethodStyle;
        return hashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Vision LIZ() {
        Vision vision = f0.LIZIZ.vision;
        if (vision == null) {
            return new Vision(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
        }
        return vision;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Vision(_checkBoxPos=");
        LIZ.append(this._checkBoxPos);
        LIZ.append(", _saveCardPos=");
        LIZ.append(this._saveCardPos);
        LIZ.append(", _hasSASAButton=");
        LIZ.append(this._hasSASAButton);
        LIZ.append(", _ospEmptyMethodStyle=");
        return s0.LIZJ(LIZ, this._ospEmptyMethodStyle, ')', LIZ);
    }

    public Vision(Integer num, Integer num2, Integer num3, Integer num4) {
        this._checkBoxPos = num;
        this._saveCardPos = num2;
        this._hasSASAButton = num3;
        this._ospEmptyMethodStyle = num4;
    }

    public /* synthetic */ Vision(Integer num, Integer num2, Integer num3, Integer num4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? 1 : num2, (i & 4) != 0 ? 1 : num3, (i & 8) != 0 ? 0 : num4);
    }
}

package X;

import com.lynx.react.bridge.ReadableArray;

/* renamed from: X.VRu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79754VRu {
    public final int LIZ;
    public final float LIZIZ;

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZIZ) + (this.LIZ * 31);
    }

    public C79754VRu(ReadableArray readableArray) {
        this.LIZIZ = (float) readableArray.getDouble(0);
        this.LIZ = readableArray.getInt(1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C79754VRu.class != obj.getClass()) {
            return false;
        }
        C79754VRu c79754VRu = (C79754VRu) obj;
        if (this.LIZIZ == c79754VRu.LIZIZ && this.LIZ == c79754VRu.LIZ) {
            return true;
        }
        return false;
    }
}

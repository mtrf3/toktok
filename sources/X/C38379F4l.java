package X;

import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;

/* renamed from: X.F4l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38379F4l implements F5B {
    public final ReadableArray LIZ;
    public final int LIZIZ;

    @Override // X.F5B
    public final void recycle() {
    }

    @Override // X.F5B
    public final ReadableArray asArray() {
        return this.LIZ.getArray(this.LIZIZ);
    }

    @Override // X.F5B
    public final boolean asBoolean() {
        return this.LIZ.getBoolean(this.LIZIZ);
    }

    @Override // X.F5B
    public final double asDouble() {
        return this.LIZ.getDouble(this.LIZIZ);
    }

    @Override // X.F5B
    public final int asInt() {
        return this.LIZ.getInt(this.LIZIZ);
    }

    @Override // X.F5B
    public final long asLong() {
        return this.LIZ.getLong(this.LIZIZ);
    }

    @Override // X.F5B
    public final ReadableMap asMap() {
        return this.LIZ.getMap(this.LIZIZ);
    }

    @Override // X.F5B
    public final String asString() {
        return this.LIZ.getString(this.LIZIZ);
    }

    @Override // X.F5B
    public final ReadableType getType() {
        return this.LIZ.getType(this.LIZIZ);
    }

    @Override // X.F5B
    public final boolean isNull() {
        return this.LIZ.isNull(this.LIZIZ);
    }

    public C38379F4l(int i, ReadableArray readableArray) {
        this.LIZ = readableArray;
        this.LIZIZ = i;
    }
}

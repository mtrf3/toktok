package X;

import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;

/* loaded from: classes7.dex */
public final class F4Z implements F5B {
    public final ReadableMap LIZ;
    public final String LIZIZ;

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

    public F4Z(ReadableMap readableMap, String str) {
        this.LIZ = readableMap;
        this.LIZIZ = str;
    }
}

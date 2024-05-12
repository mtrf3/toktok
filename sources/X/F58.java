package X;

import com.bytedance.ies.lynx.lynx_adapter.wrapper.DynamicWrapper;
import com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper;
import com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper;
import com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableTypeWrapper;
import com.lynx.react.bridge.ReadableMap;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class F58 implements ReadableMapWrapper {
    public final /* synthetic */ ReadableMap LIZ;

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
    public final int size() {
        return this.LIZ.size();
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
    public final HashMap<String, Object> toHashMap() {
        return this.LIZ.toHashMap();
    }

    public F58(ReadableMap readableMap) {
        this.LIZ = readableMap;
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
    public final ReadableArrayWrapper getArray(String str) {
        return C1FE.LIZ(this.LIZ.getArray(str));
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
    public final boolean getBoolean(String str) {
        return this.LIZ.getBoolean(str);
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
    public final byte[] getByteArray(String str) {
        return this.LIZ.getByteArray(str);
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
    public final double getDouble(String str) {
        return this.LIZ.getDouble(str);
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
    public final DynamicWrapper getDynamic(String str) {
        return new F5A(new F4Z(this.LIZ, str));
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
    public final int getInt(String str) {
        return this.LIZ.getInt(str);
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
    public final Long getLong(String str) {
        return Long.valueOf(this.LIZ.getLong(str));
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
    public final ReadableMapWrapper getMap(String str) {
        return C1FE.LIZIZ(this.LIZ.getMap(str));
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
    public final String getString(String str) {
        return this.LIZ.getString(str);
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
    public final ReadableTypeWrapper getType(String str) {
        return C1FE.LIZJ(this.LIZ.getType(str));
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
    public final boolean hasKey(String name) {
        o.LJIIJ(name, "name");
        return this.LIZ.hasKey(name);
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
    public final boolean isNull(String str) {
        return this.LIZ.isNull(str);
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
    public final ReadableArrayWrapper getArray(String name, ReadableArrayWrapper readableArrayWrapper) {
        o.LJIIJ(name, "name");
        F59 LIZ = C1FE.LIZ(this.LIZ.getArray(name));
        if (LIZ != null) {
            return LIZ;
        }
        return readableArrayWrapper;
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
    public final boolean getBoolean(String str, boolean z) {
        return this.LIZ.getBoolean(str, z);
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
    public final byte[] getByteArray(String str, byte[] defaultValue) {
        o.LJIIJ(defaultValue, "defaultValue");
        return this.LIZ.getByteArray(str, defaultValue);
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
    public final double getDouble(String str, double d) {
        return this.LIZ.getDouble(str, d);
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
    public final int getInt(String str, int i) {
        return this.LIZ.getInt(str, i);
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
    public final Long getLong(String str, long j) {
        return Long.valueOf(this.LIZ.getLong(str, j));
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
    public final ReadableMapWrapper getMap(String name, ReadableMapWrapper readableMapWrapper) {
        o.LJIIJ(name, "name");
        F58 LIZIZ = C1FE.LIZIZ(this.LIZ.getMap(name));
        if (LIZIZ != null) {
            return LIZIZ;
        }
        return readableMapWrapper;
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
    public final String getString(String str, String str2) {
        return this.LIZ.getString(str, str2);
    }
}

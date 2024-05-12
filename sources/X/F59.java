package X;

import com.bytedance.ies.lynx.lynx_adapter.wrapper.DynamicWrapper;
import com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper;
import com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper;
import com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableTypeWrapper;
import com.lynx.react.bridge.ReadableArray;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class F59 implements ReadableArrayWrapper {
    public final /* synthetic */ ReadableArray LIZ;

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
    public final int size() {
        return this.LIZ.size();
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
    public final ArrayList<Object> toArrayList() {
        return this.LIZ.toArrayList();
    }

    public F59(ReadableArray readableArray) {
        this.LIZ = readableArray;
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
    public final ReadableArrayWrapper getArray(int i) {
        return C1FE.LIZ(this.LIZ.getArray(i));
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
    public final boolean getBoolean(int i) {
        return this.LIZ.getBoolean(i);
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
    public final byte getByte(int i) {
        return this.LIZ.getByte(i);
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
    public final byte[] getByteArray(int i) {
        return this.LIZ.getByteArray(i);
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
    public final char getChar(int i) {
        return this.LIZ.getChar(i);
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
    public final double getDouble(int i) {
        return this.LIZ.getDouble(i);
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
    public final DynamicWrapper getDynamic(int i) {
        return new F5A(new C38379F4l(i, this.LIZ));
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
    public final int getInt(int i) {
        return this.LIZ.getInt(i);
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
    public final long getLong(int i) {
        return this.LIZ.getLong(i);
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
    public final ReadableMapWrapper getMap(int i) {
        return C1FE.LIZIZ(this.LIZ.getMap(i));
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
    public final short getShort(int i) {
        return this.LIZ.getShort(i);
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
    public final String getString(int i) {
        return this.LIZ.getString(i);
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
    public final ReadableTypeWrapper getType(int i) {
        return C1FE.LIZJ(this.LIZ.getType(i));
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
    public final boolean isNull(int i) {
        return this.LIZ.isNull(i);
    }
}

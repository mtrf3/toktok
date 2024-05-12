package X;

import com.bytedance.ies.lynx.lynx_adapter.wrapper.DynamicWrapper;
import com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper;
import com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper;
import com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableTypeWrapper;

/* loaded from: classes7.dex */
public final class F5A implements DynamicWrapper {
    public final /* synthetic */ F5B LIZ;

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.DynamicWrapper
    public final ReadableArrayWrapper asArray() {
        return C1FE.LIZ(this.LIZ.asArray());
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.DynamicWrapper
    public final boolean asBoolean() {
        return this.LIZ.asBoolean();
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.DynamicWrapper
    public final double asDouble() {
        return this.LIZ.asDouble();
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.DynamicWrapper
    public final int asInt() {
        return this.LIZ.asInt();
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.DynamicWrapper
    public final ReadableMapWrapper asMap() {
        return C1FE.LIZIZ(this.LIZ.asMap());
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.DynamicWrapper
    public final String asString() {
        return this.LIZ.asString();
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.DynamicWrapper
    public final ReadableTypeWrapper getType() {
        return C1FE.LIZJ(this.LIZ.getType());
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.DynamicWrapper
    public final boolean isNull() {
        return this.LIZ.isNull();
    }

    @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.DynamicWrapper
    public final void recycle() {
        this.LIZ.recycle();
    }

    public F5A(F5B f5b) {
        this.LIZ = f5b;
    }
}

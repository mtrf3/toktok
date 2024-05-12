package X;

import com.bytedance.ies.bullet.kit.lynx.api.BulletDynamic;
import com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray;
import com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap;
import com.bytedance.ies.bullet.kit.lynx.api.BulletReadableType;
import com.lynx.react.bridge.ReadableArray;

/* loaded from: classes7.dex */
public final class F5J implements BulletDynamic {
    public final /* synthetic */ F5B LIZ;

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletDynamic
    public final BulletReadableArray asArray() {
        ReadableArray asArray = this.LIZ.asArray();
        if (asArray == null) {
            return null;
        }
        return new F5H(asArray);
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletDynamic
    public final boolean asBoolean() {
        return this.LIZ.asBoolean();
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletDynamic
    public final double asDouble() {
        return this.LIZ.asDouble();
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletDynamic
    public final int asInt() {
        return this.LIZ.asInt();
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletDynamic
    public final BulletReadableMap asMap() {
        return OJY.LJIIZILJ(this.LIZ.asMap());
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletDynamic
    public final String asString() {
        return this.LIZ.asString();
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletDynamic
    public final BulletReadableType getType() {
        return OJY.LJIJ(this.LIZ.getType());
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletDynamic
    public final boolean isNull() {
        return this.LIZ.isNull();
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletDynamic
    public final void recycle() {
        this.LIZ.recycle();
    }

    public F5J(F5B f5b) {
        this.LIZ = f5b;
    }
}

package X;

import com.bytedance.ies.bullet.kit.lynx.api.BulletDynamic;
import com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray;
import com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap;
import com.bytedance.ies.bullet.kit.lynx.api.BulletReadableType;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class F5I implements BulletReadableMap {
    public final /* synthetic */ ReadableMap LIZ;

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
    public final int size() {
        return this.LIZ.size();
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
    public final HashMap<String, Object> toHashMap() {
        return this.LIZ.toHashMap();
    }

    public F5I(ReadableMap readableMap) {
        this.LIZ = readableMap;
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
    public final BulletReadableArray getArray(String str) {
        ReadableArray array = this.LIZ.getArray(str);
        if (array == null) {
            return null;
        }
        return new F5H(array);
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
    public final boolean getBoolean(String str) {
        return this.LIZ.getBoolean(str);
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
    public final double getDouble(String str) {
        return this.LIZ.getDouble(str);
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
    public final BulletDynamic getDynamic(String str) {
        return new F5J(new F4Z(this.LIZ, str));
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
    public final int getInt(String str) {
        return this.LIZ.getInt(str);
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
    public final BulletReadableMap getMap(String str) {
        return OJY.LJIIZILJ(this.LIZ.getMap(str));
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
    public final String getString(String str) {
        return this.LIZ.getString(str);
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
    public final BulletReadableType getType(String str) {
        return OJY.LJIJ(this.LIZ.getType(str));
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
    public final boolean hasKey(String name) {
        o.LJIIJ(name, "name");
        return this.LIZ.hasKey(name);
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
    public final boolean isNull(String str) {
        return this.LIZ.isNull(str);
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
    public final BulletReadableArray getArray(String name, BulletReadableArray bulletReadableArray) {
        o.LJIIJ(name, "name");
        ReadableArray array = this.LIZ.getArray(name);
        if (array == null) {
            return bulletReadableArray;
        }
        return new F5H(array);
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
    public final boolean getBoolean(String str, boolean z) {
        return this.LIZ.getBoolean(str, z);
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
    public final double getDouble(String str, double d) {
        return this.LIZ.getDouble(str, d);
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
    public final int getInt(String str, int i) {
        return this.LIZ.getInt(str, i);
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
    public final BulletReadableMap getMap(String name, BulletReadableMap bulletReadableMap) {
        o.LJIIJ(name, "name");
        F5I LJIIZILJ = OJY.LJIIZILJ(this.LIZ.getMap(name));
        if (LJIIZILJ != null) {
            return LJIIZILJ;
        }
        return bulletReadableMap;
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
    public final String getString(String str, String str2) {
        return this.LIZ.getString(str, str2);
    }
}

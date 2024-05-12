package X;

import com.bytedance.ies.bullet.kit.lynx.api.BulletDynamic;
import com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray;
import com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap;
import com.bytedance.ies.bullet.kit.lynx.api.BulletReadableType;
import com.lynx.react.bridge.ReadableArray;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class F5H implements BulletReadableArray {
    public final /* synthetic */ ReadableArray LIZ;

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
    public final int size() {
        return this.LIZ.size();
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
    public final ArrayList<Object> toArrayList() {
        return this.LIZ.toArrayList();
    }

    public F5H(ReadableArray readableArray) {
        this.LIZ = readableArray;
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
    public final BulletReadableArray getArray(int i) {
        ReadableArray array = this.LIZ.getArray(i);
        if (array == null) {
            return null;
        }
        return new F5H(array);
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
    public final boolean getBoolean(int i) {
        return this.LIZ.getBoolean(i);
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
    public final byte getByte(int i) {
        return this.LIZ.getByte(i);
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
    public final char getChar(int i) {
        return this.LIZ.getChar(i);
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
    public final double getDouble(int i) {
        return this.LIZ.getDouble(i);
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
    public final BulletDynamic getDynamic(int i) {
        return new F5J(new C38379F4l(i, this.LIZ));
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
    public final int getInt(int i) {
        return this.LIZ.getInt(i);
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
    public final long getLong(int i) {
        return this.LIZ.getLong(i);
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
    public final BulletReadableMap getMap(int i) {
        return OJY.LJIIZILJ(this.LIZ.getMap(i));
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
    public final short getShort(int i) {
        return this.LIZ.getShort(i);
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
    public final String getString(int i) {
        return this.LIZ.getString(i);
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
    public final BulletReadableType getType(int i) {
        return OJY.LJIJ(this.LIZ.getType(i));
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
    public final boolean isNull(int i) {
        return this.LIZ.isNull(i);
    }
}

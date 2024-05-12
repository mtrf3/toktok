package X;

import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.VVm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79850VVm implements InterfaceC78280Uns {
    public final ReadableMap LIZ;

    @Override // X.InterfaceC78280Uns
    public final UFL LIZ() {
        ReadableMapKeySetIterator keySetIterator = this.LIZ.keySetIterator();
        o.LJFF(keySetIterator, "origin.keySetIterator()");
        return new C79849VVl(keySetIterator);
    }

    @Override // X.InterfaceC78280Uns
    public final java.util.Map<String, Object> LIZIZ() {
        HashMap<String, Object> hashMap = this.LIZ.toHashMap();
        o.LJFF(hashMap, "origin.toHashMap()");
        return hashMap;
    }

    public C79850VVm(ReadableMap origin) {
        o.LJIIJ(origin, "origin");
        this.LIZ = origin;
    }

    @Override // X.InterfaceC78280Uns
    public final InterfaceC78505UrV get(String name) {
        o.LJIIJ(name, "name");
        F5B dynamic = this.LIZ.getDynamic(name);
        o.LJFF(dynamic, "origin.getDynamic(name)");
        return new C79852VVo(dynamic);
    }

    @Override // X.InterfaceC78280Uns
    public final InterfaceC78502UrS getArray(String name) {
        o.LJIIJ(name, "name");
        ReadableArray array = this.LIZ.getArray(name);
        if (array == null) {
            return null;
        }
        return new C79851VVn(array);
    }

    @Override // X.InterfaceC78280Uns
    public final boolean getBoolean(String name) {
        o.LJIIJ(name, "name");
        return this.LIZ.getBoolean(name);
    }

    @Override // X.InterfaceC78280Uns
    public final double getDouble(String name) {
        o.LJIIJ(name, "name");
        return this.LIZ.getDouble(name);
    }

    @Override // X.InterfaceC78280Uns
    public final int getInt(String name) {
        o.LJIIJ(name, "name");
        return this.LIZ.getInt(name);
    }

    @Override // X.InterfaceC78280Uns
    public final InterfaceC78280Uns getMap(String name) {
        o.LJIIJ(name, "name");
        ReadableMap map = this.LIZ.getMap(name);
        if (map == null) {
            return null;
        }
        return new C79850VVm(map);
    }

    @Override // X.InterfaceC78280Uns
    public final String getString(String name) {
        o.LJIIJ(name, "name");
        String string = this.LIZ.getString(name);
        o.LJFF(string, "origin.getString(name)");
        return string;
    }

    @Override // X.InterfaceC78280Uns
    public final EnumC78522Urm getType(String name) {
        o.LJIIJ(name, "name");
        ReadableType type = this.LIZ.getType(name);
        if (type != null) {
            switch (C38372F4e.LIZ[type.ordinal()]) {
                case 1:
                    return EnumC78522Urm.Null;
                case 2:
                    return EnumC78522Urm.Array;
                case 3:
                    return EnumC78522Urm.Boolean;
                case 4:
                    return EnumC78522Urm.Map;
                case 5:
                    return EnumC78522Urm.Number;
                case 6:
                    return EnumC78522Urm.String;
                case 7:
                    return EnumC78522Urm.Int;
            }
        }
        return EnumC78522Urm.Null;
    }

    @Override // X.InterfaceC78280Uns
    public final boolean hasKey(String name) {
        o.LJIIJ(name, "name");
        return this.LIZ.hasKey(name);
    }

    @Override // X.InterfaceC78280Uns
    public final boolean isNull(String str) {
        return this.LIZ.isNull(str);
    }
}

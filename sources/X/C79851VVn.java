package X;

import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.VVn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79851VVn implements InterfaceC78502UrS {
    public final ReadableArray LIZ;

    @Override // X.InterfaceC78502UrS
    public final List<Object> LIZ() {
        ArrayList<Object> arrayList = this.LIZ.toArrayList();
        o.LJFF(arrayList, "origin.toArrayList()");
        return arrayList;
    }

    @Override // X.InterfaceC78502UrS
    public final int size() {
        return this.LIZ.size();
    }

    public C79851VVn(ReadableArray readableArray) {
        this.LIZ = readableArray;
    }

    @Override // X.InterfaceC78502UrS
    public final InterfaceC78505UrV get(int i) {
        F5B dynamic = this.LIZ.getDynamic(i);
        o.LJFF(dynamic, "origin.getDynamic(index)");
        return new C79852VVo(dynamic);
    }

    @Override // X.InterfaceC78502UrS
    public final InterfaceC78502UrS getArray(int i) {
        ReadableArray array = this.LIZ.getArray(i);
        if (array == null) {
            return null;
        }
        return new C79851VVn(array);
    }

    @Override // X.InterfaceC78502UrS
    public final boolean getBoolean(int i) {
        return this.LIZ.getBoolean(i);
    }

    @Override // X.InterfaceC78502UrS
    public final double getDouble(int i) {
        return this.LIZ.getDouble(i);
    }

    @Override // X.InterfaceC78502UrS
    public final int getInt(int i) {
        return this.LIZ.getInt(i);
    }

    @Override // X.InterfaceC78502UrS
    public final InterfaceC78280Uns getMap(int i) {
        ReadableMap map = this.LIZ.getMap(i);
        if (map == null) {
            return null;
        }
        return new C79850VVm(map);
    }

    @Override // X.InterfaceC78502UrS
    public final String getString(int i) {
        String string = this.LIZ.getString(i);
        o.LJFF(string, "origin.getString(index)");
        return string;
    }

    @Override // X.InterfaceC78502UrS
    public final EnumC78522Urm getType(int i) {
        ReadableType type = this.LIZ.getType(i);
        if (type != null) {
            switch (C38371F4d.LIZ[type.ordinal()]) {
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
}

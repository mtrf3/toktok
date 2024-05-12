package X;

import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;
import kotlin.jvm.internal.o;

/* renamed from: X.VVo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79852VVo implements InterfaceC78505UrV {
    public final F5B LIZ;

    @Override // X.InterfaceC78505UrV
    public final InterfaceC78502UrS asArray() {
        ReadableArray asArray = this.LIZ.asArray();
        if (asArray == null) {
            return null;
        }
        return new C79851VVn(asArray);
    }

    @Override // X.InterfaceC78505UrV
    public final boolean asBoolean() {
        return this.LIZ.asBoolean();
    }

    @Override // X.InterfaceC78505UrV
    public final double asDouble() {
        return this.LIZ.asDouble();
    }

    @Override // X.InterfaceC78505UrV
    public final int asInt() {
        return this.LIZ.asInt();
    }

    @Override // X.InterfaceC78505UrV
    public final InterfaceC78280Uns asMap() {
        ReadableMap asMap = this.LIZ.asMap();
        if (asMap == null) {
            return null;
        }
        return new C79850VVm(asMap);
    }

    @Override // X.InterfaceC78505UrV
    public final String asString() {
        String asString = this.LIZ.asString();
        o.LJFF(asString, "origin.asString()");
        return asString;
    }

    @Override // X.InterfaceC78505UrV
    public final EnumC78522Urm getType() {
        ReadableType type = this.LIZ.getType();
        if (type != null) {
            switch (C38370F4c.LIZ[type.ordinal()]) {
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

    public C79852VVo(F5B f5b) {
        this.LIZ = f5b;
    }
}

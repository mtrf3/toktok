package X;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Us3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78539Us3 implements InterfaceC78505UrV {
    public final Object LIZ;

    @Override // X.InterfaceC78505UrV
    public final InterfaceC78502UrS asArray() {
        Object obj = this.LIZ;
        if (obj instanceof JSONArray) {
            return new C78534Ury((JSONArray) obj);
        }
        throw new Exception("Dynamic is not JSONArray");
    }

    @Override // X.InterfaceC78505UrV
    public final boolean asBoolean() {
        Object obj = this.LIZ;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        throw new Exception("Dynamic is not Boolean");
    }

    @Override // X.InterfaceC78505UrV
    public final double asDouble() {
        Object obj = this.LIZ;
        if (obj instanceof Double) {
            return ((Number) obj).doubleValue();
        }
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof Float) {
            return ((Number) obj).floatValue();
        }
        if (obj instanceof Long) {
            return ((Number) obj).longValue();
        }
        throw new Exception("Dynamic is not Double");
    }

    @Override // X.InterfaceC78505UrV
    public final int asInt() {
        Object obj = this.LIZ;
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        throw new Exception("Dynamic is not Int");
    }

    @Override // X.InterfaceC78505UrV
    public final InterfaceC78280Uns asMap() {
        Object obj = this.LIZ;
        if (obj instanceof JSONObject) {
            return new C78529Urt((JSONObject) obj);
        }
        throw new Exception("Dynamic is not JSONObject");
    }

    @Override // X.InterfaceC78505UrV
    public final String asString() {
        Object obj = this.LIZ;
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new Exception("Dynamic is not String");
    }

    @Override // X.InterfaceC78505UrV
    public final EnumC78522Urm getType() {
        Object obj = this.LIZ;
        if (obj instanceof JSONArray) {
            return EnumC78522Urm.Array;
        }
        if (obj instanceof Boolean) {
            return EnumC78522Urm.Boolean;
        }
        if (obj instanceof JSONObject) {
            return EnumC78522Urm.Map;
        }
        if (obj instanceof Number) {
            return EnumC78522Urm.Number;
        }
        if (obj instanceof String) {
            return EnumC78522Urm.String;
        }
        return EnumC78522Urm.Null;
    }

    public C78539Us3(Object obj) {
        this.LIZ = obj;
    }
}

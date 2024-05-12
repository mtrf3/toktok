package X;

import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Urw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78532Urw implements InterfaceC78502UrS {
    public final JSONArray LIZ;

    @Override // X.InterfaceC78502UrS
    public final List<Object> LIZ() {
        return C38382F4o.LIZ(this.LIZ);
    }

    @Override // X.InterfaceC78502UrS
    public final int size() {
        return this.LIZ.length();
    }

    public C78532Urw(JSONArray origin) {
        o.LJIIJ(origin, "origin");
        this.LIZ = origin;
    }

    @Override // X.InterfaceC78502UrS
    public final InterfaceC78505UrV get(int i) {
        return new C78536Us0(this.LIZ.opt(i));
    }

    @Override // X.InterfaceC78502UrS
    public final InterfaceC78502UrS getArray(int i) {
        JSONArray optJSONArray = this.LIZ.optJSONArray(i);
        if (optJSONArray == null) {
            return null;
        }
        return new C78532Urw(optJSONArray);
    }

    @Override // X.InterfaceC78502UrS
    public final boolean getBoolean(int i) {
        return this.LIZ.optBoolean(i);
    }

    @Override // X.InterfaceC78502UrS
    public final double getDouble(int i) {
        return this.LIZ.optDouble(i);
    }

    @Override // X.InterfaceC78502UrS
    public final int getInt(int i) {
        return this.LIZ.optInt(i);
    }

    @Override // X.InterfaceC78502UrS
    public final InterfaceC78280Uns getMap(int i) {
        JSONObject optJSONObject = this.LIZ.optJSONObject(i);
        if (optJSONObject == null) {
            return null;
        }
        return new C78531Urv(optJSONObject);
    }

    @Override // X.InterfaceC78502UrS
    public final String getString(int i) {
        String optString = this.LIZ.optString(i);
        o.LJFF(optString, "origin.optString(index)");
        return optString;
    }

    @Override // X.InterfaceC78502UrS
    public final EnumC78522Urm getType(int i) {
        Object opt = this.LIZ.opt(i);
        if (opt instanceof JSONArray) {
            return EnumC78522Urm.Array;
        }
        if (opt instanceof Boolean) {
            return EnumC78522Urm.Boolean;
        }
        if (opt instanceof JSONObject) {
            return EnumC78522Urm.Map;
        }
        if (opt instanceof Integer) {
            return EnumC78522Urm.Int;
        }
        if (opt instanceof Number) {
            return EnumC78522Urm.Number;
        }
        if (opt instanceof String) {
            return EnumC78522Urm.String;
        }
        return EnumC78522Urm.Null;
    }
}

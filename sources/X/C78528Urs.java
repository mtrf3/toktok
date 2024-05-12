package X;

import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Urs, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78528Urs implements InterfaceC78280Uns {
    public final JSONObject LIZ;

    @Override // X.InterfaceC78280Uns
    public final UFL LIZ() {
        Iterator<String> keys = this.LIZ.keys();
        o.LJFF(keys, "origin.keys()");
        return new C77329UWn(keys);
    }

    @Override // X.InterfaceC78280Uns
    public final java.util.Map<String, Object> LIZIZ() {
        return C38384F4q.LIZIZ(this.LIZ);
    }

    public C78528Urs(JSONObject origin) {
        o.LJIIJ(origin, "origin");
        this.LIZ = origin;
    }

    @Override // X.InterfaceC78280Uns
    public final InterfaceC78505UrV get(String name) {
        o.LJIIJ(name, "name");
        return new C78537Us1(this.LIZ.opt(name));
    }

    @Override // X.InterfaceC78280Uns
    public final InterfaceC78502UrS getArray(String name) {
        o.LJIIJ(name, "name");
        JSONArray optJSONArray = this.LIZ.optJSONArray(name);
        if (optJSONArray == null) {
            return null;
        }
        return new C78533Urx(optJSONArray);
    }

    @Override // X.InterfaceC78280Uns
    public final boolean getBoolean(String name) {
        o.LJIIJ(name, "name");
        return this.LIZ.optBoolean(name);
    }

    @Override // X.InterfaceC78280Uns
    public final double getDouble(String name) {
        o.LJIIJ(name, "name");
        return this.LIZ.optDouble(name);
    }

    @Override // X.InterfaceC78280Uns
    public final int getInt(String name) {
        o.LJIIJ(name, "name");
        return this.LIZ.optInt(name);
    }

    @Override // X.InterfaceC78280Uns
    public final InterfaceC78280Uns getMap(String name) {
        o.LJIIJ(name, "name");
        JSONObject optJSONObject = this.LIZ.optJSONObject(name);
        if (optJSONObject == null) {
            return null;
        }
        return new C78528Urs(optJSONObject);
    }

    @Override // X.InterfaceC78280Uns
    public final String getString(String name) {
        o.LJIIJ(name, "name");
        String optString = this.LIZ.optString(name);
        o.LJFF(optString, "origin.optString(name)");
        return optString;
    }

    @Override // X.InterfaceC78280Uns
    public final EnumC78522Urm getType(String name) {
        o.LJIIJ(name, "name");
        Object opt = this.LIZ.opt(name);
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

    @Override // X.InterfaceC78280Uns
    public final boolean hasKey(String name) {
        o.LJIIJ(name, "name");
        return this.LIZ.has(name);
    }

    @Override // X.InterfaceC78280Uns
    public final boolean isNull(String str) {
        return this.LIZ.isNull(str);
    }
}

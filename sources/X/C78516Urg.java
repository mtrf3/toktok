package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.ies.xbridge.base.utils.StorageValue;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Urg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78516Urg implements InterfaceC32666Cru {
    public static final C72266SXu LIZIZ = new C72266SXu();
    public final SharedPreferences LIZ;

    @Override // X.InterfaceC32666Cru
    public final java.util.Set<String> LJII() {
        return this.LIZ.getAll().keySet();
    }

    public C78516Urg(Context context) {
        SharedPreferences LIZIZ2 = F9J.LIZIZ(context, 0, "xbridge-storage");
        o.LJFF(LIZIZ2, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.LIZ = LIZIZ2;
    }

    @Override // X.InterfaceC32666Cru
    public final Object LIZLLL(String str) {
        if (str == null || !this.LIZ.contains(str)) {
            return null;
        }
        String string = this.LIZ.getString(str, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        if (string != null) {
            StorageValue storageValue = (StorageValue) C78519Urj.LIZ(string, StorageValue.class);
            String str2 = storageValue.value;
            switch (C78511Urb.LIZ[EnumC78522Urm.valueOf(storageValue.type).ordinal()]) {
                case 1:
                    return Boolean.valueOf(Boolean.parseBoolean(str2));
                case 2:
                    return Integer.valueOf(CastIntegerProtector.parseInt(str2));
                case 3:
                    return Double.valueOf(CastDoubleProtector.parseDouble(str2));
                case 4:
                    return str2;
                case 5:
                    return C78519Urj.LIZ(str2, List.class);
                case 6:
                    return C78519Urj.LIZ(str2, java.util.Map.class);
                default:
                    return null;
            }
        }
        o.LJIIZILJ();
        throw null;
    }

    @Override // X.InterfaceC32666Cru
    public final boolean LJFF(String str) {
        if (str != null) {
            SharedPreferences.Editor edit = this.LIZ.edit();
            o.LJFF(edit, "sharedPreferences.edit()");
            edit.remove(str).apply();
            return true;
        }
        return false;
    }

    public final String LJIIJ(Object obj) {
        new LinkedHashMap();
        if (obj instanceof Boolean) {
            return C78519Urj.LIZIZ(new StorageValue(EnumC78522Urm.Boolean.name(), obj.toString()));
        }
        if (obj instanceof Integer) {
            return C78519Urj.LIZIZ(new StorageValue(EnumC78522Urm.Int.name(), obj.toString()));
        }
        if (obj instanceof Double) {
            return C78519Urj.LIZIZ(new StorageValue(EnumC78522Urm.Number.name(), obj.toString()));
        }
        if (obj instanceof String) {
            return C78519Urj.LIZIZ(new StorageValue(EnumC78522Urm.String.name(), obj.toString()));
        }
        if (obj instanceof InterfaceC78502UrS) {
            return LJIIJ(((InterfaceC78502UrS) obj).LIZ());
        }
        if (obj instanceof InterfaceC78280Uns) {
            return LJIIJ(((InterfaceC78280Uns) obj).LIZIZ());
        }
        if (obj instanceof List) {
            return C78519Urj.LIZIZ(new StorageValue(EnumC78522Urm.Array.name(), C78519Urj.LIZIZ(obj)));
        }
        if (obj instanceof java.util.Map) {
            return C78519Urj.LIZIZ(new StorageValue(EnumC78522Urm.Map.name(), C78519Urj.LIZIZ(obj)));
        }
        return "";
    }

    @Override // X.InterfaceC32666Cru
    public final boolean LIZIZ(String str, String str2) {
        return C78520Urk.LIZIZ(this, str, str2);
    }

    @Override // X.InterfaceC32666Cru
    public final boolean LJIIIIZZ(Object obj, String str) {
        if (str != null && obj != null) {
            SharedPreferences.Editor edit = this.LIZ.edit();
            o.LJFF(edit, "sharedPreferences.edit()");
            edit.putString(str, LJIIJ(obj)).apply();
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC32666Cru
    public final Object LJIIIZ(String str, String str2) {
        return C78520Urk.LIZ(this, str, str2);
    }

    @Override // X.InterfaceC32666Cru
    public final boolean LIZ(String str, Object obj, String str2) {
        return C78520Urk.LIZJ(this, str, str2, obj);
    }
}

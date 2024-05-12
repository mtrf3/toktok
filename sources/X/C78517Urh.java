package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.ies.xbridge.storage.utils.StorageValue;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Urh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78517Urh implements InterfaceC78521Url {
    public static final C78526Urq LIZJ = new C78526Urq();
    public final SharedPreferences LIZ;
    public final Context LIZIZ;

    @Override // X.InterfaceC32666Cru
    public final java.util.Set<String> LJII() {
        java.util.Map<String, ?> all;
        java.util.Set<String> keySet;
        SharedPreferences sharedPreferences = this.LIZ;
        if (sharedPreferences != null && (all = sharedPreferences.getAll()) != null && (keySet = all.keySet()) != null) {
            return keySet;
        }
        return OQY.INSTANCE;
    }

    public C78517Urh(Context context) {
        this.LIZIZ = context;
        this.LIZ = F9J.LIZIZ(context, 0, "xbridge-storage");
    }

    public static final Object LJIIJ(String str) {
        StorageValue storageValue = (StorageValue) C78518Uri.LIZ(str, StorageValue.class);
        String str2 = storageValue.value;
        switch (C78510Ura.LIZ[EnumC78522Urm.valueOf(storageValue.type).ordinal()]) {
            case 1:
                return Boolean.valueOf(Boolean.parseBoolean(str2));
            case 2:
                return Integer.valueOf(CastIntegerProtector.parseInt(str2));
            case 3:
                return Double.valueOf(CastDoubleProtector.parseDouble(str2));
            case 4:
                return str2;
            case 5:
                return C78518Uri.LIZ(str2, List.class);
            case 6:
                return C78518Uri.LIZ(str2, java.util.Map.class);
            default:
                return null;
        }
    }

    @Override // X.InterfaceC32666Cru
    public final Object LIZLLL(String str) {
        SharedPreferences sharedPreferences;
        if (str == null || (sharedPreferences = this.LIZ) == null || !sharedPreferences.contains(str)) {
            return null;
        }
        String string = sharedPreferences.getString(str, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        if (string != null) {
            return LJIIJ(string);
        }
        o.LJIIZILJ();
        throw null;
    }

    @Override // X.InterfaceC32666Cru
    public final boolean LJFF(String str) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor remove;
        if (str != null && (sharedPreferences = this.LIZ) != null && (edit = sharedPreferences.edit()) != null && (remove = edit.remove(str)) != null) {
            remove.apply();
            return true;
        }
        return false;
    }

    public final String LJIIJJI(Object obj) {
        new LinkedHashMap();
        if (obj instanceof Boolean) {
            return C78518Uri.LIZIZ(new StorageValue(EnumC78522Urm.Boolean.name(), obj.toString()));
        }
        if (obj instanceof Integer) {
            return C78518Uri.LIZIZ(new StorageValue(EnumC78522Urm.Int.name(), obj.toString()));
        }
        if (obj instanceof Double) {
            return C78518Uri.LIZIZ(new StorageValue(EnumC78522Urm.Number.name(), obj.toString()));
        }
        if (obj instanceof String) {
            return C78518Uri.LIZIZ(new StorageValue(EnumC78522Urm.String.name(), obj.toString()));
        }
        if (obj instanceof InterfaceC78502UrS) {
            return LJIIJJI(((InterfaceC78502UrS) obj).LIZ());
        }
        if (obj instanceof InterfaceC78280Uns) {
            return LJIIJJI(((InterfaceC78280Uns) obj).LIZIZ());
        }
        if (obj instanceof List) {
            return C78518Uri.LIZIZ(new StorageValue(EnumC78522Urm.Array.name(), C78518Uri.LIZIZ(obj)));
        }
        if (obj instanceof java.util.Map) {
            return C78518Uri.LIZIZ(new StorageValue(EnumC78522Urm.Map.name(), C78518Uri.LIZIZ(obj)));
        }
        return "";
    }

    @Override // X.InterfaceC32666Cru
    public final boolean LIZIZ(String str, String str2) {
        return C78520Urk.LIZIZ(this, str, str2);
    }

    @Override // X.InterfaceC78521Url
    public final Object LJ(String biz, String str) {
        Context context;
        o.LJIIJ(biz, "biz");
        if (str != null && (context = this.LIZIZ) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(biz);
            LIZ.append("-xbridge-storage");
            SharedPreferences LIZIZ = F9J.LIZIZ(context, 0, X1D.LIZIZ(LIZ));
            if (LIZIZ == null || !LIZIZ.contains(str)) {
                return null;
            }
            String string = LIZIZ.getString(str, "");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            if (string != null) {
                return LJIIJ(string);
            }
            o.LJIIZILJ();
            throw null;
        }
        return null;
    }

    @Override // X.InterfaceC78521Url
    public final boolean LJI(String biz, String str) {
        Context context;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor remove;
        o.LJIIJ(biz, "biz");
        if (str != null && (context = this.LIZIZ) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(biz);
            LIZ.append("-xbridge-storage");
            SharedPreferences LIZIZ = F9J.LIZIZ(context, 0, X1D.LIZIZ(LIZ));
            if (LIZIZ != null && (edit = LIZIZ.edit()) != null && (remove = edit.remove(str)) != null) {
                remove.apply();
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC32666Cru
    public final boolean LJIIIIZZ(Object obj, String str) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putString;
        if (str != null && obj != null && (sharedPreferences = this.LIZ) != null && (edit = sharedPreferences.edit()) != null && (putString = edit.putString(str, LJIIJJI(obj))) != null) {
            putString.apply();
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

    @Override // X.InterfaceC78521Url
    public final boolean LIZJ(String biz, Object obj, String str) {
        Context context;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putString;
        o.LJIIJ(biz, "biz");
        if (str != null && obj != null && (context = this.LIZIZ) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(biz);
            LIZ.append("-xbridge-storage");
            SharedPreferences LIZIZ = F9J.LIZIZ(context, 0, X1D.LIZIZ(LIZ));
            if (LIZIZ != null && (edit = LIZIZ.edit()) != null && (putString = edit.putString(str, LJIIJJI(obj))) != null) {
                putString.apply();
                return true;
            }
        }
        return false;
    }
}

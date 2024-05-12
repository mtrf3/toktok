package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.J0g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48462J0g {
    public final Object LIZ;

    public final HashMap LIZ() {
        C49017JLp c49017JLp = new C49017JLp();
        ((InterfaceC88472Yns) this.LIZ).invoke(c49017JLp);
        C48463J0h c48463J0h = new C48463J0h();
        c49017JLp.LIZIZ.invoke(c48463J0h);
        HashMap hashMap = new HashMap();
        hashMap.putAll(c49017JLp.LIZ);
        hashMap.putAll(c48463J0h.LIZ);
        return hashMap;
    }

    public final HashMap LIZJ() {
        C49017JLp c49017JLp = new C49017JLp();
        ((InterfaceC88472Yns) this.LIZ).invoke(c49017JLp);
        C48463J0h c48463J0h = new C48463J0h();
        c49017JLp.LIZJ.invoke(c48463J0h);
        HashMap hashMap = new HashMap();
        hashMap.putAll(c49017JLp.LIZ);
        hashMap.putAll(c48463J0h.LIZ);
        return hashMap;
    }

    public C48462J0g() {
        Gson gson = C09650Zl.LIZIZ;
        o.LJIIIIZZ(gson, "get()");
        this.LIZ = gson;
    }

    public /* synthetic */ C48462J0g(InterfaceC88472Yns builder) {
        o.LJIIIZ(builder, "builder");
        this.LIZ = builder;
    }

    public Keva LIZIZ(String str) {
        Keva repoFromSp = KevaImpl.getRepoFromSp(C78598Ut0.LJIIJ(), str, 0);
        o.LJIIIIZZ(repoFromSp, "getRepoFromSp(getContext…ants.MODE_SINGLE_PROCESS)");
        return repoFromSp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object LIZLLL(C48458J0c key) {
        boolean z;
        String str;
        o.LJIIIZ(key, "key");
        try {
            String str2 = key.LIZLLL;
            o.LJIIIIZZ(str2, "key.kevaName");
            if (!LIZIZ(str2).contains(key.LIZJ)) {
                return key.LJFF;
            }
            if (o.LJ(key.LJI, Boolean.class)) {
                String str3 = key.LIZLLL;
                o.LJIIIIZZ(str3, "key.kevaName");
                Keva LIZIZ = LIZIZ(str3);
                String str4 = key.LIZJ;
                T t = key.LJFF;
                o.LJII(t, "null cannot be cast to non-null type kotlin.Boolean");
                return Boolean.valueOf(LIZIZ.getBoolean(str4, ((Boolean) t).booleanValue()));
            }
            if (o.LJ(key.LJI, Integer.class)) {
                String str5 = key.LIZLLL;
                o.LJIIIIZZ(str5, "key.kevaName");
                Keva LIZIZ2 = LIZIZ(str5);
                String str6 = key.LIZJ;
                T t2 = key.LJFF;
                o.LJII(t2, "null cannot be cast to non-null type kotlin.Int");
                return Integer.valueOf(LIZIZ2.getInt(str6, ((Integer) t2).intValue()));
            }
            if (o.LJ(key.LJI, Float.class)) {
                String str7 = key.LIZLLL;
                o.LJIIIIZZ(str7, "key.kevaName");
                Keva LIZIZ3 = LIZIZ(str7);
                String str8 = key.LIZJ;
                T t3 = key.LJFF;
                o.LJII(t3, "null cannot be cast to non-null type kotlin.Float");
                return Float.valueOf(LIZIZ3.getFloat(str8, ((Float) t3).floatValue()));
            }
            if (o.LJ(key.LJI, Long.class)) {
                String str9 = key.LIZLLL;
                o.LJIIIIZZ(str9, "key.kevaName");
                Keva LIZIZ4 = LIZIZ(str9);
                String str10 = key.LIZJ;
                T t4 = key.LJFF;
                o.LJII(t4, "null cannot be cast to non-null type kotlin.Long");
                return Long.valueOf(LIZIZ4.getLong(str10, ((Long) t4).longValue()));
            }
            if (o.LJ(key.LJI, Double.class)) {
                String str11 = key.LIZLLL;
                o.LJIIIIZZ(str11, "key.kevaName");
                Keva LIZIZ5 = LIZIZ(str11);
                String str12 = key.LIZJ;
                T t5 = key.LJFF;
                o.LJII(t5, "null cannot be cast to non-null type kotlin.Double");
                return Double.valueOf(LIZIZ5.getDouble(str12, ((Double) t5).doubleValue()));
            }
            if (o.LJ(key.LJI, String.class)) {
                String str13 = key.LIZLLL;
                o.LJIIIIZZ(str13, "key.kevaName");
                Keva LIZIZ6 = LIZIZ(str13);
                String str14 = key.LIZJ;
                T t6 = key.LJFF;
                if (t6 instanceof String) {
                    str = (String) t6;
                } else {
                    str = null;
                }
                String string = LIZIZ6.getString(str14, str);
                if (string == null) {
                    return null;
                }
                return string;
            }
            String str15 = key.LIZLLL;
            o.LJIIIIZZ(str15, "key.kevaName");
            String str16 = key.LIZJ;
            o.LJIIIIZZ(str16, "key.name");
            Class<T> cls = key.LJI;
            o.LJIIIIZZ(cls, "key.type");
            T t7 = key.LJFF;
            String string2 = LIZIZ(str15).getString(str16, "");
            o.LJIIIIZZ(string2, "getKeva(kevaName).getString(name, \"\")");
            Object fromJson = GsonProtectorUtils.fromJson((Gson) this.LIZ, string2, (Class<Object>) cls);
            if (fromJson != null) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return t7;
            }
            return fromJson;
        } catch (Exception unused) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getValue() failed! The key name is ");
            C1EW.LIZLLL(LIZ, key.LIZJ, LIZ, "PropertyKeva");
            return key.LJFF;
        }
    }

    public void LJ(C48458J0c key, Object obj) {
        boolean z;
        o.LJIIIZ(key, "key");
        if (obj == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String str = key.LIZLLL;
            o.LJIIIIZZ(str, "key.kevaName");
            LIZIZ(str).erase(key.LIZJ);
            return;
        }
        if (o.LJ(key.LJI, Boolean.class)) {
            String str2 = key.LIZLLL;
            o.LJIIIIZZ(str2, "key.kevaName");
            Keva LIZIZ = LIZIZ(str2);
            String str3 = key.LIZJ;
            o.LJII(obj, "null cannot be cast to non-null type kotlin.Boolean");
            LIZIZ.storeBoolean(str3, ((Boolean) obj).booleanValue());
            return;
        }
        if (o.LJ(key.LJI, Integer.class)) {
            String str4 = key.LIZLLL;
            o.LJIIIIZZ(str4, "key.kevaName");
            Keva LIZIZ2 = LIZIZ(str4);
            String str5 = key.LIZJ;
            o.LJII(obj, "null cannot be cast to non-null type kotlin.Int");
            LIZIZ2.storeInt(str5, ((Integer) obj).intValue());
            return;
        }
        if (o.LJ(key.LJI, Float.class)) {
            String str6 = key.LIZLLL;
            o.LJIIIIZZ(str6, "key.kevaName");
            Keva LIZIZ3 = LIZIZ(str6);
            String str7 = key.LIZJ;
            o.LJII(obj, "null cannot be cast to non-null type kotlin.Float");
            LIZIZ3.storeFloat(str7, ((Float) obj).floatValue());
            return;
        }
        if (o.LJ(key.LJI, Long.class)) {
            String str8 = key.LIZLLL;
            o.LJIIIIZZ(str8, "key.kevaName");
            Keva LIZIZ4 = LIZIZ(str8);
            String str9 = key.LIZJ;
            o.LJII(obj, "null cannot be cast to non-null type kotlin.Long");
            LIZIZ4.storeLong(str9, ((Long) obj).longValue());
            return;
        }
        if (o.LJ(key.LJI, Double.class)) {
            String str10 = key.LIZLLL;
            o.LJIIIIZZ(str10, "key.kevaName");
            Keva LIZIZ5 = LIZIZ(str10);
            String str11 = key.LIZJ;
            o.LJII(obj, "null cannot be cast to non-null type kotlin.Double");
            LIZIZ5.storeDouble(str11, ((Double) obj).doubleValue());
            return;
        }
        if (o.LJ(key.LJI, String.class)) {
            String str12 = key.LIZLLL;
            o.LJIIIIZZ(str12, "key.kevaName");
            Keva LIZIZ6 = LIZIZ(str12);
            String str13 = key.LIZJ;
            o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
            LIZIZ6.storeString(str13, (String) obj);
            return;
        }
        String str14 = key.LIZLLL;
        o.LJIIIIZZ(str14, "key.kevaName");
        LIZIZ(str14).storeString(key.LIZJ, GsonProtectorUtils.toJson((Gson) this.LIZ, obj));
    }
}

package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.model.MallV3Cache;
import kotlin.jvm.internal.o;

/* renamed from: X.KSt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51751KSt {
    public static final C51751KSt LIZ = new C51751KSt();
    public static final C5H3 LIZIZ = C221108m2.LIZ(EnumC221088m0.PUBLICATION, C51752KSu.LJLIL);

    public final synchronized boolean LIZJ() {
        boolean z;
        if (LIZ("ec_shop_main_cache_data_v3").length() <= 0) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    public static MallV3Cache LIZIZ() {
        Object value = LIZIZ.getValue();
        o.LJIIIIZZ(value, "<get-REPO>(...)");
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), C79057V0z.LJJIFFI((Keva) value, "ec_shop_main_cache_data_v3"), C65330PkU.LIZJ(C65352Pkq.LIZLLL(MallV3Cache.class)));
            if (!(fromJson instanceof MallV3Cache)) {
                fromJson = null;
            }
            return (MallV3Cache) fromJson;
        } catch (s unused) {
            return null;
        }
    }

    public final synchronized String LIZ(String key) {
        String string;
        o.LJIIIZ(key, "key");
        Object value = LIZIZ.getValue();
        o.LJIIIIZZ(value, "<get-REPO>(...)");
        string = ((Keva) value).getString(key, "");
        o.LJIIIIZZ(string, "REPO.getString(key, \"\")");
        return string;
    }

    public final synchronized boolean LIZLLL(String key, String str) {
        boolean z;
        o.LJIIIZ(key, "key");
        if (str != null) {
            Object value = LIZIZ.getValue();
            o.LJIIIIZZ(value, "<get-REPO>(...)");
            C79057V0z.LJJJJJ((Keva) value, key, str);
            if (C76800UCe.LIZ != null) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    public final void LJ(String str, java.util.Map map) {
        LIZLLL("ec_shop_main_cache_data_v3", C27739Aud.LJI(new MallV3Cache(map, str)));
    }
}

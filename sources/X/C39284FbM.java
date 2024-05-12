package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.FbM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39284FbM {
    public static final C39284FbM LIZ = new C39284FbM();
    public static final ArrayList<String> LIZIZ = C47261Igj.LJII("preinstall", "preload_conf", "preload_pai");
    public static final Keva LIZJ;
    public static final List<InterfaceC39285FbN> LIZLLL;

    static {
        Keva repo = Keva.getRepo("attribution_data_repo");
        o.LJIIIIZZ(repo, "getRepo(ATTRIBUTION_DATA_REPO)");
        LIZJ = repo;
        LIZLLL = new ArrayList();
    }

    public static final C39288FbQ LIZIZ() {
        Keva keva = LIZJ;
        String string = keva.getString("media_source", "");
        o.LJIIIIZZ(string, "keva.getString(MEDIA_SOURCE, \"\")");
        String string2 = keva.getString("campaign", "");
        o.LJIIIIZZ(string2, "keva.getString(CAMPAIGN, \"\")");
        String string3 = keva.getString("campaign_id", "");
        o.LJIIIIZZ(string3, "keva.getString(CAMPAIGN_ID, \"\")");
        String string4 = keva.getString("adset", "");
        o.LJIIIIZZ(string4, "keva.getString(ADSET, \"\")");
        String string5 = keva.getString("adset_id", "");
        o.LJIIIIZZ(string5, "keva.getString(ADSET_ID, \"\")");
        String gid = keva.getString("gid", "");
        String afDP = keva.getString("af_dp", "");
        o.LJIIIIZZ(gid, "gid");
        o.LJIIIIZZ(afDP, "afDP");
        return new C39288FbQ(string, string2, string3, string4, string5, gid, afDP);
    }

    public static final C61292ar LIZJ() {
        Keva keva = LIZJ;
        int i = keva.getInt("ec_mall_code", -100);
        boolean z = keva.getBoolean("is_ec_mall_ug_new_user", false);
        long j = keva.getLong("adgroup_id", -1L);
        String deeplink = keva.getString("deeplink", "");
        o.LJIIIIZZ(deeplink, "deeplink");
        return new C61292ar(i, j, deeplink, z);
    }

    public static final String LIZLLL() {
        Keva keva = LIZJ;
        String matchType = keva.getString("match_type", "");
        if (matchType == null || matchType.length() == 0) {
            return "";
        }
        ArrayList<String> arrayList = LIZIZ;
        o.LJIIIIZZ(matchType, "matchType");
        String lowerCase = matchType.toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (!arrayList.contains(lowerCase)) {
            return "";
        }
        StringBuilder LIZ2 = X1D.LIZ();
        String string = keva.getString("media_source", "");
        o.LJIIIIZZ(string, "keva.getString(MEDIA_SOURCE, \"\")");
        LIZ2.append(string);
        LIZ2.append('_');
        String string2 = keva.getString("campaign", "");
        o.LJIIIIZZ(string2, "keva.getString(CAMPAIGN, \"\")");
        LIZ2.append(string2);
        return X1D.LIZIZ(LIZ2);
    }

    public static final void LJ(java.util.Map<String, ? extends Object> map) {
        String obj;
        String obj2;
        if (map == null) {
            return;
        }
        Object obj3 = map.get("media_source");
        Object obj4 = "";
        if (obj3 == null) {
            obj3 = "";
        }
        String obj5 = obj3.toString();
        Object obj6 = map.get("campaign");
        if (obj6 == null) {
            obj6 = "";
        }
        String obj7 = obj6.toString();
        Object obj8 = map.get("campaign_id");
        if (obj8 == null) {
            obj8 = "";
        }
        String obj9 = obj8.toString();
        if (map.get("af_adset") != null) {
            obj = String.valueOf(map.get("af_adset"));
        } else {
            Object obj10 = map.get("adset");
            if (obj10 == null) {
                obj10 = "";
            }
            obj = obj10.toString();
        }
        if (map.get("af_adset_id") != null) {
            obj2 = String.valueOf(map.get("af_adset_id"));
        } else {
            Object obj11 = map.get("adset_id");
            if (obj11 == null) {
                obj11 = "";
            }
            obj2 = obj11.toString();
        }
        Object obj12 = map.get("af_sub2");
        if (obj12 == null) {
            obj12 = "";
        }
        String obj13 = obj12.toString();
        Object obj14 = map.get("af_dp");
        if (obj14 == null) {
            obj14 = "";
        }
        String obj15 = obj14.toString();
        Object obj16 = map.get("match_type");
        if (obj16 != null) {
            obj4 = obj16;
        }
        String obj17 = obj4.toString();
        C39288FbQ c39288FbQ = new C39288FbQ(obj5, obj7, obj9, obj, obj2, obj13, obj15);
        Iterator it = ((ArrayList) LIZLLL).iterator();
        while (it.hasNext()) {
            ((InterfaceC39285FbN) it.next()).LIZ(c39288FbQ);
        }
        Keva keva = LIZJ;
        keva.storeBoolean("is_ready", true);
        if (!TextUtils.isEmpty(obj5)) {
            keva.storeString("media_source", obj5);
        }
        if (!TextUtils.isEmpty(obj7)) {
            keva.storeString("campaign", obj7);
        }
        if (!TextUtils.isEmpty(obj9)) {
            keva.storeString("campaign_id", obj9);
        }
        if (!TextUtils.isEmpty(obj)) {
            keva.storeString("adset", obj);
        }
        if (!TextUtils.isEmpty(obj2)) {
            keva.storeString("adset_id", obj2);
        }
        if (!TextUtils.isEmpty(obj13)) {
            keva.storeString("gid", obj13);
        }
        if (!TextUtils.isEmpty(obj17)) {
            keva.storeString("match_type", obj17);
        }
        if (!TextUtils.isEmpty(obj15)) {
            keva.storeString("af_dp", obj15);
        }
    }

    public final void LIZ(C39287FbP c39287FbP) {
        List<InterfaceC39285FbN> list = LIZLLL;
        synchronized (list) {
            ((ArrayList) list).add(c39287FbP);
        }
    }

    public final void LJFF(int i, long j, String str, boolean z) {
        Keva keva = LIZJ;
        keva.storeInt("ec_mall_code", i);
        keva.storeBoolean("is_ec_mall_ug_new_user", z);
        keva.storeLong("adgroup_id", j);
        keva.storeString("deeplink", str);
    }
}

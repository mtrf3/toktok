package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ORu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61918ORu {
    public final Bundle LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public String LJI;
    public final String LJII;
    public final List<String> LJIIIIZZ;
    public final List<String> LJIIIZ;
    public final List<String> LJIIJ;
    public final List<String> LJIIJJI;
    public final String LJIIL;
    public final List<String> LJIILIIL;
    public final List<String> LJIILJJIL;
    public final String LJIILL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C61918ORu) && o.LJ(this.LIZ, ((C61918ORu) obj).LIZ);
    }

    public final int hashCode() {
        Bundle bundle = this.LIZ;
        if (bundle == null) {
            return 0;
        }
        return bundle.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StorePageParamData(arguments=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C61918ORu(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        this.LIZ = bundle;
        String str7 = "";
        this.LIZIZ = "";
        this.LIZJ = "";
        this.LIZLLL = OS5.PRODUCT.getValue();
        this.LJ = "";
        this.LJFF = "";
        this.LJI = "";
        this.LJII = "";
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        this.LJIIIIZZ = c61878OQg;
        this.LJIIIZ = c61878OQg;
        this.LJIIJ = c61878OQg;
        this.LJIIJJI = c61878OQg;
        this.LJIIL = "";
        this.LJIILIIL = c61878OQg;
        this.LJIILJJIL = c61878OQg;
        this.LJIILL = "";
        if (bundle != null) {
            String string = bundle.getString("shop_active_tab_type");
            this.LIZLLL = string == null ? OS5.UNDEFINED.getValue() : string;
            String string2 = bundle.getString("ka_top_product_id");
            this.LJIILL = string2 == null ? "" : string2;
            String string3 = bundle.getString("ka_identifier");
            string3 = string3 == null ? "unknown" : string3;
            String string4 = bundle.getString("ka_scene");
            String str8 = string4 != null ? string4 : "unknown";
            HashMap<String, Object> LIZLLL = C27739Aud.LIZLLL(bundle, "trackParams");
            if (LIZLLL != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("store page, trackParams: ");
                LIZ.append(LIZLLL);
                C36746EbW.LIZ(3, X1D.LIZIZ(LIZ));
                Object obj = LIZLLL.get("product_id");
                if (obj == null || !(obj instanceof String)) {
                    str = "";
                } else {
                    str = (String) obj;
                }
                this.LJ = str;
                Object obj2 = LIZLLL.get("source_previous_page");
                if (obj2 == null || !(obj2 instanceof String)) {
                    str2 = "";
                } else {
                    str2 = (String) obj2;
                }
                this.LJFF = str2;
                this.LJIIIIZZ = LIZ("expo_product_id_list", LIZLLL);
                this.LJIIIZ = LIZ("click_product_id_list", LIZLLL);
                this.LJIIJ = LIZ("related_product_id_list", LIZLLL);
                this.LJIILIIL = LIZ("search_card_live_product_id_list", LIZLLL);
                this.LJIILJJIL = LIZ("search_card_no_live_product_id_list", LIZLLL);
                this.LJIIJJI = LIZ("search_query", LIZLLL);
                Object obj3 = LIZLLL.get("enter_from");
                if (obj3 == null || !(obj3 instanceof String)) {
                    str3 = "";
                } else {
                    str3 = (String) obj3;
                }
                this.LIZJ = str3;
                Object obj4 = LIZLLL.get("author_id");
                if (obj4 == null || !(obj4 instanceof String)) {
                    str4 = "";
                } else {
                    str4 = (String) obj4;
                }
                this.LIZIZ = str4;
                Object obj5 = LIZLLL.get("first_source_page");
                if (obj5 != null) {
                    if (obj5 instanceof String) {
                        str5 = (String) obj5;
                    }
                    str5 = "";
                } else {
                    Object obj6 = LIZLLL.get("source_page_type");
                    if (obj6 != null && (obj6 instanceof String)) {
                        str5 = (String) obj6;
                    }
                    str5 = "";
                }
                this.LJIIL = str5;
                Object obj7 = LIZLLL.get("coupon_type_id");
                if (obj7 == null || !(obj7 instanceof String)) {
                    str6 = "";
                } else {
                    str6 = (String) obj7;
                }
                this.LJII = str6;
                Object obj8 = LIZLLL.get("enter_method");
                if (obj8 != null && (obj8 instanceof String)) {
                    str7 = (String) obj8;
                }
                if (o.LJ(str7, "ka")) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(str7);
                    LIZ2.append('_');
                    LIZ2.append(string3);
                    LIZ2.append('_');
                    LIZ2.append(str8);
                    str7 = X1D.LIZIZ(LIZ2);
                    LIZLLL.put("enter_method", str7);
                }
                this.LJI = str7;
            }
        }
    }

    public static List LIZ(String str, java.util.Map map) {
        Iterable iterable;
        Object obj = map.get(str);
        if ((obj instanceof Iterable) && (iterable = (Iterable) obj) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : iterable) {
                if (obj2 instanceof String) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }
        return C61878OQg.INSTANCE;
    }
}

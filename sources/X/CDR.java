package X;

import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public final class CDR {
    public static final java.util.Map<Integer, CDQ> LIZ;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(1, new CDQ(1, "#33FFD459", "#FEE075", "emotes"));
        linkedHashMap.put(2, new CDQ(2, "#33FFA98E", "#FD9A85", "badge"));
        linkedHashMap.put(5, new CDQ(5, "#0DBA1BE8", "#D2A5F5", "perks"));
        linkedHashMap.put(6, new CDQ(6, "#33FFD459", "#FABD76", "limited_content"));
        linkedHashMap.put(7, new CDQ(7, "#1F6068F1", "#9B8DF3", "discord"));
        linkedHashMap.put(4, new CDQ(4, "#0DFF4293", "#F789E7", "sub_gift"));
        linkedHashMap.put(8, new CDQ(8, "#33FFB1EE", "#FF8EA3", "sub_only_video"));
        linkedHashMap.put(-4, new CDQ(-4, "", "", "about_me"));
        linkedHashMap.put(-2, new CDQ(-2, "", "", "main_page"));
        linkedHashMap.put(-5, new CDQ(-5, "", "", "spotlight"));
        linkedHashMap.put(-6, new CDQ(-6, "", "", "subfest"));
        LIZ = linkedHashMap;
    }

    public static CDQ LIZ(int i) {
        CDQ cdq = (CDQ) ((LinkedHashMap) LIZ).get(Integer.valueOf(i));
        if (cdq == null) {
            return new CDQ(0, "#33FFD459", "#FEE075", "unknown");
        }
        return cdq;
    }
}

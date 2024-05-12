package X;

import java.util.HashMap;

/* loaded from: classes12.dex */
public final class PRZ {
    public static final HashMap<String, PRV> LIZ = new HashMap<>();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static PRV LIZ(String str) {
        PRV pry;
        HashMap<String, PRV> hashMap = LIZ;
        PRV prv = hashMap.get(str);
        if (prv != null) {
            return prv;
        }
        str.getClass();
        switch (str.hashCode()) {
            case -1668121984:
                if (str.equals("boot_finish")) {
                    if (C56672Kh.LIZ().LJIIL()) {
                        pry = new PRX();
                        break;
                    } else {
                        pry = new C64447PRb();
                        break;
                    }
                }
                pry = new C64447PRb();
                break;
            case 1066479505:
                if (str.equals("app_launch")) {
                    if (C56672Kh.LIZ().LJIIL()) {
                        pry = new PRW();
                        break;
                    } else {
                        pry = new C64447PRb();
                        break;
                    }
                }
                pry = new C64447PRb();
                break;
            case 1691937916:
                if (str.equals("homepage_hot")) {
                    pry = new PRY();
                    break;
                }
                pry = new C64447PRb();
                break;
            default:
                pry = new C64447PRb();
                break;
        }
        hashMap.put(str, pry);
        return pry;
    }
}

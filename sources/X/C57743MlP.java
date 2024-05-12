package X;

import kotlin.jvm.internal.o;

/* renamed from: X.MlP, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57743MlP {
    public static final /* synthetic */ C57743MlP LIZ = new C57743MlP();

    public static String LIZ(String str, EnumC57383Mfb type) {
        o.LJIIIZ(type, "type");
        StringBuilder sb = new StringBuilder("Relation_");
        if (str != null) {
            sb.append(str);
            sb.append("_");
        }
        sb.append(type.getTypeName());
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "traceId.toString()");
        return sb2;
    }

    public static /* synthetic */ void LIZJ(C57743MlP c57743MlP, W5F w5f, String str, EnumC57383Mfb enumC57383Mfb) {
        c57743MlP.getClass();
        LIZIZ(w5f, str, enumC57383Mfb, "big_card", -1);
    }

    public static void LIZIZ(W5F w5f, String enterFrom, EnumC57383Mfb imgType, String str, int i) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(imgType, "imgType");
        w5f.LIZIZ(LIZ(str, imgType));
        C78657Utx kK = C57738MlK.LIZIZ.LJ().kK(enterFrom, str, i, imgType);
        if (kK == null) {
            if (o.LJ(enterFrom, "notification_page")) {
                L9F.LIZ(w5f, null, "RelationImgDisplayMonImpl");
                return;
            } else {
                C16880lQ.LLJJJ(w5f);
                return;
            }
        }
        kK.LIZIZ(w5f);
    }
}

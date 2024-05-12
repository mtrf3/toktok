package X;

import defpackage.e1;

/* loaded from: classes9.dex */
public final class IJM {
    public static final boolean LIZ() {
        if (!((Boolean) IJT.LIZ.getValue()).booleanValue()) {
            return e1.LIZ(31744, "enable_edit_page_pre_publish", true, false);
        }
        float LIZ = IJO.LIZ();
        float LIZLLL = IJN.LIZ().LIZLLL("publish_intention_score");
        float LIZLLL2 = IJN.LIZ().LIZLLL("publish_edit_rate");
        if ((LIZ > IJ5.LIZ && LIZLLL < IJ5.LIZIZ) || LIZLLL2 > IJ5.LIZJ) {
            return false;
        }
        return e1.LIZ(31744, "enable_edit_page_pre_publish", true, false);
    }
}

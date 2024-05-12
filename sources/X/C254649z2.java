package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.9z2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C254649z2 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C254659z3.LJLIL);

    public static boolean LIZ(String campaignId) {
        o.LJIIIZ(campaignId, "campaignId");
        Object value = LIZ.getValue();
        o.LJIIIIZZ(value, "<get-repo>(...)");
        String string = ((Keva) value).getString("paid_content_banner_showed_campaigns", "");
        o.LJIIIIZZ(string, "repo.getString(PAID_CONT…NER_SHOWED_CAMPAIGNS, \"\")");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(((RBX) HG3.LJIILL()).getCurUserId());
        LIZ2.append('_');
        LIZ2.append(campaignId);
        return s.LJJJLZIJ(string, X1D.LIZIZ(LIZ2), false);
    }
}

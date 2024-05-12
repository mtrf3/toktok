package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem;
import kotlin.jvm.internal.o;

/* renamed from: X.S7v, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71591S7v {
    public static boolean LIZ(TemplateItem templateItem, InterfaceC57784Mm4 other) {
        o.LJIIIZ(other, "other");
        if (other instanceof TemplateItem) {
            TemplateItem templateItem2 = (TemplateItem) other;
            if (templateItem.getType() == templateItem2.getType() && templateItem.LLJLLIL() == templateItem2.LLJLLIL() && o.LJ(templateItem.LJLL(), templateItem2.LJLL()) && o.LJ(templateItem.LJJLIIIJLJLI(), templateItem2.LJJLIIIJLJLI()) && o.LJ(templateItem.LJJJZ(), templateItem2.LJJJZ()) && o.LJ(templateItem.LLILL(), templateItem2.LLILL()) && o.LJ(templateItem.LJJLJLI(), templateItem2.LJJLJLI()) && o.LJ(templateItem.LLILIL(), templateItem2.LLILIL())) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZIZ(TemplateItem templateItem, InterfaceC57784Mm4 interfaceC57784Mm4) {
        if ((interfaceC57784Mm4 instanceof TemplateItem) && o.LJ(templateItem.getTemplateId(), ((TemplateItem) interfaceC57784Mm4).getTemplateId())) {
            return true;
        }
        return false;
    }
}

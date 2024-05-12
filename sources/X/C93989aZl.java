package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.aZl, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93989aZl {
    public static final int LIZ(AbstractC94370afu validActionCount) {
        o.LJIIIZ(validActionCount, "$this$validActionCount");
        if (!validActionCount.LJII().LJIIJ()) {
            return 0;
        }
        List<AbstractC94372afw> LJI = validActionCount.LJI();
        ArrayList arrayList = new ArrayList();
        for (AbstractC94372afw abstractC94372afw : LJI) {
            AbstractC94372afw abstractC94372afw2 = abstractC94372afw;
            if ((!abstractC94372afw2.LJ().isEmpty()) && !abstractC94372afw2.LIZLLL().LJII()) {
                arrayList.add(abstractC94372afw);
            }
        }
        return arrayList.size();
    }

    public static final boolean LIZIZ(AbstractC94370afu isValid) {
        o.LJIIIZ(isValid, "$this$isValid");
        if (!isValid.LJII().LJIIJ()) {
            return false;
        }
        List<AbstractC94372afw> LJI = isValid.LJI();
        if ((LJI instanceof Collection) && LJI.isEmpty()) {
            return false;
        }
        for (AbstractC94372afw abstractC94372afw : LJI) {
            if ((!abstractC94372afw.LJ().isEmpty()) && !abstractC94372afw.LIZLLL().LJII()) {
                return true;
            }
        }
        return false;
    }
}

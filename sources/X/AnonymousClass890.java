package X;

import Y.IDComparatorS31S0000000_3;
import android.content.Context;
import android.text.style.ClickableSpan;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* renamed from: X.890, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass890 {
    public static final ClickableSpan LIZ(ClickableSpan[] clickableSpanArr, Context context) {
        if (clickableSpanArr.length > 1) {
            C61898ORa.LJJIIJZLJL(new IDComparatorS31S0000000_3(11), clickableSpanArr);
        }
        if (context == null) {
            return clickableSpanArr[0];
        }
        ArrayList arrayList = new ArrayList();
        for (ClickableSpan clickableSpan : clickableSpanArr) {
            if (clickableSpan instanceof AbstractC187797Yp) {
                clickableSpan.getClass();
            }
            arrayList.add(clickableSpan);
        }
        if (arrayList.isEmpty()) {
            return clickableSpanArr[0];
        }
        return (ClickableSpan) ListProtector.get(arrayList, 0);
    }
}

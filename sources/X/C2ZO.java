package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.feed.platform.popupclean.PopupRuleData$PopupGroup;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.2ZO, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2ZO {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C2ZP.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C2ZN.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C2ZQ.LJLIL);

    public static PopupRuleData$PopupGroup LIZ(String str) {
        int i;
        Integer num;
        HashMap hashMap = (HashMap) LIZIZ.getValue();
        if (hashMap == null || (num = (Integer) hashMap.get(str)) == null) {
            i = -1;
        } else {
            i = num.intValue();
        }
        List list = (List) LIZ.getValue();
        if (list == null || i >= list.size() || i < 0) {
            return null;
        }
        return (PopupRuleData$PopupGroup) ListProtector.get(list, i);
    }
}

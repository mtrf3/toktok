package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.feed.platform.popupclean.PopupRuleData$PopupGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2ZN, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2ZN extends AbstractC65781Prl implements InterfaceC65784Pro<HashMap<String, Integer>> {
    public static final C2ZN LJLIL = new C2ZN();

    public C2ZN() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final HashMap<String, Integer> invoke() {
        List list = (List) C2ZO.LIZ.getValue();
        HashMap<String, Integer> hashMap = new HashMap<>();
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                List<String> popups = ((PopupRuleData$PopupGroup) ListProtector.get(list, i)).getPopups();
                if (popups == null) {
                    popups = new ArrayList<>();
                }
                Iterator<String> it = popups.iterator();
                while (it.hasNext()) {
                    hashMap.put(it.next(), Integer.valueOf(i));
                }
            }
        }
        return hashMap;
    }
}

package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.feed.platform.popupclean.v2.nuj.dialogclean.NewUserPopupCleanRule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2ZU, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2ZU extends AbstractC65781Prl implements InterfaceC65784Pro<HashMap<String, Integer>> {
    public static final C2ZU LJLIL = new C2ZU();

    public C2ZU() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final HashMap<String, Integer> invoke() {
        List list = (List) NewUserPopupCleanRule.LIZJ.getValue();
        HashMap<String, Integer> hashMap = new HashMap<>();
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                List<String> popupIds = ((NewUserPopupCleanRule.RuleGroup) ListProtector.get(list, i)).getPopupIds();
                if (popupIds == null) {
                    popupIds = new ArrayList<>();
                }
                Iterator<String> it = popupIds.iterator();
                while (it.hasNext()) {
                    hashMap.put(it.next(), Integer.valueOf(i));
                }
            }
        }
        return hashMap;
    }
}

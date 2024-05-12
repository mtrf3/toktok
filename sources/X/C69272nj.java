package X;

import com.ss.android.ugc.aweme.notification.frequency.AbsNoticeFrequencyActionManager;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.2nj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69272nj extends AbstractC65781Prl implements InterfaceC65784Pro<C69262ni> {
    public static final C69272nj LJLIL = new C69272nj();

    public C69272nj() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2ni] */
    @Override // X.InterfaceC65784Pro
    public final C69262ni invoke() {
        return new InterfaceC60472Yx() { // from class: X.2ni
            @Override // X.InterfaceC60472Yx
            public final void LIZ(java.util.Map<Integer, ? extends List<String>> map) {
                for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                    AbsNoticeFrequencyActionManager absNoticeFrequencyActionManager = (AbsNoticeFrequencyActionManager) ((java.util.Map) C68925R3h.LIZLLL.getValue()).get(entry.getKey());
                    if (absNoticeFrequencyActionManager != null) {
                        List nidList = (List) entry.getValue();
                        o.LJIIIZ(nidList, "nidList");
                        Iterator it = nidList.iterator();
                        while (it.hasNext()) {
                            absNoticeFrequencyActionManager.LIZJ.remove(it.next());
                        }
                    }
                }
            }
        };
    }
}

package X;

import com.ss.android.ugc.aweme.inbox.monitor.InboxSampleRate;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.DzR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35681DzR extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, Float>> {
    public static final C35681DzR LJLIL = new C35681DzR();

    public C35681DzR() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, Float> invoke() {
        Float f;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<InboxSampleRate.RateEntry> list = ((InboxSampleRate.Config) InboxSampleRate.LIZIZ.getValue()).rateMap;
        if (list != null) {
            for (InboxSampleRate.RateEntry rateEntry : list) {
                String str = rateEntry.key;
                if (str != null && str.length() != 0 && (f = rateEntry.value) != null) {
                    linkedHashMap.put(rateEntry.key, f);
                }
            }
        }
        return linkedHashMap;
    }
}

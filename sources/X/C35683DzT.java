package X;

import com.ss.android.ugc.aweme.websocket.api.ab.EventSampleRateExp;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.DzT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35683DzT extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, Float>> {
    public static final C35683DzT LJLIL = new C35683DzT();

    public C35683DzT() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, Float> invoke() {
        Float f;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<EventSampleRateExp.RateEntry> list = ((EventSampleRateExp.Config) EventSampleRateExp.LIZIZ.getValue()).rateMap;
        if (list != null) {
            for (EventSampleRateExp.RateEntry rateEntry : list) {
                String str = rateEntry.key;
                if (str != null && str.length() != 0 && (f = rateEntry.value) != null) {
                    linkedHashMap.put(rateEntry.key, f);
                }
            }
        }
        return linkedHashMap;
    }
}

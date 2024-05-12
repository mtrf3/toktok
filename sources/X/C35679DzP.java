package X;

import com.ss.android.ugc.aweme.experiment.CommentSampleRateSetting;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.DzP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35679DzP extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, Float>> {
    public static final C35679DzP LJLIL = new C35679DzP();

    public C35679DzP() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, Float> invoke() {
        Float f;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<CommentSampleRateSetting.RateEntry> list = ((CommentSampleRateSetting.Config) CommentSampleRateSetting.LIZIZ.getValue()).rateMap;
        if (list != null) {
            for (CommentSampleRateSetting.RateEntry rateEntry : list) {
                String str = rateEntry.key;
                if (str != null && str.length() != 0 && (f = rateEntry.value) != null) {
                    linkedHashMap.put(rateEntry.key, f);
                }
            }
        }
        return linkedHashMap;
    }
}

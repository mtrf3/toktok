package X;

import com.ss.videoarch.strategy.strategy.smartStrategy.TopNHostStrategy;
import java.util.Comparator;
import java.util.Map;

/* renamed from: X.Ix1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48271Ix1 implements Comparator<Map.Entry<String, Integer>> {
    public final /* synthetic */ TopNHostStrategy LJLIL;

    public C48271Ix1(TopNHostStrategy topNHostStrategy) {
        this.LJLIL = topNHostStrategy;
    }

    @Override // java.util.Comparator
    public final int compare(Map.Entry<String, Integer> entry, Map.Entry<String, Integer> entry2) {
        return -entry.getValue().compareTo(entry2.getValue());
    }
}

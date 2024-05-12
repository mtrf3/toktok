package X;

import java.util.Comparator;
import java.util.Map;

/* loaded from: classes7.dex */
public final /* synthetic */ class F2D implements Comparator {
    public final /* synthetic */ int LJLIL;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long longValue;
        long longValue2;
        switch (this.LJLIL) {
            case 0:
                longValue = ((Long) ((Map.Entry) obj2).getValue()).longValue();
                longValue2 = ((Long) ((Map.Entry) obj).getValue()).longValue();
                break;
            default:
                longValue = ((C65193PiH) obj).LIZIZ;
                longValue2 = ((C65193PiH) obj2).LIZIZ;
                break;
        }
        return (int) (longValue - longValue2);
    }
}

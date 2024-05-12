package X;

import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import java.util.Comparator;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GQN implements Comparator<AVTextExtraStruct> {
    @Override // java.util.Comparator
    public final int compare(AVTextExtraStruct aVTextExtraStruct, AVTextExtraStruct aVTextExtraStruct2) {
        AVTextExtraStruct o1 = aVTextExtraStruct;
        AVTextExtraStruct o2 = aVTextExtraStruct2;
        o.LJIIIZ(o1, "o1");
        o.LJIIIZ(o2, "o2");
        int i = o1.start;
        int i2 = o2.start;
        if (i == i2) {
            return 0;
        }
        if (i < i2) {
            return -1;
        }
        return 1;
    }
}

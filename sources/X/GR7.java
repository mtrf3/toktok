package X;

import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GR7 implements GRF<AVTextExtraStruct> {
    public final /* synthetic */ GR1 LIZ;

    @Override // X.GRF
    public final List<AVTextExtraStruct> LIZ() {
        ArrayList arrayList = new ArrayList();
        GR1 gr1 = this.LIZ;
        GR9 gr9 = gr1.LJIIIZ;
        if (gr9 != null) {
            arrayList.addAll(gr9.LJI());
            C41512GQy c41512GQy = gr1.LJIIJ;
            if (c41512GQy != null) {
                arrayList.addAll(c41512GQy.LJI());
                AVTextExtraStruct aVTextExtraStruct = (AVTextExtraStruct) ORZ.LLFII(arrayList);
                if (aVTextExtraStruct != null) {
                    aVTextExtraStruct.subType = 5;
                }
                return arrayList;
            }
            o.LJIJI("mentionUserBlock");
            throw null;
        }
        o.LJIJI("hashtagBlock");
        throw null;
    }

    public GR7(GR1 gr1) {
        this.LIZ = gr1;
    }
}

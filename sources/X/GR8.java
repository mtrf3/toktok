package X;

import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GR8 implements GRF<AVTextExtraStruct> {
    public final /* synthetic */ C41513GQz LIZ;

    @Override // X.GRF
    public final List<AVTextExtraStruct> LIZ() {
        ArrayList arrayList = new ArrayList();
        C41512GQy c41512GQy = this.LIZ.LJIIIZ;
        if (c41512GQy != null) {
            arrayList.addAll(c41512GQy.LJI());
            AVTextExtraStruct aVTextExtraStruct = (AVTextExtraStruct) ORZ.LLFII(arrayList);
            if (aVTextExtraStruct != null) {
                aVTextExtraStruct.subType = 2;
            }
            return arrayList;
        }
        o.LJIJI("mentionUserTextBlock");
        throw null;
    }

    public GR8(C41513GQz c41513GQz) {
        this.LIZ = c41513GQz;
    }
}

package X;

import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GR5 implements GRF<AVTextExtraStruct> {
    public final /* synthetic */ GR3 LIZ;

    @Override // X.GRF
    public final List<AVTextExtraStruct> LIZ() {
        ArrayList arrayList = new ArrayList();
        GR3 gr3 = this.LIZ;
        GR9 gr9 = gr3.LJIIIZ;
        if (gr9 != null) {
            arrayList.addAll(gr9.LJI());
            C41509GQv c41509GQv = gr3.LJIIJ;
            if (c41509GQv != null) {
                arrayList.addAll(c41509GQv.LJI());
                AVTextExtraStruct aVTextExtraStruct = (AVTextExtraStruct) ORZ.LLFII(arrayList);
                if (aVTextExtraStruct != null) {
                    aVTextExtraStruct.type = 0;
                    aVTextExtraStruct.subType = 1;
                }
                return arrayList;
            }
            o.LJIJI("mentionVideoBlock");
            throw null;
        }
        o.LJIJI("hashtagBlock");
        throw null;
    }

    public GR5(GR3 gr3) {
        this.LIZ = gr3;
    }
}

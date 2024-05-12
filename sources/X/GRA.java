package X;

import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GRA implements GRF<AVTextExtraStruct> {
    public final /* synthetic */ GR9 LIZ;

    @Override // X.GRF
    public final List<AVTextExtraStruct> LIZ() {
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        GR9 gr9 = this.LIZ;
        String str = gr9.LJIIIZ;
        if (str != null) {
            aVTextExtraStruct.hashTagName = str;
            aVTextExtraStruct.setTagId(gr9.LJIIIIZZ());
            aVTextExtraStruct.subType = 0;
            aVTextExtraStruct.type = 1;
            return C47261Igj.LJJIJ(aVTextExtraStruct);
        }
        o.LJIJI("hashtagName");
        throw null;
    }

    public GRA(GR9 gr9) {
        this.LIZ = gr9;
    }
}

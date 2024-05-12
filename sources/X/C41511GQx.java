package X;

import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import java.util.List;

/* renamed from: X.GQx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41511GQx implements GRF<AVTextExtraStruct> {
    public final /* synthetic */ C41512GQy LIZ;

    @Override // X.GRF
    public final List<AVTextExtraStruct> LIZ() {
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        C41512GQy c41512GQy = this.LIZ;
        aVTextExtraStruct.setTagId(c41512GQy.LJIIIIZZ());
        aVTextExtraStruct.setSecUid(c41512GQy.LJIIIZ.LIZIZ);
        aVTextExtraStruct.userId = c41512GQy.LJIIIZ.LIZ;
        aVTextExtraStruct.type = 0;
        aVTextExtraStruct.subType = 0;
        aVTextExtraStruct.atUserType = "";
        Object obj = c41512GQy.LIZJ;
        if (obj instanceof GR0) {
            aVTextExtraStruct.subType = 7;
        } else if (obj instanceof GR1) {
            aVTextExtraStruct.subType = 5;
        } else if (obj instanceof C41513GQz) {
            aVTextExtraStruct.subType = 2;
        }
        return C47261Igj.LJJIJ(aVTextExtraStruct);
    }

    public C41511GQx(C41512GQy c41512GQy) {
        this.LIZ = c41512GQy;
    }
}

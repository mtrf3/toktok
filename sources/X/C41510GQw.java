package X;

import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import java.util.List;

/* renamed from: X.GQw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41510GQw implements GRF<AVTextExtraStruct> {
    public final /* synthetic */ C41509GQv LIZ;

    @Override // X.GRF
    public final List<AVTextExtraStruct> LIZ() {
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        C41509GQv c41509GQv = this.LIZ;
        aVTextExtraStruct.awemeId = c41509GQv.LJIIIZ;
        aVTextExtraStruct.setTagId(c41509GQv.LJIIIIZZ());
        aVTextExtraStruct.setSecUid(c41509GQv.LJIIJ.LIZIZ);
        aVTextExtraStruct.userId = c41509GQv.LJIIJ.LIZ;
        aVTextExtraStruct.type = 5;
        aVTextExtraStruct.subType = 6;
        Object obj = c41509GQv.LIZJ;
        if (obj instanceof GR2) {
            aVTextExtraStruct.type = 0;
            aVTextExtraStruct.subType = 1;
        } else if (obj instanceof GR3) {
            aVTextExtraStruct.type = 0;
            aVTextExtraStruct.subType = 1;
        }
        return C47261Igj.LJJIJ(aVTextExtraStruct);
    }

    public C41510GQw(C41509GQv c41509GQv) {
        this.LIZ = c41509GQv;
    }
}

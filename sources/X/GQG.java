package X;

import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GQG implements InterfaceC41524GRk {
    public final /* synthetic */ GB1<AVTextExtraStruct> LIZ;

    public GQG(GB1<AVTextExtraStruct> gb1) {
        this.LIZ = gb1;
    }

    @Override // X.InterfaceC41524GRk
    public final void LIZ(GRD maskType) {
        o.LJIIIZ(maskType, "maskType");
        C41486GPy LIZ = this.LIZ.LIZ.LIZ();
        LIZ.getClass();
        int i = GRB.LIZ[maskType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    LIZ.LIZ.LLIIIZ++;
                    return;
                }
                throw new UnsupportedOperationException("Unknown mask type, not supported yet");
            }
            LIZ.LIZ.LLII++;
        }
    }
}

package X;

import com.bytedance.ies.ugc.aweme.commercialize.compliance.ata.StaticAdExplainDialog;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AAU implements InterfaceC59622Vq {
    @Override // X.InterfaceC59622Vq
    public final void LIZ() {
        TuxSheet tuxSheet = StaticAdExplainDialog.LJLJJL;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
        } else {
            o.LJIJI("tuxSheet");
            throw null;
        }
    }
}

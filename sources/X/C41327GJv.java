package X;

import com.bytedance.ies.ugc.aweme.commercialize.compliance.ata.DynamicAdExplainDialog;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import kotlin.jvm.internal.o;

/* renamed from: X.GJv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41327GJv implements InterfaceC59622Vq {
    public final /* synthetic */ DynamicAdExplainDialog LIZ;

    @Override // X.InterfaceC59622Vq
    public final void LIZ() {
        TuxSheet tuxSheet = this.LIZ.LJLLILLLL;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
        } else {
            o.LJIJI("sheet");
            throw null;
        }
    }

    public C41327GJv(DynamicAdExplainDialog dynamicAdExplainDialog) {
        this.LIZ = dynamicAdExplainDialog;
    }
}

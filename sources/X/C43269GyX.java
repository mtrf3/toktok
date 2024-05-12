package X;

import android.os.Bundle;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.ata.DynamicAdExplainDialog;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import kotlin.jvm.internal.o;

/* renamed from: X.GyX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43269GyX extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ DynamicAdExplainDialog LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43269GyX(DynamicAdExplainDialog dynamicAdExplainDialog) {
        super(0);
        this.LJLIL = dynamicAdExplainDialog;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        TuxSheet tuxSheet = this.LJLIL.LJLLILLLL;
        if (tuxSheet != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_not_other_exit", true);
            tuxSheet.setArguments(bundle);
            TuxSheet tuxSheet2 = this.LJLIL.LJLLILLLL;
            if (tuxSheet2 != null) {
                tuxSheet2.dismiss();
                C58655N0h LIZLLL = C58704N2e.LIZLLL("about_this_ad", "exit", this.LJLIL.LJLIL);
                LIZLLL.LIZIZ("close_button", "close_method");
                LIZLLL.LIZIZ(Long.valueOf(System.currentTimeMillis() - this.LJLIL.LLF), "page_stay_time");
                LIZLLL.LIZIZ(this.LJLIL.LJLJLJ, "toggle_final_status");
                LIZLLL.LJI();
                return C76800UCe.LIZ;
            }
            o.LJIJI("sheet");
            throw null;
        }
        o.LJIJI("sheet");
        throw null;
    }
}

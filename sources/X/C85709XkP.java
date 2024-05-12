package X;

import android.os.Bundle;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.account.login.email.EmailPopUpFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.XkP, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85709XkP extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ EmailPopUpFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85709XkP(EmailPopUpFragment emailPopUpFragment) {
        super(0);
        this.LJLIL = emailPopUpFragment;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        TuxSheet tuxSheet = this.LJLIL.LLIIIJ;
        if (tuxSheet != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(this.LJLIL.LLIIII, true);
            tuxSheet.setArguments(bundle);
            TuxSheet tuxSheet2 = this.LJLIL.LLIIIJ;
            if (tuxSheet2 != null) {
                tuxSheet2.dismiss();
                C85707XkN.LIZJ(Boolean.valueOf(this.LJLIL.LLFZ), "close", Integer.valueOf(this.LJLIL.LLFFF));
                return C76800UCe.LIZ;
            }
            o.LJIJI("sheet");
            throw null;
        }
        o.LJIJI("sheet");
        throw null;
    }
}

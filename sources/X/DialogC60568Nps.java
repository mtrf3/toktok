package X;

import android.content.Context;
import com.bytedance.ies.bullet.service.popup.BulletPopUpFragment;
import kotlin.jvm.internal.AqS160S0100000_10;

/* renamed from: X.Nps */
/* loaded from: classes11.dex */
public final class DialogC60568Nps extends DialogC60913NvR {
    public final /* synthetic */ BulletPopUpFragment LJLJI;

    @Override // X.C18Z, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        this.LJLJI.xl(new AqS160S0100000_10(this, 37));
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        BulletPopUpFragment bulletPopUpFragment = this.LJLJI;
        if (bulletPopUpFragment.LJLJLLL) {
            if (!bulletPopUpFragment.Dl().LJLLLL) {
                this.LJLJI.LJLLJ = EnumC60567Npr.GESTURE;
                super.onBackPressed();
            } else {
                InterfaceC40516FvE interfaceC40516FvE = this.LJLJI.LJLJJI;
                if (interfaceC40516FvE == null) {
                    return;
                }
                interfaceC40516FvE.onEvent(new C60570Npu(this));
            }
        }
    }

    public static final /* synthetic */ void LJIJJLI(DialogC60568Nps dialogC60568Nps) {
        super.dismiss();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC60568Nps(BulletPopUpFragment bulletPopUpFragment, Context context) {
        super(context);
        this.LJLJI = bulletPopUpFragment;
    }
}

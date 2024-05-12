package X;

import android.content.Context;
import com.bytedance.ies.bullet.service.popup.BasePopUpFragment;
import kotlin.jvm.internal.AqS160S0100000_10;

/* renamed from: X.Npt */
/* loaded from: classes11.dex */
public final class DialogC60569Npt extends DialogC60913NvR {
    public final /* synthetic */ BasePopUpFragment LJLJI;

    @Override // X.C18Z, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        this.LJLJI.xl(new AqS160S0100000_10(this, 31));
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.LJLJI.getClass();
    }

    public static final /* synthetic */ void LJIJJLI(DialogC60569Npt dialogC60569Npt) {
        super.dismiss();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC60569Npt(BasePopUpFragment basePopUpFragment, Context context) {
        super(context);
        this.LJLJI = basePopUpFragment;
    }
}
